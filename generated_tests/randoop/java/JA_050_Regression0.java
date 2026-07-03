import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_050_Regression0 {

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
            System.out.format("%n%s%n", "JA_050_Regression0.test01");
        java.lang.String str0 = org.apache.commons.cli.HelpFormatter.DEFAULT_OPT_PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-" + "'", str0, "-");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test03");
        int int0 = org.apache.commons.cli.HelpFormatter.DEFAULT_LEFT_PAD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test05");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLeftPadding((int) 'a');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test06");
        int int0 = org.apache.commons.cli.HelpFormatter.DEFAULT_WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 74 + "'", int0 == 74);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test08");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test09");
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test13");
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test14");
        org.apache.commons.cli.HelpFormatter.Builder builder0 = org.apache.commons.cli.HelpFormatter.builder();
        java.util.function.Function<org.apache.commons.cli.Option, java.lang.String> optionFunction1 = null;
        org.apache.commons.cli.HelpFormatter.Builder builder2 = builder0.setShowDeprecated(optionFunction1);
        org.apache.commons.cli.HelpFormatter.Builder builder4 = builder0.setShowDeprecated(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test15");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.setArgName("usage: ");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test16");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.defaultOptPrefix = "--";
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test17");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultWidth = (short) 100;
        java.util.Comparator<org.apache.commons.cli.Option> optionComparator5 = null;
        helpFormatter0.setOptionComparator(optionComparator5);
        helpFormatter0.setArgName("--");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test20");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "usage: " + "'", str1, "usage: ");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test21");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setNewLine("-");
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_050_Regression0.test22");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("");
        int int3 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }
}

