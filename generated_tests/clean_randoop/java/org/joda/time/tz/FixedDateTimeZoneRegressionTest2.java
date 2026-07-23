package org.joda.time.tz;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixedDateTimeZoneRegressionTest2 {

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
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1001");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str11 = dateTimeZone1.getShortName((long) (short) 1);
        long long13 = dateTimeZone1.convertUTCToLocal((long) ' ');
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone1.isLocalDateTimeGap(localDateTime14);
        long long18 = dateTimeZone1.convertLocalToUTC((long) 2100000, false);
        java.lang.Class<?> wildcardClass19 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2099900L + "'", long18 == 2099900L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1002");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getName((-68L), locale6);
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-97L));
        long long12 = fixedDateTimeZone4.adjustOffset((-87L), true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org/joda/time/tz/data" + "'", str9, "org/joda/time/tz/data");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-87L) + "'", long12 == (-87L));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1003");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        java.lang.String str17 = fixedDateTimeZone4.getID();
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        long long21 = fixedDateTimeZone4.nextTransition((-21L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-21L) + "'", long21 == (-21L));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1004");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset(97L);
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-149L));
        java.lang.String str17 = fixedDateTimeZone4.getShortName((-2099910L));
        java.lang.String str18 = fixedDateTimeZone4.toString();
        int int20 = fixedDateTimeZone4.getOffsetFromLocal((-42L));
        java.lang.String str21 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1005");
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
        boolean boolean32 = fixedDateTimeZone16.isFixed();
        int int34 = fixedDateTimeZone16.getOffset((-11L));
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1006");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        long long14 = fixedDateTimeZone4.adjustOffset((long) 'a', false);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey((-97L));
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = fixedDateTimeZone4.getOffset(readableInstant17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1007");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean10 = fixedDateTimeZone4.isFixed();
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) -1);
        long long14 = fixedDateTimeZone4.previousTransition((-65L));
        int int16 = fixedDateTimeZone4.getStandardOffset(1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-65L) + "'", long14 == (-65L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1008");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1009");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset(97L);
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-149L));
        java.lang.String str17 = fixedDateTimeZone4.getShortName(1L);
        int int19 = fixedDateTimeZone4.getOffset(2099999L);
        long long21 = fixedDateTimeZone4.nextTransition((-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-101L) + "'", long21 == (-101L));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1010");
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
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone8.getOffset(readableInstant38);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-3600000) + "'", int39 == (-3600000));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1011");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-101L), true);
        long long15 = fixedDateTimeZone4.previousTransition(100L);
        long long17 = fixedDateTimeZone4.convertUTCToLocal((-90L));
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getShortName((long) (-4200000), locale19);
        long long24 = fixedDateTimeZone4.convertLocalToUTC((-28799903L), true, 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-111L) + "'", long13 == (-111L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-80L) + "'", long17 == (-80L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-28799913L) + "'", long24 == (-28799913L));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1012");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) (byte) -1);
        java.lang.String str4 = dateTimeZone0.getName((long) (byte) 100);
        java.lang.String str6 = dateTimeZone0.getShortName((-91L));
        long long9 = dateTimeZone0.adjustOffset((-2099920L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-2099920L) + "'", long9 == (-2099920L));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1013");
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
        long long28 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 10, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coordinated Universal Time" + "'", str18, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coordinated Universal Time" + "'", str23, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-144L) + "'", long25 == (-144L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-25L) + "'", long28 == (-25L));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1014");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(132L);
        int int14 = fixedDateTimeZone4.getOffset((long) (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1015");
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
        java.lang.String str31 = fixedDateTimeZone16.getNameKey(111L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone36 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str38 = fixedDateTimeZone36.getNameKey((long) (byte) 0);
        long long40 = fixedDateTimeZone36.previousTransition((long) '#');
        long long42 = fixedDateTimeZone36.nextTransition((long) '4');
        int int44 = fixedDateTimeZone36.getOffset((long) '4');
        long long46 = fixedDateTimeZone36.previousTransition(35L);
        long long48 = fixedDateTimeZone36.previousTransition((long) (short) 100);
        long long50 = fixedDateTimeZone36.previousTransition((-1L));
        java.lang.String str52 = fixedDateTimeZone36.getName((-38L));
        java.lang.String str54 = fixedDateTimeZone36.getNameKey((-97L));
        long long56 = fixedDateTimeZone36.convertUTCToLocal(232L);
        int int58 = fixedDateTimeZone36.getOffset(242L);
        boolean boolean59 = fixedDateTimeZone16.equals((java.lang.Object) 242L);
        org.joda.time.ReadableInstant readableInstant60 = null;
        int int61 = fixedDateTimeZone16.getOffset(readableInstant60);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 35L + "'", long40 == 35L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 52L + "'", long42 == 52L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 35L + "'", long46 == 35L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 100L + "'", long48 == 100L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00:00.010" + "'", str52, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 242L + "'", long56 == 242L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1016");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long8 = fixedDateTimeZone4.convertLocalToUTC((-68L), false, (-10L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-68L), locale10);
        java.lang.String str13 = fixedDateTimeZone4.getNameKey(0L);
        long long17 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-3659878L));
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getName((-90L), locale19);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone25 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale27 = null;
        java.lang.String str28 = fixedDateTimeZone25.getShortName((-28799903L), locale27);
        boolean boolean29 = fixedDateTimeZone25.isFixed();
        java.lang.String str31 = fixedDateTimeZone25.getNameKey(87L);
        long long33 = fixedDateTimeZone25.nextTransition(0L);
        int int35 = fixedDateTimeZone25.getOffsetFromLocal(42L);
        long long37 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone25, (-36060038L));
        java.util.Locale locale39 = null;
        java.lang.String str40 = fixedDateTimeZone25.getShortName((-2099892L), locale39);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-165L) + "'", long8 == (-165L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.097" + "'", str11, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-97L) + "'", long17 == (-97L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.097" + "'", str20, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.097" + "'", str28, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org/joda/time/tz/data" + "'", str31, "org/joda/time/tz/data");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-36060038L) + "'", long37 == (-36060038L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.097" + "'", str40, "+00:00:00.097");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1017");
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
        java.lang.String str33 = fixedDateTimeZone4.getID();
        int int35 = fixedDateTimeZone4.getOffset((-179L));
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1018");
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
        long long64 = fixedDateTimeZone4.adjustOffset(147L, false);
        java.lang.String str65 = fixedDateTimeZone4.toString();
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
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 147L + "'", long64 == 147L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1019");
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
        java.util.Locale locale24 = null;
        java.lang.String str25 = fixedDateTimeZone4.getName((long) (short) 100, locale24);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2099989L + "'", long15 == 2099989L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-10L) + "'", long22 == (-10L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.010" + "'", str25, "+00:00:00.010");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1020");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 100, true, 0L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str20 = fixedDateTimeZone18.getNameKey((long) (byte) 0);
        long long22 = fixedDateTimeZone18.previousTransition((long) '#');
        long long24 = fixedDateTimeZone18.nextTransition((long) '4');
        int int26 = fixedDateTimeZone18.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long32 = dateTimeZone28.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str33 = dateTimeZone28.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        boolean boolean36 = dateTimeZone28.isStandardOffset(0L);
        java.lang.String str38 = dateTimeZone28.getShortName((long) (short) 1);
        boolean boolean39 = fixedDateTimeZone18.equals((java.lang.Object) str38);
        boolean boolean40 = fixedDateTimeZone4.equals((java.lang.Object) boolean39);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 90L + "'", long13 == 90L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-101L) + "'", long32 == (-101L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.100" + "'", str38, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1021");
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
        long long24 = fixedDateTimeZone4.previousTransition((-64L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-64L) + "'", long24 == (-64L));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1022");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.052", "-00:00:00.001", 0, (int) 'a');
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((-43L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1023");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean7 = fixedDateTimeZone4.isStandardOffset((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        boolean boolean11 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone9);
        long long14 = fixedDateTimeZone4.convertLocalToUTC(3599901L, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3599804L + "'", long14 == 3599804L);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1024");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        int int13 = fixedDateTimeZone4.getOffset((long) 100);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getShortName((long) 97, locale15);
        int int18 = fixedDateTimeZone4.getStandardOffset(57L);
        boolean boolean20 = fixedDateTimeZone4.isStandardOffset(2099900L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.010" + "'", str16, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1025");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        int int11 = fixedDateTimeZone4.getStandardOffset(62L);
        int int13 = fixedDateTimeZone4.getOffset((-88L));
        boolean boolean14 = fixedDateTimeZone4.isFixed();
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = fixedDateTimeZone4.getOffset(readableInstant15);
        long long19 = fixedDateTimeZone4.adjustOffset((long) '4', false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1026");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) (-1.0f));
        long long15 = fixedDateTimeZone4.convertLocalToUTC(2099999L, true);
        java.lang.String str17 = fixedDateTimeZone4.getNameKey((-58L));
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = fixedDateTimeZone4.getOffset(readableInstant18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2099989L + "'", long15 == 2099989L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1027");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        int int10 = fixedDateTimeZone4.getStandardOffset((-101L));
        int int12 = fixedDateTimeZone4.getOffset((long) 35);
        long long14 = fixedDateTimeZone4.nextTransition((long) (short) 10);
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset((-68L));
        java.lang.String str17 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1028");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1029");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone17.getShortName(242L, locale19);
        boolean boolean21 = fixedDateTimeZone4.equals((java.lang.Object) str20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1030");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        long long7 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', false);
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((long) (byte) 10);
        boolean boolean10 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-68L) + "'", long7 == (-68L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1031");
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
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime24);
        java.lang.String str26 = fixedDateTimeZone4.toString();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1032");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) 1);
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) 1, true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-99L) + "'", long9 == (-99L));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1033");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long10 = dateTimeZone1.adjustOffset((long) (short) 10, false);
        long long13 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, false);
        long long15 = dateTimeZone1.convertUTCToLocal((long) (short) 10);
        java.lang.String str17 = dateTimeZone1.getName(32L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long23 = dateTimeZone19.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str24 = dateTimeZone19.getID();
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone19.getOffset(readableInstant25);
        java.lang.String str27 = dateTimeZone19.getID();
        long long29 = dateTimeZone1.getMillisKeepLocal(dateTimeZone19, 35L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-101L) + "'", long13 == (-101L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-101L) + "'", long23 == (-101L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1034");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((long) 97, locale13);
        long long17 = fixedDateTimeZone4.convertLocalToUTC((-38L), false);
        long long19 = fixedDateTimeZone4.nextTransition(2099803L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-48L) + "'", long17 == (-48L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2099803L + "'", long19 == 2099803L);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1035");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        int int11 = fixedDateTimeZone4.getStandardOffset(62L);
        long long13 = fixedDateTimeZone4.convertUTCToLocal((-70L));
        java.lang.String str14 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-60L) + "'", long13 == (-60L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1036");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) ' ', (int) (short) 100);
        java.lang.String str5 = fixedDateTimeZone4.getID();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1037");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        java.lang.String str12 = fixedDateTimeZone4.getShortName((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long17 = fixedDateTimeZone4.convertLocalToUTC(2099900L, true, (-25L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2099890L + "'", long17 == 2099890L);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1038");
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
        long long38 = fixedDateTimeZone4.nextTransition(32L);
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
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1039");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(132L);
        long long15 = fixedDateTimeZone4.adjustOffset((long) 97, true);
        long long18 = fixedDateTimeZone4.adjustOffset((-87L), false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-87L) + "'", long18 == (-87L));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1040");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long8 = fixedDateTimeZone4.convertLocalToUTC((-68L), false, (-10L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-68L), locale10);
        java.lang.String str13 = fixedDateTimeZone4.getNameKey(0L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.previousTransition((-97L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-165L) + "'", long8 == (-165L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.097" + "'", str11, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-97L) + "'", long17 == (-97L));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1041");
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
        java.lang.Class<?> wildcardClass62 = fixedDateTimeZone4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1042");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        long long10 = fixedDateTimeZone4.nextTransition((-4199975L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str17 = fixedDateTimeZone15.getNameKey((long) (byte) 0);
        int int19 = fixedDateTimeZone15.getStandardOffset(100L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long25 = dateTimeZone21.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str26 = dateTimeZone21.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        long long30 = dateTimeZone21.adjustOffset((long) (short) 10, false);
        long long33 = dateTimeZone21.convertLocalToUTC((long) (byte) -1, false);
        long long35 = fixedDateTimeZone15.getMillisKeepLocal(dateTimeZone21, (long) (byte) 100);
        boolean boolean37 = dateTimeZone21.isStandardOffset((long) (short) 0);
        long long40 = dateTimeZone21.adjustOffset((long) (short) -1, true);
        long long43 = dateTimeZone21.adjustOffset((-3600090L), true);
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone21.getName((-2099920L), locale45);
        long long48 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone21, 42L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-4199975L) + "'", long10 == (-4199975L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-101L) + "'", long25 == (-101L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-101L) + "'", long33 == (-101L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-3600090L) + "'", long43 == (-3600090L));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.100" + "'", str46, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-48L) + "'", long48 == (-48L));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1043");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1044");
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
        java.lang.String str66 = fixedDateTimeZone4.toString();
        java.util.Locale locale68 = null;
        java.lang.String str69 = fixedDateTimeZone4.getShortName((-1L), locale68);
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "+00:00:00.010" + "'", str69, "+00:00:00.010");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1045");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 100L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        long long18 = fixedDateTimeZone4.convertLocalToUTC(35L, true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone23 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str25 = fixedDateTimeZone23.getNameKey(10L);
        boolean boolean27 = fixedDateTimeZone23.equals((java.lang.Object) 0.0d);
        java.lang.String str29 = fixedDateTimeZone23.getName((long) (byte) -1);
        java.util.TimeZone timeZone30 = fixedDateTimeZone23.toTimeZone();
        long long32 = fixedDateTimeZone23.previousTransition((long) 1);
        boolean boolean33 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone23);
        int int35 = fixedDateTimeZone23.getOffsetFromLocal(10L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone23);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-62L) + "'", long18 == (-62L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.010" + "'", str29, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1046");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone6 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str8 = fixedDateTimeZone6.getNameKey((long) (byte) 0);
        long long10 = fixedDateTimeZone6.previousTransition((long) '#');
        int int12 = fixedDateTimeZone6.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean15 = fixedDateTimeZone6.equals((java.lang.Object) "UTC");
        java.lang.String str16 = fixedDateTimeZone6.getID();
        java.lang.String str17 = fixedDateTimeZone6.toString();
        java.lang.String str18 = fixedDateTimeZone6.getID();
        int int20 = fixedDateTimeZone6.getOffsetFromLocal((-111L));
        long long22 = fixedDateTimeZone6.convertUTCToLocal((-80L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str29 = fixedDateTimeZone27.getNameKey(10L);
        boolean boolean31 = fixedDateTimeZone27.equals((java.lang.Object) 0.0d);
        long long33 = fixedDateTimeZone27.convertUTCToLocal((-48L));
        long long36 = fixedDateTimeZone27.convertLocalToUTC((-101L), true);
        java.lang.String str38 = fixedDateTimeZone27.getName((-97L));
        org.joda.time.ReadableInstant readableInstant39 = null;
        int int40 = fixedDateTimeZone27.getOffset(readableInstant39);
        long long42 = fixedDateTimeZone6.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone27, (-11L));
        int int44 = fixedDateTimeZone6.getStandardOffset((-11L));
        long long46 = dateTimeZone1.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone6, 96L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-70L) + "'", long22 == (-70L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-38L) + "'", long33 == (-38L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-111L) + "'", long36 == (-111L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.010" + "'", str38, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-11L) + "'", long42 == (-11L));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 86L + "'", long46 == 86L);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1047");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((long) 1, locale9);
        java.lang.String str12 = dateTimeZone1.getShortName((-111L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str14 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1048");
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
        long long34 = fixedDateTimeZone4.nextTransition(1L);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        long long38 = dateTimeZone35.convertLocalToUTC((long) 1, false);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone35.getName(1L, locale40);
        org.joda.time.LocalDateTime localDateTime42 = null;
        boolean boolean43 = dateTimeZone35.isLocalDateTimeGap(localDateTime42);
        java.lang.Class<?> wildcardClass44 = dateTimeZone35.getClass();
        boolean boolean45 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone35);
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Coordinated Universal Time" + "'", str41, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1049");
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
        long long23 = fixedDateTimeZone4.nextTransition((long) (short) -1);
        long long25 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.010" + "'", str21, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1050");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset((long) (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1051");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(132L);
        long long15 = fixedDateTimeZone4.adjustOffset((long) 97, true);
        java.lang.String str17 = fixedDateTimeZone4.getName((-28799868L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1052");
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
        java.lang.String str30 = fixedDateTimeZone13.getName((-9L), locale29);
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1053");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 35, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getShortName((-2099999L));
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertUTCToLocal((-3659913L));
        java.lang.String str11 = fixedDateTimeZone4.getNameKey(157L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3659878L) + "'", long9 == (-3659878L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1054");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getName((-68L), locale6);
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-97L));
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset(2099900L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org/joda/time/tz/data" + "'", str9, "org/joda/time/tz/data");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1055");
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
        long long22 = fixedDateTimeZone4.previousTransition(86L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-10L) + "'", long20 == (-10L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 86L + "'", long22 == 86L);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1056");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.nextTransition((long) (short) 0);
        int int11 = fixedDateTimeZone4.getOffsetFromLocal((-20L));
        long long13 = fixedDateTimeZone4.previousTransition((long) '4');
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1057");
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
        java.lang.Class<?> wildcardClass18 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1058");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str12 = dateTimeZone7.getID();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (byte) 1);
        long long17 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone1.isLocalDateTimeGap(localDateTime18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone1.getOffset(readableInstant20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-101L) + "'", long17 == (-101L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1059");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.lang.String str15 = fixedDateTimeZone4.toString();
        long long17 = fixedDateTimeZone4.convertUTCToLocal(15L);
        long long21 = fixedDateTimeZone4.convertLocalToUTC(40L, true, 40L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 25L + "'", long17 == 25L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 30L + "'", long21 == 30L);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1060");
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
        boolean boolean28 = fixedDateTimeZone4.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1061");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str17 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1062");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "hi!", (int) '4', (int) '#');
        long long7 = fixedDateTimeZone4.convertLocalToUTC((-97L), true);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-149L) + "'", long7 == (-149L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1063");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.nextTransition((long) (short) 0);
        long long11 = fixedDateTimeZone4.previousTransition((-36060038L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-36060038L) + "'", long11 == (-36060038L));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1064");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        java.lang.String str20 = fixedDateTimeZone4.getName((-38L));
        long long22 = fixedDateTimeZone4.nextTransition((long) (short) 0);
        boolean boolean24 = fixedDateTimeZone4.isStandardOffset((-107L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1065");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) ' ', (int) (short) 100);
        long long6 = fixedDateTimeZone4.previousTransition((-158L));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        boolean boolean9 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-158L) + "'", long6 == (-158L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1066");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        int int14 = fixedDateTimeZone4.getOffset((long) '4');
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        java.lang.String str17 = fixedDateTimeZone4.toString();
        boolean boolean19 = fixedDateTimeZone4.equals((java.lang.Object) (-4L));
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1067");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        long long7 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str14 = fixedDateTimeZone12.getNameKey(10L);
        boolean boolean16 = fixedDateTimeZone12.equals((java.lang.Object) 0.0d);
        int int18 = fixedDateTimeZone12.getStandardOffset((long) (byte) 0);
        java.lang.String str20 = fixedDateTimeZone12.getNameKey((long) (short) 1);
        boolean boolean21 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone12);
        int int23 = fixedDateTimeZone4.getStandardOffset((-171L));
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = fixedDateTimeZone4.getOffset(readableInstant24);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-68L) + "'", long7 == (-68L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1068");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        long long10 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, false, 0L);
        long long13 = dateTimeZone1.convertLocalToUTC((long) '#', true);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-65L) + "'", long13 == (-65L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1069");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (-1));
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1070");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        int int9 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset((-11L));
        long long15 = fixedDateTimeZone4.previousTransition(416L);
        java.util.TimeZone timeZone16 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 416L + "'", long15 == 416L);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1071");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((-10L));
        long long14 = fixedDateTimeZone4.nextTransition((-47L));
        int int16 = fixedDateTimeZone4.getOffset(277L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-47L) + "'", long14 == (-47L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1072");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        int int13 = fixedDateTimeZone4.getOffset((long) 100);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getShortName((long) 97, locale15);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str23 = fixedDateTimeZone21.getNameKey((long) (byte) 0);
        long long25 = fixedDateTimeZone21.previousTransition((long) '#');
        long long27 = fixedDateTimeZone21.nextTransition((long) '4');
        int int29 = fixedDateTimeZone21.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long35 = dateTimeZone31.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str36 = dateTimeZone31.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        boolean boolean39 = dateTimeZone31.isStandardOffset(0L);
        java.lang.String str41 = dateTimeZone31.getShortName((long) (short) 1);
        boolean boolean42 = fixedDateTimeZone21.equals((java.lang.Object) str41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        int int44 = fixedDateTimeZone21.getOffset(readableInstant43);
        boolean boolean45 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.010" + "'", str16, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-101L) + "'", long35 == (-101L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.100" + "'", str36, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.100" + "'", str41, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1073");
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
        long long33 = fixedDateTimeZone29.previousTransition(87L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone38 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str40 = fixedDateTimeZone38.getNameKey((long) (byte) 0);
        long long42 = fixedDateTimeZone38.previousTransition((long) '#');
        long long44 = fixedDateTimeZone38.nextTransition((long) '4');
        int int46 = fixedDateTimeZone38.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long52 = dateTimeZone48.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str53 = dateTimeZone48.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone48);
        boolean boolean56 = dateTimeZone48.isStandardOffset(0L);
        java.lang.String str58 = dateTimeZone48.getShortName((long) (short) 1);
        boolean boolean59 = fixedDateTimeZone38.equals((java.lang.Object) str58);
        long long63 = fixedDateTimeZone38.convertLocalToUTC((-10L), false, (long) (byte) 100);
        java.lang.String str65 = fixedDateTimeZone38.getNameKey((long) (short) 0);
        java.util.TimeZone timeZone66 = fixedDateTimeZone38.toTimeZone();
        long long68 = fixedDateTimeZone29.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone38, (long) 1);
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 87L + "'", long33 == 87L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 35L + "'", long42 == 35L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 52L + "'", long44 == 52L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-101L) + "'", long52 == (-101L));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+00:00:00.100" + "'", str53, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00:00.100" + "'", str58, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-20L) + "'", long63 == (-20L));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(timeZone66);
        org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 88L + "'", long68 == 88L);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1074");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 100L);
        long long17 = fixedDateTimeZone4.convertLocalToUTC((-109L), false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-206L) + "'", long17 == (-206L));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1075");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 100L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        long long18 = fixedDateTimeZone4.convertLocalToUTC(35L, true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone23 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str25 = fixedDateTimeZone23.getNameKey(10L);
        boolean boolean27 = fixedDateTimeZone23.equals((java.lang.Object) 0.0d);
        java.lang.String str29 = fixedDateTimeZone23.getName((long) (byte) -1);
        java.util.TimeZone timeZone30 = fixedDateTimeZone23.toTimeZone();
        long long32 = fixedDateTimeZone23.previousTransition((long) 1);
        boolean boolean33 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone23);
        java.lang.String str34 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-62L) + "'", long18 == (-62L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.010" + "'", str29, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1076");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1077");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.032", "+00:35", (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1078");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str12 = dateTimeZone7.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        java.lang.Class<?> wildcardClass14 = dateTimeZone7.getClass();
        boolean boolean15 = fixedDateTimeZone4.equals((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest2.test1079");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+10:01", "-01:10", (int) 'a', 0);
    }
}

