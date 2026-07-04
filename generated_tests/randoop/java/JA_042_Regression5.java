import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_042_Regression5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2501");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder6.build();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.Options options11 = null;
        java.util.Properties properties12 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction13 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser10.parse(options11, properties12, nonOptionAction13, strArray15);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction13 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction13.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2502");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder5.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder5.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2503");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setAllowPartialMatching(true);
        java.lang.Class<?> wildcardClass15 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2504");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder6.get();
        org.apache.commons.cli.Options options10 = null;
        java.util.Properties properties11 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction12 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser9.parse(options10, properties11, nonOptionAction12, strArray16);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction12 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction12.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2505");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser15 = builder6.build();
        org.apache.commons.cli.DefaultParser defaultParser16 = builder6.get();
        org.apache.commons.cli.DefaultParser defaultParser17 = builder6.build();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray19 = null;
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser17.parse(options18, strArray19, properties20);
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
        org.junit.Assert.assertNotNull(defaultParser16);
        org.junit.Assert.assertNotNull(defaultParser17);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2506");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder2.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setDeprecatedHandler(optionConsumer11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2507");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
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
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2508");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder9.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser14 = builder9.get();
        org.apache.commons.cli.DefaultParser defaultParser15 = builder9.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(defaultParser14);
        org.junit.Assert.assertNotNull(defaultParser15);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2509");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setDeprecatedHandler(optionConsumer4);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder5.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder7.get();
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder7.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder7.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(defaultParser8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2510");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser12 = builder11.get();
        org.apache.commons.cli.Options options13 = null;
        java.util.Properties properties14 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction15 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser12.parse(options13, properties14, nonOptionAction15, strArray18);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction15 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction15.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2511");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.build();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser13.parse(options14, strArray21, true);
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "", "", "", "" });
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2512");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder6.get();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser13.parse(options14, strArray15, properties16, false);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2513");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder18 = builder16.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser19 = builder18.build();
        java.lang.Class<?> wildcardClass20 = defaultParser19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2514");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser17 = builder6.build();
        java.lang.Class<?> wildcardClass18 = builder6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2515");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder9.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer15 = null;
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder12.setDeprecatedHandler(optionConsumer15);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer17 = null;
        org.apache.commons.cli.DefaultParser.Builder builder18 = builder12.setDeprecatedHandler(optionConsumer17);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2516");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser11.parse(options12, strArray19, properties20, false);
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2517");
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
        org.apache.commons.cli.DefaultParser.Builder builder20 = builder18.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser21 = builder18.build();
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
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2518");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder4.get();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser5.parse(options6, strArray9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2519");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder3.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder3.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder3.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2520");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.Options options11 = null;
        java.util.Properties properties12 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction13 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser10.parse(options11, properties12, nonOptionAction13, strArray15);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction13 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction13.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2521");
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
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder6.setAllowPartialMatching(false);
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
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2522");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser12 = builder11.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(defaultParser12);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2523");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2524");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setDeprecatedHandler(optionConsumer4);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder5.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder5.get();
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder5.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder10.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser15 = builder14.build();
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser15.parse(options16, strArray19, properties20);
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(defaultParser15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2525");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setDeprecatedHandler(optionConsumer7);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder10.build();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser13.parse(options14, strArray16, properties17);
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2526");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder7.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder7.setDeprecatedHandler(optionConsumer9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(defaultParser8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2527");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder0.get();
        org.apache.commons.cli.DefaultParser defaultParser7 = builder0.get();
        java.lang.Class<?> wildcardClass8 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2528");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder0.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser12 = builder11.build();
        org.apache.commons.cli.Options options13 = null;
        java.util.Properties properties14 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction15 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser12.parse(options13, properties14, nonOptionAction15, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(defaultParser12);
        org.junit.Assert.assertTrue("'" + nonOptionAction15 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction15.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", "hi!", "hi!" });
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2529");
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
        org.apache.commons.cli.DefaultParser defaultParser16 = builder12.build();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser16.parse(options17, strArray19, properties20, false);
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2530");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer15 = null;
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder12.setDeprecatedHandler(optionConsumer15);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2531");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer10 = null;
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder6.setDeprecatedHandler(optionConsumer10);
        org.apache.commons.cli.DefaultParser defaultParser12 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setAllowPartialMatching(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(defaultParser12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2532");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer15 = null;
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder6.setDeprecatedHandler(optionConsumer15);
        org.apache.commons.cli.DefaultParser.Builder builder18 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser19 = builder18.get();
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
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(defaultParser19);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2533");
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
        org.apache.commons.cli.DefaultParser defaultParser21 = builder19.get();
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine29 = defaultParser21.parse(options22, strArray27, true);
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
        org.junit.Assert.assertNotNull(defaultParser21);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "hi!", "", "hi!" });
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2534");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser10.parse(options11, strArray18, properties19);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "", "", "hi!", "hi!" });
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2535");
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
        org.apache.commons.cli.DefaultParser defaultParser18 = builder17.build();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser18.parse(options19, strArray25);
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
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(defaultParser18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "hi!", "", "", "hi!" });
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2536");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder7.build();
        org.apache.commons.cli.DefaultParser defaultParser9 = builder7.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser9.parse(options10, strArray12, properties13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(defaultParser8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2537");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setDeprecatedHandler(optionConsumer9);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder8.setDeprecatedHandler(optionConsumer11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2538");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
        org.apache.commons.cli.DefaultParser defaultParser12 = builder10.build();
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser12.parse(options13, strArray16, properties17, true);
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
        org.junit.Assert.assertNotNull(defaultParser12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2539");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder10.get();
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
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2540");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder0.get();
        org.apache.commons.cli.DefaultParser defaultParser7 = builder0.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser7.parse(options8, strArray12, true);
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
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2541");
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
        org.apache.commons.cli.DefaultParser defaultParser20 = builder15.get();
        java.lang.Class<?> wildcardClass21 = defaultParser20.getClass();
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
        org.junit.Assert.assertNotNull(defaultParser20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2542");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer5 = null;
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setDeprecatedHandler(optionConsumer5);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer15 = null;
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder14.setDeprecatedHandler(optionConsumer15);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2543");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder5.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder7.build();
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser8.parse(options9, strArray12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(defaultParser8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2544");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser15 = builder6.get();
        org.apache.commons.cli.DefaultParser defaultParser16 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder18 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser19 = builder6.get();
        org.apache.commons.cli.DefaultParser defaultParser20 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder22 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(defaultParser15);
        org.junit.Assert.assertNotNull(defaultParser16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(defaultParser19);
        org.junit.Assert.assertNotNull(defaultParser20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2545");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder11.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser14 = builder13.build();
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder13.setAllowPartialMatching(true);
        java.lang.Class<?> wildcardClass17 = builder13.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(defaultParser14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2546");
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
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2547");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder9.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder9.get();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray15 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser13.parse(options14, strArray15);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2548");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.get();
        org.apache.commons.cli.DefaultParser defaultParser11 = builder9.get();
        org.apache.commons.cli.DefaultParser defaultParser12 = builder9.build();
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder9.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(defaultParser12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2549");
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
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer14 = null;
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder6.setDeprecatedHandler(optionConsumer14);
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
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2550");
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
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder14.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser17 = builder14.build();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser17.parse(options18, strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(defaultParser17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2551");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setAllowPartialMatching(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2552");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setDeprecatedHandler(optionConsumer11);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer13 = null;
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setDeprecatedHandler(optionConsumer13);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer15 = null;
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder12.setDeprecatedHandler(optionConsumer15);
        org.apache.commons.cli.DefaultParser defaultParser17 = builder16.build();
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
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2553");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser16 = builder6.get();
        org.apache.commons.cli.Options options17 = null;
        java.util.Properties properties18 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction19 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser16.parse(options17, properties18, nonOptionAction19, strArray21);
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
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(defaultParser16);
        org.junit.Assert.assertTrue("'" + nonOptionAction19 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction19.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2554");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder9.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser14 = builder9.get();
        org.apache.commons.cli.Options options15 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser14.parse(options15, strArray17, properties18, true);
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
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2555");
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
        org.apache.commons.cli.Options options17 = null;
        java.util.Properties properties18 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction19 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser16.parse(options17, properties18, nonOptionAction19, strArray24);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction19 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction19.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "" });
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2556");
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
        org.apache.commons.cli.DefaultParser defaultParser13 = builder9.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer14 = null;
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder9.setDeprecatedHandler(optionConsumer14);
        org.apache.commons.cli.DefaultParser.Builder builder17 = builder15.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
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
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2557");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder14.setAllowPartialMatching(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2558");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.get();
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder12.setAllowPartialMatching(true);
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
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2559");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
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
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2560");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer14 = null;
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder12.setDeprecatedHandler(optionConsumer14);
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.build();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser16.parse(options17, strArray18, properties19);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2561");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.build();
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder5.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder8.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder8.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2562");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder5.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder7.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser12 = builder11.get();
        org.apache.commons.cli.Options options13 = null;
        java.util.Properties properties14 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction15 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser12.parse(options13, properties14, nonOptionAction15, strArray19);
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
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(defaultParser12);
        org.junit.Assert.assertTrue("'" + nonOptionAction15 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction15.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2563");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser7.parse(options8, strArray11, properties12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2564");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.get();
        org.apache.commons.cli.DefaultParser defaultParser11 = builder9.build();
        org.apache.commons.cli.DefaultParser defaultParser12 = builder9.get();
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser12.parse(options13, strArray16, true);
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
        org.junit.Assert.assertNotNull(defaultParser12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2565");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder8.get();
        org.apache.commons.cli.Options options11 = null;
        java.util.Properties properties12 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction13 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser10.parse(options11, properties12, nonOptionAction13, strArray20);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction13 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction13.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "", "hi!", "", "", "hi!" });
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2566");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder8.build();
        java.lang.Class<?> wildcardClass11 = defaultParser10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2567");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder10.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser14 = builder13.build();
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder13.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(defaultParser14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2568");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder10.setAllowPartialMatching(true);
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
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2569");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser defaultParser8 = builder6.get();
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser8.parse(options9, strArray11);
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
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2570");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer13 = null;
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setDeprecatedHandler(optionConsumer13);
        org.apache.commons.cli.DefaultParser defaultParser15 = builder14.get();
        java.lang.Class<?> wildcardClass16 = defaultParser15.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(defaultParser15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2571");
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
        org.apache.commons.cli.DefaultParser defaultParser13 = builder9.build();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser13.parse(options14, strArray16, properties17);
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2572");
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
        java.lang.Class<?> wildcardClass14 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2573");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser defaultParser8 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setAllowPartialMatching(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(defaultParser8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2574");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder8.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2575");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.build();
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder5.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder5.get();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder5.build();
        org.apache.commons.cli.DefaultParser defaultParser11 = builder5.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(defaultParser11);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2576");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setAllowPartialMatching(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2577");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser15 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder17 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser18 = builder6.build();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser18.parse(options19, strArray20, properties21, false);
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
        org.junit.Assert.assertNotNull(defaultParser15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(defaultParser18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2578");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder8.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer12 = null;
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder8.setDeprecatedHandler(optionConsumer12);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer14 = null;
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder13.setDeprecatedHandler(optionConsumer14);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer16 = null;
        org.apache.commons.cli.DefaultParser.Builder builder17 = builder13.setDeprecatedHandler(optionConsumer16);
        org.apache.commons.cli.DefaultParser defaultParser18 = builder17.build();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray20 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser18.parse(options19, strArray20, false);
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
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(defaultParser18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2579");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2580");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder5.setDeprecatedHandler(optionConsumer6);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder5.setDeprecatedHandler(optionConsumer8);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2581");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder3.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder3.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder3.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder3.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2582");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser5.parse(options6, strArray12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2583");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.DefaultParser defaultParser6 = builder2.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder2.setDeprecatedHandler(optionConsumer7);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder8.get();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser11.parse(options12, strArray19, properties20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!", "", "", "" });
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2584");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser15 = builder12.get();
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser15.parse(options16, strArray19, properties20);
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2585");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
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
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2586");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder9.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer14 = null;
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder13.setDeprecatedHandler(optionConsumer14);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer16 = null;
        org.apache.commons.cli.DefaultParser.Builder builder17 = builder13.setDeprecatedHandler(optionConsumer16);
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
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2587");
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
        org.apache.commons.cli.DefaultParser defaultParser22 = builder21.get();
        org.apache.commons.cli.Options options23 = null;
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.util.Properties properties29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine31 = defaultParser22.parse(options23, strArray28, properties29, false);
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
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(defaultParser22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2588");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder5.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder7.get();
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder7.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder7.build();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser11.parse(options12, strArray15, properties16, false);
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2589");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser15 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder17 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder19 = builder17.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser20 = builder17.build();
        java.lang.Class<?> wildcardClass21 = builder17.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(defaultParser15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(defaultParser20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2590");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2591");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder0.get();
        org.apache.commons.cli.DefaultParser defaultParser7 = builder0.build();
        org.apache.commons.cli.Options options8 = null;
        java.util.Properties properties9 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction10 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser7.parse(options8, properties9, nonOptionAction10, strArray13);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction10 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction10.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2592");
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
        org.apache.commons.cli.DefaultParser defaultParser15 = builder6.get();
        org.apache.commons.cli.DefaultParser defaultParser16 = builder6.build();
        org.apache.commons.cli.DefaultParser defaultParser17 = builder6.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer18 = null;
        org.apache.commons.cli.DefaultParser.Builder builder19 = builder6.setDeprecatedHandler(optionConsumer18);
        java.lang.Class<?> wildcardClass20 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(defaultParser15);
        org.junit.Assert.assertNotNull(defaultParser16);
        org.junit.Assert.assertNotNull(defaultParser17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2593");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser15 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder17 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder19 = builder17.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser20 = builder19.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(defaultParser15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(defaultParser20);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2594");
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
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder6.setDeprecatedHandler(optionConsumer13);
        org.apache.commons.cli.DefaultParser defaultParser15 = builder14.get();
        org.apache.commons.cli.DefaultParser defaultParser16 = builder14.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(defaultParser15);
        org.junit.Assert.assertNotNull(defaultParser16);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2595");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.DefaultParser defaultParser6 = builder2.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder2.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2596");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder4.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser9.parse(options10, strArray15);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "", "hi!" });
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2597");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser9.parse(options10, strArray11, properties12, false);
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
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2598");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer5 = null;
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setDeprecatedHandler(optionConsumer5);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2599");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder0.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser9.parse(options10, strArray15, properties16);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "hi!", "hi!" });
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2600");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.util.Properties properties11 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction12 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser9.parse(options10, properties11, nonOptionAction12, strArray16);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction12 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction12.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2601");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder6.get();
        org.apache.commons.cli.DefaultParser defaultParser12 = builder6.build();
        org.apache.commons.cli.DefaultParser defaultParser13 = builder6.build();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser13.parse(options14, strArray16, properties17);
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
        org.junit.Assert.assertNotNull(defaultParser12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2602");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder8.build();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder8.setAllowPartialMatching(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2603");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser15 = builder12.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(defaultParser15);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2604");
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
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder13.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder17 = builder15.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer18 = null;
        org.apache.commons.cli.DefaultParser.Builder builder19 = builder17.setDeprecatedHandler(optionConsumer18);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(defaultParser8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2605");
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
        org.apache.commons.cli.DefaultParser defaultParser17 = builder16.get();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser17.parse(options18, strArray23, properties24, false);
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
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2606");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.get();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser11.parse(options12, strArray17, properties18, true);
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
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "", "hi!" });
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_042_Regression5.test2607");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder2.get();
        org.apache.commons.cli.DefaultParser defaultParser11 = builder2.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(defaultParser11);
    }
}

