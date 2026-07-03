import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_022_Regression0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_022_Regression0.test1");
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction0 = org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE;
        org.junit.Assert.assertTrue("'" + nonOptionAction0 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE + "'", nonOptionAction0.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.IGNORE));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_022_Regression0.test2");
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
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_022_Regression0.test3");
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction0 = org.apache.commons.cli.DefaultParser.NonOptionAction.STOP;
        org.junit.Assert.assertTrue("'" + nonOptionAction0 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.STOP + "'", nonOptionAction0.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.STOP));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_022_Regression0.test4");
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
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_022_Regression0.test5");
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction0 = org.apache.commons.cli.DefaultParser.NonOptionAction.THROW;
        org.junit.Assert.assertTrue("'" + nonOptionAction0 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.THROW + "'", nonOptionAction0.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.THROW));
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_022_Regression0.test6");
        org.apache.commons.cli.DefaultParser.NonOptionAction nonOptionAction0 = org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP;
        org.junit.Assert.assertTrue("'" + nonOptionAction0 + "' != '" + org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP + "'", nonOptionAction0.equals(org.apache.commons.cli.DefaultParser.NonOptionAction.SKIP));
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_022_Regression0.test7");
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
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_022_Regression0.test8");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_022_Regression0.test9");
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
}

