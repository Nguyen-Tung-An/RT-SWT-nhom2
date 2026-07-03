import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_012_Regression0 {

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
            System.out.format("%n%s%n", "JA_012_Regression0.test001");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser1.parse(options2, strArray7, properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test002");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!" };
        java.util.Properties properties7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser1.parse(options2, strArray6, properties7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test003");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Properties properties4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser1.parse(options2, strArray3, properties4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test004");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.Properties properties7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser1.parse(options2, strArray6, properties7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test005");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.util.Properties properties2 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction3 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser0.parse(options1, properties2, nonOptionAction3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + nonOptionAction3 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction3.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test006");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = null;
        java.util.Properties properties3 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction4 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser1.parse(options2, properties3, nonOptionAction4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + nonOptionAction4 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction4.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test007");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options1, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test008");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.util.Properties properties2 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction3 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.parse(options1, properties2, nonOptionAction3, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + nonOptionAction3 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction3.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test009");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = null;
        java.util.Properties properties3 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction4 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser1.parse(options2, properties3, nonOptionAction4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + nonOptionAction4 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction4.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!", "hi!", "" });
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test010");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "" };
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser3.parse(options4, strArray8, properties9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test011");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.Properties properties5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser1.parse(options2, strArray4, properties5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test012");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        java.lang.Class<?> wildcardClass4 = defaultParser3.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test013");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        java.lang.Class<?> wildcardClass4 = defaultParser3.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test014");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.Properties properties6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser3.parse(options4, strArray5, properties6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test015");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.apache.commons.cli.Options options4 = null;
        java.util.Properties properties5 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction6 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser3.parse(options4, properties5, nonOptionAction6, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertTrue("'" + nonOptionAction6 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction6.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test016");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        java.lang.Class<?> wildcardClass6 = defaultParser5.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test017");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser5.parse(options6, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test018");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser1.parse(options2, strArray5, properties6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test019");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "" };
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser3.parse(options4, strArray8, properties9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test020");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.Properties properties7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser3.parse(options4, strArray6, properties7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test021");
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction0 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.Class<?> wildcardClass1 = nonOptionAction0.getClass();
        org.junit.Assert.assertTrue("'" + nonOptionAction0 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction0.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test022");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.Properties properties4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options1, strArray3, properties4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test023");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser5.parse(options6, strArray12, properties13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test024");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser3.parse(options4, strArray11, properties12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test025");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray3 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine4 = defaultParser1.parse(options2, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test026");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.parse(options1, strArray5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test027");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(true);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser1.parse(options2, strArray7, properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test028");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser1.parse(options2, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test029");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray3 = null;
        java.util.Properties properties4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser1.parse(options2, strArray3, properties4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test030");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser1.parse(options2, strArray9, properties10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" });
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test031");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.lang.Class<?> wildcardClass3 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test032");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.Options options2 = null;
        java.util.Properties properties3 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction4 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser1.parse(options2, properties3, nonOptionAction4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertTrue("'" + nonOptionAction4 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction4.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test033");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "", "hi!", "" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser1.parse(options2, strArray9, properties10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test034");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.Properties properties5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser1.parse(options2, strArray4, properties5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test035");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser5.parse(options6, strArray11, properties12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test036");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser3.parse(options4, strArray5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test037");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(true);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser1.parse(options2, strArray9, properties10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test038");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray7 = null;
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser5.parse(options6, strArray7, properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test039");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.apache.commons.cli.Options options4 = null;
        java.util.Properties properties5 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction6 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser3.parse(options4, properties5, nonOptionAction6, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertTrue("'" + nonOptionAction6 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction6.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test040");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray3 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine4 = defaultParser1.parse(options2, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test041");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser7.parse(options8, strArray15, properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test042");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        java.lang.Class<?> wildcardClass4 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test043");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.apache.commons.cli.Options options4 = null;
        java.util.Properties properties5 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction6 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser3.parse(options4, properties5, nonOptionAction6, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertTrue("'" + nonOptionAction6 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction6.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test044");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = null;
        java.util.Properties properties3 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction4 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser1.parse(options2, properties3, nonOptionAction4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + nonOptionAction4 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction4.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test045");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser3.parse(options4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test046");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser5.parse(options6, strArray8, properties9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test047");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser5.parse(options6, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test048");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser3.parse(options4, strArray11, properties12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test049");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser9.parse(options10, strArray16, properties17);
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test050");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test051");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.Options options2 = null;
        java.util.Properties properties3 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction4 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser1.parse(options2, properties3, nonOptionAction4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertTrue("'" + nonOptionAction4 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction4.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test052");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
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
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test053");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.util.Properties properties2 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction3 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options1, properties2, nonOptionAction3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + nonOptionAction3 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction3.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test054");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser3.parse(options4, strArray5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test055");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.Options options2 = null;
        java.util.Properties properties3 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction4 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser1.parse(options2, properties3, nonOptionAction4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertTrue("'" + nonOptionAction4 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction4.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test056");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.util.Properties properties2 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction3 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.parse(options1, properties2, nonOptionAction3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + nonOptionAction3 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction3.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test057");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser1.parse(options2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test058");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder8.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser10.parse(options11, strArray15, properties16, false);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test059");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test060");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine4 = defaultParser1.parse(options2, strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test061");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser3.parse(options4, strArray9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "", "" });
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test062");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder8.setAllowPartialMatching(true);
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test063");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder8.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test064");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.parse(options1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test065");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.Options options2 = null;
        java.util.Properties properties3 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction4 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser1.parse(options2, properties3, nonOptionAction4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertTrue("'" + nonOptionAction4 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction4.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test066");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test067");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!", "" };
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
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test068");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser3.parse(options4, strArray11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" });
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test069");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test070");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Properties properties4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser1.parse(options2, strArray3, properties4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test071");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test072");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        java.lang.Class<?> wildcardClass10 = defaultParser9.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test073");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser3.parse(options4, strArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test074");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser1.parse(options2, strArray8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "", "", "" });
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test075");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "hi!" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser7.parse(options8, strArray12, properties13, true);
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
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test076");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser9.parse(options10, strArray17);
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
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "hi!", "", "", "hi!" });
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test077");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray9 = null;
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser7.parse(options8, strArray9, properties10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test078");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        java.lang.Class<?> wildcardClass10 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test079");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "" };
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser3.parse(options4, strArray8, properties9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test080");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder8.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser10.parse(options11, strArray16, properties17, false);
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test081");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser6.parse(options7, strArray11, properties12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test082");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser3.parse(options4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test083");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser3.parse(options4, strArray7, properties8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test084");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder8.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser10.parse(options11, strArray13, properties14, true);
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
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test085");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser3.parse(options4, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test086");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.util.Properties properties9 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser7.parse(options8, properties9, nonOptionAction10, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test087");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser1.parse(options2, strArray7, properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test088");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser3.parse(options4, strArray8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test089");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser7.parse(options8, strArray9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test090");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.util.Properties properties7 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser5.parse(options6, properties7, nonOptionAction8, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test091");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser9.parse(options10, strArray11, properties12, true);
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
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test092");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test093");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser6.parse(options7, strArray13, properties14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "hi!", "", "" });
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test094");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.util.Properties properties4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.parse(options1, strArray3, properties4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test095");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser9.parse(options10, strArray11, properties12);
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
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test096");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options1, strArray4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test097");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser7.parse(options8, strArray14, false);
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
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test098");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setAllowPartialMatching(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test099");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder2.get();
        org.apache.commons.cli.Options options9 = null;
        java.util.Properties properties10 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction11 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser8.parse(options9, properties10, nonOptionAction11, strArray18);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction11 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction11.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" });
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test100");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(true);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!" };
        java.util.Properties properties7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser1.parse(options2, strArray6, properties7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test101");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.util.Properties properties7 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction8 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser5.parse(options6, properties7, nonOptionAction8, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertTrue("'" + nonOptionAction8 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction8.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test102");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder8.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser10.parse(options11, strArray13, properties14);
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
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test103");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.util.Properties properties5 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction6 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser3.parse(options4, properties5, nonOptionAction6, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertTrue("'" + nonOptionAction6 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction6.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test104");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray3 = null;
        java.util.Properties properties4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser1.parse(options2, strArray3, properties4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test105");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser9.parse(options10, strArray16, properties17);
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "hi!", "", "" });
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test106");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test107");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test108");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.Options options11 = null;
        java.util.Properties properties12 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction13 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
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
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertTrue("'" + nonOptionAction13 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction13.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test109");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
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
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test110");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder3.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test111");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.util.Properties properties5 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction6 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser3.parse(options4, properties5, nonOptionAction6, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertTrue("'" + nonOptionAction6 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction6.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test112");
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
        org.apache.commons.cli.Options options14 = null;
        java.util.Properties properties15 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction16 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser13.parse(options14, properties15, nonOptionAction16, strArray19);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction16 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction16.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test113");
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
        org.apache.commons.cli.Options options14 = null;
        java.util.Properties properties15 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction16 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray17 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser13.parse(options14, properties15, nonOptionAction16, strArray17);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction16 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction16.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test114");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        java.lang.Class<?> wildcardClass10 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test115");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser7.parse(options8, strArray13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "", "hi!" });
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test116");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder8.build();
        org.apache.commons.cli.Options options11 = null;
        java.util.Properties properties12 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction13 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser10.parse(options11, properties12, nonOptionAction13, strArray17);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction13 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction13.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test117");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test118");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test119");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder8.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser10.parse(options11, strArray15);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test120");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass11 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test121");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer5 = null;
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setDeprecatedHandler(optionConsumer5);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test122");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder4.build();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser5.parse(options6, strArray13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test123");
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
        org.apache.commons.cli.Options options14 = null;
        java.util.Properties properties15 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction16 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser13.parse(options14, properties15, nonOptionAction16, strArray19);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction16 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction16.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test124");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder8.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser12 = builder8.get();
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser12.parse(options13, strArray20, properties21);
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
        org.junit.Assert.assertNotNull(defaultParser12);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "" });
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test125");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.util.Properties properties5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser1.parse(options2, strArray4, properties5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test126");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser7.parse(options8, strArray10, properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test127");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test128");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.util.Properties properties2 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction3 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray4 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine5 = defaultParser0.parse(options1, properties2, nonOptionAction3, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + nonOptionAction3 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction3.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test129");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.util.Properties properties5 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction6 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser3.parse(options4, properties5, nonOptionAction6, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertTrue("'" + nonOptionAction6 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction6.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test130");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser10.parse(options11, strArray13, false);
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
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test131");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser9.parse(options10, strArray11, properties12);
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
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test132");
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
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test133");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder8.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser12 = builder8.get();
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser12.parse(options13, strArray17, properties18);
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
        org.junit.Assert.assertNotNull(defaultParser12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test134");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder5.setDeprecatedHandler(optionConsumer6);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test135");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.build();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser6.parse(options7, strArray12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test136");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder2.get();
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser8.parse(options9, strArray11, true);
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
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test137");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(true);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "" };
        java.util.Properties properties7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser1.parse(options2, strArray6, properties7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test138");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser7.parse(options8, strArray9, properties10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test139");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.DefaultParser defaultParser6 = builder2.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser6.parse(options7, strArray13, properties14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test140");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.util.Properties properties9 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction10 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser7.parse(options8, properties9, nonOptionAction10, strArray13);
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
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test141");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.util.Properties properties7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser3.parse(options4, strArray6, properties7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test142");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser7.parse(options8, strArray10, properties11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test143");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder4.setAllowPartialMatching(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test144");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser3.parse(options4, strArray8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test145");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!", "" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser6.parse(options7, strArray12, properties13, false);
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
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!", "" });
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test146");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser13.parse(options14, strArray16, false);
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
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test147");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test148");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder4.build();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser5.parse(options6, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test149");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser9.parse(options10, strArray17, properties18, false);
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
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test150");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser3.parse(options4, strArray11, properties12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "" });
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test151");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.DefaultParser defaultParser6 = builder2.get();
        java.lang.Class<?> wildcardClass7 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test152");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser10.parse(options11, strArray15, false);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test153");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.util.Properties properties9 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction10 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser7.parse(options8, properties9, nonOptionAction10, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertTrue("'" + nonOptionAction10 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction10.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test154");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder0.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test155");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser7.parse(options8, strArray14);
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
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test156");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser5.parse(options6, strArray12, properties13);
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test157");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.get();
        java.lang.Class<?> wildcardClass7 = defaultParser6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test158");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.parse(options1, strArray4, properties5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test159");
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
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test160");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser3.parse(options4, strArray7, properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test161");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test162");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser10.parse(options11, strArray16, properties17, true);
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test163");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder6.build();
        java.lang.Class<?> wildcardClass12 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test164");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser1.parse(options2, strArray5, properties6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test165");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test166");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser10.parse(options11, strArray14, true);
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test167");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test168");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(true);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray3 = null;
        java.util.Properties properties4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser1.parse(options2, strArray3, properties4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test169");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder0.get();
        org.apache.commons.cli.Options options5 = null;
        java.util.Properties properties6 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction7 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser4.parse(options5, properties6, nonOptionAction7, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertTrue("'" + nonOptionAction7 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction7.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test170");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test171");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
        org.apache.commons.cli.Options options12 = null;
        java.util.Properties properties13 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction14 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser11.parse(options12, properties13, nonOptionAction14, strArray16);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction14 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction14.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test172");
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
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test173");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.Options options11 = null;
        java.util.Properties properties12 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction13 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
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
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertTrue("'" + nonOptionAction13 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction13.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test174");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser10.parse(options11, strArray15, true);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test175");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder11.setAllowPartialMatching(true);
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
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test176");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser10.parse(options11, strArray18, properties19, true);
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
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test177");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test178");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder3.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test179");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder0.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test180");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser defaultParser4 = builder2.build();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser4.parse(options5, strArray8, properties9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test181");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test182");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setDeprecatedHandler(optionConsumer3);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test183");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setDeprecatedHandler(optionConsumer7);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setDeprecatedHandler(optionConsumer9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test184");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder5.setDeprecatedHandler(optionConsumer6);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test185");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder4.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser7.parse(options8, strArray11, false);
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
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test186");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
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
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test187");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser13.parse(options14, strArray15, properties16);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test188");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test189");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser13.parse(options14, strArray16, true);
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
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test190");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder7.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(defaultParser8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test191");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser9.parse(options10, strArray16, false);
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test192");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
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
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "" });
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test193");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test194");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser7.parse(options8, strArray10, properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test195");
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
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder14.setDeprecatedHandler(optionConsumer15);
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
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test196");
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction0 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.Class<?> wildcardClass1 = nonOptionAction0.getClass();
        org.junit.Assert.assertTrue("'" + nonOptionAction0 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction0.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test197");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setDeprecatedHandler(optionConsumer3);
        java.lang.Class<?> wildcardClass5 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test198");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test199");
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
        java.lang.Class<?> wildcardClass16 = builder6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test200");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test201");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.build();
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder5.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test202");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser9.parse(options10, strArray17, true);
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
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test203");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test204");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder6.build();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser11.parse(options12, strArray16);
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
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test205");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.DefaultParser defaultParser11 = builder9.build();
        java.lang.Class<?> wildcardClass12 = defaultParser11.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test206");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.lang.Class<?> wildcardClass2 = defaultParser1.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test207");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test208");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser13.parse(options14, strArray18, properties19, true);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test209");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser7.parse(options8, strArray11);
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
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test210");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser defaultParser4 = builder2.build();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser4.parse(options5, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test211");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer5 = null;
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setDeprecatedHandler(optionConsumer5);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test212");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser7.parse(options8, strArray10, properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test213");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test214");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.DefaultParser defaultParser11 = builder9.build();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser11.parse(options12, strArray13, properties14);
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
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test215");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "" };
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
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!", "hi!", "" });
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test216");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser10.parse(options11, strArray15, true);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test217");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
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
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test218");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(true);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser1.parse(options2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test219");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser defaultParser4 = builder2.build();
        org.apache.commons.cli.Options options5 = null;
        java.util.Properties properties6 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction7 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser4.parse(options5, properties6, nonOptionAction7, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertTrue("'" + nonOptionAction7 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction7.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test220");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test221");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder2.get();
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
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(defaultParser8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test222");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder4.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser7.parse(options8, strArray11, properties12);
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
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test223");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder0.build();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder0.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(defaultParser10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test224");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test225");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser defaultParser4 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test226");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test227");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test228");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser9.parse(options10, strArray11);
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
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test229");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder0.get();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser4.parse(options5, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "hi!", "", "", "" });
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test230");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser7.parse(options8, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test231");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.util.Properties properties12 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction13 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
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
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertTrue("'" + nonOptionAction13 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction13.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test232");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test233");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser7.parse(options8, strArray15, properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "" });
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test234");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.DefaultParser defaultParser6 = builder2.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser6.parse(options7, strArray10, properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test235");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.get();
        org.apache.commons.cli.Options options7 = null;
        java.util.Properties properties8 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction9 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser6.parse(options7, properties8, nonOptionAction9, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertTrue("'" + nonOptionAction9 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction9.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test236");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test237");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test238");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser7.parse(options8, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test239");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setDeprecatedHandler(optionConsumer4);
        java.lang.Class<?> wildcardClass6 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test240");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser5.parse(options6, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test241");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser10.parse(options11, strArray17);
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
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test242");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder9.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
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
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test243");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser3.parse(options4, strArray10, properties11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "", "" });
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test244");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(false);
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test245");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test246");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setDeprecatedHandler(optionConsumer9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test247");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder9.setDeprecatedHandler(optionConsumer11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test248");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder5.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder7.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(defaultParser8);
    }
}

