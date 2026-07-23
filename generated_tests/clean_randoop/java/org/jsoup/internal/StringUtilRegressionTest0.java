package org.jsoup.internal;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringUtilRegressionTest0 {

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
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0001");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0002");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder0);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0003");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0004");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0005");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0006");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean8 = org.jsoup.internal.StringUtil.in("hi!", strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0007");
        boolean boolean1 = org.jsoup.internal.StringUtil.isHexDigit('a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0008");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuilder.appendCodePoint(int)\" because \"accum\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0009");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuilder.length()\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0010");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAsciiLetter('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jsoup.internal.StringUtil.padding((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: width must be >= 0");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0012");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0013");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0014");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0015");
        boolean boolean1 = org.jsoup.internal.StringUtil.isDigit(' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0016");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAsciiLetter('a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0017");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0018");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0019");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0020");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0021");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0022");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline(" ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0023");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0024");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Class<?> wildcardClass3 = stringJoiner1.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0025");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAsciiLetter('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0026");
        boolean boolean1 = org.jsoup.internal.StringUtil.isHexDigit('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0027");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.internal.StringUtil.join(strArray0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0028");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0029");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0030");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0031");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0032");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0033");
        boolean boolean1 = org.jsoup.internal.StringUtil.isHexDigit(' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0034");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0035");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0036");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.lang.Class<?> wildcardClass12 = stringJoiner1.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0037");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0038");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          " + "'", str1, "          ");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0039");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0040");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("     ");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0041");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0042");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric(" ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0043");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0044");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0045");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.lang.String str12 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        java.lang.Class<?> wildcardClass13 = stringBuilder7.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0046");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("          ", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0047");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("hi!");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0048");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0049");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0050");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "          ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:           ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0051");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0052");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0053");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0054");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.internal.StringUtil.borrowBuilder();
        java.lang.Class<?> wildcardClass1 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0055");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0056");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0057");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0058");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0059");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        stringJoiner1.sb = stringBuilder4;
        java.lang.String str9 = stringJoiner1.complete();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = stringJoiner1.complete();
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
// flaky "1) test0059(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0060");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", false);
        java.lang.Class<?> wildcardClass6 = stringBuilder2.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0061");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAsciiLetter(' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0062");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0063");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0064");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0065");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0066");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              " + "'", str1, "                              ");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0067");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.internal.StringUtil.in(" ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"haystack\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0068");
        boolean boolean1 = org.jsoup.internal.StringUtil.isDigit('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0069");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0070");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0071");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0072");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0073");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0074");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              " + "'", str1, "                              ");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0075");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0076");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0077");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0078");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0079");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("", "                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0080");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii(" ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0081");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0082");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) '4', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0083");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0084");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0085");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("          ", "     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0086");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(10, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0087");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              " + "'", str1, "                              ");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0088");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0089");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0090");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0091");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("null-1.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0092");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("                              ");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0093");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(100, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0094");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) 'a', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0095");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.internal.StringUtil.in("     ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"haystack\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0096");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(0, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0097");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0098");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0099");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        stringJoiner1.sb = stringBuilder4;
        java.lang.String str9 = stringJoiner1.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder12 = stringJoiner11.sb;
        java.lang.Object obj13 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = stringJoiner11.add(obj13);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder17 = stringJoiner16.sb;
        java.lang.String str18 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder17);
        stringJoiner11.sb = stringBuilder17;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = stringJoiner1.append((java.lang.Object) stringBuilder17);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner14);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null" + "'", str18, "null");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0100");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0101");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0102");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0103");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0104");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("     ", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0105");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0106");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0107");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.String str2 = stringJoiner1.complete();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.append((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0108");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("                              ", "10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0109");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("                                                                                                    ");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0110");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0111");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0112");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", false);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0113");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        java.lang.String str6 = stringJoiner1.complete();
        java.lang.Class<?> wildcardClass7 = stringJoiner1.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0114");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0115");
        boolean boolean1 = org.jsoup.internal.StringUtil.isHexDigit('4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0116");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("10", "null-1.0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0117");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("10");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0118");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 0, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0119");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0120");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("                                                                                                 ", "          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0121");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0122");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0123");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0124");
        boolean boolean1 = org.jsoup.internal.StringUtil.isDigit('a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0125");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              " + "'", str1, "                              ");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0126");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("                                                                                                 ", "                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0127");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0128");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0129");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0130");
        boolean boolean1 = org.jsoup.internal.StringUtil.isDigit('#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0131");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!", "null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.internal.StringUtil.padding((-1), 100);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: width must be >= 0");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0133");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("null-1.0 ", "     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0134");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        java.lang.StringBuilder stringBuilder18 = stringJoiner13.sb;
        java.lang.StringBuilder stringBuilder19 = stringJoiner13.sb;
        java.lang.String str20 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder19);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
// flaky "2) test0134(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0135");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0136");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!                              hi!", "          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0137");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("null-1.0 ");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0138");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("                                                                                                 ", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0139");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.String str2 = stringJoiner1.complete();
        boolean boolean3 = stringJoiner1.first;
        java.lang.Class<?> wildcardClass4 = stringJoiner1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0140");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "                              ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:                               ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0141");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0142");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0143");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0144");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0145");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "null");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: null");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0146");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        java.lang.String str6 = stringJoiner1.complete();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("", strArray11);
        java.lang.Class<?> wildcardClass13 = strArray11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = stringJoiner1.append((java.lang.Object) strArray11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0147");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0148");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder6);
        stringJoiner1.sb = stringBuilder6;
        java.lang.Class<?> wildcardClass9 = stringBuilder6.getClass();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: width must be >= 0");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0150");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0151");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!                              hi!", "null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0152");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0153");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.StringBuilder stringBuilder5 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder8 = stringJoiner7.sb;
        java.lang.String str9 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder8);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder8);
        stringJoiner1.sb = stringBuilder8;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder8);
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "3) test0153(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder5);
// flaky "1) test0153(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
// flaky "1) test0153(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0154");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("     ");
        java.lang.Class<?> wildcardClass2 = stringJoiner1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0155");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0156");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0157");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: width must be >= 0");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0159");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str2 = stringJoiner1.separator;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.internal.StringUtil.inSorted("          ", strArray8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner1.append((java.lang.Object) "          ");
        java.lang.String str12 = stringJoiner1.complete();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "          " + "'", str12, "          ");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0160");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0161");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        java.lang.String str8 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder7);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        stringJoiner1.sb = stringBuilder7;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0162");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0163");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: width must be >= 0");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0164");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("     ");
        java.lang.String str2 = stringJoiner1.complete();
        java.lang.Class<?> wildcardClass3 = stringJoiner1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0165");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0166");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray11);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("                              ", strArray11);
        boolean boolean16 = org.jsoup.internal.StringUtil.inSorted("     ", strArray11);
        java.lang.String str18 = org.jsoup.internal.StringUtil.join(strArray11, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str18, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0167");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("     ");
        java.lang.String str2 = stringJoiner1.complete();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = stringJoiner1.complete();
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0168");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("                                                                                                 ", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0169");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0170");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0171");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "     ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:      ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0172");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("null", "null-1.0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0173");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.String str2 = stringJoiner1.complete();
        boolean boolean3 = stringJoiner1.first;
        java.lang.String str4 = stringJoiner1.separator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0174");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0175");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0176");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.append(obj5);
        java.lang.Class<?> wildcardClass7 = stringJoiner6.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "nullnull");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0177");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0178");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: width must be >= 0");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0179");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0180");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
// flaky "4) test0180(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0181");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("10", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0182");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!" + "'", str1, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0183");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0184");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0185");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(100, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0186");
        java.lang.String[] strArray0 = org.jsoup.internal.StringUtil.padding;
        java.lang.String str2 = org.jsoup.internal.StringUtil.join(strArray0, "10");
        java.lang.Class<?> wildcardClass3 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    " + "'", str2, "10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0187");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.internal.StringUtil.inSorted(" ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"haystack\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0188");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("", "          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0189");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi! hi!null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0190");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("null                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0191");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0192");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank(" ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0193");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0194");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0195");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("                                                                                                    ");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0196");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("hi! hi!null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0197");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0198");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        java.lang.String str6 = stringJoiner1.complete();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner1.add(obj7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0199");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0200");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0201");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0202");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0203");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 " + "'", str1, "10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0204");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("", "null                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0205");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi!                              hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!" + "'", str1, "hi! hi!");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0206");
        org.jsoup.internal.StringUtil stringUtil0 = new org.jsoup.internal.StringUtil();
        java.lang.Class<?> wildcardClass1 = stringUtil0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0207");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0208");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str2 = stringJoiner1.separator;
        boolean boolean3 = stringJoiner1.first;
        stringJoiner1.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder10 = stringJoiner9.sb;
        java.lang.String str11 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder10);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder10);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder10);
        stringJoiner7.sb = stringBuilder10;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder10);
        java.lang.String str16 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder10);
        stringJoiner1.sb = stringBuilder10;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder10, "null-1.0 ", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "null-1.0 ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0209");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0210");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0211");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve(" ", "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0212");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("     ", "10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0213");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("hi!", strArray8);
        java.lang.String str11 = org.jsoup.internal.StringUtil.join(strArray8, " ");
        boolean boolean12 = org.jsoup.internal.StringUtil.in(" ", strArray8);
        java.lang.String str14 = org.jsoup.internal.StringUtil.join(strArray8, "                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "5) test0213(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "     " + "'", str11, "     ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str14, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0214");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0215");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0216");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0217");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean6 = org.jsoup.internal.StringUtil.in("hi!", strArray5);
        boolean boolean7 = org.jsoup.internal.StringUtil.in(" ", strArray5);
        boolean boolean8 = org.jsoup.internal.StringUtil.inSorted("     ", strArray5);
        java.lang.String str10 = org.jsoup.internal.StringUtil.join(strArray5, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!                                                                                                    hi!" + "'", str10, "hi!                                                                                                    hi!");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0218");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0219");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        boolean boolean18 = stringJoiner13.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        stringJoiner20.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder26 = stringJoiner25.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder26, "", false);
        stringJoiner20.sb = stringBuilder26;
        java.lang.String str31 = stringJoiner20.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = stringJoiner13.append((java.lang.Object) stringJoiner20);
        java.lang.String str33 = stringJoiner32.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder36 = stringJoiner35.sb;
        java.lang.StringBuilder stringBuilder37 = stringJoiner35.sb;
        boolean boolean38 = stringJoiner35.first;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner39 = stringJoiner32.add((java.lang.Object) stringJoiner35);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
// flaky "6) test0219(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0220");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.internal.StringUtil.inSorted("null                ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"haystack\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0221");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.internal.StringUtil.join(strArray0, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0222");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!nullnullhi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0223");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", false);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        java.lang.Class<?> wildcardClass7 = stringBuilder2.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0224");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0225");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0226");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi! hi!null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0227");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str2 = stringJoiner1.separator;
        java.lang.Class<?> wildcardClass3 = stringJoiner1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0228");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0229");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        java.lang.StringBuilder stringBuilder18 = stringJoiner13.sb;
        java.lang.StringBuilder stringBuilder19 = stringJoiner13.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner13.append((java.lang.Object) 10.0d);
        stringJoiner13.first = false;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "null10.0");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "null10.0");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "null10.0");
        org.junit.Assert.assertNotNull(stringJoiner21);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0230");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean13 = org.jsoup.internal.StringUtil.in("hi!", strArray12);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray12);
        boolean boolean15 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray12);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("                              ", strArray12);
        boolean boolean17 = org.jsoup.internal.StringUtil.inSorted("     ", strArray12);
        boolean boolean18 = org.jsoup.internal.StringUtil.in("hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    ", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0231");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0232");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0233");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "hi!                              hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0234");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.lang.String str12 = stringJoiner1.complete();
        java.lang.Class<?> wildcardClass13 = stringJoiner1.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0235");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.internal.StringUtil.join(strArray0, "10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0236");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0237");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! " + "'", str1, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0238");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0239");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0240");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.StringBuilder stringBuilder5 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder8 = stringJoiner7.sb;
        java.lang.String str9 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder8);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder8);
        stringJoiner1.sb = stringBuilder8;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder8, "", true);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder8);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0241");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder5 = stringJoiner4.sb;
        stringJoiner1.sb = stringBuilder5;
        java.lang.Class<?> wildcardClass7 = stringJoiner1.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0242");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0243");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        java.lang.StringBuilder stringBuilder18 = stringJoiner13.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder18);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0244");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0245");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0246");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0247");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) 'a', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0248");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          " + "'", str1, "          ");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0249");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0250");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:                                                                                                  ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0251");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("hi!nullnullhi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0252");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner1.first = true;
        java.lang.StringBuilder stringBuilder4 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        stringJoiner6.first = true;
        java.lang.String str10 = stringJoiner6.separator;
        stringJoiner6.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner14.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder20 = stringJoiner19.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder20, "", false);
        java.lang.String str24 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder20);
        stringJoiner14.sb = stringBuilder20;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = stringJoiner6.append((java.lang.Object) stringBuilder20);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder29 = stringJoiner28.sb;
        java.lang.String str30 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder29);
        java.lang.Class<?> wildcardClass31 = stringBuilder29.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = stringJoiner6.add((java.lang.Object) wildcardClass31);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner1.append((java.lang.Object) stringJoiner32);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.String str36 = stringJoiner35.separator;
        java.lang.StringBuilder stringBuilder37 = stringJoiner35.sb;
        stringJoiner32.sb = stringBuilder37;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), " class java.lang.StringBuilder");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(stringJoiner26);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0253");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0254");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0255");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!nullnullhi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0256");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0257");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "null-1.010");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: null-1.010");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0258");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!                                                                                                    hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0259");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "null                ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: null                ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0260");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0261");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0262");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        java.lang.String str8 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder7);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        stringJoiner1.sb = stringBuilder7;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = stringJoiner13.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str21 = stringJoiner20.separator;
        boolean boolean22 = stringJoiner20.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner18.append((java.lang.Object) stringJoiner20);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = stringJoiner1.append((java.lang.Object) stringJoiner23);
        stringJoiner24.first = true;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
// flaky "7) test0262(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner24);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0263");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.StringBuilder stringBuilder3 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        stringJoiner5.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder11 = stringJoiner10.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder11, "", false);
        stringJoiner5.sb = stringBuilder11;
        stringJoiner1.sb = stringBuilder11;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0264");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!                                                                                                    hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0265");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = stringJoiner1.separator;
        java.lang.String str4 = stringJoiner1.complete();
        boolean boolean5 = stringJoiner1.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder8 = stringJoiner7.sb;
        stringJoiner7.first = true;
        java.lang.String str11 = stringJoiner7.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = stringJoiner13.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder21, "                                                                                                 ", false);
        stringJoiner13.sb = stringBuilder21;
        stringJoiner7.sb = stringBuilder21;
        boolean boolean27 = stringJoiner7.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder30 = stringJoiner29.sb;
        java.lang.Object obj31 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = stringJoiner29.add(obj31);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = stringJoiner29.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner36 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str37 = stringJoiner36.separator;
        boolean boolean38 = stringJoiner36.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner39 = stringJoiner34.append((java.lang.Object) stringJoiner36);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = stringJoiner7.add((java.lang.Object) stringJoiner34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = stringJoiner1.add((java.lang.Object) stringJoiner40);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "null-1.0");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertNotNull(stringJoiner34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " " + "'", str37, " ");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(stringJoiner39);
        org.junit.Assert.assertNotNull(stringJoiner40);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0266");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0267");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0268");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0269");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0270");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!nullnullhi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0271");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.append(obj5);
        boolean boolean7 = stringJoiner6.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "nullnull");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0272");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.lang.String str12 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "                              ", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
// flaky "8) test0272(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nullnull" + "'", str12, "nullnull");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0273");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.String str2 = stringJoiner1.complete();
        boolean boolean3 = stringJoiner1.first;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = stringJoiner1.append((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0274");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("     ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner3.add(obj5);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner3.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str11 = stringJoiner10.separator;
        boolean boolean12 = stringJoiner10.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = stringJoiner8.append((java.lang.Object) stringJoiner10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder16 = stringJoiner15.sb;
        java.lang.String str17 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder16);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder16);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder16, "          ", true);
        stringJoiner13.sb = stringBuilder16;
        stringJoiner1.sb = stringBuilder16;
        boolean boolean24 = stringJoiner1.first;
        java.lang.Class<?> wildcardClass25 = stringJoiner1.getClass();
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stringJoiner13);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0275");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0276");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0277");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0278");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! " + "'", str1, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0279");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean7 = org.jsoup.internal.StringUtil.in("", strArray6);
        boolean boolean8 = org.jsoup.internal.StringUtil.inSorted("          ", strArray6);
        boolean boolean9 = org.jsoup.internal.StringUtil.in("     ", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0280");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!", "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0281");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        stringJoiner6.first = false;
        boolean boolean14 = stringJoiner6.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0282");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        stringJoiner3.first = true;
        boolean boolean7 = stringJoiner3.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner1.append((java.lang.Object) boolean7);
        java.lang.Class<?> wildcardClass9 = stringJoiner1.getClass();
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0283");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("     ", "null-1.010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0284");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 10, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0285");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0286");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        java.lang.String str5 = stringJoiner1.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder8 = stringJoiner7.sb;
        java.lang.Object obj9 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = stringJoiner7.add(obj9);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = stringJoiner7.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder15, "                                                                                                 ", false);
        stringJoiner7.sb = stringBuilder15;
        stringJoiner1.sb = stringBuilder15;
        boolean boolean21 = stringJoiner1.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder24 = stringJoiner23.sb;
        java.lang.Object obj25 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = stringJoiner23.add(obj25);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = stringJoiner23.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str31 = stringJoiner30.separator;
        boolean boolean32 = stringJoiner30.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner28.append((java.lang.Object) stringJoiner30);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = stringJoiner1.add((java.lang.Object) stringJoiner28);
        java.lang.Class<?> wildcardClass35 = stringJoiner34.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertNotNull(stringJoiner10);
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertNotNull(stringJoiner26);
        org.junit.Assert.assertNotNull(stringJoiner28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " " + "'", str31, " ");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertNotNull(stringJoiner34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0287");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0288");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder8 = stringJoiner7.sb;
        java.lang.StringBuilder stringBuilder9 = stringJoiner7.sb;
        stringJoiner1.sb = stringBuilder9;
        stringJoiner1.first = true;
        java.lang.String str13 = stringJoiner1.complete();
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "9) test0288(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "     ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0289");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) '#', 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0290");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        java.lang.StringBuilder stringBuilder18 = stringJoiner13.sb;
        boolean boolean19 = stringJoiner13.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0291");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0292");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi! hi!null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!null" + "'", str1, "hi! hi!null");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0293");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("10");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str4 = stringJoiner3.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        stringJoiner6.first = true;
        boolean boolean10 = stringJoiner6.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder13 = stringJoiner12.sb;
        java.lang.StringBuilder stringBuilder14 = stringJoiner12.sb;
        stringJoiner6.sb = stringBuilder14;
        stringJoiner3.sb = stringBuilder14;
        stringJoiner1.sb = stringBuilder14;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder14, "null-1.010", true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "null-1.010");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "null-1.010");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0294");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0295");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0296");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        java.lang.String str8 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder7);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        stringJoiner1.sb = stringBuilder7;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = stringJoiner13.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str21 = stringJoiner20.separator;
        boolean boolean22 = stringJoiner20.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner18.append((java.lang.Object) stringJoiner20);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = stringJoiner1.append((java.lang.Object) stringJoiner23);
        boolean boolean25 = stringJoiner23.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder28 = stringJoiner27.sb;
        java.lang.Object obj29 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = stringJoiner27.add(obj29);
        java.lang.StringBuilder stringBuilder31 = stringJoiner27.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder34 = stringJoiner33.sb;
        java.lang.String str35 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder34);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder34);
        stringJoiner27.sb = stringBuilder34;
        stringJoiner23.sb = stringBuilder34;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder41 = stringJoiner40.sb;
        stringJoiner40.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner45 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder46 = stringJoiner45.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder46, "", false);
        stringJoiner40.sb = stringBuilder46;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner52 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder53 = stringJoiner52.sb;
        java.lang.String str54 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder53);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder53, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder53, "     ", true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner61 = stringJoiner40.add((java.lang.Object) "     ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner63 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder64 = stringJoiner63.sb;
        stringJoiner63.first = true;
        java.lang.String str67 = stringJoiner63.complete();
        java.lang.String str68 = stringJoiner63.separator;
        java.lang.StringBuilder stringBuilder69 = stringJoiner63.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner70 = stringJoiner40.add((java.lang.Object) stringBuilder69);
        stringJoiner70.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner73 = stringJoiner23.add((java.lang.Object) false);
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "10) test0296(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "     nullfalse");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
// flaky "2) test0296(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder7.toString(), "     nullfalse");
// flaky "2) test0296(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
// flaky "1) test0296(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder14.toString(), "     nullfalse");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder28);
// flaky "1) test0296(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder28.toString(), "     nullfalse");
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(stringBuilder31);
// flaky "1) test0296(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder31.toString(), "     nullfalse");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "     nullfalse");
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "     nullfalse");
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "     nullfalse");
        org.junit.Assert.assertNotNull(stringBuilder53);
        org.junit.Assert.assertEquals(stringBuilder53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(stringJoiner61);
        org.junit.Assert.assertNotNull(stringBuilder64);
        org.junit.Assert.assertEquals(stringBuilder64.toString(), "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNull(stringBuilder69);
        org.junit.Assert.assertNotNull(stringJoiner70);
        org.junit.Assert.assertNotNull(stringJoiner73);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0297");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0298");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "null", false);
        java.lang.String str9 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0299");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0300");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null" + "'", str1, "null");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0301");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0302");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "nullnull", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "nullnull");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0303");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        java.lang.Class<?> wildcardClass2 = stringJoiner1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0304");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder8 = stringJoiner7.sb;
        java.lang.StringBuilder stringBuilder9 = stringJoiner7.sb;
        stringJoiner1.sb = stringBuilder9;
        stringJoiner1.first = true;
        stringJoiner1.first = false;
        java.lang.String str15 = stringJoiner1.complete();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
// flaky "11) test0304(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0305");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.String str15 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder14);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder14, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder14, "     ", true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = stringJoiner1.add((java.lang.Object) "     ");
        java.lang.StringBuilder stringBuilder23 = stringJoiner22.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder23);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0306");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("10", "10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0307");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 1, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0308");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.010");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0309");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0310");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        stringJoiner6.first = false;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector10 = org.jsoup.internal.StringUtil.joining(" ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.add((java.lang.Object) " ");
        boolean boolean12 = stringJoiner11.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        stringJoiner11.sb = stringBuilder15;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder19 = stringJoiner18.sb;
        java.lang.String str20 = stringJoiner18.separator;
        java.lang.StringBuilder stringBuilder21 = stringJoiner18.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = stringJoiner11.append((java.lang.Object) stringJoiner18);
        java.lang.String str23 = stringJoiner18.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = stringJoiner18.append((java.lang.Object) 0);
        java.lang.String str26 = stringJoiner25.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(charSequenceCollector10);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "0");
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(stringJoiner25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0311");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0312");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0313");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean5 = org.jsoup.internal.StringUtil.in("hi!", strArray4);
        boolean boolean6 = org.jsoup.internal.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray4);
        java.lang.String str8 = org.jsoup.internal.StringUtil.join(strArray4, "hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!hi!" + "'", str8, "hi!hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!hi!");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0314");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0315");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!" + "'", str1, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0316");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        boolean boolean18 = stringJoiner13.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        stringJoiner20.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder26 = stringJoiner25.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder26, "", false);
        stringJoiner20.sb = stringBuilder26;
        java.lang.String str31 = stringJoiner20.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = stringJoiner13.append((java.lang.Object) stringJoiner20);
        java.lang.String str33 = stringJoiner32.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder36 = stringJoiner35.sb;
        java.lang.Object obj37 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = stringJoiner35.add(obj37);
        java.lang.StringBuilder stringBuilder39 = stringJoiner35.sb;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = stringJoiner32.add((java.lang.Object) stringBuilder39);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner38);
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "null");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0317");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0318");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi!hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!" + "'", str1, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0319");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        java.lang.String str8 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        stringJoiner1.sb = stringBuilder7;
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "12) test0319(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
// flaky "3) test0319(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0320");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "hi!hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0321");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "hi!nullnullhi!                              hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!nullnullhi!                              hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0322");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0323");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0324");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0325");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0326");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0327");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", "hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0328");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0329");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              " + "'", str1, "                              ");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0330");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
// flaky "13) test0330(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!" + "'", str1, "nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0331");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 100, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0332");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        boolean boolean18 = stringJoiner13.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        stringJoiner20.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder26 = stringJoiner25.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder26, "", false);
        stringJoiner20.sb = stringBuilder26;
        java.lang.String str31 = stringJoiner20.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = stringJoiner13.append((java.lang.Object) stringJoiner20);
        java.lang.Class<?> wildcardClass33 = stringJoiner20.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0333");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("null-1.0 null                ");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0334");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ", "nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0335");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0336");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("nullnull");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nullnull" + "'", str1, "nullnull");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0337");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0338");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0339");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0340");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:                                                                                                     ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0341");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0342");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0343");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ", "null-1.0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0344");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        java.lang.Object obj8 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = stringJoiner6.add(obj8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str14 = stringJoiner13.separator;
        boolean boolean15 = stringJoiner13.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder19 = stringJoiner18.sb;
        java.lang.Object obj20 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner18.add(obj20);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = stringJoiner16.append((java.lang.Object) stringJoiner18);
        java.lang.StringBuilder stringBuilder23 = stringJoiner16.sb;
        stringJoiner1.sb = stringBuilder23;
        java.lang.StringBuilder stringBuilder25 = stringJoiner1.sb;
        java.lang.Class<?> wildcardClass26 = stringJoiner1.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertNotNull(stringJoiner9);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0345");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("nullnull");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0346");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0347");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        stringJoiner1.sb = stringBuilder4;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder4, "hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0348");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        java.lang.StringBuilder stringBuilder18 = stringJoiner13.sb;
        java.lang.String str19 = stringJoiner13.complete();
        java.lang.String str20 = stringJoiner13.separator;
        stringJoiner13.first = false;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0349");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0350");
        java.lang.String[] strArray3 = new java.lang.String[] { "10" };
        boolean boolean4 = org.jsoup.internal.StringUtil.in("", strArray3);
        boolean boolean5 = org.jsoup.internal.StringUtil.in("hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0351");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0352");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0353");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("null                ", "nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0354");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder20 = stringJoiner19.sb;
        java.lang.Class<?> wildcardClass21 = stringBuilder20.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = stringJoiner13.add((java.lang.Object) wildcardClass21);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "nullclass java.lang.StringBuilder");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(stringJoiner22);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0355");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0356");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "     ", true);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        java.lang.Class<?> wildcardClass11 = stringBuilder2.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
// flaky "14) test0356(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!" + "'", str3, "hi! hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0357");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str1, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0358");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0359");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.lang.StringBuilder stringBuilder12 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder12);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0360");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0361");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner1.first = true;
        java.lang.StringBuilder stringBuilder4 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder4, "                              ", true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0362");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        boolean boolean3 = stringJoiner1.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0363");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!" + "'", str1, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0364");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.String str2 = stringJoiner1.separator;
        java.lang.StringBuilder stringBuilder3 = stringJoiner1.sb;
        java.lang.String str4 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder3);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder3, "nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0365");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0366");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!", "hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0367");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0368");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) ' ', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0369");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("10", strArray11);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("          ", strArray11);
        java.lang.String str17 = org.jsoup.internal.StringUtil.join(strArray11, "nullhi!                              hi!");
        boolean boolean18 = org.jsoup.internal.StringUtil.in("hi!nullnullhi!                              hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "15) test0369(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!" + "'", str17, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0370");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner1.append((java.lang.Object) 10);
        java.lang.String str9 = stringJoiner8.separator;
        java.lang.String str10 = stringJoiner8.separator;
        java.lang.String str11 = stringJoiner8.complete();
        java.lang.Class<?> wildcardClass12 = stringJoiner8.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null-1.010" + "'", str11, "null-1.010");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0371");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "hi! hi!null");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0372");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        java.lang.String str8 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder7);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        stringJoiner1.sb = stringBuilder7;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = stringJoiner13.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str21 = stringJoiner20.separator;
        boolean boolean22 = stringJoiner20.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner18.append((java.lang.Object) stringJoiner20);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = stringJoiner1.append((java.lang.Object) stringJoiner23);
        boolean boolean25 = stringJoiner23.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder28 = stringJoiner27.sb;
        java.lang.Object obj29 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = stringJoiner27.add(obj29);
        java.lang.StringBuilder stringBuilder31 = stringJoiner27.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder34 = stringJoiner33.sb;
        java.lang.String str35 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder34);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder34);
        stringJoiner27.sb = stringBuilder34;
        stringJoiner23.sb = stringBuilder34;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder34, "     ", false);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder34, "nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
// flaky "16) test0372(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), " nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0373");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        java.lang.String str8 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder7);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        stringJoiner1.sb = stringBuilder7;
        stringJoiner1.first = true;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!10" + "'", str8, " nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0374");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        stringJoiner1.sb = stringBuilder4;
        boolean boolean9 = stringJoiner1.first;
        java.lang.Object obj10 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner1.add(obj10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.String str15 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder14);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder14);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder14, "          ", true);
        java.lang.String str20 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder14);
        java.lang.String str21 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder14);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = stringJoiner11.append((java.lang.Object) str21);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder25 = stringJoiner24.sb;
        java.lang.Object obj26 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = stringJoiner24.add(obj26);
        java.lang.StringBuilder stringBuilder28 = stringJoiner24.sb;
        java.lang.StringBuilder stringBuilder29 = stringJoiner24.sb;
        java.lang.String str30 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder29);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder29);
        stringJoiner22.sb = stringBuilder29;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "null" + "'", str30, "null");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0375");
        java.lang.String[] strArray2 = new java.lang.String[] { "10" };
        boolean boolean3 = org.jsoup.internal.StringUtil.in("", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0376");
        java.lang.String[] strArray4 = new java.lang.String[] { " nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!10", "10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ", "null                " };
        boolean boolean5 = org.jsoup.internal.StringUtil.inSorted("null", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { " nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!10", "10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ", "null                " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0377");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0378");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("nullnull");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0379");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jsoup.internal.StringUtil.padding((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: width must be >= 0");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0380");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("                                                                                                 ");
        java.lang.Class<?> wildcardClass2 = charSequenceCollector1.getClass();
        org.junit.Assert.assertNotNull(charSequenceCollector1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0381");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.String str15 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder14);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder14);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder14, "          ", true);
        stringJoiner11.sb = stringBuilder14;
        boolean boolean21 = stringJoiner11.first;
        java.lang.String str22 = stringJoiner11.complete();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0382");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0383");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean6 = org.jsoup.internal.StringUtil.in("hi!", strArray5);
        boolean boolean7 = org.jsoup.internal.StringUtil.in(" ", strArray5);
        boolean boolean8 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray5);
        java.lang.String str10 = org.jsoup.internal.StringUtil.join(strArray5, "null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        java.lang.String str12 = org.jsoup.internal.StringUtil.join(strArray5, "null-1.0 null                ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!null-1.0 null                hi!" + "'", str12, "hi!null-1.0 null                hi!");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0384");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.lang.String str12 = stringJoiner1.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = stringJoiner1.add((java.lang.Object) "");
        boolean boolean15 = stringJoiner1.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringJoiner14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0385");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        java.lang.String str5 = stringJoiner1.separator;
        stringJoiner1.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder10 = stringJoiner9.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = stringJoiner9.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder15, "", false);
        java.lang.String str19 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        stringJoiner9.sb = stringBuilder15;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner1.append((java.lang.Object) stringBuilder15);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder15, "                                                                                                    ", false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), " ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), " ");
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), " ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(stringJoiner21);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0386");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder20 = stringJoiner19.sb;
        java.lang.StringBuilder stringBuilder21 = stringJoiner19.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder21);
        stringJoiner17.sb = stringBuilder21;
        java.lang.String str24 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder21);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
// flaky "17) test0386(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder14.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0387");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0388");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0389");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!nullnullhi!                              hi!", "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0390");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        stringJoiner6.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder16 = stringJoiner15.sb;
        java.lang.StringBuilder stringBuilder17 = stringJoiner15.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder17);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder17);
        stringJoiner6.sb = stringBuilder17;
        stringJoiner6.first = true;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0391");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.internal.StringUtil.in("nullhi!                              hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"haystack\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0392");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.internal.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"haystack\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0393");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0394");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0395");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector13 = org.jsoup.internal.StringUtil.joining("          ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = stringJoiner1.add((java.lang.Object) charSequenceCollector13);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder17 = stringJoiner16.sb;
        java.lang.Object obj18 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = stringJoiner16.add(obj18);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner16.add((java.lang.Object) (-1.0d));
        stringJoiner21.first = false;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector25 = org.jsoup.internal.StringUtil.joining(" ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = stringJoiner21.add((java.lang.Object) " ");
        boolean boolean27 = stringJoiner26.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder30 = stringJoiner29.sb;
        stringJoiner26.sb = stringBuilder30;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder34 = stringJoiner33.sb;
        java.lang.String str35 = stringJoiner33.separator;
        java.lang.StringBuilder stringBuilder36 = stringJoiner33.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner37 = stringJoiner26.append((java.lang.Object) stringJoiner33);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = stringJoiner14.append((java.lang.Object) stringJoiner26);
        boolean boolean39 = stringJoiner14.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "18) test0395(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertNotNull(charSequenceCollector13);
        org.junit.Assert.assertNotNull(stringJoiner14);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner19);
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(charSequenceCollector25);
        org.junit.Assert.assertNotNull(stringJoiner26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner37);
        org.junit.Assert.assertNotNull(stringJoiner38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0396");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0397");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0398");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = stringJoiner1.append((java.lang.Object) "                                                                                                 ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        java.lang.Object obj7 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner5.add(obj7);
        java.lang.StringBuilder stringBuilder9 = stringJoiner5.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder12 = stringJoiner11.sb;
        java.lang.String str13 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder12);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder12);
        stringJoiner5.sb = stringBuilder12;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder12, "", true);
        java.lang.String str19 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder12);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = stringJoiner1.add((java.lang.Object) str19);
        java.lang.StringBuilder stringBuilder21 = stringJoiner1.sb;
        org.junit.Assert.assertNotNull(stringJoiner3);
        org.junit.Assert.assertNotNull(stringBuilder6);
// flaky "19) test0398(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertNotNull(stringBuilder9);
// flaky "4) test0398(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
// flaky "3) test0398(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                 null" + "'", str13, "                                                                                                 null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringJoiner20);
        org.junit.Assert.assertNotNull(stringBuilder21);
// flaky "2) test0398(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0399");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("                                                                                                 null");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0400");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = stringJoiner1.append((java.lang.Object) "          ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner5.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder10 = stringJoiner9.sb;
        java.lang.String str11 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder10);
        stringJoiner5.sb = stringBuilder10;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder10, "                                                                                                 ", true);
        stringJoiner3.sb = stringBuilder10;
        stringJoiner3.first = false;
        org.junit.Assert.assertNotNull(stringJoiner3);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "          " + "'", str11, "          ");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0401");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("                                                                                                 null", "          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0402");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = stringJoiner1.separator;
        java.lang.StringBuilder stringBuilder4 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        java.lang.Object obj8 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = stringJoiner6.add(obj8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str14 = stringJoiner13.separator;
        boolean boolean15 = stringJoiner13.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder19 = stringJoiner18.sb;
        java.lang.Object obj20 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner18.add(obj20);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = stringJoiner16.append((java.lang.Object) stringJoiner18);
        stringJoiner18.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = stringJoiner1.add((java.lang.Object) true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder28 = stringJoiner27.sb;
        java.lang.Object obj29 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = stringJoiner27.add(obj29);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = stringJoiner27.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str35 = stringJoiner34.separator;
        boolean boolean36 = stringJoiner34.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner37 = stringJoiner32.append((java.lang.Object) stringJoiner34);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner39 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder40 = stringJoiner39.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner42 = stringJoiner39.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner44 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder45 = stringJoiner44.sb;
        java.lang.String str46 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder45);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder45);
        java.lang.String str48 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder45);
        stringJoiner39.sb = stringBuilder45;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner51 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder52 = stringJoiner51.sb;
        java.lang.Object obj53 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner54 = stringJoiner51.add(obj53);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner56 = stringJoiner51.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner58 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str59 = stringJoiner58.separator;
        boolean boolean60 = stringJoiner58.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner61 = stringJoiner56.append((java.lang.Object) stringJoiner58);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner62 = stringJoiner39.append((java.lang.Object) stringJoiner61);
        java.lang.Class<?> wildcardClass63 = stringJoiner39.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner64 = stringJoiner37.append((java.lang.Object) wildcardClass63);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner65 = stringJoiner25.add((java.lang.Object) stringJoiner37);
        java.lang.Object obj66 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner67 = stringJoiner25.add(obj66);
        boolean boolean68 = stringJoiner25.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertNotNull(stringJoiner9);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertNotNull(stringJoiner25);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " " + "'", str35, " ");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(stringJoiner37);
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner42);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertNotNull(stringJoiner54);
        org.junit.Assert.assertNotNull(stringJoiner56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + " " + "'", str59, " ");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(stringJoiner61);
        org.junit.Assert.assertNotNull(stringJoiner62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(stringJoiner64);
        org.junit.Assert.assertNotNull(stringJoiner65);
        org.junit.Assert.assertNotNull(stringJoiner67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0403");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean10 = org.jsoup.internal.StringUtil.in("hi!", strArray9);
        boolean boolean11 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray9);
        boolean boolean12 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray9);
        java.lang.String str14 = org.jsoup.internal.StringUtil.join(strArray9, "                                                                                                 ");
        java.lang.String str16 = org.jsoup.internal.StringUtil.join(strArray9, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        java.lang.Class<?> wildcardClass17 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!" + "'", str16, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0404");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "          ", true);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0405");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi!nullnullhi!                              hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!nullnullhi! hi!" + "'", str1, "hi!nullnullhi! hi!");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0406");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0407");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0408");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean5 = org.jsoup.internal.StringUtil.in("hi!", strArray4);
        boolean boolean6 = org.jsoup.internal.StringUtil.in(" ", strArray4);
        java.lang.String str8 = org.jsoup.internal.StringUtil.join(strArray4, "hi!null-1.0 null                hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0409");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("                                                                                                 ", "10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0410");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.String str15 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder14);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder14);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder14, "          ", true);
        stringJoiner11.sb = stringBuilder14;
        boolean boolean21 = stringJoiner11.first;
        boolean boolean22 = stringJoiner11.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = stringJoiner11.add((java.lang.Object) stringJoiner24);
        stringJoiner25.first = false;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
// flaky "20) test0410(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringJoiner25);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0411");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        java.lang.String str5 = stringJoiner1.separator;
        stringJoiner1.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder10 = stringJoiner9.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = stringJoiner9.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder15, "", false);
        java.lang.String str19 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        stringJoiner9.sb = stringBuilder15;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner1.append((java.lang.Object) stringBuilder15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder24 = stringJoiner23.sb;
        java.lang.String str25 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder24);
        java.lang.Class<?> wildcardClass26 = stringBuilder24.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = stringJoiner1.add((java.lang.Object) wildcardClass26);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean33 = org.jsoup.internal.StringUtil.in("", strArray32);
        java.lang.Class<?> wildcardClass34 = strArray32.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = stringJoiner27.append((java.lang.Object) wildcardClass34);
        java.lang.String str36 = stringJoiner35.complete();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(stringJoiner35);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0412");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector13 = org.jsoup.internal.StringUtil.joining("          ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = stringJoiner1.add((java.lang.Object) charSequenceCollector13);
        java.lang.Class<?> wildcardClass15 = charSequenceCollector13.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertNotNull(charSequenceCollector13);
        org.junit.Assert.assertNotNull(stringJoiner14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0413");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", false);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "hi! hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "hi! hi!");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0414");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0415");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0416");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0417");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              " + "'", str1, "                              ");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0418");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "                                                                                                 null");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:                                                                                                  null");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0419");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 ");
        java.lang.String str2 = stringJoiner1.complete();
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0420");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner3.add(obj5);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder9 = stringJoiner8.sb;
        java.lang.StringBuilder stringBuilder10 = stringJoiner8.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        java.lang.String str16 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder15);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder15);
        stringJoiner12.sb = stringBuilder15;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder15);
        stringJoiner8.sb = stringBuilder15;
        java.lang.String str22 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner6.append((java.lang.Object) stringBuilder15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder26 = stringJoiner25.sb;
        java.lang.Object obj27 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = stringJoiner25.add(obj27);
        java.lang.StringBuilder stringBuilder29 = stringJoiner25.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder32 = stringJoiner31.sb;
        java.lang.String str33 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder32);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder32);
        stringJoiner25.sb = stringBuilder32;
        stringJoiner23.sb = stringBuilder32;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder32, "hi! hi!", true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = stringJoiner1.add((java.lang.Object) true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner42 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner42.first = true;
        java.lang.StringBuilder stringBuilder45 = stringJoiner42.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner46 = stringJoiner40.add((java.lang.Object) stringBuilder45);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "hi! hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "hi! hi!");
        org.junit.Assert.assertNotNull(stringJoiner28);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "hi! hi!");
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "hi! hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "null" + "'", str33, "null");
        org.junit.Assert.assertNotNull(stringJoiner40);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "hi! hi!");
        org.junit.Assert.assertNotNull(stringJoiner46);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0421");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("10");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str4 = stringJoiner3.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        stringJoiner6.first = true;
        boolean boolean10 = stringJoiner6.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder13 = stringJoiner12.sb;
        java.lang.StringBuilder stringBuilder14 = stringJoiner12.sb;
        stringJoiner6.sb = stringBuilder14;
        stringJoiner3.sb = stringBuilder14;
        stringJoiner1.sb = stringBuilder14;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder14, "                                ", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "hi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "hi! hi! ");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "hi! hi! ");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0422");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.String str15 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder14);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder14);
        java.lang.String str17 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder14);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = stringJoiner1.append((java.lang.Object) str17);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        stringJoiner20.first = true;
        java.lang.String str24 = stringJoiner20.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder27 = stringJoiner26.sb;
        java.lang.Object obj28 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = stringJoiner26.add(obj28);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = stringJoiner26.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder34 = stringJoiner33.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder34, "                                                                                                 ", false);
        stringJoiner26.sb = stringBuilder34;
        stringJoiner20.sb = stringBuilder34;
        stringJoiner1.sb = stringBuilder34;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "null-1.0 ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "null-1.0 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " " + "'", str24, " ");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner29);
        org.junit.Assert.assertNotNull(stringJoiner31);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "null-1.0 ");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0423");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        java.lang.String str5 = stringJoiner1.separator;
        stringJoiner1.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder10 = stringJoiner9.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = stringJoiner9.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder15, "", false);
        java.lang.String str19 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        stringJoiner9.sb = stringBuilder15;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner1.append((java.lang.Object) stringBuilder15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder24 = stringJoiner23.sb;
        java.lang.String str25 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder24);
        java.lang.Class<?> wildcardClass26 = stringBuilder24.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = stringJoiner1.add((java.lang.Object) wildcardClass26);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder32 = stringJoiner31.sb;
        java.lang.String str33 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder32);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder32, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder32, "     ", true);
        stringJoiner29.sb = stringBuilder32;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = stringJoiner27.append((java.lang.Object) stringBuilder32);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder32, "", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), " class java.lang.StringBuilder");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(stringJoiner41);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0424");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(0, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0425");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        stringJoiner1.sb = stringBuilder4;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder11 = stringJoiner10.sb;
        stringJoiner10.first = true;
        java.lang.String str14 = stringJoiner10.complete();
        java.lang.String str15 = stringJoiner10.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner1.append((java.lang.Object) str15);
        stringJoiner16.first = true;
        java.lang.String str19 = stringJoiner16.separator;
        java.lang.String str20 = stringJoiner16.complete();
        stringJoiner16.first = true;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0426");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean11 = org.jsoup.internal.StringUtil.in("hi!", strArray10);
        boolean boolean12 = org.jsoup.internal.StringUtil.inSorted("", strArray10);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("10", strArray10);
        boolean boolean14 = org.jsoup.internal.StringUtil.in("          ", strArray10);
        java.lang.String str16 = org.jsoup.internal.StringUtil.join(strArray10, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0427");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("     ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner3.add(obj5);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner3.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str11 = stringJoiner10.separator;
        boolean boolean12 = stringJoiner10.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = stringJoiner8.append((java.lang.Object) stringJoiner10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder16 = stringJoiner15.sb;
        java.lang.String str17 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder16);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder16);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder16, "          ", true);
        stringJoiner13.sb = stringBuilder16;
        stringJoiner1.sb = stringBuilder16;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder16);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder16, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stringJoiner13);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0428");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        java.lang.Class<?> wildcardClass5 = stringJoiner1.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0429");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              " + "'", str1, "                              ");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0430");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        java.lang.StringBuilder stringBuilder8 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder13 = stringJoiner12.sb;
        java.lang.String str14 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder13);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder13);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder13);
        stringJoiner10.sb = stringBuilder13;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder13);
        stringJoiner6.sb = stringBuilder13;
        java.lang.String str20 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder13);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner4.append((java.lang.Object) stringBuilder13);
        java.lang.StringBuilder stringBuilder22 = stringJoiner21.sb;
        boolean boolean23 = stringJoiner21.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "null");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "null");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "null");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0431");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "true");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: true");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0432");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        java.lang.StringBuilder stringBuilder18 = stringJoiner13.sb;
        java.lang.String str19 = stringJoiner13.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder22 = stringJoiner21.sb;
        stringJoiner21.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder27 = stringJoiner26.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder27, "", false);
        stringJoiner21.sb = stringBuilder27;
        java.lang.String str32 = stringJoiner21.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder35 = stringJoiner34.sb;
        java.lang.Object obj36 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner37 = stringJoiner34.add(obj36);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner39 = stringJoiner34.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str42 = stringJoiner41.separator;
        boolean boolean43 = stringJoiner41.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner44 = stringJoiner39.append((java.lang.Object) stringJoiner41);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner46 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder47 = stringJoiner46.sb;
        java.lang.Object obj48 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner49 = stringJoiner46.add(obj48);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner50 = stringJoiner44.append((java.lang.Object) stringJoiner46);
        java.lang.StringBuilder stringBuilder51 = stringJoiner44.sb;
        stringJoiner21.sb = stringBuilder51;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner54 = stringJoiner21.append((java.lang.Object) "10");
        java.lang.StringBuilder stringBuilder55 = stringJoiner54.sb;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner56 = stringJoiner13.append((java.lang.Object) stringBuilder55);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "21) test0432(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
// flaky "5) test0432(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder18);
// flaky "4) test0432(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
// flaky "3) test0432(org.jsoup.internal.StringUtilRegressionTest0)":         org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertNotNull(stringJoiner37);
        org.junit.Assert.assertNotNull(stringJoiner39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " " + "'", str42, " ");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(stringJoiner44);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner49);
        org.junit.Assert.assertNotNull(stringJoiner50);
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertNotNull(stringJoiner54);
        org.junit.Assert.assertNotNull(stringBuilder55);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0433");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder5 = stringJoiner4.sb;
        stringJoiner1.sb = stringBuilder5;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder5);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder5, "null", false);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder5, "", false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "null");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0434");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder6);
        stringJoiner1.sb = stringBuilder6;
        java.lang.String str9 = stringJoiner1.complete();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0435");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0436");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector13 = org.jsoup.internal.StringUtil.joining("          ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = stringJoiner1.add((java.lang.Object) charSequenceCollector13);
        java.lang.String str15 = stringJoiner14.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder18 = stringJoiner17.sb;
        java.lang.String str19 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder18);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder18);
        stringJoiner14.sb = stringBuilder18;
        java.lang.String str22 = stringJoiner14.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertNotNull(charSequenceCollector13);
        org.junit.Assert.assertNotNull(stringJoiner14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0437");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0438");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0439");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0440");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0441");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!", "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!" };
        java.lang.String str4 = org.jsoup.internal.StringUtil.join(strArray2, "hi!                                                                                                    hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!", "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!hi!                                                                                                    hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!" + "'", str4, "hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!hi!                                                                                                    hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0442");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("10");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str4 = stringJoiner3.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        stringJoiner6.first = true;
        boolean boolean10 = stringJoiner6.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder13 = stringJoiner12.sb;
        java.lang.StringBuilder stringBuilder14 = stringJoiner12.sb;
        stringJoiner6.sb = stringBuilder14;
        stringJoiner3.sb = stringBuilder14;
        stringJoiner1.sb = stringBuilder14;
        java.lang.String str18 = stringJoiner1.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        java.lang.Object obj22 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner20.add(obj22);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = stringJoiner20.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str28 = stringJoiner27.separator;
        boolean boolean29 = stringJoiner27.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = stringJoiner25.append((java.lang.Object) stringJoiner27);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder33 = stringJoiner32.sb;
        java.lang.String str34 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder33);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder33);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder33, "          ", true);
        stringJoiner30.sb = stringBuilder33;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = stringJoiner30.append((java.lang.Object) true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner43 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner43.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner47 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder48 = stringJoiner47.sb;
        java.lang.String str49 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder48);
        stringJoiner43.sb = stringBuilder48;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder48, "                                                                                                 ", true);
        stringJoiner41.sb = stringBuilder48;
        stringJoiner1.sb = stringBuilder48;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " " + "'", str28, " ");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(stringJoiner41);
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "true" + "'", str49, "true");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0443");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        java.lang.String str5 = stringJoiner1.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder8 = stringJoiner7.sb;
        java.lang.Object obj9 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = stringJoiner7.add(obj9);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = stringJoiner7.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder15, "                                                                                                 ", false);
        stringJoiner7.sb = stringBuilder15;
        stringJoiner1.sb = stringBuilder15;
        java.lang.String str21 = stringJoiner1.complete();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "null-1.0");
        org.junit.Assert.assertNotNull(stringJoiner10);
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0444");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0445");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        java.lang.String str5 = stringJoiner1.separator;
        stringJoiner1.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder10 = stringJoiner9.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = stringJoiner9.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder15, "", false);
        java.lang.String str19 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        stringJoiner9.sb = stringBuilder15;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner1.append((java.lang.Object) stringBuilder15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder24 = stringJoiner23.sb;
        java.lang.String str25 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder24);
        java.lang.Class<?> wildcardClass26 = stringBuilder24.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = stringJoiner1.add((java.lang.Object) wildcardClass26);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder32 = stringJoiner31.sb;
        java.lang.String str33 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder32);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder32, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder32, "     ", true);
        stringJoiner29.sb = stringBuilder32;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = stringJoiner27.append((java.lang.Object) stringBuilder32);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner43 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.String str44 = stringJoiner43.separator;
        java.lang.StringBuilder stringBuilder45 = stringJoiner43.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner46 = stringJoiner41.append((java.lang.Object) stringJoiner43);
        java.lang.String str47 = stringJoiner46.complete();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(stringJoiner41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner46);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0446");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0447");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("", "nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0448");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        java.lang.String str6 = stringJoiner1.complete();
        boolean boolean7 = stringJoiner1.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0449");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.StringBuilder stringBuilder5 = stringJoiner1.sb;
        stringJoiner1.first = false;
        boolean boolean8 = stringJoiner1.first;
        boolean boolean9 = stringJoiner1.first;
        stringJoiner1.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.StringBuilder stringBuilder15 = stringJoiner13.sb;
        stringJoiner1.sb = stringBuilder15;
        java.lang.StringBuilder stringBuilder17 = stringJoiner1.sb;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0450");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean8 = org.jsoup.internal.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.internal.StringUtil.inSorted("          ", strArray7);
        boolean boolean10 = org.jsoup.internal.StringUtil.inSorted("hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!", strArray7);
        boolean boolean11 = org.jsoup.internal.StringUtil.inSorted("nullhi!                              hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0451");
        java.lang.String[] strArray5 = new java.lang.String[] { "null", "     ", " " };
        boolean boolean6 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray5);
        boolean boolean7 = org.jsoup.internal.StringUtil.in("hi!                              hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "null", "     ", " " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0452");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("null                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0453");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.String str15 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder14);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder14);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder14, "          ", true);
        stringJoiner11.sb = stringBuilder14;
        boolean boolean21 = stringJoiner11.first;
        boolean boolean22 = stringJoiner11.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder25 = stringJoiner24.sb;
        java.lang.Object obj26 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = stringJoiner24.add(obj26);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder30 = stringJoiner29.sb;
        java.lang.String str31 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder30);
        stringJoiner24.sb = stringBuilder30;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner11.add((java.lang.Object) stringBuilder30);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder30);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder30, "nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertNotNull(stringJoiner33);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0454");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.lang.String str12 = stringJoiner1.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        java.lang.Object obj16 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner14.add(obj16);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = stringJoiner14.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str22 = stringJoiner21.separator;
        boolean boolean23 = stringJoiner21.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = stringJoiner19.append((java.lang.Object) stringJoiner21);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder27 = stringJoiner26.sb;
        java.lang.Object obj28 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = stringJoiner26.add(obj28);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = stringJoiner24.append((java.lang.Object) stringJoiner26);
        java.lang.StringBuilder stringBuilder31 = stringJoiner24.sb;
        stringJoiner1.sb = stringBuilder31;
        java.lang.String str33 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder31);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!" + "'", str12, "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringJoiner19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner29);
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0455");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0456");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("nullhi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0457");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0458");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 " + "'", str1, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0459");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        stringJoiner6.first = false;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector10 = org.jsoup.internal.StringUtil.joining(" ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.add((java.lang.Object) " ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        stringJoiner13.first = true;
        boolean boolean17 = stringJoiner13.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder20 = stringJoiner19.sb;
        java.lang.StringBuilder stringBuilder21 = stringJoiner19.sb;
        stringJoiner13.sb = stringBuilder21;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner11.add((java.lang.Object) stringBuilder21);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder26 = stringJoiner25.sb;
        java.lang.StringBuilder stringBuilder27 = stringJoiner25.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder27);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = stringJoiner11.append((java.lang.Object) stringBuilder27);
        java.lang.Class<?> wildcardClass30 = stringJoiner11.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(charSequenceCollector10);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0460");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("     ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner3.add(obj5);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner3.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str11 = stringJoiner10.separator;
        boolean boolean12 = stringJoiner10.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = stringJoiner8.append((java.lang.Object) stringJoiner10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder16 = stringJoiner15.sb;
        java.lang.String str17 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder16);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder16);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder16, "          ", true);
        stringJoiner13.sb = stringBuilder16;
        stringJoiner1.sb = stringBuilder16;
        boolean boolean24 = stringJoiner1.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = stringJoiner1.add((java.lang.Object) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder29 = stringJoiner28.sb;
        stringJoiner28.first = true;
        boolean boolean32 = stringJoiner28.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner26.append((java.lang.Object) boolean32);
        java.lang.String str34 = stringJoiner26.complete();
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stringJoiner13);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(stringJoiner26);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    true" + "'", str34, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    true");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0461");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("null-1.010");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0462");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0463");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.String str15 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder14);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder14);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder14, "          ", true);
        stringJoiner11.sb = stringBuilder14;
        boolean boolean21 = stringJoiner11.first;
        boolean boolean22 = stringJoiner11.first;
        java.lang.String str23 = stringJoiner11.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0464");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        boolean boolean18 = stringJoiner13.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        stringJoiner20.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder26 = stringJoiner25.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder26, "", false);
        stringJoiner20.sb = stringBuilder26;
        java.lang.String str31 = stringJoiner20.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = stringJoiner13.append((java.lang.Object) stringJoiner20);
        java.lang.String str33 = stringJoiner20.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0465");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 " + "'", str1, "null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0466");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" class java.lang.StringBuilder");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0467");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0468");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean11 = org.jsoup.internal.StringUtil.in("hi!", strArray10);
        boolean boolean12 = org.jsoup.internal.StringUtil.inSorted("", strArray10);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("10", strArray10);
        boolean boolean14 = org.jsoup.internal.StringUtil.in("          ", strArray10);
        java.lang.String str16 = org.jsoup.internal.StringUtil.join(strArray10, "nullhi!                              hi!");
        java.lang.String str18 = org.jsoup.internal.StringUtil.join(strArray10, "null-1.0 null                ");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!" + "'", str16, "nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                " + "'", str18, "null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                ");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0469");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 " + "'", str1, "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0470");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("10", strArray11);
        boolean boolean15 = org.jsoup.internal.StringUtil.inSorted("hi! hi!null", strArray11);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("hi!null-1.0 null                hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0471");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        java.lang.String str5 = stringJoiner1.separator;
        stringJoiner1.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder10 = stringJoiner9.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = stringJoiner9.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder15, "", false);
        java.lang.String str19 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        stringJoiner9.sb = stringBuilder15;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner1.append((java.lang.Object) stringBuilder15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder24 = stringJoiner23.sb;
        java.lang.String str25 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder24);
        java.lang.Class<?> wildcardClass26 = stringBuilder24.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = stringJoiner1.add((java.lang.Object) wildcardClass26);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean33 = org.jsoup.internal.StringUtil.in("", strArray32);
        java.lang.Class<?> wildcardClass34 = strArray32.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = stringJoiner27.append((java.lang.Object) wildcardClass34);
        java.lang.String str36 = stringJoiner27.complete();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(stringJoiner35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + " class java.lang.StringBuilderclass [Ljava.lang.String;" + "'", str36, " class java.lang.StringBuilderclass [Ljava.lang.String;");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0472");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean8 = org.jsoup.internal.StringUtil.in("hi!", strArray7);
        boolean boolean9 = org.jsoup.internal.StringUtil.in(" ", strArray7);
        boolean boolean10 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray7);
        java.lang.String str12 = org.jsoup.internal.StringUtil.join(strArray7, "                              ");
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("hi! hi!", strArray7);
        boolean boolean14 = org.jsoup.internal.StringUtil.in("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!                              hi!" + "'", str12, "hi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0473");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline(" nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0474");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!hi!                                                                                                    hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0475");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.StringBuilder stringBuilder5 = stringJoiner1.sb;
        boolean boolean6 = stringJoiner1.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "null");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0476");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("                                                                                                 ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    true");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0477");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("null-1.0 null                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null-1.0 null " + "'", str1, "null-1.0 null ");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0478");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0479");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        stringJoiner6.first = false;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector10 = org.jsoup.internal.StringUtil.joining(" ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.add((java.lang.Object) " ");
        boolean boolean12 = stringJoiner11.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        stringJoiner11.sb = stringBuilder15;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder19 = stringJoiner18.sb;
        java.lang.String str20 = stringJoiner18.separator;
        java.lang.StringBuilder stringBuilder21 = stringJoiner18.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = stringJoiner11.append((java.lang.Object) stringJoiner18);
        java.lang.String str23 = stringJoiner18.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = stringJoiner18.add((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass26 = stringJoiner18.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(charSequenceCollector10);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(stringJoiner25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0480");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        java.lang.String str8 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder7);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        stringJoiner1.sb = stringBuilder7;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = stringJoiner13.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str21 = stringJoiner20.separator;
        boolean boolean22 = stringJoiner20.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner18.append((java.lang.Object) stringJoiner20);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = stringJoiner1.append((java.lang.Object) stringJoiner23);
        java.lang.Object obj25 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = stringJoiner23.append(obj25);
        boolean boolean27 = stringJoiner26.first;
        stringJoiner26.first = true;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertNotNull(stringJoiner26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0481");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", false);
        java.lang.String str6 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0482");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0483");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining(" class java.lang.StringBuilder");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0484");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: width must be >= 0");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0485");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        stringJoiner17.first = false;
        boolean boolean20 = stringJoiner17.first;
        java.lang.String str21 = stringJoiner17.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0486");
        java.lang.String[] strArray3 = org.jsoup.internal.StringUtil.padding;
        boolean boolean4 = org.jsoup.internal.StringUtil.inSorted("", strArray3);
        boolean boolean5 = org.jsoup.internal.StringUtil.inSorted("", strArray3);
        boolean boolean6 = org.jsoup.internal.StringUtil.inSorted("10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0487");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("     ");
        java.lang.String str2 = stringJoiner1.complete();
        java.lang.StringBuilder stringBuilder3 = stringJoiner1.sb;
        java.lang.Class<?> wildcardClass4 = stringJoiner1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(stringBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0488");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        stringJoiner1.sb = stringBuilder4;
        boolean boolean9 = stringJoiner1.first;
        java.lang.Object obj10 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner1.add(obj10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("null");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = stringJoiner13.append((java.lang.Object) "                                                                                                 ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner11.add((java.lang.Object) stringJoiner15);
        boolean boolean17 = stringJoiner11.first;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringJoiner15);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0489");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        stringJoiner6.first = false;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector10 = org.jsoup.internal.StringUtil.joining(" ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.add((java.lang.Object) " ");
        boolean boolean12 = stringJoiner11.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        stringJoiner11.sb = stringBuilder15;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder19 = stringJoiner18.sb;
        java.lang.String str20 = stringJoiner18.separator;
        java.lang.StringBuilder stringBuilder21 = stringJoiner18.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = stringJoiner11.append((java.lang.Object) stringJoiner18);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder25 = stringJoiner24.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = stringJoiner24.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder30 = stringJoiner29.sb;
        java.lang.String str31 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder30);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder30);
        java.lang.String str33 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder30);
        stringJoiner24.sb = stringBuilder30;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner36 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder37 = stringJoiner36.sb;
        java.lang.Object obj38 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner39 = stringJoiner36.add(obj38);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = stringJoiner36.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner43 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str44 = stringJoiner43.separator;
        boolean boolean45 = stringJoiner43.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner46 = stringJoiner41.append((java.lang.Object) stringJoiner43);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner47 = stringJoiner24.append((java.lang.Object) stringJoiner46);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner49 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder50 = stringJoiner49.sb;
        java.lang.Object obj51 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner52 = stringJoiner49.add(obj51);
        java.lang.StringBuilder stringBuilder53 = stringJoiner49.sb;
        java.lang.StringBuilder stringBuilder54 = stringJoiner49.sb;
        java.lang.String str55 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder54);
        stringJoiner46.sb = stringBuilder54;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner57 = stringJoiner22.append((java.lang.Object) stringJoiner46);
        boolean boolean58 = stringJoiner57.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(charSequenceCollector10);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner39);
        org.junit.Assert.assertNotNull(stringJoiner41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + " " + "'", str44, " ");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(stringJoiner46);
        org.junit.Assert.assertNotNull(stringJoiner47);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner52);
        org.junit.Assert.assertNotNull(stringBuilder53);
        org.junit.Assert.assertEquals(stringBuilder53.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder54);
        org.junit.Assert.assertEquals(stringBuilder54.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0490");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector13 = org.jsoup.internal.StringUtil.joining("          ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = stringJoiner1.add((java.lang.Object) charSequenceCollector13);
        java.lang.String str15 = stringJoiner14.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder18 = stringJoiner17.sb;
        java.lang.String str19 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder18);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder18);
        stringJoiner14.sb = stringBuilder18;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder18, "hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertNotNull(charSequenceCollector13);
        org.junit.Assert.assertNotNull(stringJoiner14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0491");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0492");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0493");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0494");
        java.lang.String[] strArray4 = org.jsoup.internal.StringUtil.padding;
        boolean boolean5 = org.jsoup.internal.StringUtil.inSorted("", strArray4);
        boolean boolean6 = org.jsoup.internal.StringUtil.inSorted("", strArray4);
        boolean boolean7 = org.jsoup.internal.StringUtil.inSorted("null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ", strArray4);
        boolean boolean8 = org.jsoup.internal.StringUtil.inSorted("                                                                                                    ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0495");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0496");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("10", strArray11);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!hi!                                                                                                    hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!", strArray11);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0497");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.Object obj15 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add(obj15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner11.append((java.lang.Object) stringJoiner13);
        boolean boolean18 = stringJoiner13.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        stringJoiner20.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder26 = stringJoiner25.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder26, "", false);
        stringJoiner20.sb = stringBuilder26;
        java.lang.String str31 = stringJoiner20.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = stringJoiner13.append((java.lang.Object) stringJoiner20);
        java.lang.String str33 = stringJoiner32.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0498");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0499");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest0.test0500");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(0, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }
}
