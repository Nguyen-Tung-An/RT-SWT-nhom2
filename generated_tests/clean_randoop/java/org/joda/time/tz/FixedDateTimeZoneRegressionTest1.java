package org.joda.time.tz;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixedDateTimeZoneRegressionTest1 {

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
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0501");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-20L));
        long long13 = fixedDateTimeZone4.nextTransition((-111L));
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((-20L));
        int int17 = fixedDateTimeZone4.getStandardOffset(232L);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-111L) + "'", long13 == (-111L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0502");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName(62L);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:00" + "'", str2, "+01:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0503");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset((long) (short) -1);
        long long13 = fixedDateTimeZone4.nextTransition((-11L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset(11L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0504");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((-68L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0505");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long7 = dateTimeZone3.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long13 = dateTimeZone9.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str14 = dateTimeZone9.getID();
        long long16 = dateTimeZone3.getMillisKeepLocal(dateTimeZone9, (long) (byte) 1);
        long long19 = dateTimeZone3.convertLocalToUTC((long) '4', false);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone3.getName((long) ' ', locale21);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (byte) 0);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone3.getShortName(200L, locale26);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone32 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str34 = fixedDateTimeZone32.getNameKey((long) (byte) 0);
        int int36 = fixedDateTimeZone32.getStandardOffset(100L);
        java.lang.String str38 = fixedDateTimeZone32.getNameKey((long) 0);
        long long41 = fixedDateTimeZone32.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = fixedDateTimeZone32.getOffset(readableInstant42);
        long long45 = fixedDateTimeZone32.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = fixedDateTimeZone32.isLocalDateTimeGap(localDateTime46);
        int int49 = fixedDateTimeZone32.getOffsetFromLocal((long) 100);
        long long51 = fixedDateTimeZone32.nextTransition((long) (short) 0);
        long long53 = dateTimeZone3.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone32, (long) 0);
        java.lang.String str55 = fixedDateTimeZone32.getName(2099999L);
        java.lang.String str56 = fixedDateTimeZone32.toString();
        long long58 = fixedDateTimeZone32.nextTransition((-38L));
        java.lang.Class<?> wildcardClass59 = fixedDateTimeZone32.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-101L) + "'", long7 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-101L) + "'", long13 == (-101L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-48L) + "'", long19 == (-48L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-11L) + "'", long41 == (-11L));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-111L) + "'", long45 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 90L + "'", long53 == 90L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.010" + "'", str55, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-38L) + "'", long58 == (-38L));
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0506");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0507");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getName((-68L), locale6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getShortName(0L, locale9);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.097" + "'", str10, "+00:00:00.097");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0508");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        boolean boolean11 = fixedDateTimeZone4.isFixed();
        java.lang.Class<?> wildcardClass12 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0509");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        java.lang.String str20 = fixedDateTimeZone4.getName((-38L));
        java.lang.String str22 = fixedDateTimeZone4.getNameKey((-97L));
        long long24 = fixedDateTimeZone4.convertUTCToLocal(232L);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long30 = dateTimeZone26.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str31 = dateTimeZone26.getID();
        long long35 = dateTimeZone26.convertLocalToUTC((long) (byte) -1, false, 0L);
        java.lang.String str36 = dateTimeZone26.toString();
        long long38 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone26, (long) (short) -1);
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime39);
        java.util.Locale locale42 = null;
        java.lang.String str43 = fixedDateTimeZone4.getShortName((long) '#', locale42);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 242L + "'", long24 == 242L);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-101L) + "'", long30 == (-101L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-101L) + "'", long35 == (-101L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.100" + "'", str36, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-91L) + "'", long38 == (-91L));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.010" + "'", str43, "+00:00:00.010");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0510");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.035", "+00:00:00.052", (int) (byte) 100, 100);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0511");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        long long18 = fixedDateTimeZone4.convertLocalToUTC((-58L), true, 200L);
        long long20 = fixedDateTimeZone4.nextTransition(242L);
        long long22 = fixedDateTimeZone4.convertUTCToLocal((-99L));
        long long24 = fixedDateTimeZone4.convertUTCToLocal(147L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-68L) + "'", long18 == (-68L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 242L + "'", long20 == 242L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-89L) + "'", long22 == (-89L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 157L + "'", long24 == 157L);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0512");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 100L);
        java.lang.String str16 = fixedDateTimeZone4.getName(200L);
        java.lang.String str17 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.097" + "'", str16, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0513");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        long long7 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', false);
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((long) (byte) 10);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-101L), false, (-58L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-68L) + "'", long7 == (-68L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-201L) + "'", long13 == (-201L));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0514");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        int int17 = fixedDateTimeZone4.getOffset((-3600090L));
        int int19 = fixedDateTimeZone4.getStandardOffset((-91L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0515");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long7 = fixedDateTimeZone4.nextTransition((-211L));
        long long10 = fixedDateTimeZone4.adjustOffset((-165L), true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-211L) + "'", long7 == (-211L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-165L) + "'", long10 == (-165L));
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0516");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        int int21 = fixedDateTimeZone4.getOffsetFromLocal((long) 100);
        long long24 = fixedDateTimeZone4.adjustOffset((long) 100, false);
        java.util.TimeZone timeZone25 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111L) + "'", long17 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0517");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long7 = dateTimeZone3.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long13 = dateTimeZone9.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str14 = dateTimeZone9.getID();
        long long16 = dateTimeZone3.getMillisKeepLocal(dateTimeZone9, (long) (byte) 1);
        long long19 = dateTimeZone3.convertLocalToUTC((long) '4', false);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone3.getName((long) ' ', locale21);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (byte) 0);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone1.getShortName(100L, locale26);
        long long29 = dateTimeZone1.convertUTCToLocal(132L);
        java.lang.String str31 = dateTimeZone1.getName((long) '#');
        java.lang.String str33 = dateTimeZone1.getShortName(1L);
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone1.isLocalDateTimeGap(localDateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-101L) + "'", long7 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-101L) + "'", long13 == (-101L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-48L) + "'", long19 == (-48L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 232L + "'", long29 == 232L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0518");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0519");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 0, false);
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((-144L));
        long long19 = fixedDateTimeZone4.convertLocalToUTC((-32L), false, 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-10L) + "'", long13 == (-10L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-42L) + "'", long19 == (-42L));
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0520");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        long long13 = fixedDateTimeZone4.nextTransition((-10L));
        long long15 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str17 = fixedDateTimeZone4.getName((long) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-10L) + "'", long13 == (-10L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0521");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        long long12 = fixedDateTimeZone4.nextTransition((-158L));
        java.lang.String str14 = fixedDateTimeZone4.getName((-119L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-158L) + "'", long12 == (-158L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.097" + "'", str14, "+00:00:00.097");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0522");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        boolean boolean11 = fixedDateTimeZone4.isFixed();
        long long13 = fixedDateTimeZone4.nextTransition(232L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        long long21 = fixedDateTimeZone18.convertLocalToUTC((long) ' ', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str28 = fixedDateTimeZone26.getNameKey(10L);
        boolean boolean30 = fixedDateTimeZone26.equals((java.lang.Object) 0.0d);
        int int32 = fixedDateTimeZone26.getStandardOffset((long) (byte) 0);
        java.lang.String str34 = fixedDateTimeZone26.getNameKey((long) (short) 1);
        boolean boolean35 = fixedDateTimeZone18.equals((java.lang.Object) fixedDateTimeZone26);
        boolean boolean36 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone26);
        java.lang.String str38 = fixedDateTimeZone26.getShortName((-43L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 232L + "'", long13 == 232L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-68L) + "'", long21 == (-68L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.010" + "'", str38, "+00:00:00.010");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0523");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (byte) 0);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((long) (short) 1);
        java.util.Locale locale14 = null;
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-158L), locale14);
        java.lang.String str16 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0524");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0525");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-01:00", "+00:00:00.010", (int) (byte) 100, 32);
        int int6 = fixedDateTimeZone4.getStandardOffset(62L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0526");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((long) 0, locale16);
        java.lang.String str19 = fixedDateTimeZone4.getNameKey((-20L));
        java.lang.String str21 = fixedDateTimeZone4.getShortName((-38L));
        long long24 = fixedDateTimeZone4.convertLocalToUTC((-2099910L), true);
        int int26 = fixedDateTimeZone4.getStandardOffset((-10L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.010" + "'", str21, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-2099920L) + "'", long24 == (-2099920L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0527");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        int int14 = fixedDateTimeZone4.getOffset((long) '4');
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        java.lang.String str17 = fixedDateTimeZone4.toString();
        boolean boolean19 = fixedDateTimeZone4.isStandardOffset(2099989L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0528");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0529");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        long long9 = dateTimeZone0.adjustOffset((long) '4', true);
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone16 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str18 = fixedDateTimeZone16.getNameKey(10L);
        boolean boolean20 = fixedDateTimeZone16.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone16);
        int int23 = fixedDateTimeZone16.getOffset((long) (byte) 1);
        long long25 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone16, (long) (-1));
        java.lang.String str27 = fixedDateTimeZone16.getNameKey((long) (-4200000));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-11L) + "'", long25 == (-11L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0530");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean13 = fixedDateTimeZone4.equals((java.lang.Object) "UTC");
        java.lang.String str14 = fixedDateTimeZone4.getID();
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((long) (short) 0, locale16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0531");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str12 = dateTimeZone7.getID();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (byte) 1);
        boolean boolean16 = dateTimeZone7.isStandardOffset((long) ' ');
        boolean boolean18 = dateTimeZone7.isStandardOffset(25L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0532");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getShortName((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = fixedDateTimeZone4.getOffset(readableInstant11);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone17 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str19 = fixedDateTimeZone17.getNameKey((long) (byte) 0);
        long long21 = fixedDateTimeZone17.previousTransition((long) '#');
        int int23 = fixedDateTimeZone17.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean26 = fixedDateTimeZone17.equals((java.lang.Object) "UTC");
        java.lang.String str27 = fixedDateTimeZone17.getID();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long31 = dateTimeZone28.convertLocalToUTC((long) 1, false);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone28.getName(1L, locale33);
        long long37 = dateTimeZone28.adjustOffset((long) '4', true);
        java.lang.String str39 = dateTimeZone28.getName((long) (byte) -1);
        boolean boolean40 = fixedDateTimeZone17.equals((java.lang.Object) str39);
        boolean boolean41 = fixedDateTimeZone4.equals((java.lang.Object) str39);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Coordinated Universal Time" + "'", str34, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Coordinated Universal Time" + "'", str39, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0533");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "-00:00:00.001", (int) ' ', 2100000);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0534");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(132L);
        long long15 = fixedDateTimeZone4.adjustOffset((long) 97, true);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean18 = fixedDateTimeZone4.isStandardOffset((-4200052L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0535");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        int int9 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset((-11L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str20 = fixedDateTimeZone18.getNameKey((long) (byte) 0);
        int int22 = fixedDateTimeZone18.getStandardOffset(100L);
        java.lang.String str24 = fixedDateTimeZone18.getNameKey((long) 0);
        long long27 = fixedDateTimeZone18.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = fixedDateTimeZone18.getOffset(readableInstant28);
        long long31 = fixedDateTimeZone18.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = fixedDateTimeZone18.isLocalDateTimeGap(localDateTime32);
        int int35 = fixedDateTimeZone18.getOffsetFromLocal((long) 100);
        long long37 = fixedDateTimeZone18.nextTransition((long) (short) 0);
        long long39 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, 200L);
        org.joda.time.ReadableInstant readableInstant40 = null;
        int int41 = fixedDateTimeZone18.getOffset(readableInstant40);
        int int43 = fixedDateTimeZone18.getOffsetFromLocal((long) 97);
        java.util.TimeZone timeZone44 = fixedDateTimeZone18.toTimeZone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-11L) + "'", long27 == (-11L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-111L) + "'", long31 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 287L + "'", long39 == 287L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0536");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str11 = dateTimeZone1.getShortName((long) (short) 1);
        long long13 = dateTimeZone1.convertUTCToLocal((long) ' ');
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        long long19 = dateTimeZone1.convertLocalToUTC(110L, false, (long) 97);
        java.lang.String str20 = dateTimeZone1.toString();
        java.lang.String str21 = dateTimeZone1.toString();
        java.lang.String str22 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0537");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getShortName((long) '#', locale9);
        java.lang.String str11 = fixedDateTimeZone4.getID();
        java.lang.String str13 = fixedDateTimeZone4.getNameKey(62L);
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((-55L));
        java.lang.String str17 = fixedDateTimeZone4.getNameKey((-33L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0538");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName((long) (byte) 1);
        long long11 = dateTimeZone1.adjustOffset((-234L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-234L) + "'", long11 == (-234L));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0539");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        int int14 = fixedDateTimeZone4.getOffset((long) '4');
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        java.lang.String str19 = fixedDateTimeZone4.getID();
        java.lang.Class<?> wildcardClass20 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0540");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 100L);
        java.lang.String str16 = fixedDateTimeZone4.getName(200L);
        boolean boolean17 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.097" + "'", str16, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0541");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "UTC", (int) (short) 10, 0);
        long long6 = fixedDateTimeZone4.nextTransition((-3600162L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3600162L) + "'", long6 == (-3600162L));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0542");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((long) 97, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getName((-2099999L), locale16);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0543");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) ' ', (int) (short) 100);
        long long6 = fixedDateTimeZone4.previousTransition((-158L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        long long12 = fixedDateTimeZone4.previousTransition((long) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-158L) + "'", long6 == (-158L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-32L) + "'", long10 == (-32L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0544");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long14 = dateTimeZone10.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str15 = dateTimeZone10.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long19 = dateTimeZone10.adjustOffset((long) (short) 10, false);
        long long22 = dateTimeZone10.convertLocalToUTC((long) (byte) -1, false);
        long long24 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone10, (long) (byte) 100);
        boolean boolean26 = dateTimeZone10.isStandardOffset((long) (short) 0);
        long long29 = dateTimeZone10.adjustOffset((long) (short) -1, true);
        long long32 = dateTimeZone10.adjustOffset((-3600090L), true);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone10.getName((-2099920L), locale34);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone10.getName(3599901L, locale37);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-101L) + "'", long22 == (-101L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-3600090L) + "'", long32 == (-3600090L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.100" + "'", str35, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.100" + "'", str38, "+00:00:00.100");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0545");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+10:01", "+01:00", 2100000, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone11 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str13 = fixedDateTimeZone11.getNameKey((long) (byte) 0);
        long long15 = fixedDateTimeZone11.previousTransition((long) '#');
        long long17 = fixedDateTimeZone11.nextTransition((long) '4');
        int int19 = fixedDateTimeZone11.getOffset((long) '4');
        long long21 = fixedDateTimeZone11.previousTransition(35L);
        long long23 = fixedDateTimeZone11.previousTransition((long) (short) 100);
        long long25 = fixedDateTimeZone11.previousTransition((-1L));
        long long29 = fixedDateTimeZone11.convertLocalToUTC((long) (short) 10, false, 2099989L);
        java.lang.String str31 = fixedDateTimeZone11.getShortName((-165L));
        boolean boolean32 = fixedDateTimeZone4.equals((java.lang.Object) (-165L));
        java.util.TimeZone timeZone33 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:00" + "'", str6, "+01:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.010" + "'", str31, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+10:01");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0546");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        long long14 = fixedDateTimeZone4.adjustOffset((long) 'a', false);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime15);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        java.lang.Class<?> wildcardClass19 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0547");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset(97L);
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-149L));
        long long17 = fixedDateTimeZone4.convertUTCToLocal(3599891L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3599901L + "'", long17 == 3599901L);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0548");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        long long9 = dateTimeZone0.adjustOffset((long) '4', true);
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone16 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str18 = fixedDateTimeZone16.getNameKey(10L);
        boolean boolean20 = fixedDateTimeZone16.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone16);
        int int23 = fixedDateTimeZone16.getOffset((long) (byte) 1);
        long long25 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone16, (long) (-1));
        java.util.Locale locale27 = null;
        java.lang.String str28 = fixedDateTimeZone16.getName(232L, locale27);
        java.lang.String str30 = fixedDateTimeZone16.getShortName((-3600090L));
        long long34 = fixedDateTimeZone16.convertLocalToUTC(45L, true, (-1L));
        long long36 = fixedDateTimeZone16.nextTransition(100L);
        java.util.Locale locale38 = null;
        java.lang.String str39 = fixedDateTimeZone16.getShortName((long) (-4200000), locale38);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-11L) + "'", long25 == (-11L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.010" + "'", str28, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.010" + "'", str30, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35L + "'", long34 == 35L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.010" + "'", str39, "+00:00:00.010");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0549");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (byte) 0);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((long) (short) 1);
        long long15 = fixedDateTimeZone4.convertLocalToUTC((long) (-1), false);
        int int17 = fixedDateTimeZone4.getOffsetFromLocal((-11L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-11L) + "'", long15 == (-11L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0550");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long28 = fixedDateTimeZone4.adjustOffset((long) ' ', false);
        java.lang.String str30 = fixedDateTimeZone4.getShortName((-2099910L));
        java.lang.String str32 = fixedDateTimeZone4.getNameKey((long) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.010" + "'", str30, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0551");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-01:00", "-01:00", (int) ' ', 97);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0552");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((long) 0, locale16);
        int int19 = fixedDateTimeZone4.getOffset((-111L));
        long long21 = fixedDateTimeZone4.previousTransition((-68L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-68L) + "'", long21 == (-68L));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0553");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (short) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone7 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str9 = fixedDateTimeZone7.getNameKey(10L);
        boolean boolean11 = fixedDateTimeZone7.equals((java.lang.Object) 0.0d);
        java.lang.String str13 = fixedDateTimeZone7.getName((long) (byte) -1);
        java.util.TimeZone timeZone14 = fixedDateTimeZone7.toTimeZone();
        long long16 = fixedDateTimeZone7.previousTransition((long) 1);
        java.lang.String str18 = fixedDateTimeZone7.getName((long) 10);
        boolean boolean19 = fixedDateTimeZone7.isFixed();
        long long21 = dateTimeZone2.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone7, (long) 'a');
        java.util.Locale locale23 = null;
        java.lang.String str24 = fixedDateTimeZone7.getName((long) (short) 1, locale23);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.010" + "'", str13, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-3659913L) + "'", long21 == (-3659913L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.010" + "'", str24, "+00:00:00.010");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0554");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean7 = fixedDateTimeZone4.isStandardOffset((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        boolean boolean11 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone9);
        java.lang.String str13 = dateTimeZone9.getName((-48L));
        long long15 = dateTimeZone9.convertUTCToLocal(3599912L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3600012L + "'", long15 == 3600012L);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0555");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        long long8 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone6, (-11L));
        long long11 = fixedDateTimeZone4.adjustOffset((-10L), false);
        int int13 = fixedDateTimeZone4.getOffsetFromLocal((-70L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-11L) + "'", long8 == (-11L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-10L) + "'", long11 == (-10L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0556");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) (-1.0f));
        long long15 = fixedDateTimeZone4.convertLocalToUTC(2099999L, true);
        int int17 = fixedDateTimeZone4.getOffset((-99L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str24 = fixedDateTimeZone22.getNameKey((long) (byte) 0);
        long long26 = fixedDateTimeZone22.previousTransition((long) '#');
        long long28 = fixedDateTimeZone22.nextTransition((long) '4');
        int int30 = fixedDateTimeZone22.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = fixedDateTimeZone22.isLocalDateTimeGap(localDateTime31);
        java.util.TimeZone timeZone33 = fixedDateTimeZone22.toTimeZone();
        java.util.TimeZone timeZone34 = fixedDateTimeZone22.toTimeZone();
        java.lang.String str35 = fixedDateTimeZone22.getID();
        java.lang.Class<?> wildcardClass36 = fixedDateTimeZone22.getClass();
        boolean boolean37 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone22);
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = fixedDateTimeZone4.getOffset(readableInstant38);
        java.util.TimeZone timeZone40 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2099989L + "'", long15 == 2099989L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35L + "'", long26 == 35L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0557");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean7 = fixedDateTimeZone4.isStandardOffset((long) ' ');
        int int9 = fixedDateTimeZone4.getStandardOffset(10L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str16 = fixedDateTimeZone14.getNameKey((long) (byte) 0);
        long long18 = fixedDateTimeZone14.previousTransition((long) '#');
        int int20 = fixedDateTimeZone14.getOffsetFromLocal((long) (short) 10);
        java.util.Locale locale22 = null;
        java.lang.String str23 = fixedDateTimeZone14.getName(15L, locale22);
        boolean boolean24 = fixedDateTimeZone4.equals((java.lang.Object) locale22);
        java.lang.Class<?> wildcardClass25 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.010" + "'", str23, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0558");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.100", (int) (short) 10, (int) (short) -1);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName(25L, locale6);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str14 = fixedDateTimeZone12.getNameKey((long) (byte) 0);
        int int16 = fixedDateTimeZone12.getStandardOffset(100L);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long22 = dateTimeZone18.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str23 = dateTimeZone18.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        long long27 = dateTimeZone18.adjustOffset((long) (short) 10, false);
        long long30 = dateTimeZone18.convertLocalToUTC((long) (byte) -1, false);
        long long32 = fixedDateTimeZone12.getMillisKeepLocal(dateTimeZone18, (long) (byte) 100);
        java.lang.String str33 = dateTimeZone18.toString();
        long long35 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone18, 90L);
        int int37 = fixedDateTimeZone4.getOffset(3599912L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.010" + "'", str7, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-101L) + "'", long22 == (-101L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-101L) + "'", long30 == (-101L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0559");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long3 = dateTimeZone1.convertUTCToLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        long long8 = dateTimeZone1.adjustOffset((-65L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-65L) + "'", long8 == (-65L));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0560");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 100L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone16 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0561");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        long long18 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone23 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str25 = fixedDateTimeZone23.getNameKey(10L);
        java.util.TimeZone timeZone26 = fixedDateTimeZone23.toTimeZone();
        java.util.Locale locale28 = null;
        java.lang.String str29 = fixedDateTimeZone23.getShortName((long) (short) -1, locale28);
        boolean boolean30 = fixedDateTimeZone4.equals((java.lang.Object) (short) -1);
        java.lang.String str31 = fixedDateTimeZone4.getID();
        java.util.TimeZone timeZone32 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10L) + "'", long18 == (-10L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.010" + "'", str29, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0562");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset(97L);
        long long15 = fixedDateTimeZone4.nextTransition(0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0563");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long28 = fixedDateTimeZone4.adjustOffset((long) ' ', false);
        long long30 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        long long34 = fixedDateTimeZone4.convertLocalToUTC((long) 97, true, 100L);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long40 = dateTimeZone36.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str41 = dateTimeZone36.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        boolean boolean44 = dateTimeZone36.isStandardOffset(0L);
        java.lang.String str46 = dateTimeZone36.getShortName((long) (short) 1);
        long long48 = dateTimeZone36.convertUTCToLocal((long) ' ');
        org.joda.time.LocalDateTime localDateTime49 = null;
        boolean boolean50 = dateTimeZone36.isLocalDateTimeGap(localDateTime49);
        long long54 = dateTimeZone36.convertLocalToUTC(110L, false, (long) 97);
        java.lang.String str55 = dateTimeZone36.toString();
        long long57 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone36, (long) (byte) 1);
        long long61 = fixedDateTimeZone4.convertLocalToUTC((-89L), false, (-11L));
        java.lang.String str62 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-38L) + "'", long30 == (-38L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 87L + "'", long34 == 87L);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-101L) + "'", long40 == (-101L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.100" + "'", str41, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.100" + "'", str46, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 132L + "'", long48 == 132L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L + "'", long54 == 10L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.100" + "'", str55, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-89L) + "'", long57 == (-89L));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-99L) + "'", long61 == (-99L));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0564");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        java.lang.String str10 = dateTimeZone1.toString();
        java.lang.String str11 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0565");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        boolean boolean10 = fixedDateTimeZone4.isStandardOffset((long) 10);
        int int12 = fixedDateTimeZone4.getOffset((-2699989L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0566");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long10 = dateTimeZone1.adjustOffset((long) (short) 10, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0567");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (-4200000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -4200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0568");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = fixedDateTimeZone4.getOffset(readableInstant5);
        int int8 = fixedDateTimeZone4.getOffsetFromLocal((-58L));
        long long10 = fixedDateTimeZone4.nextTransition(97L);
        long long12 = fixedDateTimeZone4.convertUTCToLocal((-3600000L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3599903L) + "'", long12 == (-3599903L));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0569");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "UTC", 10, 97);
        int int6 = fixedDateTimeZone4.getOffset((-211L));
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str14 = fixedDateTimeZone12.getNameKey(10L);
        boolean boolean16 = fixedDateTimeZone12.equals((java.lang.Object) 0.0d);
        java.lang.String str18 = fixedDateTimeZone12.getName((long) (byte) -1);
        java.util.TimeZone timeZone19 = fixedDateTimeZone12.toTimeZone();
        long long21 = fixedDateTimeZone12.previousTransition((long) 1);
        java.lang.String str23 = fixedDateTimeZone12.getName((long) 10);
        boolean boolean24 = fixedDateTimeZone12.isFixed();
        int int26 = fixedDateTimeZone12.getStandardOffset(96L);
        boolean boolean27 = fixedDateTimeZone4.equals((java.lang.Object) 96L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.010" + "'", str23, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0570");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 32);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0571");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.toString();
        long long11 = fixedDateTimeZone4.nextTransition((long) (short) 0);
        java.lang.String str12 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0572");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) ' ', (int) (short) 100);
        long long6 = fixedDateTimeZone4.previousTransition((-158L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-158L) + "'", long6 == (-158L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0573");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0574");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "org/joda/time/tz/data", (int) (short) 100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int7 = fixedDateTimeZone4.getOffset((-99L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0575");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "hi!", (int) (short) -1, (int) (short) -1);
        long long7 = fixedDateTimeZone4.adjustOffset((long) (byte) -1, false);
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getShortName((-58L), locale9);
        long long14 = fixedDateTimeZone4.convertLocalToUTC((-48L), true, (long) '4');
        java.lang.String str16 = fixedDateTimeZone4.getNameKey((-3600162L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-47L) + "'", long14 == (-47L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0576");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        long long9 = dateTimeZone0.adjustOffset((long) '4', true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getShortName((-38L), locale12);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone0.getName(222L, locale15);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0577");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        java.lang.String str12 = fixedDateTimeZone4.getShortName((long) (short) 0);
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0578");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone16 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str19 = fixedDateTimeZone4.getShortName(287L);
        int int21 = fixedDateTimeZone4.getStandardOffset(110L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.010" + "'", str19, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0579");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        int int21 = fixedDateTimeZone4.getOffsetFromLocal((long) 100);
        long long23 = fixedDateTimeZone4.nextTransition((long) (short) 0);
        java.lang.String str25 = fixedDateTimeZone4.getShortName(52L);
        boolean boolean26 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111L) + "'", long17 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.010" + "'", str25, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0580");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        int int17 = fixedDateTimeZone4.getOffset((-3600090L));
        long long19 = fixedDateTimeZone4.convertUTCToLocal(35L);
        int int21 = fixedDateTimeZone4.getOffsetFromLocal(3L);
        java.util.Locale locale23 = null;
        java.lang.String str24 = fixedDateTimeZone4.getName(232L, locale23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 45L + "'", long19 == 45L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.010" + "'", str24, "+00:00:00.010");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0581");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long7 = dateTimeZone3.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long13 = dateTimeZone9.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str14 = dateTimeZone9.getID();
        long long16 = dateTimeZone3.getMillisKeepLocal(dateTimeZone9, (long) (byte) 1);
        long long19 = dateTimeZone3.convertLocalToUTC((long) '4', false);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone3.getName((long) ' ', locale21);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (byte) 0);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone3.getShortName(200L, locale26);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone32 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str34 = fixedDateTimeZone32.getNameKey((long) (byte) 0);
        int int36 = fixedDateTimeZone32.getStandardOffset(100L);
        java.lang.String str38 = fixedDateTimeZone32.getNameKey((long) 0);
        long long41 = fixedDateTimeZone32.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = fixedDateTimeZone32.getOffset(readableInstant42);
        long long45 = fixedDateTimeZone32.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = fixedDateTimeZone32.isLocalDateTimeGap(localDateTime46);
        int int49 = fixedDateTimeZone32.getOffsetFromLocal((long) 100);
        long long51 = fixedDateTimeZone32.nextTransition((long) (short) 0);
        long long53 = dateTimeZone3.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone32, (long) 0);
        java.lang.String str55 = fixedDateTimeZone32.getName(2099999L);
        java.lang.String str56 = fixedDateTimeZone32.toString();
        java.lang.String str57 = fixedDateTimeZone32.getID();
        int int59 = fixedDateTimeZone32.getOffset((long) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-101L) + "'", long7 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-101L) + "'", long13 == (-101L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-48L) + "'", long19 == (-48L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-11L) + "'", long41 == (-11L));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-111L) + "'", long45 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 90L + "'", long53 == 90L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.010" + "'", str55, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0582");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        int int11 = fixedDateTimeZone4.getStandardOffset(62L);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        java.lang.String str14 = fixedDateTimeZone4.getName((-58L));
        java.lang.String str16 = fixedDateTimeZone4.getName((-80L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.010" + "'", str16, "+00:00:00.010");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0583");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        boolean boolean26 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0584");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-01:00", "+00:00:00.010", (int) (byte) 100, 32);
        java.lang.String str5 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0585");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:35", "+01:00", (int) (byte) -1, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0586");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(97, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0587");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str12 = dateTimeZone7.getID();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (byte) 1);
        long long17 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone1.getOffset(readableInstant20);
        long long24 = dateTimeZone1.adjustOffset((-20L), false);
        java.lang.String str25 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-101L) + "'", long17 == (-101L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-20L) + "'", long24 == (-20L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0588");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        java.lang.String str12 = fixedDateTimeZone4.getShortName((long) (short) 0);
        long long14 = fixedDateTimeZone4.convertUTCToLocal(147L);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey(3599901L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 157L + "'", long14 == 157L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0589");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        long long7 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str14 = fixedDateTimeZone12.getNameKey(10L);
        boolean boolean16 = fixedDateTimeZone12.equals((java.lang.Object) 0.0d);
        int int18 = fixedDateTimeZone12.getStandardOffset((long) (byte) 0);
        java.lang.String str20 = fixedDateTimeZone12.getNameKey((long) (short) 1);
        boolean boolean21 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone12);
        long long24 = fixedDateTimeZone4.convertLocalToUTC((long) (short) 100, true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-68L) + "'", long7 == (-68L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0590");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        java.lang.String str3 = dateTimeZone1.getShortName((-2099920L));
        long long6 = dateTimeZone1.convertLocalToUTC((-36060038L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-36060038L) + "'", long6 == (-36060038L));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0591");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        java.lang.String str12 = fixedDateTimeZone4.getName((-20L));
        long long14 = fixedDateTimeZone4.convertUTCToLocal((-201L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.097" + "'", str12, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-104L) + "'", long14 == (-104L));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0592");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        int int14 = fixedDateTimeZone4.getOffsetFromLocal(2099999L);
        long long16 = fixedDateTimeZone4.previousTransition((-179L));
        long long19 = fixedDateTimeZone4.adjustOffset(25L, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-179L) + "'", long16 == (-179L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 25L + "'", long19 == 25L);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0593");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset(97L);
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-149L));
        java.lang.String str17 = fixedDateTimeZone4.getShortName(1L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getShortName(10L, locale19);
        java.lang.String str21 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0594");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        int int21 = fixedDateTimeZone4.getOffsetFromLocal((long) 100);
        long long24 = fixedDateTimeZone4.adjustOffset((long) 100, false);
        boolean boolean26 = fixedDateTimeZone4.isStandardOffset((long) 'a');
        int int28 = fixedDateTimeZone4.getStandardOffset((-89L));
        boolean boolean29 = fixedDateTimeZone4.isFixed();
        long long31 = fixedDateTimeZone4.convertUTCToLocal((long) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111L) + "'", long17 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 11L + "'", long31 == 11L);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0595");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        long long9 = dateTimeZone0.adjustOffset((long) '4', true);
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone16 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str18 = fixedDateTimeZone16.getNameKey(10L);
        boolean boolean20 = fixedDateTimeZone16.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone16);
        int int23 = fixedDateTimeZone16.getOffset((long) (byte) 1);
        long long25 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone16, (long) (-1));
        java.util.Locale locale27 = null;
        java.lang.String str28 = fixedDateTimeZone16.getName(232L, locale27);
        java.lang.String str30 = fixedDateTimeZone16.getShortName((-3600090L));
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = fixedDateTimeZone16.isLocalDateTimeGap(localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-11L) + "'", long25 == (-11L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.010" + "'", str28, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.010" + "'", str30, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0596");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.100", (int) (short) 10, (int) (short) -1);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName(25L, locale6);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str14 = fixedDateTimeZone12.getNameKey((long) (byte) 0);
        int int16 = fixedDateTimeZone12.getStandardOffset(100L);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long22 = dateTimeZone18.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str23 = dateTimeZone18.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        long long27 = dateTimeZone18.adjustOffset((long) (short) 10, false);
        long long30 = dateTimeZone18.convertLocalToUTC((long) (byte) -1, false);
        long long32 = fixedDateTimeZone12.getMillisKeepLocal(dateTimeZone18, (long) (byte) 100);
        java.lang.String str33 = dateTimeZone18.toString();
        long long35 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone18, 90L);
        java.lang.Class<?> wildcardClass36 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.010" + "'", str7, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-101L) + "'", long22 == (-101L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-101L) + "'", long30 == (-101L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0597");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone16 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str19 = fixedDateTimeZone4.getShortName(287L);
        long long21 = fixedDateTimeZone4.previousTransition(232L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.010" + "'", str19, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 232L + "'", long21 == 232L);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0598");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (byte) 1, locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0599");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.lang.String str3 = dateTimeZone1.getName(232L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((-11L), locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.100" + "'", str3, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0600");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0601");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset(97L);
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-149L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getShortName(132L, locale17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0602");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long28 = fixedDateTimeZone4.adjustOffset((long) ' ', false);
        long long30 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        java.lang.String str32 = fixedDateTimeZone4.getShortName((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = fixedDateTimeZone4.getOffset(readableInstant33);
        java.lang.String str35 = fixedDateTimeZone4.toString();
        long long37 = fixedDateTimeZone4.previousTransition((-179L));
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = fixedDateTimeZone4.getOffset(readableInstant38);
        int int41 = fixedDateTimeZone4.getOffset((-3659913L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone46 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str48 = fixedDateTimeZone46.getNameKey(10L);
        boolean boolean50 = fixedDateTimeZone46.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone46);
        boolean boolean52 = fixedDateTimeZone46.isFixed();
        int int54 = fixedDateTimeZone46.getOffsetFromLocal((long) (byte) -1);
        long long56 = fixedDateTimeZone46.nextTransition((long) (short) 0);
        boolean boolean57 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone46);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-38L) + "'", long30 == (-38L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.010" + "'", str32, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-179L) + "'", long37 == (-179L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0603");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        long long11 = dateTimeZone1.convertUTCToLocal((-101L));
        java.lang.String str13 = dateTimeZone1.getShortName(35L);
        long long16 = dateTimeZone1.adjustOffset((long) '#', false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0604");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        long long17 = fixedDateTimeZone4.nextTransition((-2099910L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str24 = fixedDateTimeZone22.getNameKey((long) (byte) 0);
        int int26 = fixedDateTimeZone22.getStandardOffset(100L);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long32 = dateTimeZone28.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str33 = dateTimeZone28.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        long long37 = dateTimeZone28.adjustOffset((long) (short) 10, false);
        long long40 = dateTimeZone28.convertLocalToUTC((long) (byte) -1, false);
        long long42 = fixedDateTimeZone22.getMillisKeepLocal(dateTimeZone28, (long) (byte) 100);
        java.lang.String str43 = dateTimeZone28.toString();
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone28.getShortName((-127L), locale45);
        boolean boolean47 = fixedDateTimeZone4.equals((java.lang.Object) locale45);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-2099910L) + "'", long17 == (-2099910L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-101L) + "'", long32 == (-101L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-101L) + "'", long40 == (-101L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L + "'", long42 == 10L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.100" + "'", str43, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.100" + "'", str46, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0605");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        long long14 = fixedDateTimeZone4.adjustOffset((long) 'a', false);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime16);
        long long20 = fixedDateTimeZone4.convertLocalToUTC((long) 0, true);
        long long23 = fixedDateTimeZone4.convertLocalToUTC(90L, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-10L) + "'", long20 == (-10L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 80L + "'", long23 == 80L);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0606");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) 'a');
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0607");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        java.lang.String str20 = fixedDateTimeZone4.getName((-38L));
        java.lang.String str22 = fixedDateTimeZone4.getNameKey((-97L));
        long long24 = fixedDateTimeZone4.convertUTCToLocal(232L);
        java.lang.String str26 = fixedDateTimeZone4.getShortName(100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 242L + "'", long24 == 242L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.010" + "'", str26, "+00:00:00.010");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0608");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        java.lang.String str12 = fixedDateTimeZone4.getName((-20L));
        long long14 = fixedDateTimeZone4.convertUTCToLocal((-2099989L));
        long long16 = fixedDateTimeZone4.previousTransition((-2699999L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.097" + "'", str12, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2099892L) + "'", long14 == (-2099892L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-2699999L) + "'", long16 == (-2699999L));
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0609");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean13 = fixedDateTimeZone4.equals((java.lang.Object) "UTC");
        java.lang.String str14 = fixedDateTimeZone4.getID();
        java.lang.String str15 = fixedDateTimeZone4.toString();
        java.lang.String str16 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) ' ', (int) (short) 100);
        int int23 = fixedDateTimeZone21.getStandardOffset((-144L));
        long long25 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone21, (-149L));
        java.util.TimeZone timeZone26 = fixedDateTimeZone21.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-171L) + "'", long25 == (-171L));
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0610");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 35);
        long long5 = dateTimeZone2.convertLocalToUTC(90L, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str7 = dateTimeZone2.getID();
        long long11 = dateTimeZone2.convertLocalToUTC(2099999L, false, (-2699999L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-2099910L) + "'", long5 == (-2099910L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:35" + "'", str7, "+00:35");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0611");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long7 = dateTimeZone3.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long13 = dateTimeZone9.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str14 = dateTimeZone9.getID();
        long long16 = dateTimeZone3.getMillisKeepLocal(dateTimeZone9, (long) (byte) 1);
        long long19 = dateTimeZone3.convertLocalToUTC((long) '4', false);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone3.getName((long) ' ', locale21);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (byte) 0);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone3.getShortName(200L, locale26);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone32 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str34 = fixedDateTimeZone32.getNameKey((long) (byte) 0);
        int int36 = fixedDateTimeZone32.getStandardOffset(100L);
        java.lang.String str38 = fixedDateTimeZone32.getNameKey((long) 0);
        long long41 = fixedDateTimeZone32.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = fixedDateTimeZone32.getOffset(readableInstant42);
        long long45 = fixedDateTimeZone32.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = fixedDateTimeZone32.isLocalDateTimeGap(localDateTime46);
        int int49 = fixedDateTimeZone32.getOffsetFromLocal((long) 100);
        long long51 = fixedDateTimeZone32.nextTransition((long) (short) 0);
        long long53 = dateTimeZone3.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone32, (long) 0);
        boolean boolean54 = fixedDateTimeZone32.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-101L) + "'", long7 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-101L) + "'", long13 == (-101L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-48L) + "'", long19 == (-48L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-11L) + "'", long41 == (-11L));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-111L) + "'", long45 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 90L + "'", long53 == 90L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0612");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "+00:00:00.052", 100, (-1));
        long long7 = fixedDateTimeZone4.convertLocalToUTC(97L, false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0613");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) ' ', (int) (short) 100);
        long long6 = fixedDateTimeZone4.previousTransition((-158L));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        java.lang.String str10 = fixedDateTimeZone4.getShortName(87L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-158L) + "'", long6 == (-158L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.032" + "'", str10, "+00:00:00.032");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0614");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        int int21 = fixedDateTimeZone4.getOffsetFromLocal((long) 100);
        long long24 = fixedDateTimeZone4.adjustOffset((long) 100, false);
        boolean boolean26 = fixedDateTimeZone4.isStandardOffset((long) 'a');
        int int28 = fixedDateTimeZone4.getStandardOffset((-89L));
        long long32 = fixedDateTimeZone4.convertLocalToUTC((-47L), true, (-28799903L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111L) + "'", long17 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-57L) + "'", long32 == (-57L));
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0615");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long29 = fixedDateTimeZone4.convertLocalToUTC((-10L), false, (long) (byte) 100);
        java.lang.String str31 = fixedDateTimeZone4.getNameKey((long) (short) 0);
        boolean boolean32 = fixedDateTimeZone4.isFixed();
        java.util.Locale locale34 = null;
        java.lang.String str35 = fixedDateTimeZone4.getName((long) 10, locale34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-20L) + "'", long29 == (-20L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.010" + "'", str35, "+00:00:00.010");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0616");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.032", "Coordinated Universal Time", (int) (short) 0, (int) (byte) -1);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0617");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        long long8 = fixedDateTimeZone4.previousTransition((-117L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        long long15 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, (-127L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-117L) + "'", long8 == (-117L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-217L) + "'", long15 == (-217L));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0618");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str8 = fixedDateTimeZone4.toString();
        int int10 = fixedDateTimeZone4.getOffset((-90L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0619");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str12 = dateTimeZone7.getID();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (byte) 1);
        long long17 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        long long23 = dateTimeZone1.convertLocalToUTC((-1L), false, (-111L));
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone1.isLocalDateTimeGap(localDateTime24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone1.getOffset(readableInstant26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-101L) + "'", long17 == (-101L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-101L) + "'", long23 == (-101L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0620");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "UTC", (int) (byte) 10, (int) (byte) -1);
        java.lang.String str5 = fixedDateTimeZone4.getID();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        long long10 = fixedDateTimeZone4.convertLocalToUTC((-11L), true, 0L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-21L) + "'", long10 == (-21L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0621");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) (-1.0f));
        long long16 = fixedDateTimeZone4.convertLocalToUTC((-109L), true, (-3600162L));
        long long18 = fixedDateTimeZone4.nextTransition((-169L));
        int int20 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-119L) + "'", long16 == (-119L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-169L) + "'", long18 == (-169L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0622");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        long long9 = dateTimeZone0.adjustOffset((long) '4', true);
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone16 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str18 = fixedDateTimeZone16.getNameKey(10L);
        boolean boolean20 = fixedDateTimeZone16.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone16);
        int int23 = fixedDateTimeZone16.getOffset((long) (byte) 1);
        long long25 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone16, (long) (-1));
        java.util.Locale locale27 = null;
        java.lang.String str28 = fixedDateTimeZone16.getName(232L, locale27);
        java.lang.String str30 = fixedDateTimeZone16.getShortName((-3600090L));
        long long34 = fixedDateTimeZone16.convertLocalToUTC(45L, true, (-1L));
        java.lang.String str35 = fixedDateTimeZone16.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-11L) + "'", long25 == (-11L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.010" + "'", str28, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.010" + "'", str30, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35L + "'", long34 == 35L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0623");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        long long14 = fixedDateTimeZone4.convertLocalToUTC((-4200000L), false, 0L);
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 0);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone4.getShortName(100L, locale18);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4200097L) + "'", long14 == (-4200097L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.097" + "'", str19, "+00:00:00.097");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0624");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "UTC", (int) (byte) 10, (int) (byte) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str11 = fixedDateTimeZone9.getNameKey((long) (byte) 0);
        long long13 = fixedDateTimeZone9.previousTransition((long) '#');
        java.lang.String str14 = fixedDateTimeZone9.getID();
        java.lang.String str16 = fixedDateTimeZone9.getShortName((-20L));
        long long18 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone9, (-4199975L));
        int int20 = fixedDateTimeZone4.getOffset((-60065L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.010" + "'", str16, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-4199975L) + "'", long18 == (-4199975L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0625");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone8.getName((long) (byte) 0, locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long17 = dateTimeZone13.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str18 = dateTimeZone13.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        boolean boolean21 = dateTimeZone13.isStandardOffset(0L);
        java.lang.String str23 = dateTimeZone13.getShortName((long) (short) 1);
        long long27 = dateTimeZone13.convertLocalToUTC(1L, true, 62L);
        long long29 = dateTimeZone8.getMillisKeepLocal(dateTimeZone13, (-62L));
        long long31 = dateTimeZone0.getMillisKeepLocal(dateTimeZone8, (-3600090L));
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone8.getName((long) 100, locale33);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-101L) + "'", long17 == (-101L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-99L) + "'", long27 == (-99L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-3600162L) + "'", long29 == (-3600162L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-90L) + "'", long31 == (-90L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-01:00" + "'", str34, "-01:00");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0626");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        int int10 = fixedDateTimeZone4.getStandardOffset((-101L));
        int int12 = fixedDateTimeZone4.getOffset((long) 35);
        java.lang.String str14 = fixedDateTimeZone4.getNameKey(1500011L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0627");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long28 = fixedDateTimeZone4.adjustOffset((long) ' ', false);
        long long30 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        java.lang.String str32 = fixedDateTimeZone4.getShortName((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = fixedDateTimeZone4.getOffset(readableInstant33);
        java.lang.String str35 = fixedDateTimeZone4.toString();
        long long37 = fixedDateTimeZone4.previousTransition((-179L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone42 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str44 = fixedDateTimeZone42.getNameKey((long) (byte) 0);
        long long46 = fixedDateTimeZone42.previousTransition((long) '#');
        int int48 = fixedDateTimeZone42.getOffsetFromLocal((long) (short) 10);
        long long50 = fixedDateTimeZone42.nextTransition(132L);
        java.lang.String str52 = fixedDateTimeZone42.getName((long) (short) 10);
        java.util.TimeZone timeZone53 = fixedDateTimeZone42.toTimeZone();
        java.util.Locale locale55 = null;
        java.lang.String str56 = fixedDateTimeZone42.getName(110L, locale55);
        boolean boolean58 = fixedDateTimeZone42.isStandardOffset((-99L));
        org.joda.time.LocalDateTime localDateTime59 = null;
        boolean boolean60 = fixedDateTimeZone42.isLocalDateTimeGap(localDateTime59);
        long long62 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone42, (long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-38L) + "'", long30 == (-38L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.010" + "'", str32, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-179L) + "'", long37 == (-179L));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 35L + "'", long46 == 35L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 132L + "'", long50 == 132L);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00:00.010" + "'", str52, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00:00.010" + "'", str56, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10L + "'", long62 == 10L);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0628");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) (-1.0f));
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-88L));
        long long17 = fixedDateTimeZone4.nextTransition((-107L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-107L) + "'", long17 == (-107L));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0629");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        boolean boolean21 = fixedDateTimeZone4.isStandardOffset((-20L));
        java.lang.String str23 = fixedDateTimeZone4.getNameKey((-10L));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long29 = dateTimeZone25.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long35 = dateTimeZone31.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str36 = dateTimeZone31.getID();
        long long38 = dateTimeZone25.getMillisKeepLocal(dateTimeZone31, (long) (byte) 1);
        long long40 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone25, (-47L));
        java.util.Locale locale42 = null;
        java.lang.String str43 = fixedDateTimeZone4.getShortName(87L, locale42);
        long long45 = fixedDateTimeZone4.previousTransition(90L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111L) + "'", long17 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-101L) + "'", long29 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-101L) + "'", long35 == (-101L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.100" + "'", str36, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-137L) + "'", long40 == (-137L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.010" + "'", str43, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 90L + "'", long45 == 90L);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0630");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        long long18 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone19 = fixedDateTimeZone4.toTimeZone();
        long long23 = fixedDateTimeZone4.convertLocalToUTC(62L, false, 10L);
        long long25 = fixedDateTimeZone4.previousTransition((-144L));
        java.util.TimeZone timeZone26 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone31 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str33 = fixedDateTimeZone31.getNameKey(10L);
        boolean boolean35 = fixedDateTimeZone31.equals((java.lang.Object) 0.0d);
        long long37 = fixedDateTimeZone31.convertUTCToLocal((-48L));
        boolean boolean39 = fixedDateTimeZone31.equals((java.lang.Object) (-1.0f));
        long long42 = fixedDateTimeZone31.convertLocalToUTC(2099999L, true);
        int int44 = fixedDateTimeZone31.getOffset((-99L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone49 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str51 = fixedDateTimeZone49.getNameKey((long) (byte) 0);
        long long53 = fixedDateTimeZone49.previousTransition((long) '#');
        long long55 = fixedDateTimeZone49.nextTransition((long) '4');
        int int57 = fixedDateTimeZone49.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime58 = null;
        boolean boolean59 = fixedDateTimeZone49.isLocalDateTimeGap(localDateTime58);
        java.util.TimeZone timeZone60 = fixedDateTimeZone49.toTimeZone();
        java.util.TimeZone timeZone61 = fixedDateTimeZone49.toTimeZone();
        java.lang.String str62 = fixedDateTimeZone49.getID();
        java.lang.Class<?> wildcardClass63 = fixedDateTimeZone49.getClass();
        boolean boolean64 = fixedDateTimeZone31.equals((java.lang.Object) fixedDateTimeZone49);
        long long66 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone49, (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10L) + "'", long18 == (-10L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-144L) + "'", long25 == (-144L));
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-38L) + "'", long37 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 2099989L + "'", long42 == 2099989L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 35L + "'", long53 == 35L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 52L + "'", long55 == 52L);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-101L) + "'", long66 == (-101L));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0631");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getShortName((long) '#', locale9);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0632");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getName(110L, locale17);
        boolean boolean20 = fixedDateTimeZone4.isStandardOffset((-99L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone25 = new org.joda.time.tz.FixedDateTimeZone("", "", (int) (short) 0, (int) ' ');
        boolean boolean26 = fixedDateTimeZone4.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0633");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        java.lang.String str20 = fixedDateTimeZone4.getName((-38L));
        java.lang.String str22 = fixedDateTimeZone4.getNameKey((-97L));
        long long24 = fixedDateTimeZone4.convertUTCToLocal(232L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = fixedDateTimeZone4.getName((-58L), locale26);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 242L + "'", long24 == 242L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.010" + "'", str27, "+00:00:00.010");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0634");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        long long12 = fixedDateTimeZone4.nextTransition(384L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-10L) + "'", long10 == (-10L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 384L + "'", long12 == 384L);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0635");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long8 = dateTimeZone1.convertLocalToUTC((-3L), false, (-60L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-4L) + "'", long8 == (-4L));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0636");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long10 = dateTimeZone1.adjustOffset((long) (short) 10, false);
        long long13 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, false);
        long long15 = dateTimeZone1.convertUTCToLocal((long) (short) 10);
        java.lang.String str16 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-101L) + "'", long13 == (-101L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0637");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone8.getName((long) (byte) 0, locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long17 = dateTimeZone13.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str18 = dateTimeZone13.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        boolean boolean21 = dateTimeZone13.isStandardOffset(0L);
        java.lang.String str23 = dateTimeZone13.getShortName((long) (short) 1);
        long long27 = dateTimeZone13.convertLocalToUTC(1L, true, 62L);
        long long29 = dateTimeZone8.getMillisKeepLocal(dateTimeZone13, (-62L));
        long long31 = dateTimeZone0.getMillisKeepLocal(dateTimeZone8, (-3600090L));
        java.lang.String str33 = dateTimeZone8.getName(111L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-101L) + "'", long17 == (-101L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-99L) + "'", long27 == (-99L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-3600162L) + "'", long29 == (-3600162L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-90L) + "'", long31 == (-90L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-01:00" + "'", str33, "-01:00");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0638");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2100000, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 2100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0639");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long28 = fixedDateTimeZone4.adjustOffset((long) ' ', false);
        long long30 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        java.lang.String str32 = fixedDateTimeZone4.getShortName((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = fixedDateTimeZone4.getOffset(readableInstant33);
        java.lang.String str35 = fixedDateTimeZone4.toString();
        long long37 = fixedDateTimeZone4.previousTransition((-179L));
        java.util.Locale locale39 = null;
        java.lang.String str40 = fixedDateTimeZone4.getName((-110L), locale39);
        int int42 = fixedDateTimeZone4.getOffsetFromLocal(1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-38L) + "'", long30 == (-38L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.010" + "'", str32, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-179L) + "'", long37 == (-179L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.010" + "'", str40, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0640");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 35, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getShortName((-2099999L));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone7.convertLocalToUTC((long) 1, false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone7.getName(1L, locale12);
        long long16 = dateTimeZone7.adjustOffset((long) '4', true);
        java.lang.String str18 = dateTimeZone7.getName((long) (byte) -1);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone7.getShortName((-99L), locale20);
        java.lang.String str23 = dateTimeZone7.getName((long) ' ');
        long long25 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone7, (-179L));
        int int27 = fixedDateTimeZone4.getStandardOffset((-90L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coordinated Universal Time" + "'", str18, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coordinated Universal Time" + "'", str23, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-144L) + "'", long25 == (-144L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0641");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        long long14 = fixedDateTimeZone4.convertLocalToUTC((-4200000L), false, 0L);
        long long16 = fixedDateTimeZone4.previousTransition((-144L));
        int int18 = fixedDateTimeZone4.getOffset((-149L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4200097L) + "'", long14 == (-4200097L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-144L) + "'", long16 == (-144L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0642");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.Locale locale12 = null;
        java.lang.String str13 = fixedDateTimeZone4.getName((long) (-1), locale12);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.010" + "'", str13, "+00:00:00.010");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0643");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        long long10 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, false, 0L);
        long long13 = dateTimeZone1.convertLocalToUTC((long) '#', true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str20 = fixedDateTimeZone18.getNameKey(10L);
        java.lang.String str22 = fixedDateTimeZone18.getNameKey((long) (-1));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale29 = null;
        java.lang.String str30 = fixedDateTimeZone27.getShortName((-28799903L), locale29);
        boolean boolean31 = fixedDateTimeZone27.isFixed();
        java.lang.String str33 = fixedDateTimeZone27.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long37 = fixedDateTimeZone27.getMillisKeepLocal(dateTimeZone35, 100L);
        java.lang.String str39 = dateTimeZone35.getShortName(0L);
        java.lang.String str40 = dateTimeZone35.toString();
        java.lang.String str42 = dateTimeZone35.getShortName((long) (byte) 1);
        long long44 = fixedDateTimeZone18.getMillisKeepLocal(dateTimeZone35, (-68L));
        long long46 = dateTimeZone1.getMillisKeepLocal(dateTimeZone35, (-144L));
        boolean boolean48 = dateTimeZone35.isStandardOffset((-2099999L));
        long long51 = dateTimeZone35.convertLocalToUTC(232L, true);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long57 = dateTimeZone53.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str58 = dateTimeZone53.getID();
        org.joda.time.ReadableInstant readableInstant59 = null;
        int int60 = dateTimeZone53.getOffset(readableInstant59);
        org.joda.time.LocalDateTime localDateTime61 = null;
        boolean boolean62 = dateTimeZone53.isLocalDateTimeGap(localDateTime61);
        java.util.Locale locale64 = null;
        java.lang.String str65 = dateTimeZone53.getName((-36060038L), locale64);
        long long67 = dateTimeZone35.getMillisKeepLocal(dateTimeZone53, (-127L));
        long long70 = dateTimeZone53.adjustOffset((-88L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-65L) + "'", long13 == (-65L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.097" + "'", str30, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org/joda/time/tz/data" + "'", str33, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 97L + "'", long37 == 97L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.100" + "'", str40, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.100" + "'", str42, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-158L) + "'", long44 == (-158L));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-144L) + "'", long46 == (-144L));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 132L + "'", long51 == 132L);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-101L) + "'", long57 == (-101L));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00:00.100" + "'", str58, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+00:00:00.100" + "'", str65, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-127L) + "'", long67 == (-127L));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-88L) + "'", long70 == (-88L));
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0644");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((-97L));
        long long8 = fixedDateTimeZone4.nextTransition((long) (byte) 100);
        int int10 = fixedDateTimeZone4.getOffset(52L);
        int int12 = fixedDateTimeZone4.getStandardOffset(122L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0645");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getShortName(222L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0646");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-00:00:00.001", "-00:00:00.001", 0, (int) '#');
        int int6 = fixedDateTimeZone4.getOffset(90L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0647");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0648");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 35, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getShortName((-2099999L));
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0649");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((-3600090L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone15.getShortName((-28799903L), locale17);
        boolean boolean19 = fixedDateTimeZone15.isFixed();
        java.lang.String str21 = fixedDateTimeZone15.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long25 = fixedDateTimeZone15.getMillisKeepLocal(dateTimeZone23, 100L);
        boolean boolean26 = fixedDateTimeZone15.isFixed();
        int int28 = fixedDateTimeZone15.getStandardOffset(87L);
        long long30 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (-211L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.097" + "'", str18, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org/joda/time/tz/data" + "'", str21, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-211L) + "'", long30 == (-211L));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0650");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone10 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str12 = fixedDateTimeZone10.getNameKey((long) (byte) 0);
        long long14 = fixedDateTimeZone10.previousTransition((long) '#');
        java.lang.String str15 = fixedDateTimeZone10.getID();
        int int17 = fixedDateTimeZone10.getStandardOffset(62L);
        boolean boolean18 = fixedDateTimeZone10.isFixed();
        java.lang.String str20 = fixedDateTimeZone10.getName((-58L));
        boolean boolean21 = fixedDateTimeZone10.isFixed();
        long long23 = fixedDateTimeZone10.previousTransition((-3600162L));
        long long25 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone10, (long) (byte) 1);
        java.util.Locale locale27 = null;
        java.lang.String str28 = fixedDateTimeZone10.getShortName((-2099989L), locale27);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-3600162L) + "'", long23 == (-3600162L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 91L + "'", long25 == 91L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.010" + "'", str28, "+00:00:00.010");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0651");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str11 = dateTimeZone1.getShortName((long) (short) 1);
        long long15 = dateTimeZone1.convertLocalToUTC(1L, true, 62L);
        java.lang.String str17 = dateTimeZone1.getShortName(200L);
        boolean boolean19 = dateTimeZone1.isStandardOffset(62L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long22 = dateTimeZone1.convertUTCToLocal((long) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0652");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.035", "+01:00", (int) (short) 1, (int) (short) 10);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0653");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0654");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0655");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        long long17 = fixedDateTimeZone4.nextTransition(62L);
        int int19 = fixedDateTimeZone4.getStandardOffset((-72L));
        boolean boolean21 = fixedDateTimeZone4.isStandardOffset((-217L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 62L + "'", long17 == 62L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0656");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long13 = fixedDateTimeZone4.previousTransition((long) 1);
        java.lang.String str15 = fixedDateTimeZone4.getName((long) 10);
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        int int18 = fixedDateTimeZone4.getStandardOffset(96L);
        boolean boolean20 = fixedDateTimeZone4.isStandardOffset(97L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0657");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-101L), true);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((-107L), false);
        long long18 = fixedDateTimeZone4.convertUTCToLocal(3600012L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-111L) + "'", long13 == (-111L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-117L) + "'", long16 == (-117L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3600022L + "'", long18 == 3600022L);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0658");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        int int13 = fixedDateTimeZone4.getOffset((long) 100);
        boolean boolean14 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset(87L);
        long long20 = fixedDateTimeZone4.convertLocalToUTC(3599901L, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3599891L + "'", long20 == 3599891L);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0659");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str17 = fixedDateTimeZone4.getID();
        long long20 = fixedDateTimeZone4.convertLocalToUTC(416L, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 406L + "'", long20 == 406L);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0660");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = fixedDateTimeZone4.getOffset(readableInstant26);
        boolean boolean28 = fixedDateTimeZone4.isFixed();
        long long30 = fixedDateTimeZone4.previousTransition((-3600090L));
        boolean boolean31 = fixedDateTimeZone4.isFixed();
        org.joda.time.tz.Provider provider32 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        boolean boolean43 = fixedDateTimeZone4.equals((java.lang.Object) provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-3600090L) + "'", long30 == (-3600090L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(provider32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0661");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-20L));
        long long13 = fixedDateTimeZone4.nextTransition((-111L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str20 = fixedDateTimeZone18.getNameKey((long) (byte) 0);
        int int22 = fixedDateTimeZone18.getStandardOffset(100L);
        int int24 = fixedDateTimeZone18.getStandardOffset((-101L));
        int int26 = fixedDateTimeZone18.getOffset((long) 35);
        long long28 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, 0L);
        int int30 = fixedDateTimeZone4.getOffsetFromLocal(112L);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = fixedDateTimeZone4.getOffset(readableInstant31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-111L) + "'", long13 == (-111L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0662");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0663");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        int int10 = fixedDateTimeZone4.getStandardOffset((-101L));
        int int12 = fixedDateTimeZone4.getOffset((long) 35);
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        int int15 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0664");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long12 = fixedDateTimeZone4.previousTransition((long) '4');
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-171L));
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getName((-2099892L), locale16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0665");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        long long18 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        long long21 = fixedDateTimeZone4.adjustOffset((long) 97, false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "hi!", (int) (short) -1, (int) (short) -1);
        long long28 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone26, (long) (short) 100);
        long long30 = fixedDateTimeZone4.convertUTCToLocal(3599891L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10L) + "'", long18 == (-10L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 111L + "'", long28 == 111L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3599901L + "'", long30 == 3599901L);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0666");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        long long18 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        long long21 = fixedDateTimeZone4.adjustOffset((long) 97, false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "hi!", (int) (short) -1, (int) (short) -1);
        long long28 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone26, (long) (short) 100);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone33 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str35 = fixedDateTimeZone33.getNameKey((long) (byte) 0);
        long long37 = fixedDateTimeZone33.previousTransition((long) '#');
        long long39 = fixedDateTimeZone33.nextTransition((long) '4');
        int int41 = fixedDateTimeZone33.getOffset((long) '4');
        long long43 = fixedDateTimeZone33.previousTransition(35L);
        boolean boolean44 = fixedDateTimeZone33.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone33);
        java.lang.String str46 = fixedDateTimeZone33.getID();
        boolean boolean47 = fixedDateTimeZone4.equals((java.lang.Object) str46);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10L) + "'", long18 == (-10L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 111L + "'", long28 == 111L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 35L + "'", long37 == 35L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 52L + "'", long39 == 52L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 35L + "'", long43 == 35L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0667");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(97, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0668");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime16);
        java.lang.String str18 = fixedDateTimeZone4.toString();
        java.util.Locale locale20 = null;
        java.lang.String str21 = fixedDateTimeZone4.getName((-4200097L), locale20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.010" + "'", str21, "+00:00:00.010");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0669");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        int int14 = fixedDateTimeZone4.getOffset((long) '4');
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        java.lang.String str17 = fixedDateTimeZone4.toString();
        boolean boolean19 = fixedDateTimeZone4.equals((java.lang.Object) (-4L));
        java.lang.String str21 = fixedDateTimeZone4.getNameKey((long) 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0670");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        int int17 = fixedDateTimeZone4.getOffset((-3600090L));
        long long19 = fixedDateTimeZone4.convertUTCToLocal(35L);
        long long22 = fixedDateTimeZone4.convertLocalToUTC((-97L), false);
        boolean boolean24 = fixedDateTimeZone4.isStandardOffset(200L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 45L + "'", long19 == 45L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-107L) + "'", long22 == (-107L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0671");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0672");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 35, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getShortName((-2099999L));
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0673");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        int int17 = fixedDateTimeZone4.getStandardOffset(3599901L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0674");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long8 = fixedDateTimeZone4.convertLocalToUTC((-68L), false, (-10L));
        boolean boolean9 = fixedDateTimeZone4.isFixed();
        long long11 = fixedDateTimeZone4.previousTransition((-4200000L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-165L) + "'", long8 == (-165L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-4200000L) + "'", long11 == (-4200000L));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0675");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean13 = fixedDateTimeZone4.equals((java.lang.Object) "UTC");
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (short) -1, false);
        java.lang.String str18 = fixedDateTimeZone4.getName((long) 0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone4.getOffset(readableInstant19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-11L) + "'", long16 == (-11L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0676");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset((long) (short) -1);
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((long) 1);
        java.lang.String str14 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0677");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        long long16 = fixedDateTimeZone4.nextTransition((long) (short) -1);
        long long18 = fixedDateTimeZone4.nextTransition((-107L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-107L) + "'", long18 == (-107L));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0678");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long7 = dateTimeZone3.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long13 = dateTimeZone9.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str14 = dateTimeZone9.getID();
        long long16 = dateTimeZone3.getMillisKeepLocal(dateTimeZone9, (long) (byte) 1);
        long long19 = dateTimeZone3.convertLocalToUTC((long) '4', false);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone3.getName((long) ' ', locale21);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (byte) 0);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone3.getShortName((long) (byte) 100, locale26);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone32 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str34 = fixedDateTimeZone32.getNameKey((long) (byte) 0);
        int int36 = fixedDateTimeZone32.getStandardOffset(100L);
        java.lang.String str38 = fixedDateTimeZone32.getNameKey((long) 0);
        long long41 = fixedDateTimeZone32.convertLocalToUTC((long) (byte) -1, false);
        boolean boolean43 = fixedDateTimeZone32.isStandardOffset((-38L));
        long long45 = dateTimeZone3.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone32, (long) (short) 0);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone32);
        boolean boolean48 = fixedDateTimeZone32.isStandardOffset((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-101L) + "'", long7 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-101L) + "'", long13 == (-101L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-48L) + "'", long19 == (-48L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-11L) + "'", long41 == (-11L));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 90L + "'", long45 == 90L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0679");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((-62L), true);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-72L) + "'", long16 == (-72L));
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0680");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "+00:00:00.010", 97, 2100000);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-145L), locale6);
        java.lang.String str9 = fixedDateTimeZone4.getName((long) (short) -1);
        int int11 = fixedDateTimeZone4.getStandardOffset((-28799903L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.097" + "'", str9, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2100000 + "'", int11 == 2100000);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0681");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        long long22 = fixedDateTimeZone4.convertLocalToUTC((long) (short) 10, false, 2099989L);
        java.lang.String str24 = fixedDateTimeZone4.getShortName((-165L));
        long long27 = fixedDateTimeZone4.adjustOffset(10L, true);
        java.lang.String str29 = fixedDateTimeZone4.getName(112L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.010" + "'", str24, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.010" + "'", str29, "+00:00:00.010");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0682");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long13 = fixedDateTimeZone4.previousTransition((long) 1);
        java.lang.String str15 = fixedDateTimeZone4.getName((long) 10);
        long long17 = fixedDateTimeZone4.previousTransition(96L);
        long long20 = fixedDateTimeZone4.adjustOffset(0L, false);
        boolean boolean21 = fixedDateTimeZone4.isFixed();
        java.util.Locale locale23 = null;
        java.lang.String str24 = fixedDateTimeZone4.getShortName((-268L), locale23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 96L + "'", long17 == 96L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.010" + "'", str24, "+00:00:00.010");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0683");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone30 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str32 = fixedDateTimeZone30.getNameKey(10L);
        java.util.TimeZone timeZone33 = fixedDateTimeZone30.toTimeZone();
        long long35 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone30, (long) 97);
        int int37 = fixedDateTimeZone4.getOffset(62L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 97L + "'", long35 == 97L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0684");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        long long6 = fixedDateTimeZone4.previousTransition(110L);
        java.lang.String str8 = fixedDateTimeZone4.getNameKey(25L);
        long long10 = fixedDateTimeZone4.nextTransition(0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.097" + "'", str8, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0685");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-101L), true);
        long long15 = fixedDateTimeZone4.previousTransition(100L);
        long long19 = fixedDateTimeZone4.convertLocalToUTC(122L, false, (-110L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str26 = fixedDateTimeZone24.getNameKey((long) (byte) 0);
        int int28 = fixedDateTimeZone24.getStandardOffset(100L);
        boolean boolean29 = fixedDateTimeZone4.equals((java.lang.Object) 100L);
        java.util.TimeZone timeZone30 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-111L) + "'", long13 == (-111L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 112L + "'", long19 == 112L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0686");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.100", (int) (short) 10, (int) (short) -1);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0687");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        java.lang.String str20 = fixedDateTimeZone4.getName((-38L));
        java.lang.String str22 = fixedDateTimeZone4.getNameKey((-97L));
        java.lang.String str24 = fixedDateTimeZone4.getNameKey(0L);
        int int26 = fixedDateTimeZone4.getOffset((-3L));
        java.util.TimeZone timeZone27 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0688");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str11 = dateTimeZone1.getShortName((long) (short) 1);
        long long13 = dateTimeZone1.convertUTCToLocal((long) ' ');
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        long long19 = dateTimeZone1.convertLocalToUTC(110L, false, (long) 97);
        long long22 = dateTimeZone1.convertLocalToUTC(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-100L) + "'", long22 == (-100L));
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0689");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (byte) 0, locale3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long10 = dateTimeZone6.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str11 = dateTimeZone6.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        boolean boolean14 = dateTimeZone6.isStandardOffset(0L);
        java.lang.String str16 = dateTimeZone6.getShortName((long) (short) 1);
        long long20 = dateTimeZone6.convertLocalToUTC(1L, true, 62L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (-62L));
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone1.getOffset(readableInstant23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-99L) + "'", long20 == (-99L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3600162L) + "'", long22 == (-3600162L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3600000) + "'", int24 == (-3600000));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0690");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-01:00", "+00:00:00.035", (int) (byte) 10, 97);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale7 = null;
        java.lang.String str8 = fixedDateTimeZone4.getShortName(9L, locale7);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.010" + "'", str8, "+00:00:00.010");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0691");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        boolean boolean11 = fixedDateTimeZone4.isFixed();
        long long13 = fixedDateTimeZone4.nextTransition(232L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        long long21 = fixedDateTimeZone18.convertLocalToUTC((long) ' ', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str28 = fixedDateTimeZone26.getNameKey(10L);
        boolean boolean30 = fixedDateTimeZone26.equals((java.lang.Object) 0.0d);
        int int32 = fixedDateTimeZone26.getStandardOffset((long) (byte) 0);
        java.lang.String str34 = fixedDateTimeZone26.getNameKey((long) (short) 1);
        boolean boolean35 = fixedDateTimeZone18.equals((java.lang.Object) fixedDateTimeZone26);
        boolean boolean36 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean39 = fixedDateTimeZone4.equals((java.lang.Object) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 232L + "'", long13 == 232L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-68L) + "'", long21 == (-68L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0692");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        java.lang.String str20 = fixedDateTimeZone4.getName((long) (byte) 100);
        int int22 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) -1);
        long long24 = fixedDateTimeZone4.nextTransition(122L);
        int int26 = fixedDateTimeZone4.getOffsetFromLocal((-3600000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 122L + "'", long24 == 122L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0693");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.toString();
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getName((-65L), locale11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0694");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-20L));
        long long13 = fixedDateTimeZone4.nextTransition((-111L));
        java.lang.String str14 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-111L) + "'", long13 == (-111L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0695");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-11L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str24 = fixedDateTimeZone22.getNameKey((long) (byte) 0);
        long long26 = fixedDateTimeZone22.previousTransition((long) '#');
        int int28 = fixedDateTimeZone22.getOffsetFromLocal((long) (short) 10);
        long long30 = fixedDateTimeZone22.nextTransition(132L);
        java.lang.String str32 = fixedDateTimeZone22.getName((long) (short) 10);
        java.util.Locale locale34 = null;
        java.lang.String str35 = fixedDateTimeZone22.getShortName((long) 0, locale34);
        java.lang.String str36 = fixedDateTimeZone22.getID();
        boolean boolean37 = fixedDateTimeZone22.isFixed();
        boolean boolean38 = fixedDateTimeZone4.equals((java.lang.Object) boolean37);
        java.util.Locale locale40 = null;
        java.lang.String str41 = fixedDateTimeZone4.getName(0L, locale40);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35L + "'", long26 == 35L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 132L + "'", long30 == 132L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.010" + "'", str32, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.010" + "'", str35, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.010" + "'", str41, "+00:00:00.010");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0696");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        long long12 = fixedDateTimeZone4.nextTransition(0L);
        int int14 = fixedDateTimeZone4.getOffsetFromLocal(42L);
        int int16 = fixedDateTimeZone4.getOffset((-158L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0697");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        boolean boolean9 = fixedDateTimeZone4.isFixed();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset((-28799903L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0698");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        int int10 = fixedDateTimeZone4.getStandardOffset((-101L));
        int int12 = fixedDateTimeZone4.getOffset((long) 35);
        long long14 = fixedDateTimeZone4.nextTransition((long) (short) 10);
        java.lang.String str15 = fixedDateTimeZone4.getID();
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime16);
        boolean boolean19 = fixedDateTimeZone4.equals((java.lang.Object) 'a');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0699");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str17 = fixedDateTimeZone15.getNameKey((long) (byte) 0);
        long long19 = fixedDateTimeZone15.previousTransition((long) '#');
        long long21 = fixedDateTimeZone15.nextTransition((long) '4');
        int int23 = fixedDateTimeZone15.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long29 = dateTimeZone25.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str30 = dateTimeZone25.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        boolean boolean33 = dateTimeZone25.isStandardOffset(0L);
        java.lang.String str35 = dateTimeZone25.getShortName((long) (short) 1);
        boolean boolean36 = fixedDateTimeZone15.equals((java.lang.Object) str35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = fixedDateTimeZone15.getOffset(readableInstant37);
        int int40 = fixedDateTimeZone15.getStandardOffset((long) (byte) -1);
        long long42 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, 132L);
        long long45 = fixedDateTimeZone15.convertLocalToUTC(0L, true);
        java.util.Locale locale47 = null;
        java.lang.String str48 = fixedDateTimeZone15.getShortName((-217L), locale47);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-101L) + "'", long29 == (-101L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.100" + "'", str35, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 132L + "'", long42 == 132L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-10L) + "'", long45 == (-10L));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00:00.010" + "'", str48, "+00:00:00.010");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0700");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        long long6 = fixedDateTimeZone4.convertUTCToLocal((-3659948L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3659948L) + "'", long6 == (-3659948L));
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0701");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long14 = dateTimeZone10.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str15 = dateTimeZone10.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long19 = dateTimeZone10.adjustOffset((long) (short) 10, false);
        long long22 = dateTimeZone10.convertLocalToUTC((long) (byte) -1, false);
        long long24 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone10, (long) (byte) 100);
        boolean boolean25 = fixedDateTimeZone4.isFixed();
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = fixedDateTimeZone4.getOffset(readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long33 = dateTimeZone29.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long39 = dateTimeZone35.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str40 = dateTimeZone35.getID();
        long long42 = dateTimeZone29.getMillisKeepLocal(dateTimeZone35, (long) (byte) 1);
        boolean boolean44 = dateTimeZone35.isStandardOffset((long) ' ');
        boolean boolean45 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone35);
        long long47 = fixedDateTimeZone4.previousTransition((long) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-101L) + "'", long22 == (-101L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-101L) + "'", long33 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-101L) + "'", long39 == (-101L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.100" + "'", str40, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0702");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0703");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        int int10 = fixedDateTimeZone4.getStandardOffset((-101L));
        boolean boolean12 = fixedDateTimeZone4.isStandardOffset(11L);
        boolean boolean14 = fixedDateTimeZone4.isStandardOffset((-144L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0704");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        long long9 = dateTimeZone0.adjustOffset((long) '4', true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getShortName((-38L), locale12);
        java.lang.String str15 = dateTimeZone0.getName((-62L));
        java.lang.String str16 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinated Universal Time" + "'", str15, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0705");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((long) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0706");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = fixedDateTimeZone4.getOffset(readableInstant26);
        boolean boolean28 = fixedDateTimeZone4.isFixed();
        long long30 = fixedDateTimeZone4.previousTransition((-3600090L));
        java.util.TimeZone timeZone31 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-3600090L) + "'", long30 == (-3600090L));
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0707");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "UTC", (int) (short) 10, 0);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal(15L);
        java.lang.String str8 = fixedDateTimeZone4.getName(2099989L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str15 = fixedDateTimeZone13.getNameKey(10L);
        boolean boolean17 = fixedDateTimeZone13.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        int int20 = fixedDateTimeZone13.getOffset((long) (byte) 1);
        int int22 = fixedDateTimeZone13.getOffset((long) 100);
        java.util.Locale locale24 = null;
        java.lang.String str25 = fixedDateTimeZone13.getShortName((long) 97, locale24);
        long long27 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, (-11L));
        java.util.Locale locale29 = null;
        java.lang.String str30 = fixedDateTimeZone13.getShortName((-4200097L), locale29);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.010" + "'", str8, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.010" + "'", str25, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-11L) + "'", long27 == (-11L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.010" + "'", str30, "+00:00:00.010");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0708");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long8 = fixedDateTimeZone4.convertLocalToUTC((-68L), false, (-10L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-68L), locale10);
        java.lang.String str13 = fixedDateTimeZone4.getNameKey(0L);
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        java.lang.Class<?> wildcardClass15 = timeZone14.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-165L) + "'", long8 == (-165L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.097" + "'", str11, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0709");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.lang.Class<?> wildcardClass10 = nameProvider0.getClass();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0710");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "hi!", 35, (int) (byte) 100);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0711");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        long long13 = fixedDateTimeZone4.nextTransition((-20L));
        boolean boolean15 = fixedDateTimeZone4.isStandardOffset((-111L));
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime16);
        int int19 = fixedDateTimeZone4.getOffset((long) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-20L) + "'", long13 == (-20L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0712");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long28 = fixedDateTimeZone4.adjustOffset((long) ' ', false);
        long long30 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        java.lang.String str32 = fixedDateTimeZone4.getNameKey((-2099892L));
        java.lang.String str34 = fixedDateTimeZone4.getName(1500011L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-38L) + "'", long30 == (-38L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.010" + "'", str34, "+00:00:00.010");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0713");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long7 = dateTimeZone3.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long13 = dateTimeZone9.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str14 = dateTimeZone9.getID();
        long long16 = dateTimeZone3.getMillisKeepLocal(dateTimeZone9, (long) (byte) 1);
        long long19 = dateTimeZone3.convertLocalToUTC((long) '4', false);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone3.getName((long) ' ', locale21);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (byte) 0);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone1.getShortName(100L, locale26);
        long long29 = dateTimeZone1.convertUTCToLocal(132L);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone1.isLocalDateTimeGap(localDateTime30);
        boolean boolean33 = dateTimeZone1.isStandardOffset((-91L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-101L) + "'", long7 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-101L) + "'", long13 == (-101L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-48L) + "'", long19 == (-48L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 232L + "'", long29 == 232L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0714");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.lang.String str3 = dateTimeZone1.getName(232L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-2099892L), locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.100" + "'", str3, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0715");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "-01:00", (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0716");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset((long) (short) -1);
        long long13 = fixedDateTimeZone4.nextTransition((-11L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0717");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        long long6 = fixedDateTimeZone4.previousTransition(110L);
        long long9 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getName(122L, locale11);
        long long14 = fixedDateTimeZone4.nextTransition((-211L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-211L) + "'", long14 == (-211L));
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0718");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        long long18 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone23 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str25 = fixedDateTimeZone23.getNameKey(10L);
        java.util.TimeZone timeZone26 = fixedDateTimeZone23.toTimeZone();
        java.util.Locale locale28 = null;
        java.lang.String str29 = fixedDateTimeZone23.getShortName((long) (short) -1, locale28);
        boolean boolean30 = fixedDateTimeZone4.equals((java.lang.Object) (short) -1);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = fixedDateTimeZone4.getOffset(readableInstant31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10L) + "'", long18 == (-10L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.010" + "'", str29, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0719");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long28 = fixedDateTimeZone4.adjustOffset((long) ' ', false);
        long long30 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        long long34 = fixedDateTimeZone4.convertLocalToUTC((long) 97, true, 100L);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long40 = dateTimeZone36.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str41 = dateTimeZone36.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        boolean boolean44 = dateTimeZone36.isStandardOffset(0L);
        java.lang.String str46 = dateTimeZone36.getShortName((long) (short) 1);
        long long48 = dateTimeZone36.convertUTCToLocal((long) ' ');
        org.joda.time.LocalDateTime localDateTime49 = null;
        boolean boolean50 = dateTimeZone36.isLocalDateTimeGap(localDateTime49);
        long long54 = dateTimeZone36.convertLocalToUTC(110L, false, (long) 97);
        java.lang.String str55 = dateTimeZone36.toString();
        long long57 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone36, (long) (byte) 1);
        java.util.Locale locale59 = null;
        java.lang.String str60 = fixedDateTimeZone4.getShortName((long) (byte) 10, locale59);
        long long63 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false);
        java.lang.Object obj64 = null;
        boolean boolean65 = fixedDateTimeZone4.equals(obj64);
        org.joda.time.ReadableInstant readableInstant66 = null;
        int int67 = fixedDateTimeZone4.getOffset(readableInstant66);
        int int69 = fixedDateTimeZone4.getOffsetFromLocal((-99L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-38L) + "'", long30 == (-38L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 87L + "'", long34 == 87L);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-101L) + "'", long40 == (-101L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.100" + "'", str41, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.100" + "'", str46, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 132L + "'", long48 == 132L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L + "'", long54 == 10L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.100" + "'", str55, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-89L) + "'", long57 == (-89L));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:00:00.010" + "'", str60, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 42L + "'", long63 == 42L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0720");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "UTC", 35, (int) (short) -1);
        java.lang.String str6 = fixedDateTimeZone4.getName((-3659878L));
        long long8 = fixedDateTimeZone4.nextTransition((long) (-3600000));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3600000L) + "'", long8 == (-3600000L));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0721");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getShortName((-2699999L));
        long long12 = fixedDateTimeZone4.nextTransition(90L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.097" + "'", str10, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 90L + "'", long12 == 90L);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0722");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        java.lang.String str11 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0723");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((long) (-1));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone13.getShortName((-28799903L), locale15);
        boolean boolean17 = fixedDateTimeZone13.isFixed();
        java.lang.String str19 = fixedDateTimeZone13.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long23 = fixedDateTimeZone13.getMillisKeepLocal(dateTimeZone21, 100L);
        java.lang.String str25 = dateTimeZone21.getShortName(0L);
        java.lang.String str26 = dateTimeZone21.toString();
        java.lang.String str28 = dateTimeZone21.getShortName((long) (byte) 1);
        long long30 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone21, (-68L));
        int int32 = fixedDateTimeZone4.getStandardOffset((-99L));
        boolean boolean33 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.097" + "'", str16, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/joda/time/tz/data" + "'", str19, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-158L) + "'", long30 == (-158L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0724");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        int int14 = fixedDateTimeZone4.getOffsetFromLocal(2099999L);
        long long16 = fixedDateTimeZone4.previousTransition((-179L));
        java.lang.String str18 = fixedDateTimeZone4.getNameKey(97L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-179L) + "'", long16 == (-179L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0725");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        int int14 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-4200000L));
        java.lang.String str19 = fixedDateTimeZone4.getShortName(384L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.010" + "'", str19, "+00:00:00.010");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0726");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long7 = dateTimeZone3.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long13 = dateTimeZone9.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str14 = dateTimeZone9.getID();
        long long16 = dateTimeZone3.getMillisKeepLocal(dateTimeZone9, (long) (byte) 1);
        long long19 = dateTimeZone3.convertLocalToUTC((long) '4', false);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone3.getName((long) ' ', locale21);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (byte) 0);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone3.getShortName((long) (byte) 100, locale26);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone32 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str34 = fixedDateTimeZone32.getNameKey((long) (byte) 0);
        int int36 = fixedDateTimeZone32.getStandardOffset(100L);
        java.lang.String str38 = fixedDateTimeZone32.getNameKey((long) 0);
        long long41 = fixedDateTimeZone32.convertLocalToUTC((long) (byte) -1, false);
        boolean boolean43 = fixedDateTimeZone32.isStandardOffset((-38L));
        long long45 = dateTimeZone3.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone32, (long) (short) 0);
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeZone3.getName((long) (byte) 10, locale47);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-101L) + "'", long7 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-101L) + "'", long13 == (-101L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-48L) + "'", long19 == (-48L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-11L) + "'", long41 == (-11L));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 90L + "'", long45 == 90L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00:00.100" + "'", str48, "+00:00:00.100");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0727");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "-01:00", (-1), (int) (byte) 0);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0728");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        java.lang.String str20 = fixedDateTimeZone4.getName((-38L));
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime21);
        long long25 = fixedDateTimeZone4.adjustOffset((long) ' ', true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0729");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale7 = null;
        java.lang.String str8 = fixedDateTimeZone4.getName((-91L), locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getName(90L, locale10);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone16 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 35, (int) '#');
        boolean boolean17 = fixedDateTimeZone4.equals((java.lang.Object) "UTC");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.010" + "'", str8, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0730");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        boolean boolean6 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.toString();
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0731");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long7 = dateTimeZone3.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long13 = dateTimeZone9.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str14 = dateTimeZone9.getID();
        long long16 = dateTimeZone3.getMillisKeepLocal(dateTimeZone9, (long) (byte) 1);
        long long19 = dateTimeZone3.convertLocalToUTC((long) '4', false);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone3.getName((long) ' ', locale21);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (byte) 0);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone3.getShortName(200L, locale26);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone32 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str34 = fixedDateTimeZone32.getNameKey((long) (byte) 0);
        int int36 = fixedDateTimeZone32.getStandardOffset(100L);
        java.lang.String str38 = fixedDateTimeZone32.getNameKey((long) 0);
        long long41 = fixedDateTimeZone32.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = fixedDateTimeZone32.getOffset(readableInstant42);
        long long45 = fixedDateTimeZone32.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = fixedDateTimeZone32.isLocalDateTimeGap(localDateTime46);
        int int49 = fixedDateTimeZone32.getOffsetFromLocal((long) 100);
        long long51 = fixedDateTimeZone32.nextTransition((long) (short) 0);
        long long53 = dateTimeZone3.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone32, (long) 0);
        java.lang.String str55 = fixedDateTimeZone32.getName(2099999L);
        java.lang.String str56 = fixedDateTimeZone32.toString();
        java.lang.String str57 = fixedDateTimeZone32.getID();
        java.lang.Class<?> wildcardClass58 = fixedDateTimeZone32.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-101L) + "'", long7 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-101L) + "'", long13 == (-101L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-48L) + "'", long19 == (-48L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-11L) + "'", long41 == (-11L));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-111L) + "'", long45 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 90L + "'", long53 == 90L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.010" + "'", str55, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0732");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (byte) 0, locale3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long10 = dateTimeZone6.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long16 = dateTimeZone12.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str17 = dateTimeZone12.getID();
        long long19 = dateTimeZone6.getMillisKeepLocal(dateTimeZone12, (long) (byte) 1);
        long long22 = dateTimeZone6.convertLocalToUTC((long) '4', false);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone6.getName((long) ' ', locale24);
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone6.isLocalDateTimeGap(localDateTime26);
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (byte) 10);
        long long32 = dateTimeZone1.convertLocalToUTC((-99L), true);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone1.getName(0L, locale34);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-101L) + "'", long16 == (-101L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-48L) + "'", long22 == (-48L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-3600090L) + "'", long29 == (-3600090L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3599901L + "'", long32 == 3599901L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-01:00" + "'", str35, "-01:00");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0733");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        boolean boolean19 = fixedDateTimeZone4.isFixed();
        int int21 = fixedDateTimeZone4.getStandardOffset((-38L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0734");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) (-1.0f));
        long long15 = fixedDateTimeZone4.convertLocalToUTC(2099999L, true);
        java.lang.String str17 = fixedDateTimeZone4.getNameKey((-58L));
        java.util.TimeZone timeZone18 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone23 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str25 = fixedDateTimeZone23.getNameKey((long) (byte) 0);
        boolean boolean26 = fixedDateTimeZone23.isFixed();
        java.lang.String str28 = fixedDateTimeZone23.getNameKey((-48L));
        java.util.TimeZone timeZone29 = fixedDateTimeZone23.toTimeZone();
        java.lang.String str31 = fixedDateTimeZone23.getNameKey((long) '#');
        java.util.Locale locale33 = null;
        java.lang.String str34 = fixedDateTimeZone23.getName((-4200000L), locale33);
        long long36 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone23, 222L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2099989L + "'", long15 == 2099989L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.010" + "'", str34, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 222L + "'", long36 == 222L);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0735");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0736");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "hi!", 0, (-4200000));
        long long8 = fixedDateTimeZone4.convertLocalToUTC((-3659913L), false, 287L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long14 = dateTimeZone10.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str15 = dateTimeZone10.getID();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        long long19 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone10, (-99L));
        int int21 = fixedDateTimeZone4.getOffset(3600022L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3659913L) + "'", long8 == (-3659913L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-199L) + "'", long19 == (-199L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0737");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset((long) (short) -1);
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((long) 1);
        java.lang.String str14 = fixedDateTimeZone4.toString();
        int int16 = fixedDateTimeZone4.getStandardOffset(35L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0738");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long8 = fixedDateTimeZone4.convertLocalToUTC((-68L), false, (-10L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-68L), locale10);
        long long14 = fixedDateTimeZone4.adjustOffset(147L, true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-165L) + "'", long8 == (-165L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.097" + "'", str11, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 147L + "'", long14 == 147L);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0739");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) (-1.0f));
        long long15 = fixedDateTimeZone4.convertLocalToUTC(2099999L, true);
        int int17 = fixedDateTimeZone4.getOffset((-99L));
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long23 = dateTimeZone19.convertLocalToUTC((long) (short) -1, false, 0L);
        long long25 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone19, (-89L));
        java.lang.String str26 = fixedDateTimeZone4.toString();
        java.lang.String str27 = fixedDateTimeZone4.getID();
        java.util.Locale locale29 = null;
        java.lang.String str30 = fixedDateTimeZone4.getShortName(2099989L, locale29);
        int int32 = fixedDateTimeZone4.getStandardOffset(1499914L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2099989L + "'", long15 == 2099989L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-101L) + "'", long23 == (-101L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-179L) + "'", long25 == (-179L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.010" + "'", str30, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0740");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:35", "+00:35", (int) '#', 35);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0741");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 100, true, 0L);
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 90L + "'", long13 == 90L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0742");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        long long8 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone6, (-11L));
        long long10 = fixedDateTimeZone4.previousTransition((long) 1);
        java.lang.String str12 = fixedDateTimeZone4.getShortName((-4L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-11L) + "'", long8 == (-11L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0743");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = fixedDateTimeZone4.getOffset(readableInstant26);
        boolean boolean28 = fixedDateTimeZone4.isFixed();
        long long30 = fixedDateTimeZone4.previousTransition((-3600090L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone32 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-3600090L) + "'", long30 == (-3600090L));
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0744");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.String str10 = dateTimeZone1.getShortName(32L);
        java.lang.String str11 = dateTimeZone1.getID();
        long long13 = dateTimeZone1.convertUTCToLocal((-60L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 40L + "'", long13 == 40L);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0745");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) (-1.0f));
        long long15 = fixedDateTimeZone4.convertLocalToUTC(2099999L, true);
        int int17 = fixedDateTimeZone4.getOffset((-99L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str24 = fixedDateTimeZone22.getNameKey((long) (byte) 0);
        long long26 = fixedDateTimeZone22.previousTransition((long) '#');
        long long28 = fixedDateTimeZone22.nextTransition((long) '4');
        int int30 = fixedDateTimeZone22.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = fixedDateTimeZone22.isLocalDateTimeGap(localDateTime31);
        java.util.TimeZone timeZone33 = fixedDateTimeZone22.toTimeZone();
        java.util.TimeZone timeZone34 = fixedDateTimeZone22.toTimeZone();
        java.lang.String str35 = fixedDateTimeZone22.getID();
        java.lang.Class<?> wildcardClass36 = fixedDateTimeZone22.getClass();
        boolean boolean37 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone22);
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = fixedDateTimeZone4.getOffset(readableInstant38);
        int int41 = fixedDateTimeZone4.getStandardOffset(0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2099989L + "'", long15 == 2099989L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35L + "'", long26 == 35L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 52L + "'", long28 == 52L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0746");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        java.lang.String str20 = fixedDateTimeZone4.getName((long) (byte) 100);
        int int22 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) -1);
        long long24 = fixedDateTimeZone4.nextTransition((-3600000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3600000L) + "'", long24 == (-3600000L));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0747");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 35);
        long long4 = dateTimeZone2.convertUTCToLocal((-1L));
        java.lang.String str6 = dateTimeZone2.getName((-28799903L));
        long long10 = dateTimeZone2.convertLocalToUTC((long) 'a', false, 384L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2099999L + "'", long4 == 2099999L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:35" + "'", str6, "+00:35");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2099903L) + "'", long10 == (-2099903L));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0748");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long14 = dateTimeZone10.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str15 = dateTimeZone10.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long19 = dateTimeZone10.adjustOffset((long) (short) 10, false);
        long long22 = dateTimeZone10.convertLocalToUTC((long) (byte) -1, false);
        long long24 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone10, (long) (byte) 100);
        boolean boolean25 = fixedDateTimeZone4.isFixed();
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = fixedDateTimeZone4.getOffset(readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long33 = dateTimeZone29.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long39 = dateTimeZone35.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str40 = dateTimeZone35.getID();
        long long42 = dateTimeZone29.getMillisKeepLocal(dateTimeZone35, (long) (byte) 1);
        boolean boolean44 = dateTimeZone35.isStandardOffset((long) ' ');
        boolean boolean45 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone35);
        java.lang.String str46 = dateTimeZone35.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-101L) + "'", long22 == (-101L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-101L) + "'", long33 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-101L) + "'", long39 == (-101L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.100" + "'", str40, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.100" + "'", str46, "+00:00:00.100");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0749");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-4200000), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -4200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0750");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) ' ', (int) (short) 100);
        long long6 = fixedDateTimeZone4.previousTransition((-158L));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime7);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal(232L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-158L) + "'", long6 == (-158L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0751");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long29 = fixedDateTimeZone4.convertLocalToUTC((-10L), false, (long) (byte) 100);
        java.lang.String str31 = fixedDateTimeZone4.getNameKey((long) (short) 0);
        long long33 = fixedDateTimeZone4.previousTransition((long) (byte) 100);
        java.util.Locale locale35 = null;
        java.lang.String str36 = fixedDateTimeZone4.getShortName((long) (short) 0, locale35);
        boolean boolean37 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long40 = fixedDateTimeZone4.previousTransition(25L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-20L) + "'", long29 == (-20L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.010" + "'", str36, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 25L + "'", long40 == 25L);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0752");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long3 = dateTimeZone1.convertUTCToLocal((-28799903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-28799868L) + "'", long3 == (-28799868L));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0753");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getName(110L, locale17);
        boolean boolean20 = fixedDateTimeZone4.isStandardOffset((-99L));
        boolean boolean21 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0754");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        long long13 = fixedDateTimeZone4.nextTransition((-20L));
        boolean boolean15 = fixedDateTimeZone4.isStandardOffset((-111L));
        int int17 = fixedDateTimeZone4.getOffset((-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-20L) + "'", long13 == (-20L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0755");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-11L));
        java.lang.String str18 = fixedDateTimeZone4.getID();
        java.lang.String str20 = fixedDateTimeZone4.getName(42L);
        java.lang.String str22 = fixedDateTimeZone4.getNameKey(25L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0756");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        long long6 = fixedDateTimeZone4.previousTransition(0L);
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0757");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = fixedDateTimeZone4.getOffset(readableInstant26);
        boolean boolean28 = fixedDateTimeZone4.isFixed();
        long long30 = fixedDateTimeZone4.previousTransition((-3600090L));
        boolean boolean31 = fixedDateTimeZone4.isFixed();
        org.joda.time.tz.Provider provider32 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        org.joda.time.DateTimeZone.setProvider(provider32);
        boolean boolean43 = fixedDateTimeZone4.equals((java.lang.Object) provider32);
        java.lang.String str45 = fixedDateTimeZone4.getNameKey(110L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-3600090L) + "'", long30 == (-3600090L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(provider32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0758");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long29 = fixedDateTimeZone4.convertLocalToUTC((-10L), false, (long) (byte) 100);
        java.lang.String str31 = fixedDateTimeZone4.getNameKey((long) (short) 0);
        java.util.Locale locale33 = null;
        java.lang.String str34 = fixedDateTimeZone4.getName((long) '4', locale33);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-20L) + "'", long29 == (-20L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.010" + "'", str34, "+00:00:00.010");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0759");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        int int21 = fixedDateTimeZone4.getOffsetFromLocal((long) 100);
        long long24 = fixedDateTimeZone4.adjustOffset((long) 100, false);
        boolean boolean26 = fixedDateTimeZone4.isStandardOffset((long) 'a');
        int int28 = fixedDateTimeZone4.getStandardOffset((-89L));
        long long30 = fixedDateTimeZone4.convertUTCToLocal(12L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111L) + "'", long17 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 22L + "'", long30 == 22L);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0760");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        long long6 = fixedDateTimeZone4.previousTransition(110L);
        long long9 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getName(122L, locale11);
        boolean boolean14 = fixedDateTimeZone4.isStandardOffset((long) (short) 10);
        java.lang.String str16 = fixedDateTimeZone4.getShortName(100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0761");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        int int14 = fixedDateTimeZone4.getOffset((long) '4');
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        long long18 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str19 = fixedDateTimeZone4.toString();
        boolean boolean21 = fixedDateTimeZone4.isStandardOffset(91L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0762");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str12 = dateTimeZone7.getID();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (byte) 1);
        java.lang.String str16 = dateTimeZone1.getName((long) (short) 100);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0763");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0764");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 35, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getShortName((-2099999L));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone7.convertLocalToUTC((long) 1, false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone7.getName(1L, locale12);
        long long16 = dateTimeZone7.adjustOffset((long) '4', true);
        java.lang.String str18 = dateTimeZone7.getName((long) (byte) -1);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone7.getShortName((-99L), locale20);
        java.lang.String str23 = dateTimeZone7.getName((long) ' ');
        long long25 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone7, (-179L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone30 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str32 = fixedDateTimeZone30.getNameKey((long) (byte) 0);
        int int34 = fixedDateTimeZone30.getStandardOffset(100L);
        java.lang.String str35 = fixedDateTimeZone30.getID();
        org.joda.time.ReadableInstant readableInstant36 = null;
        int int37 = fixedDateTimeZone30.getOffset(readableInstant36);
        boolean boolean39 = fixedDateTimeZone30.isStandardOffset(97L);
        long long41 = fixedDateTimeZone30.previousTransition(0L);
        long long43 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone30, (long) (-4200000));
        java.lang.String str44 = fixedDateTimeZone30.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coordinated Universal Time" + "'", str18, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coordinated Universal Time" + "'", str23, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-144L) + "'", long25 == (-144L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-4199975L) + "'", long43 == (-4199975L));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0765");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) ' ', (int) (short) 100);
        long long6 = fixedDateTimeZone4.previousTransition((-158L));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName((long) (short) 0, locale10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-158L) + "'", long6 == (-158L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.032" + "'", str11, "+00:00:00.032");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0766");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.lang.String str4 = dateTimeZone1.getID();
        long long8 = dateTimeZone1.convertLocalToUTC((long) (-4200000), false, 52L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-107L), locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-4200052L) + "'", long8 == (-4200052L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.052" + "'", str11, "+00:00:00.052");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0767");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 100, true, 0L);
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str16 = fixedDateTimeZone4.getName((long) 10);
        java.lang.Class<?> wildcardClass17 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 90L + "'", long13 == 90L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.010" + "'", str16, "+00:00:00.010");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0768");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long6 = fixedDateTimeZone4.nextTransition(110L);
        long long9 = fixedDateTimeZone4.convertLocalToUTC((-3599903L), true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3600000L) + "'", long9 == (-3600000L));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0769");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0770");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0771");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        boolean boolean21 = fixedDateTimeZone4.isStandardOffset((-20L));
        java.lang.String str23 = fixedDateTimeZone4.getNameKey((-10L));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long29 = dateTimeZone25.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long35 = dateTimeZone31.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str36 = dateTimeZone31.getID();
        long long38 = dateTimeZone25.getMillisKeepLocal(dateTimeZone31, (long) (byte) 1);
        long long40 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone25, (-47L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int43 = fixedDateTimeZone4.getStandardOffset((long) '#');
        int int45 = fixedDateTimeZone4.getOffsetFromLocal((long) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111L) + "'", long17 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-101L) + "'", long29 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-101L) + "'", long35 == (-101L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.100" + "'", str36, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-137L) + "'", long40 == (-137L));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0772");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.toString();
        long long11 = fixedDateTimeZone4.nextTransition((long) (short) 0);
        java.lang.String str13 = fixedDateTimeZone4.getShortName((-2099910L));
        java.lang.String str14 = fixedDateTimeZone4.getID();
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.010" + "'", str13, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0773");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        int int18 = fixedDateTimeZone4.getOffsetFromLocal((long) '4');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.Class<?> wildcardClass20 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0774");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset((long) (short) -1);
        long long13 = fixedDateTimeZone4.nextTransition((-11L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = fixedDateTimeZone4.getOffset(readableInstant15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = fixedDateTimeZone4.getOffset(readableInstant17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0775");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (byte) 0, locale3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long10 = dateTimeZone6.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str11 = dateTimeZone6.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        boolean boolean14 = dateTimeZone6.isStandardOffset(0L);
        java.lang.String str16 = dateTimeZone6.getShortName((long) (short) 1);
        long long20 = dateTimeZone6.convertLocalToUTC(1L, true, 62L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (-62L));
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone6.isLocalDateTimeGap(localDateTime23);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("", "+10:01", 97, (int) (short) 1);
        long long31 = dateTimeZone6.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (-58L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone36 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str38 = fixedDateTimeZone36.getNameKey((long) (byte) 0);
        long long40 = fixedDateTimeZone36.previousTransition((long) '#');
        long long42 = fixedDateTimeZone36.nextTransition((long) '4');
        int int44 = fixedDateTimeZone36.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long50 = dateTimeZone46.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str51 = dateTimeZone46.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone46);
        boolean boolean54 = dateTimeZone46.isStandardOffset(0L);
        java.lang.String str56 = dateTimeZone46.getShortName((long) (short) 1);
        boolean boolean57 = fixedDateTimeZone36.equals((java.lang.Object) str56);
        long long60 = fixedDateTimeZone36.adjustOffset((long) ' ', false);
        long long62 = fixedDateTimeZone36.convertUTCToLocal((-48L));
        java.lang.String str64 = fixedDateTimeZone36.getShortName((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant65 = null;
        int int66 = fixedDateTimeZone36.getOffset(readableInstant65);
        java.lang.String str67 = fixedDateTimeZone36.toString();
        long long69 = fixedDateTimeZone29.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone36, (-211L));
        boolean boolean71 = fixedDateTimeZone29.isStandardOffset((long) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-99L) + "'", long20 == (-99L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3600162L) + "'", long22 == (-3600162L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-55L) + "'", long31 == (-55L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 35L + "'", long40 == 35L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 52L + "'", long42 == 52L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-101L) + "'", long50 == (-101L));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00:00.100" + "'", str51, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00:00.100" + "'", str56, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 32L + "'", long60 == 32L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-38L) + "'", long62 == (-38L));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+00:00:00.010" + "'", str64, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-124L) + "'", long69 == (-124L));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0776");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        long long9 = dateTimeZone0.adjustOffset((long) '4', true);
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone16 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str18 = fixedDateTimeZone16.getNameKey(10L);
        boolean boolean20 = fixedDateTimeZone16.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone16);
        int int23 = fixedDateTimeZone16.getOffset((long) (byte) 1);
        long long25 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone16, (long) (-1));
        java.util.Locale locale27 = null;
        java.lang.String str28 = fixedDateTimeZone16.getName(232L, locale27);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone16);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = fixedDateTimeZone16.isLocalDateTimeGap(localDateTime30);
        java.lang.String str33 = fixedDateTimeZone16.getShortName((-100L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-11L) + "'", long25 == (-11L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.010" + "'", str28, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.010" + "'", str33, "+00:00:00.010");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0777");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = fixedDateTimeZone4.getOffset(readableInstant11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-207L), locale14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0778");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(110L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-10L) + "'", long10 == (-10L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0779");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        long long16 = fixedDateTimeZone4.nextTransition(2099989L);
        java.lang.String str18 = fixedDateTimeZone4.getNameKey((-2099910L));
        java.util.Locale locale20 = null;
        java.lang.String str21 = fixedDateTimeZone4.getName((long) (-1), locale20);
        boolean boolean22 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2099989L + "'", long16 == 2099989L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.010" + "'", str21, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0780");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        long long4 = dateTimeZone1.adjustOffset((-65L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-65L) + "'", long4 == (-65L));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0781");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        long long18 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone19 = fixedDateTimeZone4.toTimeZone();
        long long23 = fixedDateTimeZone4.convertLocalToUTC(62L, false, 10L);
        java.lang.String str24 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10L) + "'", long18 == (-10L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0782");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.lang.String str15 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0783");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long28 = fixedDateTimeZone4.adjustOffset((long) ' ', false);
        long long30 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-38L) + "'", long30 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0784");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.nextTransition((-111L));
        java.util.TimeZone timeZone18 = fixedDateTimeZone4.toTimeZone();
        long long22 = fixedDateTimeZone4.convertLocalToUTC((-3599903L), false, (-268L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111L) + "'", long17 == (-111L));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3599913L) + "'", long22 == (-3599913L));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0785");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((-3660000L), locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0786");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        int int10 = fixedDateTimeZone4.getStandardOffset((-101L));
        int int12 = fixedDateTimeZone4.getOffset((long) 35);
        long long14 = fixedDateTimeZone4.nextTransition((long) (short) 10);
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset((-68L));
        java.util.TimeZone timeZone17 = fixedDateTimeZone4.toTimeZone();
        int int19 = fixedDateTimeZone4.getOffset(87L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0787");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        java.lang.String str12 = fixedDateTimeZone4.getShortName((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0788");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long13 = fixedDateTimeZone4.previousTransition((long) 1);
        java.lang.String str15 = fixedDateTimeZone4.getName((long) 10);
        long long17 = fixedDateTimeZone4.previousTransition(96L);
        long long20 = fixedDateTimeZone4.adjustOffset(0L, false);
        java.lang.String str22 = fixedDateTimeZone4.getShortName((-3600090L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 96L + "'", long17 == 96L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.010" + "'", str22, "+00:00:00.010");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0789");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        int int10 = fixedDateTimeZone4.getStandardOffset((-101L));
        int int12 = fixedDateTimeZone4.getOffset((long) 35);
        long long14 = fixedDateTimeZone4.nextTransition((long) (short) 10);
        java.lang.String str15 = fixedDateTimeZone4.getID();
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime16);
        java.lang.String str18 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0790");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        long long8 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone6, (-11L));
        long long11 = fixedDateTimeZone4.adjustOffset((-10L), false);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-11L) + "'", long8 == (-11L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-10L) + "'", long11 == (-10L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0791");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "hi!", (int) (short) 100, (-3600000));
        long long6 = fixedDateTimeZone4.convertUTCToLocal(80L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 180L + "'", long6 == 180L);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0792");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+10:01", 10, (-4200000));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0793");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        long long12 = fixedDateTimeZone4.nextTransition(0L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = fixedDateTimeZone4.getName(157L, locale14);
        boolean boolean17 = fixedDateTimeZone4.equals((java.lang.Object) (-97L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.097" + "'", str15, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0794");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:00");
        boolean boolean3 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str5 = dateTimeZone1.getName((-96L));
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:00" + "'", str5, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0795");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset(97L);
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-149L));
        java.lang.String str17 = fixedDateTimeZone4.getNameKey(157L);
        long long19 = fixedDateTimeZone4.convertUTCToLocal((-158L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-148L) + "'", long19 == (-148L));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0796");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = fixedDateTimeZone4.getOffset(readableInstant26);
        boolean boolean28 = fixedDateTimeZone4.isFixed();
        long long30 = fixedDateTimeZone4.previousTransition((-3600090L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone32 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone33 = fixedDateTimeZone4.toTimeZone();
        long long36 = fixedDateTimeZone4.convertLocalToUTC(287L, true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone41 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        long long44 = fixedDateTimeZone41.convertLocalToUTC((long) 97, false);
        long long46 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone41, 2099989L);
        java.lang.String str48 = fixedDateTimeZone4.getNameKey((-10L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-3600090L) + "'", long30 == (-3600090L));
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 277L + "'", long36 == 277L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 87L + "'", long44 == 87L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 2099989L + "'", long46 == 2099989L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0797");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((long) 0, locale16);
        java.lang.String str18 = fixedDateTimeZone4.getID();
        boolean boolean19 = fixedDateTimeZone4.isFixed();
        boolean boolean21 = fixedDateTimeZone4.isStandardOffset((long) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0798");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((long) 0, locale16);
        java.lang.String str18 = fixedDateTimeZone4.toString();
        java.util.TimeZone timeZone19 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0799");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        java.lang.String str20 = fixedDateTimeZone4.getName((-38L));
        java.lang.String str22 = fixedDateTimeZone4.getNameKey((-97L));
        java.lang.String str24 = fixedDateTimeZone4.getNameKey(0L);
        int int26 = fixedDateTimeZone4.getOffset((-3L));
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone28.getName((long) (byte) 0, locale30);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long37 = dateTimeZone33.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long43 = dateTimeZone39.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str44 = dateTimeZone39.getID();
        long long46 = dateTimeZone33.getMillisKeepLocal(dateTimeZone39, (long) (byte) 1);
        long long49 = dateTimeZone33.convertLocalToUTC((long) '4', false);
        java.util.Locale locale51 = null;
        java.lang.String str52 = dateTimeZone33.getName((long) ' ', locale51);
        org.joda.time.LocalDateTime localDateTime53 = null;
        boolean boolean54 = dateTimeZone33.isLocalDateTimeGap(localDateTime53);
        long long56 = dateTimeZone28.getMillisKeepLocal(dateTimeZone33, (long) (byte) 10);
        long long59 = dateTimeZone28.convertLocalToUTC((-99L), true);
        long long61 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone28, (-60L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-01:00" + "'", str31, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-101L) + "'", long37 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-101L) + "'", long43 == (-101L));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00:00.100" + "'", str44, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-48L) + "'", long49 == (-48L));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00:00.100" + "'", str52, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-3600090L) + "'", long56 == (-3600090L));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 3599901L + "'", long59 == 3599901L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 3599950L + "'", long61 == 3599950L);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0800");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long8 = fixedDateTimeZone4.convertLocalToUTC((-68L), false, (-10L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-68L), locale10);
        java.lang.String str13 = fixedDateTimeZone4.getNameKey(0L);
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        int int16 = fixedDateTimeZone4.getOffsetFromLocal(132L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-165L) + "'", long8 == (-165L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.097" + "'", str11, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0801");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset((long) (short) -1);
        long long13 = fixedDateTimeZone4.nextTransition((-11L));
        long long16 = fixedDateTimeZone4.adjustOffset(32L, false);
        int int18 = fixedDateTimeZone4.getOffsetFromLocal((-149L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0802");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-20L));
        long long13 = fixedDateTimeZone4.nextTransition((-111L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str20 = fixedDateTimeZone18.getNameKey((long) (byte) 0);
        int int22 = fixedDateTimeZone18.getStandardOffset(100L);
        int int24 = fixedDateTimeZone18.getStandardOffset((-101L));
        int int26 = fixedDateTimeZone18.getOffset((long) 35);
        long long28 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, 0L);
        int int30 = fixedDateTimeZone4.getOffsetFromLocal(112L);
        java.lang.String str32 = fixedDateTimeZone4.getShortName(42L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-111L) + "'", long13 == (-111L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.010" + "'", str32, "+00:00:00.010");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0803");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        long long8 = fixedDateTimeZone4.nextTransition((-99L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getName((long) 97, locale10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-99L) + "'", long8 == (-99L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0804");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0805");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "UTC", (int) (byte) 10, (int) (byte) -1);
        java.lang.String str5 = fixedDateTimeZone4.getID();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        int int8 = fixedDateTimeZone4.getOffsetFromLocal((-101L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0806");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long29 = fixedDateTimeZone4.convertLocalToUTC((-10L), false, (long) (byte) 100);
        java.lang.String str31 = fixedDateTimeZone4.getNameKey((long) (short) 0);
        java.util.TimeZone timeZone32 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone33 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-20L) + "'", long29 == (-20L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0807");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (byte) 0, locale3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long10 = dateTimeZone6.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str11 = dateTimeZone6.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        boolean boolean14 = dateTimeZone6.isStandardOffset(0L);
        java.lang.String str16 = dateTimeZone6.getShortName((long) (short) 1);
        long long20 = dateTimeZone6.convertLocalToUTC(1L, true, 62L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (-62L));
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone6.isLocalDateTimeGap(localDateTime23);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("", "+10:01", 97, (int) (short) 1);
        long long31 = dateTimeZone6.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (-58L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone36 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str38 = fixedDateTimeZone36.getNameKey((long) (byte) 0);
        long long40 = fixedDateTimeZone36.previousTransition((long) '#');
        long long42 = fixedDateTimeZone36.nextTransition((long) '4');
        int int44 = fixedDateTimeZone36.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long50 = dateTimeZone46.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str51 = dateTimeZone46.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone46);
        boolean boolean54 = dateTimeZone46.isStandardOffset(0L);
        java.lang.String str56 = dateTimeZone46.getShortName((long) (short) 1);
        boolean boolean57 = fixedDateTimeZone36.equals((java.lang.Object) str56);
        long long60 = fixedDateTimeZone36.adjustOffset((long) ' ', false);
        long long62 = fixedDateTimeZone36.convertUTCToLocal((-48L));
        java.lang.String str64 = fixedDateTimeZone36.getShortName((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant65 = null;
        int int66 = fixedDateTimeZone36.getOffset(readableInstant65);
        java.lang.String str67 = fixedDateTimeZone36.toString();
        long long69 = fixedDateTimeZone29.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone36, (-211L));
        java.util.Locale locale71 = null;
        java.lang.String str72 = fixedDateTimeZone36.getShortName(406L, locale71);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-99L) + "'", long20 == (-99L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3600162L) + "'", long22 == (-3600162L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-55L) + "'", long31 == (-55L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 35L + "'", long40 == 35L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 52L + "'", long42 == 52L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-101L) + "'", long50 == (-101L));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00:00.100" + "'", str51, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00:00.100" + "'", str56, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 32L + "'", long60 == 32L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-38L) + "'", long62 == (-38L));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+00:00:00.010" + "'", str64, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-124L) + "'", long69 == (-124L));
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "+00:00:00.010" + "'", str72, "+00:00:00.010");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0808");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str17 = fixedDateTimeZone4.getShortName((-58L));
        boolean boolean19 = fixedDateTimeZone4.isStandardOffset(1L);
        java.util.TimeZone timeZone20 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str22 = fixedDateTimeZone4.getName((-89L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.010" + "'", str22, "+00:00:00.010");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0809");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str12 = dateTimeZone7.getID();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (byte) 1);
        boolean boolean16 = dateTimeZone7.isStandardOffset((long) ' ');
        boolean boolean18 = dateTimeZone7.isStandardOffset((-3660000L));
        long long20 = dateTimeZone7.convertUTCToLocal((-268L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-168L) + "'", long20 == (-168L));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0810");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        long long18 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        long long21 = fixedDateTimeZone4.adjustOffset((long) 97, false);
        long long23 = fixedDateTimeZone4.previousTransition((-4200052L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10L) + "'", long18 == (-10L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-4200052L) + "'", long23 == (-4200052L));
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0811");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        boolean boolean21 = fixedDateTimeZone4.isStandardOffset((-20L));
        java.util.Locale locale23 = null;
        java.lang.String str24 = fixedDateTimeZone4.getName((-100L), locale23);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime25);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111L) + "'", long17 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.010" + "'", str24, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0812");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "UTC", 35, (int) (short) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str11 = fixedDateTimeZone9.getNameKey((long) (byte) 0);
        long long13 = fixedDateTimeZone9.previousTransition((long) '#');
        int int15 = fixedDateTimeZone9.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean18 = fixedDateTimeZone9.equals((java.lang.Object) "UTC");
        long long21 = fixedDateTimeZone9.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = fixedDateTimeZone9.getOffset(readableInstant22);
        long long25 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone9, 122L);
        long long27 = fixedDateTimeZone9.convertUTCToLocal((long) (short) -1);
        long long29 = fixedDateTimeZone9.convertUTCToLocal((-217L));
        int int31 = fixedDateTimeZone9.getOffset(57L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-11L) + "'", long21 == (-11L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 147L + "'", long25 == 147L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9L + "'", long27 == 9L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-207L) + "'", long29 == (-207L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0813");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.035", "+00:35", (-4200000), (int) (byte) 10);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getName(0L, locale6);
        int int9 = fixedDateTimeZone4.getOffset((long) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:10" + "'", str7, "-01:10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4200000) + "'", int9 == (-4200000));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0814");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (byte) 0, locale3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long10 = dateTimeZone6.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str11 = dateTimeZone6.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        boolean boolean14 = dateTimeZone6.isStandardOffset(0L);
        java.lang.String str16 = dateTimeZone6.getShortName((long) (short) 1);
        long long20 = dateTimeZone6.convertLocalToUTC(1L, true, 62L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (-62L));
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone6.isLocalDateTimeGap(localDateTime23);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("", "+10:01", 97, (int) (short) 1);
        long long31 = dateTimeZone6.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (-58L));
        long long33 = fixedDateTimeZone29.convertUTCToLocal(20L);
        int int35 = fixedDateTimeZone29.getStandardOffset((long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-99L) + "'", long20 == (-99L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3600162L) + "'", long22 == (-3600162L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-55L) + "'", long31 == (-55L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 117L + "'", long33 == 117L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0815");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        long long18 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone19 = fixedDateTimeZone4.toTimeZone();
        long long23 = fixedDateTimeZone4.convertLocalToUTC(62L, false, 10L);
        long long25 = fixedDateTimeZone4.previousTransition((-144L));
        java.util.TimeZone timeZone26 = fixedDateTimeZone4.toTimeZone();
        long long28 = fixedDateTimeZone4.nextTransition((-90L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10L) + "'", long18 == (-10L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-144L) + "'", long25 == (-144L));
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-90L) + "'", long28 == (-90L));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0816");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone10 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0817");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean13 = fixedDateTimeZone4.equals((java.lang.Object) "UTC");
        java.lang.String str14 = fixedDateTimeZone4.getID();
        java.lang.String str15 = fixedDateTimeZone4.toString();
        long long17 = fixedDateTimeZone4.previousTransition((-62L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-62L) + "'", long17 == (-62L));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0818");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((-97L));
        boolean boolean8 = fixedDateTimeZone4.isStandardOffset((long) (short) -1);
        long long12 = fixedDateTimeZone4.convertLocalToUTC((-3659878L), true, (-179L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3659878L) + "'", long12 == (-3659878L));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0819");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = fixedDateTimeZone4.getOffset(readableInstant26);
        int int29 = fixedDateTimeZone4.getStandardOffset((long) (byte) -1);
        int int31 = fixedDateTimeZone4.getOffset(110L);
        java.lang.String str32 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0820");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((long) 0, locale16);
        java.lang.String str18 = fixedDateTimeZone4.getID();
        long long21 = fixedDateTimeZone4.adjustOffset((long) (byte) 100, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0821");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        long long14 = fixedDateTimeZone4.adjustOffset((long) 'a', false);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str17 = fixedDateTimeZone4.getName((-48L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0822");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(132L);
        long long15 = fixedDateTimeZone4.adjustOffset((long) 97, true);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long18 = fixedDateTimeZone4.nextTransition(87L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 87L + "'", long18 == 87L);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0823");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        int int20 = fixedDateTimeZone4.getStandardOffset((-169L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0824");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean13 = fixedDateTimeZone4.equals((java.lang.Object) "UTC");
        java.lang.String str14 = fixedDateTimeZone4.getID();
        java.lang.String str15 = fixedDateTimeZone4.toString();
        java.lang.String str16 = fixedDateTimeZone4.getID();
        int int18 = fixedDateTimeZone4.getOffsetFromLocal((-111L));
        long long20 = fixedDateTimeZone4.convertUTCToLocal((-80L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone25 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str27 = fixedDateTimeZone25.getNameKey(10L);
        boolean boolean29 = fixedDateTimeZone25.equals((java.lang.Object) 0.0d);
        long long31 = fixedDateTimeZone25.convertUTCToLocal((-48L));
        long long34 = fixedDateTimeZone25.convertLocalToUTC((-101L), true);
        java.lang.String str36 = fixedDateTimeZone25.getName((-97L));
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = fixedDateTimeZone25.getOffset(readableInstant37);
        long long40 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone25, (-11L));
        org.joda.time.ReadableInstant readableInstant41 = null;
        int int42 = fixedDateTimeZone25.getOffset(readableInstant41);
        int int44 = fixedDateTimeZone25.getOffsetFromLocal((-124L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-70L) + "'", long20 == (-70L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-38L) + "'", long31 == (-38L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-111L) + "'", long34 == (-111L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.010" + "'", str36, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-11L) + "'", long40 == (-11L));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0825");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        long long6 = fixedDateTimeZone4.previousTransition(0L);
        java.lang.String str7 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0826");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "UTC", (int) (byte) 10, (int) (byte) -1);
        java.lang.String str5 = fixedDateTimeZone4.getID();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getName(112L, locale8);
        java.lang.String str10 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.010" + "'", str9, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0827");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long6 = fixedDateTimeZone4.nextTransition(110L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getShortName((-42L), locale8);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.097" + "'", str9, "+00:00:00.097");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0828");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) ' ', (int) (short) 100);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0829");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        int int14 = fixedDateTimeZone4.getOffset((long) '4');
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        long long18 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str19 = fixedDateTimeZone4.toString();
        long long21 = fixedDateTimeZone4.convertUTCToLocal((-36060038L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-36060028L) + "'", long21 == (-36060028L));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0830");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 35, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getShortName((-2099999L));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone7.convertLocalToUTC((long) 1, false);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone7.getName(1L, locale12);
        long long16 = dateTimeZone7.adjustOffset((long) '4', true);
        java.lang.String str18 = dateTimeZone7.getName((long) (byte) -1);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone7.getShortName((-99L), locale20);
        java.lang.String str23 = dateTimeZone7.getName((long) ' ');
        long long25 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone7, (-179L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone30 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str32 = fixedDateTimeZone30.getNameKey((long) (byte) 0);
        int int34 = fixedDateTimeZone30.getStandardOffset(100L);
        java.lang.String str35 = fixedDateTimeZone30.getID();
        org.joda.time.ReadableInstant readableInstant36 = null;
        int int37 = fixedDateTimeZone30.getOffset(readableInstant36);
        boolean boolean39 = fixedDateTimeZone30.isStandardOffset(97L);
        long long41 = fixedDateTimeZone30.previousTransition(0L);
        long long43 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone30, (long) (-4200000));
        int int45 = fixedDateTimeZone30.getOffsetFromLocal(2099999L);
        boolean boolean47 = fixedDateTimeZone30.isStandardOffset(15L);
        java.lang.Class<?> wildcardClass48 = fixedDateTimeZone30.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coordinated Universal Time" + "'", str18, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coordinated Universal Time" + "'", str23, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-144L) + "'", long25 == (-144L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-4199975L) + "'", long43 == (-4199975L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0831");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long29 = fixedDateTimeZone4.convertLocalToUTC((-10L), false, (long) (byte) 100);
        java.lang.String str31 = fixedDateTimeZone4.getNameKey((long) (short) 0);
        long long33 = fixedDateTimeZone4.previousTransition((long) (byte) 100);
        java.util.Locale locale35 = null;
        java.lang.String str36 = fixedDateTimeZone4.getShortName((long) (short) 0, locale35);
        long long38 = fixedDateTimeZone4.previousTransition((-168L));
        boolean boolean40 = fixedDateTimeZone4.isStandardOffset(62L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-20L) + "'", long29 == (-20L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.010" + "'", str36, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-168L) + "'", long38 == (-168L));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0832");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long29 = fixedDateTimeZone4.convertLocalToUTC((-10L), false, (long) (byte) 100);
        java.lang.String str31 = fixedDateTimeZone4.getNameKey((-104L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-20L) + "'", long29 == (-20L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0833");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0834");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = fixedDateTimeZone4.getOffset(readableInstant26);
        boolean boolean28 = fixedDateTimeZone4.isFixed();
        long long30 = fixedDateTimeZone4.nextTransition(110L);
        java.lang.String str32 = fixedDateTimeZone4.getNameKey(3L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 110L + "'", long30 == 110L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0835");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "hi!", 32, 97);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.util.TimeZone timeZone10 = fixedDateTimeZone9.toTimeZone();
        java.util.TimeZone timeZone11 = fixedDateTimeZone9.toTimeZone();
        long long13 = fixedDateTimeZone9.previousTransition((-117L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        long long20 = fixedDateTimeZone9.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, (-127L));
        boolean boolean21 = fixedDateTimeZone4.equals((java.lang.Object) (-127L));
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-117L) + "'", long13 == (-117L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-217L) + "'", long20 == (-217L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0836");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) (byte) -1);
        java.lang.String str4 = dateTimeZone0.getName((long) (byte) 100);
        java.lang.String str6 = dateTimeZone0.getShortName((-91L));
        java.lang.String str8 = dateTimeZone0.getName((-20L));
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0837");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        long long6 = fixedDateTimeZone4.previousTransition(110L);
        long long9 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        long long13 = fixedDateTimeZone4.convertLocalToUTC(1499914L, false, 384L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getName(1500011L, locale15);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1499914L + "'", long13 == 1499914L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0838");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long13 = fixedDateTimeZone4.previousTransition((long) 1);
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((-3600162L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0839");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getShortName((long) (short) -1);
        int int12 = fixedDateTimeZone4.getOffset((-21L));
        long long15 = fixedDateTimeZone4.adjustOffset(200L, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 200L + "'", long15 == 200L);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0840");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        long long6 = fixedDateTimeZone4.previousTransition(110L);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0841");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long28 = fixedDateTimeZone4.adjustOffset((long) ' ', false);
        long long30 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        long long34 = fixedDateTimeZone4.convertLocalToUTC((long) 97, true, 100L);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long40 = dateTimeZone36.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str41 = dateTimeZone36.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        boolean boolean44 = dateTimeZone36.isStandardOffset(0L);
        java.lang.String str46 = dateTimeZone36.getShortName((long) (short) 1);
        long long48 = dateTimeZone36.convertUTCToLocal((long) ' ');
        org.joda.time.LocalDateTime localDateTime49 = null;
        boolean boolean50 = dateTimeZone36.isLocalDateTimeGap(localDateTime49);
        long long54 = dateTimeZone36.convertLocalToUTC(110L, false, (long) 97);
        java.lang.String str55 = dateTimeZone36.toString();
        long long57 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone36, (long) (byte) 1);
        long long61 = fixedDateTimeZone4.convertLocalToUTC((-89L), false, (-11L));
        int int63 = fixedDateTimeZone4.getStandardOffset((long) '4');
        long long65 = fixedDateTimeZone4.convertUTCToLocal(100L);
        java.lang.String str67 = fixedDateTimeZone4.getNameKey((-199L));
        org.joda.time.ReadableInstant readableInstant68 = null;
        int int69 = fixedDateTimeZone4.getOffset(readableInstant68);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-38L) + "'", long30 == (-38L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 87L + "'", long34 == 87L);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-101L) + "'", long40 == (-101L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.100" + "'", str41, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.100" + "'", str46, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 132L + "'", long48 == 132L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L + "'", long54 == 10L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.100" + "'", str55, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-89L) + "'", long57 == (-89L));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-99L) + "'", long61 == (-99L));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 110L + "'", long65 == 110L);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0842");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((long) 0, locale16);
        java.lang.String str19 = fixedDateTimeZone4.getNameKey((-20L));
        java.lang.String str21 = fixedDateTimeZone4.getShortName((-144L));
        java.lang.Object obj22 = null;
        boolean boolean23 = fixedDateTimeZone4.equals(obj22);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str30 = fixedDateTimeZone28.getNameKey((long) (byte) 0);
        long long32 = fixedDateTimeZone28.previousTransition((long) '#');
        long long34 = fixedDateTimeZone28.nextTransition((long) '4');
        int int36 = fixedDateTimeZone28.getOffset((long) '4');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone28);
        long long39 = fixedDateTimeZone28.previousTransition((-107L));
        boolean boolean40 = fixedDateTimeZone4.equals((java.lang.Object) (-107L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.010" + "'", str21, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 35L + "'", long32 == 35L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 52L + "'", long34 == 52L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-107L) + "'", long39 == (-107L));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0843");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str11 = dateTimeZone1.getShortName((long) (short) 1);
        long long13 = dateTimeZone1.convertUTCToLocal((long) ' ');
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getShortName((-7L), locale15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0844");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.toString();
        long long11 = fixedDateTimeZone4.nextTransition((long) (short) 0);
        java.lang.String str13 = fixedDateTimeZone4.getShortName((-2099910L));
        long long15 = fixedDateTimeZone4.convertUTCToLocal(122L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.010" + "'", str13, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 132L + "'", long15 == 132L);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0845");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.nextTransition((-111L));
        java.util.TimeZone timeZone18 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111L) + "'", long17 == (-111L));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0846");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) 100, (-4200000));
        int int6 = fixedDateTimeZone4.getOffset((-4199975L));
        java.lang.String str7 = fixedDateTimeZone4.toString();
        long long9 = fixedDateTimeZone4.previousTransition((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0847");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (short) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone7 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str9 = fixedDateTimeZone7.getNameKey(10L);
        boolean boolean11 = fixedDateTimeZone7.equals((java.lang.Object) 0.0d);
        java.lang.String str13 = fixedDateTimeZone7.getName((long) (byte) -1);
        java.util.TimeZone timeZone14 = fixedDateTimeZone7.toTimeZone();
        long long16 = fixedDateTimeZone7.previousTransition((long) 1);
        java.lang.String str18 = fixedDateTimeZone7.getName((long) 10);
        boolean boolean19 = fixedDateTimeZone7.isFixed();
        long long21 = dateTimeZone2.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone7, (long) 'a');
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone2.isLocalDateTimeGap(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.010" + "'", str13, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-3659913L) + "'", long21 == (-3659913L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0848");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str11 = dateTimeZone1.getShortName((long) (short) 1);
        long long13 = dateTimeZone1.convertUTCToLocal((long) ' ');
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        long long19 = dateTimeZone1.convertLocalToUTC(110L, false, (long) 97);
        java.lang.String str20 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone22, (long) (short) 10);
        boolean boolean26 = dateTimeZone1.isStandardOffset((-36060028L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0849");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-20L));
        long long13 = fixedDateTimeZone4.nextTransition((-111L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str20 = fixedDateTimeZone18.getNameKey((long) (byte) 0);
        int int22 = fixedDateTimeZone18.getStandardOffset(100L);
        int int24 = fixedDateTimeZone18.getStandardOffset((-101L));
        int int26 = fixedDateTimeZone18.getOffset((long) 35);
        long long28 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, 0L);
        java.lang.String str29 = fixedDateTimeZone18.getID();
        boolean boolean30 = fixedDateTimeZone18.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-111L) + "'", long13 == (-111L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0850");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        int int14 = fixedDateTimeZone4.getOffset((long) '4');
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        java.lang.String str19 = fixedDateTimeZone4.getID();
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0851");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((long) (-1));
        java.lang.String str9 = fixedDateTimeZone4.getID();
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getShortName((-3600000L), locale11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0852");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str11 = dateTimeZone1.getShortName((long) (short) 1);
        long long15 = dateTimeZone1.convertLocalToUTC(1L, true, 62L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str17 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0853");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long28 = fixedDateTimeZone4.adjustOffset((long) ' ', false);
        long long30 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        long long34 = fixedDateTimeZone4.convertLocalToUTC((long) 97, true, 100L);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long40 = dateTimeZone36.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str41 = dateTimeZone36.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        boolean boolean44 = dateTimeZone36.isStandardOffset(0L);
        java.lang.String str46 = dateTimeZone36.getShortName((long) (short) 1);
        long long48 = dateTimeZone36.convertUTCToLocal((long) ' ');
        org.joda.time.LocalDateTime localDateTime49 = null;
        boolean boolean50 = dateTimeZone36.isLocalDateTimeGap(localDateTime49);
        long long54 = dateTimeZone36.convertLocalToUTC(110L, false, (long) 97);
        java.lang.String str55 = dateTimeZone36.toString();
        long long57 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone36, (long) (byte) 1);
        long long61 = fixedDateTimeZone4.convertLocalToUTC((-89L), false, (-11L));
        int int63 = fixedDateTimeZone4.getStandardOffset((long) '4');
        long long65 = fixedDateTimeZone4.convertUTCToLocal(100L);
        java.lang.String str67 = fixedDateTimeZone4.getNameKey((-199L));
        boolean boolean69 = fixedDateTimeZone4.isStandardOffset(242L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-38L) + "'", long30 == (-38L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 87L + "'", long34 == 87L);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-101L) + "'", long40 == (-101L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.100" + "'", str41, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.100" + "'", str46, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 132L + "'", long48 == 132L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L + "'", long54 == 10L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.100" + "'", str55, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-89L) + "'", long57 == (-89L));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-99L) + "'", long61 == (-99L));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 110L + "'", long65 == 110L);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0854");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        long long14 = fixedDateTimeZone4.adjustOffset((long) 'a', false);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey((-97L));
        long long19 = fixedDateTimeZone4.adjustOffset((-4L), false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-4L) + "'", long19 == (-4L));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0855");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean13 = fixedDateTimeZone4.equals((java.lang.Object) "UTC");
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (short) -1, false);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone4.getName(157L, locale18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-11L) + "'", long16 == (-11L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.010" + "'", str19, "+00:00:00.010");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0856");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((long) 0, locale16);
        java.lang.String str19 = fixedDateTimeZone4.getNameKey((-20L));
        java.lang.String str21 = fixedDateTimeZone4.getName((-60065L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.010" + "'", str21, "+00:00:00.010");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0857");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "UTC", (int) (byte) 10, (int) (byte) -1);
        java.lang.String str5 = fixedDateTimeZone4.getID();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0858");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        long long14 = fixedDateTimeZone4.adjustOffset((long) 'a', false);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone4.getName((long) (short) -1, locale18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = fixedDateTimeZone4.getOffset(readableInstant20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.010" + "'", str19, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0859");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        int int12 = fixedDateTimeZone4.getOffset((-68L));
        long long14 = fixedDateTimeZone4.nextTransition((-99L));
        long long17 = fixedDateTimeZone4.convertLocalToUTC(40L, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-99L) + "'", long14 == (-99L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 30L + "'", long17 == 30L);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0860");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long28 = fixedDateTimeZone4.adjustOffset((long) ' ', false);
        long long30 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        long long32 = fixedDateTimeZone4.nextTransition((-4199975L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-38L) + "'", long30 == (-38L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-4199975L) + "'", long32 == (-4199975L));
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0861");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        long long9 = dateTimeZone0.adjustOffset((long) '4', true);
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone16 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str18 = fixedDateTimeZone16.getNameKey(10L);
        boolean boolean20 = fixedDateTimeZone16.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone16);
        int int23 = fixedDateTimeZone16.getOffset((long) (byte) 1);
        long long25 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone16, (long) (-1));
        java.util.Locale locale27 = null;
        java.lang.String str28 = fixedDateTimeZone16.getName(232L, locale27);
        java.lang.String str30 = fixedDateTimeZone16.getShortName((-3600090L));
        long long34 = fixedDateTimeZone16.convertLocalToUTC(45L, true, (-1L));
        long long36 = fixedDateTimeZone16.nextTransition(100L);
        java.util.Locale locale38 = null;
        java.lang.String str39 = fixedDateTimeZone16.getShortName((-10L), locale38);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-11L) + "'", long25 == (-11L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.010" + "'", str28, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.010" + "'", str30, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35L + "'", long34 == 35L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.010" + "'", str39, "+00:00:00.010");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0862");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "+00:00:00.010", 97, 2100000);
        long long7 = fixedDateTimeZone4.convertLocalToUTC(1500011L, true);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getName(91L, locale10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1499914L + "'", long7 == 1499914L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.097" + "'", str11, "+00:00:00.097");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0863");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) (-1.0f));
        long long15 = fixedDateTimeZone4.convertLocalToUTC(2099999L, true);
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getName((-97L), locale17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2099989L + "'", long15 == 2099989L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0864");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        long long18 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone19 = fixedDateTimeZone4.toTimeZone();
        long long23 = fixedDateTimeZone4.convertLocalToUTC(62L, false, 10L);
        long long25 = fixedDateTimeZone4.previousTransition((-144L));
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        long long28 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone26, (long) (-4200000));
        long long30 = fixedDateTimeZone4.convertUTCToLocal((-68L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10L) + "'", long18 == (-10L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-144L) + "'", long25 == (-144L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-4200000L) + "'", long28 == (-4200000L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-58L) + "'", long30 == (-58L));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0865");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset((long) (short) -1);
        long long13 = fixedDateTimeZone4.nextTransition((-11L));
        long long16 = fixedDateTimeZone4.adjustOffset(32L, false);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long21 = fixedDateTimeZone4.convertLocalToUTC(3599901L, false, (-179L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3599891L + "'", long21 == 3599891L);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0866");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getShortName((long) '#', locale9);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((-2099999L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0867");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0868");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        long long12 = fixedDateTimeZone4.nextTransition(0L);
        int int14 = fixedDateTimeZone4.getOffsetFromLocal((-91L));
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((-99L));
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0869");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        long long18 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone19 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str21 = fixedDateTimeZone4.getNameKey((-4200052L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10L) + "'", long18 == (-10L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0870");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long13 = fixedDateTimeZone4.previousTransition((long) 1);
        java.lang.String str15 = fixedDateTimeZone4.getName((long) 10);
        long long17 = fixedDateTimeZone4.previousTransition(96L);
        long long20 = fixedDateTimeZone4.adjustOffset(0L, false);
        java.lang.String str22 = fixedDateTimeZone4.getNameKey((-110L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 96L + "'", long17 == 96L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0871");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0872");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "", (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0873");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 97, false);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 96L + "'", long4 == 96L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0874");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "UTC", (int) (byte) 10, (int) (byte) -1);
        java.lang.String str5 = fixedDateTimeZone4.getID();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getName(112L, locale8);
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset((-11L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.010" + "'", str9, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0875");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long14 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        java.lang.String str15 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-11L) + "'", long14 == (-11L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0876");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((-3600090L));
        java.util.Locale locale12 = null;
        java.lang.String str13 = fixedDateTimeZone4.getShortName(2099900L, locale12);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.097" + "'", str13, "+00:00:00.097");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0877");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((long) 0, locale16);
        java.lang.String str18 = fixedDateTimeZone4.getID();
        boolean boolean19 = fixedDateTimeZone4.isFixed();
        long long21 = fixedDateTimeZone4.previousTransition((long) (byte) 10);
        long long23 = fixedDateTimeZone4.previousTransition((-149L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-149L) + "'", long23 == (-149L));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0878");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.nextTransition((long) (short) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC(35L, false, (-110L));
        long long15 = fixedDateTimeZone4.previousTransition((-179L));
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 25L + "'", long13 == 25L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-179L) + "'", long15 == (-179L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0879");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((-97L));
        long long8 = fixedDateTimeZone4.nextTransition((long) (byte) 100);
        int int10 = fixedDateTimeZone4.getOffset(52L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = fixedDateTimeZone4.getShortName((long) '#', locale12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0880");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (byte) 0, locale3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long10 = dateTimeZone6.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str11 = dateTimeZone6.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        boolean boolean14 = dateTimeZone6.isStandardOffset(0L);
        java.lang.String str16 = dateTimeZone6.getShortName((long) (short) 1);
        long long20 = dateTimeZone6.convertLocalToUTC(1L, true, 62L);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (-62L));
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone6.isLocalDateTimeGap(localDateTime23);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("", "+10:01", 97, (int) (short) 1);
        long long31 = dateTimeZone6.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (-58L));
        java.lang.String str33 = fixedDateTimeZone29.getNameKey((long) 32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-99L) + "'", long20 == (-99L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3600162L) + "'", long22 == (-3600162L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-55L) + "'", long31 == (-55L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+10:01" + "'", str33, "+10:01");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0881");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset((long) (short) -1);
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((long) 1);
        java.lang.String str15 = fixedDateTimeZone4.getShortName((long) 35);
        long long18 = fixedDateTimeZone4.convertLocalToUTC((-124L), true);
        java.lang.String str19 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-134L) + "'", long18 == (-134L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0882");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3660000 + "'", int4 == 3660000);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0883");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) (-1.0f));
        long long15 = fixedDateTimeZone4.convertLocalToUTC(2099999L, true);
        int int17 = fixedDateTimeZone4.getOffset((-99L));
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long23 = dateTimeZone19.convertLocalToUTC((long) (short) -1, false, 0L);
        long long25 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone19, (-89L));
        java.lang.String str26 = fixedDateTimeZone4.toString();
        java.lang.String str28 = fixedDateTimeZone4.getName((long) '4');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2099989L + "'", long15 == 2099989L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-101L) + "'", long23 == (-101L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-179L) + "'", long25 == (-179L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.010" + "'", str28, "+00:00:00.010");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0884");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0885");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((long) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0886");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Positive hours must not have negative minutes: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0887");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = fixedDateTimeZone4.getOffset(readableInstant5);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        boolean boolean9 = fixedDateTimeZone4.equals((java.lang.Object) 2100000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0888");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2100000, (-4200000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 2100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0889");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str17 = fixedDateTimeZone15.getNameKey((long) (byte) 0);
        long long19 = fixedDateTimeZone15.previousTransition((long) '#');
        long long21 = fixedDateTimeZone15.nextTransition((long) '4');
        int int23 = fixedDateTimeZone15.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long29 = dateTimeZone25.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str30 = dateTimeZone25.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        boolean boolean33 = dateTimeZone25.isStandardOffset(0L);
        java.lang.String str35 = dateTimeZone25.getShortName((long) (short) 1);
        boolean boolean36 = fixedDateTimeZone15.equals((java.lang.Object) str35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = fixedDateTimeZone15.getOffset(readableInstant37);
        int int40 = fixedDateTimeZone15.getStandardOffset((long) (byte) -1);
        long long42 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, 132L);
        java.lang.String str44 = fixedDateTimeZone15.getName(242L);
        java.lang.String str46 = fixedDateTimeZone15.getNameKey((-168L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-101L) + "'", long29 == (-101L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.100" + "'", str35, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 132L + "'", long42 == 132L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00:00.010" + "'", str44, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0890");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-00:01", "", 97, (-1));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0891");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(406L, locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0892");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        int int13 = fixedDateTimeZone4.getOffset((long) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        java.lang.String str16 = dateTimeZone15.toString();
        boolean boolean17 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone15);
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getShortName(416L, locale19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+01:00" + "'", str16, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0893");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "+00:00:00.097", (-1), (-4200000));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str11 = fixedDateTimeZone9.getNameKey((long) (byte) 0);
        int int13 = fixedDateTimeZone9.getStandardOffset(100L);
        java.lang.String str15 = fixedDateTimeZone9.getNameKey((long) 0);
        long long18 = fixedDateTimeZone9.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone9.getOffset(readableInstant19);
        long long22 = fixedDateTimeZone9.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = fixedDateTimeZone9.isLocalDateTimeGap(localDateTime23);
        int int26 = fixedDateTimeZone9.getOffsetFromLocal((long) 100);
        long long29 = fixedDateTimeZone9.adjustOffset((long) 100, false);
        boolean boolean31 = fixedDateTimeZone9.isStandardOffset((long) 'a');
        boolean boolean32 = fixedDateTimeZone4.equals((java.lang.Object) boolean31);
        long long35 = fixedDateTimeZone4.adjustOffset((-2099892L), false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-11L) + "'", long18 == (-11L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-111L) + "'", long22 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-2099892L) + "'", long35 == (-2099892L));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0894");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((long) (-1));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone13.getShortName((-28799903L), locale15);
        boolean boolean17 = fixedDateTimeZone13.isFixed();
        java.lang.String str19 = fixedDateTimeZone13.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long23 = fixedDateTimeZone13.getMillisKeepLocal(dateTimeZone21, 100L);
        java.lang.String str25 = dateTimeZone21.getShortName(0L);
        java.lang.String str26 = dateTimeZone21.toString();
        java.lang.String str28 = dateTimeZone21.getShortName((long) (byte) 1);
        long long30 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone21, (-68L));
        int int32 = fixedDateTimeZone4.getStandardOffset((-99L));
        long long34 = fixedDateTimeZone4.nextTransition((-148L));
        long long36 = fixedDateTimeZone4.nextTransition((-3599913L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.097" + "'", str16, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/joda/time/tz/data" + "'", str19, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-158L) + "'", long30 == (-158L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-148L) + "'", long34 == (-148L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-3599913L) + "'", long36 == (-3599913L));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0895");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((long) 0, locale16);
        java.lang.String str19 = fixedDateTimeZone4.getNameKey((-20L));
        java.lang.String str21 = fixedDateTimeZone4.getShortName((-38L));
        long long24 = fixedDateTimeZone4.convertLocalToUTC((-2099910L), true);
        java.lang.String str26 = fixedDateTimeZone4.getNameKey((long) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.010" + "'", str21, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-2099920L) + "'", long24 == (-2099920L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0896");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long7 = dateTimeZone3.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long13 = dateTimeZone9.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str14 = dateTimeZone9.getID();
        long long16 = dateTimeZone3.getMillisKeepLocal(dateTimeZone9, (long) (byte) 1);
        long long19 = dateTimeZone3.convertLocalToUTC((long) '4', false);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone3.getName((long) ' ', locale21);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone3.getOffset(readableInstant25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-101L) + "'", long7 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-101L) + "'", long13 == (-101L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-48L) + "'", long19 == (-48L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0897");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 35, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getShortName((-2099999L));
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        long long12 = fixedDateTimeZone4.convertLocalToUTC((long) 100, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 65L + "'", long12 == 65L);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0898");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean10 = fixedDateTimeZone4.isFixed();
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone17 = new org.joda.time.tz.FixedDateTimeZone("hi!", "UTC", (int) (byte) 10, (int) (byte) -1);
        java.lang.String str18 = fixedDateTimeZone17.getID();
        java.util.TimeZone timeZone19 = fixedDateTimeZone17.toTimeZone();
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone17, 0L);
        long long23 = fixedDateTimeZone17.previousTransition(242L);
        java.lang.String str25 = fixedDateTimeZone17.getNameKey((-107L));
        int int27 = fixedDateTimeZone17.getOffset(62L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 242L + "'", long23 == 242L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0899");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str6 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0900");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.nextTransition((long) (short) 0);
        int int11 = fixedDateTimeZone4.getOffsetFromLocal((-20L));
        long long13 = fixedDateTimeZone4.previousTransition((long) '4');
        long long15 = fixedDateTimeZone4.nextTransition((-2099999L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-2099999L) + "'", long15 == (-2099999L));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0901");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        long long6 = fixedDateTimeZone4.previousTransition(0L);
        int int8 = fixedDateTimeZone4.getOffset((-144L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0902");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str11 = dateTimeZone1.getShortName((long) (short) 1);
        long long13 = dateTimeZone1.convertUTCToLocal((long) ' ');
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        long long19 = dateTimeZone1.convertLocalToUTC(110L, false, (long) 97);
        java.lang.String str20 = dateTimeZone1.toString();
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone1.getName((long) (-1), locale22);
        long long26 = dateTimeZone1.adjustOffset((long) 97, false);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone1.getShortName((-58L), locale28);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.100" + "'", str29, "+00:00:00.100");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0903");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 100L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        long long18 = fixedDateTimeZone4.convertLocalToUTC(35L, true);
        java.util.Locale locale20 = null;
        java.lang.String str21 = fixedDateTimeZone4.getShortName((-4200097L), locale20);
        java.lang.String str23 = fixedDateTimeZone4.getNameKey((-2099989L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-62L) + "'", long18 == (-62L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.097" + "'", str21, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org/joda/time/tz/data" + "'", str23, "org/joda/time/tz/data");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0904");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) 100, true);
        long long7 = dateTimeZone1.adjustOffset((long) '4', false);
        long long10 = dateTimeZone1.adjustOffset((-4L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-4L) + "'", long10 == (-4L));
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0905");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        boolean boolean9 = fixedDateTimeZone4.isFixed();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "-00:00:00.001", (int) (byte) 10, (int) 'a');
        java.lang.Class<?> wildcardClass15 = fixedDateTimeZone14.getClass();
        boolean boolean16 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0906");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        int int9 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset((-11L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str20 = fixedDateTimeZone18.getNameKey((long) (byte) 0);
        int int22 = fixedDateTimeZone18.getStandardOffset(100L);
        java.lang.String str24 = fixedDateTimeZone18.getNameKey((long) 0);
        long long27 = fixedDateTimeZone18.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = fixedDateTimeZone18.getOffset(readableInstant28);
        long long31 = fixedDateTimeZone18.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = fixedDateTimeZone18.isLocalDateTimeGap(localDateTime32);
        int int35 = fixedDateTimeZone18.getOffsetFromLocal((long) 100);
        long long37 = fixedDateTimeZone18.nextTransition((long) (short) 0);
        long long39 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, 200L);
        long long42 = fixedDateTimeZone4.adjustOffset(0L, false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-11L) + "'", long27 == (-11L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-111L) + "'", long31 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 287L + "'", long39 == 287L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0907");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+10:01", 97, (int) (short) 1);
        long long6 = fixedDateTimeZone4.previousTransition(2099989L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2099989L + "'", long6 == 2099989L);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0908");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0909");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        long long7 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getShortName((-1L), locale9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = fixedDateTimeZone4.getShortName((-3L), locale12);
        int int15 = fixedDateTimeZone4.getOffset((-43L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-97L) + "'", long7 == (-97L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.097" + "'", str10, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.097" + "'", str13, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0910");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Positive hours must not have negative minutes: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0911");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str17 = fixedDateTimeZone4.getShortName((-58L));
        long long19 = fixedDateTimeZone4.convertUTCToLocal((long) 100);
        long long21 = fixedDateTimeZone4.nextTransition((-3659948L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-3659948L) + "'", long21 == (-3659948L));
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0912");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long14 = dateTimeZone10.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str15 = dateTimeZone10.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long19 = dateTimeZone10.adjustOffset((long) (short) 10, false);
        long long22 = dateTimeZone10.convertLocalToUTC((long) (byte) -1, false);
        long long24 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone10, (long) (byte) 100);
        java.lang.String str26 = fixedDateTimeZone4.getNameKey((-3599990L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-101L) + "'", long22 == (-101L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0913");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((long) (byte) 10, locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.Class<?> wildcardClass9 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0914");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        long long7 = fixedDateTimeZone4.convertLocalToUTC((long) 97, false);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getShortName(384L, locale11);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 87L + "'", long7 == 87L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0915");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+01:00", "+00:00:00.052", 2100000, (int) (short) 1);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0916");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        int int21 = fixedDateTimeZone4.getOffsetFromLocal((long) 100);
        long long24 = fixedDateTimeZone4.adjustOffset((long) 100, false);
        boolean boolean26 = fixedDateTimeZone4.isStandardOffset((long) 'a');
        int int28 = fixedDateTimeZone4.getStandardOffset((-89L));
        long long31 = fixedDateTimeZone4.adjustOffset((-101L), true);
        long long34 = fixedDateTimeZone4.adjustOffset((long) (-1), false);
        java.lang.String str35 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111L) + "'", long17 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-101L) + "'", long31 == (-101L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0917");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 100, true, 0L);
        java.lang.String str14 = fixedDateTimeZone4.getID();
        long long18 = fixedDateTimeZone4.convertLocalToUTC((-127L), false, (-179L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 90L + "'", long13 == 90L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-137L) + "'", long18 == (-137L));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0918");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(97, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0919");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        long long14 = fixedDateTimeZone4.convertLocalToUTC((-4200000L), false, 0L);
        long long16 = fixedDateTimeZone4.previousTransition((-144L));
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone4.getName((long) 100, locale18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = fixedDateTimeZone4.getName(20L, locale21);
        long long25 = fixedDateTimeZone4.convertLocalToUTC((-4L), true);
        long long28 = fixedDateTimeZone4.convertLocalToUTC(10L, true);
        long long32 = fixedDateTimeZone4.convertLocalToUTC(2099900L, false, 42L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4200097L) + "'", long14 == (-4200097L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-144L) + "'", long16 == (-144L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.097" + "'", str19, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.097" + "'", str22, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-101L) + "'", long25 == (-101L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-87L) + "'", long28 == (-87L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 2099803L + "'", long32 == 2099803L);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0920");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) (-1.0f));
        long long15 = fixedDateTimeZone4.convertLocalToUTC(2099999L, true);
        int int17 = fixedDateTimeZone4.getOffset((-99L));
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = fixedDateTimeZone4.getOffset(readableInstant18);
        long long22 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 0, true);
        java.util.TimeZone timeZone23 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2099989L + "'", long15 == 2099989L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-10L) + "'", long22 == (-10L));
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0921");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long29 = fixedDateTimeZone4.convertLocalToUTC((-10L), false, (long) (byte) 100);
        java.lang.String str31 = fixedDateTimeZone4.getNameKey((long) (short) 0);
        int int33 = fixedDateTimeZone4.getOffset(96L);
        long long35 = fixedDateTimeZone4.convertUTCToLocal((-2099999L));
        java.util.TimeZone timeZone36 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-20L) + "'", long29 == (-20L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-2099989L) + "'", long35 == (-2099989L));
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0922");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 100L);
        java.lang.String str16 = fixedDateTimeZone4.getName(200L);
        long long19 = fixedDateTimeZone4.convertLocalToUTC((-137L), false);
        long long21 = fixedDateTimeZone4.previousTransition((long) 0);
        int int23 = fixedDateTimeZone4.getOffset((-2099813L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.097" + "'", str16, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-234L) + "'", long19 == (-234L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0923");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:35", "hi!", 0, 100);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0924");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long6 = fixedDateTimeZone4.nextTransition(110L);
        java.lang.String str7 = fixedDateTimeZone4.getID();
        int int9 = fixedDateTimeZone4.getStandardOffset((-88L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0925");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) ' ', (int) (short) 100);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal(3600022L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0926");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+01:00", "", (int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0927");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        long long13 = fixedDateTimeZone4.nextTransition((-10L));
        boolean boolean14 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-10L) + "'", long13 == (-10L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0928");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 1);
        long long6 = dateTimeZone2.convertLocalToUTC((-91L), false, (long) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60091L) + "'", long6 == (-60091L));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0929");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.052", "-00:00:00.001", 0, (int) 'a');
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str11 = fixedDateTimeZone9.getNameKey((long) (byte) 0);
        int int13 = fixedDateTimeZone9.getStandardOffset(100L);
        java.lang.String str15 = fixedDateTimeZone9.getNameKey((long) 0);
        long long18 = fixedDateTimeZone9.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone9.getOffset(readableInstant19);
        boolean boolean22 = fixedDateTimeZone9.isStandardOffset((-11L));
        java.lang.String str23 = fixedDateTimeZone9.getID();
        long long25 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone9, 97L);
        java.lang.String str27 = fixedDateTimeZone9.getShortName((-134L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-11L) + "'", long18 == (-11L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 87L + "'", long25 == 87L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.010" + "'", str27, "+00:00:00.010");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0930");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone8.getName((long) (byte) 0, locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long17 = dateTimeZone13.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str18 = dateTimeZone13.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        boolean boolean21 = dateTimeZone13.isStandardOffset(0L);
        java.lang.String str23 = dateTimeZone13.getShortName((long) (short) 1);
        long long27 = dateTimeZone13.convertLocalToUTC(1L, true, 62L);
        long long29 = dateTimeZone8.getMillisKeepLocal(dateTimeZone13, (-62L));
        long long31 = dateTimeZone0.getMillisKeepLocal(dateTimeZone8, (-3600090L));
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone8.getName((-179L), locale33);
        long long37 = dateTimeZone8.convertLocalToUTC((-88L), false);
        java.lang.String str38 = dateTimeZone8.getID();
        boolean boolean40 = dateTimeZone8.isStandardOffset(52L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-101L) + "'", long17 == (-101L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-99L) + "'", long27 == (-99L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-3600162L) + "'", long29 == (-3600162L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-90L) + "'", long31 == (-90L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-01:00" + "'", str34, "-01:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 3599912L + "'", long37 == 3599912L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-01:00" + "'", str38, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0931");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        int int10 = fixedDateTimeZone4.getStandardOffset((-101L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0932");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        int int10 = fixedDateTimeZone4.getStandardOffset((-101L));
        int int12 = fixedDateTimeZone4.getOffset((long) 35);
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0933");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (byte) 0);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((long) (short) 1);
        java.util.Locale locale14 = null;
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-158L), locale14);
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0934");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.097");
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.097" + "'", str2, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0935");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "-01:00", (int) (short) -1, (int) 'a');
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0936");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long13 = fixedDateTimeZone4.previousTransition((long) 1);
        java.lang.String str15 = fixedDateTimeZone4.getName((long) 10);
        long long17 = fixedDateTimeZone4.previousTransition(96L);
        java.lang.String str19 = fixedDateTimeZone4.getShortName((-207L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 96L + "'", long17 == 96L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.010" + "'", str19, "+00:00:00.010");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0937");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) ' ', (int) (short) 100);
        long long6 = fixedDateTimeZone4.previousTransition((-158L));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((-4199975L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-158L) + "'", long6 == (-158L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0938");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        long long9 = dateTimeZone0.adjustOffset((long) '4', true);
        long long11 = dateTimeZone0.convertUTCToLocal((-20L));
        java.lang.String str13 = dateTimeZone0.getName(3L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-20L) + "'", long11 == (-20L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0939");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.052", "+01:00", (int) (byte) -1, (int) (short) 1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str11 = fixedDateTimeZone9.getNameKey((long) (byte) 0);
        long long13 = fixedDateTimeZone9.previousTransition((long) '#');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone9);
        long long16 = fixedDateTimeZone9.convertUTCToLocal((long) (byte) 10);
        java.lang.String str18 = fixedDateTimeZone9.getShortName((-68L));
        long long20 = fixedDateTimeZone9.nextTransition(122L);
        long long22 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone9, (-134L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 20L + "'", long16 == 20L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 122L + "'", long20 == 122L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-145L) + "'", long22 == (-145L));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0940");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset(97L);
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-149L));
        java.lang.String str17 = fixedDateTimeZone4.getShortName(1L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getShortName(10L, locale19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0941");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long7 = dateTimeZone3.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long13 = dateTimeZone9.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str14 = dateTimeZone9.getID();
        long long16 = dateTimeZone3.getMillisKeepLocal(dateTimeZone9, (long) (byte) 1);
        long long19 = dateTimeZone3.convertLocalToUTC((long) '4', false);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone3.getName((long) ' ', locale21);
        long long24 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) (byte) 0);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone3.getShortName(200L, locale26);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone32 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str34 = fixedDateTimeZone32.getNameKey((long) (byte) 0);
        int int36 = fixedDateTimeZone32.getStandardOffset(100L);
        java.lang.String str38 = fixedDateTimeZone32.getNameKey((long) 0);
        long long41 = fixedDateTimeZone32.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = fixedDateTimeZone32.getOffset(readableInstant42);
        long long45 = fixedDateTimeZone32.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = fixedDateTimeZone32.isLocalDateTimeGap(localDateTime46);
        int int49 = fixedDateTimeZone32.getOffsetFromLocal((long) 100);
        long long51 = fixedDateTimeZone32.nextTransition((long) (short) 0);
        long long53 = dateTimeZone3.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone32, (long) 0);
        java.lang.String str55 = fixedDateTimeZone32.getName(2099999L);
        java.lang.String str57 = fixedDateTimeZone32.getName((-3600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-101L) + "'", long7 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-101L) + "'", long13 == (-101L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-48L) + "'", long19 == (-48L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-11L) + "'", long41 == (-11L));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-111L) + "'", long45 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 90L + "'", long53 == 90L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.010" + "'", str55, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00:00.010" + "'", str57, "+00:00:00.010");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0942");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        boolean boolean15 = fixedDateTimeZone4.isStandardOffset((-38L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getName((-48L), locale17);
        java.lang.String str20 = fixedDateTimeZone4.getShortName(12L);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = fixedDateTimeZone4.getOffset(readableInstant21);
        boolean boolean23 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0943");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.String str10 = dateTimeZone1.getShortName(32L);
        boolean boolean12 = dateTimeZone1.isStandardOffset((-158L));
        long long16 = dateTimeZone1.convertLocalToUTC((-38L), true, (-60091L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-138L) + "'", long16 == (-138L));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0944");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        int int9 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset((-11L));
        long long15 = fixedDateTimeZone4.previousTransition(42L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 42L + "'", long15 == 42L);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0945");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getShortName((long) '#', locale9);
        java.lang.String str11 = fixedDateTimeZone4.getID();
        java.lang.String str13 = fixedDateTimeZone4.getNameKey(62L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.100", (int) (short) 10, (int) (short) -1);
        java.util.Locale locale20 = null;
        java.lang.String str21 = fixedDateTimeZone18.getShortName(25L, locale20);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str28 = fixedDateTimeZone26.getNameKey((long) (byte) 0);
        int int30 = fixedDateTimeZone26.getStandardOffset(100L);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long36 = dateTimeZone32.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str37 = dateTimeZone32.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        long long41 = dateTimeZone32.adjustOffset((long) (short) 10, false);
        long long44 = dateTimeZone32.convertLocalToUTC((long) (byte) -1, false);
        long long46 = fixedDateTimeZone26.getMillisKeepLocal(dateTimeZone32, (long) (byte) 100);
        java.lang.String str47 = dateTimeZone32.toString();
        long long49 = fixedDateTimeZone18.getMillisKeepLocal(dateTimeZone32, 90L);
        boolean boolean50 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.010" + "'", str21, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-101L) + "'", long36 == (-101L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.100" + "'", str37, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-101L) + "'", long44 == (-101L));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.100" + "'", str47, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0946");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone8.getName((long) (byte) 0, locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long17 = dateTimeZone13.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str18 = dateTimeZone13.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        boolean boolean21 = dateTimeZone13.isStandardOffset(0L);
        java.lang.String str23 = dateTimeZone13.getShortName((long) (short) 1);
        long long27 = dateTimeZone13.convertLocalToUTC(1L, true, 62L);
        long long29 = dateTimeZone8.getMillisKeepLocal(dateTimeZone13, (-62L));
        long long31 = dateTimeZone0.getMillisKeepLocal(dateTimeZone8, (-3600090L));
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone8.getName((-179L), locale33);
        long long37 = dateTimeZone8.convertLocalToUTC((-88L), false);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone8.getName(0L, locale39);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-101L) + "'", long17 == (-101L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-99L) + "'", long27 == (-99L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-3600162L) + "'", long29 == (-3600162L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-90L) + "'", long31 == (-90L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-01:00" + "'", str34, "-01:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 3599912L + "'", long37 == 3599912L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-01:00" + "'", str40, "-01:00");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0947");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long28 = fixedDateTimeZone4.adjustOffset((long) ' ', false);
        long long30 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        java.lang.String str32 = fixedDateTimeZone4.getShortName(42L);
        java.lang.String str33 = fixedDateTimeZone4.toString();
        java.util.TimeZone timeZone34 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-38L) + "'", long30 == (-38L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.010" + "'", str32, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0948");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0949");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 97, false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str11 = fixedDateTimeZone9.getNameKey((long) (byte) 0);
        long long13 = fixedDateTimeZone9.previousTransition((long) '#');
        java.lang.String str14 = fixedDateTimeZone9.getID();
        boolean boolean16 = fixedDateTimeZone9.isStandardOffset((long) (short) -1);
        java.lang.String str18 = fixedDateTimeZone9.getNameKey((long) 1);
        java.lang.String str20 = fixedDateTimeZone9.getShortName((long) 35);
        long long23 = fixedDateTimeZone9.convertLocalToUTC((-124L), true);
        long long25 = dateTimeZone1.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone9, (-55L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 96L + "'", long4 == 96L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-134L) + "'", long23 == (-134L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-64L) + "'", long25 == (-64L));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0950");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-01:10", "UTC", (int) (byte) 0, 32);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0951");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long6 = fixedDateTimeZone4.nextTransition(110L);
        java.lang.String str7 = fixedDateTimeZone4.getID();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-158L));
        java.lang.String str11 = fixedDateTimeZone4.getNameKey((-96L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0952");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = fixedDateTimeZone4.getOffset(readableInstant26);
        boolean boolean28 = fixedDateTimeZone4.isFixed();
        long long30 = fixedDateTimeZone4.previousTransition((-3600090L));
        boolean boolean31 = fixedDateTimeZone4.isFixed();
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = fixedDateTimeZone4.getOffset(readableInstant32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-3600090L) + "'", long30 == (-3600090L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0953");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        boolean boolean10 = fixedDateTimeZone4.isStandardOffset((long) 10);
        java.util.Locale locale12 = null;
        java.lang.String str13 = fixedDateTimeZone4.getName(97L, locale12);
        long long17 = fixedDateTimeZone4.convertLocalToUTC(1L, true, (-165L));
        long long21 = fixedDateTimeZone4.convertLocalToUTC(40L, true, (-65L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.010" + "'", str13, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-9L) + "'", long17 == (-9L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 30L + "'", long21 == 30L);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0954");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset(97L);
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-149L));
        java.lang.String str17 = fixedDateTimeZone4.getShortName(1L);
        long long21 = fixedDateTimeZone4.convertLocalToUTC(3599891L, false, (long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3599881L + "'", long21 == 3599881L);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0955");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+01:00", "+00:00:00.032", (-1), (int) (short) 1);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0956");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str15 = fixedDateTimeZone13.getNameKey((long) (byte) 0);
        long long17 = fixedDateTimeZone13.previousTransition((long) '#');
        int int19 = fixedDateTimeZone13.getOffsetFromLocal((long) (short) 10);
        int int21 = fixedDateTimeZone13.getOffsetFromLocal(132L);
        int int23 = fixedDateTimeZone13.getOffsetFromLocal(52L);
        java.lang.String str25 = fixedDateTimeZone13.getNameKey((-207L));
        boolean boolean26 = fixedDateTimeZone4.equals((java.lang.Object) str25);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0957");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0958");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        long long9 = dateTimeZone0.adjustOffset((long) '4', true);
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone16 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str18 = fixedDateTimeZone16.getNameKey(10L);
        boolean boolean20 = fixedDateTimeZone16.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone16);
        int int23 = fixedDateTimeZone16.getOffset((long) (byte) 1);
        long long25 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone16, (long) (-1));
        java.util.Locale locale27 = null;
        java.lang.String str28 = fixedDateTimeZone16.getName(232L, locale27);
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = fixedDateTimeZone16.isLocalDateTimeGap(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-11L) + "'", long25 == (-11L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.010" + "'", str28, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0959");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "hi!", 0, (-4200000));
        long long8 = fixedDateTimeZone4.convertLocalToUTC((-3659913L), false, 287L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long14 = dateTimeZone10.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str15 = dateTimeZone10.getID();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone10.getOffset(readableInstant16);
        long long19 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone10, (-99L));
        java.lang.String str21 = fixedDateTimeZone4.getShortName(45L);
        long long23 = fixedDateTimeZone4.convertUTCToLocal((-10L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3659913L) + "'", long8 == (-3659913L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-199L) + "'", long19 == (-199L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-10L) + "'", long23 == (-10L));
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0960");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((-88L), locale4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0961");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long28 = fixedDateTimeZone4.adjustOffset((long) ' ', false);
        long long30 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        java.lang.String str32 = fixedDateTimeZone4.getShortName((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = fixedDateTimeZone4.getOffset(readableInstant33);
        java.lang.String str35 = fixedDateTimeZone4.toString();
        long long37 = fixedDateTimeZone4.previousTransition((-179L));
        java.util.Locale locale39 = null;
        java.lang.String str40 = fixedDateTimeZone4.getName(147L, locale39);
        java.util.Locale locale42 = null;
        java.lang.String str43 = fixedDateTimeZone4.getShortName(10L, locale42);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-38L) + "'", long30 == (-38L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.010" + "'", str32, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-179L) + "'", long37 == (-179L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.010" + "'", str40, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.010" + "'", str43, "+00:00:00.010");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0962");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) 100, (-4200000));
        int int6 = fixedDateTimeZone4.getOffset((-4199975L));
        java.lang.String str7 = fixedDateTimeZone4.toString();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = fixedDateTimeZone4.getOffset(readableInstant8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0963");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-101L), true);
        long long15 = fixedDateTimeZone4.previousTransition(100L);
        long long17 = fixedDateTimeZone4.previousTransition((-58L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-111L) + "'", long13 == (-111L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-58L) + "'", long17 == (-58L));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0964");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        int int11 = fixedDateTimeZone4.getStandardOffset(62L);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        java.lang.String str14 = fixedDateTimeZone4.getName((-58L));
        int int16 = fixedDateTimeZone4.getOffsetFromLocal(132L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0965");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0966");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str17 = fixedDateTimeZone4.getShortName((-58L));
        long long19 = fixedDateTimeZone4.convertUTCToLocal((long) 100);
        int int21 = fixedDateTimeZone4.getOffsetFromLocal((long) 1);
        java.lang.String str23 = fixedDateTimeZone4.getName((-124L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.010" + "'", str23, "+00:00:00.010");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0967");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) 'a', (int) (short) 1);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0968");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        long long18 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        long long21 = fixedDateTimeZone4.adjustOffset((long) 97, false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "hi!", (int) (short) -1, (int) (short) -1);
        long long28 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone26, (long) (short) 100);
        java.lang.String str30 = fixedDateTimeZone4.getShortName((-57L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10L) + "'", long18 == (-10L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 111L + "'", long28 == 111L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.010" + "'", str30, "+00:00:00.010");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0969");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 100L);
        java.lang.String str16 = dateTimeZone12.getShortName(0L);
        java.lang.String str17 = dateTimeZone12.toString();
        java.lang.String str19 = dateTimeZone12.getName((-70L));
        java.lang.Class<?> wildcardClass20 = dateTimeZone12.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0970");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        boolean boolean21 = fixedDateTimeZone4.isStandardOffset((-20L));
        java.lang.String str23 = fixedDateTimeZone4.getNameKey((-10L));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long29 = dateTimeZone25.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long35 = dateTimeZone31.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str36 = dateTimeZone31.getID();
        long long38 = dateTimeZone25.getMillisKeepLocal(dateTimeZone31, (long) (byte) 1);
        long long40 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone25, (-47L));
        java.lang.String str41 = dateTimeZone25.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111L) + "'", long17 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-101L) + "'", long29 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-101L) + "'", long35 == (-101L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.100" + "'", str36, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-137L) + "'", long40 == (-137L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.100" + "'", str41, "+00:00:00.100");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0971");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean13 = fixedDateTimeZone4.equals((java.lang.Object) "UTC");
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 35);
        long long18 = dateTimeZone16.convertUTCToLocal((-1L));
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone16.getOffset(readableInstant19);
        boolean boolean21 = fixedDateTimeZone4.equals((java.lang.Object) readableInstant19);
        java.util.Locale locale23 = null;
        java.lang.String str24 = fixedDateTimeZone4.getShortName(35L, locale23);
        boolean boolean26 = fixedDateTimeZone4.isStandardOffset((-3600097L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2099999L + "'", long18 == 2099999L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2100000 + "'", int20 == 2100000);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.010" + "'", str24, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0972");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str17 = fixedDateTimeZone15.getNameKey((long) (byte) 0);
        long long19 = fixedDateTimeZone15.previousTransition((long) '#');
        long long21 = fixedDateTimeZone15.nextTransition((long) '4');
        int int23 = fixedDateTimeZone15.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long29 = dateTimeZone25.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str30 = dateTimeZone25.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        boolean boolean33 = dateTimeZone25.isStandardOffset(0L);
        java.lang.String str35 = dateTimeZone25.getShortName((long) (short) 1);
        boolean boolean36 = fixedDateTimeZone15.equals((java.lang.Object) str35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = fixedDateTimeZone15.getOffset(readableInstant37);
        int int40 = fixedDateTimeZone15.getStandardOffset((long) (byte) -1);
        long long42 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, 132L);
        long long44 = fixedDateTimeZone15.nextTransition((-2099813L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-101L) + "'", long29 == (-101L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.100" + "'", str35, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 132L + "'", long42 == 132L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-2099813L) + "'", long44 == (-2099813L));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0973");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-101L), true);
        int int15 = fixedDateTimeZone4.getOffsetFromLocal(52L);
        java.lang.String str16 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-111L) + "'", long13 == (-111L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0974");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean13 = fixedDateTimeZone4.equals((java.lang.Object) "UTC");
        java.lang.String str14 = fixedDateTimeZone4.getID();
        java.lang.String str15 = fixedDateTimeZone4.toString();
        java.lang.String str16 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) ' ', (int) (short) 100);
        int int23 = fixedDateTimeZone21.getStandardOffset((-144L));
        long long25 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone21, (-149L));
        java.util.Locale locale27 = null;
        java.lang.String str28 = fixedDateTimeZone4.getShortName(90L, locale27);
        long long30 = fixedDateTimeZone4.nextTransition((-96L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-171L) + "'", long25 == (-171L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.010" + "'", str28, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-96L) + "'", long30 == (-96L));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0975");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        boolean boolean21 = fixedDateTimeZone4.isStandardOffset((-20L));
        java.lang.String str23 = fixedDateTimeZone4.getNameKey((-10L));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long29 = dateTimeZone25.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long35 = dateTimeZone31.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str36 = dateTimeZone31.getID();
        long long38 = dateTimeZone25.getMillisKeepLocal(dateTimeZone31, (long) (byte) 1);
        long long40 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone25, (-47L));
        java.util.Locale locale42 = null;
        java.lang.String str43 = fixedDateTimeZone4.getShortName(87L, locale42);
        int int45 = fixedDateTimeZone4.getOffset((-80L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111L) + "'", long17 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-101L) + "'", long29 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-101L) + "'", long35 == (-101L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.100" + "'", str36, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-137L) + "'", long40 == (-137L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.010" + "'", str43, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0976");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((-97L));
        boolean boolean8 = fixedDateTimeZone4.isStandardOffset((long) (short) -1);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        long long11 = fixedDateTimeZone4.convertUTCToLocal(0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org/joda/time/tz/data" + "'", str9, "org/joda/time/tz/data");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0977");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((long) (byte) 10, locale6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long13 = dateTimeZone9.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str14 = dateTimeZone9.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone9.getOffset(readableInstant16);
        java.lang.String str18 = dateTimeZone9.toString();
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone9.isLocalDateTimeGap(localDateTime19);
        boolean boolean21 = fixedDateTimeZone4.equals((java.lang.Object) localDateTime19);
        long long25 = fixedDateTimeZone4.convertLocalToUTC((-104L), true, 242L);
        long long28 = fixedDateTimeZone4.adjustOffset((-4200000L), true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-101L) + "'", long13 == (-101L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-201L) + "'", long25 == (-201L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-4200000L) + "'", long28 == (-4200000L));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0978");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(97, (-4200000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0979");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        long long18 = fixedDateTimeZone4.convertLocalToUTC((-58L), true, 200L);
        long long20 = fixedDateTimeZone4.nextTransition(242L);
        java.lang.String str22 = fixedDateTimeZone4.getNameKey((-3659913L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-68L) + "'", long18 == (-68L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 242L + "'", long20 == 242L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0980");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0981");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "+00:00:00.097", (-1), (-4200000));
        int int6 = fixedDateTimeZone4.getStandardOffset(0L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4200000) + "'", int6 == (-4200000));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0982");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str16 = fixedDateTimeZone14.getNameKey((long) (byte) 0);
        long long18 = fixedDateTimeZone14.previousTransition((long) '#');
        int int20 = fixedDateTimeZone14.getOffsetFromLocal((long) (short) 10);
        int int22 = fixedDateTimeZone14.getOffsetFromLocal(132L);
        long long25 = fixedDateTimeZone14.adjustOffset((long) 97, true);
        long long28 = fixedDateTimeZone14.adjustOffset((-268L), false);
        boolean boolean29 = fixedDateTimeZone4.equals((java.lang.Object) false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-268L) + "'", long28 == (-268L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0983");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-20L));
        long long13 = fixedDateTimeZone4.nextTransition((-111L));
        java.lang.String str15 = fixedDateTimeZone4.getShortName(40L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-111L) + "'", long13 == (-111L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0984");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(32, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0985");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = fixedDateTimeZone4.getOffset(readableInstant26);
        int int29 = fixedDateTimeZone4.getStandardOffset((long) (byte) -1);
        long long33 = fixedDateTimeZone4.convertLocalToUTC(132L, false, (long) '#');
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = fixedDateTimeZone4.getOffset(readableInstant34);
        java.lang.String str37 = fixedDateTimeZone4.getShortName(30L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 122L + "'", long33 == 122L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.010" + "'", str37, "+00:00:00.010");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0986");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((-97L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone11 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str13 = fixedDateTimeZone11.getNameKey((long) (byte) 0);
        long long15 = fixedDateTimeZone11.previousTransition((long) '#');
        long long17 = fixedDateTimeZone11.nextTransition((long) '4');
        int int19 = fixedDateTimeZone11.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = fixedDateTimeZone11.isLocalDateTimeGap(localDateTime20);
        java.util.TimeZone timeZone22 = fixedDateTimeZone11.toTimeZone();
        boolean boolean23 = fixedDateTimeZone11.isFixed();
        int int25 = fixedDateTimeZone11.getOffset(35L);
        long long27 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone11, (-2099910L));
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long33 = dateTimeZone29.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str34 = dateTimeZone29.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        boolean boolean37 = dateTimeZone29.isStandardOffset(0L);
        long long39 = dateTimeZone29.convertUTCToLocal((-101L));
        java.lang.String str41 = dateTimeZone29.getShortName(35L);
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone29.getName((-4199975L), locale43);
        long long46 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone29, (-168L));
        int int48 = fixedDateTimeZone4.getOffsetFromLocal(3599881L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-2099920L) + "'", long27 == (-2099920L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-101L) + "'", long33 == (-101L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.100" + "'", str41, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00:00.100" + "'", str44, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-268L) + "'", long46 == (-268L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0987");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((-21L));
        int int18 = fixedDateTimeZone4.getOffsetFromLocal(122L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone4.getOffset(readableInstant19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0988");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset(97L);
        boolean boolean14 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0989");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        long long9 = dateTimeZone0.adjustOffset((long) '4', true);
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) -1);
        java.lang.String str13 = dateTimeZone0.getName(3L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        long long17 = dateTimeZone14.convertLocalToUTC((long) 1, false);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone14.getName(1L, locale19);
        long long23 = dateTimeZone14.adjustOffset((long) '4', true);
        java.lang.String str25 = dateTimeZone14.getName((long) (byte) -1);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone14.getShortName((-99L), locale27);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone14.getShortName((long) (short) 100, locale30);
        long long33 = dateTimeZone14.convertUTCToLocal(242L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        long long36 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, (long) 2100000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coordinated Universal Time" + "'", str20, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Coordinated Universal Time" + "'", str25, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 242L + "'", long33 == 242L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 2100000L + "'", long36 == 2100000L);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0990");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:00");
        boolean boolean3 = dateTimeZone1.isStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        long long6 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (-149L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3600149L) + "'", long6 == (-3600149L));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0991");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str8 = fixedDateTimeZone4.toString();
        long long10 = fixedDateTimeZone4.previousTransition(132L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 132L + "'", long10 == 132L);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0992");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean13 = fixedDateTimeZone4.equals((java.lang.Object) "UTC");
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = fixedDateTimeZone4.getOffset(readableInstant17);
        int int20 = fixedDateTimeZone4.getOffset((-42L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-11L) + "'", long16 == (-11L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0993");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long13 = fixedDateTimeZone4.previousTransition(90L);
        int int15 = fixedDateTimeZone4.getStandardOffset((long) (-4200000));
        java.lang.String str16 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 90L + "'", long13 == 90L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0994");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long18 = dateTimeZone14.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str19 = dateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone14.getShortName((long) (short) 1);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) str24);
        long long28 = fixedDateTimeZone4.adjustOffset((long) ' ', false);
        long long30 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        long long32 = fixedDateTimeZone4.nextTransition(10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-38L) + "'", long30 == (-38L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0995");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-4200000));
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0996");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset((long) (short) -1);
        long long13 = fixedDateTimeZone4.nextTransition((-11L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.Class<?> wildcardClass15 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0997");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long7 = fixedDateTimeZone4.nextTransition((-211L));
        java.lang.String str9 = fixedDateTimeZone4.getShortName((-145L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-211L) + "'", long7 == (-211L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0998");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (-1));
        long long5 = dateTimeZone2.adjustOffset(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test0999");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((-48L));
        int int8 = fixedDateTimeZone4.getOffset((-110L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-2099920L), locale10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/joda/time/tz/data" + "'", str6, "org/joda/time/tz/data");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.097" + "'", str11, "+00:00:00.097");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest1.test1000");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 0, true, (-3599903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-100L) + "'", long5 == (-100L));
    }
}

