package org.joda.time.tz;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixedDateTimeZoneRegressionTest0 {

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
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0002");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Class<?> wildcardClass1 = strSet0.getClass();
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0004");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0005");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Class<?> wildcardClass1 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0006");
        java.lang.String str0 = org.joda.time.DateTimeZone.DEFAULT_TZ_DATA_PATH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org/joda/time/tz/data" + "'", str0, "org/joda/time/tz/data");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0008");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0009");
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
        java.lang.Class<?> wildcardClass25 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-101L) + "'", long22 == (-101L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0010");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0011");
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
        long long31 = fixedDateTimeZone4.convertUTCToLocal((long) '4');
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 62L + "'", long31 == 62L);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0012");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long4 = dateTimeZone1.convertLocalToUTC((long) (short) 1, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4 == (-99L));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0013");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0014");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = fixedDateTimeZone4.getName((-48L), locale12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.010" + "'", str13, "+00:00:00.010");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0015");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((long) 1, locale9);
        long long14 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, (long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0016");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, (long) ' ');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-58L) + "'", long14 == (-58L));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0017");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
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
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Coordinated Universal Time' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0019");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = fixedDateTimeZone4.getOffset(readableInstant17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0020");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0021");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone16 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0022");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str12 = dateTimeZone7.getID();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (byte) 1);
        long long17 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        java.lang.Class<?> wildcardClass18 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-101L) + "'", long17 == (-101L));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0023");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0024");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        long long14 = fixedDateTimeZone4.previousTransition((long) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0025");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str12 = dateTimeZone7.getID();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (byte) 1);
        java.lang.Class<?> wildcardClass15 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0026");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0027");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0028");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str12 = dateTimeZone7.getID();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (byte) 1);
        long long17 = dateTimeZone1.convertLocalToUTC((long) '4', false);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName((long) ' ', locale19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone21, (long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-48L) + "'", long17 == (-48L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
// flaky "1) test0028(org.joda.time.tz.FixedDateTimeZoneRegressionTest0)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0029");
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
        long long26 = dateTimeZone1.convertUTCToLocal(100L);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 200L + "'", long26 == 200L);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0030");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.lang.Class<?> wildcardClass1 = nameProvider0.getClass();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0031");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0032");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.convertUTCToLocal(0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0033");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0034");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0035");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+01:00", 10, (int) (byte) 10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0036");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long10 = dateTimeZone1.adjustOffset((long) (short) 10, false);
        long long13 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, false);
        long long15 = dateTimeZone1.convertUTCToLocal((long) (short) 10);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone1.getName((long) (byte) 1, locale17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-101L) + "'", long13 == (-101L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0037");
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
        long long27 = dateTimeZone0.convertUTCToLocal(32L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-11L) + "'", long25 == (-11L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("org/joda/time/tz/data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'org/joda/time/tz/data' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0039");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        long long14 = fixedDateTimeZone4.adjustOffset((long) 'a', false);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0040");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0041");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((-3600090L));
        long long12 = fixedDateTimeZone4.previousTransition((long) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0042");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass13 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0043");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0044");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (byte) 0, locale3);
        java.lang.String str6 = dateTimeZone1.getShortName(32L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:00" + "'", str2, "+01:00");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0046");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-101L), true);
        int int15 = fixedDateTimeZone4.getOffset((long) (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-111L) + "'", long13 == (-111L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0049");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long4 = dateTimeZone1.adjustOffset((long) 100, true);
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'a', false);
        boolean boolean9 = dateTimeZone1.isStandardOffset(32L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
// flaky "2) test0049(org.joda.time.tz.FixedDateTimeZoneRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
// flaky "1) test0049(org.joda.time.tz.FixedDateTimeZoneRegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0050");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        int int17 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        long long10 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, false, 0L);
        java.lang.String str11 = dateTimeZone1.toString();
        long long14 = dateTimeZone1.adjustOffset((-11L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-11L) + "'", long14 == (-11L));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0052");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0053");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str8 = fixedDateTimeZone4.toString();
        long long10 = fixedDateTimeZone4.previousTransition(132L);
        java.lang.Class<?> wildcardClass11 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 132L + "'", long10 == 132L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0054");
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
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone1.getShortName((-101L), locale21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0055");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getNameKey((long) 2100000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0056");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (byte) 1);
        java.lang.String str4 = dateTimeZone2.getShortName(10L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:01" + "'", str4, "+10:01");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0057");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 1);
        long long5 = dateTimeZone2.adjustOffset((-1L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0058");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset((-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0059");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal(62L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0060");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.097", (int) (byte) 10, 1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0061");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
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
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0062");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0063");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 35);
        long long4 = dateTimeZone2.convertUTCToLocal((-1L));
        long long8 = dateTimeZone2.convertLocalToUTC((long) (short) 1, true, (-28799903L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2099999L + "'", long4 == 2099999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2099999L) + "'", long8 == (-2099999L));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0065");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "+00:00:00.035", (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0066");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) (short) -1, (-4200000));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0067");
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
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone27.getID();
        java.lang.String str30 = dateTimeZone27.getShortName((-111L));
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone27, (long) 100);
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
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0068");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0069");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean13 = fixedDateTimeZone4.equals((java.lang.Object) "UTC");
        java.lang.String str14 = fixedDateTimeZone4.getID();
        java.lang.String str16 = fixedDateTimeZone4.getNameKey((-68L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0070");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        long long10 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, false, 0L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str17 = fixedDateTimeZone15.getNameKey(10L);
        java.util.TimeZone timeZone18 = fixedDateTimeZone15.toTimeZone();
        java.util.Locale locale20 = null;
        java.lang.String str21 = fixedDateTimeZone15.getShortName((long) '#', locale20);
        java.lang.String str22 = fixedDateTimeZone15.getID();
        long long24 = dateTimeZone1.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) (byte) 0);
        java.util.Locale locale26 = null;
        java.lang.String str27 = fixedDateTimeZone15.getShortName((long) (short) 100, locale26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.010" + "'", str21, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 90L + "'", long24 == 90L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.010" + "'", str27, "+00:00:00.010");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0071");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        long long9 = dateTimeZone0.adjustOffset((long) '4', true);
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) -1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getShortName((-99L), locale13);
        long long16 = dateTimeZone0.convertUTCToLocal((-2099999L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-2099999L) + "'", long16 == (-2099999L));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0072");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str11 = dateTimeZone1.getShortName((long) (short) 1);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0073");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        java.lang.String str8 = dateTimeZone0.getShortName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0074");
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
        int int26 = fixedDateTimeZone4.getOffset(242L);
        java.util.Locale locale28 = null;
        java.lang.String str29 = fixedDateTimeZone4.getName((-2099999L), locale28);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.010" + "'", str29, "+00:00:00.010");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0075");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        long long9 = dateTimeZone0.adjustOffset((long) '4', true);
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) -1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getShortName((-99L), locale13);
        java.lang.Class<?> wildcardClass15 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0076");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        long long20 = fixedDateTimeZone4.nextTransition((-179L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-179L) + "'", long20 == (-179L));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0077");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0078");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(132L);
        long long15 = fixedDateTimeZone4.adjustOffset((long) 97, true);
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0079");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.lang.String str15 = fixedDateTimeZone4.toString();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0080");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.lang.Class<?> wildcardClass7 = nameProvider0.getClass();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0081");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str11 = dateTimeZone1.getShortName((long) (short) 1);
        long long14 = dateTimeZone1.convertLocalToUTC((-10L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-110L) + "'", long14 == (-110L));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0082");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long15 = fixedDateTimeZone4.convertLocalToUTC(35L, false);
        int int17 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 25L + "'", long15 == 25L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0083");
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
        java.lang.Class<?> wildcardClass30 = dateTimeZone10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0084");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-01:00", "-00:00:00.001", (int) ' ', 10);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0085");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0086");
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
        long long28 = fixedDateTimeZone4.convertLocalToUTC(97L, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2099989L + "'", long15 == 2099989L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-101L) + "'", long23 == (-101L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-179L) + "'", long25 == (-179L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 87L + "'", long28 == 87L);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0087");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        java.lang.String str12 = fixedDateTimeZone4.getShortName((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getShortName((long) (byte) 0, locale15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.010" + "'", str16, "+00:00:00.010");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0088");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        long long12 = fixedDateTimeZone4.nextTransition(0L);
        java.lang.String str13 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0089");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.Class<?> wildcardClass3 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky "3) test0089(org.joda.time.tz.FixedDateTimeZoneRegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0090");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 100L);
        java.lang.String str16 = fixedDateTimeZone4.getName(200L);
        java.lang.String str17 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.097" + "'", str16, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0091");
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
        long long27 = fixedDateTimeZone16.previousTransition((long) (short) -1);
        java.lang.Class<?> wildcardClass28 = fixedDateTimeZone16.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-11L) + "'", long25 == (-11L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0092");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0093");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        int int13 = fixedDateTimeZone4.getOffset((long) 100);
        java.lang.String str14 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0094");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) (-1.0f));
        long long15 = fixedDateTimeZone4.convertLocalToUTC(2099999L, true);
        int int17 = fixedDateTimeZone4.getOffset((-99L));
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = fixedDateTimeZone4.getOffset(readableInstant18);
        java.util.TimeZone timeZone20 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
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
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0095");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long8 = fixedDateTimeZone4.convertLocalToUTC((-68L), false, (-10L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-68L), locale10);
        long long13 = fixedDateTimeZone4.convertUTCToLocal((-2099910L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-165L) + "'", long8 == (-165L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.097" + "'", str11, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2099813L) + "'", long13 == (-2099813L));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0096");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0098");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        long long15 = fixedDateTimeZone4.previousTransition((-179L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-179L) + "'", long15 == (-179L));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0099");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-4200000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -4200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0100");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+01:00", "+00:00:00.035", 35, (-1));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0101");
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
        long long28 = fixedDateTimeZone4.previousTransition(122L);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 122L + "'", long28 == 122L);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0102");
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
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone3.getName((long) 'a', locale29);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0103");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = fixedDateTimeZone4.getOffset(readableInstant16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0104");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        long long6 = fixedDateTimeZone4.previousTransition(110L);
        boolean boolean8 = fixedDateTimeZone4.isStandardOffset((-38L));
        int int10 = fixedDateTimeZone4.getOffset(96L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0105");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(132L);
        long long15 = fixedDateTimeZone4.adjustOffset((long) 97, true);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str18 = fixedDateTimeZone4.getShortName(1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0106");
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
        long long28 = fixedDateTimeZone4.nextTransition((-11L));
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-11L) + "'", long28 == (-11L));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0107");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.nextTransition((-111L));
        java.lang.String str19 = fixedDateTimeZone4.getNameKey((long) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111L) + "'", long17 == (-111L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0108");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-101L), true);
        long long15 = fixedDateTimeZone4.previousTransition(100L);
        long long19 = fixedDateTimeZone4.convertLocalToUTC(122L, false, (-110L));
        java.lang.String str21 = fixedDateTimeZone4.getNameKey((long) (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-111L) + "'", long13 == (-111L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 112L + "'", long19 == 112L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0109");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long4 = dateTimeZone1.convertLocalToUTC((long) 97, false);
        long long6 = dateTimeZone1.convertUTCToLocal((-97L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 96L + "'", long4 == 96L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-96L) + "'", long6 == (-96L));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0110");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0111");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        boolean boolean17 = fixedDateTimeZone4.isFixed();
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getName(87L, locale19);
        java.lang.String str21 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0112");
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
        boolean boolean29 = fixedDateTimeZone4.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0113");
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
        int int31 = fixedDateTimeZone16.getOffset((-10L));
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0114");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        long long14 = fixedDateTimeZone4.adjustOffset((long) 'a', false);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        long long17 = fixedDateTimeZone4.nextTransition(200L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 200L + "'", long17 == 200L);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0115");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.lang.String str15 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0116");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 0, false);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((-91L), true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-10L) + "'", long13 == (-10L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-101L) + "'", long16 == (-101L));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0117");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-00:00:00.001");
        long long4 = dateTimeZone1.adjustOffset(132L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 132L + "'", long4 == 132L);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0118");
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
        long long22 = fixedDateTimeZone4.adjustOffset((long) (-4200000), true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-4200000L) + "'", long22 == (-4200000L));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0119");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-4200000), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -4200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0120");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 0, false);
        long long17 = fixedDateTimeZone4.convertLocalToUTC(52L, false, (long) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-10L) + "'", long13 == (-10L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 42L + "'", long17 == 42L);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0121");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0122");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        long long10 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, false, 0L);
        java.lang.String str11 = dateTimeZone1.toString();
        java.lang.Class<?> wildcardClass12 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0123");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        long long17 = fixedDateTimeZone4.nextTransition(62L);
        long long20 = fixedDateTimeZone4.adjustOffset(97L, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 62L + "'", long17 == 62L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0124");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str12 = dateTimeZone7.getID();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (byte) 1);
        long long17 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        long long20 = dateTimeZone1.convertLocalToUTC((-111L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-101L) + "'", long17 == (-101L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-211L) + "'", long20 == (-211L));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0125");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0127");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        long long7 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getShortName((-1L), locale9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = fixedDateTimeZone4.getShortName((-3L), locale12);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((-10L), false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-97L) + "'", long7 == (-97L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.097" + "'", str10, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.097" + "'", str13, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-107L) + "'", long16 == (-107L));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0128");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "hi!", (int) '4', (int) '#');
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0129");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "UTC", 35, (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0130");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0131");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        long long10 = fixedDateTimeZone4.convertUTCToLocal(287L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 384L + "'", long10 == 384L);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0132");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((-165L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0133");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset((long) (short) -1);
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((long) 1);
        long long17 = fixedDateTimeZone4.convertLocalToUTC(25L, false, (long) '4');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 15L + "'", long17 == 15L);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0134");
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
        int int23 = fixedDateTimeZone4.getOffset((-234L));
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0135");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-48L));
        int int11 = fixedDateTimeZone4.getOffset((long) 'a');
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0136");
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
        long long22 = dateTimeZone1.convertLocalToUTC(112L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 12L + "'", long22 == 12L);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0137");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0138");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2100000, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 2100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0139");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
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
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0140");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.String str10 = dateTimeZone1.getShortName(32L);
        java.lang.String str12 = dateTimeZone1.getShortName(90L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0141");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str8 = fixedDateTimeZone4.toString();
        java.lang.Class<?> wildcardClass9 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0142");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        int int13 = fixedDateTimeZone4.getOffset((long) 100);
        boolean boolean14 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0143");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0144");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getShortName((long) (short) -1, locale9);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((long) '#');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0145");
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
        java.util.TimeZone timeZone39 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.010" + "'", str36, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0146");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        long long3 = dateTimeZone1.convertUTCToLocal((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0147");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str12 = dateTimeZone7.getID();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (byte) 1);
        long long17 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        long long23 = dateTimeZone1.convertLocalToUTC(12L, false, 2099999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-101L) + "'", long17 == (-101L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-88L) + "'", long23 == (-88L));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0148");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str8 = fixedDateTimeZone4.toString();
        long long10 = fixedDateTimeZone4.previousTransition(132L);
        boolean boolean11 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 132L + "'", long10 == 132L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0149");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(132L);
        long long14 = fixedDateTimeZone4.convertUTCToLocal((long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 110L + "'", long14 == 110L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0150");
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
        long long34 = fixedDateTimeZone4.nextTransition((long) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0151");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getShortName((long) (short) -1, locale9);
        int int12 = fixedDateTimeZone4.getOffset(42L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0152");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        long long18 = fixedDateTimeZone4.convertLocalToUTC((-58L), true, 200L);
        java.lang.Class<?> wildcardClass19 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-68L) + "'", long18 == (-68L));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0153");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((long) 1, locale9);
        java.lang.String str12 = dateTimeZone1.getShortName((-111L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName(0L, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0154");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0155");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) (-1.0f));
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0156");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0157");
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
        int int28 = fixedDateTimeZone4.getStandardOffset((long) 10);
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
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0158");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long12 = fixedDateTimeZone4.previousTransition((long) '4');
        java.lang.Class<?> wildcardClass13 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0159");
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
        long long26 = fixedDateTimeZone4.convertLocalToUTC(97L, false, (-107L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-68L) + "'", long18 == (-68L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 242L + "'", long20 == 242L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-89L) + "'", long22 == (-89L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 87L + "'", long26 == 87L);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0160");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        boolean boolean9 = fixedDateTimeZone4.isFixed();
        java.lang.Class<?> wildcardClass10 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0161");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        int int10 = fixedDateTimeZone4.getStandardOffset((-101L));
        int int12 = fixedDateTimeZone4.getOffset((long) 35);
        long long14 = fixedDateTimeZone4.nextTransition((long) (short) 10);
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset((-68L));
        java.util.TimeZone timeZone17 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = fixedDateTimeZone4.getOffset(readableInstant18);
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0162");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.toString();
        int int11 = fixedDateTimeZone4.getStandardOffset((-4200097L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0163");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "hi!", (int) (short) -1, (int) (short) -1);
        long long6 = fixedDateTimeZone4.previousTransition((-21L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-21L) + "'", long6 == (-21L));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0164");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) ' ', (int) (short) 100);
        int int6 = fixedDateTimeZone4.getOffset(287L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0165");
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
        long long26 = fixedDateTimeZone4.convertLocalToUTC((-99L), true, (-2099813L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-68L) + "'", long18 == (-68L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 242L + "'", long20 == 242L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-89L) + "'", long22 == (-89L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-109L) + "'", long26 == (-109L));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0166");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((long) ' ');
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getName((long) (short) 100, locale10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0167");
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
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
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
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0168");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 100L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str18 = fixedDateTimeZone4.getShortName(112L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.097" + "'", str18, "+00:00:00.097");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0169");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long8 = fixedDateTimeZone4.convertLocalToUTC((-68L), false, (-10L));
        boolean boolean9 = fixedDateTimeZone4.isFixed();
        java.lang.Class<?> wildcardClass10 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-165L) + "'", long8 == (-165L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0170");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0171");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        long long14 = fixedDateTimeZone4.convertLocalToUTC((-4200000L), false, 0L);
        long long17 = fixedDateTimeZone4.adjustOffset(10L, true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4200097L) + "'", long14 == (-4200097L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0172");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        int int12 = fixedDateTimeZone4.getOffset((-68L));
        int int14 = fixedDateTimeZone4.getOffset((-4200000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0173");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0174");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long6 = fixedDateTimeZone4.previousTransition((long) (byte) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0175");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.Class<?> wildcardClass17 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0176");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) (byte) -1);
        java.lang.String str4 = dateTimeZone0.getName((long) (byte) 100);
        java.lang.String str6 = dateTimeZone0.getShortName((-91L));
        long long9 = dateTimeZone0.adjustOffset((-38L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-38L) + "'", long9 == (-38L));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0177");
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
        java.util.TimeZone timeZone26 = fixedDateTimeZone16.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-11L) + "'", long25 == (-11L));
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0178");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        int int9 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        int int11 = fixedDateTimeZone4.getOffset((-38L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0179");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(132L);
        long long15 = fixedDateTimeZone4.adjustOffset((long) 97, true);
        java.lang.String str17 = fixedDateTimeZone4.getShortName(0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0180");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = fixedDateTimeZone4.getOffset(readableInstant5);
        long long8 = fixedDateTimeZone4.nextTransition(2099999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2099999L + "'", long8 == 2099999L);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0181");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (byte) 0, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((-10L), locale6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:00" + "'", str7, "-01:00");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0182");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
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
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0183");
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
        java.lang.String str20 = fixedDateTimeZone4.getName(384L, locale19);
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
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0184");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        int int11 = fixedDateTimeZone4.getStandardOffset(62L);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        java.lang.String str14 = fixedDateTimeZone4.getName((-58L));
        java.lang.String str15 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0185");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (byte) 0);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((long) (short) 1);
        java.lang.String str14 = fixedDateTimeZone4.getNameKey((long) (-4200000));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0186");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (byte) 0);
        java.lang.String str12 = fixedDateTimeZone4.getName((-99L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0187");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((long) ' ');
        long long10 = fixedDateTimeZone4.previousTransition(35L);
        boolean boolean11 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0188");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long8 = fixedDateTimeZone4.convertLocalToUTC((-68L), false, (-10L));
        long long10 = fixedDateTimeZone4.previousTransition(147L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-165L) + "'", long8 == (-165L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 147L + "'", long10 == 147L);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0189");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.toString();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName(0L, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.100" + "'", str3, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0190");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.035");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0191");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0192");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "UTC", (int) (byte) 10, (int) (byte) -1);
        java.lang.String str5 = fixedDateTimeZone4.getID();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0193");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0194");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        long long8 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone6, (-11L));
        long long11 = fixedDateTimeZone4.adjustOffset((-10L), false);
        long long13 = fixedDateTimeZone4.previousTransition(100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-11L) + "'", long8 == (-11L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-10L) + "'", long11 == (-10L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0195");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        int int12 = fixedDateTimeZone4.getOffset((-68L));
        long long14 = fixedDateTimeZone4.nextTransition((-99L));
        java.lang.String str15 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-99L) + "'", long14 == (-99L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0196");
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
        long long43 = fixedDateTimeZone4.previousTransition(132L);
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
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 132L + "'", long43 == 132L);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0197");
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
        boolean boolean58 = fixedDateTimeZone32.isStandardOffset((-58L));
        int int60 = fixedDateTimeZone32.getOffsetFromLocal((-48L));
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0198");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 2100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0199");
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
        int int23 = fixedDateTimeZone4.getStandardOffset(0L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = fixedDateTimeZone4.getShortName(2099999L, locale25);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2099999L + "'", long18 == 2099999L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2100000 + "'", int20 == 2100000);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.010" + "'", str26, "+00:00:00.010");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0200");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long13 = fixedDateTimeZone4.previousTransition(90L);
        java.lang.String str15 = fixedDateTimeZone4.getShortName(32L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 90L + "'", long13 == 90L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0201");
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
        long long51 = dateTimeZone3.convertLocalToUTC((long) 97, true);
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
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-3L) + "'", long51 == (-3L));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0202");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-00:00:00.001", "+00:00:00.010", (int) (byte) 1, 1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0203");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        java.lang.String str20 = fixedDateTimeZone4.getName((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone22.getName((long) (byte) 0, locale24);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long31 = dateTimeZone27.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str32 = dateTimeZone27.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        boolean boolean35 = dateTimeZone27.isStandardOffset(0L);
        java.lang.String str37 = dateTimeZone27.getShortName((long) (short) 1);
        long long41 = dateTimeZone27.convertLocalToUTC(1L, true, 62L);
        long long43 = dateTimeZone22.getMillisKeepLocal(dateTimeZone27, (-62L));
        boolean boolean44 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-01:00" + "'", str25, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-101L) + "'", long31 == (-101L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.100" + "'", str37, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-99L) + "'", long41 == (-99L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-3600162L) + "'", long43 == (-3600162L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0204");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        long long7 = fixedDateTimeZone4.convertLocalToUTC((long) 97, false);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 87L + "'", long7 == 87L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0205");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long4 = dateTimeZone1.convertLocalToUTC(12L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-88L) + "'", long4 == (-88L));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0206");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0207");
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
        java.util.TimeZone timeZone39 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale41 = null;
        java.lang.String str42 = fixedDateTimeZone4.getName((long) 100, locale41);
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
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.010" + "'", str42, "+00:00:00.010");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0208");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0209");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = fixedDateTimeZone4.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getShortName((long) 100, locale8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.097" + "'", str9, "+00:00:00.097");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0210");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 1);
        long long6 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (-65L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-60065L) + "'", long6 == (-60065L));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0211");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        int int11 = fixedDateTimeZone4.getStandardOffset(62L);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        java.lang.String str14 = fixedDateTimeZone4.getName((-58L));
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        long long18 = fixedDateTimeZone4.adjustOffset((long) '#', false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0212");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        int int18 = fixedDateTimeZone4.getOffset(35L);
        java.lang.String str19 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0213");
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
        long long32 = fixedDateTimeZone4.previousTransition(25L);
        java.lang.String str33 = fixedDateTimeZone4.getID();
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 25L + "'", long32 == 25L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0214");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str10 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0215");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((long) 97, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getName((-2099999L), locale16);
        long long19 = fixedDateTimeZone4.convertUTCToLocal(100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0216");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0217");
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
        long long24 = fixedDateTimeZone4.nextTransition((-65L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2099989L + "'", long15 == 2099989L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-10L) + "'", long22 == (-10L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-65L) + "'", long24 == (-65L));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0218");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(242L, locale3);
        long long8 = dateTimeZone1.convertLocalToUTC((-3659913L), true, 3599901L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3659913L) + "'", long8 == (-3659913L));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0219");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone0.getOffset(readableInstant7);
        java.lang.String str10 = dateTimeZone0.getName(1L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coordinated Universal Time" + "'", str10, "Coordinated Universal Time");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0220");
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
        long long59 = fixedDateTimeZone4.convertUTCToLocal((long) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 11L + "'", long59 == 11L);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0221");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getShortName((long) '#', locale9);
        boolean boolean11 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0222");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.lang.String str3 = dateTimeZone1.getName(232L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        java.lang.String str8 = dateTimeZone1.getName((long) 32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.100" + "'", str3, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0223");
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
        java.lang.String str27 = fixedDateTimeZone4.toString();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0224");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        long long6 = fixedDateTimeZone4.previousTransition(110L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0225");
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
        long long29 = fixedDateTimeZone4.convertLocalToUTC(10L, false, (long) (byte) 100);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone34 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str36 = fixedDateTimeZone34.getNameKey((long) (byte) 0);
        java.lang.Class<?> wildcardClass37 = fixedDateTimeZone34.getClass();
        boolean boolean38 = fixedDateTimeZone4.equals((java.lang.Object) wildcardClass37);
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0226");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str3 = dateTimeZone1.toString();
        java.lang.String str5 = dateTimeZone1.getName((-158L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.100" + "'", str3, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0227");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        java.lang.String str12 = fixedDateTimeZone4.getShortName((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str20 = fixedDateTimeZone18.getNameKey(10L);
        boolean boolean22 = fixedDateTimeZone18.equals((java.lang.Object) 0.0d);
        long long24 = fixedDateTimeZone18.convertUTCToLocal((-48L));
        long long27 = fixedDateTimeZone18.convertLocalToUTC((-101L), true);
        long long29 = fixedDateTimeZone18.previousTransition(100L);
        long long33 = fixedDateTimeZone18.convertLocalToUTC(122L, false, (-110L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone38 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str40 = fixedDateTimeZone38.getNameKey((long) (byte) 0);
        int int42 = fixedDateTimeZone38.getStandardOffset(100L);
        boolean boolean43 = fixedDateTimeZone18.equals((java.lang.Object) 100L);
        java.lang.String str45 = fixedDateTimeZone18.getShortName((long) (short) 1);
        boolean boolean46 = fixedDateTimeZone4.equals((java.lang.Object) str45);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-38L) + "'", long24 == (-38L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-111L) + "'", long27 == (-111L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 112L + "'", long33 == 112L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.010" + "'", str45, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0228");
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
        java.lang.String str23 = fixedDateTimeZone4.getName(232L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.097" + "'", str16, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-234L) + "'", long19 == (-234L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.097" + "'", str23, "+00:00:00.097");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0229");
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
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone16);
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
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0230");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        boolean boolean9 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.toString();
        java.lang.String str12 = fixedDateTimeZone4.getName(416L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0231");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset(97L);
        long long15 = fixedDateTimeZone4.previousTransition(0L);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-4199975L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0232");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(97);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0233");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0234");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset(97L);
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-149L));
        java.lang.String str17 = fixedDateTimeZone4.getShortName(1L);
        java.lang.String str18 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0235");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.String str3 = dateTimeZone1.getName(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getName(87L, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.035" + "'", str3, "+00:00:00.035");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.035" + "'", str6, "+00:00:00.035");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0236");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", (int) (byte) -1, 1);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0237");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        long long7 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str14 = fixedDateTimeZone12.getNameKey(10L);
        boolean boolean16 = fixedDateTimeZone12.equals((java.lang.Object) 0.0d);
        int int18 = fixedDateTimeZone12.getStandardOffset((long) (byte) 0);
        java.lang.String str20 = fixedDateTimeZone12.getNameKey((long) (short) 1);
        boolean boolean21 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone12);
        int int23 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-68L) + "'", long7 == (-68L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0238");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        java.lang.String str9 = fixedDateTimeZone4.getID();
        int int11 = fixedDateTimeZone4.getStandardOffset(62L);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        java.lang.String str14 = fixedDateTimeZone4.getName((-58L));
        int int16 = fixedDateTimeZone4.getStandardOffset((-137L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0239");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        int int10 = fixedDateTimeZone4.getStandardOffset((-101L));
        long long12 = fixedDateTimeZone4.nextTransition(25L);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 25L + "'", long12 == 25L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0240");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(97, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0241");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-48L));
        java.util.TimeZone timeZone10 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0242");
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
        int int30 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 0);
        java.lang.String str32 = fixedDateTimeZone4.getNameKey(416L);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0243");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        java.lang.Class<?> wildcardClass11 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0244");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName((long) (byte) 1);
        long long11 = dateTimeZone1.adjustOffset((-179L), false);
        long long14 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-179L) + "'", long11 == (-179L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-90L) + "'", long14 == (-90L));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0245");
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
        java.lang.Class<?> wildcardClass46 = fixedDateTimeZone32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0246");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getName((-68L), locale6);
        int int9 = fixedDateTimeZone4.getOffset((-2099813L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0247");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        long long8 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone6, (-11L));
        int int10 = fixedDateTimeZone4.getStandardOffset(11L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-11L) + "'", long8 == (-11L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0248");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale7 = null;
        java.lang.String str8 = fixedDateTimeZone4.getName((-91L), locale7);
        java.lang.Class<?> wildcardClass9 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.010" + "'", str8, "+00:00:00.010");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0249");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        long long14 = fixedDateTimeZone4.adjustOffset((long) 'a', false);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime15);
        java.lang.String str17 = fixedDateTimeZone4.toString();
        long long20 = fixedDateTimeZone4.adjustOffset((long) 100, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0250");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "+00:00:00.097", (-1), (-4200000));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str11 = fixedDateTimeZone9.getNameKey((long) (byte) 0);
        long long13 = fixedDateTimeZone9.previousTransition((long) '#');
        int int15 = fixedDateTimeZone9.getOffsetFromLocal((long) (short) 10);
        int int17 = fixedDateTimeZone9.getOffset(132L);
        int int19 = fixedDateTimeZone9.getOffsetFromLocal(2099999L);
        long long21 = fixedDateTimeZone9.previousTransition((-179L));
        boolean boolean22 = fixedDateTimeZone4.equals((java.lang.Object) long21);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-179L) + "'", long21 == (-179L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0251");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-48L));
        java.util.TimeZone timeZone10 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((long) '#');
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = fixedDateTimeZone4.getOffset(readableInstant13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0252");
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
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone1.getOffset(readableInstant30);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-3600000) + "'", int31 == (-3600000));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0253");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        java.lang.String str19 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0254");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        java.lang.String str12 = fixedDateTimeZone4.getShortName((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0255");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(10);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0256");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long11 = fixedDateTimeZone4.convertUTCToLocal((long) (byte) 10);
        long long13 = fixedDateTimeZone4.nextTransition((-2099813L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 20L + "'", long11 == 20L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2099813L) + "'", long13 == (-2099813L));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0257");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0258");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        int int13 = fixedDateTimeZone4.getOffset((-2099920L));
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((-4200097L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0259");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        int int14 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long17 = fixedDateTimeZone4.previousTransition(232L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 232L + "'", long17 == 232L);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0260");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "+01:00", (int) '#', (int) '4');
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0261");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0262");
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
        java.lang.String str44 = fixedDateTimeZone4.getName((long) (short) -1);
        long long46 = fixedDateTimeZone4.convertUTCToLocal((-1L));
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
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 9L + "'", long46 == 9L);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0263");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone2.convertLocalToUTC((long) 1, false);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getName(1L, locale7);
        long long11 = dateTimeZone2.adjustOffset((long) '4', true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, 384L);
        java.lang.String str15 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 416L + "'", long14 == 416L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.032" + "'", str15, "+00:00:00.032");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0264");
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
        long long37 = fixedDateTimeZone4.adjustOffset(2099999L, false);
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
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 2099999L + "'", long37 == 2099999L);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0265");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long8 = fixedDateTimeZone4.convertLocalToUTC((-68L), false, (-10L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-68L), locale10);
        java.lang.String str13 = fixedDateTimeZone4.getNameKey(0L);
        int int15 = fixedDateTimeZone4.getOffset((-4200000L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-165L) + "'", long8 == (-165L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.097" + "'", str11, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coordinated Universal Time" + "'", str13, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0266");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:01");
        long long4 = dateTimeZone1.convertLocalToUTC((-38L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-36060038L) + "'", long4 == (-36060038L));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0267");
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
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone61 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str63 = fixedDateTimeZone61.getNameKey((long) (byte) 0);
        long long65 = fixedDateTimeZone61.previousTransition((long) '#');
        long long67 = fixedDateTimeZone61.nextTransition((long) '4');
        long long70 = fixedDateTimeZone61.convertLocalToUTC((long) 0, false);
        boolean boolean71 = fixedDateTimeZone32.equals((java.lang.Object) false);
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 35L + "'", long65 == 35L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 52L + "'", long67 == 52L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-10L) + "'", long70 == (-10L));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0268");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long7 = fixedDateTimeZone4.convertLocalToUTC((-20L), false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-117L) + "'", long7 == (-117L));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0269");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:35", "+01:00", (int) (short) 0, (int) (byte) 1);
        long long7 = fixedDateTimeZone4.adjustOffset((long) 35, false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0270");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str8 = dateTimeZone1.getShortName((long) (byte) 1);
        long long11 = dateTimeZone1.adjustOffset((-179L), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long16 = dateTimeZone1.convertLocalToUTC((-68L), false, 9L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-179L) + "'", long11 == (-179L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-168L) + "'", long16 == (-168L));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0271");
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
        long long35 = dateTimeZone8.convertLocalToUTC((-2099989L), false, (-68L));
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
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1500011L + "'", long35 == 1500011L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0272");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0273");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 100L);
        java.lang.String str16 = dateTimeZone12.getShortName(0L);
        java.lang.String str17 = dateTimeZone12.toString();
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone12.getShortName((-3600162L), locale19);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0274");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        java.lang.String str20 = fixedDateTimeZone4.getName((long) (byte) 100);
        long long24 = fixedDateTimeZone4.convertLocalToUTC(12L, false, (-2099813L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0275");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "+00:00:00.097", (-1), (-4200000));
        java.lang.String str6 = fixedDateTimeZone4.getName((-149L));
        java.lang.String str7 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.010" + "'", str7, "+00:00:00.010");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0276");
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
        long long29 = fixedDateTimeZone4.convertLocalToUTC(10L, false, (long) (byte) 100);
        java.lang.String str31 = fixedDateTimeZone4.getName(57L);
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.010" + "'", str31, "+00:00:00.010");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0277");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset(97L);
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-149L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str22 = fixedDateTimeZone20.getNameKey((long) (byte) 0);
        long long24 = fixedDateTimeZone20.previousTransition((long) '#');
        int int26 = fixedDateTimeZone20.getOffsetFromLocal((long) (short) 10);
        int int28 = fixedDateTimeZone20.getOffset(132L);
        boolean boolean30 = fixedDateTimeZone20.isStandardOffset((-101L));
        boolean boolean31 = fixedDateTimeZone4.equals((java.lang.Object) (-101L));
        long long33 = fixedDateTimeZone4.previousTransition(12L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 12L + "'", long33 == 12L);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0278");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) (byte) -1);
        java.lang.Class<?> wildcardClass3 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0279");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) (byte) -1);
        java.lang.String str4 = dateTimeZone0.getName((long) (byte) 100);
        java.lang.String str6 = dateTimeZone0.getShortName((-91L));
        java.lang.Class<?> wildcardClass7 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0280");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0281");
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
        java.lang.String str36 = fixedDateTimeZone4.getNameKey(1L);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0282");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0283");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0284");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.035", "-00:00:00.001", 100, 100);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0285");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long13 = fixedDateTimeZone4.previousTransition((long) 1);
        java.lang.String str15 = fixedDateTimeZone4.getName((long) 10);
        java.lang.String str17 = fixedDateTimeZone4.getNameKey(11L);
        java.util.TimeZone timeZone18 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0286");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 2100000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 2100000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0287");
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
        java.lang.String str37 = fixedDateTimeZone4.getName((-99L));
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.010" + "'", str37, "+00:00:00.010");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0288");
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
        java.lang.Class<?> wildcardClass32 = fixedDateTimeZone4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0289");
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
        java.lang.Class<?> wildcardClass29 = fixedDateTimeZone4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0290");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 100L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        int int17 = fixedDateTimeZone4.getStandardOffset(87L);
        long long20 = fixedDateTimeZone4.adjustOffset((long) (byte) -1, true);
        long long22 = fixedDateTimeZone4.nextTransition(62L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 62L + "'", long22 == 62L);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0291");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0292");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0293");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+10:01");
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0294");
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
        int int27 = fixedDateTimeZone4.getOffsetFromLocal((-2099910L));
        int int29 = fixedDateTimeZone4.getStandardOffset((-2099813L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2099989L + "'", long15 == 2099989L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-101L) + "'", long23 == (-101L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-179L) + "'", long25 == (-179L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0295");
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
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone32);
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
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0296");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        int int10 = fixedDateTimeZone4.getStandardOffset((-101L));
        int int12 = fixedDateTimeZone4.getOffset((long) 35);
        long long14 = fixedDateTimeZone4.nextTransition((long) (short) 10);
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset((-68L));
        java.lang.String str18 = fixedDateTimeZone4.getNameKey((-96L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0297");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        long long13 = fixedDateTimeZone4.nextTransition((-10L));
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((-158L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-10L) + "'", long13 == (-10L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0298");
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
        java.lang.String str25 = dateTimeZone10.toString();
        boolean boolean27 = dateTimeZone10.isStandardOffset((long) (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-101L) + "'", long22 == (-101L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0299");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        long long12 = dateTimeZone1.adjustOffset(110L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0300");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "hi!", 0, (-4200000));
        java.lang.String str5 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.097" + "'", str5, "+00:00:00.097");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0301");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long7 = fixedDateTimeZone4.previousTransition((long) 35);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0302");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        long long11 = dateTimeZone1.convertUTCToLocal((-101L));
        java.lang.String str13 = dateTimeZone1.getShortName(35L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone1.getName((-4199975L), locale15);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0303");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-48L));
        java.util.TimeZone timeZone10 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str11 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0304");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getShortName((-107L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0305");
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
        long long37 = fixedDateTimeZone4.previousTransition((-3L));
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
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-3L) + "'", long37 == (-3L));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0306");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0307");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        boolean boolean17 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone18 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0308");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-2699989L), true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2699999L) + "'", long13 == (-2699999L));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0309");
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
        long long27 = fixedDateTimeZone4.previousTransition((-88L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2099989L + "'", long15 == 2099989L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-101L) + "'", long23 == (-101L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-179L) + "'", long25 == (-179L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-88L) + "'", long27 == (-88L));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0310");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long19 = fixedDateTimeZone4.convertLocalToUTC(0L, false, 147L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str26 = fixedDateTimeZone24.getNameKey((long) (byte) 0);
        long long28 = fixedDateTimeZone24.previousTransition((long) '#');
        long long30 = fixedDateTimeZone24.nextTransition((long) '4');
        int int32 = fixedDateTimeZone24.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long38 = dateTimeZone34.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str39 = dateTimeZone34.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        boolean boolean42 = dateTimeZone34.isStandardOffset(0L);
        java.lang.String str44 = dateTimeZone34.getShortName((long) (short) 1);
        boolean boolean45 = fixedDateTimeZone24.equals((java.lang.Object) str44);
        long long49 = fixedDateTimeZone24.convertLocalToUTC((-10L), false, (long) (byte) 100);
        java.lang.String str51 = fixedDateTimeZone24.getNameKey((long) (short) 0);
        long long53 = fixedDateTimeZone24.previousTransition((long) (byte) 100);
        java.util.Locale locale55 = null;
        java.lang.String str56 = fixedDateTimeZone24.getShortName((long) (short) 0, locale55);
        boolean boolean57 = fixedDateTimeZone24.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone24);
        long long60 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone24, (-137L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-10L) + "'", long19 == (-10L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-101L) + "'", long38 == (-101L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00:00.100" + "'", str44, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-20L) + "'", long49 == (-20L));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 100L + "'", long53 == 100L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00:00.010" + "'", str56, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-137L) + "'", long60 == (-137L));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0311");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        long long14 = fixedDateTimeZone4.adjustOffset((long) 'a', false);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey((-97L));
        long long20 = fixedDateTimeZone4.convertLocalToUTC((-2099910L), false, (-4200000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-2099920L) + "'", long20 == (-2099920L));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0312");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        long long11 = dateTimeZone1.convertUTCToLocal((-101L));
        long long15 = dateTimeZone1.convertLocalToUTC(35L, false, (long) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-65L) + "'", long15 == (-65L));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0313");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(2100000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0314");
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
        org.joda.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime36);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0315");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "Coordinated Universal Time", (int) 'a', 35);
        long long6 = fixedDateTimeZone4.nextTransition(110L);
        java.lang.String str7 = fixedDateTimeZone4.getID();
        int int9 = fixedDateTimeZone4.getOffsetFromLocal((long) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0316");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:35");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0317");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "hi!", 0, (-4200000));
        long long8 = fixedDateTimeZone4.convertLocalToUTC((-3659913L), false, 287L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str15 = fixedDateTimeZone13.getNameKey((long) (byte) 0);
        long long17 = fixedDateTimeZone13.previousTransition((long) '#');
        long long19 = fixedDateTimeZone13.nextTransition((long) '4');
        int int21 = fixedDateTimeZone13.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long27 = dateTimeZone23.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str28 = dateTimeZone23.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        boolean boolean31 = dateTimeZone23.isStandardOffset(0L);
        java.lang.String str33 = dateTimeZone23.getShortName((long) (short) 1);
        boolean boolean34 = fixedDateTimeZone13.equals((java.lang.Object) str33);
        long long37 = fixedDateTimeZone13.adjustOffset((long) ' ', false);
        long long39 = fixedDateTimeZone13.convertUTCToLocal((-48L));
        java.lang.String str41 = fixedDateTimeZone13.getShortName((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = fixedDateTimeZone13.getOffset(readableInstant42);
        java.lang.String str44 = fixedDateTimeZone13.toString();
        long long46 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3659913L) + "'", long8 == (-3659913L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-101L) + "'", long27 == (-101L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32L + "'", long37 == 32L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-38L) + "'", long39 == (-38L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.010" + "'", str41, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-10L) + "'", long46 == (-10L));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0318");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "hi!", (int) (short) 100, (-3600000));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0319");
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
        long long28 = fixedDateTimeZone16.convertLocalToUTC(157L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-11L) + "'", long25 == (-11L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 147L + "'", long28 == 147L);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0320");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0321");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        int int14 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-4200000L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long20 = fixedDateTimeZone4.convertUTCToLocal((long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 20L + "'", long20 == 20L);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0322");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        long long6 = fixedDateTimeZone4.previousTransition(110L);
        long long9 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getName(122L, locale11);
        boolean boolean14 = fixedDateTimeZone4.isStandardOffset((long) (short) 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = fixedDateTimeZone4.getOffset(readableInstant15);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0323");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((long) (-1));
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName((long) 35, locale10);
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((-4200097L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0324");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.lang.String str4 = dateTimeZone1.getID();
        long long7 = dateTimeZone1.adjustOffset(20L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 20L + "'", long7 == 20L);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0325");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((long) 97, locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getName((-2099999L), locale16);
        long long21 = fixedDateTimeZone4.convertLocalToUTC((long) 1, true, 35L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-9L) + "'", long21 == (-9L));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0326");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 0, false);
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((-144L));
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        long long18 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone16, (long) '4');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-10L) + "'", long13 == (-10L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0327");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0328");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        int int13 = fixedDateTimeZone4.getOffset((long) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        java.lang.String str16 = dateTimeZone15.toString();
        boolean boolean17 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone15);
        java.lang.String str19 = fixedDateTimeZone4.getShortName((-109L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+01:00" + "'", str16, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.010" + "'", str19, "+00:00:00.010");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0329");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long3 = dateTimeZone1.convertUTCToLocal((long) 1);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (byte) -1, true);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((-21L), locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0330");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(87L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 100L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        int int17 = fixedDateTimeZone4.getStandardOffset(87L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getName(42L, locale19);
        java.lang.String str21 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org/joda/time/tz/data" + "'", str10, "org/joda/time/tz/data");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.097" + "'", str20, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0331");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((long) 0, locale16);
        java.lang.String str19 = fixedDateTimeZone4.getNameKey((-20L));
        java.lang.Class<?> wildcardClass20 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0332");
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
        java.util.Locale locale48 = null;
        java.lang.String str49 = dateTimeZone35.getShortName((-28799903L), locale48);
        java.lang.String str51 = dateTimeZone35.getName((-72L));
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.100" + "'", str49, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00:00.100" + "'", str51, "+00:00:00.100");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0333");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        int int9 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset((long) 100);
        long long13 = fixedDateTimeZone4.convertUTCToLocal((long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 96L + "'", long13 == 96L);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0334");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.String str10 = dateTimeZone1.getShortName(32L);
        java.lang.String str11 = dateTimeZone1.getID();
        long long14 = dateTimeZone1.adjustOffset((-2099910L), false);
        long long16 = dateTimeZone1.convertUTCToLocal((-97L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2099910L) + "'", long14 == (-2099910L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0335");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean13 = fixedDateTimeZone4.equals((java.lang.Object) "UTC");
        long long16 = fixedDateTimeZone4.adjustOffset(97L, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0336");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) '4');
        long long5 = dateTimeZone2.adjustOffset((long) (-3600000), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3600000L) + "'", long5 == (-3600000L));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0337");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.nextTransition((-111L));
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (short) 0);
        boolean boolean21 = fixedDateTimeZone4.equals((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass22 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111L) + "'", long17 == (-111L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0338");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.035", "Coordinated Universal Time", (-1), (int) (short) 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0339");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "-00:00:00.001", (int) (byte) 10, (int) 'a');
        java.lang.String str6 = fixedDateTimeZone4.getName((long) (-4200000));
        long long9 = fixedDateTimeZone4.adjustOffset(96L, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.010" + "'", str6, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 96L + "'", long9 == 96L);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0340");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long14 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        long long17 = fixedDateTimeZone4.adjustOffset((-3600090L), true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-11L) + "'", long14 == (-11L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3600090L) + "'", long17 == (-3600090L));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0341");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0342");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str11 = dateTimeZone1.getShortName((long) (short) 1);
        long long15 = dateTimeZone1.convertLocalToUTC(1L, true, 62L);
        java.lang.String str17 = dateTimeZone1.getName(35L);
        long long20 = dateTimeZone1.adjustOffset((-70L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-70L) + "'", long20 == (-70L));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0343");
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
        long long36 = fixedDateTimeZone4.adjustOffset(15L, false);
        int int38 = fixedDateTimeZone4.getOffset(52L);
        java.lang.String str39 = fixedDateTimeZone4.toString();
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
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 15L + "'", long36 == 15L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0344");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.nextTransition((long) (short) 0);
        int int11 = fixedDateTimeZone4.getOffsetFromLocal((-20L));
        long long13 = fixedDateTimeZone4.previousTransition((long) '4');
        int int15 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0345");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((-2699999L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0346");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "", (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0347");
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
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str28 = fixedDateTimeZone26.getNameKey((long) (byte) 0);
        long long30 = fixedDateTimeZone26.previousTransition((long) '#');
        int int32 = fixedDateTimeZone26.getOffsetFromLocal((long) (short) 10);
        long long34 = fixedDateTimeZone26.nextTransition(132L);
        java.lang.String str36 = fixedDateTimeZone26.getName((long) (short) 10);
        java.util.TimeZone timeZone37 = fixedDateTimeZone26.toTimeZone();
        java.util.Locale locale39 = null;
        java.lang.String str40 = fixedDateTimeZone26.getName(110L, locale39);
        boolean boolean42 = fixedDateTimeZone26.isStandardOffset((-99L));
        boolean boolean43 = fixedDateTimeZone4.equals((java.lang.Object) (-99L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35L + "'", long30 == 35L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 132L + "'", long34 == 132L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.010" + "'", str36, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.010" + "'", str40, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0348");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean13 = fixedDateTimeZone4.equals((java.lang.Object) "UTC");
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = fixedDateTimeZone4.getOffset(readableInstant17);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-11L) + "'", long16 == (-11L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0349");
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
        long long31 = fixedDateTimeZone4.convertLocalToUTC(20L, true, (-2099892L));
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0350");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean13 = fixedDateTimeZone4.equals((java.lang.Object) "UTC");
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = fixedDateTimeZone4.getOffset(readableInstant17);
        boolean boolean19 = fixedDateTimeZone4.isFixed();
        long long22 = fixedDateTimeZone4.adjustOffset((-2099910L), true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-11L) + "'", long16 == (-11L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-2099910L) + "'", long22 == (-2099910L));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0351");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.010");
        long long4 = dateTimeZone1.adjustOffset(147L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 147L + "'", long4 == 147L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0352");
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 110L + "'", long30 == 110L);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0353");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0354");
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
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone37 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str39 = fixedDateTimeZone37.getNameKey((long) (byte) 0);
        long long41 = fixedDateTimeZone37.previousTransition((long) '#');
        int int43 = fixedDateTimeZone37.getOffsetFromLocal((long) (short) 10);
        int int45 = fixedDateTimeZone37.getOffset(132L);
        int int47 = fixedDateTimeZone37.getOffset((long) '4');
        int int49 = fixedDateTimeZone37.getOffsetFromLocal((long) (byte) 10);
        long long51 = fixedDateTimeZone37.nextTransition((-97L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone37);
        long long54 = dateTimeZone10.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone37, (long) 1);
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 35L + "'", long41 == 35L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-97L) + "'", long51 == (-97L));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 91L + "'", long54 == 91L);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0355");
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
        long long27 = fixedDateTimeZone4.previousTransition((-4200097L));
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = fixedDateTimeZone4.getOffset(readableInstant28);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-101L) + "'", long22 == (-101L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-4200097L) + "'", long27 == (-4200097L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0356");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        long long7 = fixedDateTimeZone4.convertLocalToUTC((long) 97, false);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getShortName(384L, locale11);
        int int14 = fixedDateTimeZone4.getStandardOffset((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 87L + "'", long7 == 87L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0357");
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
        java.lang.String str32 = dateTimeZone1.getID();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0358");
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
        int int26 = fixedDateTimeZone4.getStandardOffset(0L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str28 = fixedDateTimeZone4.getID();
        java.lang.Class<?> wildcardClass29 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-101L) + "'", long22 == (-101L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0359");
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
        long long27 = fixedDateTimeZone4.previousTransition((-4200097L));
        long long30 = fixedDateTimeZone4.adjustOffset(52L, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-101L) + "'", long22 == (-101L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-4200097L) + "'", long27 == (-4200097L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0360");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.String str10 = dateTimeZone1.getShortName(32L);
        java.lang.String str11 = dateTimeZone1.getID();
        long long14 = dateTimeZone1.adjustOffset((-2099910L), false);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2099910L) + "'", long14 == (-2099910L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0361");
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
        long long25 = fixedDateTimeZone4.convertLocalToUTC(9L, true, (-72L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10L) + "'", long18 == (-10L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0362");
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
        java.lang.String str45 = fixedDateTimeZone30.getShortName(9L);
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.010" + "'", str45, "+00:00:00.010");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0363");
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
        long long34 = dateTimeZone1.adjustOffset((-110L), false);
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-110L) + "'", long34 == (-110L));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0364");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        long long7 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str14 = fixedDateTimeZone12.getNameKey(10L);
        boolean boolean16 = fixedDateTimeZone12.equals((java.lang.Object) 0.0d);
        int int18 = fixedDateTimeZone12.getStandardOffset((long) (byte) 0);
        java.lang.String str20 = fixedDateTimeZone12.getNameKey((long) (short) 1);
        boolean boolean21 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone12);
        int int23 = fixedDateTimeZone4.getOffsetFromLocal((-62L));
        boolean boolean24 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-68L) + "'", long7 == (-68L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0365");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = fixedDateTimeZone4.getName((long) (byte) -1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long13 = fixedDateTimeZone4.previousTransition((long) 1);
        java.lang.String str15 = fixedDateTimeZone4.getName((long) 10);
        java.lang.Class<?> wildcardClass16 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.010" + "'", str15, "+00:00:00.010");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0366");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime6);
        long long9 = fixedDateTimeZone4.convertUTCToLocal((-89L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0367");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((long) 0, locale16);
        boolean boolean18 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0368");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, false);
        boolean boolean15 = fixedDateTimeZone4.isStandardOffset((-38L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getName((-48L), locale17);
        java.lang.String str20 = fixedDateTimeZone4.getShortName(12L);
        long long22 = fixedDateTimeZone4.nextTransition((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0369");
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
        java.lang.String str60 = fixedDateTimeZone32.getName((long) (byte) 0);
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
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:00:00.010" + "'", str60, "+00:00:00.010");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0370");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str17 = fixedDateTimeZone4.getID();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        long long20 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone18, 122L);
        int int22 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 122L + "'", long20 == 122L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0371");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0372");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        long long4 = dateTimeZone1.convertLocalToUTC(90L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-10L) + "'", long4 == (-10L));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0373");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        boolean boolean8 = dateTimeZone1.isStandardOffset((-65L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0374");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0375");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(35);
        java.lang.String str3 = dateTimeZone1.getShortName(12L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.035" + "'", str3, "+00:00:00.035");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0376");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str17 = fixedDateTimeZone4.getID();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        long long20 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone18, 122L);
        java.lang.String str21 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 122L + "'", long20 == 122L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0377");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (-4200000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -4200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0378");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str12 = dateTimeZone7.getID();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (byte) 1);
        long long17 = dateTimeZone1.convertLocalToUTC((long) '4', false);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName((long) ' ', locale19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone1.isLocalDateTimeGap(localDateTime21);
        java.lang.String str23 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-48L) + "'", long17 == (-48L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0379");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str12 = dateTimeZone7.getID();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (byte) 1);
        long long18 = dateTimeZone1.convertLocalToUTC(57L, true, (long) 35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-43L) + "'", long18 == (-43L));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0380");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        boolean boolean17 = fixedDateTimeZone4.isFixed();
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getName(87L, locale19);
        long long24 = fixedDateTimeZone4.convertLocalToUTC((-55L), true, 384L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-65L) + "'", long24 == (-65L));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0381");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getShortName((-4200000L), locale9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0382");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        java.lang.String str11 = dateTimeZone1.getShortName((-234L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0383");
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
        java.lang.String str44 = fixedDateTimeZone4.getName((long) (short) -1);
        org.joda.time.ReadableInstant readableInstant45 = null;
        int int46 = fixedDateTimeZone4.getOffset(readableInstant45);
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0384");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str16 = fixedDateTimeZone4.toString();
        java.lang.String str17 = fixedDateTimeZone4.toString();
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        long long21 = fixedDateTimeZone4.convertUTCToLocal(0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0385");
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
        int int26 = fixedDateTimeZone4.getStandardOffset(0L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone31 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str33 = fixedDateTimeZone31.getNameKey((long) (byte) 0);
        long long35 = fixedDateTimeZone31.previousTransition((long) '#');
        long long37 = fixedDateTimeZone31.nextTransition((long) '4');
        int int39 = fixedDateTimeZone31.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = fixedDateTimeZone31.isLocalDateTimeGap(localDateTime40);
        java.util.TimeZone timeZone42 = fixedDateTimeZone31.toTimeZone();
        boolean boolean43 = fixedDateTimeZone31.isFixed();
        long long45 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone31, 10L);
        long long47 = fixedDateTimeZone31.previousTransition((-3600090L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-101L) + "'", long22 == (-101L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35L + "'", long35 == 35L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-3600090L) + "'", long47 == (-3600090L));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0386");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "hi!", (int) (short) 100, (-3600000));
        long long6 = fixedDateTimeZone4.convertUTCToLocal(0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0387");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "UTC", (int) (byte) 10, (int) (byte) -1);
        java.lang.String str5 = fixedDateTimeZone4.getID();
        boolean boolean7 = fixedDateTimeZone4.isStandardOffset((-80L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0388");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0389");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime6);
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-10L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0390");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getShortName((long) '#', locale9);
        java.lang.String str11 = fixedDateTimeZone4.getID();
        java.lang.String str13 = fixedDateTimeZone4.getNameKey(62L);
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((-55L));
        long long18 = fixedDateTimeZone4.adjustOffset((-97L), true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-97L) + "'", long18 == (-97L));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0391");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "", (int) (short) 0, (int) ' ');
        java.lang.Class<?> wildcardClass5 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0392");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.lang.String str3 = dateTimeZone1.getName(0L);
        java.lang.String str4 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.035" + "'", str3, "+00:00:00.035");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.035" + "'", str4, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0393");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        long long6 = dateTimeZone2.convertUTCToLocal(1500011L);
        java.lang.String str8 = dateTimeZone2.getName((-2099989L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4200000) + "'", int4 == (-4200000));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2699989L) + "'", long6 == (-2699989L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:10" + "'", str8, "-01:10");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0394");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean4 = dateTimeZone1.isStandardOffset((-101L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0395");
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
        int int27 = fixedDateTimeZone16.getOffsetFromLocal((long) (byte) 10);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone32 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str34 = fixedDateTimeZone32.getNameKey((long) (byte) 0);
        long long36 = fixedDateTimeZone32.previousTransition((long) '#');
        long long38 = fixedDateTimeZone32.nextTransition((long) '4');
        int int40 = fixedDateTimeZone32.getOffset((long) '4');
        long long42 = fixedDateTimeZone32.previousTransition(35L);
        long long44 = fixedDateTimeZone32.previousTransition((long) (short) 100);
        int int46 = fixedDateTimeZone32.getOffsetFromLocal((long) '4');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone32);
        long long50 = fixedDateTimeZone32.adjustOffset(20L, false);
        boolean boolean51 = fixedDateTimeZone16.equals((java.lang.Object) 20L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-11L) + "'", long25 == (-11L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 35L + "'", long36 == 35L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 35L + "'", long42 == 35L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 20L + "'", long50 == 20L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0396");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long11 = fixedDateTimeZone4.convertUTCToLocal((long) (byte) 10);
        java.lang.Class<?> wildcardClass12 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 20L + "'", long11 == 20L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0397");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(32, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0398");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str17 = fixedDateTimeZone4.getShortName((-58L));
        java.lang.String str18 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0399");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        long long6 = fixedDateTimeZone4.previousTransition(110L);
        long long9 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        java.lang.String str11 = fixedDateTimeZone4.getNameKey((-96L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.097" + "'", str11, "+00:00:00.097");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0400");
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
        org.joda.time.ReadableInstant readableInstant49 = null;
        int int50 = dateTimeZone3.getOffset(readableInstant49);
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0401");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        int int13 = fixedDateTimeZone4.getOffset((long) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        java.lang.String str16 = dateTimeZone15.toString();
        boolean boolean17 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone15);
        long long20 = dateTimeZone15.convertLocalToUTC((-97L), false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+01:00" + "'", str16, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3600097L) + "'", long20 == (-3600097L));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0402");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((-97L));
        long long8 = fixedDateTimeZone4.nextTransition((long) (byte) 100);
        boolean boolean10 = fixedDateTimeZone4.isStandardOffset(2099999L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0403");
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
        long long34 = fixedDateTimeZone4.convertLocalToUTC(110L, true, (-4200097L));
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long42 = dateTimeZone38.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long48 = dateTimeZone44.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str49 = dateTimeZone44.getID();
        long long51 = dateTimeZone38.getMillisKeepLocal(dateTimeZone44, (long) (byte) 1);
        long long54 = dateTimeZone38.convertLocalToUTC((long) '4', false);
        java.util.Locale locale56 = null;
        java.lang.String str57 = dateTimeZone38.getName((long) ' ', locale56);
        long long59 = dateTimeZone36.getMillisKeepLocal(dateTimeZone38, (long) (byte) 0);
        java.util.Locale locale61 = null;
        java.lang.String str62 = dateTimeZone36.getShortName(100L, locale61);
        long long64 = dateTimeZone36.convertUTCToLocal(132L);
        boolean boolean65 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone36);
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-101L) + "'", long42 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-101L) + "'", long48 == (-101L));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.100" + "'", str49, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-48L) + "'", long54 == (-48L));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00:00.100" + "'", str57, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "+00:00:00.100" + "'", str62, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 232L + "'", long64 == 232L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0404");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-28799903L), locale6);
        int int9 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset((-11L));
        int int15 = fixedDateTimeZone4.getOffset(0L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getShortName((-2699999L), locale17);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.097" + "'", str18, "+00:00:00.097");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0405");
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
        java.lang.Class<?> wildcardClass32 = fixedDateTimeZone4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0406");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName(62L, locale16);
        boolean boolean18 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0407");
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
        int int69 = fixedDateTimeZone4.getOffsetFromLocal((-70L));
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
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0408");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) ' ', (int) (short) 100);
        long long6 = fixedDateTimeZone4.previousTransition((-158L));
        long long10 = fixedDateTimeZone4.convertLocalToUTC((-1L), true, (-144L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-158L) + "'", long6 == (-158L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-33L) + "'", long10 == (-33L));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0409");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        long long7 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getShortName((-1L), locale9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = fixedDateTimeZone4.getShortName((-3L), locale12);
        long long17 = fixedDateTimeZone4.convertLocalToUTC((-48L), false, 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-97L) + "'", long7 == (-97L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.097" + "'", str10, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.097" + "'", str13, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-145L) + "'", long17 == (-145L));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0410");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 35);
        long long5 = dateTimeZone2.convertLocalToUTC(90L, false);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getName((long) (-4200000), locale7);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-2099910L) + "'", long5 == (-2099910L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:35" + "'", str8, "+00:35");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0411");
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
        long long34 = fixedDateTimeZone16.convertLocalToUTC((-117L), true);
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-127L) + "'", long34 == (-127L));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0412");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-00:00:00.001", "+10:01", (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0413");
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
        java.lang.String str35 = fixedDateTimeZone4.getNameKey(87L);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0414");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str12 = dateTimeZone7.getID();
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (long) (byte) 1);
        java.lang.Class<?> wildcardClass15 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0415");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        long long14 = fixedDateTimeZone4.adjustOffset((long) 'a', false);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey((-97L));
        java.lang.String str18 = fixedDateTimeZone4.getName((-9L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0416");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone0.getOffset(readableInstant7);
        boolean boolean10 = dateTimeZone0.isStandardOffset((long) 97);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0417");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "hi!", (int) (byte) 100, (int) (byte) 10);
        long long7 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', false);
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getName((-109L), locale9);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-68L) + "'", long7 == (-68L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0418");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "-00:00:00.001", (int) ' ', (int) (short) 100);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((-107L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0419");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 35);
        java.lang.String str3 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:35" + "'", str3, "+00:35");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0420");
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
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean22 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0421");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0422");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.lang.String str4 = dateTimeZone1.getID();
        java.lang.String str6 = dateTimeZone1.getName((-65L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.052" + "'", str4, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.052" + "'", str6, "+00:00:00.052");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0423");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        int int15 = fixedDateTimeZone4.getOffset((long) '#');
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0424");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.010");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(1L, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (-4200000), locale6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((-2699999L), locale9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.010" + "'", str4, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.010" + "'", str7, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.010" + "'", str10, "+00:00:00.010");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0425");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        long long18 = fixedDateTimeZone4.convertLocalToUTC((-58L), true, 200L);
        long long21 = fixedDateTimeZone4.convertLocalToUTC(10L, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-68L) + "'", long18 == (-68L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0426");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        int int14 = fixedDateTimeZone4.getOffset((long) '4');
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        java.lang.String str17 = fixedDateTimeZone4.toString();
        long long19 = fixedDateTimeZone4.nextTransition((-72L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-72L) + "'", long19 == (-72L));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0427");
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
        java.lang.Class<?> wildcardClass41 = fixedDateTimeZone4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0428");
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
        java.lang.String str29 = fixedDateTimeZone4.toString();
        java.util.Locale locale31 = null;
        java.lang.String str32 = fixedDateTimeZone4.getShortName((long) 32, locale31);
        java.util.Locale locale34 = null;
        java.lang.String str35 = fixedDateTimeZone4.getName((-3659878L), locale34);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.010" + "'", str32, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.010" + "'", str35, "+00:00:00.010");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0429");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0430");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        int int18 = fixedDateTimeZone4.getOffset(35L);
        java.lang.Class<?> wildcardClass19 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0431");
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
        java.lang.String str27 = fixedDateTimeZone4.getShortName((-10L), locale26);
        long long29 = fixedDateTimeZone4.nextTransition((-58L));
        long long32 = fixedDateTimeZone4.adjustOffset((-38L), true);
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-58L) + "'", long29 == (-58L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-38L) + "'", long32 == (-38L));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0432");
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
        int int37 = fixedDateTimeZone4.getOffsetFromLocal(35L);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0433");
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
        java.lang.Class<?> wildcardClass36 = fixedDateTimeZone4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0434");
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
        int int26 = fixedDateTimeZone4.getStandardOffset(0L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone31 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str33 = fixedDateTimeZone31.getNameKey((long) (byte) 0);
        long long35 = fixedDateTimeZone31.previousTransition((long) '#');
        long long37 = fixedDateTimeZone31.nextTransition((long) '4');
        int int39 = fixedDateTimeZone31.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime40 = null;
        boolean boolean41 = fixedDateTimeZone31.isLocalDateTimeGap(localDateTime40);
        java.util.TimeZone timeZone42 = fixedDateTimeZone31.toTimeZone();
        boolean boolean43 = fixedDateTimeZone31.isFixed();
        long long45 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone31, 10L);
        java.util.Locale locale47 = null;
        java.lang.String str48 = fixedDateTimeZone4.getShortName(25L, locale47);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-101L) + "'", long22 == (-101L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35L + "'", long35 == 35L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00:00.010" + "'", str48, "+00:00:00.010");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0435");
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
        java.util.TimeZone timeZone26 = fixedDateTimeZone16.toTimeZone();
        java.lang.String str27 = fixedDateTimeZone16.getID();
        int int29 = fixedDateTimeZone16.getStandardOffset((long) 1);
        long long32 = fixedDateTimeZone16.convertLocalToUTC(45L, true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone37 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str39 = fixedDateTimeZone37.getNameKey(10L);
        boolean boolean41 = fixedDateTimeZone37.equals((java.lang.Object) 0.0d);
        long long43 = fixedDateTimeZone37.convertUTCToLocal((-48L));
        boolean boolean44 = fixedDateTimeZone16.equals((java.lang.Object) long43);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-11L) + "'", long25 == (-11L));
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 35L + "'", long32 == 35L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-38L) + "'", long43 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0436");
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
        java.util.Locale locale35 = null;
        java.lang.String str36 = fixedDateTimeZone23.getShortName(96L, locale35);
        int int38 = fixedDateTimeZone23.getOffsetFromLocal(15L);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.010" + "'", str36, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0437");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 0);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = fixedDateTimeZone4.getOffset(readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = fixedDateTimeZone4.getOffset(readableInstant13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forID("-01:00");
        long long18 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone16, (-119L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3599891L + "'", long18 == 3599891L);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0438");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
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
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0439");
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
        java.lang.String str27 = fixedDateTimeZone4.getShortName((-10L), locale26);
        long long29 = fixedDateTimeZone4.nextTransition((-58L));
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = fixedDateTimeZone4.getOffset(readableInstant30);
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-58L) + "'", long29 == (-58L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0440");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long15 = fixedDateTimeZone4.convertLocalToUTC(232L, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 222L + "'", long15 == 222L);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0441");
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
        long long40 = fixedDateTimeZone4.nextTransition(0L);
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
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0442");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-101L), locale13);
        long long16 = fixedDateTimeZone4.nextTransition(2099989L);
        long long18 = fixedDateTimeZone4.convertUTCToLocal((-179L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2099989L + "'", long16 == 2099989L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-169L) + "'", long18 == (-169L));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0443");
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
        org.joda.time.LocalDateTime localDateTime62 = null;
        boolean boolean63 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime62);
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0444");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) -1);
        long long4 = dateTimeZone2.convertUTCToLocal((long) (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3660000L) + "'", long4 == (-3660000L));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0445");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 1, false);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(1L, locale5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone0.getOffset(readableInstant7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getShortName(52L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0446");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "hi!", (-1), 35);
        java.lang.String str6 = fixedDateTimeZone4.getName((-4200097L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-00:00:00.001" + "'", str6, "-00:00:00.001");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0447");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        int int10 = fixedDateTimeZone4.getStandardOffset((-101L));
        long long12 = fixedDateTimeZone4.nextTransition(25L);
        long long14 = fixedDateTimeZone4.nextTransition((long) (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 25L + "'", long12 == 25L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0448");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0449");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) (byte) -1);
        boolean boolean4 = dateTimeZone0.isStandardOffset((-55L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0450");
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
        java.util.TimeZone timeZone31 = fixedDateTimeZone4.toTimeZone();
        long long35 = fixedDateTimeZone4.convertLocalToUTC((-101L), false, 0L);
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
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-111L) + "'", long35 == (-111L));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0451");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "Coordinated Universal Time", (int) '#', 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0452");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        java.lang.String str3 = dateTimeZone1.getName(232L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.100" + "'", str3, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0453");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
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
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-144L) + "'", long25 == (-144L));
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0454");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "org/joda/time/tz/data", (int) (short) 100, (int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean7 = fixedDateTimeZone4.isStandardOffset((-124L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0455");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "org/joda/time/tz/data", (int) 'a', (int) (byte) 100);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((long) (byte) 10, locale6);
        int int9 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        long long11 = fixedDateTimeZone4.nextTransition(35L);
        java.lang.Class<?> wildcardClass12 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0456");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "UTC", (int) (short) 10, 0);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal(15L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 10);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) readableInstant10);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone17 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str19 = fixedDateTimeZone17.getNameKey((long) (byte) 0);
        int int21 = fixedDateTimeZone17.getStandardOffset(100L);
        java.lang.String str23 = fixedDateTimeZone17.getNameKey((long) 0);
        long long26 = fixedDateTimeZone17.convertLocalToUTC((long) (byte) -1, false);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = fixedDateTimeZone17.getOffset(readableInstant27);
        long long30 = fixedDateTimeZone17.nextTransition((-111L));
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = fixedDateTimeZone17.isLocalDateTimeGap(localDateTime31);
        int int34 = fixedDateTimeZone17.getOffsetFromLocal((long) 100);
        long long37 = fixedDateTimeZone17.adjustOffset((long) 100, false);
        boolean boolean39 = fixedDateTimeZone17.isStandardOffset((long) 'a');
        boolean boolean40 = fixedDateTimeZone4.equals((java.lang.Object) boolean39);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-4200000) + "'", int11 == (-4200000));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-11L) + "'", long26 == (-11L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-111L) + "'", long30 == (-111L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0457");
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
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone74 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.100", (int) (short) 10, (int) (short) -1);
        boolean boolean75 = fixedDateTimeZone29.equals((java.lang.Object) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0458");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((long) 1, locale9);
        long long13 = dateTimeZone1.convertLocalToUTC((long) 100, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getShortName((-3600097L), locale16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0459");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0460");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) -1);
        java.lang.String str4 = dateTimeZone2.getShortName(57L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:01" + "'", str4, "-00:01");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0461");
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
        java.lang.String str39 = fixedDateTimeZone4.getID();
        long long41 = fixedDateTimeZone4.convertUTCToLocal((-3600000L));
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-3599990L) + "'", long41 == (-3599990L));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0462");
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
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone63 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str65 = fixedDateTimeZone63.getNameKey((long) (byte) 0);
        boolean boolean66 = fixedDateTimeZone63.isFixed();
        java.lang.String str68 = fixedDateTimeZone63.getNameKey((-48L));
        int int70 = fixedDateTimeZone63.getOffset((long) 'a');
        long long72 = fixedDateTimeZone32.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone63, (-199L));
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-199L) + "'", long72 == (-199L));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0463");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        java.lang.String str11 = dateTimeZone1.getShortName((long) (short) 1);
        long long15 = dateTimeZone1.convertLocalToUTC(1L, true, 62L);
        java.lang.String str17 = dateTimeZone1.getShortName(200L);
        boolean boolean19 = dateTimeZone1.isStandardOffset(62L);
        java.lang.String str21 = dateTimeZone1.getShortName((-88L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0464");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        int int14 = fixedDateTimeZone4.getOffset((long) '4');
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        long long18 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        boolean boolean20 = fixedDateTimeZone4.isStandardOffset((-47L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0465");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("Coordinated Universal Time", "+10:01", 35, (int) (byte) -1);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0466");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        long long22 = fixedDateTimeZone4.convertLocalToUTC((long) (short) 10, false, 2099989L);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        long long25 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone23, 147L);
        long long27 = fixedDateTimeZone4.convertUTCToLocal((long) 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 57L + "'", long25 == 57L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 45L + "'", long27 == 45L);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0467");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "UTC", 35, (int) (short) -1);
        long long7 = fixedDateTimeZone4.convertLocalToUTC((-3659913L), false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3659948L) + "'", long7 == (-3659948L));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0468");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffset(132L);
        int int14 = fixedDateTimeZone4.getOffset((long) '4');
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        long long18 = fixedDateTimeZone4.nextTransition((-97L));
        java.util.TimeZone timeZone19 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-97L) + "'", long18 == (-97L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0469");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((long) 0, locale16);
        java.lang.String str18 = fixedDateTimeZone4.getID();
        java.lang.String str20 = fixedDateTimeZone4.getName((long) 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.010" + "'", str17, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0470");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long12 = fixedDateTimeZone4.nextTransition(132L);
        java.lang.String str14 = fixedDateTimeZone4.getName((long) (short) 10);
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str22 = fixedDateTimeZone20.getNameKey((long) (byte) 0);
        int int24 = fixedDateTimeZone20.getStandardOffset(100L);
        int int26 = fixedDateTimeZone20.getStandardOffset((-101L));
        int int28 = fixedDateTimeZone20.getOffset((long) 35);
        long long30 = fixedDateTimeZone20.nextTransition((long) (short) 10);
        boolean boolean32 = fixedDateTimeZone20.isStandardOffset((-68L));
        java.util.TimeZone timeZone33 = fixedDateTimeZone20.toTimeZone();
        boolean boolean34 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone20);
        org.joda.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = fixedDateTimeZone20.isLocalDateTimeGap(localDateTime35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0471");
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
        java.lang.String str28 = fixedDateTimeZone11.toString();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0472");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        int int8 = fixedDateTimeZone4.getStandardOffset(100L);
        long long10 = fixedDateTimeZone4.nextTransition((-4199975L));
        java.lang.String str11 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-4199975L) + "'", long10 == (-4199975L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0473");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        long long7 = fixedDateTimeZone4.convertLocalToUTC((long) 97, false);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getShortName(384L, locale11);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone17 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str19 = fixedDateTimeZone17.getNameKey((long) (byte) 0);
        long long21 = fixedDateTimeZone17.previousTransition((long) '#');
        long long23 = fixedDateTimeZone17.nextTransition((long) '4');
        int int25 = fixedDateTimeZone17.getOffset((long) '4');
        long long27 = fixedDateTimeZone17.previousTransition(35L);
        long long29 = fixedDateTimeZone17.previousTransition((long) (short) 100);
        long long31 = fixedDateTimeZone17.previousTransition((-1L));
        long long34 = fixedDateTimeZone17.adjustOffset((-2099999L), true);
        long long36 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone17, (-99L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 87L + "'", long7 == 87L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 35L + "'", long27 == 35L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-2099999L) + "'", long34 == (-2099999L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-99L) + "'", long36 == (-99L));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0474");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str17 = fixedDateTimeZone4.getID();
        java.lang.String str19 = fixedDateTimeZone4.getShortName((-80L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.010" + "'", str19, "+00:00:00.010");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0475");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00", (int) ' ', (int) (short) 10);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0476");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.035", "", (int) (byte) -1, 2100000);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0477");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.getID();
        java.lang.String str3 = dateTimeZone0.getShortName((-111L));
        java.lang.String str5 = dateTimeZone0.getName((-68L));
        long long8 = dateTimeZone0.adjustOffset(20L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.010" + "'", str3, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.010" + "'", str5, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 20L + "'", long8 == 20L);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0478");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName(62L, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0479");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 35);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        long long6 = dateTimeZone3.convertLocalToUTC((long) 1, false);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone3.getName(1L, locale8);
        long long12 = dateTimeZone3.adjustOffset((long) '4', true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        long long15 = dateTimeZone2.getMillisKeepLocal(dateTimeZone3, (-11L));
        boolean boolean17 = dateTimeZone2.isStandardOffset(9L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coordinated Universal Time" + "'", str9, "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2099989L + "'", long15 == 2099989L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0480");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        long long10 = fixedDateTimeZone4.nextTransition((long) '4');
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        long long14 = fixedDateTimeZone4.previousTransition(35L);
        long long16 = fixedDateTimeZone4.previousTransition((long) (short) 100);
        long long18 = fixedDateTimeZone4.previousTransition((-1L));
        java.lang.String str20 = fixedDateTimeZone4.getName((long) (byte) 100);
        java.lang.Class<?> wildcardClass21 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.010" + "'", str20, "+00:00:00.010");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0481");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, 0L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        java.lang.String str10 = dateTimeZone1.toString();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getName((-3600000L), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-101L) + "'", long5 == (-101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0482");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:35", "+00:00:00.010", (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0483");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        boolean boolean6 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0484");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean8 = fixedDateTimeZone4.equals((java.lang.Object) 0.0d);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        boolean boolean12 = fixedDateTimeZone4.equals((java.lang.Object) (-1.0f));
        int int14 = fixedDateTimeZone4.getStandardOffset((-21L));
        int int16 = fixedDateTimeZone4.getOffset(1500011L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-38L) + "'", long10 == (-38L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0485");
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
        java.util.Locale locale22 = null;
        java.lang.String str23 = fixedDateTimeZone4.getShortName(96L, locale22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 132L + "'", long12 == 132L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.010" + "'", str18, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.010" + "'", str23, "+00:00:00.010");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0486");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:10");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0487");
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
        boolean boolean26 = fixedDateTimeZone4.isStandardOffset((long) (short) 1);
        long long28 = fixedDateTimeZone4.convertUTCToLocal((-168L));
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-158L) + "'", long28 == (-158L));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0488");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "UTC", 10, 97);
        int int6 = fixedDateTimeZone4.getOffset((-211L));
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.010' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0489");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-00:01");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0490");
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
        long long26 = dateTimeZone1.convertUTCToLocal((long) 0);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone1.getName((long) (byte) 10, locale28);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.100" + "'", str29, "+00:00:00.100");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0491");
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
        long long34 = fixedDateTimeZone4.previousTransition((long) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0492");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        long long6 = fixedDateTimeZone4.previousTransition(110L);
        java.lang.String str8 = fixedDateTimeZone4.getNameKey(25L);
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-47L), true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.097" + "'", str8, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-47L) + "'", long11 == (-47L));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0493");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-00:00:00.001", "+00:00:00.010", 0, 0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0494");
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
        long long22 = fixedDateTimeZone4.convertLocalToUTC(3L, true);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-7L) + "'", long22 == (-7L));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0495");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (byte) 0);
        long long8 = fixedDateTimeZone4.previousTransition((long) '#');
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(132L);
        long long15 = fixedDateTimeZone4.adjustOffset((long) 97, true);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = fixedDateTimeZone4.getOffset(readableInstant16);
        int int19 = fixedDateTimeZone4.getStandardOffset((-55L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0496");
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
        boolean boolean20 = fixedDateTimeZone4.isFixed();
        int int22 = fixedDateTimeZone4.getOffsetFromLocal((-60065L));
        long long24 = fixedDateTimeZone4.nextTransition((-3L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10L) + "'", long18 == (-10L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3L) + "'", long24 == (-3L));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0497");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 10, (int) '#');
        long long7 = fixedDateTimeZone4.convertLocalToUTC((long) 97, false);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getShortName(384L, locale11);
        int int14 = fixedDateTimeZone4.getStandardOffset(384L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 87L + "'", long7 == 87L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0498");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+10:01", "+01:00", 2100000, (int) '#');
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((-68L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:00" + "'", str6, "+01:00");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0499");
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
        java.lang.Class<?> wildcardClass32 = dateTimeZone0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "FixedDateTimeZoneRegressionTest0.test0500");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("org/joda/time/tz/data", "+00:00:00.097", 0, (int) (short) 10);
        long long6 = fixedDateTimeZone4.previousTransition(110L);
        long long9 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getName((-80L), locale11);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }
}
