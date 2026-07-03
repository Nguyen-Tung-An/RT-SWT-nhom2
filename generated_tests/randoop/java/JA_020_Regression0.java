import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_020_Regression0 {

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
            System.out.format("%n%s%n", "JA_020_Regression0.test001");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_OPT_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-" + "'", str0, "-");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test002");
        org.apache.commons.cli.HelpFormatter.Builder builder0 = org.apache.commons.cli.HelpFormatter.builder();
        java.io.PrintWriter printWriter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.HelpFormatter.Builder builder2 = builder0.setPrintWriter(printWriter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: printWriter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test003");
        int int0 = org.apache.commons.cli.HelpFormatter.DEFAULT_LEFT_PAD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test004");
        org.apache.commons.cli.Option option0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.cli.HelpFormatter.getDescription(option0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.getDescription()\" because \"option\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test005");
        int int0 = org.apache.commons.cli.HelpFormatter.DEFAULT_WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 74 + "'", int0 == 74);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test006");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter4 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter4, 0, "usage: ", "usage: ", options8, (int) ' ', (int) (byte) -1, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test007");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        int int5 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "--", options8, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test008");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "-", "", options7, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test009");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix("hi!");
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter6, 10, options8, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test010");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setLeftPadding((int) (short) 0);
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test011");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix("hi!");
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "hi!", options8, "-", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test012");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((-1), "--", "usage: ", options7, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test013");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix("hi!");
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "-", options8, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test014");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + " " + "'", str0, " ");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test015");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test016");
        int int0 = org.apache.commons.cli.HelpFormatter.DEFAULT_DESC_PAD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test017");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "-", "hi!", options7, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test018");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter2 = null;
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter2, (int) (short) 0, "-", "-", options6, (int) (short) -1, (int) (short) 1, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test019");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.setArgName("usage: ");
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter5, (int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test020");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        int int4 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test021");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.getLongOptSeparator();
        int int5 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test022");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.getSyntaxPrefix();
        int int2 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options4 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", options4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test023");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("");
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.Class<?> wildcardClass4 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test024");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        helpFormatter0.setWidth(10);
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        int int12 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test025");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        int int5 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, 3, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test026");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_SYNTAX_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "usage: " + "'", str0, "usage: ");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test027");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        helpFormatter0.setWidth(10);
        int int11 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 74, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test028");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultArgName = "--";
        int int5 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test029");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        helpFormatter0.setWidth(10);
        int int11 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "hi!", " ", options15, " ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test030");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options4 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", " ", options4, "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test031");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.setArgName("usage: ");
        java.lang.String str5 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test032");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter5, (int) (short) 1, "arg", "hi!", options9, 100, (int) ' ', "--", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test033");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        helpFormatter0.setWidth(10);
        int int11 = helpFormatter0.defaultWidth;
        helpFormatter0.setOptPrefix("-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test034");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "usage: ", options11, "arg", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test035");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        helpFormatter0.setWidth(10);
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test036");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.io.PrintWriter printWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter3, 10, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test037");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_ARG_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "arg" + "'", str0, "arg");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test038");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("");
        int int3 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultLongOptPrefix = "--";
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test039");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.defaultOptPrefix = "--";
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "", options13, "-", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test040");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.getLongOptSeparator();
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", " ", options7, " ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test041");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultArgName = "--";
        java.lang.Class<?> wildcardClass5 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test042");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        int int4 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.getLongOptSeparator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test043");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.getArgName();
        int int5 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test044");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test045");
        org.apache.commons.cli.HelpFormatter.Builder builder0 = org.apache.commons.cli.HelpFormatter.builder();
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction1 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder2 = builder0.setShowDeprecated(optionFunction1);
        java.io.PrintWriter printWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.HelpFormatter.Builder builder4 = builder0.setPrintWriter(printWriter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: printWriter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test046");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptSeparator("");
        int int7 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test047");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("");
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test048");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, 0, " ", "usage: ", options14, (int) (short) 100, (int) (short) -1, "-", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test049");
        org.apache.commons.cli.HelpFormatter.Builder builder0 = new org.apache.commons.cli.HelpFormatter.Builder();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test050");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.defaultArgName = "--";
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = ' ';
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test051");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultNewLine;
        int int5 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test052");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        int int6 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test053");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter5, (int) ' ', "-", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test054");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLeftPadding((int) 'a');
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test055");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.setArgName("usage: ");
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "\r\n";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test056");
        org.apache.commons.cli.HelpFormatter.Builder builder0 = org.apache.commons.cli.HelpFormatter.builder();
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction1 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder2 = builder0.setShowDeprecated(optionFunction1);
        org.apache.commons.cli.HelpFormatter.Builder builder4 = builder0.setShowDeprecated(false);
        org.apache.commons.cli.HelpFormatter.Builder builder6 = builder0.setShowSince(false);
        org.apache.commons.cli.HelpFormatter helpFormatter7 = builder0.get();
        int int8 = helpFormatter7.getWidth();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(helpFormatter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test057");
        org.apache.commons.cli.HelpFormatter.Builder builder0 = org.apache.commons.cli.HelpFormatter.builder();
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction1 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder2 = builder0.setShowDeprecated(optionFunction1);
        org.apache.commons.cli.HelpFormatter.Builder builder4 = builder0.setShowDeprecated(false);
        org.apache.commons.cli.HelpFormatter.Builder builder6 = builder0.setShowSince(false);
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.HelpFormatter.Builder builder8 = builder0.setPrintWriter(printWriter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: printWriter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test058");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 100, "arg", "\r\n", options5, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test059");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        helpFormatter0.setWidth(10);
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test060");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setLongOptSeparator("");
        helpFormatter0.defaultLongOptPrefix = "hi!";
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test061");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setLongOptSeparator("");
        helpFormatter0.defaultLongOptPrefix = "hi!";
        int int15 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test062");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        int int9 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test063");
        org.apache.commons.cli.HelpFormatter.Builder builder0 = org.apache.commons.cli.HelpFormatter.builder();
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction1 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder2 = builder0.setShowDeprecated(optionFunction1);
        org.apache.commons.cli.HelpFormatter.Builder builder4 = builder0.setShowDeprecated(false);
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction5 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder6 = builder0.setShowDeprecated(optionFunction5);
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test064");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        int int3 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test065");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        helpFormatter0.setWidth(10);
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test066");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setNewLine(" ");
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) ' ', "arg", "--", options16, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test067");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        int int5 = helpFormatter0.defaultDescPad;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter7, (int) (byte) 0, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test068");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setLongOptSeparator("");
        java.lang.Class<?> wildcardClass13 = helpFormatter0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test069");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultLongOptPrefix = " ";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test070");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", options6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test071");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.setArgName("usage: ");
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test072");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptSeparator("");
        helpFormatter0.setLeftPadding(1);
        helpFormatter0.setArgName("arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test073");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setSyntaxPrefix("usage: ");
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test074");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "-";
        int int7 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test075");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "--" + "'", str0, "--");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test076");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator4 = helpFormatter0.getOptionComparator();
        int int5 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(optionComparator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test077");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setNewLine(" ");
        helpFormatter0.setNewLine("usage: ");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test078");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getDescPadding();
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test079");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        helpFormatter0.setWidth(10);
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test080");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultDescPad = 74;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test081");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "-";
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter7, (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test082");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.setArgName("usage: ");
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str7 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test083");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator9 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertNull(optionComparator9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test084");
        org.apache.commons.cli.HelpFormatter.Builder builder0 = org.apache.commons.cli.HelpFormatter.builder();
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction1 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder2 = builder0.setShowDeprecated(optionFunction1);
        org.apache.commons.cli.HelpFormatter helpFormatter3 = builder2.get();
        org.apache.commons.cli.HelpFormatter.Builder builder5 = builder2.setShowDeprecated(false);
        java.lang.Class<?> wildcardClass6 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(helpFormatter3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test085");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str11 = helpFormatter0.getNewLine();
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator12 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertNull(optionComparator12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test086");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        int int4 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptSeparator("--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test087");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setNewLine(" ");
        helpFormatter0.setLeftPadding((int) '4');
        helpFormatter0.defaultLeftPad = 'a';
        int int17 = helpFormatter0.getWidth();
        java.lang.String str18 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test088");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.defaultNewLine = "--";
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test089");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getDescPadding();
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test090");
        org.apache.commons.cli.HelpFormatter.Builder builder0 = org.apache.commons.cli.HelpFormatter.builder();
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction1 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder2 = builder0.setShowDeprecated(optionFunction1);
        org.apache.commons.cli.HelpFormatter.Builder builder4 = builder0.setShowDeprecated(false);
        org.apache.commons.cli.HelpFormatter.Builder builder6 = builder0.setShowSince(false);
        org.apache.commons.cli.HelpFormatter helpFormatter7 = builder0.get();
        org.apache.commons.cli.HelpFormatter helpFormatter8 = builder0.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(helpFormatter7);
        org.junit.Assert.assertNotNull(helpFormatter8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test091");
        org.apache.commons.cli.HelpFormatter.Builder builder0 = org.apache.commons.cli.HelpFormatter.builder();
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction1 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder2 = builder0.setShowDeprecated(optionFunction1);
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction3 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder4 = builder0.setShowDeprecated(optionFunction3);
        org.apache.commons.cli.HelpFormatter.Builder builder6 = builder0.setShowSince(true);
        org.apache.commons.cli.HelpFormatter helpFormatter7 = builder0.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(helpFormatter7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test092");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setNewLine(" ");
        helpFormatter0.setWidth((int) (short) 10);
        helpFormatter0.defaultOptPrefix = "\r\n";
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test093");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLeftPadding((int) 'a');
        java.lang.String str3 = helpFormatter0.getLongOptSeparator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test094");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "--";
        helpFormatter0.setLeftPadding(0);
        helpFormatter0.defaultNewLine = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test095");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("");
        java.io.PrintWriter printWriter3 = null;
        org.apache.commons.cli.Options options5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter3, (int) (short) 0, options5, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test096");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getDescPadding();
        int int5 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test097");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setNewLine(" ");
        helpFormatter0.defaultArgName = "arg";
        int int15 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test098");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.setArgName("usage: ");
        int int5 = helpFormatter0.getDescPadding();
        int int6 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test099");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.setArgName("usage: ");
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test100");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setNewLine(" ");
        helpFormatter0.setLeftPadding((int) '4');
        helpFormatter0.defaultLeftPad = 'a';
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, 0, "hi!", "\r\n", options21, (int) ' ', (int) (byte) 1, " ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test101");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setLongOptSeparator("");
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.defaultOptPrefix = "hi!";
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test102");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
        helpFormatter0.setOptPrefix("-");
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test103");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.setArgName("hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test104");
        org.apache.commons.cli.HelpFormatter.Builder builder0 = org.apache.commons.cli.HelpFormatter.builder();
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction1 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder2 = builder0.setShowDeprecated(optionFunction1);
        org.apache.commons.cli.HelpFormatter.Builder builder4 = builder0.setShowDeprecated(false);
        org.apache.commons.cli.HelpFormatter.Builder builder6 = builder0.setShowSince(false);
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction7 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder8 = builder6.setShowDeprecated(optionFunction7);
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.HelpFormatter.Builder builder10 = builder8.setPrintWriter(printWriter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: printWriter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test105");
        org.apache.commons.cli.HelpFormatter.Builder builder0 = org.apache.commons.cli.HelpFormatter.builder();
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction1 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder2 = builder0.setShowDeprecated(optionFunction1);
        org.apache.commons.cli.HelpFormatter helpFormatter3 = builder2.get();
        org.apache.commons.cli.HelpFormatter.Builder builder5 = builder2.setShowDeprecated(false);
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction6 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder7 = builder2.setShowDeprecated(optionFunction6);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(helpFormatter3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test106");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.setArgName("usage: ");
        int int5 = helpFormatter0.getDescPadding();
        java.lang.String str6 = helpFormatter0.getLongOptSeparator();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test107");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter4 = null;
        org.apache.commons.cli.Options options7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter4, 100, "", options7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test108");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setLongOptSeparator("");
        int int13 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test109");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.setArgName("usage: ");
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test110");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "-";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test111");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultOptPrefix = "\r\n";
        helpFormatter0.setNewLine(" ");
        helpFormatter0.setArgName("usage: ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test112");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "--";
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test113");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "--";
        helpFormatter0.setLeftPadding(0);
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, (int) (byte) -1, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test114");
        org.apache.commons.cli.HelpFormatter.Builder builder0 = org.apache.commons.cli.HelpFormatter.builder();
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction1 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder2 = builder0.setShowDeprecated(optionFunction1);
        org.apache.commons.cli.HelpFormatter helpFormatter3 = builder2.get();
        org.apache.commons.cli.HelpFormatter helpFormatter4 = builder2.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(helpFormatter3);
        org.junit.Assert.assertNotNull(helpFormatter4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test115");
        org.apache.commons.cli.HelpFormatter.Builder builder0 = org.apache.commons.cli.HelpFormatter.builder();
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction1 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder2 = builder0.setShowDeprecated(optionFunction1);
        org.apache.commons.cli.HelpFormatter helpFormatter3 = builder2.get();
        helpFormatter3.defaultOptPrefix = "\r\n";
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(helpFormatter3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test116");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter5 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter5.setSyntaxPrefix("");
        java.lang.String str8 = helpFormatter5.defaultSyntaxPrefix;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator9 = helpFormatter5.getOptionComparator();
        helpFormatter0.setOptionComparator(optionComparator9);
        helpFormatter0.defaultNewLine = " ";
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionComparator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test117");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.setArgName("usage: ");
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str7 = helpFormatter0.getLongOptSeparator();
        helpFormatter0.setWidth((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test118");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = (byte) 0;
        helpFormatter0.setLongOptSeparator("arg");
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test119");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("");
        java.io.PrintWriter printWriter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter3, (int) (byte) 1, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_020_Regression0.test120");
        org.apache.commons.cli.HelpFormatter.Builder builder0 = org.apache.commons.cli.HelpFormatter.builder();
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction1 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder2 = builder0.setShowDeprecated(optionFunction1);
        org.apache.commons.cli.HelpFormatter.Builder builder4 = builder0.setShowDeprecated(false);
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction5 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder6 = builder0.setShowDeprecated(optionFunction5);
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction7 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder8 = builder6.setShowDeprecated(optionFunction7);
        org.apache.commons.cli.HelpFormatter helpFormatter9 = builder6.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(helpFormatter9);
    }
}

