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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0001");
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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0002");
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0003");
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
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0004");
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
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0005");
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
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0006");
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
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0007");
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
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0008");
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
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0009");
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
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0010");
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0011");
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
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0012");
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0013");
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
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0014");
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0015");
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
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0016");
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
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0017");
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
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0018");
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0019");
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
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0020");
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0021");
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction0 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.Class<?> wildcardClass1 = nonOptionAction0.getClass();
        org.junit.Assert.assertTrue("'" + nonOptionAction0 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction0.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0022");
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
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0023");
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
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0024");
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
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0025");
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
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0026");
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
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0027");
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
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0028");
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
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0029");
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
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0030");
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0031");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.lang.Class<?> wildcardClass3 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0032");
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
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0033");
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
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0034");
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
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0035");
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
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0036");
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
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0037");
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
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0038");
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
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0039");
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
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0040");
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
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0041");
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0042");
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
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0043");
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
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0044");
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
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0045");
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
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0046");
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
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0047");
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
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0048");
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0049");
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0050");
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0051");
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0052");
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
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0053");
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0054");
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
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0055");
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0056");
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
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0057");
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
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0058");
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0059");
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0060");
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
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0061");
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0062");
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
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0063");
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
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0064");
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
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0065");
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
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0066");
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0067");
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
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0068");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0069");
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0070");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0071");
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
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0072");
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0073");
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
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0074");
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0075");
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
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0076");
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
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0077");
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
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0078");
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0079");
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0080");
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
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0081");
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
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0082");
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0083");
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0084");
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0085");
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0086");
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0087");
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0088");
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0089");
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0090");
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
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0091");
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
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0092");
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0093");
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
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0094");
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0095");
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
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0096");
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
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0097");
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0098");
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
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0099");
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
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0100");
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
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0101");
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
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0102");
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
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0103");
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
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0104");
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
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0105");
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0106");
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0107");
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0108");
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
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0109");
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0110");
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0111");
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
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0112");
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
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0113");
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
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0114");
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
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0115");
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
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0116");
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
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0117");
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
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0118");
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
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0119");
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
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0120");
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0121");
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
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0122");
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0123");
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0124");
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
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0125");
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
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0126");
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0127");
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0128");
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
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0129");
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0130");
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0131");
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
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0132");
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
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0133");
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0134");
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0135");
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0136");
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
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0137");
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
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0138");
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
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0139");
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0140");
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
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0141");
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
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0142");
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0143");
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
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0144");
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0145");
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
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0146");
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0147");
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0148");
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0149");
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0150");
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
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0151");
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
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0152");
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
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0153");
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
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0154");
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
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0155");
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0156");
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0157");
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0158");
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0159");
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0160");
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0161");
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0162");
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0163");
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0164");
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
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0165");
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0166");
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
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0167");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0168");
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
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0169");
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction0 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.Class<?> wildcardClass1 = nonOptionAction0.getClass();
        org.junit.Assert.assertTrue("'" + nonOptionAction0 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction0.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0170");
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0171");
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0172");
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0173");
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0174");
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
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0175");
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
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0176");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.lang.Class<?> wildcardClass2 = defaultParser1.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0177");
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0178");
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
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0179");
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
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0180");
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0181");
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
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0182");
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
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0183");
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
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0184");
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0185");
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0186");
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0187");
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
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0188");
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0189");
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0190");
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0191");
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
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0192");
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
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0193");
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0194");
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0195");
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0196");
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0197");
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0198");
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
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0199");
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0200");
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
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0201");
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0202");
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0203");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser3.parse(options4, strArray5, false);
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
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0204");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Properties properties7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser0.parse(options1, strArray6, properties7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0205");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder4.build();
        org.apache.commons.cli.Options options6 = null;
        java.util.Properties properties7 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction8 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray9 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser5.parse(options6, properties7, nonOptionAction8, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertTrue("'" + nonOptionAction8 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction8.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0206");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(false);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0207");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray9 = new java.lang.String[] {};
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
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0208");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0209");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.util.Properties properties9 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction10 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser7.parse(options8, properties9, nonOptionAction10, strArray15);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0210");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser3.parse(options4, strArray7, properties8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0211");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder0.get();
        org.apache.commons.cli.Options options5 = null;
        java.util.Properties properties6 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction7 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser4.parse(options5, properties6, nonOptionAction7, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertTrue("'" + nonOptionAction7 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction7.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0212");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "" };
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
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0213");
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
        java.lang.String[] strArray12 = new java.lang.String[] {};
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
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0214");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser9.parse(options10, strArray12, properties13, false);
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
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0215");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser5.parse(options6, strArray9);
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0216");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder3.build();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser4.parse(options5, strArray9, properties10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0217");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder7.build();
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser8.parse(options9, strArray15);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0218");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser13.parse(options14, strArray18, true);
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
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0219");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.util.Properties properties9 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction10 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
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
        org.junit.Assert.assertTrue("'" + nonOptionAction10 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction10.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0220");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser7.parse(options8, strArray10, properties11, true);
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
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0221");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser defaultParser4 = builder2.build();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Properties properties7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser4.parse(options5, strArray6, properties7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0222");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder3.get();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser4.parse(options5, strArray11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0223");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser1.parse(options2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0224");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.util.Properties properties9 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction10 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
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
        org.junit.Assert.assertTrue("'" + nonOptionAction10 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction10.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0225");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.lang.Class<?> wildcardClass8 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0226");
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
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.build();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser16.parse(options17, strArray23, true);
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
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "", "", "hi!" });
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0227");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "", "" };
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
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0228");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass10 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0229");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray3 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine5 = defaultParser1.parse(options2, strArray3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0230");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser1.parse(options2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0231");
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
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0232");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser9.parse(options10, strArray14);
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0233");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder8.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser12 = builder8.get();
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser12.parse(options13, strArray17, true);
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
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0234");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder4.build();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser5.parse(options6, strArray8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0235");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser10.parse(options11, strArray15, properties16);
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
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0236");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.DefaultParser defaultParser6 = builder2.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser6.parse(options7, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0237");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser7.parse(options8, strArray12, properties13);
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0238");
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
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer17 = null;
        org.apache.commons.cli.DefaultParser.Builder builder18 = builder14.setDeprecatedHandler(optionConsumer17);
        java.lang.Class<?> wildcardClass19 = builder18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0239");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder6.get();
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0240");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder0.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser6.parse(options7, strArray8, properties9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0241");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.build();
        org.apache.commons.cli.Options options11 = null;
        java.util.Properties properties12 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction13 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser10.parse(options11, properties12, nonOptionAction13, strArray14);
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
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0242");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser9.parse(options10, strArray14);
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0243");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser10.parse(options11, strArray13, true);
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
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0244");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder0.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser6.parse(options7, strArray13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0245");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0246");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0247");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setDeprecatedHandler(optionConsumer4);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0248");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
        java.lang.Class<?> wildcardClass12 = builder10.getClass();
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0249");
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
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser6.parse(options7, strArray10, properties11, true);
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
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0250");
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
        java.util.Properties properties12 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction13 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser10.parse(options11, properties12, nonOptionAction13, strArray18);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction13 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction13.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0251");
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
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser13.parse(options14, strArray17, properties18, false);
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
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0252");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder6.get();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser11.parse(options12, strArray19);
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0253");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass11 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0254");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0255");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder0.get();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser13.parse(options14, strArray17, false);
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
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0256");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder0.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser6.parse(options7, strArray9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0257");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.util.Properties properties9 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction10 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "", "" };
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
        org.junit.Assert.assertTrue("'" + nonOptionAction10 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction10.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "", "", "" });
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0258");
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
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction16 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser13.parse(options14, properties15, nonOptionAction16, strArray20);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction16 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction16.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0259");
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
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0260");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        java.lang.Class<?> wildcardClass6 = builder5.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0261");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder3.get();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser4.parse(options5, strArray10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "", "" });
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0262");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser11.parse(options12, strArray14, properties15);
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0263");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder11.setAllowPartialMatching(true);
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0264");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.build();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser6.parse(options7, strArray8, properties9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0265");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(true);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser1.parse(options2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0266");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
        java.lang.Class<?> wildcardClass12 = builder10.getClass();
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
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0267");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser10.parse(options11, strArray13, properties14, false);
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0268");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser10.parse(options11, strArray14, properties15, false);
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0269");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser10.parse(options11, strArray13);
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0270");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder2.get();
        org.apache.commons.cli.Options options9 = null;
        java.util.Properties properties10 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction11 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser8.parse(options9, properties10, nonOptionAction11, strArray16);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction11 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction11.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0271");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser6.parse(options7, strArray10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0272");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder10.get();
        java.lang.Class<?> wildcardClass14 = defaultParser13.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0273");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder8.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser12 = builder11.get();
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser12.parse(options13, strArray19, false);
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "hi!", "", "" });
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0274");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0275");
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
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.build();
        org.apache.commons.cli.DefaultParser defaultParser17 = builder15.get();
        java.lang.Class<?> wildcardClass18 = builder15.getClass();
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
        org.junit.Assert.assertNotNull(defaultParser17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0276");
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
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.build();
        org.apache.commons.cli.DefaultParser defaultParser17 = builder15.get();
        org.apache.commons.cli.Options options18 = null;
        java.util.Properties properties19 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction20 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine27 = defaultParser17.parse(options18, properties19, nonOptionAction20, strArray26);
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
        org.junit.Assert.assertNotNull(defaultParser17);
        org.junit.Assert.assertTrue("'" + nonOptionAction20 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction20.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0277");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0278");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser10.parse(options11, strArray15, properties16);
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
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0279");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.build();
        java.lang.Class<?> wildcardClass11 = defaultParser10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0280");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder6.get();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray13 = null;
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser11.parse(options12, strArray13, properties14, true);
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
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0281");
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
        java.lang.Class<?> wildcardClass15 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0282");
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
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "", "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "hi!" });
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0283");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser10.parse(options11, strArray14, properties15, false);
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
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0284");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser10.parse(options11, strArray14, properties15, false);
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
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0285");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setDeprecatedHandler(optionConsumer9);
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0286");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder0.get();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser4.parse(options5, strArray8, properties9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0287");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder5.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder7.get();
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser8.parse(options9, strArray10);
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
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0288");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0289");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder0.get();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser13.parse(options14, strArray19, true);
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
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0290");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.build();
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder5.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder5.get();
        org.apache.commons.cli.Options options10 = null;
        java.util.Properties properties11 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction12 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser9.parse(options10, properties11, nonOptionAction12, strArray15);
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
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertTrue("'" + nonOptionAction12 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction12.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0291");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser10.parse(options11, strArray17, true);
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
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "hi!" });
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0292");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer5 = null;
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setDeprecatedHandler(optionConsumer5);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder0.build();
        org.apache.commons.cli.Options options8 = null;
        java.util.Properties properties9 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction10 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
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
        org.junit.Assert.assertTrue("'" + nonOptionAction10 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction10.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0293");
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
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.build();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "hi!", "" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser16.parse(options17, strArray22, properties23);
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
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "hi!", "" });
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0294");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder6.get();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray11 = null;
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
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0295");
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
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser11.parse(options12, strArray14, false);
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0296");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder3.build();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.util.Properties properties7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser4.parse(options5, strArray6, properties7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0297");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder6.build();
        org.apache.commons.cli.Options options10 = null;
        java.util.Properties properties11 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction12 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
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
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertTrue("'" + nonOptionAction12 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction12.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0298");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.DefaultParser defaultParser6 = builder2.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser6.parse(options7, strArray13, properties14);
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
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0299");
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
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.build();
        org.apache.commons.cli.DefaultParser defaultParser17 = builder15.get();
        org.apache.commons.cli.Options options18 = null;
        java.util.Properties properties19 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction20 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine24 = defaultParser17.parse(options18, properties19, nonOptionAction20, strArray23);
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
        org.junit.Assert.assertNotNull(defaultParser17);
        org.junit.Assert.assertTrue("'" + nonOptionAction20 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction20.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0300");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0301");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0302");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        java.lang.Class<?> wildcardClass11 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0303");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!", "", "", "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "hi!", "", "", "hi!" });
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0304");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder8.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser10.parse(options11, strArray14, properties15);
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0305");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setAllowPartialMatching(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0306");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder6.get();
        org.apache.commons.cli.Options options14 = null;
        java.util.Properties properties15 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction16 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "", "", "" };
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
        org.junit.Assert.assertTrue("'" + nonOptionAction16 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction16.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "", "", "" });
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0307");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser7.parse(options8, strArray10, false);
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
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0308");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser9.parse(options10, strArray14, properties15);
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0309");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder3.get();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray6 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser4.parse(options5, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0310");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
        java.lang.Class<?> wildcardClass12 = defaultParser11.getClass();
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
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0311");
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
        org.apache.commons.cli.Options options18 = null;
        java.util.Properties properties19 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction20 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser17.parse(options18, properties19, nonOptionAction20, strArray25);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction20 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction20.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "", "hi!" });
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0312");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder3.get();
        org.apache.commons.cli.Options options7 = null;
        java.util.Properties properties8 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction9 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser6.parse(options7, properties8, nonOptionAction9, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertTrue("'" + nonOptionAction9 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction9.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "", "" });
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0313");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder4.build();
        org.apache.commons.cli.DefaultParser defaultParser6 = builder4.build();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser6.parse(options7, strArray10);
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
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0314");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "" };
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser3.parse(options4, strArray8, properties9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0315");
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
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser10.parse(options11, strArray16, properties17);
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
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "hi!", "hi!" });
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0316");
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
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction14 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser11.parse(options12, properties13, nonOptionAction14, strArray18);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction14 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction14.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0317");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0318");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.util.Properties properties12 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction13 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!" };
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
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertTrue("'" + nonOptionAction13 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction13.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0319");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder2.build();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser6.parse(options7, strArray14, properties15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "", "", "hi!" });
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0320");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder5.setDeprecatedHandler(optionConsumer6);
        java.lang.Class<?> wildcardClass8 = builder5.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0321");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray5 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser3.parse(options4, strArray5, false);
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0322");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder2.get();
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser8.parse(options9, strArray12);
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
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0323");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
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
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0324");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder5.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder7.get();
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser8.parse(options9, strArray10, true);
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
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0325");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!", "", "", "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "hi!", "", "", "hi!" });
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0326");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder0.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0327");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.Options options2 = null;
        java.util.Properties properties3 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction4 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser1.parse(options2, properties3, nonOptionAction4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0328");
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
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!" };
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser12.parse(options13, strArray17, properties18, false);
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
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0329");
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
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(defaultParser11);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0330");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder4.build();
        org.apache.commons.cli.Options options10 = null;
        java.util.Properties properties11 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction12 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser9.parse(options10, properties11, nonOptionAction12, strArray14);
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0331");
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
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0332");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.get();
        org.apache.commons.cli.Options options7 = null;
        java.util.Properties properties8 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction9 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
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
        org.junit.Assert.assertTrue("'" + nonOptionAction9 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction9.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0333");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder6.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser9.parse(options10, strArray16, true);
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
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "", "hi!", "" });
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0334");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setAllowPartialMatching(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0335");
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
        java.util.Properties properties12 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction13 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertTrue("'" + nonOptionAction13 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction13.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0336");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser3.parse(options4, strArray10, properties11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0337");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder3.get();
        org.apache.commons.cli.Options options7 = null;
        java.util.Properties properties8 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction9 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser6.parse(options7, properties8, nonOptionAction9, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertTrue("'" + nonOptionAction9 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction9.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "", "", "" });
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0338");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0339");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(true);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine5 = defaultParser1.parse(options2, strArray3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0340");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.util.Properties properties9 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction10 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
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
        org.junit.Assert.assertTrue("'" + nonOptionAction10 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction10.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0341");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder2.get();
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.util.Properties properties11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser8.parse(options9, strArray10, properties11, false);
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
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0342");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0343");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder3.build();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser4.parse(options5, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0344");
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
        java.lang.String[] strArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser8.parse(options9, properties10, nonOptionAction11, strArray12);
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
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0345");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder7.build();
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser8.parse(options9, strArray12, properties13, true);
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
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0346");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder6.build();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.Properties properties15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser11.parse(options12, strArray14, properties15);
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
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0347");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder0.get();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0348");
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
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser12.parse(options13, strArray20);
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
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "hi!", "", "", "" });
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0349");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder6.get();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser11.parse(options12, strArray18);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "", "hi!", "hi!" });
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0350");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder0.get();
        java.lang.Class<?> wildcardClass7 = defaultParser6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0351");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.util.Properties properties9 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction10 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "hi!" };
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
        org.junit.Assert.assertTrue("'" + nonOptionAction10 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction10.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "hi!" });
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0352");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.util.Properties properties20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser13.parse(options14, strArray19, properties20, false);
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
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0353");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder6.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer12 = null;
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder11.setDeprecatedHandler(optionConsumer12);
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder13.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass16 = builder15.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0354");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass13 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0355");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0356");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(false);
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0357");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder3.build();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser4.parse(options5, strArray9, properties10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0358");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder10.get();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser13.parse(options14, strArray18);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0359");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder6.build();
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0360");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        java.lang.Class<?> wildcardClass4 = builder3.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0361");
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
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0362");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.get();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser10.parse(options11, strArray16);
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0363");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
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
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0364");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser defaultParser4 = builder2.build();
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser5.parse(options6, strArray9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0365");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.build();
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder5.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder5.get();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
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
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0366");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray5 = null;
        java.util.Properties properties6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser3.parse(options4, strArray5, properties6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0367");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser10.parse(options11, strArray18);
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
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0368");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.Options options10 = null;
        java.util.Properties properties11 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction12 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser9.parse(options10, properties11, nonOptionAction12, strArray19);
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "", "", "", "" });
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0369");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser defaultParser4 = builder2.build();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser4.parse(options5, strArray9, properties10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0370");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0371");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser7.parse(options8, strArray13, properties14);
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
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0372");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder0.get();
        org.apache.commons.cli.Options options5 = null;
        java.util.Properties properties6 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction7 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser4.parse(options5, properties6, nonOptionAction7, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertTrue("'" + nonOptionAction7 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction7.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0373");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder3.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser6.parse(options7, strArray12, false);
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
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "", "" });
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0374");
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0375");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!" };
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser3.parse(options4, strArray8, properties9, true);
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0376");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        java.lang.Class<?> wildcardClass4 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0377");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder0.get();
        org.apache.commons.cli.DefaultParser defaultParser5 = builder0.get();
        org.apache.commons.cli.Options options6 = null;
        java.util.Properties properties7 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction8 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser5.parse(options6, properties7, nonOptionAction8, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertTrue("'" + nonOptionAction8 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction8.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" });
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0378");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder5.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0379");
        org.apache.commons.cli.DefaultParser defaultParser1 = new org.apache.commons.cli.DefaultParser(false);
        org.apache.commons.cli.Options options2 = null;
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.Properties properties4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser1.parse(options2, strArray3, properties4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0380");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "", "" };
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
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "", "" });
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0381");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder0.get();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser13.parse(options14, strArray20);
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
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0382");
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
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
        java.util.Properties properties22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser13.parse(options14, strArray21, properties22);
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0383");
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
        org.apache.commons.cli.Options options14 = null;
        java.util.Properties properties15 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction16 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
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
        org.junit.Assert.assertTrue("'" + nonOptionAction16 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction16.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0384");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser11.parse(options12, strArray18, false);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "", "", "" });
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0385");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0386");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder8.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser12 = builder8.get();
        org.apache.commons.cli.Options options13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser12.parse(options13, strArray19);
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "", "", "hi!" });
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0387");
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
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.build();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray18 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser16.parse(options17, strArray18);
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
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0388");
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
        org.apache.commons.cli.DefaultParser defaultParser15 = builder14.get();
        org.apache.commons.cli.Options options16 = null;
        java.lang.String[] strArray17 = null;
        java.util.Properties properties18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser15.parse(options16, strArray17, properties18, true);
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
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0389");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "" };
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
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "" });
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0390");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser9.parse(options10, strArray13, properties14, true);
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
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0391");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder9.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.get();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser13.parse(options14, strArray20, properties21);
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
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0392");
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
        org.apache.commons.cli.Options options22 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser21.parse(options22, strArray24);
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
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(defaultParser21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "" });
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0393");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass13 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0394");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer12 = null;
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder9.setDeprecatedHandler(optionConsumer12);
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0395");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.Options options10 = null;
        java.util.Properties properties11 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction12 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser9.parse(options10, properties11, nonOptionAction12, strArray18);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0396");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.build();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser6.parse(options7, strArray13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "", "", "hi!", "" });
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0397");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer5 = null;
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setDeprecatedHandler(optionConsumer5);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0398");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder5.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder5.build();
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder5.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(defaultParser8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0399");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
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
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0400");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser10.parse(options11, strArray16);
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
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0401");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.get();
        java.lang.Class<?> wildcardClass11 = defaultParser10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0402");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.build();
        org.apache.commons.cli.Options options4 = null;
        java.util.Properties properties5 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction6 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser3.parse(options4, properties5, nonOptionAction6, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertTrue("'" + nonOptionAction6 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction6.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "", "hi!" });
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0403");
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
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.build();
        org.apache.commons.cli.DefaultParser defaultParser17 = builder15.get();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser17.parse(options18, strArray25);
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
        org.junit.Assert.assertNotNull(defaultParser17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0404");
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
        org.apache.commons.cli.DefaultParser defaultParser17 = builder16.get();
        org.apache.commons.cli.DefaultParser defaultParser18 = builder16.get();
        org.apache.commons.cli.Options options19 = null;
        java.lang.String[] strArray20 = null;
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine23 = defaultParser18.parse(options19, strArray20, properties21, true);
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
        org.junit.Assert.assertNotNull(defaultParser18);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0405");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!", "" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser7.parse(options8, strArray13, properties14);
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
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0406");
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertTrue("'" + nonOptionAction16 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction16.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0407");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder6.build();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.Options options11 = null;
        java.util.Properties properties12 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction13 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser10.parse(options11, properties12, nonOptionAction13, strArray19);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction13 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction13.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0408");
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
        org.apache.commons.cli.DefaultParser defaultParser17 = builder16.build();
        org.apache.commons.cli.Options options18 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser17.parse(options18, strArray23, properties24);
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
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0409");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder4.build();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser5.parse(options6, strArray9, properties10);
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0410");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder0.setAllowPartialMatching(false);
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0411");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser9.parse(options10, strArray12, properties13, true);
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
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0412");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.Options options4 = null;
        java.lang.String[] strArray5 = null;
        java.util.Properties properties6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine7 = defaultParser3.parse(options4, strArray5, properties6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0413");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        java.util.Properties properties14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser7.parse(options8, strArray13, properties14);
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
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0414");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer5 = null;
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setDeprecatedHandler(optionConsumer5);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder0.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser7.parse(options8, strArray14, true);
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0415");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass4 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0416");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
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
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "", "", "" });
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0417");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setDeprecatedHandler(optionConsumer9);
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0418");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0419");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.get();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
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
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0420");
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
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.build();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        java.util.Properties properties24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine26 = defaultParser16.parse(options17, strArray23, properties24, false);
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
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!", "", "hi!" });
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0421");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0422");
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
        org.apache.commons.cli.DefaultParser defaultParser17 = builder16.get();
        org.apache.commons.cli.Options options18 = null;
        java.util.Properties properties19 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction20 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser17.parse(options18, properties19, nonOptionAction20, strArray24);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction20 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction20.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0423");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder6.build();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser10.parse(options11, strArray17, false);
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
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0424");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser9.parse(options10, strArray16, properties17, false);
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
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "", "hi!", "", "hi!" });
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0425");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0426");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder6.build();
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray12 = new java.lang.String[] {};
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser10.parse(options11, strArray12, properties13, true);
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
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0427");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder3.build();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray6 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser4.parse(options5, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0428");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder4.build();
        org.apache.commons.cli.Options options10 = null;
        java.util.Properties properties11 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction12 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser9.parse(options10, properties11, nonOptionAction12, strArray19);
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0429");
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
        org.apache.commons.cli.DefaultParser defaultParser13 = builder6.get();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        java.util.Properties properties21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine22 = defaultParser13.parse(options14, strArray20, properties21);
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
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0430");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.build();
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder5.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder5.get();
        org.apache.commons.cli.Options options10 = null;
        java.util.Properties properties11 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction12 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser9.parse(options10, properties11, nonOptionAction12, strArray17);
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
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertTrue("'" + nonOptionAction12 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction12.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0431");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setDeprecatedHandler(optionConsumer3);
        java.lang.Class<?> wildcardClass5 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0432");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder0.get();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser4.parse(options5, strArray12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "", "hi!", "", "", "" });
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0433");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser9.parse(options10, strArray14, false);
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0434");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder10.build();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "" };
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
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0435");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser5.parse(options6, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0436");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder4.build();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!", "" };
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
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "hi!", "" });
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0437");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.build();
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder5.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser9.parse(options10, strArray15, properties16, true);
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
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0438");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder0.setDeprecatedHandler(optionConsumer11);
        java.lang.Class<?> wildcardClass13 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0439");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer5 = null;
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setDeprecatedHandler(optionConsumer5);
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0440");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder4.build();
        org.apache.commons.cli.DefaultParser defaultParser6 = builder4.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine10 = defaultParser6.parse(options7, strArray8, properties9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0441");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder5.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder7.get();
        org.apache.commons.cli.Options options9 = null;
        java.util.Properties properties10 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction11 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser8.parse(options9, properties10, nonOptionAction11, strArray16);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction11 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction11.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0442");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder9.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder13.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder17 = builder15.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass18 = builder15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0443");
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
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser11.parse(options12, strArray13, properties14, true);
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0444");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.build();
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder8.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser12 = builder8.get();
        java.lang.Class<?> wildcardClass13 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(defaultParser12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0445");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.build();
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder5.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.Options options10 = null;
        java.util.Properties properties11 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction12 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser9.parse(options10, properties11, nonOptionAction12, strArray17);
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
        org.junit.Assert.assertNotNull(defaultParser9);
        org.junit.Assert.assertTrue("'" + nonOptionAction12 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction12.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0446");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder9.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder14 = builder12.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder16 = builder12.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder18 = builder12.setAllowPartialMatching(true);
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
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0447");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder2.build();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser6.parse(options7, strArray9, properties10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0448");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.Options options10 = null;
        java.util.Properties properties11 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction12 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser9.parse(options10, properties11, nonOptionAction12, strArray18);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction12 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction12.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!", "hi!", "" });
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0449");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder10.get();
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
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0450");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder5.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
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
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "" });
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0451");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser defaultParser4 = builder2.build();
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0452");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder2.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser11 = builder2.build();
        org.apache.commons.cli.Options options12 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine16 = defaultParser11.parse(options12, strArray14, false);
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
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0453");
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
        org.apache.commons.cli.DefaultParser.Builder builder24 = builder20.setAllowPartialMatching(false);
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
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0454");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser7.parse(options8, strArray12);
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
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "" });
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0455");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder0.get();
        org.apache.commons.cli.DefaultParser defaultParser5 = builder0.get();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser5.parse(options6, strArray10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0456");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass13 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0457");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setDeprecatedHandler(optionConsumer7);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder6.get();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser9.parse(options10, strArray14);
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0458");
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0459");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder9.setDeprecatedHandler(optionConsumer11);
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0460");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder7.build();
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Properties properties13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser8.parse(options9, strArray12, properties13, true);
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
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0461");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.util.Properties properties7 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction8 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser5.parse(options6, properties7, nonOptionAction8, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertTrue("'" + nonOptionAction8 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction8.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0462");
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
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.build();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray18 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser16.parse(options17, strArray18, true);
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0463");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder4.get();
        java.lang.Class<?> wildcardClass6 = defaultParser5.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0464");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder8.get();
        org.apache.commons.cli.Options options10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0465");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.build();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder0.build();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine13 = defaultParser4.parse(options5, strArray11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "", "", "hi!" });
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0466");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        java.lang.Class<?> wildcardClass1 = defaultParser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0467");
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
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser11.parse(options12, strArray15, properties16);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0468");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser defaultParser8 = builder6.build();
        org.apache.commons.cli.Options options9 = null;
        java.util.Properties properties10 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction11 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser8.parse(options9, properties10, nonOptionAction11, strArray14);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction11 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction11.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0469");
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
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0470");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder3.get();
        org.apache.commons.cli.DefaultParser defaultParser7 = builder3.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!", "hi!", "", "" };
        java.util.Properties properties16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser7.parse(options8, strArray15, properties16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0471");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder6.get();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine18 = defaultParser10.parse(options11, strArray16, properties17);
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
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0472");
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
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.Properties properties17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser13.parse(options14, strArray16, properties17, true);
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
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0473");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0474");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer10 = null;
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setDeprecatedHandler(optionConsumer10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0475");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder0.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "hi!" };
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
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "hi!" });
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0476");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder6.setDeprecatedHandler(optionConsumer9);
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder10.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder10.build();
        org.apache.commons.cli.Options options14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine19 = defaultParser13.parse(options14, strArray17, false);
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0477");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser3 = builder2.build();
        org.apache.commons.cli.DefaultParser defaultParser4 = builder2.build();
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.Options options6 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine11 = defaultParser5.parse(options6, strArray9, properties10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(defaultParser3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0478");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer8 = null;
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setDeprecatedHandler(optionConsumer8);
        org.apache.commons.cli.DefaultParser.Builder builder11 = builder9.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder13 = builder9.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder15 = builder13.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser defaultParser16 = builder15.build();
        org.apache.commons.cli.Options options17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "hi!" };
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser16.parse(options17, strArray22, properties23, true);
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(defaultParser16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "", "hi!" });
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0479");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser10.parse(options11, strArray13);
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0480");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        org.apache.commons.cli.Options options11 = null;
        java.util.Properties properties12 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction13 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
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
        org.junit.Assert.assertTrue("'" + nonOptionAction13 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction13.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0481");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine14 = defaultParser7.parse(options8, strArray12, false);
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
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "hi!" });
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0482");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.build();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer11 = null;
        org.apache.commons.cli.DefaultParser.Builder builder12 = builder9.setDeprecatedHandler(optionConsumer11);
        org.apache.commons.cli.DefaultParser defaultParser13 = builder12.get();
        org.apache.commons.cli.Options options14 = null;
        java.util.Properties properties15 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction16 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "", "", "hi!" };
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
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(defaultParser10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(defaultParser13);
        org.junit.Assert.assertTrue("'" + nonOptionAction16 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction16.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "hi!", "", "", "hi!" });
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0483");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer4 = null;
        org.apache.commons.cli.DefaultParser.Builder builder5 = builder3.setDeprecatedHandler(optionConsumer4);
        org.apache.commons.cli.DefaultParser defaultParser6 = builder3.get();
        org.apache.commons.cli.DefaultParser defaultParser7 = builder3.build();
        org.apache.commons.cli.Options options8 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser7.parse(options8, strArray13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "", "" });
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0484");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer7 = null;
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setDeprecatedHandler(optionConsumer7);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer9 = null;
        org.apache.commons.cli.DefaultParser.Builder builder10 = builder8.setDeprecatedHandler(optionConsumer9);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0485");
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
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser11.parse(options12, strArray15, true);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0486");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        java.util.Properties properties19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine21 = defaultParser11.parse(options12, strArray18, properties19, false);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "hi!", "", "hi!", "" });
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0487");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer2 = null;
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setDeprecatedHandler(optionConsumer2);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder0.get();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
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
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0488");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.Options options2 = null;
        java.util.Properties properties3 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction4 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        java.lang.String[] strArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine6 = defaultParser1.parse(options2, properties3, nonOptionAction4, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertTrue("'" + nonOptionAction4 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction4.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0489");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer6 = null;
        org.apache.commons.cli.DefaultParser.Builder builder7 = builder2.setDeprecatedHandler(optionConsumer6);
        org.apache.commons.cli.DefaultParser defaultParser8 = builder7.build();
        org.apache.commons.cli.Options options9 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine17 = defaultParser8.parse(options9, strArray15, true);
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "", "", "hi!", "hi!" });
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0490");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser defaultParser1 = builder0.get();
        org.apache.commons.cli.DefaultParser.Builder builder3 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser4 = builder3.build();
        org.apache.commons.cli.Options options5 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.Properties properties8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine9 = defaultParser4.parse(options5, strArray7, properties8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(defaultParser1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(defaultParser4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0491");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        java.lang.Class<?> wildcardClass8 = defaultParser7.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0492");
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
        org.apache.commons.cli.DefaultParser defaultParser18 = builder6.get();
        org.apache.commons.cli.DefaultParser defaultParser19 = builder6.build();
        org.apache.commons.cli.Options options20 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine25 = defaultParser19.parse(options20, strArray23, true);
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
        org.junit.Assert.assertNotNull(defaultParser19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0493");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Options options1 = null;
        java.util.Properties properties2 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction3 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.parse(options1, properties2, nonOptionAction3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + nonOptionAction3 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction3.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0494");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) true);
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0495");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.build();
        org.apache.commons.cli.Options options8 = null;
        java.util.Properties properties9 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction10 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser7.parse(options8, properties9, nonOptionAction10, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertTrue("'" + nonOptionAction10 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction10.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0496");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer1 = null;
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setDeprecatedHandler(optionConsumer1);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder8 = builder4.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser9 = builder4.get();
        org.apache.commons.cli.Options options10 = null;
        java.util.Properties properties11 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction12 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser9.parse(options10, properties11, nonOptionAction12, strArray19);
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
        org.junit.Assert.assertTrue("'" + nonOptionAction12 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction12.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" });
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0497");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser5 = builder2.get();
        org.apache.commons.cli.DefaultParser defaultParser6 = builder2.get();
        org.apache.commons.cli.Options options7 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine12 = defaultParser6.parse(options7, strArray9, properties10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(defaultParser5);
        org.junit.Assert.assertNotNull(defaultParser6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0498");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder2.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder2.setAllowPartialMatching(false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.Options options8 = null;
        java.util.Properties properties9 = null;
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction10 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine15 = defaultParser7.parse(options8, properties9, nonOptionAction10, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: options");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(defaultParser7);
        org.junit.Assert.assertTrue("'" + nonOptionAction10 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction10.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0499");
        org.apache.commons.cli.DefaultParser.Builder builder0 = org.apache.commons.cli.DefaultParser.builder();
        org.apache.commons.cli.DefaultParser.Builder builder2 = builder0.setAllowPartialMatching(false);
        java.util.function.Consumer<org.apache.commons.cli.Option> optionConsumer3 = null;
        org.apache.commons.cli.DefaultParser.Builder builder4 = builder0.setDeprecatedHandler(optionConsumer3);
        org.apache.commons.cli.DefaultParser.Builder builder6 = builder4.setStripLeadingAndTrailingQuotes((java.lang.Boolean) false);
        org.apache.commons.cli.DefaultParser defaultParser7 = builder6.get();
        org.apache.commons.cli.DefaultParser.Builder builder9 = builder6.setAllowPartialMatching(true);
        org.apache.commons.cli.DefaultParser defaultParser10 = builder9.get();
        org.apache.commons.cli.Options options11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser10.parse(options11, strArray18, true);
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
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" });
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_012_Regression0.test0500");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.CommandLine commandLine20 = defaultParser13.parse(options14, strArray18, false);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!", "hi!" });
    }
}

