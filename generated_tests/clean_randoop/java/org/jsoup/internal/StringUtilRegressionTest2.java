package org.jsoup.internal;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringUtilRegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1001");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean5 = org.jsoup.internal.StringUtil.in("hi!", strArray4);
        java.lang.String str7 = org.jsoup.internal.StringUtil.join(strArray4, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        boolean boolean8 = org.jsoup.internal.StringUtil.in("10", strArray4);
        java.lang.String str10 = org.jsoup.internal.StringUtil.join(strArray4, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str7, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!" + "'", str10, "hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1002");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean13 = org.jsoup.internal.StringUtil.in("hi!", strArray12);
        boolean boolean14 = org.jsoup.internal.StringUtil.inSorted("", strArray12);
        boolean boolean15 = org.jsoup.internal.StringUtil.inSorted("10", strArray12);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    ", strArray12);
        boolean boolean17 = org.jsoup.internal.StringUtil.inSorted("hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!", strArray12);
        boolean boolean18 = org.jsoup.internal.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", strArray12);
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1003");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add((java.lang.Object) 10);
        java.lang.String str5 = stringJoiner4.complete();
        boolean boolean6 = stringJoiner4.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1004");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder22 = stringJoiner21.sb;
        stringJoiner21.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder27 = stringJoiner26.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder27, "", false);
        stringJoiner21.sb = stringBuilder27;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner21.append((java.lang.Object) (-1L));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner34 = stringJoiner17.append((java.lang.Object) stringJoiner21);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertNotNull(stringJoiner34);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1005");
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
        java.lang.StringBuilder stringBuilder79 = org.jsoup.internal.StringUtil.borrowBuilder();
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder79, "", false);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner83 = stringJoiner65.append((java.lang.Object) false);
        java.lang.String str84 = stringJoiner83.complete();
        boolean boolean85 = stringJoiner83.first;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
// flaky "1) test1005(org.jsoup.internal.StringUtilRegressionTest2)":         org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner9);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringBuilder19);
// flaky "1) test1005(org.jsoup.internal.StringUtilRegressionTest2)":         org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
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
        org.junit.Assert.assertNotNull(stringBuilder79);
        org.junit.Assert.assertEquals(stringBuilder79.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1006");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = stringJoiner1.append((java.lang.Object) "                                                                                                 ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner7 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder8 = stringJoiner7.sb;
        java.lang.String str9 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder8);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder8, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder8, "     ", true);
        stringJoiner5.sb = stringBuilder8;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder19 = stringJoiner18.sb;
        java.lang.String str20 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder19);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder19);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder19, "          ", true);
        java.lang.String str25 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder19);
        stringJoiner5.sb = stringBuilder19;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder29 = stringJoiner28.sb;
        java.lang.Object obj30 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner31 = stringJoiner28.add(obj30);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = stringJoiner28.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder36 = stringJoiner35.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder36, "                                                                                                 ", false);
        stringJoiner28.sb = stringBuilder36;
        stringJoiner5.sb = stringBuilder36;
        boolean boolean42 = stringJoiner5.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner43 = stringJoiner1.add((java.lang.Object) stringJoiner5);
        org.junit.Assert.assertNotNull(stringJoiner3);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "null-1.0 ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "null-1.0 ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner31);
        org.junit.Assert.assertNotNull(stringJoiner33);
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "null-1.0 ");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(stringJoiner43);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1007");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "" };
        boolean boolean6 = org.jsoup.internal.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.internal.StringUtil.in("                              ", strArray5);
        java.lang.String str9 = org.jsoup.internal.StringUtil.join(strArray5, "hi!null-1.0 null                hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null-1.0 hi!null-1.0 null                hi!hi!hi!null-1.0 null                hi!" + "'", str9, "null-1.0 hi!null-1.0 null                hi!hi!hi!null-1.0 null                hi!");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1008");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean14 = org.jsoup.internal.StringUtil.in("hi!", strArray13);
        boolean boolean15 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray13);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("          ", strArray13);
        boolean boolean17 = org.jsoup.internal.StringUtil.in(" ", strArray13);
        boolean boolean18 = org.jsoup.internal.StringUtil.in("null-1.0 null ", strArray13);
        java.lang.String str20 = org.jsoup.internal.StringUtil.join(strArray13, "null");
        boolean boolean21 = org.jsoup.internal.StringUtil.in("hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!hi!", strArray13);
        boolean boolean22 = org.jsoup.internal.StringUtil.inSorted("null-1.0 ", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "nullnullnullnullnull" + "'", str20, "nullnullnullnullnull");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1009");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean7 = org.jsoup.internal.StringUtil.in("hi!", strArray6);
        boolean boolean8 = org.jsoup.internal.StringUtil.in(" ", strArray6);
        boolean boolean9 = org.jsoup.internal.StringUtil.in("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray6);
        boolean boolean10 = org.jsoup.internal.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1010");
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
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder32);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder32, "null-1.0 null ", false);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder32);
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
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1011");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!truehi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1012");
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
        java.lang.Object obj35 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner36 = stringJoiner32.append(obj35);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner38 = stringJoiner32.add((java.lang.Object) "hi!truehi!");
        stringJoiner32.first = false;
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertNotNull(stringJoiner36);
        org.junit.Assert.assertNotNull(stringJoiner38);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1013");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("null-1.0 10 10  10   10    10     10      10       10        10         10          10           10            10             10              10               10                10                 10                  10                   10                    ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner3 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder6);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder6);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder6);
        stringJoiner3.sb = stringBuilder6;
        boolean boolean11 = stringJoiner3.first;
        java.lang.Object obj12 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner13 = stringJoiner3.add(obj12);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = new org.jsoup.internal.StringUtil.StringJoiner("null");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = stringJoiner15.append((java.lang.Object) "                                                                                                 ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = stringJoiner13.add((java.lang.Object) stringJoiner17);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner19 = stringJoiner1.append((java.lang.Object) stringJoiner13);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringJoiner13);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertNotNull(stringJoiner19);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1014");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.append(obj5);
        java.lang.String str7 = stringJoiner1.separator;
        java.lang.String str8 = stringJoiner1.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner("null");
        java.lang.String str11 = stringJoiner10.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = stringJoiner1.append((java.lang.Object) str11);
        java.lang.StringBuilder stringBuilder13 = stringJoiner12.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder13);
        java.lang.String str15 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder13);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1015");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1016");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        java.lang.Object obj7 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner8 = stringJoiner5.add(obj7);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = stringJoiner5.add((java.lang.Object) (-1.0d));
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str13 = stringJoiner12.separator;
        boolean boolean14 = stringJoiner12.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = stringJoiner10.append((java.lang.Object) stringJoiner12);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner17 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder18 = stringJoiner17.sb;
        java.lang.Object obj19 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = stringJoiner17.add(obj19);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = stringJoiner15.append((java.lang.Object) stringJoiner17);
        java.lang.StringBuilder stringBuilder22 = stringJoiner17.sb;
        stringJoiner1.sb = stringBuilder22;
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertNotNull(stringJoiner10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stringJoiner15);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner20);
        org.junit.Assert.assertNotNull(stringJoiner21);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "null");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1017");
        boolean boolean1 = org.jsoup.internal.StringUtil.isAscii("hi!hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1018");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("nullnullhi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1019");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1020");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        java.lang.String str5 = stringJoiner1.separator;
        stringJoiner1.first = false;
        java.lang.StringBuilder stringBuilder8 = stringJoiner1.sb;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean19 = org.jsoup.internal.StringUtil.in("hi!", strArray18);
        boolean boolean20 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray18);
        boolean boolean21 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray18);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner22 = stringJoiner1.append((java.lang.Object) boolean21);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder27 = stringJoiner26.sb;
        java.lang.String str28 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder27);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder27);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder27);
        stringJoiner24.sb = stringBuilder27;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner33 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder34 = stringJoiner33.sb;
        stringJoiner33.first = true;
        java.lang.String str37 = stringJoiner33.complete();
        java.lang.String str38 = stringJoiner33.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner39 = stringJoiner24.append((java.lang.Object) str38);
        stringJoiner39.first = true;
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
        java.lang.String str59 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder57);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner60 = stringJoiner39.append((java.lang.Object) str59);
        java.lang.StringBuilder stringBuilder61 = stringJoiner39.sb;
        stringJoiner22.sb = stringBuilder61;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "false");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "false");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stringJoiner22);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "null-1.0 ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "null-1.0 ");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(stringJoiner39);
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner46);
        org.junit.Assert.assertNotNull(stringJoiner48);
        org.junit.Assert.assertNotNull(charSequenceCollector52);
        org.junit.Assert.assertNotNull(stringJoiner53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(stringBuilder57);
        org.junit.Assert.assertEquals(stringBuilder57.toString(), "null-1.0 ");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "null-1.0 " + "'", str59, "null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner60);
        org.junit.Assert.assertNotNull(stringBuilder61);
        org.junit.Assert.assertEquals(stringBuilder61.toString(), "null-1.0 ");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1021");
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector1 = org.jsoup.internal.StringUtil.joining("true1nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertNotNull(charSequenceCollector1);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1022");
        boolean boolean1 = org.jsoup.internal.StringUtil.startsWithNewline("hi!null-1.0 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 10 hi!nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1023");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "true");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1024");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1025");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner15 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder16 = stringJoiner15.sb;
        java.lang.Object obj17 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner18 = stringJoiner15.add(obj17);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder21 = stringJoiner20.sb;
        java.lang.StringBuilder stringBuilder22 = stringJoiner20.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner26 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder27 = stringJoiner26.sb;
        java.lang.String str28 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder27);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder27);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder27);
        stringJoiner24.sb = stringBuilder27;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder27);
        stringJoiner20.sb = stringBuilder27;
        java.lang.String str34 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder27);
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner35 = stringJoiner18.append((java.lang.Object) stringBuilder27);
        java.lang.StringBuilder stringBuilder36 = stringJoiner35.sb;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner37 = stringJoiner11.add((java.lang.Object) stringJoiner35);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(stringJoiner35);
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "null");
        org.junit.Assert.assertNotNull(stringJoiner37);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1026");
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner21 = new org.jsoup.internal.StringUtil.StringJoiner("10");
        java.lang.String str22 = stringJoiner21.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner24 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder25 = stringJoiner24.sb;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder25);
        stringJoiner21.sb = stringBuilder25;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = stringJoiner17.append((java.lang.Object) stringBuilder25);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder25, "hi!                                                                                                 hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "hi! hi!");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "hi! hi!");
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "hi! hi!");
        org.junit.Assert.assertNotNull(stringJoiner28);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1027");
        java.lang.String str1 = org.jsoup.internal.StringUtil.normaliseWhitespace("true1nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!nullhi!                              hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!true1nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!" + "'", str1, "hi! hi!true1nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1028");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "", "", "", "" };
        boolean boolean15 = org.jsoup.internal.StringUtil.in("hi!", strArray14);
        boolean boolean16 = org.jsoup.internal.StringUtil.inSorted("hi!", strArray14);
        boolean boolean17 = org.jsoup.internal.StringUtil.in("          ", strArray14);
        boolean boolean18 = org.jsoup.internal.StringUtil.in(" ", strArray14);
        boolean boolean19 = org.jsoup.internal.StringUtil.inSorted("", strArray14);
        boolean boolean20 = org.jsoup.internal.StringUtil.in("hi!null-1.0 hi!", strArray14);
        boolean boolean21 = org.jsoup.internal.StringUtil.inSorted("hi!                                                                                                 hi!", strArray14);
        boolean boolean22 = org.jsoup.internal.StringUtil.inSorted("                                                                                                 null", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1029");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1030");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "10nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: 10nullnullnullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!nullhi! hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1031");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        stringJoiner1.first = true;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.StringBuilder stringBuilder7 = stringJoiner6.sb;
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder7, "", false);
        stringJoiner1.sb = stringBuilder7;
        java.lang.String str12 = stringJoiner1.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner14 = stringJoiner1.add((java.lang.Object) "");
        java.lang.String str15 = stringJoiner14.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringJoiner14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1032");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean7 = org.jsoup.internal.StringUtil.in("hi!", strArray6);
        boolean boolean8 = org.jsoup.internal.StringUtil.in(" ", strArray6);
        boolean boolean9 = org.jsoup.internal.StringUtil.inSorted("     ", strArray6);
        java.lang.String str11 = org.jsoup.internal.StringUtil.join(strArray6, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        boolean boolean12 = org.jsoup.internal.StringUtil.in(" true", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str11, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1033");
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
        java.lang.String str34 = stringJoiner33.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.0");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), " hi!                              hi!");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1034");
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
        java.lang.String str15 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder9);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder9, "                                ", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1035");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        java.lang.String str6 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1036");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "     ", true);
        java.lang.String str10 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder2, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", false);
        java.lang.String str14 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str14, "hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1037");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        java.lang.String str5 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder2);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder2);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1038");
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
        boolean boolean22 = org.jsoup.internal.StringUtil.in("hi! hi!null", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!                              hi!" + "'", str15, "hi!                              hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!" + "'", str20, "hi!hi!                              hi! hi!                              hi!  hi!                              hi!   hi!                              hi!    hi!                              hi!     hi!                              hi!      hi!                              hi!       hi!                              hi!        hi!                              hi!         hi!                              hi!          hi!                              hi!           hi!                              hi!            hi!                              hi!             hi!                              hi!              hi!                              hi!               hi!                              hi!                hi!                              hi!                 hi!                              hi!                  hi!                              hi!                   hi!                              hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1039");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean6 = org.jsoup.internal.StringUtil.in("hi!", strArray5);
        boolean boolean7 = org.jsoup.internal.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray5);
        boolean boolean8 = org.jsoup.internal.StringUtil.inSorted("", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1040");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str2 = stringJoiner1.separator;
        java.lang.String str3 = stringJoiner1.complete();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1041");
        java.lang.String str2 = org.jsoup.internal.StringUtil.padding((int) (byte) 100, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1042");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.StringBuilder stringBuilder5 = stringJoiner1.sb;
        java.lang.StringBuilder stringBuilder6 = stringJoiner1.sb;
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
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner28 = new org.jsoup.internal.StringUtil.StringJoiner("");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner30 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder31 = stringJoiner30.sb;
        java.lang.String str32 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder31);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder31);
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder31);
        stringJoiner28.sb = stringBuilder31;
        stringJoiner24.sb = stringBuilder31;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder31);
        stringJoiner1.sb = stringBuilder31;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringJoiner13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(stringJoiner18);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringJoiner23);
        org.junit.Assert.assertNotNull(stringJoiner24);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1043");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    truehi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1044");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner(" ");
        java.lang.String str2 = stringJoiner1.separator;
        boolean boolean3 = stringJoiner1.first;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner5 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder6 = stringJoiner5.sb;
        java.lang.String str7 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder6);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder6, "", true);
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder6, " ", true);
        stringJoiner1.sb = stringBuilder6;
        org.jsoup.internal.StringUtil.releaseBuilderVoid(stringBuilder6);
        java.lang.String str16 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1045");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "hi!nullnullhi! hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!nullnullhi! hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1046");
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
        java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String> charSequenceCollector19 = org.jsoup.internal.StringUtil.joining(" ");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner20 = stringJoiner11.append((java.lang.Object) " ");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertNotNull(stringJoiner16);
        org.junit.Assert.assertNotNull(stringJoiner17);
        org.junit.Assert.assertNotNull(charSequenceCollector19);
        org.junit.Assert.assertNotNull(stringJoiner20);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1047");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi! hi!null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1048");
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
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder11, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertNotNull(stringJoiner8);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1049");
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
        org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder14, "null-1.0 ", true);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.0 ");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringJoiner11);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "null-1.0 ");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1050");
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner1 = new org.jsoup.internal.StringUtil.StringJoiner("");
        java.lang.StringBuilder stringBuilder2 = stringJoiner1.sb;
        java.lang.Object obj3 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner4 = stringJoiner1.add(obj3);
        java.lang.Object obj5 = null;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner6 = stringJoiner1.append(obj5);
        java.lang.String str7 = stringJoiner1.separator;
        java.lang.String str8 = stringJoiner1.separator;
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner10 = new org.jsoup.internal.StringUtil.StringJoiner("null");
        java.lang.String str11 = stringJoiner10.complete();
        org.jsoup.internal.StringUtil.StringJoiner stringJoiner12 = stringJoiner1.append((java.lang.Object) str11);
        java.lang.String str13 = stringJoiner12.separator;
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "null-1.0 nullnull");
        org.junit.Assert.assertNotNull(stringJoiner4);
        org.junit.Assert.assertNotNull(stringJoiner6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null-1.0 nullnull" + "'", str11, "null-1.0 nullnull");
        org.junit.Assert.assertNotNull(stringJoiner12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StringUtilRegressionTest2.test1051");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}
