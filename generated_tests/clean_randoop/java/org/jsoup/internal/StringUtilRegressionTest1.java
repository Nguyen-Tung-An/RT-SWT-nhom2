package org.jsoup.internal;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringUtilRegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0501");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0502");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.0");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "null-1.0");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0503");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.internal.StringUtil.join(strArray0, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0504");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean7 = org.jsoup.internal.StringUtil.in("hi!", strArray6);
        boolean boolean8 = org.jsoup.internal.StringUtil.in(" ", strArray6);
        boolean boolean9 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray6);
        boolean boolean10 = org.jsoup.internal.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", strArray6);
        java.lang.String str12 = org.jsoup.internal.StringUtil.join(strArray6, "null-1.0 ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!null-1.0 hi!" + "'", str12, "hi!null-1.0 hi!");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0505");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0506");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0507");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0508");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean10 = org.jsoup.internal.StringUtil.in("hi!", strArray9);
        boolean boolean11 = org.jsoup.internal.StringUtil.in(" ", strArray9);
        boolean boolean12 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray9);
        java.lang.String str14 = org.jsoup.internal.StringUtil.join(strArray9, "                              ");
        boolean boolean15 = org.jsoup.internal.StringUtil.inSorted("hi! hi!", strArray9);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("", strArray9);
        boolean boolean17 = org.jsoup.internal.StringUtil.inSorted("null", strArray9);
        boolean boolean18 = org.jsoup.internal.StringUtil.inSorted("                              ", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!                              hi!" + "'", str14, "hi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0509");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, " class java.lang.StringBuilder");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:  class java.lang.StringBuilder");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0510");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "nullhi!                              hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: nullhi!                              hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0511");
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
        stringJoiner21.first = false;
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0512");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi!null-1.0 null                hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!null-1.0 null hi!" + "'", str1, "hi!null-1.0 null hi!");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0513");
        java.lang.String[] strArray5 = new java.lang.String[] { "null", "     ", " " };
        boolean boolean6 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray5);
        java.lang.String str8 = org.jsoup.internal.StringUtil.join(strArray5, "     ");
        java.lang.String str10 = org.jsoup.internal.StringUtil.join(strArray5, "null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        boolean boolean11 = org.jsoup.internal.StringUtil.in("hi!null-1.0 null                hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "null", "     ", " " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null                " + "'", str8, "null                ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     " + "'", str10, "nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0514");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("nullhi!                              hi!", "nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0515");
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
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder15);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder15, "null", false);
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "1) test0515(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder8);
// flaky "1) test0515(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder8.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner10);
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "null");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0516");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0517");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        java.lang.String str2 = stringJoiner1.complete();
        java.lang.StringBuilder stringBuilder3 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder6);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder6, "", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner1.append((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
// flaky "2) test0517(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(stringBuilder3);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0518");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner3.add(obj5);
        java.lang.StringBuilder stringBuilder7 = stringJoiner3.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder10 = stringJoiner9.sb;
        java.lang.String str11 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder10);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder10);
        stringJoiner3.sb = stringBuilder10;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder10, "", true);
        java.lang.String str17 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder10);
        stringJoiner1.sb = stringBuilder10;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "null");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0519");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("nullhi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0520");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean6 = org.jsoup.internal.StringUtil.in("hi!", strArray5);
        java.lang.String str8 = org.jsoup.internal.StringUtil.join(strArray5, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        boolean boolean9 = org.jsoup.internal.StringUtil.in("10", strArray5);
        boolean boolean10 = org.jsoup.internal.StringUtil.in("hi! hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0521");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0522");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuilder.appendCodePoint(int)\" because \"accum\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0523");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        stringJoiner11.first = true;
        java.lang.StringBuilder stringBuilder14 = stringJoiner11.sb;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0524");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null                ");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0525");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!null-1.0 hi!", "null-1.0 null                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0526");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("hi!null-1.0 null                hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0527");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline(" class java.lang.StringBuilder");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0528");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!nullnullhi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0529");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder22 = stringJoiner21.sb;
        java.lang.Object obj23 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = stringJoiner21.add(obj23);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = stringJoiner21.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str29 = stringJoiner28.separator;
        boolean boolean30 = stringJoiner28.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = stringJoiner26.append((java.lang.Object) stringJoiner28);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder34 = stringJoiner33.sb;
        java.lang.String str35 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder34);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder34);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder34, "          ", true);
        stringJoiner31.sb = stringBuilder34;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = stringJoiner13.append((java.lang.Object) stringBuilder34);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder34, "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ", false);
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
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "null");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "null");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertNotNull(stringJoiner26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " " + "'", str29, " ");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(stringJoiner31);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(stringJoiner41);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0530");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean10 = org.jsoup.internal.StringUtil.in("hi!", strArray9);
        boolean boolean11 = org.jsoup.internal.StringUtil.in("hi!                              hi!", strArray9);
        boolean boolean12 = org.jsoup.internal.StringUtil.in("                                                                                                 null", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0531");
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
        java.lang.StringBuilder stringBuilder22 = stringJoiner21.sb;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 10");
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 10");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0532");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0533");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "10");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: 10");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0534");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        java.lang.String str2 = stringJoiner1.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder5 = stringJoiner4.sb;
        stringJoiner4.first = true;
        java.lang.String str8 = stringJoiner4.separator;
        stringJoiner4.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder13 = stringJoiner12.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = stringJoiner12.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder18 = stringJoiner17.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder18, "", false);
        java.lang.String str22 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder18);
        stringJoiner12.sb = stringBuilder18;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = stringJoiner4.append((java.lang.Object) stringBuilder18);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder27 = stringJoiner26.sb;
        java.lang.String str28 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder27);
        java.lang.Class<?> wildcardClass29 = stringBuilder27.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = stringJoiner4.add((java.lang.Object) wildcardClass29);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder35 = stringJoiner34.sb;
        java.lang.String str36 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder35);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder35, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder35, "     ", true);
        stringJoiner32.sb = stringBuilder35;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner44 = stringJoiner30.append((java.lang.Object) stringBuilder35);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner46 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.String str47 = stringJoiner46.separator;
        java.lang.StringBuilder stringBuilder48 = stringJoiner46.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner49 = stringJoiner44.append((java.lang.Object) stringJoiner46);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner50 = stringJoiner1.add((java.lang.Object) stringJoiner46);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
// flaky "3) test0534(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! hi!null" + "'", str2, "hi! hi!null");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertNotNull(stringJoiner15);
        org.junit.Assert.assertNotNull(stringBuilder18);
// flaky "2) test0534(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10" + "'", str22, "10");
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(stringJoiner44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner49);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0535");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("                                                                                                 ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0536");
        java.lang.String[] strArray3 = new java.lang.String[] { "                              " };
        boolean boolean4 = org.jsoup.internal.StringUtil.in("hi!", strArray3);
        boolean boolean5 = org.jsoup.internal.StringUtil.in("null", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                              " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0537");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray11);
        java.lang.String str16 = org.jsoup.internal.StringUtil.join(strArray11, "                                                                                                 ");
        boolean boolean17 = org.jsoup.internal.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray11);
        boolean boolean18 = org.jsoup.internal.StringUtil.in("null", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str16, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0538");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder6);
        stringJoiner1.sb = stringBuilder6;
        java.lang.String str9 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder6);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0539");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean5 = org.jsoup.internal.StringUtil.in("hi!", strArray4);
        boolean boolean6 = org.jsoup.internal.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray4);
        java.lang.String str8 = org.jsoup.internal.StringUtil.join(strArray4, "nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!hi!" + "'", str8, "hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!hi!");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0540");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        stringJoiner1.sb = stringBuilder4;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder4, "hi!", false);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0541");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        stringJoiner1.first = true;
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0542");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("hi!", strArray8);
        java.lang.String str11 = org.jsoup.internal.StringUtil.join(strArray8, " ");
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray8);
        java.lang.Class<?> wildcardClass13 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "     " + "'", str11, "     ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0543");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0544");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = stringJoiner1.separator;
        java.lang.String str4 = stringJoiner1.complete();
        boolean boolean5 = stringJoiner1.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str8 = stringJoiner7.separator;
        boolean boolean9 = stringJoiner7.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder12 = stringJoiner11.sb;
        java.lang.String str13 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder12);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder12, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder12, " ", true);
        stringJoiner7.sb = stringBuilder12;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner1.add((java.lang.Object) stringBuilder12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0545");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0546");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "null-1.0 null ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: null-1.0 null ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0547");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        boolean boolean12 = stringJoiner1.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0548");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!hi!                                                                                                    hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!hi!                                                                                                    hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0549");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0550");
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
        java.lang.StringBuilder stringBuilder66 = stringJoiner37.sb;
        java.lang.String str67 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder66);
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
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
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
        org.junit.Assert.assertNotNull(stringBuilder66);
        org.junit.Assert.assertEquals(stringBuilder66.toString(), "");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0551");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    true");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0552");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean8 = org.jsoup.internal.StringUtil.in("hi!", strArray7);
        boolean boolean9 = org.jsoup.internal.StringUtil.in(" ", strArray7);
        boolean boolean10 = org.jsoup.internal.StringUtil.inSorted("     ", strArray7);
        java.lang.String str12 = org.jsoup.internal.StringUtil.join(strArray7, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("null-1.0 ", strArray7);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("null-1.0 null ", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str12, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0553");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace(" class java.lang.StringBuilderclass [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " class java.lang.StringBuilderclass [Ljava.lang.String;" + "'", str1, " class java.lang.StringBuilderclass [Ljava.lang.String;");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0554");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("null-1.010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0555");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean7 = org.jsoup.internal.StringUtil.in("", strArray6);
        boolean boolean8 = org.jsoup.internal.StringUtil.inSorted("          ", strArray6);
        boolean boolean9 = org.jsoup.internal.StringUtil.inSorted("hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!", strArray6);
        java.lang.String str11 = org.jsoup.internal.StringUtil.join(strArray6, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!" + "'", str11, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0556");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0557");
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
        stringJoiner23.first = false;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
// flaky "4) test0557(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0558");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "hi!nullnullhi!                              hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0559");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder28 = stringJoiner27.sb;
        stringJoiner27.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder33 = stringJoiner32.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder33, "", false);
        stringJoiner27.sb = stringBuilder33;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = stringJoiner25.append((java.lang.Object) stringBuilder33);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder41 = stringJoiner40.sb;
        java.lang.Object obj42 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner43 = stringJoiner40.add(obj42);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner45 = stringJoiner40.add((java.lang.Object) (-1.0d));
        stringJoiner45.first = false;
        stringJoiner45.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner50 = stringJoiner38.append((java.lang.Object) false);
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "5) test0559(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(charSequenceCollector10);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "0false");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "0false");
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(stringJoiner25);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner38);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "null-1.0");
        org.junit.Assert.assertNotNull(stringJoiner43);
        org.junit.Assert.assertNotNull(stringJoiner45);
        org.junit.Assert.assertNotNull(stringJoiner50);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0560");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jsoup.internal.StringUtil.padding((-1));
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: width must be >= 0");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0561");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("hi!null-1.0 null hi!");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0562");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!hi!                                                                                                    hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!" + "'", str1, "hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0563");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " true" + "'", str1, " true");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0564");
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
        java.lang.Class<?> wildcardClass17 = stringJoiner16.getClass();
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringJoiner15);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0565");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("null-1.0 null ");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0566");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0567");
        java.lang.String[] strArray1 = org.jsoup.internal.StringUtil.padding;
        boolean boolean2 = org.jsoup.internal.StringUtil.inSorted("", strArray1);
        java.lang.String str4 = org.jsoup.internal.StringUtil.join(strArray1, "null-1.0 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "6) test0567(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null-1.0  null-1.0   null-1.0    null-1.0     null-1.0      null-1.0       null-1.0        null-1.0         null-1.0          null-1.0           null-1.0            null-1.0             null-1.0              null-1.0               null-1.0                null-1.0                 null-1.0                  null-1.0                   null-1.0                    null-1.0                     " + "'", str4, "null-1.0  null-1.0   null-1.0    null-1.0     null-1.0      null-1.0       null-1.0        null-1.0         null-1.0          null-1.0           null-1.0            null-1.0             null-1.0              null-1.0               null-1.0                null-1.0                 null-1.0                  null-1.0                   null-1.0                    null-1.0                     ");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0568");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0569");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean7 = org.jsoup.internal.StringUtil.in("", strArray6);
        boolean boolean8 = org.jsoup.internal.StringUtil.inSorted("          ", strArray6);
        boolean boolean9 = org.jsoup.internal.StringUtil.inSorted("hi!null-1.0 null                hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0570");
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
        java.lang.StringBuilder stringBuilder25 = stringJoiner1.sb;
        java.lang.String str26 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder25);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0571");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str22 = stringJoiner21.separator;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean29 = org.jsoup.internal.StringUtil.in("", strArray28);
        boolean boolean30 = org.jsoup.internal.StringUtil.inSorted("          ", strArray28);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = stringJoiner21.append((java.lang.Object) "          ");
        java.lang.Class<?> wildcardClass32 = stringJoiner31.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner13.add((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "nullclass org.jsoup.internal.StringUtil$StringJoiner");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "nullclass org.jsoup.internal.StringUtil$StringJoiner");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "nullclass org.jsoup.internal.StringUtil$StringJoiner");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(stringJoiner31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(stringJoiner33);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0572");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("          ");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = stringJoiner15.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        java.lang.String str22 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder21);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder21);
        java.lang.String str24 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder21);
        stringJoiner15.sb = stringBuilder21;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder28 = stringJoiner27.sb;
        java.lang.Object obj29 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = stringJoiner27.add(obj29);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = stringJoiner27.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str35 = stringJoiner34.separator;
        boolean boolean36 = stringJoiner34.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner37 = stringJoiner32.append((java.lang.Object) stringJoiner34);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = stringJoiner15.append((java.lang.Object) stringJoiner37);
        java.lang.Class<?> wildcardClass39 = stringJoiner15.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = stringJoiner13.append((java.lang.Object) wildcardClass39);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = stringJoiner1.append((java.lang.Object) wildcardClass39);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stringJoiner13);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " " + "'", str35, " ");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(stringJoiner37);
        org.junit.Assert.assertNotNull(stringJoiner38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(stringJoiner40);
        org.junit.Assert.assertNotNull(stringJoiner41);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0573");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0574");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, " true");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:  true");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0575");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!");
        java.lang.String str2 = stringJoiner1.separator;
        boolean boolean3 = stringJoiner1.first;
        boolean boolean4 = stringJoiner1.first;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!" + "'", str2, "hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0576");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("hi!                                                                                                    hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0577");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        stringJoiner1.first = true;
        java.lang.String str8 = stringJoiner1.complete();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0578");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0579");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean8 = org.jsoup.internal.StringUtil.in("hi!", strArray7);
        boolean boolean9 = org.jsoup.internal.StringUtil.in(" ", strArray7);
        boolean boolean10 = org.jsoup.internal.StringUtil.inSorted("     ", strArray7);
        java.lang.String str12 = org.jsoup.internal.StringUtil.join(strArray7, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        java.lang.String str14 = org.jsoup.internal.StringUtil.join(strArray7, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        boolean boolean15 = org.jsoup.internal.StringUtil.inSorted("nullnull", strArray7);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("     ", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str12, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str14, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0580");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0581");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0582");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0583");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder9 = stringJoiner8.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder9, "                                                                                                 ", false);
        stringJoiner1.sb = stringBuilder9;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder9);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder9, " class java.lang.StringBuilderclass [Ljava.lang.String;", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "7) test0583(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "class java.lang.StringBuilderclass [Ljava.lang.String;");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "class java.lang.StringBuilderclass [Ljava.lang.String;");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0584");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class java.lang.StringBuilderclass [Ljava.lang.String;10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 " + "'", str1, "class java.lang.StringBuilderclass [Ljava.lang.String;10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0585");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean8 = org.jsoup.internal.StringUtil.in("hi!", strArray7);
        boolean boolean9 = org.jsoup.internal.StringUtil.in(" ", strArray7);
        boolean boolean10 = org.jsoup.internal.StringUtil.inSorted("     ", strArray7);
        java.lang.String str12 = org.jsoup.internal.StringUtil.join(strArray7, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        boolean boolean13 = org.jsoup.internal.StringUtil.in("10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ", strArray7);
        boolean boolean14 = org.jsoup.internal.StringUtil.in("null", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str12, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0586");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        java.lang.String str22 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder21);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder21, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder21, "     ", true);
        stringJoiner18.sb = stringBuilder21;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder32 = stringJoiner31.sb;
        java.lang.String str33 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder32);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder32);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder32, "          ", true);
        java.lang.String str38 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder32);
        stringJoiner18.sb = stringBuilder32;
        stringJoiner16.sb = stringBuilder32;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringJoiner15);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0587");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder5 = stringJoiner4.sb;
        stringJoiner1.sb = stringBuilder5;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder5, "null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                ", false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null ");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null ");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0588");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder27 = stringJoiner26.sb;
        java.lang.Object obj28 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = stringJoiner26.add(obj28);
        java.lang.Object obj30 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = stringJoiner26.append(obj30);
        java.lang.String str32 = stringJoiner31.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner24.add((java.lang.Object) stringJoiner31);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = stringJoiner33.append((java.lang.Object) "hi!null-1.0 null hi!");
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "8) test0588(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "10");
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
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertNotNull(stringJoiner29);
        org.junit.Assert.assertNotNull(stringJoiner31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertNotNull(stringJoiner35);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0589");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0590");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0591");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean13 = org.jsoup.internal.StringUtil.in("hi!", strArray12);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray12);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("          ", strArray12);
        boolean boolean16 = org.jsoup.internal.StringUtil.in(" ", strArray12);
        boolean boolean17 = org.jsoup.internal.StringUtil.in("null-1.0 null ", strArray12);
        boolean boolean18 = org.jsoup.internal.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", strArray12);
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
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0592");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        java.lang.String str11 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        stringJoiner1.sb = stringBuilder7;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        java.lang.Object obj16 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner14.add(obj16);
        java.lang.Object obj18 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = stringJoiner14.append(obj18);
        java.lang.String str20 = stringJoiner14.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner1.add((java.lang.Object) stringJoiner14);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringJoiner19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringJoiner21);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0593");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0594");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder25 = stringJoiner24.sb;
        stringJoiner24.first = true;
        java.lang.String str28 = stringJoiner24.complete();
        java.lang.String str29 = stringJoiner24.separator;
        java.lang.StringBuilder stringBuilder30 = stringJoiner24.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = stringJoiner1.add((java.lang.Object) stringBuilder30);
        boolean boolean32 = stringJoiner1.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "9) test0594(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "     null");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "     null");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(stringBuilder30);
        org.junit.Assert.assertNotNull(stringJoiner31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0595");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0596");
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
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector24 = org.jsoup.internal.StringUtil.joining("null");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = stringJoiner22.add((java.lang.Object) charSequenceCollector24);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertNotNull(charSequenceCollector24);
        org.junit.Assert.assertNotNull(stringJoiner25);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0597");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) '#', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0598");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("null-1.0 null ", "null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0599");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.internal.StringUtil.join(strArray0, " nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0600");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0601");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean13 = org.jsoup.internal.StringUtil.in("hi!", strArray12);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray12);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("          ", strArray12);
        boolean boolean16 = org.jsoup.internal.StringUtil.in(" ", strArray12);
        boolean boolean17 = org.jsoup.internal.StringUtil.inSorted("", strArray12);
        boolean boolean18 = org.jsoup.internal.StringUtil.in("null-1.0 null                ", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0602");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean11 = org.jsoup.internal.StringUtil.in("hi!", strArray10);
        boolean boolean12 = org.jsoup.internal.StringUtil.inSorted("", strArray10);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("10", strArray10);
        boolean boolean14 = org.jsoup.internal.StringUtil.in("          ", strArray10);
        java.lang.String str16 = org.jsoup.internal.StringUtil.join(strArray10, "null-1.0 ");
        java.lang.String str18 = org.jsoup.internal.StringUtil.join(strArray10, "null-1.0 ");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 " + "'", str16, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 " + "'", str18, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0603");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0604");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder8 = stringJoiner7.sb;
        java.lang.StringBuilder stringBuilder9 = stringJoiner7.sb;
        stringJoiner1.sb = stringBuilder9;
        java.lang.String str11 = stringJoiner1.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.String str15 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder14);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder14);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder14);
        java.lang.String str18 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder14);
        stringJoiner1.sb = stringBuilder14;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0605");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0606");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0607");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = stringJoiner1.separator;
        java.lang.StringBuilder stringBuilder4 = stringJoiner1.sb;
        java.lang.Class<?> wildcardClass5 = stringBuilder4.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0608");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0609");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        stringJoiner1.sb = stringBuilder4;
        java.lang.String str9 = stringJoiner1.complete();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean23 = org.jsoup.internal.StringUtil.in("hi!", strArray22);
        boolean boolean24 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray22);
        boolean boolean25 = org.jsoup.internal.StringUtil.in("          ", strArray22);
        boolean boolean26 = org.jsoup.internal.StringUtil.in(" ", strArray22);
        boolean boolean27 = org.jsoup.internal.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray22);
        boolean boolean28 = org.jsoup.internal.StringUtil.inSorted("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ", strArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = stringJoiner1.add((java.lang.Object) "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0610");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("class java.lang.StringBuilderclass [Ljava.lang.String;10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0611");
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
        java.lang.StringBuilder stringBuilder20 = stringJoiner16.sb;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
// flaky "10) test0611(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null-1.0 null  " + "'", str5, "null-1.0 null  ");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0612");
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
        stringJoiner35.first = false;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), " class java.lang.StringBuilderclass [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), " class java.lang.StringBuilderclass [Ljava.lang.String;");
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), " class java.lang.StringBuilderclass [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), " class java.lang.StringBuilderclass [Ljava.lang.String;");
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0613");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "hi!null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0614");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("nullnull");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0615");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0616");
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
        stringJoiner32.first = true;
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner32);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0617");
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
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder17);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder17, "null-1.0  null-1.0   null-1.0    null-1.0     null-1.0      null-1.0       null-1.0        null-1.0         null-1.0          null-1.0           null-1.0            null-1.0             null-1.0              null-1.0               null-1.0                null-1.0                 null-1.0                  null-1.0                   null-1.0                    null-1.0                     ", false);
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "11) test0617(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0618");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner67 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder68 = stringJoiner67.sb;
        java.lang.String str69 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder68);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder68);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder68, "          ", true);
        java.lang.String str74 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder68);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder68, "                                                                                                 ", true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner78 = stringJoiner65.append((java.lang.Object) true);
        java.lang.Class<?> wildcardClass79 = stringJoiner65.getClass();
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
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner54);
        org.junit.Assert.assertNotNull(stringJoiner56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + " " + "'", str59, " ");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(stringJoiner61);
        org.junit.Assert.assertNotNull(stringJoiner62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(stringJoiner64);
        org.junit.Assert.assertNotNull(stringJoiner65);
        org.junit.Assert.assertNotNull(stringBuilder68);
        org.junit.Assert.assertEquals(stringBuilder68.toString(), "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(stringJoiner78);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0619");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("nullhi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0620");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 null                ");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0621");
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
        java.lang.String str21 = stringJoiner13.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder24 = stringJoiner23.sb;
        java.lang.StringBuilder stringBuilder25 = stringJoiner23.sb;
        java.lang.Class<?> wildcardClass26 = stringJoiner23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = stringJoiner13.add((java.lang.Object) stringJoiner23);
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
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null" + "'", str19, "null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0622");
        java.lang.String[] strArray3 = new java.lang.String[] { "10" };
        boolean boolean4 = org.jsoup.internal.StringUtil.in("", strArray3);
        boolean boolean5 = org.jsoup.internal.StringUtil.inSorted("hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0623");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0624");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0625");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder9 = stringJoiner8.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder9, "                                                                                                 ", false);
        stringJoiner1.sb = stringBuilder9;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = stringJoiner1.append((java.lang.Object) "hi!                              hi!");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder20 = stringJoiner19.sb;
        java.lang.String str21 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder20);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder20);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder20);
        stringJoiner17.sb = stringBuilder20;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder27 = stringJoiner26.sb;
        stringJoiner26.first = true;
        java.lang.String str30 = stringJoiner26.complete();
        java.lang.String str31 = stringJoiner26.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = stringJoiner17.append((java.lang.Object) str31);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner15.append((java.lang.Object) str31);
        java.lang.String str34 = stringJoiner33.complete();
        java.lang.StringBuilder stringBuilder35 = stringJoiner33.sb;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner15);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + " hi!                              hi!" + "'", str34, " hi!                              hi!");
        org.junit.Assert.assertNull(stringBuilder35);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0626");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0627");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean5 = org.jsoup.internal.StringUtil.in("hi!", strArray4);
        boolean boolean6 = org.jsoup.internal.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray4);
        java.lang.String str8 = org.jsoup.internal.StringUtil.join(strArray4, "                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!                                                                                                 hi!" + "'", str8, "hi!                                                                                                 hi!");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0628");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder25 = stringJoiner24.sb;
        stringJoiner24.first = true;
        java.lang.String str28 = stringJoiner24.complete();
        java.lang.String str29 = stringJoiner24.separator;
        java.lang.StringBuilder stringBuilder30 = stringJoiner24.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = stringJoiner1.add((java.lang.Object) stringBuilder30);
        java.lang.String str32 = stringJoiner1.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "12) test0628(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "null");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "null");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "     " + "'", str28, "     ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(stringBuilder30);
        org.junit.Assert.assertNotNull(stringJoiner31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0629");
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
        java.lang.String str19 = stringJoiner18.complete();
        stringJoiner18.first = true;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
// flaky "13) test0629(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stringJoiner18);
// flaky "3) test0629(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0630");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        java.lang.StringBuilder stringBuilder6 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder9 = stringJoiner8.sb;
        stringJoiner8.first = true;
        boolean boolean12 = stringJoiner8.first;
        stringJoiner8.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder17 = stringJoiner16.sb;
        java.lang.StringBuilder stringBuilder18 = stringJoiner16.sb;
        stringJoiner8.sb = stringBuilder18;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = stringJoiner1.add((java.lang.Object) stringJoiner8);
        java.lang.String str21 = stringJoiner8.complete();
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "14) test0630(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
// flaky "4) test0630(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner20);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0631");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "     ", true);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        java.lang.String str11 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "                                                                                                 ", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0632");
        java.lang.String[] strArray4 = new java.lang.String[] { "10" };
        boolean boolean5 = org.jsoup.internal.StringUtil.in("", strArray4);
        boolean boolean6 = org.jsoup.internal.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray4);
        boolean boolean7 = org.jsoup.internal.StringUtil.in("hi! hi!null", strArray4);
        java.lang.String str9 = org.jsoup.internal.StringUtil.join(strArray4, "hi! hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0633");
        java.lang.String[] strArray5 = new java.lang.String[] { "null", "     ", " " };
        boolean boolean6 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray5);
        java.lang.String str8 = org.jsoup.internal.StringUtil.join(strArray5, "     ");
        java.lang.String str10 = org.jsoup.internal.StringUtil.join(strArray5, " true");
        boolean boolean11 = org.jsoup.internal.StringUtil.inSorted("                                                                                                 null", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "null", "     ", " " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null                " + "'", str8, "null                ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null true      true " + "'", str10, "null true      true ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0634");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null");
        java.lang.String str2 = stringJoiner1.complete();
        java.lang.String str3 = stringJoiner1.separator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0635");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("null-1.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0636");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean11 = org.jsoup.internal.StringUtil.in("hi!", strArray10);
        boolean boolean12 = org.jsoup.internal.StringUtil.inSorted("", strArray10);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("10", strArray10);
        boolean boolean14 = org.jsoup.internal.StringUtil.in("          ", strArray10);
        java.lang.String str16 = org.jsoup.internal.StringUtil.join(strArray10, "null-1.0 ");
        java.lang.String str18 = org.jsoup.internal.StringUtil.join(strArray10, " ");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 " + "'", str16, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "     " + "'", str18, "     ");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0637");
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
        boolean boolean39 = stringJoiner23.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0638");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0639");
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
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder18, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertNotNull(charSequenceCollector13);
        org.junit.Assert.assertNotNull(stringJoiner14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
// flaky "15) test0639(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0640");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", "hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!hi!                                                                                                    hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0641");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0642");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean10 = org.jsoup.internal.StringUtil.in("hi!", strArray9);
        boolean boolean11 = org.jsoup.internal.StringUtil.inSorted("", strArray9);
        boolean boolean12 = org.jsoup.internal.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray9);
        java.lang.String str14 = org.jsoup.internal.StringUtil.join(strArray9, "hi!null-1.0 hi!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 hi!null-1.0 hi!hi!null-1.0 hi!hi!null-1.0 hi!hi!null-1.0 hi!hi!null-1.0 hi!" + "'", str14, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 hi!null-1.0 hi!hi!null-1.0 hi!hi!null-1.0 hi!hi!null-1.0 hi!hi!null-1.0 hi!");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0643");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve(" class java.lang.StringBuilderclass [Ljava.lang.String;", "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0644");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        java.lang.String str5 = stringJoiner1.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner7.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder12 = stringJoiner11.sb;
        java.lang.String str13 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder12);
        stringJoiner7.sb = stringBuilder12;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder12, "", true);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder12);
        stringJoiner1.sb = stringBuilder12;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder12, "null-1.0 null                ", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder12, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", false);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder12, "", false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "null-1.0 null  ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0645");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(10, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0646");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0647");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "hi!                                                                                                    hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!                                                                                                    hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0648");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0649");
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
        java.lang.String str19 = stringJoiner17.separator;
        java.lang.String str20 = stringJoiner17.complete();
        boolean boolean21 = stringJoiner17.first;
        java.lang.String str22 = stringJoiner17.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner14.add((java.lang.Object) str22);
        java.lang.StringBuilder stringBuilder24 = stringJoiner23.sb;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertNotNull(charSequenceCollector13);
        org.junit.Assert.assertNotNull(stringJoiner14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringBuilder24);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0650");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!null-1.0 null                hi!");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0651");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0652");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "nullnullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!     nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi! ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: nullnullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!     nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi! ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0653");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      hi!", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0654");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("null-1.0  null-1.0   null-1.0    null-1.0     null-1.0      null-1.0       null-1.0        null-1.0         null-1.0          null-1.0           null-1.0            null-1.0             null-1.0              null-1.0               null-1.0                null-1.0                 null-1.0                  null-1.0                   null-1.0                    null-1.0                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0655");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("null                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0656");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0657");
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
        java.lang.StringBuilder stringBuilder34 = stringJoiner33.sb;
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
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0658");
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
        java.lang.String str24 = stringJoiner17.separator;
        java.lang.String[] strArray30 = new java.lang.String[] { "null", "     ", " " };
        boolean boolean31 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray30);
        boolean boolean32 = org.jsoup.internal.StringUtil.inSorted("     ", strArray30);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner17.add((java.lang.Object) strArray30);
        java.lang.String str34 = stringJoiner17.separator;
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
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "null", "     ", " " });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0659");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) 'a', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0660");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0661");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(100, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0662");
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
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder23);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder23);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
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
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0663");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii(" class java.lang.StringBuilderclass [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0664");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 hi!null-1.0 hi!hi!null-1.0 hi!hi!null-1.0 hi!hi!null-1.0 hi!hi!null-1.0 hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0665");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean10 = org.jsoup.internal.StringUtil.in("hi!", strArray9);
        boolean boolean11 = org.jsoup.internal.StringUtil.in("hi!                              hi!", strArray9);
        boolean boolean12 = org.jsoup.internal.StringUtil.inSorted("nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ", strArray9);
        java.lang.Class<?> wildcardClass13 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0666");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner67 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder68 = stringJoiner67.sb;
        java.lang.String str69 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder68);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder68);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder68, "          ", true);
        java.lang.String str74 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder68);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder68, "                                                                                                 ", true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner78 = stringJoiner65.append((java.lang.Object) true);
        boolean boolean79 = stringJoiner65.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner81 = stringJoiner65.append((java.lang.Object) 1L);
        boolean boolean82 = stringJoiner65.first;
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
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner54);
        org.junit.Assert.assertNotNull(stringJoiner56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + " " + "'", str59, " ");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(stringJoiner61);
        org.junit.Assert.assertNotNull(stringJoiner62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(stringJoiner64);
        org.junit.Assert.assertNotNull(stringJoiner65);
        org.junit.Assert.assertNotNull(stringBuilder68);
        org.junit.Assert.assertEquals(stringBuilder68.toString(), "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(stringJoiner78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(stringJoiner81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0667");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0668");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("10", strArray11);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("null-1.0 ", strArray11);
        boolean boolean16 = org.jsoup.internal.StringUtil.inSorted("nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0669");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("10", strArray11);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("          ", strArray11);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("class java.lang.StringBuilderclass [Ljava.lang.String;10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0670");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean13 = org.jsoup.internal.StringUtil.in("hi!", strArray12);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("", strArray12);
        boolean boolean15 = org.jsoup.internal.StringUtil.inSorted("10", strArray12);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("          ", strArray12);
        boolean boolean17 = org.jsoup.internal.StringUtil.in("null", strArray12);
        boolean boolean18 = org.jsoup.internal.StringUtil.in("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0671");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder4);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder4, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder4, "     ", true);
        stringJoiner1.sb = stringBuilder4;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        java.lang.String str16 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder15);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder15, "          ", true);
        java.lang.String str21 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        stringJoiner1.sb = stringBuilder15;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder25 = stringJoiner24.sb;
        java.lang.Object obj26 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = stringJoiner24.add(obj26);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = stringJoiner24.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder32 = stringJoiner31.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder32, "                                                                                                 ", false);
        stringJoiner24.sb = stringBuilder32;
        stringJoiner1.sb = stringBuilder32;
        java.lang.String str38 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder32);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder32, "nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(stringJoiner29);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null-1.0 " + "'", str38, "null-1.0 ");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0672");
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
        java.lang.String str12 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder8);
        java.lang.String str13 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder8);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null" + "'", str9, "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0673");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0674");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder8 = stringJoiner7.sb;
        java.lang.StringBuilder stringBuilder9 = stringJoiner7.sb;
        stringJoiner1.sb = stringBuilder9;
        java.lang.String str11 = stringJoiner1.complete();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = stringJoiner1.add((java.lang.Object) "hi!nullnullhi!                              hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0675");
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
        java.lang.StringBuilder stringBuilder19 = null;
        stringJoiner13.sb = stringBuilder19;
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
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0676");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("hi!", strArray8);
        boolean boolean10 = org.jsoup.internal.StringUtil.in(" ", strArray8);
        boolean boolean11 = org.jsoup.internal.StringUtil.inSorted("     ", strArray8);
        java.lang.String str13 = org.jsoup.internal.StringUtil.join(strArray8, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        boolean boolean14 = org.jsoup.internal.StringUtil.in("10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ", strArray8);
        boolean boolean15 = org.jsoup.internal.StringUtil.inSorted("nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ", strArray8);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("nullhi!                              hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "16) test0676(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str13, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0677");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) '#', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0678");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0679");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0680");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0681");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 null  ");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0682");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str2 = stringJoiner1.separator;
        stringJoiner1.first = true;
        java.lang.String str5 = stringJoiner1.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder8 = stringJoiner7.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = stringJoiner7.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder13 = stringJoiner12.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder13, "", false);
        java.lang.String str17 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder13);
        stringJoiner7.sb = stringBuilder13;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = stringJoiner1.add((java.lang.Object) stringBuilder13);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner10);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0683");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str2 = stringJoiner1.separator;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        java.lang.String str8 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "     ", true);
        java.lang.String str15 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder7);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder7);
        stringJoiner1.sb = stringBuilder7;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0684");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0685");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi! hi!");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0686");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.lang.String str12 = stringJoiner1.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        stringJoiner14.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder20 = stringJoiner19.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder20, "", false);
        stringJoiner14.sb = stringBuilder20;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder27 = stringJoiner26.sb;
        java.lang.String str28 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder27);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder27, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder27, "     ", true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = stringJoiner14.add((java.lang.Object) "     ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner37 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder38 = stringJoiner37.sb;
        stringJoiner37.first = true;
        java.lang.String str41 = stringJoiner37.complete();
        java.lang.String str42 = stringJoiner37.separator;
        java.lang.StringBuilder stringBuilder43 = stringJoiner37.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner44 = stringJoiner14.add((java.lang.Object) stringBuilder43);
        stringJoiner44.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner48 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder49 = stringJoiner48.sb;
        java.lang.Object obj50 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner51 = stringJoiner48.add(obj50);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner53 = stringJoiner48.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner55 = stringJoiner48.append((java.lang.Object) 10);
        java.lang.String str56 = stringJoiner55.separator;
        java.lang.String str57 = stringJoiner55.separator;
        java.lang.String str58 = stringJoiner55.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner59 = stringJoiner44.add((java.lang.Object) stringJoiner55);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner60 = stringJoiner1.add((java.lang.Object) stringJoiner59);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner62 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner63 = stringJoiner59.append((java.lang.Object) "null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "17) test0686(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
// flaky "5) test0686(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(stringJoiner35);
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(stringBuilder43);
        org.junit.Assert.assertNotNull(stringJoiner44);
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner51);
        org.junit.Assert.assertNotNull(stringJoiner53);
        org.junit.Assert.assertNotNull(stringJoiner55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "null-1.010" + "'", str58, "null-1.010");
        org.junit.Assert.assertNotNull(stringJoiner59);
        org.junit.Assert.assertNotNull(stringJoiner60);
        org.junit.Assert.assertNotNull(stringJoiner63);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0687");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0688");
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
        stringJoiner67.first = false;
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
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0689");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("hi!", strArray8);
        boolean boolean10 = org.jsoup.internal.StringUtil.in(" ", strArray8);
        boolean boolean11 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray8);
        java.lang.String str13 = org.jsoup.internal.StringUtil.join(strArray8, "                              ");
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("hi! hi!", strArray8);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("", strArray8);
        java.lang.String str17 = org.jsoup.internal.StringUtil.join(strArray8, "null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        boolean boolean18 = org.jsoup.internal.StringUtil.inSorted("hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      hi!" + "'", str17, "hi!null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0690");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 0, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0691");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank(" true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0692");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("null true      true ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null true true " + "'", str1, "null true true ");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0693");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0694");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str2 = stringJoiner1.separator;
        stringJoiner1.first = true;
        java.lang.StringBuilder stringBuilder5 = stringJoiner1.sb;
        java.lang.String str6 = stringJoiner1.complete();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0695");
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
        java.lang.StringBuilder stringBuilder19 = stringJoiner18.sb;
        stringJoiner18.first = false;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0696");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean6 = org.jsoup.internal.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.internal.StringUtil.inSorted("nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0697");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "null true true ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: null true true ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0698");
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
        boolean boolean34 = stringJoiner32.first;
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0699");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray11);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("                              ", strArray11);
        boolean boolean16 = org.jsoup.internal.StringUtil.inSorted(" hi!                              hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0700");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) '#', (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0701");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    truehi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0702");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = stringJoiner1.append((java.lang.Object) "10");
        java.lang.StringBuilder stringBuilder35 = stringJoiner34.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder35);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
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
        org.junit.Assert.assertNotNull(stringJoiner34);
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0703");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder28 = stringJoiner27.sb;
        stringJoiner27.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder33 = stringJoiner32.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder33, "", false);
        stringJoiner27.sb = stringBuilder33;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = stringJoiner25.append((java.lang.Object) stringBuilder33);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = new org.jsoup.internal.StringUtil.StringJoiner("nullhi!                              hi!");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = stringJoiner25.add((java.lang.Object) stringJoiner40);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner43 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder44 = stringJoiner43.sb;
        java.lang.Object obj45 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner46 = stringJoiner43.add(obj45);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner48 = stringJoiner43.add((java.lang.Object) (-1.0d));
        stringJoiner48.first = false;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector52 = org.jsoup.internal.StringUtil.joining(" ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner53 = stringJoiner48.add((java.lang.Object) " ");
        boolean boolean54 = stringJoiner53.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner56 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder57 = stringJoiner56.sb;
        stringJoiner53.sb = stringBuilder57;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner60 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder61 = stringJoiner60.sb;
        java.lang.String str62 = stringJoiner60.separator;
        java.lang.StringBuilder stringBuilder63 = stringJoiner60.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner64 = stringJoiner53.append((java.lang.Object) stringJoiner60);
        java.lang.String str65 = stringJoiner60.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner67 = stringJoiner60.append((java.lang.Object) 0);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner69 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder70 = stringJoiner69.sb;
        stringJoiner69.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner74 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder75 = stringJoiner74.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder75, "", false);
        stringJoiner69.sb = stringBuilder75;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner80 = stringJoiner67.append((java.lang.Object) stringBuilder75);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner81 = stringJoiner40.add((java.lang.Object) stringJoiner67);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.0 ");
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
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner38);
        org.junit.Assert.assertNotNull(stringJoiner41);
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner46);
        org.junit.Assert.assertNotNull(stringJoiner48);
        org.junit.Assert.assertNotNull(charSequenceCollector52);
        org.junit.Assert.assertNotNull(stringJoiner53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(stringBuilder57);
        org.junit.Assert.assertNotNull(stringBuilder61);
        org.junit.Assert.assertEquals(stringBuilder61.toString(), "0");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "0");
        org.junit.Assert.assertNotNull(stringJoiner64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(stringJoiner67);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder75);
        org.junit.Assert.assertEquals(stringBuilder75.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner80);
        org.junit.Assert.assertNotNull(stringJoiner81);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0704");
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
        java.lang.String str18 = stringJoiner11.complete();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0705");
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
        boolean boolean25 = stringJoiner1.first;
        java.lang.String str26 = stringJoiner1.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.String str29 = stringJoiner28.separator;
        java.lang.StringBuilder stringBuilder30 = stringJoiner28.sb;
        java.lang.String str31 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder30);
        stringJoiner1.sb = stringBuilder30;
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0706");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", " nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0707");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean6 = org.jsoup.internal.StringUtil.in("hi!", strArray5);
        boolean boolean7 = org.jsoup.internal.StringUtil.in(" ", strArray5);
        boolean boolean8 = org.jsoup.internal.StringUtil.inSorted("     ", strArray5);
        java.lang.String str10 = org.jsoup.internal.StringUtil.join(strArray5, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        java.lang.String str12 = org.jsoup.internal.StringUtil.join(strArray5, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        java.lang.String str14 = org.jsoup.internal.StringUtil.join(strArray5, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    true");
        java.lang.String str16 = org.jsoup.internal.StringUtil.join(strArray5, "true");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str10, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str12, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    truehi!" + "'", str14, "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    truehi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!truehi!" + "'", str16, "hi!truehi!");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0708");
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
        java.lang.String str17 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder15);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(charSequenceCollector10);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null-1.0 " + "'", str17, "null-1.0 ");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0709");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder6);
        stringJoiner1.sb = stringBuilder6;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = stringJoiner1.add((java.lang.Object) "null-1.0 ");
        java.lang.String str11 = stringJoiner10.complete();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringJoiner10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null-1.0 " + "'", str11, "null-1.0 ");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0710");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("null true true ", " class java.lang.StringBuilderclass [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0711");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!hi!                                                                                                    hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0712");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder6);
        stringJoiner1.sb = stringBuilder6;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = stringJoiner1.add((java.lang.Object) "null-1.0 ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = stringJoiner1.append((java.lang.Object) 10L);
        java.lang.String str13 = stringJoiner1.separator;
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "null-1.0 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringJoiner10);
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0713");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str2 = stringJoiner1.separator;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.internal.StringUtil.inSorted("          ", strArray8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner1.append((java.lang.Object) "          ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str14 = stringJoiner13.separator;
        boolean boolean15 = stringJoiner13.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner1.append((java.lang.Object) boolean15);
        stringJoiner16.first = false;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(stringJoiner16);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0714");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = stringJoiner1.append((java.lang.Object) "10");
        java.lang.Class<?> wildcardClass35 = stringJoiner34.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
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
        org.junit.Assert.assertNotNull(stringJoiner34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0715");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder6);
        stringJoiner1.sb = stringBuilder6;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = stringJoiner1.add((java.lang.Object) "null-1.0 ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = stringJoiner1.append((java.lang.Object) 10L);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str15 = stringJoiner14.separator;
        boolean boolean16 = stringJoiner14.first;
        stringJoiner14.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder23 = stringJoiner22.sb;
        java.lang.String str24 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder23);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder23);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder23);
        stringJoiner20.sb = stringBuilder23;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder23);
        java.lang.String str29 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder23);
        stringJoiner14.sb = stringBuilder23;
        stringJoiner1.sb = stringBuilder23;
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "null-1.0 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringJoiner10);
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0716");
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
        java.lang.String str33 = stringJoiner1.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringJoiner19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertNotNull(stringJoiner29);
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0717");
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
        java.lang.String str27 = stringJoiner26.complete();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertNotNull(stringJoiner26);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0718");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean10 = org.jsoup.internal.StringUtil.in("hi!", strArray9);
        boolean boolean11 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray9);
        boolean boolean12 = org.jsoup.internal.StringUtil.in("          ", strArray9);
        java.lang.String str14 = org.jsoup.internal.StringUtil.join(strArray9, "hi!                              hi!");
        java.lang.String str16 = org.jsoup.internal.StringUtil.join(strArray9, "null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                ");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!" + "'", str14, "hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                " + "'", str16, "null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                ");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0719");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", false);
        java.lang.String str6 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        java.lang.String str8 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0720");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!null-1.0 hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0721");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        java.lang.String str11 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        stringJoiner1.sb = stringBuilder7;
        java.lang.String str13 = stringJoiner1.separator;
        stringJoiner1.first = true;
        java.lang.String str16 = stringJoiner1.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0722");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 ");
        java.lang.Class<?> wildcardClass2 = stringJoiner1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0723");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean11 = org.jsoup.internal.StringUtil.in("hi!", strArray10);
        boolean boolean12 = org.jsoup.internal.StringUtil.inSorted("", strArray10);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("10", strArray10);
        boolean boolean14 = org.jsoup.internal.StringUtil.in("          ", strArray10);
        java.lang.String str16 = org.jsoup.internal.StringUtil.join(strArray10, "null-1.0 ");
        java.lang.Class<?> wildcardClass17 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 " + "'", str16, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0724");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("10");
        java.lang.String str2 = stringJoiner1.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder5 = stringJoiner4.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder5);
        stringJoiner1.sb = stringBuilder5;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder10 = stringJoiner9.sb;
        java.lang.Object obj11 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = stringJoiner9.add(obj11);
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
        stringJoiner9.sb = stringBuilder31;
        java.lang.String str33 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder31);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = stringJoiner1.add((java.lang.Object) str33);
        java.lang.String str35 = stringJoiner1.complete();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner12);
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
        org.junit.Assert.assertNotNull(stringJoiner34);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0725");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("10", strArray11);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("null-1.0 ", strArray11);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0726");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.append(obj5);
        java.lang.String str7 = stringJoiner1.separator;
        java.lang.String str8 = stringJoiner1.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder11 = stringJoiner10.sb;
        stringJoiner10.first = true;
        java.lang.String str14 = stringJoiner10.separator;
        stringJoiner10.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder19 = stringJoiner18.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner18.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder24 = stringJoiner23.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder24, "", false);
        java.lang.String str28 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder24);
        stringJoiner18.sb = stringBuilder24;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = stringJoiner10.append((java.lang.Object) stringBuilder24);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder33 = stringJoiner32.sb;
        java.lang.String str34 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder33);
        java.lang.Class<?> wildcardClass35 = stringBuilder33.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner36 = stringJoiner10.add((java.lang.Object) wildcardClass35);
        stringJoiner36.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner39 = stringJoiner1.add((java.lang.Object) true);
        java.lang.String str40 = stringJoiner1.complete();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(stringJoiner36);
        org.junit.Assert.assertNotNull(stringJoiner39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "nullnull class java.lang.StringBuildertrue" + "'", str40, "nullnull class java.lang.StringBuildertrue");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0727");
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
        boolean boolean22 = stringJoiner21.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder25 = stringJoiner24.sb;
        java.lang.String str26 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder25);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder25);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder25, "          ", true);
        java.lang.String str31 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder25);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder25, "                                                                                                 ", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder25, "hi!", true);
        stringJoiner21.sb = stringBuilder25;
        java.lang.String str39 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder25);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0728");
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
        java.lang.Class<?> wildcardClass18 = stringJoiner17.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0729");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        java.lang.String str6 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0730");
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
        java.lang.StringBuilder stringBuilder19 = stringJoiner1.sb;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(stringBuilder19);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0731");
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
        stringJoiner11.first = true;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0732");
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
        java.lang.String str12 = stringJoiner11.complete();
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null" + "'", str12, "null");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0733");
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0734");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.String str2 = stringJoiner1.complete();
        boolean boolean3 = stringJoiner1.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        stringJoiner5.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder11 = stringJoiner10.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder11, "", false);
        stringJoiner5.sb = stringBuilder11;
        java.lang.String str16 = stringJoiner5.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = stringJoiner5.add((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = stringJoiner1.add((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(stringJoiner18);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0735");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("null-1.0  null-1.0   null-1.0    null-1.0     null-1.0      null-1.0       null-1.0        null-1.0         null-1.0          null-1.0           null-1.0            null-1.0             null-1.0              null-1.0               null-1.0                null-1.0                 null-1.0                  null-1.0                   null-1.0                    null-1.0                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 " + "'", str1, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0736");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner45 = stringJoiner43.append((java.lang.Object) "          ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner47 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner47.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner51 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder52 = stringJoiner51.sb;
        java.lang.String str53 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder52);
        stringJoiner47.sb = stringBuilder52;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder52, "                                                                                                 ", true);
        stringJoiner45.sb = stringBuilder52;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder52);
        stringJoiner41.sb = stringBuilder52;
        java.lang.Class<?> wildcardClass61 = stringBuilder52.getClass();
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
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "          ");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(stringJoiner41);
        org.junit.Assert.assertNotNull(stringJoiner45);
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0737");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 " + "'", str1, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0738");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0739");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner1.append((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder11 = stringJoiner10.sb;
        java.lang.String str12 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder11);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder11, "", true);
        stringJoiner1.sb = stringBuilder11;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        java.lang.Object obj22 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner20.add(obj22);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder26 = stringJoiner25.sb;
        java.lang.StringBuilder stringBuilder27 = stringJoiner25.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder32 = stringJoiner31.sb;
        java.lang.String str33 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder32);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder32);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder32);
        stringJoiner29.sb = stringBuilder32;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder32);
        stringJoiner25.sb = stringBuilder32;
        java.lang.String str39 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder32);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = stringJoiner23.append((java.lang.Object) stringBuilder32);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner42 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder43 = stringJoiner42.sb;
        java.lang.Object obj44 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner45 = stringJoiner42.add(obj44);
        java.lang.StringBuilder stringBuilder46 = stringJoiner42.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner48 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder49 = stringJoiner48.sb;
        java.lang.String str50 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder49);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder49);
        stringJoiner42.sb = stringBuilder49;
        stringJoiner40.sb = stringBuilder49;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder49, "hi! hi!", true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner57 = stringJoiner18.add((java.lang.Object) true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner59 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder60 = stringJoiner59.sb;
        java.lang.Object obj61 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner62 = stringJoiner59.add(obj61);
        java.lang.StringBuilder stringBuilder63 = stringJoiner59.sb;
        java.lang.StringBuilder stringBuilder64 = stringJoiner59.sb;
        stringJoiner18.sb = stringBuilder64;
        stringJoiner1.sb = stringBuilder64;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "true");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "true");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null-1.010" + "'", str12, "null-1.010");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "hi! hi!null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(stringJoiner40);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "hi! hi!null");
        org.junit.Assert.assertNotNull(stringJoiner45);
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "hi! hi!null");
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "hi! hi!null");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "null" + "'", str50, "null");
        org.junit.Assert.assertNotNull(stringJoiner57);
        org.junit.Assert.assertNotNull(stringBuilder60);
        org.junit.Assert.assertEquals(stringBuilder60.toString(), "hi! hi!null");
        org.junit.Assert.assertNotNull(stringJoiner62);
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "hi! hi!null");
        org.junit.Assert.assertNotNull(stringBuilder64);
        org.junit.Assert.assertEquals(stringBuilder64.toString(), "hi! hi!null");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0740");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner67 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder68 = stringJoiner67.sb;
        java.lang.String str69 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder68);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder68);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder68, "          ", true);
        java.lang.String str74 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder68);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder68, "                                                                                                 ", true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner78 = stringJoiner65.append((java.lang.Object) true);
        boolean boolean79 = stringJoiner65.first;
        stringJoiner65.first = false;
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
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner54);
        org.junit.Assert.assertNotNull(stringJoiner56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + " " + "'", str59, " ");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(stringJoiner61);
        org.junit.Assert.assertNotNull(stringJoiner62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(stringJoiner64);
        org.junit.Assert.assertNotNull(stringJoiner65);
        org.junit.Assert.assertNotNull(stringBuilder68);
        org.junit.Assert.assertEquals(stringBuilder68.toString(), "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(stringJoiner78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0741");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("10");
        stringJoiner1.first = true;
        java.lang.String str4 = stringJoiner1.complete();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0742");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str9 = stringJoiner8.separator;
        boolean boolean10 = stringJoiner8.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.append((java.lang.Object) stringJoiner8);
        java.lang.String str12 = stringJoiner6.complete();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0743");
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
        java.lang.StringBuilder stringBuilder66 = stringJoiner37.sb;
        stringJoiner37.first = false;
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
        org.junit.Assert.assertNotNull(stringBuilder66);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0744");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("hi!", strArray8);
        java.lang.String str11 = org.jsoup.internal.StringUtil.join(strArray8, " ");
        boolean boolean12 = org.jsoup.internal.StringUtil.in(" ", strArray8);
        java.lang.String str14 = org.jsoup.internal.StringUtil.join(strArray8, "nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str14, "nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0745");
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
        java.lang.String str22 = stringJoiner1.separator;
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " " + "'", str22, " ");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0746");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!                                                                                                 hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0747");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0748");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0749");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    ", "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0750");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.lang.String str12 = stringJoiner1.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = stringJoiner1.add((java.lang.Object) "");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str17 = stringJoiner16.separator;
        stringJoiner16.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = stringJoiner1.add((java.lang.Object) true);
        java.lang.String str21 = stringJoiner20.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "true");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringJoiner14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " " + "'", str17, " ");
        org.junit.Assert.assertNotNull(stringJoiner20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0751");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric(" class java.lang.StringBuilderclass [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0752");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "     ", true);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "hi!                              hi!", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "hi! hi!nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0753");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.StringBuilder stringBuilder5 = stringJoiner3.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder10 = stringJoiner9.sb;
        java.lang.String str11 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder10);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder10);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder10);
        stringJoiner7.sb = stringBuilder10;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder10);
        stringJoiner3.sb = stringBuilder10;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner1.append((java.lang.Object) stringJoiner3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder20 = stringJoiner19.sb;
        java.lang.Object obj21 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = stringJoiner19.add(obj21);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder25 = stringJoiner24.sb;
        java.lang.StringBuilder stringBuilder26 = stringJoiner24.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder31 = stringJoiner30.sb;
        java.lang.String str32 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder31);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder31);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder31);
        stringJoiner28.sb = stringBuilder31;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder31);
        stringJoiner24.sb = stringBuilder31;
        java.lang.String str38 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder31);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner39 = stringJoiner22.append((java.lang.Object) stringBuilder31);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder42 = stringJoiner41.sb;
        java.lang.Object obj43 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner44 = stringJoiner41.add(obj43);
        java.lang.StringBuilder stringBuilder45 = stringJoiner41.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner47 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder48 = stringJoiner47.sb;
        java.lang.String str49 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder48);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder48);
        stringJoiner41.sb = stringBuilder48;
        stringJoiner39.sb = stringBuilder48;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder48, "hi! hi!", true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner56 = stringJoiner1.add((java.lang.Object) true);
        java.lang.String str57 = stringJoiner56.complete();
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "hi! hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "hi! hi!");
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "hi! hi!");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "hi! hi!");
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "hi! hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "null" + "'", str32, "null");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(stringJoiner39);
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "hi! hi!");
        org.junit.Assert.assertNotNull(stringJoiner44);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "hi! hi!");
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "hi! hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "null" + "'", str49, "null");
        org.junit.Assert.assertNotNull(stringJoiner56);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0754");
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
        boolean boolean33 = stringJoiner32.first;
        java.lang.StringBuilder stringBuilder34 = stringJoiner32.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder34);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi! hi!null" + "'", str31, "hi! hi!null");
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0755");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!null-1.0 null hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0756");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder9 = stringJoiner8.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder9, "                                                                                                 ", false);
        stringJoiner1.sb = stringBuilder9;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = stringJoiner1.append((java.lang.Object) "hi!                              hi!");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner1.add((java.lang.Object) (-1));
        stringJoiner17.first = true;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.0 hi!                              hi!-1");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "null-1.0 hi!                              hi!-1");
        org.junit.Assert.assertNotNull(stringJoiner15);
        org.junit.Assert.assertNotNull(stringJoiner17);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0757");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null-1.0 hi!                              hi!-1 " + "'", str1, "null-1.0 hi!                              hi!-1 ");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0758");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean10 = org.jsoup.internal.StringUtil.in("hi!", strArray9);
        boolean boolean11 = org.jsoup.internal.StringUtil.inSorted("", strArray9);
        boolean boolean12 = org.jsoup.internal.StringUtil.inSorted("10", strArray9);
        java.lang.String str14 = org.jsoup.internal.StringUtil.join(strArray9, "");
        java.lang.String str16 = org.jsoup.internal.StringUtil.join(strArray9, "hi!nullnullhi! hi!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!" + "'", str16, "hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0759");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0760");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0761");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = stringJoiner13.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder19 = stringJoiner18.sb;
        java.lang.String str20 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder19);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder19);
        java.lang.String str22 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder19);
        stringJoiner13.sb = stringBuilder19;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder26 = stringJoiner25.sb;
        java.lang.Object obj27 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = stringJoiner25.add(obj27);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = stringJoiner25.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str33 = stringJoiner32.separator;
        boolean boolean34 = stringJoiner32.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = stringJoiner30.append((java.lang.Object) stringJoiner32);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner36 = stringJoiner13.append((java.lang.Object) stringJoiner35);
        java.lang.Class<?> wildcardClass37 = stringJoiner13.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = stringJoiner11.append((java.lang.Object) wildcardClass37);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = stringJoiner38.append((java.lang.Object) "hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!hi!");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertNotNull(stringJoiner28);
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " " + "'", str33, " ");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(stringJoiner35);
        org.junit.Assert.assertNotNull(stringJoiner36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(stringJoiner38);
        org.junit.Assert.assertNotNull(stringJoiner40);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0762");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0763");
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
        java.lang.String str27 = stringJoiner1.separator;
        boolean boolean28 = stringJoiner1.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = stringJoiner1.add((java.lang.Object) "10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        java.lang.Class<?> wildcardClass31 = stringJoiner30.getClass();
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stringJoiner13);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(stringJoiner26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "     " + "'", str27, "     ");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0764");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("null-1.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0765");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0766");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!", "nullnullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!     nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0767");
        java.lang.String[] strArray1 = org.jsoup.internal.StringUtil.padding;
        java.lang.String str3 = org.jsoup.internal.StringUtil.join(strArray1, "10");
        java.lang.String str5 = org.jsoup.internal.StringUtil.join(strArray1, "hi!                              hi!");
        boolean boolean6 = org.jsoup.internal.StringUtil.in("nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ", strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    " + "'", str5, "hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0768");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("     ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0769");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) '4', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0770");
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
        java.lang.String str24 = stringJoiner17.separator;
        java.lang.String[] strArray30 = new java.lang.String[] { "null", "     ", " " };
        boolean boolean31 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray30);
        boolean boolean32 = org.jsoup.internal.StringUtil.inSorted("     ", strArray30);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner17.add((java.lang.Object) strArray30);
        boolean boolean34 = stringJoiner17.first;
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
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "null", "     ", " " });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0771");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii(" nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0772");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.internal.StringUtil.borrowBuilder();
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        java.lang.String str4 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder0);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder0, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ", true);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder0);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "");
// flaky "18) test0772(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0773");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder9 = stringJoiner8.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder9, "                                                                                                 ", false);
        stringJoiner1.sb = stringBuilder9;
        stringJoiner1.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder18 = stringJoiner17.sb;
        java.lang.Object obj19 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = stringJoiner17.add(obj19);
        java.lang.StringBuilder stringBuilder21 = stringJoiner17.sb;
        java.lang.StringBuilder stringBuilder22 = stringJoiner17.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner1.add((java.lang.Object) stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner20);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "null");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner23);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0774");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        stringJoiner6.first = false;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector10 = org.jsoup.internal.StringUtil.joining(" ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.add((java.lang.Object) " ");
        stringJoiner6.first = true;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(charSequenceCollector10);
        org.junit.Assert.assertNotNull(stringJoiner11);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0775");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "     ", true);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!", false);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ", false);
        java.lang.Class<?> wildcardClass20 = stringBuilder2.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0776");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = stringJoiner11.append((java.lang.Object) true);
        stringJoiner11.first = true;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "true");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringJoiner22);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0777");
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
        java.lang.StringBuilder stringBuilder22 = stringJoiner1.sb;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "true10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "true10");
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "true10");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0778");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("", "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    truehi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0779");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner36 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner36.first = true;
        java.lang.StringBuilder stringBuilder39 = stringJoiner36.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder39);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder39);
        stringJoiner34.sb = stringBuilder39;
        java.lang.StringBuilder stringBuilder43 = stringJoiner34.sb;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "null-1.0");
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
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0780");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("hi!null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0781");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        java.lang.String str5 = stringJoiner1.complete();
        boolean boolean6 = stringJoiner1.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder9 = stringJoiner8.sb;
        java.lang.Object obj10 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner8.add(obj10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = stringJoiner8.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str16 = stringJoiner15.separator;
        boolean boolean17 = stringJoiner15.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = stringJoiner13.append((java.lang.Object) stringJoiner15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        java.lang.Object obj22 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner20.add(obj22);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = stringJoiner18.append((java.lang.Object) stringJoiner20);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder27 = stringJoiner26.sb;
        java.lang.StringBuilder stringBuilder28 = stringJoiner26.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder28);
        stringJoiner24.sb = stringBuilder28;
        java.lang.String str31 = stringJoiner24.separator;
        java.lang.String[] strArray37 = new java.lang.String[] { "null", "     ", " " };
        boolean boolean38 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray37);
        boolean boolean39 = org.jsoup.internal.StringUtil.inSorted("     ", strArray37);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = stringJoiner24.add((java.lang.Object) strArray37);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = stringJoiner1.add((java.lang.Object) stringJoiner40);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringJoiner13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "null", "     ", " " });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(stringJoiner40);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0782");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean5 = org.jsoup.internal.StringUtil.in("hi!", strArray4);
        boolean boolean6 = org.jsoup.internal.StringUtil.inSorted("hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0783");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner3.add(obj5);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner3.add((java.lang.Object) (-1.0d));
        stringJoiner8.first = false;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector12 = org.jsoup.internal.StringUtil.joining(" ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = stringJoiner8.add((java.lang.Object) " ");
        boolean boolean14 = stringJoiner13.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder17 = stringJoiner16.sb;
        stringJoiner13.sb = stringBuilder17;
        java.lang.String str19 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder17);
        stringJoiner1.sb = stringBuilder17;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder23 = stringJoiner22.sb;
        java.lang.Object obj24 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = stringJoiner22.add(obj24);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str28 = stringJoiner27.separator;
        boolean boolean29 = stringJoiner27.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder32 = stringJoiner31.sb;
        java.lang.String str33 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder32);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder32, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder32, " ", true);
        stringJoiner27.sb = stringBuilder32;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder32);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder32, "nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ", false);
        stringJoiner22.sb = stringBuilder32;
        java.lang.String str46 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder32);
        stringJoiner1.sb = stringBuilder32;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertNotNull(charSequenceCollector12);
        org.junit.Assert.assertNotNull(stringJoiner13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " " + "'", str28, " ");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 " + "'", str46, "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0784");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("hi! hi!");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0785");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str1, "nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0786");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        stringJoiner3.first = true;
        boolean boolean7 = stringJoiner3.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner1.append((java.lang.Object) boolean7);
        java.lang.String str9 = stringJoiner1.separator;
        java.lang.StringBuilder stringBuilder10 = stringJoiner1.sb;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "true");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "true");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0787");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder4);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder4, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder4, "     ", true);
        stringJoiner1.sb = stringBuilder4;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        java.lang.String str16 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder15);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder15, "          ", true);
        java.lang.String str21 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        stringJoiner1.sb = stringBuilder15;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder15, "10", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder15, "nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!", false);
        java.lang.String str29 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!" + "'", str29, "10nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0788");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder28 = stringJoiner27.sb;
        stringJoiner27.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder33 = stringJoiner32.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder33, "", false);
        stringJoiner27.sb = stringBuilder33;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = stringJoiner25.append((java.lang.Object) stringBuilder33);
        java.lang.String str39 = stringJoiner25.complete();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(charSequenceCollector10);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(stringJoiner25);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner38);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0789");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          " + "'", str1, "          ");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0790");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0791");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder28 = stringJoiner27.sb;
        stringJoiner27.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder33 = stringJoiner32.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder33, "", false);
        stringJoiner27.sb = stringBuilder33;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = stringJoiner25.append((java.lang.Object) stringBuilder33);
        java.lang.String str39 = stringJoiner25.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.0 ");
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
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0792");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline(" class java.lang.StringBuilderclass [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0793");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "     ", true);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        java.lang.String str11 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        java.lang.String str12 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0794");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                ");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0795");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0796");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray11);
        java.lang.String str16 = org.jsoup.internal.StringUtil.join(strArray11, "                                                                                                 ");
        java.lang.String str18 = org.jsoup.internal.StringUtil.join(strArray11, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        java.lang.String str20 = org.jsoup.internal.StringUtil.join(strArray11, "hi!nullnullhi! hi!");
        boolean boolean21 = org.jsoup.internal.StringUtil.in("null-1.0 ", strArray11);
        boolean boolean22 = org.jsoup.internal.StringUtil.inSorted("     ", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str16, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!" + "'", str18, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!" + "'", str20, "hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0797");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0798");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0799");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0800");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) ' ', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0801");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.StringBuilder stringBuilder5 = stringJoiner1.sb;
        java.lang.StringBuilder stringBuilder6 = stringJoiner1.sb;
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder6);
        java.lang.Class<?> wildcardClass8 = stringBuilder6.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0802");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str2 = stringJoiner1.separator;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.internal.StringUtil.inSorted("          ", strArray8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner1.append((java.lang.Object) "          ");
        java.lang.StringBuilder stringBuilder12 = stringJoiner11.sb;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "          ");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0803");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder5 = stringJoiner4.sb;
        stringJoiner1.sb = stringBuilder5;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder9 = stringJoiner8.sb;
        stringJoiner8.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder14, "", false);
        stringJoiner8.sb = stringBuilder14;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder14, "", false);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = stringJoiner1.append((java.lang.Object) stringBuilder14);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean35 = org.jsoup.internal.StringUtil.in("hi!", strArray34);
        boolean boolean36 = org.jsoup.internal.StringUtil.inSorted("", strArray34);
        boolean boolean37 = org.jsoup.internal.StringUtil.inSorted("10", strArray34);
        boolean boolean38 = org.jsoup.internal.StringUtil.in("hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    ", strArray34);
        boolean boolean39 = org.jsoup.internal.StringUtil.in("", strArray34);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = stringJoiner22.append((java.lang.Object) "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "          ");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "          ");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(stringJoiner40);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0804");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean10 = org.jsoup.internal.StringUtil.in("hi!", strArray9);
        java.lang.String str12 = org.jsoup.internal.StringUtil.join(strArray9, " ");
        boolean boolean13 = org.jsoup.internal.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray9);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("hi!10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "     " + "'", str12, "     ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0805");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        java.lang.String str5 = stringJoiner1.separator;
        stringJoiner1.first = false;
        java.lang.StringBuilder stringBuilder8 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder11 = stringJoiner10.sb;
        java.lang.Object obj12 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = stringJoiner10.add(obj12);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder16 = stringJoiner15.sb;
        java.lang.StringBuilder stringBuilder17 = stringJoiner15.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder22 = stringJoiner21.sb;
        java.lang.String str23 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder22);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder22);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder22);
        stringJoiner19.sb = stringBuilder22;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder22);
        stringJoiner15.sb = stringBuilder22;
        java.lang.String str29 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder22);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = stringJoiner13.append((java.lang.Object) stringBuilder22);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder33 = stringJoiner32.sb;
        java.lang.Object obj34 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = stringJoiner32.add(obj34);
        java.lang.StringBuilder stringBuilder36 = stringJoiner32.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder39 = stringJoiner38.sb;
        java.lang.String str40 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder39);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder39);
        stringJoiner32.sb = stringBuilder39;
        stringJoiner30.sb = stringBuilder39;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder39, "hi! hi!", true);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder39);
        stringJoiner1.sb = stringBuilder39;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner13);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner35);
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "null" + "'", str40, "null");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0806");
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
        boolean boolean23 = stringJoiner18.first;
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0807");
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
        java.lang.String str22 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder13);
        java.lang.String str23 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder13);
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "19) test0807(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
// flaky "6) test0807(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder7.toString(), "null");
        org.junit.Assert.assertNotNull(stringBuilder8);
// flaky "1) test0807(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder8.toString(), "null");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0808");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0809");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("null-1.010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0810");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean6 = org.jsoup.internal.StringUtil.in("hi!", strArray5);
        boolean boolean7 = org.jsoup.internal.StringUtil.inSorted("                              ", strArray5);
        boolean boolean8 = org.jsoup.internal.StringUtil.inSorted("hi!null-1.0 hi!                              hi!", strArray5);
        java.lang.String str10 = org.jsoup.internal.StringUtil.join(strArray5, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!" + "'", str10, "hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0811");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0812");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        java.lang.String str8 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder7);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder7);
        stringJoiner1.sb = stringBuilder7;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder7);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0813");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner1.first = true;
        java.lang.StringBuilder stringBuilder4 = stringJoiner1.sb;
        java.lang.String str5 = stringJoiner1.separator;
        java.lang.String str6 = stringJoiner1.separator;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0814");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                ");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0815");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder28 = stringJoiner27.sb;
        stringJoiner27.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder33 = stringJoiner32.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder33, "", false);
        stringJoiner27.sb = stringBuilder33;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = stringJoiner25.append((java.lang.Object) stringBuilder33);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = new org.jsoup.internal.StringUtil.StringJoiner("nullhi!                              hi!");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = stringJoiner25.add((java.lang.Object) stringJoiner40);
        java.lang.Object obj42 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner43 = stringJoiner40.add(obj42);
        boolean boolean44 = stringJoiner43.first;
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
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertNotNull(stringJoiner38);
        org.junit.Assert.assertNotNull(stringJoiner41);
        org.junit.Assert.assertNotNull(stringJoiner43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0816");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0817");
        java.lang.String[] strArray2 = org.jsoup.internal.StringUtil.padding;
        java.lang.String str4 = org.jsoup.internal.StringUtil.join(strArray2, "10");
        java.lang.String str6 = org.jsoup.internal.StringUtil.join(strArray2, "hi!                              hi!");
        boolean boolean7 = org.jsoup.internal.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", strArray2);
        boolean boolean8 = org.jsoup.internal.StringUtil.inSorted("null-1.0 ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    " + "'", str6, "hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0818");
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
        stringJoiner25.first = true;
        boolean boolean28 = stringJoiner25.first;
        java.lang.String str29 = stringJoiner25.complete();
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
        org.junit.Assert.assertNotNull(stringJoiner25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0819");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("     ");
        boolean boolean2 = stringJoiner1.first;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0820");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean13 = org.jsoup.internal.StringUtil.in("hi!", strArray12);
        boolean boolean14 = org.jsoup.internal.StringUtil.in(" ", strArray12);
        boolean boolean15 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray12);
        java.lang.String str17 = org.jsoup.internal.StringUtil.join(strArray12, "                              ");
        boolean boolean18 = org.jsoup.internal.StringUtil.inSorted("hi! hi!", strArray12);
        boolean boolean19 = org.jsoup.internal.StringUtil.in("", strArray12);
        boolean boolean20 = org.jsoup.internal.StringUtil.inSorted("null", strArray12);
        java.lang.String str22 = org.jsoup.internal.StringUtil.join(strArray12, "hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    ");
        boolean boolean23 = org.jsoup.internal.StringUtil.in("     ", strArray12);
        boolean boolean24 = org.jsoup.internal.StringUtil.in("null-1.0 ", strArray12);
        boolean boolean25 = org.jsoup.internal.StringUtil.in("hi!null-1.0 null                hi!", strArray12);
        boolean boolean26 = org.jsoup.internal.StringUtil.inSorted("     ", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!                              hi!" + "'", str17, "hi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!" + "'", str22, "hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0821");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray11);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("                              ", strArray11);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("hi! hi!null", strArray11);
        java.lang.String str18 = org.jsoup.internal.StringUtil.join(strArray11, "null true true ");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null true true null true true null true true null true true null true true " + "'", str18, "null true true null true true null true true null true true null true true ");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0822");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ", "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0823");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0824");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: width must be >= 0");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0825");
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
        java.lang.StringBuilder stringBuilder25 = stringJoiner1.sb;
        stringJoiner1.first = true;
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
        org.junit.Assert.assertNotNull(stringBuilder25);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0826");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        java.lang.String str2 = stringJoiner1.complete();
        boolean boolean3 = stringJoiner1.first;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0827");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0828");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector13 = org.jsoup.internal.StringUtil.joining("          ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = stringJoiner1.add((java.lang.Object) charSequenceCollector13);
        java.lang.String str15 = stringJoiner1.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertNotNull(charSequenceCollector13);
        org.junit.Assert.assertNotNull(stringJoiner14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0829");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("hi!hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!hi!");
        java.lang.Class<?> wildcardClass2 = charSequenceCollector1.getClass();
        org.junit.Assert.assertNotNull(charSequenceCollector1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0830");
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
        java.lang.String str18 = stringJoiner17.complete();
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
        java.lang.Object obj34 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = stringJoiner32.add(obj34);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner36 = stringJoiner30.append((java.lang.Object) stringJoiner32);
        java.lang.StringBuilder stringBuilder37 = stringJoiner32.sb;
        java.lang.StringBuilder stringBuilder38 = stringJoiner32.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = stringJoiner32.append((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = stringJoiner17.add((java.lang.Object) stringJoiner32);
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
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " " + "'", str28, " ");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "null10.0");
        org.junit.Assert.assertNotNull(stringJoiner35);
        org.junit.Assert.assertNotNull(stringJoiner36);
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "null10.0");
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "null10.0");
        org.junit.Assert.assertNotNull(stringJoiner40);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0831");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray11);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("                              ", strArray11);
        boolean boolean16 = org.jsoup.internal.StringUtil.inSorted("hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!", strArray11);
        java.lang.String str18 = org.jsoup.internal.StringUtil.join(strArray11, "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null" + "'", str18, "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0832");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner45 = stringJoiner43.append((java.lang.Object) "          ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner47 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner47.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner51 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder52 = stringJoiner51.sb;
        java.lang.String str53 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder52);
        stringJoiner47.sb = stringBuilder52;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder52, "                                                                                                 ", true);
        stringJoiner45.sb = stringBuilder52;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder52);
        stringJoiner41.sb = stringBuilder52;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner62 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder63 = stringJoiner62.sb;
        java.lang.StringBuilder stringBuilder64 = stringJoiner62.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner66 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner68 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder69 = stringJoiner68.sb;
        java.lang.String str70 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder69);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder69);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder69);
        stringJoiner66.sb = stringBuilder69;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder69);
        stringJoiner62.sb = stringBuilder69;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner76 = stringJoiner41.append((java.lang.Object) stringBuilder69);
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
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "          ");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(stringJoiner41);
        org.junit.Assert.assertNotNull(stringJoiner45);
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder64);
        org.junit.Assert.assertEquals(stringBuilder64.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder69);
        org.junit.Assert.assertEquals(stringBuilder69.toString(), "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(stringJoiner76);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0833");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder9 = stringJoiner8.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder9, "                                                                                                 ", false);
        stringJoiner1.sb = stringBuilder9;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = stringJoiner1.append((java.lang.Object) "hi!                              hi!");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner1.add((java.lang.Object) (-1));
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean30 = org.jsoup.internal.StringUtil.in("hi!", strArray29);
        boolean boolean31 = org.jsoup.internal.StringUtil.inSorted("", strArray29);
        boolean boolean32 = org.jsoup.internal.StringUtil.inSorted("10", strArray29);
        boolean boolean33 = org.jsoup.internal.StringUtil.in("hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    ", strArray29);
        boolean boolean34 = org.jsoup.internal.StringUtil.in("", strArray29);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = stringJoiner1.add((java.lang.Object) boolean34);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.0 hi!                              hi!-1true");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "null-1.0 hi!                              hi!-1true");
        org.junit.Assert.assertNotNull(stringJoiner15);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(stringJoiner35);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0834");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: width must be >= 0");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0835");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 0, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0836");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      hi!", "10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0837");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0838");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0839");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        java.lang.StringBuilder stringBuilder6 = stringJoiner1.sb;
        stringJoiner1.first = false;
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "20) test0839(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
// flaky "7) test0839(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0840");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!null-1.0 hi!");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0841");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        java.lang.Class<?> wildcardClass2 = stringJoiner1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0842");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.in(" ", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray11);
        java.lang.String str16 = org.jsoup.internal.StringUtil.join(strArray11, "                              ");
        boolean boolean17 = org.jsoup.internal.StringUtil.inSorted("hi! hi!", strArray11);
        boolean boolean18 = org.jsoup.internal.StringUtil.in("", strArray11);
        boolean boolean19 = org.jsoup.internal.StringUtil.inSorted("null", strArray11);
        java.lang.String str21 = org.jsoup.internal.StringUtil.join(strArray11, "hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    ");
        boolean boolean22 = org.jsoup.internal.StringUtil.in("     ", strArray11);
        boolean boolean23 = org.jsoup.internal.StringUtil.in("null-1.0 ", strArray11);
        boolean boolean24 = org.jsoup.internal.StringUtil.inSorted("nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!                              hi!" + "'", str16, "hi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!" + "'", str21, "hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0843");
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
        java.lang.Class<?> wildcardClass22 = stringJoiner1.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "21) test0843(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0844");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("", "hi!10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0845");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
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
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0846");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
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
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0847");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner42 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder43 = stringJoiner42.sb;
        java.lang.Object obj44 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner45 = stringJoiner42.add(obj44);
        java.lang.StringBuilder stringBuilder46 = stringJoiner42.sb;
        java.lang.StringBuilder stringBuilder47 = stringJoiner42.sb;
        stringJoiner1.sb = stringBuilder47;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder47);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner28);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "null" + "'", str33, "null");
        org.junit.Assert.assertNotNull(stringJoiner40);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner45);
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0848");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean7 = org.jsoup.internal.StringUtil.in("hi!", strArray6);
        boolean boolean8 = org.jsoup.internal.StringUtil.in(" ", strArray6);
        boolean boolean9 = org.jsoup.internal.StringUtil.inSorted("     ", strArray6);
        java.lang.String str11 = org.jsoup.internal.StringUtil.join(strArray6, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        boolean boolean12 = org.jsoup.internal.StringUtil.in("10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ", strArray6);
        java.lang.String str14 = org.jsoup.internal.StringUtil.join(strArray6, "10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        java.lang.Class<?> wildcardClass15 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str11, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!" + "'", str14, "hi!10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0849");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean13 = org.jsoup.internal.StringUtil.in("hi!", strArray12);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("", strArray12);
        boolean boolean15 = org.jsoup.internal.StringUtil.inSorted("10", strArray12);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("null-1.0 ", strArray12);
        boolean boolean17 = org.jsoup.internal.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray12);
        boolean boolean18 = org.jsoup.internal.StringUtil.in("nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0850");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0851");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.StringBuilder stringBuilder5 = stringJoiner3.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder10 = stringJoiner9.sb;
        java.lang.String str11 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder10);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder10);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder10);
        stringJoiner7.sb = stringBuilder10;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder10);
        stringJoiner3.sb = stringBuilder10;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner1.append((java.lang.Object) stringJoiner3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner19.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder24 = stringJoiner23.sb;
        java.lang.String str25 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder24);
        stringJoiner19.sb = stringBuilder24;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder24, "                                                                                                 ", true);
        stringJoiner3.sb = stringBuilder24;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder24);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0852");
        java.lang.String[] strArray5 = new java.lang.String[] { "null", "     ", " " };
        boolean boolean6 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray5);
        java.lang.String str8 = org.jsoup.internal.StringUtil.join(strArray5, "     ");
        java.lang.String str10 = org.jsoup.internal.StringUtil.join(strArray5, "null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        boolean boolean11 = org.jsoup.internal.StringUtil.inSorted("hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "null", "     ", " " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null                " + "'", str8, "null                ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     " + "'", str10, "nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0853");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!" + "'", str1, "hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0854");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner1.append((java.lang.Object) 10);
        java.lang.String str9 = stringJoiner8.separator;
        java.lang.String str10 = stringJoiner8.separator;
        java.lang.String str11 = stringJoiner8.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.010");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0855");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        java.lang.StringBuilder stringBuilder6 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder9 = stringJoiner8.sb;
        stringJoiner8.first = true;
        boolean boolean12 = stringJoiner8.first;
        stringJoiner8.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder17 = stringJoiner16.sb;
        java.lang.StringBuilder stringBuilder18 = stringJoiner16.sb;
        stringJoiner8.sb = stringBuilder18;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = stringJoiner1.add((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder23 = stringJoiner22.sb;
        stringJoiner22.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder28 = stringJoiner27.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder28, "", false);
        stringJoiner22.sb = stringBuilder28;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = stringJoiner22.append((java.lang.Object) (-1L));
        java.lang.String str35 = stringJoiner34.separator;
        java.lang.String str36 = stringJoiner34.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder39 = stringJoiner38.sb;
        java.lang.String str40 = stringJoiner38.separator;
        java.lang.StringBuilder stringBuilder41 = stringJoiner38.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner43 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder44 = stringJoiner43.sb;
        java.lang.Object obj45 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner46 = stringJoiner43.add(obj45);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner48 = stringJoiner43.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner50 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str51 = stringJoiner50.separator;
        boolean boolean52 = stringJoiner50.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner53 = stringJoiner48.append((java.lang.Object) stringJoiner50);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner55 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder56 = stringJoiner55.sb;
        java.lang.Object obj57 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner58 = stringJoiner55.add(obj57);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner59 = stringJoiner53.append((java.lang.Object) stringJoiner55);
        stringJoiner55.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner62 = stringJoiner38.add((java.lang.Object) true);
        boolean boolean63 = stringJoiner62.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner64 = stringJoiner34.add((java.lang.Object) boolean63);
        java.lang.Class<?> wildcardClass65 = stringJoiner64.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner66 = stringJoiner8.add((java.lang.Object) wildcardClass65);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertNotNull(stringJoiner20);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertNotNull(stringJoiner34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertNotNull(stringJoiner46);
        org.junit.Assert.assertNotNull(stringJoiner48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + " " + "'", str51, " ");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(stringJoiner53);
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner58);
        org.junit.Assert.assertNotNull(stringJoiner59);
        org.junit.Assert.assertNotNull(stringJoiner62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(stringJoiner64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(stringJoiner66);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0856");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = stringJoiner11.append((java.lang.Object) true);
        java.lang.StringBuilder stringBuilder23 = stringJoiner11.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder26 = stringJoiner25.sb;
        java.lang.Object obj27 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = stringJoiner25.add(obj27);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = stringJoiner25.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str33 = stringJoiner32.separator;
        boolean boolean34 = stringJoiner32.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = stringJoiner30.append((java.lang.Object) stringJoiner32);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner37 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder38 = stringJoiner37.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = stringJoiner37.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner42 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder43 = stringJoiner42.sb;
        java.lang.String str44 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder43);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder43);
        java.lang.String str46 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder43);
        stringJoiner37.sb = stringBuilder43;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner49 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder50 = stringJoiner49.sb;
        java.lang.Object obj51 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner52 = stringJoiner49.add(obj51);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner54 = stringJoiner49.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner56 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str57 = stringJoiner56.separator;
        boolean boolean58 = stringJoiner56.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner59 = stringJoiner54.append((java.lang.Object) stringJoiner56);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner60 = stringJoiner37.append((java.lang.Object) stringJoiner59);
        java.lang.Class<?> wildcardClass61 = stringJoiner37.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner62 = stringJoiner35.append((java.lang.Object) wildcardClass61);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner63 = stringJoiner11.append((java.lang.Object) stringJoiner35);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner65 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder66 = stringJoiner65.sb;
        java.lang.Object obj67 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner68 = stringJoiner65.add(obj67);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner70 = stringJoiner65.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner72 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder73 = stringJoiner72.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder73, "                                                                                                 ", false);
        stringJoiner65.sb = stringBuilder73;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder73);
        java.lang.String str79 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder73);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner80 = stringJoiner11.add((java.lang.Object) str79);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertNotNull(stringJoiner28);
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " " + "'", str33, " ");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(stringJoiner35);
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner40);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertNotNull(stringJoiner52);
        org.junit.Assert.assertNotNull(stringJoiner54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + " " + "'", str57, " ");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(stringJoiner59);
        org.junit.Assert.assertNotNull(stringJoiner60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(stringJoiner62);
        org.junit.Assert.assertNotNull(stringJoiner63);
        org.junit.Assert.assertNotNull(stringBuilder66);
        org.junit.Assert.assertNotNull(stringJoiner68);
        org.junit.Assert.assertNotNull(stringJoiner70);
        org.junit.Assert.assertNotNull(stringBuilder73);
        org.junit.Assert.assertEquals(stringBuilder73.toString(), "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(stringJoiner80);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0857");
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
        java.lang.StringBuilder stringBuilder19 = stringJoiner18.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder19);
        org.junit.Assert.assertNotNull(stringBuilder2);
// flaky "22) test0857(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder2.toString(), "nullnull");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0858");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("10", strArray11);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    ", strArray11);
        boolean boolean16 = org.jsoup.internal.StringUtil.inSorted("nullnullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!     nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi! ", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0859");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        stringJoiner1.sb = stringBuilder4;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder4);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder4);
        java.lang.String str11 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder4);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0860");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("class java.lang.StringBuilderclass [Ljava.lang.String;10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0861");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("10nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0862");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner67 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder68 = stringJoiner67.sb;
        java.lang.String str69 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder68);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder68);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder68, "          ", true);
        java.lang.String str74 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder68);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder68, "                                                                                                 ", true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner78 = stringJoiner65.append((java.lang.Object) true);
        boolean boolean79 = stringJoiner65.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner81 = stringJoiner65.append((java.lang.Object) 1L);
        stringJoiner81.first = true;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "true1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "true1");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "true1");
        org.junit.Assert.assertNotNull(stringJoiner9);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "true1");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertNotNull(stringJoiner25);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "true1");
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " " + "'", str35, " ");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(stringJoiner37);
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "true1");
        org.junit.Assert.assertNotNull(stringJoiner42);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "true1");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "true1");
        org.junit.Assert.assertNotNull(stringJoiner54);
        org.junit.Assert.assertNotNull(stringJoiner56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + " " + "'", str59, " ");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(stringJoiner61);
        org.junit.Assert.assertNotNull(stringJoiner62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(stringJoiner64);
        org.junit.Assert.assertNotNull(stringJoiner65);
        org.junit.Assert.assertNotNull(stringBuilder68);
        org.junit.Assert.assertEquals(stringBuilder68.toString(), "true1");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(stringJoiner78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(stringJoiner81);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0863");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi! hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0864");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("10", strArray11);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("          ", strArray11);
        java.lang.String str17 = org.jsoup.internal.StringUtil.join(strArray11, "nullhi!                              hi!");
        java.lang.String str19 = org.jsoup.internal.StringUtil.join(strArray11, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        boolean boolean20 = org.jsoup.internal.StringUtil.inSorted("10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "true1nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!" + "'", str17, "true1nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 " + "'", str19, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0865");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        java.lang.StringBuilder stringBuilder6 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder9 = stringJoiner8.sb;
        stringJoiner8.first = true;
        boolean boolean12 = stringJoiner8.first;
        stringJoiner8.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder17 = stringJoiner16.sb;
        java.lang.StringBuilder stringBuilder18 = stringJoiner16.sb;
        stringJoiner8.sb = stringBuilder18;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = stringJoiner1.add((java.lang.Object) stringJoiner8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder23 = stringJoiner22.sb;
        java.lang.Object obj24 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = stringJoiner22.add(obj24);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = stringJoiner22.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str30 = stringJoiner29.separator;
        boolean boolean31 = stringJoiner29.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = stringJoiner27.append((java.lang.Object) stringJoiner29);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder35 = stringJoiner34.sb;
        java.lang.Object obj36 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner37 = stringJoiner34.add(obj36);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = stringJoiner32.append((java.lang.Object) stringJoiner34);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder41 = stringJoiner40.sb;
        java.lang.StringBuilder stringBuilder42 = stringJoiner40.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder42);
        stringJoiner38.sb = stringBuilder42;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner46 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder47 = stringJoiner46.sb;
        java.lang.Object obj48 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner49 = stringJoiner46.add(obj48);
        java.lang.Object obj50 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner51 = stringJoiner46.append(obj50);
        java.lang.String str52 = stringJoiner51.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner54 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder55 = stringJoiner54.sb;
        java.lang.Object obj56 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner57 = stringJoiner54.add(obj56);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner59 = stringJoiner54.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner61 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str62 = stringJoiner61.separator;
        boolean boolean63 = stringJoiner61.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner64 = stringJoiner59.append((java.lang.Object) stringJoiner61);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner66 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder67 = stringJoiner66.sb;
        java.lang.Object obj68 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner69 = stringJoiner66.add(obj68);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner70 = stringJoiner64.append((java.lang.Object) stringJoiner66);
        java.lang.StringBuilder stringBuilder71 = stringJoiner66.sb;
        java.lang.String str72 = stringJoiner66.complete();
        java.lang.String str73 = stringJoiner66.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner74 = stringJoiner51.add((java.lang.Object) str73);
        stringJoiner51.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner77 = stringJoiner38.add((java.lang.Object) false);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner78 = stringJoiner1.append((java.lang.Object) stringJoiner38);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertNotNull(stringJoiner20);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertNotNull(stringJoiner25);
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " " + "'", str30, " ");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner37);
        org.junit.Assert.assertNotNull(stringJoiner38);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "nullnullfalse");
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "nullnullfalse");
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "nullnullfalse");
        org.junit.Assert.assertNotNull(stringJoiner49);
        org.junit.Assert.assertNotNull(stringJoiner51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertNotNull(stringJoiner57);
        org.junit.Assert.assertNotNull(stringJoiner59);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + " " + "'", str62, " ");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(stringJoiner64);
        org.junit.Assert.assertNotNull(stringBuilder67);
        org.junit.Assert.assertEquals(stringBuilder67.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner69);
        org.junit.Assert.assertNotNull(stringJoiner70);
        org.junit.Assert.assertNotNull(stringBuilder71);
        org.junit.Assert.assertEquals(stringBuilder71.toString(), "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "null" + "'", str72, "null");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(stringJoiner74);
        org.junit.Assert.assertNotNull(stringJoiner77);
        org.junit.Assert.assertNotNull(stringJoiner78);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0866");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.StringBuilder stringBuilder3 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder8 = stringJoiner7.sb;
        java.lang.String str9 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder8);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder8);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder8);
        stringJoiner5.sb = stringBuilder8;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder8);
        stringJoiner1.sb = stringBuilder8;
        boolean boolean15 = stringJoiner1.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0867");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean6 = org.jsoup.internal.StringUtil.in("hi!", strArray5);
        boolean boolean7 = org.jsoup.internal.StringUtil.in(" ", strArray5);
        boolean boolean8 = org.jsoup.internal.StringUtil.inSorted("     ", strArray5);
        java.lang.String str10 = org.jsoup.internal.StringUtil.join(strArray5, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        java.lang.String str12 = org.jsoup.internal.StringUtil.join(strArray5, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        java.lang.String str14 = org.jsoup.internal.StringUtil.join(strArray5, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str10, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str12, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hi!" + "'", str14, "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hi!");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0868");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        java.lang.String str2 = stringJoiner1.complete();
        java.lang.StringBuilder stringBuilder3 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner5.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder11 = stringJoiner10.sb;
        java.lang.String str12 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder11);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder11);
        java.lang.String str14 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder11);
        stringJoiner5.sb = stringBuilder11;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder18 = stringJoiner17.sb;
        java.lang.Object obj19 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = stringJoiner17.add(obj19);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = stringJoiner17.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str25 = stringJoiner24.separator;
        boolean boolean26 = stringJoiner24.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = stringJoiner22.append((java.lang.Object) stringJoiner24);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = stringJoiner5.append((java.lang.Object) stringJoiner27);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder31 = stringJoiner30.sb;
        java.lang.Object obj32 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner30.add(obj32);
        java.lang.Object obj34 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = stringJoiner30.append(obj34);
        java.lang.String str36 = stringJoiner35.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner37 = stringJoiner28.add((java.lang.Object) stringJoiner35);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = stringJoiner1.add((java.lang.Object) stringJoiner28);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(stringBuilder3);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertNotNull(stringJoiner20);
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " " + "'", str25, " ");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(stringJoiner28);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertNotNull(stringJoiner35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(stringJoiner37);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0869");
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
        java.lang.String str21 = stringJoiner17.complete();
        java.lang.String str22 = stringJoiner17.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0870");
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
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder18);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertNotNull(charSequenceCollector13);
        org.junit.Assert.assertNotNull(stringJoiner14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0871");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0872");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(100, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0873");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0874");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi!null-1.0 null hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!null-1.0 null hi!" + "'", str1, "hi!null-1.0 null hi!");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0875");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        stringJoiner6.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder11 = stringJoiner10.sb;
        java.lang.Object obj12 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = stringJoiner10.add(obj12);
        java.lang.StringBuilder stringBuilder14 = stringJoiner10.sb;
        java.lang.String str15 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder14);
        stringJoiner6.sb = stringBuilder14;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder14, "10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertNotNull(stringJoiner13);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null-1.0null" + "'", str15, "null-1.0null");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0876");
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
        java.lang.String str17 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        java.lang.String str18 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(charSequenceCollector10);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0877");
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
        java.lang.StringBuilder stringBuilder27 = stringJoiner26.sb;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertNotNull(stringJoiner26);
        org.junit.Assert.assertNotNull(stringBuilder27);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0878");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("null true true null true true null true true null true true null true true ", "hi!null-1.0 null                hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0879");
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
        java.lang.StringBuilder stringBuilder47 = stringJoiner46.sb;
        org.junit.Assert.assertNotNull(stringBuilder2);
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
        org.junit.Assert.assertNotNull(stringBuilder47);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0880");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!null-1.0 null                hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0881");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean6 = org.jsoup.internal.StringUtil.in("hi!", strArray5);
        boolean boolean7 = org.jsoup.internal.StringUtil.in(" ", strArray5);
        boolean boolean8 = org.jsoup.internal.StringUtil.inSorted("     ", strArray5);
        java.lang.String str10 = org.jsoup.internal.StringUtil.join(strArray5, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        java.lang.String str12 = org.jsoup.internal.StringUtil.join(strArray5, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        java.lang.String str14 = org.jsoup.internal.StringUtil.join(strArray5, "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str10, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str12, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi!" + "'", str14, "hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi!");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0882");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!hi!nullnullhi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0883");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric(" nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0884");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0885");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.append(obj5);
        java.lang.String str7 = stringJoiner1.separator;
        java.lang.String str8 = stringJoiner1.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder11 = stringJoiner10.sb;
        stringJoiner10.first = true;
        java.lang.String str14 = stringJoiner10.separator;
        stringJoiner10.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder19 = stringJoiner18.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner18.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder24 = stringJoiner23.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder24, "", false);
        java.lang.String str28 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder24);
        stringJoiner18.sb = stringBuilder24;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = stringJoiner10.append((java.lang.Object) stringBuilder24);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder33 = stringJoiner32.sb;
        java.lang.String str34 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder33);
        java.lang.Class<?> wildcardClass35 = stringBuilder33.getClass();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner36 = stringJoiner10.add((java.lang.Object) wildcardClass35);
        stringJoiner36.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner39 = stringJoiner1.add((java.lang.Object) true);
        boolean boolean40 = stringJoiner39.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!hi!nullnulltrue");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), " class java.lang.StringBuilder");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(stringJoiner36);
        org.junit.Assert.assertNotNull(stringJoiner39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0886");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        java.lang.StringBuilder stringBuilder6 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder9 = stringJoiner8.sb;
        stringJoiner8.first = true;
        boolean boolean12 = stringJoiner8.first;
        stringJoiner8.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder17 = stringJoiner16.sb;
        java.lang.StringBuilder stringBuilder18 = stringJoiner16.sb;
        stringJoiner8.sb = stringBuilder18;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = stringJoiner1.add((java.lang.Object) stringJoiner8);
        stringJoiner20.first = true;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner20);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0887");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null" + "'", str1, "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0888");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        stringJoiner6.first = false;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector10 = org.jsoup.internal.StringUtil.joining(" ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner6.add((java.lang.Object) " ");
        boolean boolean12 = stringJoiner11.first;
        java.lang.StringBuilder stringBuilder13 = stringJoiner11.sb;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(charSequenceCollector10);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "null-1.0 ");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0889");
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
        java.lang.Class<?> wildcardClass66 = stringJoiner25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0890");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "     ", true);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "hi!                              hi!", true);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
// flaky "23) test0890(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0891");
        java.lang.String[] strArray5 = new java.lang.String[] { "null", "     ", " " };
        boolean boolean6 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray5);
        java.lang.String str8 = org.jsoup.internal.StringUtil.join(strArray5, "     ");
        java.lang.String str10 = org.jsoup.internal.StringUtil.join(strArray5, "nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        boolean boolean11 = org.jsoup.internal.StringUtil.in("nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "null", "     ", " " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null                " + "'", str8, "null                ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "nullnullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!     nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi! " + "'", str10, "nullnullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!     nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi! ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0892");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.StringBuilder stringBuilder3 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        stringJoiner5.first = true;
        boolean boolean9 = stringJoiner5.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder14 = stringJoiner13.sb;
        java.lang.String str15 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder14);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder14);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder14);
        stringJoiner11.sb = stringBuilder14;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder14);
        java.lang.String str20 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder14);
        stringJoiner5.sb = stringBuilder14;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = stringJoiner1.add((java.lang.Object) stringJoiner5);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stringBuilder14);
// flaky "24) test0892(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringJoiner22);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0893");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
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
        java.lang.StringBuilder stringBuilder18 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder18);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
// flaky "25) test0893(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0894");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 10");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0895");
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
        java.lang.String str24 = stringJoiner17.separator;
        java.lang.String str25 = stringJoiner17.complete();
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
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0896");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("nullnullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!     nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nullnullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi! nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi! " + "'", str1, "nullnullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi! nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi! ");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0897");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder4);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder4, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder4, "     ", true);
        stringJoiner1.sb = stringBuilder4;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        java.lang.String str16 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder15);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder15, "          ", true);
        java.lang.String str21 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        stringJoiner1.sb = stringBuilder15;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder25 = stringJoiner24.sb;
        java.lang.Object obj26 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = stringJoiner24.add(obj26);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = stringJoiner24.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder32 = stringJoiner31.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder32, "                                                                                                 ", false);
        stringJoiner24.sb = stringBuilder32;
        stringJoiner1.sb = stringBuilder32;
        java.lang.String str38 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder32);
        java.lang.String str39 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder32);
        java.lang.String str40 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder32);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(stringJoiner29);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null-1.0 " + "'", str38, "null-1.0 ");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0898");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner48 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder49 = stringJoiner48.sb;
        stringJoiner48.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner53 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder54 = stringJoiner53.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder54, "", false);
        stringJoiner48.sb = stringBuilder54;
        java.lang.String str59 = stringJoiner48.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner61 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder62 = stringJoiner61.sb;
        java.lang.Object obj63 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner64 = stringJoiner61.add(obj63);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner66 = stringJoiner61.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner68 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str69 = stringJoiner68.separator;
        boolean boolean70 = stringJoiner68.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner71 = stringJoiner66.append((java.lang.Object) stringJoiner68);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner73 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder74 = stringJoiner73.sb;
        java.lang.Object obj75 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner76 = stringJoiner73.add(obj75);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner77 = stringJoiner71.append((java.lang.Object) stringJoiner73);
        java.lang.StringBuilder stringBuilder78 = stringJoiner71.sb;
        stringJoiner48.sb = stringBuilder78;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner80 = stringJoiner46.add((java.lang.Object) stringBuilder78);
        java.lang.String str81 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder78);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " class java.lang.StringBuilder" + "'", str33, " class java.lang.StringBuilder");
        org.junit.Assert.assertNotNull(stringJoiner41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner46);
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder54);
        org.junit.Assert.assertEquals(stringBuilder54.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder62);
        org.junit.Assert.assertEquals(stringBuilder62.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner64);
        org.junit.Assert.assertNotNull(stringJoiner66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + " " + "'", str69, " ");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(stringJoiner71);
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner76);
        org.junit.Assert.assertNotNull(stringJoiner77);
        org.junit.Assert.assertNotNull(stringBuilder78);
        org.junit.Assert.assertEquals(stringBuilder78.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner80);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0899");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder6);
        stringJoiner1.sb = stringBuilder6;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder6, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder6, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", true);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder6);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0900");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("10nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!", "10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0901");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("null-1.0 null                ", "hi!hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0902");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("                                ");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0903");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0904");
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
        boolean boolean26 = stringJoiner1.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "true");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "true");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0905");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0906");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("nullnull");
        stringJoiner1.first = true;
        java.lang.StringBuilder stringBuilder4 = stringJoiner1.sb;
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add(obj5);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder9 = stringJoiner8.sb;
        java.lang.Object obj10 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner8.add(obj10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = stringJoiner8.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str16 = stringJoiner15.separator;
        boolean boolean17 = stringJoiner15.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = stringJoiner13.append((java.lang.Object) stringJoiner15);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        java.lang.Object obj22 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner20.add(obj22);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = stringJoiner18.append((java.lang.Object) stringJoiner20);
        stringJoiner24.first = false;
        boolean boolean27 = stringJoiner24.first;
        java.lang.String str28 = stringJoiner24.complete();
        stringJoiner24.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = stringJoiner6.add((java.lang.Object) false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "nullnullnullfalse");
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringJoiner13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stringJoiner31);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0907");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!                                                                                                    hi!");
        stringJoiner1.first = true;
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0908");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean7 = org.jsoup.internal.StringUtil.in("", strArray6);
        boolean boolean8 = org.jsoup.internal.StringUtil.inSorted("          ", strArray6);
        boolean boolean9 = org.jsoup.internal.StringUtil.inSorted("nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0909");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder6);
        stringJoiner1.sb = stringBuilder6;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = stringJoiner1.add((java.lang.Object) "null-1.0 ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder13 = stringJoiner12.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = stringJoiner12.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder18 = stringJoiner17.sb;
        java.lang.String str19 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder18);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder18);
        java.lang.String str21 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder18);
        stringJoiner12.sb = stringBuilder18;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder25 = stringJoiner24.sb;
        java.lang.Object obj26 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = stringJoiner24.add(obj26);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = stringJoiner24.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str32 = stringJoiner31.separator;
        boolean boolean33 = stringJoiner31.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = stringJoiner29.append((java.lang.Object) stringJoiner31);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = stringJoiner12.append((java.lang.Object) stringJoiner34);
        boolean boolean36 = stringJoiner34.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder39 = stringJoiner38.sb;
        java.lang.Object obj40 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = stringJoiner38.add(obj40);
        java.lang.StringBuilder stringBuilder42 = stringJoiner38.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner44 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder45 = stringJoiner44.sb;
        java.lang.String str46 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder45);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder45);
        stringJoiner38.sb = stringBuilder45;
        stringJoiner34.sb = stringBuilder45;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder45, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner53 = stringJoiner1.append((java.lang.Object) stringBuilder45);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder45, "hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "null-1.0 10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringJoiner10);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "null-1.0 10");
        org.junit.Assert.assertNotNull(stringJoiner15);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(stringJoiner29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + " " + "'", str32, " ");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(stringJoiner34);
        org.junit.Assert.assertNotNull(stringJoiner35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertNotNull(stringJoiner41);
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(stringJoiner53);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0910");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!hi!                                                                                                    hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!", "hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!hi!                              hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0911");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0912");
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
        boolean boolean41 = stringJoiner1.first;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!hi!nulltrue");
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0913");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean11 = org.jsoup.internal.StringUtil.in("hi!", strArray10);
        boolean boolean12 = org.jsoup.internal.StringUtil.in(" ", strArray10);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray10);
        java.lang.String str15 = org.jsoup.internal.StringUtil.join(strArray10, "                              ");
        boolean boolean16 = org.jsoup.internal.StringUtil.inSorted("hi! hi!", strArray10);
        boolean boolean17 = org.jsoup.internal.StringUtil.in("", strArray10);
        boolean boolean18 = org.jsoup.internal.StringUtil.inSorted("null", strArray10);
        java.lang.String str20 = org.jsoup.internal.StringUtil.join(strArray10, "hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    ");
        boolean boolean21 = org.jsoup.internal.StringUtil.in("     ", strArray10);
        boolean boolean22 = org.jsoup.internal.StringUtil.inSorted("hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! hi!hi!                              hi!" + "'", str15, "hi! hi!hi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!" + "'", str20, "hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0914");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder17 = stringJoiner16.sb;
        stringJoiner13.sb = stringBuilder17;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        stringJoiner20.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder26 = stringJoiner25.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder26, "", false);
        stringJoiner20.sb = stringBuilder26;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder26, "", false);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = stringJoiner13.append((java.lang.Object) stringBuilder26);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = stringJoiner1.add((java.lang.Object) stringBuilder26);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder26);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner34);
        org.junit.Assert.assertNotNull(stringJoiner35);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0915");
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
        stringJoiner11.first = true;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0916");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.append(obj5);
        java.lang.String str7 = stringJoiner6.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder10 = stringJoiner9.sb;
        java.lang.Object obj11 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = stringJoiner9.add(obj11);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = stringJoiner9.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str17 = stringJoiner16.separator;
        boolean boolean18 = stringJoiner16.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = stringJoiner14.append((java.lang.Object) stringJoiner16);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder22 = stringJoiner21.sb;
        java.lang.Object obj23 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = stringJoiner21.add(obj23);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = stringJoiner19.append((java.lang.Object) stringJoiner21);
        java.lang.StringBuilder stringBuilder26 = stringJoiner21.sb;
        java.lang.String str27 = stringJoiner21.complete();
        java.lang.String str28 = stringJoiner21.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = stringJoiner6.add((java.lang.Object) str28);
        stringJoiner6.first = false;
        boolean boolean32 = stringJoiner6.first;
        stringJoiner6.first = false;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringJoiner14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " " + "'", str17, " ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stringJoiner19);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertNotNull(stringJoiner25);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(stringJoiner29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0917");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!truehi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0918");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "null-1.0null");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: null-1.0null");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0919");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0920");
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
        java.lang.String str34 = stringJoiner1.separator;
        java.lang.String str35 = stringJoiner1.separator;
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0921");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("nullhi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0922");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder6);
        stringJoiner1.sb = stringBuilder6;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = stringJoiner1.add((java.lang.Object) "null-1.0 ");
        java.lang.Class<?> wildcardClass11 = stringJoiner10.getClass();
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "null-1.0 ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringJoiner10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0923");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str2 = stringJoiner1.separator;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.internal.StringUtil.inSorted("          ", strArray8);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner11 = stringJoiner1.append((java.lang.Object) "          ");
        java.lang.Class<?> wildcardClass12 = stringJoiner1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0924");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "     ", true);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!", false);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ", false);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "nullnullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi! nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi! ", false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 nullnullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi! nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0925");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.append(obj5);
        java.lang.String str7 = stringJoiner1.separator;
        java.lang.String str8 = stringJoiner1.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder11 = stringJoiner10.sb;
        java.lang.Object obj12 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = stringJoiner10.add(obj12);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = stringJoiner10.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder18 = stringJoiner17.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder18, "                                                                                                 ", false);
        stringJoiner10.sb = stringBuilder18;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = stringJoiner10.append((java.lang.Object) "hi!                              hi!");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder29 = stringJoiner28.sb;
        java.lang.String str30 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder29);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder29);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder29);
        stringJoiner26.sb = stringBuilder29;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder36 = stringJoiner35.sb;
        stringJoiner35.first = true;
        java.lang.String str39 = stringJoiner35.complete();
        java.lang.String str40 = stringJoiner35.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = stringJoiner26.append((java.lang.Object) str40);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner42 = stringJoiner24.append((java.lang.Object) str40);
        java.lang.String str43 = stringJoiner42.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner44 = stringJoiner1.append((java.lang.Object) stringJoiner42);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertNotNull(stringJoiner13);
        org.junit.Assert.assertNotNull(stringJoiner15);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(stringJoiner41);
        org.junit.Assert.assertNotNull(stringJoiner42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + " hi!                              hi!" + "'", str43, " hi!                              hi!");
        org.junit.Assert.assertNotNull(stringJoiner44);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0926");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0927");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!" + "'", str1, "hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0928");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("hi!null-1.0 hi!");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0929");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        java.lang.Object obj22 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner20.add(obj22);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = stringJoiner20.add((java.lang.Object) (-1.0d));
        stringJoiner25.first = false;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector29 = org.jsoup.internal.StringUtil.joining(" ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = stringJoiner25.add((java.lang.Object) " ");
        boolean boolean31 = stringJoiner30.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder34 = stringJoiner33.sb;
        stringJoiner30.sb = stringBuilder34;
        java.lang.String str36 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder34);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner37 = stringJoiner16.append((java.lang.Object) str36);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean43 = org.jsoup.internal.StringUtil.in("hi!", strArray42);
        boolean boolean44 = org.jsoup.internal.StringUtil.in(" ", strArray42);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner45 = stringJoiner37.add((java.lang.Object) boolean44);
        boolean boolean46 = stringJoiner45.first;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "null-1.0 false");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "null-1.0 false");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "null-1.0 false");
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner25);
        org.junit.Assert.assertNotNull(charSequenceCollector29);
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "null-1.0 false");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "null-1.0 " + "'", str36, "null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner37);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(stringJoiner45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0930");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding(0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0931");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null-1.0 falsenullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null" + "'", str1, "null-1.0 falsenullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0932");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0933");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0934");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) '4', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0935");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder10 = stringJoiner9.sb;
        java.lang.StringBuilder stringBuilder11 = stringJoiner9.sb;
        stringJoiner1.sb = stringBuilder11;
        java.lang.String str13 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder11);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0936");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean14 = org.jsoup.internal.StringUtil.in("hi!", strArray13);
        boolean boolean15 = org.jsoup.internal.StringUtil.inSorted("", strArray13);
        boolean boolean16 = org.jsoup.internal.StringUtil.inSorted("10", strArray13);
        boolean boolean17 = org.jsoup.internal.StringUtil.in("          ", strArray13);
        java.lang.String str19 = org.jsoup.internal.StringUtil.join(strArray13, "null-1.0 ");
        boolean boolean20 = org.jsoup.internal.StringUtil.in("hi!nullnullhi!                              hi!", strArray13);
        boolean boolean21 = org.jsoup.internal.StringUtil.inSorted("", strArray13);
        boolean boolean22 = org.jsoup.internal.StringUtil.in("", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 " + "'", str19, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0937");
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
        java.lang.String str17 = stringJoiner3.separator;
        java.lang.String str18 = stringJoiner3.separator;
        org.junit.Assert.assertNotNull(stringJoiner3);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "          " + "'", str11, "          ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0938");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
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
        java.lang.String str18 = stringJoiner1.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " " + "'", str18, " ");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0939");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0940");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.append(obj5);
        java.lang.String str7 = stringJoiner1.separator;
        java.lang.String str8 = stringJoiner1.separator;
        java.lang.String str9 = stringJoiner1.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "nullnull");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0941");
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
        java.lang.StringBuilder stringBuilder22 = stringJoiner20.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder22);
        stringJoiner18.sb = stringBuilder22;
        java.lang.String str25 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder22);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "nullnull" + "'", str15, "nullnull");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0942");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.lang.String str12 = stringJoiner1.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        stringJoiner14.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder20 = stringJoiner19.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder20, "", false);
        stringJoiner14.sb = stringBuilder20;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder27 = stringJoiner26.sb;
        java.lang.String str28 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder27);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder27, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder27, "     ", true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = stringJoiner14.add((java.lang.Object) "     ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner37 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder38 = stringJoiner37.sb;
        stringJoiner37.first = true;
        java.lang.String str41 = stringJoiner37.complete();
        java.lang.String str42 = stringJoiner37.separator;
        java.lang.StringBuilder stringBuilder43 = stringJoiner37.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner44 = stringJoiner14.add((java.lang.Object) stringBuilder43);
        stringJoiner44.first = false;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner48 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder49 = stringJoiner48.sb;
        java.lang.Object obj50 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner51 = stringJoiner48.add(obj50);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner53 = stringJoiner48.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner55 = stringJoiner48.append((java.lang.Object) 10);
        java.lang.String str56 = stringJoiner55.separator;
        java.lang.String str57 = stringJoiner55.separator;
        java.lang.String str58 = stringJoiner55.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner59 = stringJoiner44.add((java.lang.Object) stringJoiner55);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner60 = stringJoiner1.add((java.lang.Object) stringJoiner59);
        java.lang.String str61 = stringJoiner59.complete();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(stringJoiner35);
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "     " + "'", str41, "     ");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(stringBuilder43);
        org.junit.Assert.assertNotNull(stringJoiner44);
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner51);
        org.junit.Assert.assertNotNull(stringJoiner53);
        org.junit.Assert.assertNotNull(stringJoiner55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "nullnull-1.010" + "'", str58, "nullnull-1.010");
        org.junit.Assert.assertNotNull(stringJoiner59);
        org.junit.Assert.assertNotNull(stringJoiner60);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0943");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0944");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("hi!", strArray8);
        boolean boolean10 = org.jsoup.internal.StringUtil.in(" ", strArray8);
        boolean boolean11 = org.jsoup.internal.StringUtil.inSorted("     ", strArray8);
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi! hi!", strArray8);
        boolean boolean13 = org.jsoup.internal.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", strArray8);
        boolean boolean14 = org.jsoup.internal.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0945");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("hi!nullnullhi!                              hi!");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0946");
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
        java.lang.Class<?> wildcardClass35 = stringBuilder30.getClass();
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
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0947");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.internal.StringUtil.join(strArray0, "null                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0948");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder36 = stringJoiner35.sb;
        stringJoiner33.sb = stringBuilder36;
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
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null" + "'", str31, "null");
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0949");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!                                                                                                 hi!");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0950");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean10 = org.jsoup.internal.StringUtil.in("hi!", strArray9);
        java.lang.String str12 = org.jsoup.internal.StringUtil.join(strArray9, " ");
        boolean boolean13 = org.jsoup.internal.StringUtil.in(" ", strArray9);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "     " + "'", str12, "     ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0951");
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
        java.lang.Class<?> wildcardClass26 = stringJoiner23.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0952");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!                                                                                                    hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0953");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.append(obj5);
        java.lang.String str7 = stringJoiner1.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder10 = stringJoiner9.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = stringJoiner9.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        java.lang.String str16 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder15);
        java.lang.String str18 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        stringJoiner9.sb = stringBuilder15;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder22 = stringJoiner21.sb;
        java.lang.Object obj23 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = stringJoiner21.add(obj23);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = stringJoiner21.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str29 = stringJoiner28.separator;
        boolean boolean30 = stringJoiner28.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = stringJoiner26.append((java.lang.Object) stringJoiner28);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = stringJoiner9.append((java.lang.Object) stringJoiner31);
        boolean boolean33 = stringJoiner31.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder36 = stringJoiner35.sb;
        java.lang.Object obj37 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = stringJoiner35.add(obj37);
        java.lang.StringBuilder stringBuilder39 = stringJoiner35.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder42 = stringJoiner41.sb;
        java.lang.String str43 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder42);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder42);
        stringJoiner35.sb = stringBuilder42;
        stringJoiner31.sb = stringBuilder42;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder42, "     ", false);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner50 = stringJoiner1.append((java.lang.Object) "     ");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertNotNull(stringJoiner26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " " + "'", str29, " ");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(stringJoiner31);
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertNotNull(stringJoiner38);
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), " ");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(stringJoiner50);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0954");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str19 = stringJoiner18.separator;
        boolean boolean20 = stringJoiner18.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder23 = stringJoiner22.sb;
        java.lang.String str24 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder23);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder23, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder23, " ", true);
        stringJoiner18.sb = stringBuilder23;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder23);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder23, "nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ", false);
        stringJoiner16.sb = stringBuilder23;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder23, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ", false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
// flaky "26) test0954(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " " + "'", str19, " ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0955");
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
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder34, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder34, "true1nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "true1nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "true1nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 10" + "'", str8, "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "true1nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "true1nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "true1nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "true1nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0956");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0957");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean7 = org.jsoup.internal.StringUtil.in("hi!", strArray6);
        boolean boolean8 = org.jsoup.internal.StringUtil.in(" ", strArray6);
        boolean boolean9 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray6);
        boolean boolean10 = org.jsoup.internal.StringUtil.inSorted("nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0958");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("null-1.0 falsenullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0959");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.StringBuilder stringBuilder5 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner9 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder10 = stringJoiner9.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = stringJoiner9.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        java.lang.String str16 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder15);
        java.lang.String str18 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        stringJoiner9.sb = stringBuilder15;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder22 = stringJoiner21.sb;
        java.lang.Object obj23 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = stringJoiner21.add(obj23);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = stringJoiner21.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str29 = stringJoiner28.separator;
        boolean boolean30 = stringJoiner28.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = stringJoiner26.append((java.lang.Object) stringJoiner28);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = stringJoiner9.append((java.lang.Object) stringJoiner31);
        boolean boolean33 = stringJoiner31.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder36 = stringJoiner35.sb;
        java.lang.Object obj37 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = stringJoiner35.add(obj37);
        java.lang.StringBuilder stringBuilder39 = stringJoiner35.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner41 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder42 = stringJoiner41.sb;
        java.lang.String str43 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder42);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder42);
        stringJoiner35.sb = stringBuilder42;
        stringJoiner31.sb = stringBuilder42;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner47 = stringJoiner1.add((java.lang.Object) stringBuilder42);
        java.lang.String str48 = stringJoiner1.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner50 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder51 = stringJoiner50.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner53 = stringJoiner50.add((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner55 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder56 = stringJoiner55.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder56, "", false);
        java.lang.String str60 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder56);
        stringJoiner50.sb = stringBuilder56;
        java.lang.String str62 = stringJoiner50.separator;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner63 = stringJoiner1.add((java.lang.Object) stringJoiner50);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "10");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder15);
// flaky "27) test0959(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder15.toString(), "10");
// flaky "8) test0959(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null10" + "'", str16, "null10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(stringBuilder22);
// flaky "2) test0959(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder22.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertNotNull(stringJoiner26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + " " + "'", str29, " ");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(stringJoiner31);
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stringBuilder36);
// flaky "1) test0959(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder36.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner38);
        org.junit.Assert.assertNotNull(stringBuilder39);
// flaky "1) test0959(org.jsoup.internal.StringUtilRegressionTest1)":         org.junit.Assert.assertEquals(stringBuilder39.toString(), "10");
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(stringJoiner47);
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner53);
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0960");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder5 = stringJoiner4.sb;
        stringJoiner1.sb = stringBuilder5;
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder5);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder5);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0961");
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
        java.lang.String str26 = stringJoiner25.complete();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(stringJoiner25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " " + "'", str26, " ");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0962");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str7 = stringJoiner6.separator;
        boolean boolean8 = stringJoiner6.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder11 = stringJoiner10.sb;
        java.lang.String str12 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder11);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder11, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder11, " ", true);
        stringJoiner6.sb = stringBuilder11;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder11);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder11, "nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ", false);
        stringJoiner1.sb = stringBuilder11;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder27 = stringJoiner26.sb;
        stringJoiner26.first = true;
        java.lang.String str30 = stringJoiner26.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = new org.jsoup.internal.StringUtil.StringJoiner("hi!");
        stringJoiner32.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner36 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder37 = stringJoiner36.sb;
        java.lang.String str38 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder37);
        stringJoiner32.sb = stringBuilder37;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder37, "", true);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder37);
        stringJoiner26.sb = stringBuilder37;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder37, "null-1.0 null                ", true);
        java.lang.String str48 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder37);
        stringJoiner1.sb = stringBuilder37;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " " + "'", str30, " ");
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "null-1.0 null " + "'", str48, "null-1.0 null ");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0963");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder8 = stringJoiner7.sb;
        java.lang.StringBuilder stringBuilder9 = stringJoiner7.sb;
        stringJoiner1.sb = stringBuilder9;
        java.lang.StringBuilder stringBuilder11 = stringJoiner1.sb;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0964");
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
        stringJoiner13.first = true;
        java.lang.StringBuilder stringBuilder20 = stringJoiner13.sb;
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
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "null");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0965");
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
        java.lang.String str25 = stringJoiner1.complete();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = stringJoiner1.append((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "10");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner24);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0966");
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
        java.lang.StringBuilder stringBuilder20 = stringJoiner13.sb;
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
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "null");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "null");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "null");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0967");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner1.append((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder11 = stringJoiner10.sb;
        java.lang.String str12 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder11);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder11, "", true);
        stringJoiner1.sb = stringBuilder11;
        java.lang.Class<?> wildcardClass17 = stringBuilder11.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.010");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0968");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder19 = stringJoiner18.sb;
        java.lang.Object obj20 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner18.add(obj20);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner18.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str26 = stringJoiner25.separator;
        boolean boolean27 = stringJoiner25.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = stringJoiner23.append((java.lang.Object) stringJoiner25);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder31 = stringJoiner30.sb;
        java.lang.Object obj32 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner30.add(obj32);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = stringJoiner28.append((java.lang.Object) stringJoiner30);
        boolean boolean35 = stringJoiner28.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner36 = stringJoiner16.append((java.lang.Object) stringJoiner28);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str39 = stringJoiner38.separator;
        boolean boolean40 = stringJoiner38.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner42 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder43 = stringJoiner42.sb;
        java.lang.String str44 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder43);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder43, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder43, " ", true);
        stringJoiner38.sb = stringBuilder43;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder43);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder43, "nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ", false);
        java.lang.String str56 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder43);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder43);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner58 = stringJoiner36.add((java.lang.Object) stringBuilder43);
        java.lang.String str59 = stringJoiner36.complete();
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " " + "'", str26, " ");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(stringJoiner28);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertNotNull(stringJoiner34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(stringJoiner36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + " " + "'", str39, " ");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 " + "'", str56, "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertNotNull(stringJoiner58);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0969");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("nullnull-1.010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0970");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii(" class java.lang.StringBuilder");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0971");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        java.lang.Object obj22 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner20.add(obj22);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = stringJoiner20.add((java.lang.Object) (-1.0d));
        stringJoiner25.first = false;
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector29 = org.jsoup.internal.StringUtil.joining(" ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = stringJoiner25.add((java.lang.Object) " ");
        boolean boolean31 = stringJoiner30.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder34 = stringJoiner33.sb;
        stringJoiner30.sb = stringBuilder34;
        java.lang.String str36 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder34);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner37 = stringJoiner16.append((java.lang.Object) str36);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean43 = org.jsoup.internal.StringUtil.in("hi!", strArray42);
        boolean boolean44 = org.jsoup.internal.StringUtil.in(" ", strArray42);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner45 = stringJoiner37.add((java.lang.Object) boolean44);
        stringJoiner45.first = true;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "null-1.0 false");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "null-1.0 false");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "null-1.0 false");
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner25);
        org.junit.Assert.assertNotNull(charSequenceCollector29);
        org.junit.Assert.assertNotNull(stringJoiner30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "null-1.0 false");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "null-1.0 " + "'", str36, "null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner37);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(stringJoiner45);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0972");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.String str5 = stringJoiner4.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder8 = stringJoiner7.sb;
        java.lang.Object obj9 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = stringJoiner7.add(obj9);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder13 = stringJoiner12.sb;
        java.lang.StringBuilder stringBuilder14 = stringJoiner12.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner16 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder19 = stringJoiner18.sb;
        java.lang.String str20 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder19);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder19);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder19);
        stringJoiner16.sb = stringBuilder19;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder19);
        stringJoiner12.sb = stringBuilder19;
        java.lang.String str26 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder19);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner27 = stringJoiner10.append((java.lang.Object) stringBuilder19);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder30 = stringJoiner29.sb;
        java.lang.Object obj31 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner32 = stringJoiner29.add(obj31);
        java.lang.StringBuilder stringBuilder33 = stringJoiner29.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder36 = stringJoiner35.sb;
        java.lang.String str37 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder36);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder36);
        stringJoiner29.sb = stringBuilder36;
        stringJoiner27.sb = stringBuilder36;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder36, "hi! hi!", true);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder36);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.StringJoiner stringJoiner45 = stringJoiner4.append((java.lang.Object) stringBuilder36);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Object must not be null");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null-1.0 falsenull" + "'", str5, "null-1.0 falsenull");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner10);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null" + "'", str20, "null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(stringJoiner27);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner32);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "null" + "'", str37, "null");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0973");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder19 = stringJoiner18.sb;
        java.lang.Object obj20 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner18.add(obj20);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner18.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str26 = stringJoiner25.separator;
        boolean boolean27 = stringJoiner25.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = stringJoiner23.append((java.lang.Object) stringJoiner25);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder31 = stringJoiner30.sb;
        java.lang.Object obj32 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner30.add(obj32);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = stringJoiner28.append((java.lang.Object) stringJoiner30);
        boolean boolean35 = stringJoiner28.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner36 = stringJoiner16.append((java.lang.Object) stringJoiner28);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner40 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder41 = stringJoiner40.sb;
        java.lang.String str42 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder41);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder41);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder41);
        stringJoiner38.sb = stringBuilder41;
        stringJoiner28.sb = stringBuilder41;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " " + "'", str26, " ");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(stringJoiner28);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertNotNull(stringJoiner34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(stringJoiner36);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0974");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0975");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank(" class java.lang.StringBuilderclass [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0976");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("null-1.0 null ", "nullnull class java.lang.StringBuildertrue");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0977");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0978");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean7 = org.jsoup.internal.StringUtil.in("hi!", strArray6);
        boolean boolean8 = org.jsoup.internal.StringUtil.in(" ", strArray6);
        boolean boolean9 = org.jsoup.internal.StringUtil.inSorted("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ", strArray6);
        boolean boolean10 = org.jsoup.internal.StringUtil.inSorted("nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ", strArray6);
        java.lang.String str12 = org.jsoup.internal.StringUtil.join(strArray6, "hi!null-1.0 hi!                              hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!null-1.0 hi!                              hi!hi!" + "'", str12, "hi!hi!null-1.0 hi!                              hi!hi!");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0979");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!hi!");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0980");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder27 = stringJoiner26.sb;
        java.lang.Object obj28 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner29 = stringJoiner26.add(obj28);
        java.lang.Object obj30 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = stringJoiner26.append(obj30);
        java.lang.String str32 = stringJoiner31.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner24.add((java.lang.Object) stringJoiner31);
        java.lang.Class<?> wildcardClass34 = stringJoiner33.getClass();
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertNotNull(stringJoiner29);
        org.junit.Assert.assertNotNull(stringJoiner31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0981");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean7 = org.jsoup.internal.StringUtil.in("hi!", strArray6);
        boolean boolean8 = org.jsoup.internal.StringUtil.in(" ", strArray6);
        boolean boolean9 = org.jsoup.internal.StringUtil.inSorted("null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ", strArray6);
        boolean boolean10 = org.jsoup.internal.StringUtil.in("     ", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0982");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder9 = stringJoiner8.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder9, "                                                                                                 ", false);
        stringJoiner1.sb = stringBuilder9;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = stringJoiner1.append((java.lang.Object) "hi!                              hi!");
        stringJoiner15.first = false;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertNotNull(stringJoiner15);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0983");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner1.append((java.lang.Object) 10);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder11 = stringJoiner10.sb;
        java.lang.String str12 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder11);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder11, "", true);
        stringJoiner1.sb = stringBuilder11;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder11);
        java.lang.String str18 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder11);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0984");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean11 = org.jsoup.internal.StringUtil.in("hi!", strArray10);
        boolean boolean12 = org.jsoup.internal.StringUtil.inSorted("", strArray10);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("10", strArray10);
        java.lang.String str15 = org.jsoup.internal.StringUtil.join(strArray10, "");
        boolean boolean16 = org.jsoup.internal.StringUtil.in("null-1.0 hi!                              hi!-1 ", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0985");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!                                                                                                 hi!", "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0986");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "     ", true);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        java.lang.String str13 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "hi!null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0987");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!" + "'", str1, "hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0988");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!truehi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuilder.appendCodePoint(int)\" because \"accum\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0989");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("hi!", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.inSorted("", strArray11);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("10", strArray11);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("          ", strArray11);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0990");
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
        stringJoiner11.first = false;
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
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0991");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean13 = org.jsoup.internal.StringUtil.in("hi!", strArray12);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray12);
        boolean boolean15 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray12);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("                              ", strArray12);
        boolean boolean17 = org.jsoup.internal.StringUtil.in("nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ", strArray12);
        boolean boolean18 = org.jsoup.internal.StringUtil.inSorted("hi!nullnullhi!                              hi!", strArray12);
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0992");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        stringJoiner3.first = true;
        boolean boolean7 = stringJoiner3.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner1.append((java.lang.Object) boolean7);
        java.lang.StringBuilder stringBuilder9 = stringJoiner8.sb;
        boolean boolean10 = stringJoiner8.first;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "true");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "true");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0993");
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
        java.lang.StringBuilder stringBuilder41 = org.jsoup.internal.StringUtil.borrowBuilder();
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder41, "", false);
        java.lang.String str45 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder41);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder41, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ", true);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner49 = stringJoiner40.append((java.lang.Object) "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "truenull" + "'", str16, "truenull");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner28);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "null" + "'", str33, "null");
        org.junit.Assert.assertNotNull(stringJoiner40);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi! hi!true" + "'", str45, "hi! hi!true");
        org.junit.Assert.assertNotNull(stringJoiner49);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0994");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        boolean boolean5 = stringJoiner1.first;
        java.lang.String str6 = stringJoiner1.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0995");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        java.lang.String str2 = stringJoiner1.separator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    " + "'", str2, "null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0996");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("hi!", strArray8);
        boolean boolean10 = org.jsoup.internal.StringUtil.in("hi!                              hi!", strArray8);
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0997");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0998");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder19 = stringJoiner18.sb;
        java.lang.Object obj20 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner18.add(obj20);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner23 = stringJoiner18.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner25 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str26 = stringJoiner25.separator;
        boolean boolean27 = stringJoiner25.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = stringJoiner23.append((java.lang.Object) stringJoiner25);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder31 = stringJoiner30.sb;
        java.lang.Object obj32 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner30.add(obj32);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = stringJoiner28.append((java.lang.Object) stringJoiner30);
        boolean boolean35 = stringJoiner28.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner36 = stringJoiner16.append((java.lang.Object) stringJoiner28);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str39 = stringJoiner38.separator;
        boolean boolean40 = stringJoiner38.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner42 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder43 = stringJoiner42.sb;
        java.lang.String str44 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder43);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder43, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder43, " ", true);
        stringJoiner38.sb = stringBuilder43;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder43);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder43, "nullnull-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                         null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                     ", false);
        java.lang.String str56 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder43);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder43);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner58 = stringJoiner36.add((java.lang.Object) stringBuilder43);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean70 = org.jsoup.internal.StringUtil.in("hi!", strArray69);
        boolean boolean71 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray69);
        boolean boolean72 = org.jsoup.internal.StringUtil.in("          ", strArray69);
        boolean boolean73 = org.jsoup.internal.StringUtil.in("hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ", strArray69);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner74 = stringJoiner36.add((java.lang.Object) "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        java.lang.String str75 = stringJoiner74.separator;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 " + "'", str5, "null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " " + "'", str26, " ");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(stringJoiner28);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertNotNull(stringJoiner34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(stringJoiner36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + " " + "'", str39, " ");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 " + "'", str56, "nullnull-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 ");
        org.junit.Assert.assertNotNull(stringJoiner58);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(stringJoiner74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test0999");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder4 = stringJoiner3.sb;
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder4);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder4, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder4, "     ", true);
        stringJoiner1.sb = stringBuilder4;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder15 = stringJoiner14.sb;
        java.lang.String str16 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder15);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder15, "          ", true);
        java.lang.String str21 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder15);
        stringJoiner1.sb = stringBuilder15;
        stringJoiner1.first = true;
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 " + "'", str5, "hi! hi!null-1.0 null-1.0 null-1.0 null-1.0 null-1.0 ");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest1.test1000");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                null-1.0 null                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null " + "'", str1, "null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null null-1.0 null ");
    }
}
