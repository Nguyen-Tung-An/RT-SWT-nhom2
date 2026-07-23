package org.jfree.data.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MinuteRegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test501");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        int int7 = minute0.getMinute();
        long long8 = minute0.getLastMillisecond();
        long long9 = minute0.getLastMillisecond();
        org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute();
        int int11 = minute10.getMinute();
        java.util.Date date12 = minute10.getStart();
        java.util.Date date13 = minute10.getEnd();
        long long14 = minute10.getFirstMillisecond();
        java.util.Date date15 = minute10.getStart();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute(date15);
        org.jfree.data.time.Minute minute17 = new org.jfree.data.time.Minute(date15);
        java.lang.Object obj18 = null;
        boolean boolean19 = minute17.equals(obj18);
        int int20 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute17);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "1) test501(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "1) test501(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "1) test501(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "1) test501(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "1) test501(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813579999L + "'", long9 == 1784813579999L);
// flaky "1) test501(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(date12);
// flaky "1) test501(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date13);
// flaky "1) test501(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "1) test501(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813520000L + "'", long14 == 1784813520000L);
        org.junit.Assert.assertNotNull(date15);
// flaky "1) test501(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test502");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        java.util.Date date7 = minute0.getEnd();
        long long8 = minute0.getLastMillisecond();
        java.lang.String str9 = minute0.toString();
        long long10 = minute0.getFirstMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "2) test502(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "2) test502(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "2) test502(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "2) test502(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "2) test502(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str9, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "2) test502(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813520000L + "'", long10 == 1784813520000L);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test503");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        int int7 = minute0.getHourValue();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        long long10 = minute8.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute8.next();
        boolean boolean12 = minute0.equals((java.lang.Object) minute8);
        boolean boolean14 = minute8.equals((java.lang.Object) 1784813579999L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute8.previous();
// flaky "3) test503(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "3) test503(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "3) test503(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "3) test503(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "3) test503(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test504");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        java.util.Date date7 = minute0.getStart();
        java.util.TimeZone timeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute(date7, timeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "4) test504(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "4) test504(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "4) test504(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "4) test504(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test505");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute4.next();
        long long6 = minute4.getMiddleMillisecond();
        int int7 = minute4.getHourValue();
        int int8 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute4);
// flaky "5) test505(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "5) test505(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test506");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
// flaky "6) test506(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "6) test506(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "5) test506(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test507");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        long long6 = minute5.getLastMillisecond();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute7.next();
        long long9 = minute7.getMiddleMillisecond();
        int int10 = minute7.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        int int12 = minute7.compareTo(timePeriod11);
        long long13 = minute7.getLastMillisecond();
        int int14 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute7);
        java.util.Date date15 = minute5.getEnd();
        java.lang.Class<?> wildcardClass16 = date15.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "7) test507(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "7) test507(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "6) test507(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "5) test507(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky "4) test507(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813579999L + "'", long13 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(date15);
// flaky "3) test507(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test508");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        int int10 = minute6.getMinute();
        java.util.Date date11 = minute6.getStart();
        int int12 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute6);
        int int13 = minute0.getMinute();
        java.lang.String str14 = minute0.toString();
        java.util.Date date15 = minute0.getEnd();
        java.util.TimeZone timeZone16 = null;
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute(date15, timeZone16, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "8) test508(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "8) test508(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "7) test508(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "6) test508(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(date11);
// flaky "5) test508(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "4) test508(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
// flaky "2) test508(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str14, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date15);
// flaky "2) test508(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test509");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        boolean boolean4 = minute0.equals((java.lang.Object) 8);
        java.util.Date date5 = minute0.getStart();
        int int6 = minute0.getHourValue();
// flaky "9) test509(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date5);
// flaky "9) test509(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test510");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        long long6 = minute0.getMiddleMillisecond();
        java.lang.String str7 = minute0.toString();
        long long8 = minute0.getSerialIndex();
// flaky "10) test510(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "10) test510(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "8) test510(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "7) test510(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "6) test510(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "5) test510(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
// flaky "3) test510(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str7, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "3) test510(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test511");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        long long2 = minute0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.previous();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = minute0.getFirstMillisecond(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "11) test511(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
// flaky "11) test511(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 66566672L + "'", long2 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test512");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) (short) 0, 9, 32, (int) (short) 1, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test513");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = minute0.next();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = minute0.getFirstMillisecond(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
// flaky "12) test513(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod2);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test514");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        int int5 = minute0.getMinute();
        java.util.Date date6 = minute0.getEnd();
        java.lang.String str7 = minute0.toString();
        java.util.Date date8 = minute0.getEnd();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date8);
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute12 = new org.jfree.data.time.Minute(date8, timeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "13) test514(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "12) test514(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "9) test514(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky "8) test514(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "7) test514(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str7, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date8);
// flaky "6) test514(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test515");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        java.lang.String str8 = regularTimePeriod7.toString();
// flaky "14) test515(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "13) test515(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "10) test515(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "9) test515(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "8) test515(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "7) test515(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Thu Jul 23 20:33:00 ICT 2026" + "'", str8, "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test516");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        boolean boolean7 = minute0.equals((java.lang.Object) '4');
        long long8 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute9.next();
        long long11 = minute9.getMiddleMillisecond();
        int int12 = minute9.getHourValue();
        java.util.Date date13 = minute9.getStart();
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute(date13);
        long long15 = minute14.getLastMillisecond();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute16.next();
        long long18 = minute16.getMiddleMillisecond();
        int int19 = minute16.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod20 = null;
        int int21 = minute16.compareTo(timePeriod20);
        long long22 = minute16.getLastMillisecond();
        int int23 = minute14.compareTo((org.jfree.data.time.TimePeriod) minute16);
        int int24 = minute16.getHourValue();
        long long25 = minute16.getFirstMillisecond();
        boolean boolean26 = minute0.equals((java.lang.Object) minute16);
        java.util.Date date27 = minute0.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = minute0.previous();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "15) test516(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "14) test516(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "11) test516(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "10) test516(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(date13);
// flaky "9) test516(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "8) test516(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813579999L + "'", long15 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "4) test516(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813549999L + "'", long18 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
// flaky "4) test516(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1784813579999L + "'", long22 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
// flaky "2) test516(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1784813520000L + "'", long25 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(date27);
// flaky "2) test516(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date27.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod28);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test517");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        java.util.Date date5 = regularTimePeriod4.getStart();
        java.util.TimeZone timeZone6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date5, timeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "16) test517(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "15) test517(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertNotNull(date5);
// flaky "12) test517(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:31:00 ICT 2026");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test518");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
        long long7 = minute0.getLastMillisecond();
        org.jfree.data.time.TimePeriod timePeriod8 = null;
        int int9 = minute0.compareTo(timePeriod8);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "17) test518(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "16) test518(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "13) test518(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813579999L + "'", long7 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test519");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        boolean boolean7 = minute0.equals((java.lang.Object) '4');
        long long8 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute9.next();
        long long11 = minute9.getMiddleMillisecond();
        int int12 = minute9.getHourValue();
        java.util.Date date13 = minute9.getStart();
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute(date13);
        long long15 = minute14.getLastMillisecond();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute16.next();
        long long18 = minute16.getMiddleMillisecond();
        int int19 = minute16.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod20 = null;
        int int21 = minute16.compareTo(timePeriod20);
        long long22 = minute16.getLastMillisecond();
        int int23 = minute14.compareTo((org.jfree.data.time.TimePeriod) minute16);
        int int24 = minute16.getHourValue();
        long long25 = minute16.getFirstMillisecond();
        boolean boolean26 = minute0.equals((java.lang.Object) minute16);
        java.util.Date date27 = minute0.getEnd();
        java.util.TimeZone timeZone28 = null;
        java.util.Locale locale29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute30 = new org.jfree.data.time.Minute(date27, timeZone28, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "18) test519(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "17) test519(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "14) test519(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "11) test519(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(date13);
// flaky "10) test519(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "9) test519(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813579999L + "'", long15 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "5) test519(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813549999L + "'", long18 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
// flaky "5) test519(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1784813579999L + "'", long22 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
// flaky "3) test519(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1784813520000L + "'", long25 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(date27);
// flaky "3) test519(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date27.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test520");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        java.lang.String str11 = minute5.toString();
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = minute5.getMiddleMillisecond(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "19) test520(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "18) test520(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "15) test520(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "12) test520(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "11) test520(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "10) test520(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "6) test520(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str11, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test521");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getStart();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute(date1);
        long long3 = minute2.getFirstMillisecond();
        org.junit.Assert.assertNotNull(date1);
// flaky "20) test521(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "19) test521(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test522");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        int int11 = minute5.getHourValue();
        java.util.Date date12 = minute5.getStart();
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute();
        int int14 = minute13.getMinute();
        java.util.Date date15 = minute13.getStart();
        java.util.Date date16 = minute13.getEnd();
        long long17 = minute13.getFirstMillisecond();
        java.util.Date date18 = minute13.getStart();
        java.lang.Class<?> wildcardClass19 = date18.getClass();
        boolean boolean20 = minute5.equals((java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = minute5.getClass();
// flaky "21) test522(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "20) test522(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "16) test522(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "13) test522(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "12) test522(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "11) test522(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(date12);
// flaky "7) test522(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "6) test522(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(date15);
// flaky "4) test522(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date16);
// flaky "4) test522(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "1) test522(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813520000L + "'", long17 == 1784813520000L);
        org.junit.Assert.assertNotNull(date18);
// flaky "1) test522(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test523");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.lang.Object obj5 = null;
        boolean boolean6 = minute0.equals(obj5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        long long10 = minute8.getMiddleMillisecond();
        int int11 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute8);
        long long12 = minute8.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = minute8.previous();
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute14.next();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute();
        int int17 = minute16.getMinute();
        java.util.Date date18 = minute16.getStart();
        boolean boolean19 = minute14.equals((java.lang.Object) date18);
        boolean boolean21 = minute14.equals((java.lang.Object) '4');
        java.util.Date date22 = minute14.getStart();
        int int23 = minute8.compareTo((org.jfree.data.time.TimePeriod) minute14);
        java.lang.String str24 = minute8.toString();
        int int25 = minute8.getMinute();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "22) test523(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "21) test523(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "17) test523(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "14) test523(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "13) test523(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "12) test523(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(date18);
// flaky "8) test523(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "7) test523(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date22.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky "5) test523(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str24, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "5) test523(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test524");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(59, (int) (short) 1, (int) (byte) 100, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test525");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        java.lang.String str6 = minute0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        java.util.Date date8 = minute0.getEnd();
        java.lang.Object obj9 = null;
        boolean boolean10 = minute0.equals(obj9);
        long long11 = minute0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute0.next();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "23) test525(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "22) test525(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "18) test525(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
// flaky "15) test525(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "14) test525(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66566672L + "'", long11 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test526");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        java.util.Date date10 = minute6.getStart();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date10);
        boolean boolean12 = minute0.equals((java.lang.Object) minute11);
        int int13 = minute11.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute11.previous();
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = minute11.getFirstMillisecond(calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "24) test526(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "23) test526(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "19) test526(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "16) test526(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "15) test526(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "13) test526(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(date10);
// flaky "9) test526(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "8) test526(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test527");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        long long8 = minute0.getMiddleMillisecond();
        int int9 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute0.previous();
        java.lang.Class<?> wildcardClass11 = minute0.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "25) test527(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "24) test527(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "20) test527(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "17) test527(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
// flaky "16) test527(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test528");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        boolean boolean4 = minute0.equals((java.lang.Object) 8);
        java.lang.String str5 = minute0.toString();
        int int6 = minute0.getMinute();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor7 = null;
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute0.getMillisecond(timePeriodAnchor7, calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "26) test528(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "25) test528(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "21) test528(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test529");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.lang.String str6 = minute0.toString();
        java.util.Date date7 = minute0.getStart();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        int int9 = minute8.getMinute();
        int int10 = minute8.getHourValue();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute();
        long long12 = minute11.getSerialIndex();
        long long13 = minute11.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute11.next();
        int int15 = minute8.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod14);
        long long16 = minute8.getMiddleMillisecond();
        boolean boolean17 = minute0.equals((java.lang.Object) minute8);
        java.util.Date date18 = minute8.getStart();
        java.util.TimeZone timeZone19 = null;
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute21 = new org.jfree.data.time.Minute(date18, timeZone19, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "27) test529(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "26) test529(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "22) test529(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "18) test529(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "17) test529(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "14) test529(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
// flaky "10) test529(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "9) test529(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
// flaky "6) test529(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
// flaky "6) test529(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky "2) test529(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date18);
// flaky "2) test529(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test530");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.lang.String str5 = minute0.toString();
        org.jfree.data.time.Hour hour6 = minute0.getHour();
// flaky "28) test530(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "27) test530(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "23) test530(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "19) test530(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
// flaky "18) test530(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(hour6);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test531");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) '4', (int) '#', 33, 9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test532");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute4.next();
        long long6 = minute4.getMiddleMillisecond();
        int int7 = minute4.getHourValue();
        long long8 = minute4.getSerialIndex();
        int int9 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute4);
        long long10 = minute4.getLastMillisecond();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute();
        int int12 = minute11.getMinute();
        int int13 = minute11.getHourValue();
        int int14 = minute11.getMinute();
        org.jfree.data.time.Minute minute15 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = minute15.next();
        long long17 = minute15.getMiddleMillisecond();
        int int18 = minute15.getHourValue();
        long long19 = minute15.getSerialIndex();
        int int20 = minute11.compareTo((org.jfree.data.time.TimePeriod) minute15);
        java.lang.String str21 = minute11.toString();
        int int22 = minute4.compareTo((org.jfree.data.time.TimePeriod) minute11);
        java.lang.String str23 = minute11.toString();
// flaky "29) test532(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "28) test532(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "24) test532(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "20) test532(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "19) test532(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813579999L + "'", long10 == 1784813579999L);
// flaky "15) test532(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
// flaky "11) test532(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
// flaky "10) test532(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
// flaky "7) test532(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky "7) test532(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str21, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky "3) test532(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str23, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test533");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = minute0.next();
        java.util.Date date3 = regularTimePeriod2.getEnd();
        java.util.Date date4 = regularTimePeriod2.getEnd();
        org.junit.Assert.assertNotNull(date1);
// flaky "30) test533(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertNotNull(date3);
// flaky "29) test533(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertNotNull(date4);
// flaky "25) test533(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test534");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.Minute minute1 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = minute1.next();
        long long3 = minute1.getMiddleMillisecond();
        int int4 = minute1.getHourValue();
        int int5 = minute1.getMinute();
        long long6 = minute1.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute1.previous();
        boolean boolean8 = minute0.equals((java.lang.Object) regularTimePeriod7);
        long long9 = minute0.getFirstMillisecond();
        java.lang.String str10 = minute0.toString();
        long long11 = minute0.getSerialIndex();
        org.junit.Assert.assertNotNull(regularTimePeriod2);
// flaky "31) test534(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813549999L + "'", long3 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
// flaky "30) test534(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
// flaky "26) test534(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "21) test534(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813520000L + "'", long9 == 1784813520000L);
// flaky "20) test534(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str10, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "16) test534(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66566672L + "'", long11 == 66566672L);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test535");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        java.util.Date date10 = minute6.getStart();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date10);
        boolean boolean12 = minute0.equals((java.lang.Object) minute11);
        int int13 = minute11.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute11.previous();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor15 = null;
        java.util.Calendar calendar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = regularTimePeriod14.getMillisecond(timePeriodAnchor15, calendar16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "32) test535(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "31) test535(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "27) test535(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "22) test535(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "21) test535(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "17) test535(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(date10);
// flaky "12) test535(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "11) test535(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test536");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(6, 20, 1, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test537");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        java.lang.String str6 = minute0.toString();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        java.util.Date date9 = minute7.getStart();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute7);
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor11 = null;
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = minute0.getMillisecond(timePeriodAnchor11, calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "33) test537(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "32) test537(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "28) test537(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "23) test537(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "22) test537(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test538");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        int int11 = minute0.getHourValue();
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "34) test538(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "33) test538(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "29) test538(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "24) test538(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "23) test538(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "18) test538(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test539");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        java.util.Date date7 = minute0.getEnd();
        long long8 = minute0.getLastMillisecond();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute9.next();
        long long11 = regularTimePeriod10.getMiddleMillisecond();
        int int12 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod10);
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute13.next();
        long long15 = minute13.getMiddleMillisecond();
        int int16 = minute13.getHourValue();
        java.util.Date date17 = minute13.getStart();
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute(date17);
        long long19 = minute18.getLastMillisecond();
        java.util.Date date20 = minute18.getEnd();
        long long21 = minute18.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = minute18.next();
        int int23 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute18);
        int int24 = minute0.getHourValue();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "35) test539(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "34) test539(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "30) test539(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "25) test539(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "24) test539(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813609999L + "'", long11 == 1784813609999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(regularTimePeriod14);
// flaky "19) test539(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813549999L + "'", long15 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(date17);
// flaky "13) test539(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date17.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "12) test539(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813579999L + "'", long19 == 1784813579999L);
        org.junit.Assert.assertNotNull(date20);
// flaky "8) test539(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date20.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "8) test539(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 66566672L + "'", long21 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test540");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = minute0.next();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor6 = null;
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = minute0.getMillisecond(timePeriodAnchor6, calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "36) test540(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "35) test540(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "31) test540(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test541");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = minute0.next();
        java.util.Date date3 = regularTimePeriod2.getStart();
        java.lang.String str4 = regularTimePeriod2.toString();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = regularTimePeriod2.getMiddleMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "37) test541(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertNotNull(date3);
// flaky "36) test541(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:33:00 ICT 2026");
// flaky "32) test541(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Thu Jul 23 20:33:00 ICT 2026" + "'", str4, "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test542");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.lang.Object obj5 = null;
        boolean boolean6 = minute0.equals(obj5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        long long10 = minute8.getMiddleMillisecond();
        int int11 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute8);
        long long12 = minute0.getSerialIndex();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "38) test542(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "37) test542(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "33) test542(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "26) test542(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "25) test542(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test543");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) 'a', 8, (int) (short) 10, 59, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test544");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = minute0.next();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        int int5 = minute4.getMinute();
        java.util.Date date6 = minute4.getStart();
        java.util.Date date7 = minute4.getEnd();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        long long10 = minute8.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute8.next();
        java.util.Date date12 = regularTimePeriod11.getEnd();
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute(date12);
        boolean boolean14 = minute4.equals((java.lang.Object) date12);
        boolean boolean15 = minute0.equals((java.lang.Object) date12);
// flaky "39) test544(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "38) test544(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky "34) test544(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
// flaky "27) test544(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "26) test544(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "20) test544(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertNotNull(date12);
// flaky "14) test544(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test545");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getFirstMillisecond();
        java.lang.Class<?> wildcardClass6 = minute0.getClass();
// flaky "40) test545(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "39) test545(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "35) test545(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "28) test545(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "27) test545(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813520000L + "'", long5 == 1784813520000L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test546");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(0, 12, (int) (short) 0, 4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test547");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        long long8 = minute0.getMiddleMillisecond();
        java.lang.String str9 = minute0.toString();
        org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute();
        int int11 = minute10.getHourValue();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute10.next();
        long long13 = minute10.getSerialIndex();
        int int14 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute10);
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute10.peg(calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "41) test547(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "40) test547(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "36) test547(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "29) test547(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
// flaky "28) test547(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str9, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "21) test547(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test548");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        int int7 = minute0.getHourValue();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        long long10 = minute8.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute8.next();
        boolean boolean12 = minute0.equals((java.lang.Object) minute8);
        java.util.Date date13 = minute0.getStart();
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute();
        long long15 = minute14.getSerialIndex();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute16.next();
        long long18 = minute16.getMiddleMillisecond();
        int int19 = minute16.getHourValue();
        int int20 = minute14.compareTo((org.jfree.data.time.TimePeriod) minute16);
        org.jfree.data.time.Minute minute21 = new org.jfree.data.time.Minute();
        int int22 = minute21.getMinute();
        int int23 = minute21.getHourValue();
        int int24 = minute21.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = minute21.previous();
        int int26 = minute21.getHourValue();
        boolean boolean27 = minute16.equals((java.lang.Object) int26);
        long long28 = minute16.getLastMillisecond();
        java.util.Date date29 = minute16.getEnd();
        boolean boolean30 = minute0.equals((java.lang.Object) date29);
// flaky "42) test548(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "41) test548(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "37) test548(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "30) test548(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "29) test548(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "22) test548(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "15) test548(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 66566672L + "'", long15 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "13) test548(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813549999L + "'", long18 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky "9) test548(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
// flaky "9) test548(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky "4) test548(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1784813579999L + "'", long28 == 1784813579999L);
        org.junit.Assert.assertNotNull(date29);
// flaky "3) test548(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date29.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test549");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        long long4 = minute0.getFirstMillisecond();
        long long5 = minute0.getLastMillisecond();
        int int6 = minute0.getMinute();
// flaky "43) test549(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "42) test549(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "38) test549(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
// flaky "31) test549(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
// flaky "30) test549(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test550");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute4.next();
        long long6 = minute4.getMiddleMillisecond();
        int int7 = minute4.getHourValue();
        long long8 = minute4.getSerialIndex();
        int int9 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute4);
        java.lang.String str10 = minute0.toString();
        long long11 = minute0.getLastMillisecond();
        java.util.Date date12 = minute0.getStart();
        boolean boolean14 = minute0.equals((java.lang.Object) 10L);
        int int15 = minute0.getMinute();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute();
        int int17 = minute16.getMinute();
        java.util.Date date18 = minute16.getStart();
        java.util.Date date19 = minute16.getEnd();
        long long20 = minute16.getFirstMillisecond();
        java.util.Date date21 = minute16.getStart();
        org.jfree.data.time.Minute minute22 = new org.jfree.data.time.Minute(date21);
        org.jfree.data.time.Minute minute23 = new org.jfree.data.time.Minute(date21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = minute23.next();
        int int25 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute23);
// flaky "44) test550(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "43) test550(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "39) test550(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "32) test550(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "31) test550(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str10, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "23) test550(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813579999L + "'", long11 == 1784813579999L);
        org.junit.Assert.assertNotNull(date12);
// flaky "16) test550(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "14) test550(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
// flaky "10) test550(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(date18);
// flaky "10) test550(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date19);
// flaky "5) test550(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date19.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "4) test550(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813520000L + "'", long20 == 1784813520000L);
        org.junit.Assert.assertNotNull(date21);
// flaky "1) test550(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date21.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test551");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
        int int7 = minute0.getHourValue();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "45) test551(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test552");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = regularTimePeriod1.getMiddleMillisecond();
        java.util.Date date3 = regularTimePeriod1.getStart();
        java.util.TimeZone timeZone4 = null;
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date3, timeZone4, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "46) test552(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813609999L + "'", long2 == 1784813609999L);
        org.junit.Assert.assertNotNull(date3);
// flaky "44) test552(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test553");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) (short) 1, 4, 0, 0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test554");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        long long5 = minute0.getLastMillisecond();
        java.lang.String str6 = minute0.toString();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute7.next();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        int int10 = minute9.getMinute();
        java.util.Date date11 = minute9.getStart();
        boolean boolean12 = minute7.equals((java.lang.Object) date11);
        java.lang.String str13 = minute7.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute7.previous();
        java.util.Date date15 = minute7.getEnd();
        int int16 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute7.next();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "47) test554(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "45) test554(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "40) test554(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
// flaky "33) test554(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "32) test554(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(date11);
// flaky "24) test554(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "17) test554(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str13, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertNotNull(date15);
// flaky "15) test554(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test555");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getFirstMillisecond();
        long long3 = minute0.getLastMillisecond();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = minute0.getLastMillisecond(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "48) test555(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813520000L + "'", long2 == 1784813520000L);
// flaky "46) test555(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test556");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
        long long6 = minute0.getMiddleMillisecond();
        int int7 = minute0.getHourValue();
        long long8 = minute0.getFirstMillisecond();
        long long9 = minute0.getFirstMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "49) test556(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "47) test556(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "41) test556(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "34) test556(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813520000L + "'", long8 == 1784813520000L);
// flaky "33) test556(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813520000L + "'", long9 == 1784813520000L);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test557");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        int int11 = minute5.getHourValue();
        java.util.Date date12 = minute5.getStart();
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute();
        int int14 = minute13.getMinute();
        java.util.Date date15 = minute13.getStart();
        java.util.Date date16 = minute13.getEnd();
        long long17 = minute13.getFirstMillisecond();
        java.util.Date date18 = minute13.getStart();
        java.lang.Class<?> wildcardClass19 = date18.getClass();
        boolean boolean20 = minute5.equals((java.lang.Object) wildcardClass19);
        long long21 = minute5.getMiddleMillisecond();
        int int22 = minute5.getMinute();
// flaky "50) test557(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "48) test557(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "42) test557(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "35) test557(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "34) test557(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "25) test557(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(date12);
// flaky "18) test557(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "16) test557(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(date15);
// flaky "11) test557(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date16);
// flaky "11) test557(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "6) test557(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813520000L + "'", long17 == 1784813520000L);
        org.junit.Assert.assertNotNull(date18);
// flaky "5) test557(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "2) test557(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1784813549999L + "'", long21 == 1784813549999L);
// flaky "1) test557(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test558");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        int int9 = minute7.getHourValue();
        int int10 = minute7.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute7.previous();
        int int12 = minute7.getHourValue();
        boolean boolean13 = minute2.equals((java.lang.Object) int12);
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute();
        long long15 = minute14.getSerialIndex();
        long long16 = minute14.getMiddleMillisecond();
        long long17 = minute14.getFirstMillisecond();
        java.util.Date date18 = minute14.getStart();
        long long19 = minute14.getMiddleMillisecond();
        java.lang.String str20 = minute14.toString();
        int int21 = minute14.getHourValue();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = minute14.previous();
        int int23 = minute2.compareTo((org.jfree.data.time.TimePeriod) minute14);
// flaky "51) test558(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "49) test558(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "43) test558(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "36) test558(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "35) test558(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 66566672L + "'", long15 == 66566672L);
// flaky "26) test558(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
// flaky "19) test558(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813520000L + "'", long17 == 1784813520000L);
        org.junit.Assert.assertNotNull(date18);
// flaky "17) test558(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "12) test558(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813549999L + "'", long19 == 1784813549999L);
// flaky "12) test558(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str20, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test559");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        java.lang.String str11 = minute5.toString();
        java.util.Date date12 = minute5.getStart();
        java.lang.Class<?> wildcardClass13 = minute5.getClass();
// flaky "52) test559(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "50) test559(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "44) test559(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "37) test559(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "36) test559(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "27) test559(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "20) test559(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str11, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "18) test559(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test560");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        long long6 = minute0.getMiddleMillisecond();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute7.next();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        int int10 = minute9.getMinute();
        java.util.Date date11 = minute9.getStart();
        boolean boolean12 = minute7.equals((java.lang.Object) date11);
        boolean boolean14 = minute7.equals((java.lang.Object) '4');
        java.util.Date date15 = minute7.getStart();
        int int16 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute7);
        java.util.Calendar calendar17 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "53) test560(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "51) test560(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "45) test560(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "38) test560(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "37) test560(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "28) test560(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "21) test560(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(date11);
// flaky "19) test560(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky "13) test560(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test561");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        int int11 = minute5.getHourValue();
        org.jfree.data.time.Minute minute12 = new org.jfree.data.time.Minute();
        long long13 = minute12.getSerialIndex();
        long long14 = minute12.getMiddleMillisecond();
        long long15 = minute12.getFirstMillisecond();
        java.util.Date date16 = minute12.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute12.previous();
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute();
        long long19 = minute18.getSerialIndex();
        long long20 = minute18.getMiddleMillisecond();
        long long21 = minute18.getLastMillisecond();
        int int22 = minute12.compareTo((org.jfree.data.time.TimePeriod) minute18);
        int int23 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute12);
        int int24 = minute5.getHourValue();
        java.util.Calendar calendar25 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute5.peg(calendar25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "54) test561(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "52) test561(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "46) test561(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "39) test561(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "38) test561(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "29) test561(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "22) test561(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
// flaky "20) test561(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813549999L + "'", long14 == 1784813549999L);
// flaky "14) test561(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813520000L + "'", long15 == 1784813520000L);
        org.junit.Assert.assertNotNull(date16);
// flaky "13) test561(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "7) test561(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
// flaky "6) test561(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
// flaky "3) test561(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1784813579999L + "'", long21 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test562");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
        long long6 = minute0.getLastMillisecond();
// flaky "55) test562(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "53) test562(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "47) test562(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "40) test562(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "39) test562(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test563");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        long long6 = minute5.getLastMillisecond();
        java.util.Date date7 = minute5.getEnd();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date7);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "56) test563(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "54) test563(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "48) test563(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "41) test563(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test564");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        int int9 = minute7.getHourValue();
        int int10 = minute7.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute7.previous();
        int int12 = minute7.getHourValue();
        boolean boolean13 = minute2.equals((java.lang.Object) int12);
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute14.next();
        long long16 = minute14.getMiddleMillisecond();
        boolean boolean17 = minute2.equals((java.lang.Object) minute14);
        int int18 = minute2.getMinute();
        org.jfree.data.time.Minute minute19 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = minute19.next();
        org.jfree.data.time.Minute minute21 = new org.jfree.data.time.Minute();
        int int22 = minute21.getMinute();
        java.util.Date date23 = minute21.getStart();
        boolean boolean24 = minute19.equals((java.lang.Object) date23);
        java.lang.String str25 = minute19.toString();
        int int26 = minute2.compareTo((org.jfree.data.time.TimePeriod) minute19);
        java.util.Date date27 = minute19.getStart();
        org.jfree.data.time.Minute minute28 = new org.jfree.data.time.Minute(date27);
// flaky "57) test564(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "55) test564(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "49) test564(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "42) test564(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "40) test564(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "30) test564(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod20);
// flaky "23) test564(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(date23);
// flaky "21) test564(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date23.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "15) test564(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str25, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(date27);
// flaky "14) test564(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date27.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test565");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) (byte) 100, (int) (short) 100, 33, 12, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test566");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        int int9 = minute7.getHourValue();
        int int10 = minute7.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute7.previous();
        int int12 = minute7.getHourValue();
        boolean boolean13 = minute2.equals((java.lang.Object) int12);
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute14.next();
        long long16 = minute14.getMiddleMillisecond();
        boolean boolean17 = minute2.equals((java.lang.Object) minute14);
        long long18 = minute14.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = minute14.previous();
        java.util.Date date20 = regularTimePeriod19.getEnd();
        org.jfree.data.time.Minute minute21 = new org.jfree.data.time.Minute(date20);
        org.jfree.data.time.Minute minute22 = new org.jfree.data.time.Minute(date20);
        java.lang.Class<?> wildcardClass23 = date20.getClass();
// flaky "58) test566(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "56) test566(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "50) test566(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "43) test566(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "41) test566(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "31) test566(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 66566672L + "'", long18 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
        org.junit.Assert.assertNotNull(date20);
// flaky "24) test566(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date20.toString(), "Thu Jul 23 20:31:59 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test567");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        java.util.Date date7 = minute0.getEnd();
        long long8 = minute0.getLastMillisecond();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute9.next();
        long long11 = regularTimePeriod10.getMiddleMillisecond();
        int int12 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod10);
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute13.next();
        long long15 = minute13.getMiddleMillisecond();
        int int16 = minute13.getHourValue();
        java.util.Date date17 = minute13.getStart();
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute(date17);
        long long19 = minute18.getLastMillisecond();
        java.util.Date date20 = minute18.getEnd();
        long long21 = minute18.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = minute18.next();
        int int23 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute18);
        long long24 = minute18.getFirstMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "59) test567(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "57) test567(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "51) test567(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "44) test567(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "42) test567(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813609999L + "'", long11 == 1784813609999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(regularTimePeriod14);
// flaky "32) test567(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813549999L + "'", long15 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(date17);
// flaky "25) test567(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date17.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "22) test567(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813579999L + "'", long19 == 1784813579999L);
        org.junit.Assert.assertNotNull(date20);
// flaky "16) test567(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date20.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "15) test567(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 66566672L + "'", long21 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky "8) test567(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1784813520000L + "'", long24 == 1784813520000L);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test568");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        long long4 = minute3.getSerialIndex();
        long long5 = minute3.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute3.next();
        int int7 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod6);
        java.util.Date date8 = regularTimePeriod6.getEnd();
        java.util.Date date9 = regularTimePeriod6.getStart();
// flaky "60) test568(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "58) test568(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "52) test568(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(date8);
// flaky "45) test568(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertNotNull(date9);
// flaky "43) test568(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test569");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        java.util.Date date7 = minute0.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute0.previous();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        long long10 = minute9.getSerialIndex();
        long long11 = minute9.getMiddleMillisecond();
        long long12 = minute9.getLastMillisecond();
        long long13 = minute9.getFirstMillisecond();
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute14.next();
        long long16 = minute14.getMiddleMillisecond();
        int int17 = minute14.getHourValue();
        int int18 = minute14.getMinute();
        int int19 = minute9.compareTo((org.jfree.data.time.TimePeriod) minute14);
        int int20 = minute14.getHourValue();
        org.jfree.data.time.Minute minute21 = new org.jfree.data.time.Minute();
        long long22 = minute21.getSerialIndex();
        long long23 = minute21.getMiddleMillisecond();
        long long24 = minute21.getFirstMillisecond();
        java.util.Date date25 = minute21.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = minute21.previous();
        org.jfree.data.time.Minute minute27 = new org.jfree.data.time.Minute();
        long long28 = minute27.getSerialIndex();
        long long29 = minute27.getMiddleMillisecond();
        long long30 = minute27.getLastMillisecond();
        int int31 = minute21.compareTo((org.jfree.data.time.TimePeriod) minute27);
        int int32 = minute14.compareTo((org.jfree.data.time.TimePeriod) minute21);
        boolean boolean33 = minute0.equals((java.lang.Object) minute21);
        java.util.Calendar calendar34 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long35 = minute0.getMiddleMillisecond(calendar34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "61) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "59) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "53) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "46) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 66566672L + "'", long10 == 66566672L);
// flaky "44) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
// flaky "33) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
// flaky "26) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813520000L + "'", long13 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "23) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
// flaky "17) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
// flaky "16) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 66566672L + "'", long22 == 66566672L);
// flaky "9) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1784813549999L + "'", long23 == 1784813549999L);
// flaky "7) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1784813520000L + "'", long24 == 1784813520000L);
        org.junit.Assert.assertNotNull(date25);
// flaky "4) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date25.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod26);
// flaky "2) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 66566672L + "'", long28 == 66566672L);
// flaky "1) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1784813549999L + "'", long29 == 1784813549999L);
// flaky "1) test569(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1784813579999L + "'", long30 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test570");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        int int2 = minute0.getHourValue();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute3.next();
        long long5 = minute3.getMiddleMillisecond();
        int int6 = minute3.getHourValue();
        int int7 = minute3.getMinute();
        long long8 = minute3.getLastMillisecond();
        long long9 = minute3.getSerialIndex();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute3);
        int int11 = minute0.getMinute();
        java.lang.String str12 = minute0.toString();
// flaky "62) test570(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "60) test570(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "54) test570(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "47) test570(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "45) test570(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "34) test570(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
// flaky "27) test570(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str12, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test571");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        long long6 = minute0.getLastMillisecond();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        long long8 = minute7.getSerialIndex();
        long long9 = minute7.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute7.next();
        int int11 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute0.next();
        java.lang.String str13 = minute0.toString();
        java.util.Calendar calendar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "63) test571(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "61) test571(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "55) test571(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "48) test571(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "46) test571(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "35) test571(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "28) test571(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
// flaky "24) test571(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "18) test571(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str13, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test572");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.previous();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = minute0.getLastMillisecond(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "64) test572(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "62) test572(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test573");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        int int7 = minute0.getMinute();
        java.lang.String str8 = minute0.toString();
        int int9 = minute0.getMinute();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "65) test573(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "63) test573(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "56) test573(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "49) test573(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str8, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "47) test573(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test574");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.lang.String str6 = minute0.toString();
        int int7 = minute0.getHourValue();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute0.previous();
        java.util.Date date9 = regularTimePeriod8.getEnd();
// flaky "66) test574(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "64) test574(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "57) test574(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "50) test574(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "48) test574(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "36) test574(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(date9);
// flaky "29) test574(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:31:59 ICT 2026");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test575");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        boolean boolean7 = minute0.equals((java.lang.Object) '4');
        java.util.Date date8 = minute0.getStart();
        java.util.Date date9 = minute0.getEnd();
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date9, calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "67) test575(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "65) test575(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "58) test575(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date9);
// flaky "51) test575(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test576");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        java.util.Date date10 = minute6.getStart();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date10);
        boolean boolean12 = minute0.equals((java.lang.Object) minute11);
        java.lang.Class<?> wildcardClass13 = minute11.getClass();
// flaky "68) test576(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "66) test576(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "59) test576(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "52) test576(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "49) test576(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "37) test576(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(date10);
// flaky "30) test576(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test577");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = minute0.getEnd();
        java.lang.String str5 = minute0.toString();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor6 = null;
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = minute0.getMillisecond(timePeriodAnchor6, calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "69) test577(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "67) test577(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "60) test577(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "53) test577(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test578");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(0, (int) (short) 100, (int) (short) 100, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test579");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        boolean boolean7 = minute0.equals((java.lang.Object) '4');
        long long8 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute9.next();
        long long11 = minute9.getMiddleMillisecond();
        long long12 = minute9.getFirstMillisecond();
        java.util.Date date13 = minute9.getStart();
        boolean boolean14 = minute0.equals((java.lang.Object) date13);
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "70) test579(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "68) test579(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "61) test579(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "54) test579(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
// flaky "50) test579(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813520000L + "'", long12 == 1784813520000L);
        org.junit.Assert.assertNotNull(date13);
// flaky "38) test579(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test580");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        int int11 = minute0.getHourValue();
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = minute0.getFirstMillisecond(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "71) test580(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "69) test580(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "62) test580(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "55) test580(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "51) test580(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "39) test580(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test581");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) '#', 7, (int) (short) 0, (int) 'a', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test582");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getFirstMillisecond();
        int int6 = minute0.getHourValue();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "72) test582(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "70) test582(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "63) test582(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813520000L + "'", long5 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test583");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
        long long6 = minute0.getMiddleMillisecond();
        int int7 = minute0.getHourValue();
        java.util.Date date8 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute0.next();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "73) test583(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "71) test583(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "64) test583(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(date8);
// flaky "56) test583(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod9);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test584");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date5);
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date5, calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "74) test584(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "72) test584(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "65) test584(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "57) test584(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "52) test584(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test585");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.lang.Object obj5 = null;
        boolean boolean6 = minute0.equals(obj5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        long long10 = minute8.getMiddleMillisecond();
        long long11 = minute8.getFirstMillisecond();
        java.util.Date date12 = minute8.getStart();
        long long13 = minute8.getMiddleMillisecond();
        long long14 = minute8.getMiddleMillisecond();
        java.lang.String str15 = minute8.toString();
        int int16 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute8);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "75) test585(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "73) test585(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "66) test585(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "58) test585(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
// flaky "53) test585(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813520000L + "'", long11 == 1784813520000L);
        org.junit.Assert.assertNotNull(date12);
// flaky "40) test585(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "31) test585(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
// flaky "25) test585(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813549999L + "'", long14 == 1784813549999L);
// flaky "19) test585(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str15, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test586");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) (short) 100, (int) (short) 100, (int) (byte) 1, 7, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test587");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        java.lang.String str11 = minute5.toString();
        java.util.Date date12 = minute5.getStart();
        int int13 = minute5.getMinute();
        java.util.Date date14 = minute5.getStart();
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute(date14, calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "76) test587(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "74) test587(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "67) test587(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "59) test587(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "54) test587(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "41) test587(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "32) test587(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str11, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "26) test587(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "20) test587(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(date14);
// flaky "17) test587(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date14.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test588");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        int int9 = minute7.getHourValue();
        int int10 = minute7.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute7.previous();
        int int12 = minute7.getHourValue();
        boolean boolean13 = minute2.equals((java.lang.Object) int12);
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute14.next();
        long long16 = minute14.getMiddleMillisecond();
        boolean boolean17 = minute2.equals((java.lang.Object) minute14);
        int int18 = minute2.getMinute();
        org.jfree.data.time.Minute minute19 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = minute19.next();
        org.jfree.data.time.Minute minute21 = new org.jfree.data.time.Minute();
        int int22 = minute21.getMinute();
        java.util.Date date23 = minute21.getStart();
        boolean boolean24 = minute19.equals((java.lang.Object) date23);
        java.lang.String str25 = minute19.toString();
        int int26 = minute2.compareTo((org.jfree.data.time.TimePeriod) minute19);
        long long27 = minute19.getSerialIndex();
// flaky "77) test588(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "75) test588(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "68) test588(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "60) test588(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "55) test588(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "42) test588(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod20);
// flaky "33) test588(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(date23);
// flaky "27) test588(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date23.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "21) test588(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str25, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky "18) test588(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 66566672L + "'", long27 == 66566672L);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test589");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        int int5 = minute0.getMinute();
        java.util.Date date6 = minute0.getEnd();
        java.lang.String str7 = minute0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute0.next();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute9.next();
        long long11 = minute9.getMiddleMillisecond();
        int int12 = minute9.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod13 = null;
        int int14 = minute9.compareTo(timePeriod13);
        long long15 = minute9.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = minute9.next();
        int int17 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod16);
        long long18 = regularTimePeriod16.getMiddleMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "78) test589(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "76) test589(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "69) test589(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky "61) test589(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "56) test589(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str7, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "43) test589(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky "34) test589(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813579999L + "'", long15 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky "28) test589(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813609999L + "'", long18 == 1784813609999L);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test590");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        java.lang.String str11 = minute5.toString();
        java.util.Date date12 = minute5.getStart();
        java.util.Calendar calendar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute(date12, calendar13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "79) test590(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "77) test590(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "70) test590(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "62) test590(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "57) test590(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "44) test590(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "35) test590(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str11, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "29) test590(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test591");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        java.util.Date date8 = minute0.getEnd();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor9 = null;
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = minute0.getMillisecond(timePeriodAnchor9, calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "80) test591(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "78) test591(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "71) test591(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "63) test591(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test592");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        java.util.Date date6 = minute5.getStart();
        int int7 = minute5.getHourValue();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute5.next();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute9.next();
        long long11 = minute9.getMiddleMillisecond();
        int int12 = minute9.getHourValue();
        int int13 = minute9.getMinute();
        long long14 = minute9.getLastMillisecond();
        boolean boolean16 = minute9.equals((java.lang.Object) 6);
        long long17 = minute9.getLastMillisecond();
        int int18 = minute9.getHourValue();
        boolean boolean19 = minute5.equals((java.lang.Object) int18);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "81) test592(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "79) test592(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "72) test592(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "64) test592(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
// flaky "58) test592(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
// flaky "45) test592(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813579999L + "'", long14 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "36) test592(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813579999L + "'", long17 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test593");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        java.util.Date date8 = minute0.getEnd();
        java.util.Date date9 = minute0.getEnd();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor10 = null;
        java.util.Calendar calendar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = minute0.getMillisecond(timePeriodAnchor10, calendar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "82) test593(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "80) test593(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "73) test593(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "65) test593(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(date9);
// flaky "59) test593(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test594");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "83) test594(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "81) test594(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "74) test594(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "66) test594(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test595");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        java.lang.String str6 = minute0.toString();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        java.util.Date date9 = minute7.getStart();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute7);
        long long11 = minute7.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute7.next();
        long long13 = minute7.getSerialIndex();
        int int14 = minute7.getMinute();
        java.lang.String str15 = minute7.toString();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "84) test595(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "82) test595(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "75) test595(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "67) test595(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "60) test595(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "46) test595(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66566672L + "'", long11 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "37) test595(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
// flaky "30) test595(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
// flaky "22) test595(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str15, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test596");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.next();
        int int5 = minute0.getHourValue();
// flaky "85) test596(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "83) test596(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test597");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getMiddleMillisecond();
        long long6 = minute0.getMiddleMillisecond();
        long long7 = minute0.getLastMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "86) test597(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "84) test597(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "76) test597(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "68) test597(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
// flaky "61) test597(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813579999L + "'", long7 == 1784813579999L);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test598");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        boolean boolean7 = minute0.equals((java.lang.Object) '4');
        long long8 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute9.next();
        long long11 = minute9.getMiddleMillisecond();
        int int12 = minute9.getHourValue();
        java.util.Date date13 = minute9.getStart();
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute(date13);
        long long15 = minute14.getLastMillisecond();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute16.next();
        long long18 = minute16.getMiddleMillisecond();
        int int19 = minute16.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod20 = null;
        int int21 = minute16.compareTo(timePeriod20);
        long long22 = minute16.getLastMillisecond();
        int int23 = minute14.compareTo((org.jfree.data.time.TimePeriod) minute16);
        int int24 = minute16.getHourValue();
        long long25 = minute16.getFirstMillisecond();
        boolean boolean26 = minute0.equals((java.lang.Object) minute16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = minute16.next();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "87) test598(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "85) test598(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "77) test598(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "69) test598(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(date13);
// flaky "62) test598(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "47) test598(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813579999L + "'", long15 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "38) test598(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813549999L + "'", long18 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
// flaky "31) test598(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1784813579999L + "'", long22 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
// flaky "23) test598(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1784813520000L + "'", long25 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod27);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test599");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(1, (int) (short) 1, 1, 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test600");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        long long3 = minute0.getFirstMillisecond();
        long long4 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.next();
// flaky "88) test600(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "86) test600(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
// flaky "78) test600(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test601");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.previous();
        java.lang.String str7 = minute0.toString();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute10.next();
        long long12 = minute10.getMiddleMillisecond();
        int int13 = minute10.getHourValue();
        int int14 = minute8.compareTo((org.jfree.data.time.TimePeriod) minute10);
        org.jfree.data.time.Minute minute15 = new org.jfree.data.time.Minute();
        int int16 = minute15.getMinute();
        int int17 = minute15.getHourValue();
        int int18 = minute15.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = minute15.previous();
        int int20 = minute15.getHourValue();
        boolean boolean21 = minute10.equals((java.lang.Object) int20);
        org.jfree.data.time.Minute minute22 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = minute22.next();
        long long24 = minute22.getMiddleMillisecond();
        boolean boolean25 = minute10.equals((java.lang.Object) minute22);
        int int26 = minute10.getMinute();
        org.jfree.data.time.Minute minute27 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = minute27.next();
        org.jfree.data.time.Minute minute29 = new org.jfree.data.time.Minute();
        int int30 = minute29.getMinute();
        java.util.Date date31 = minute29.getStart();
        boolean boolean32 = minute27.equals((java.lang.Object) date31);
        java.lang.String str33 = minute27.toString();
        int int34 = minute10.compareTo((org.jfree.data.time.TimePeriod) minute27);
        long long35 = minute10.getMiddleMillisecond();
        boolean boolean36 = minute0.equals((java.lang.Object) minute10);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "89) test601(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "87) test601(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "79) test601(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str7, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "70) test601(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
// flaky "63) test601(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813549999L + "'", long12 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky "48) test601(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
// flaky "39) test601(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod23);
// flaky "32) test601(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1784813549999L + "'", long24 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky "24) test601(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
// flaky "19) test601(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(date31);
// flaky "10) test601(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date31.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "8) test601(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str33, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
// flaky "5) test601(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1784813549999L + "'", long35 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test602");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = regularTimePeriod3.getEnd();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        java.util.Date date6 = minute5.getEnd();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute7.previous();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = minute7.getLastMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "90) test602(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "88) test602(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "80) test602(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "71) test602(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod8);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test603");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = regularTimePeriod7.getMiddleMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "91) test603(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "89) test603(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test604");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        int int5 = minute0.getMinute();
        java.util.Date date6 = minute0.getEnd();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date6);
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date6);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "92) test604(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "90) test604(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "81) test604(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky "72) test604(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test605");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        long long6 = minute0.getLastMillisecond();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        long long8 = minute7.getSerialIndex();
        long long9 = minute7.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute7.next();
        int int11 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute0.next();
        java.lang.String str13 = regularTimePeriod12.toString();
        java.util.Calendar calendar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = regularTimePeriod12.getMiddleMillisecond(calendar14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "93) test605(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "91) test605(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "82) test605(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "73) test605(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "64) test605(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "49) test605(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "40) test605(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
// flaky "33) test605(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "25) test605(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Thu Jul 23 20:33:00 ICT 2026" + "'", str13, "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test606");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        int int9 = minute7.getHourValue();
        int int10 = minute7.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute7.previous();
        int int12 = minute7.getHourValue();
        boolean boolean13 = minute2.equals((java.lang.Object) int12);
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute14.next();
        long long16 = minute14.getMiddleMillisecond();
        boolean boolean17 = minute2.equals((java.lang.Object) minute14);
        long long18 = minute14.getSerialIndex();
        java.lang.Class<?> wildcardClass19 = minute14.getClass();
// flaky "94) test606(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "92) test606(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "83) test606(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "74) test606(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "65) test606(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "50) test606(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 66566672L + "'", long18 == 66566672L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test607");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        int int11 = minute5.getHourValue();
        java.util.Date date12 = minute5.getStart();
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute();
        int int14 = minute13.getMinute();
        int int15 = minute13.getHourValue();
        long long16 = minute13.getFirstMillisecond();
        java.util.Date date17 = minute13.getEnd();
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute(date17);
        boolean boolean19 = minute5.equals((java.lang.Object) minute18);
// flaky "95) test607(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "93) test607(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "84) test607(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "75) test607(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "66) test607(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "51) test607(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(date12);
// flaky "41) test607(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "34) test607(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
// flaky "26) test607(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813520000L + "'", long16 == 1784813520000L);
        org.junit.Assert.assertNotNull(date17);
// flaky "20) test607(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date17.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test608");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        int int11 = minute5.getHourValue();
        java.util.Date date12 = minute5.getStart();
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute();
        int int14 = minute13.getMinute();
        java.util.Date date15 = minute13.getStart();
        java.util.Date date16 = minute13.getEnd();
        long long17 = minute13.getFirstMillisecond();
        java.util.Date date18 = minute13.getStart();
        java.lang.Class<?> wildcardClass19 = date18.getClass();
        boolean boolean20 = minute5.equals((java.lang.Object) wildcardClass19);
        java.util.Date date21 = minute5.getEnd();
        java.util.Calendar calendar22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = minute5.getMiddleMillisecond(calendar22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "96) test608(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "94) test608(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "85) test608(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "76) test608(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "67) test608(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "52) test608(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(date12);
// flaky "42) test608(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "35) test608(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(date15);
// flaky "27) test608(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date16);
// flaky "21) test608(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "11) test608(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813520000L + "'", long17 == 1784813520000L);
        org.junit.Assert.assertNotNull(date18);
// flaky "9) test608(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date21);
// flaky "6) test608(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date21.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test609");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        int int11 = minute6.compareTo(timePeriod10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute6.next();
        int int13 = minute6.getMinute();
        boolean boolean14 = minute0.equals((java.lang.Object) minute6);
        org.jfree.data.time.Minute minute15 = new org.jfree.data.time.Minute();
        long long16 = minute15.getSerialIndex();
        long long17 = minute15.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = minute15.next();
        long long19 = minute15.getFirstMillisecond();
        int int20 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute15);
        int int21 = minute0.getHourValue();
        java.util.Date date22 = minute0.getStart();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor23 = null;
        java.util.Calendar calendar24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = minute0.getMillisecond(timePeriodAnchor23, calendar24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "97) test609(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "95) test609(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "86) test609(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "77) test609(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66566672L + "'", long16 == 66566672L);
// flaky "68) test609(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
// flaky "53) test609(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813520000L + "'", long19 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(date22);
// flaky "43) test609(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date22.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test610");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        java.lang.String str6 = minute0.toString();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        java.util.Date date9 = minute7.getStart();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute7);
        long long11 = minute7.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute7.next();
        long long13 = minute7.getSerialIndex();
        java.util.Date date14 = minute7.getEnd();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "98) test610(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "96) test610(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "87) test610(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "78) test610(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "69) test610(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "54) test610(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66566672L + "'", long11 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "44) test610(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
        org.junit.Assert.assertNotNull(date14);
// flaky "36) test610(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date14.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test611");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
        java.lang.String str6 = minute0.toString();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute7.next();
        long long9 = minute7.getMiddleMillisecond();
        int int10 = minute7.getHourValue();
        int int11 = minute7.getMinute();
        long long12 = minute7.getLastMillisecond();
        boolean boolean14 = minute7.equals((java.lang.Object) 6);
        java.util.Date date15 = minute7.getEnd();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute(date15);
        int int17 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute16);
        java.util.Calendar calendar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = minute0.getFirstMillisecond(calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "99) test611(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "97) test611(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "88) test611(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "79) test611(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "70) test611(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "55) test611(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
// flaky "45) test611(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
// flaky "37) test611(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky "28) test611(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test612");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        java.util.Date date10 = minute6.getStart();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date10);
        boolean boolean12 = minute0.equals((java.lang.Object) minute11);
        int int13 = minute11.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute11.previous();
        long long15 = minute11.getMiddleMillisecond();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute();
        long long17 = minute16.getSerialIndex();
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = minute18.next();
        long long20 = minute18.getMiddleMillisecond();
        int int21 = minute18.getHourValue();
        int int22 = minute16.compareTo((org.jfree.data.time.TimePeriod) minute18);
        boolean boolean23 = minute11.equals((java.lang.Object) minute18);
// flaky "100) test612(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "98) test612(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "89) test612(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "80) test612(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "71) test612(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "56) test612(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(date10);
// flaky "46) test612(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "38) test612(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
// flaky "29) test612(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813549999L + "'", long15 == 1784813549999L);
// flaky "22) test612(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 66566672L + "'", long17 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
// flaky "12) test612(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test613");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute4.next();
        long long6 = minute4.getMiddleMillisecond();
        int int7 = minute4.getHourValue();
        long long8 = minute4.getSerialIndex();
        int int9 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute4);
        long long10 = minute4.getLastMillisecond();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute();
        int int12 = minute11.getMinute();
        int int13 = minute11.getHourValue();
        int int14 = minute11.getMinute();
        org.jfree.data.time.Minute minute15 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = minute15.next();
        long long17 = minute15.getMiddleMillisecond();
        int int18 = minute15.getHourValue();
        long long19 = minute15.getSerialIndex();
        int int20 = minute11.compareTo((org.jfree.data.time.TimePeriod) minute15);
        java.lang.String str21 = minute11.toString();
        int int22 = minute4.compareTo((org.jfree.data.time.TimePeriod) minute11);
        long long23 = minute11.getSerialIndex();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor24 = null;
        java.util.Calendar calendar25 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long26 = minute11.getMillisecond(timePeriodAnchor24, calendar25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "101) test613(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "99) test613(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "90) test613(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "81) test613(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "72) test613(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813579999L + "'", long10 == 1784813579999L);
// flaky "57) test613(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
// flaky "47) test613(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
// flaky "39) test613(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
// flaky "30) test613(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky "23) test613(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str21, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky "13) test613(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 66566672L + "'", long23 == 66566672L);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test614");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(59, (int) (short) 0, (int) (byte) 10, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test615");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        long long6 = minute5.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute5.next();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "102) test615(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "100) test615(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "91) test615(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test616");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        int int7 = minute6.getMinute();
        java.util.Date date8 = minute6.getStart();
        java.util.Date date9 = minute6.getEnd();
        long long10 = minute6.getFirstMillisecond();
        java.util.Date date11 = minute6.getStart();
        org.jfree.data.time.Minute minute12 = new org.jfree.data.time.Minute(date11);
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute(date11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute13.next();
        boolean boolean15 = minute0.equals((java.lang.Object) minute13);
        long long16 = minute13.getSerialIndex();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "103) test616(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "101) test616(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(date8);
// flaky "92) test616(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date9);
// flaky "82) test616(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "73) test616(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813520000L + "'", long10 == 1784813520000L);
        org.junit.Assert.assertNotNull(date11);
// flaky "58) test616(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "48) test616(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66566672L + "'", long16 == 66566672L);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test617");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = minute0.next();
        java.util.Date date3 = regularTimePeriod2.getEnd();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor4 = null;
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = regularTimePeriod2.getMillisecond(timePeriodAnchor4, calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
// flaky "104) test617(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertNotNull(date3);
// flaky "102) test617(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test618");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = minute0.next();
        java.util.Date date3 = regularTimePeriod2.getEnd();
        java.util.TimeZone timeZone4 = null;
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date3, timeZone4, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
// flaky "105) test618(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertNotNull(date3);
// flaky "103) test618(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test619");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        long long4 = minute3.getSerialIndex();
        long long5 = minute3.getMiddleMillisecond();
        long long6 = minute3.getLastMillisecond();
        long long7 = minute3.getFirstMillisecond();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute8.next();
        long long10 = minute8.getMiddleMillisecond();
        int int11 = minute8.getHourValue();
        int int12 = minute8.getMinute();
        int int13 = minute3.compareTo((org.jfree.data.time.TimePeriod) minute8);
        java.lang.String str14 = minute8.toString();
        boolean boolean15 = minute0.equals((java.lang.Object) minute8);
        int int16 = minute0.getMinute();
        org.jfree.data.time.Minute minute17 = new org.jfree.data.time.Minute();
        long long18 = minute17.getSerialIndex();
        long long19 = minute17.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = minute17.next();
        java.util.Date date21 = regularTimePeriod20.getEnd();
        org.jfree.data.time.Minute minute22 = new org.jfree.data.time.Minute(date21);
        java.util.Date date23 = minute22.getEnd();
        org.jfree.data.time.Minute minute24 = new org.jfree.data.time.Minute(date23);
        org.jfree.data.time.Minute minute25 = new org.jfree.data.time.Minute(date23);
        boolean boolean26 = minute0.equals((java.lang.Object) minute25);
        java.util.Calendar calendar27 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long28 = minute0.getFirstMillisecond(calendar27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "106) test619(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "104) test619(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "93) test619(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "83) test619(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "74) test619(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "59) test619(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
// flaky "49) test619(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "40) test619(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "31) test619(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str14, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "24) test619(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
// flaky "14) test619(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 66566672L + "'", long18 == 66566672L);
// flaky "10) test619(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813549999L + "'", long19 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod20);
        org.junit.Assert.assertNotNull(date21);
// flaky "7) test619(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date21.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertNotNull(date23);
// flaky "3) test619(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date23.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test620");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute4.next();
        long long6 = minute4.getMiddleMillisecond();
        int int7 = minute4.getHourValue();
        long long8 = minute4.getSerialIndex();
        int int9 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute4);
        long long10 = minute4.getLastMillisecond();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute();
        int int12 = minute11.getMinute();
        int int13 = minute11.getHourValue();
        int int14 = minute11.getMinute();
        org.jfree.data.time.Minute minute15 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = minute15.next();
        long long17 = minute15.getMiddleMillisecond();
        int int18 = minute15.getHourValue();
        long long19 = minute15.getSerialIndex();
        int int20 = minute11.compareTo((org.jfree.data.time.TimePeriod) minute15);
        java.lang.String str21 = minute11.toString();
        int int22 = minute4.compareTo((org.jfree.data.time.TimePeriod) minute11);
        long long23 = minute11.getSerialIndex();
        java.lang.Class<?> wildcardClass24 = minute11.getClass();
// flaky "107) test620(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "105) test620(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "94) test620(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "84) test620(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "75) test620(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813579999L + "'", long10 == 1784813579999L);
// flaky "60) test620(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
// flaky "50) test620(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
// flaky "41) test620(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
// flaky "32) test620(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky "25) test620(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str21, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
// flaky "15) test620(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 66566672L + "'", long23 == 66566672L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test621");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        long long4 = regularTimePeriod3.getMiddleMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "108) test621(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813520000L + "'", long2 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "106) test621(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813609999L + "'", long4 == 1784813609999L);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test622");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        java.lang.Object obj8 = null;
        boolean boolean9 = minute0.equals(obj8);
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "109) test622(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "107) test622(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test623");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        long long8 = minute0.getMiddleMillisecond();
        int int9 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute0.previous();
        java.util.Date date11 = minute0.getStart();
        java.util.TimeZone timeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute(date11, timeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "110) test623(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "108) test623(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "95) test623(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "85) test623(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
// flaky "76) test623(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertNotNull(date11);
// flaky "61) test623(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test624");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getEnd();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute(date1);
        org.junit.Assert.assertNotNull(date1);
// flaky "111) test624(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test625");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        long long5 = minute0.getLastMillisecond();
        java.lang.String str6 = minute0.toString();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute7.next();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        int int10 = minute9.getMinute();
        java.util.Date date11 = minute9.getStart();
        boolean boolean12 = minute7.equals((java.lang.Object) date11);
        java.lang.String str13 = minute7.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute7.previous();
        java.util.Date date15 = minute7.getEnd();
        int int16 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute7);
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor17 = null;
        java.util.Calendar calendar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = minute7.getMillisecond(timePeriodAnchor17, calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "112) test625(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "109) test625(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "96) test625(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
// flaky "86) test625(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "77) test625(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(date11);
// flaky "62) test625(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "51) test625(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str13, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertNotNull(date15);
// flaky "42) test625(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test626");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        long long6 = minute5.getLastMillisecond();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute7.next();
        long long9 = minute7.getMiddleMillisecond();
        int int10 = minute7.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        int int12 = minute7.compareTo(timePeriod11);
        long long13 = minute7.getLastMillisecond();
        int int14 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute7);
        int int15 = minute7.getHourValue();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = minute7.previous();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "113) test626(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "110) test626(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "97) test626(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "87) test626(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky "78) test626(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813579999L + "'", long13 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test627");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        long long3 = minute0.getFirstMillisecond();
        java.lang.String str4 = minute0.toString();
        org.jfree.data.time.Day day5 = minute0.getDay();
// flaky "114) test627(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "111) test627(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
// flaky "98) test627(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str4, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(day5);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test628");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(20, (int) (short) -1, (int) '4', (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test629");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        long long6 = minute0.getMiddleMillisecond();
        java.lang.String str7 = minute0.toString();
        java.lang.String str8 = minute0.toString();
        java.util.Date date9 = minute0.getEnd();
// flaky "115) test629(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "112) test629(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "99) test629(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "88) test629(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "79) test629(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "63) test629(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
// flaky "52) test629(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str7, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "43) test629(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str8, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date9);
// flaky "33) test629(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test630");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getEnd();
        org.jfree.data.time.Hour hour5 = minute0.getHour();
// flaky "116) test630(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "113) test630(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "100) test630(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(hour5);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test631");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
        long long6 = minute0.getFirstMillisecond();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor7 = null;
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute0.getMillisecond(timePeriodAnchor7, calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "117) test631(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "114) test631(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "101) test631(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "89) test631(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "80) test631(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813520000L + "'", long6 == 1784813520000L);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test632");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
        java.util.Date date7 = minute0.getEnd();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "118) test632(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "115) test632(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date7);
// flaky "102) test632(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test633");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(100, 0, 3, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test634");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.previous();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        java.util.Date date9 = minute7.getStart();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute7);
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute11.next();
        long long13 = minute11.getMiddleMillisecond();
        int int14 = minute11.getHourValue();
        java.util.Date date15 = minute11.getStart();
        java.util.Date date16 = minute11.getStart();
        long long17 = minute11.getLastMillisecond();
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = minute18.next();
        long long20 = minute18.getMiddleMillisecond();
        int int21 = minute18.getHourValue();
        int int22 = minute18.getMinute();
        long long23 = minute18.getLastMillisecond();
        boolean boolean25 = minute18.equals((java.lang.Object) 6);
        long long26 = minute18.getMiddleMillisecond();
        boolean boolean27 = minute11.equals((java.lang.Object) minute18);
        int int28 = minute7.compareTo((org.jfree.data.time.TimePeriod) minute18);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = minute18.previous();
        long long30 = minute18.getMiddleMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "119) test634(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "116) test634(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "103) test634(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "90) test634(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "81) test634(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(date15);
// flaky "64) test634(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date16);
// flaky "53) test634(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "44) test634(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813579999L + "'", long17 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
// flaky "34) test634(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
// flaky "26) test634(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
// flaky "16) test634(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1784813579999L + "'", long23 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "11) test634(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1784813549999L + "'", long26 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod29);
// flaky "8) test634(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1784813549999L + "'", long30 == 1784813549999L);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test635");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        int int7 = minute0.getHourValue();
        long long8 = minute0.getLastMillisecond();
        java.lang.Class<?> wildcardClass9 = minute0.getClass();
// flaky "120) test635(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "117) test635(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "104) test635(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "91) test635(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test636");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        long long4 = minute3.getSerialIndex();
        long long5 = minute3.getMiddleMillisecond();
        long long6 = minute3.getLastMillisecond();
        long long7 = minute3.getFirstMillisecond();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute8.next();
        long long10 = minute8.getMiddleMillisecond();
        int int11 = minute8.getHourValue();
        int int12 = minute8.getMinute();
        int int13 = minute3.compareTo((org.jfree.data.time.TimePeriod) minute8);
        java.lang.String str14 = minute8.toString();
        boolean boolean15 = minute0.equals((java.lang.Object) minute8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = minute8.next();
// flaky "121) test636(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "118) test636(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "105) test636(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "92) test636(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "82) test636(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "65) test636(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
// flaky "54) test636(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "45) test636(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "35) test636(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str14, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test637");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        java.lang.Object obj8 = null;
        boolean boolean9 = minute0.equals(obj8);
        java.util.Date date10 = minute0.getEnd();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date10);
// flaky "122) test637(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "119) test637(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
// flaky "106) test637(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test638");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        int int11 = minute5.getHourValue();
        java.util.Date date12 = minute5.getStart();
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute();
        int int14 = minute13.getMinute();
        java.util.Date date15 = minute13.getStart();
        java.util.Date date16 = minute13.getEnd();
        long long17 = minute13.getFirstMillisecond();
        java.util.Date date18 = minute13.getStart();
        java.lang.Class<?> wildcardClass19 = date18.getClass();
        boolean boolean20 = minute5.equals((java.lang.Object) wildcardClass19);
        java.util.Date date21 = minute5.getEnd();
        org.jfree.data.time.Minute minute22 = new org.jfree.data.time.Minute(date21);
        org.jfree.data.time.Minute minute23 = new org.jfree.data.time.Minute(date21);
        java.util.Calendar calendar24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute25 = new org.jfree.data.time.Minute(date21, calendar24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "123) test638(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "120) test638(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "107) test638(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "93) test638(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "83) test638(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "66) test638(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(date12);
// flaky "55) test638(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "46) test638(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(date15);
// flaky "36) test638(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date16);
// flaky "27) test638(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "17) test638(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813520000L + "'", long17 == 1784813520000L);
        org.junit.Assert.assertNotNull(date18);
// flaky "12) test638(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date21);
// flaky "9) test638(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date21.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test639");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute4.next();
        long long6 = minute4.getMiddleMillisecond();
        int int7 = minute4.getHourValue();
        long long8 = minute4.getSerialIndex();
        int int9 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute0.previous();
        java.util.Date date11 = regularTimePeriod10.getStart();
        org.jfree.data.time.Minute minute12 = new org.jfree.data.time.Minute(date11);
        long long13 = minute12.getMiddleMillisecond();
// flaky "124) test639(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "121) test639(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "108) test639(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "94) test639(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertNotNull(date11);
// flaky "84) test639(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:31:00 ICT 2026");
// flaky "67) test639(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813489999L + "'", long13 == 1784813489999L);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test640");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        int int11 = minute5.getHourValue();
        java.util.Date date12 = minute5.getStart();
        java.util.Calendar calendar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = minute5.getFirstMillisecond(calendar13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "125) test640(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "122) test640(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "109) test640(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "95) test640(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "85) test640(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "68) test640(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(date12);
// flaky "56) test640(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test641");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        boolean boolean4 = minute0.equals((java.lang.Object) 8);
        long long5 = minute0.getSerialIndex();
        java.lang.Class<?> wildcardClass6 = minute0.getClass();
// flaky "126) test641(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "123) test641(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 66566672L + "'", long5 == 66566672L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test642");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        int int9 = minute7.getHourValue();
        int int10 = minute7.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute7.previous();
        int int12 = minute7.getHourValue();
        boolean boolean13 = minute2.equals((java.lang.Object) int12);
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute14.next();
        long long16 = minute14.getMiddleMillisecond();
        boolean boolean17 = minute2.equals((java.lang.Object) minute14);
        long long18 = minute14.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = minute14.previous();
        java.util.Date date20 = regularTimePeriod19.getEnd();
        java.util.Calendar calendar21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = regularTimePeriod19.getMiddleMillisecond(calendar21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "127) test642(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "124) test642(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "110) test642(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "96) test642(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "86) test642(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "69) test642(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 66566672L + "'", long18 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
        org.junit.Assert.assertNotNull(date20);
// flaky "57) test642(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date20.toString(), "Thu Jul 23 20:31:59 ICT 2026");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test643");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        java.util.Date date5 = minute0.getStart();
        long long6 = minute0.getLastMillisecond();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = minute0.getFirstMillisecond(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "128) test643(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "125) test643(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date5);
// flaky "111) test643(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "97) test643(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test644");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        java.util.Date date7 = minute0.getEnd();
        long long8 = minute0.getLastMillisecond();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute9.next();
        long long11 = regularTimePeriod10.getMiddleMillisecond();
        int int12 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod10);
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute13.next();
        long long15 = minute13.getMiddleMillisecond();
        int int16 = minute13.getHourValue();
        java.util.Date date17 = minute13.getStart();
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute(date17);
        long long19 = minute18.getLastMillisecond();
        java.util.Date date20 = minute18.getEnd();
        long long21 = minute18.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = minute18.next();
        int int23 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute18);
        java.util.Date date24 = minute0.getStart();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "129) test644(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "126) test644(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "112) test644(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "98) test644(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "87) test644(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813609999L + "'", long11 == 1784813609999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(regularTimePeriod14);
// flaky "70) test644(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813549999L + "'", long15 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(date17);
// flaky "58) test644(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date17.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "47) test644(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813579999L + "'", long19 == 1784813579999L);
        org.junit.Assert.assertNotNull(date20);
// flaky "37) test644(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date20.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "28) test644(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 66566672L + "'", long21 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(date24);
// flaky "18) test644(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date24.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test645");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        boolean boolean7 = minute0.equals((java.lang.Object) '4');
        long long8 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute9.next();
        long long11 = minute9.getMiddleMillisecond();
        int int12 = minute9.getHourValue();
        java.util.Date date13 = minute9.getStart();
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute(date13);
        long long15 = minute14.getLastMillisecond();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute16.next();
        long long18 = minute16.getMiddleMillisecond();
        int int19 = minute16.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod20 = null;
        int int21 = minute16.compareTo(timePeriod20);
        long long22 = minute16.getLastMillisecond();
        int int23 = minute14.compareTo((org.jfree.data.time.TimePeriod) minute16);
        int int24 = minute16.getHourValue();
        long long25 = minute16.getFirstMillisecond();
        boolean boolean26 = minute0.equals((java.lang.Object) minute16);
        int int27 = minute0.getHourValue();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "130) test645(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "127) test645(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "113) test645(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "99) test645(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(date13);
// flaky "88) test645(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "71) test645(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813579999L + "'", long15 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "59) test645(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813549999L + "'", long18 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
// flaky "48) test645(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1784813579999L + "'", long22 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
// flaky "38) test645(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1784813520000L + "'", long25 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test646");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.lang.String str6 = minute0.toString();
        java.util.Date date7 = minute0.getStart();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        int int9 = minute8.getMinute();
        int int10 = minute8.getHourValue();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute();
        long long12 = minute11.getSerialIndex();
        long long13 = minute11.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute11.next();
        int int15 = minute8.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod14);
        long long16 = minute8.getMiddleMillisecond();
        boolean boolean17 = minute0.equals((java.lang.Object) minute8);
        long long18 = minute0.getFirstMillisecond();
// flaky "131) test646(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "128) test646(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "114) test646(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "100) test646(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "89) test646(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "72) test646(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
// flaky "60) test646(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "49) test646(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
// flaky "39) test646(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
// flaky "29) test646(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky "19) test646(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "13) test646(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813520000L + "'", long18 == 1784813520000L);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test647");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        long long8 = minute0.getFirstMillisecond();
        java.lang.String str9 = minute0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute0.next();
        java.util.Calendar calendar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = minute0.getLastMillisecond(calendar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "132) test647(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "129) test647(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "115) test647(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813520000L + "'", long8 == 1784813520000L);
// flaky "101) test647(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str9, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod10);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test648");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        long long5 = minute0.getLastMillisecond();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        int int7 = minute6.getMinute();
        int int8 = minute6.getHourValue();
        int int9 = minute6.getMinute();
        org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute10.next();
        long long12 = minute10.getMiddleMillisecond();
        int int13 = minute10.getHourValue();
        long long14 = minute10.getSerialIndex();
        int int15 = minute6.compareTo((org.jfree.data.time.TimePeriod) minute10);
        java.lang.String str16 = minute6.toString();
        long long17 = minute6.getLastMillisecond();
        java.util.Date date18 = minute6.getStart();
        int int19 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute6);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "133) test648(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "130) test648(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "116) test648(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
// flaky "102) test648(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "90) test648(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
// flaky "73) test648(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813549999L + "'", long12 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
// flaky "61) test648(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 66566672L + "'", long14 == 66566672L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky "50) test648(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str16, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "40) test648(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813579999L + "'", long17 == 1784813579999L);
        org.junit.Assert.assertNotNull(date18);
// flaky "30) test648(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test649");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        java.util.Date date7 = minute0.getEnd();
        long long8 = minute0.getLastMillisecond();
        int int9 = minute0.getMinute();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "134) test649(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "131) test649(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "117) test649(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "103) test649(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "91) test649(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test650");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        long long7 = minute2.getFirstMillisecond();
// flaky "135) test650(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "132) test650(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "118) test650(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test651");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(9, 12, 12, (int) (byte) -1, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test652");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        java.lang.String str6 = minute0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        java.util.Date date8 = minute0.getEnd();
        java.lang.Object obj9 = null;
        boolean boolean10 = minute0.equals(obj9);
        long long11 = minute0.getSerialIndex();
        java.lang.Class<?> wildcardClass12 = minute0.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "136) test652(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "133) test652(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "119) test652(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
// flaky "104) test652(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "92) test652(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66566672L + "'", long11 == 66566672L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test653");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute3.next();
        long long5 = minute3.getMiddleMillisecond();
        int int6 = minute3.getHourValue();
        int int7 = minute3.getMinute();
        long long8 = minute3.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute3.previous();
        boolean boolean10 = minute0.equals((java.lang.Object) regularTimePeriod9);
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute11.next();
        long long13 = minute11.getMiddleMillisecond();
        int int14 = minute11.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        int int16 = minute11.compareTo(timePeriod15);
        long long17 = minute11.getLastMillisecond();
        int int18 = minute11.getMinute();
        java.lang.String str19 = minute11.toString();
        int int20 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute11);
        long long21 = minute0.getLastMillisecond();
        java.util.Calendar calendar22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = minute0.getFirstMillisecond(calendar22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "137) test653(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "134) test653(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "120) test653(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "105) test653(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "93) test653(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
// flaky "74) test653(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813579999L + "'", long17 == 1784813579999L);
// flaky "62) test653(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
// flaky "51) test653(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str19, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky "41) test653(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1784813579999L + "'", long21 == 1784813579999L);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test654");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        java.lang.String str6 = minute0.toString();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        java.util.Date date9 = minute7.getStart();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute7);
        long long11 = minute7.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute7.next();
        long long13 = minute7.getMiddleMillisecond();
        java.lang.Class<?> wildcardClass14 = minute7.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "138) test654(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "135) test654(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "121) test654(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "106) test654(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "94) test654(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "75) test654(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66566672L + "'", long11 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "63) test654(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test655");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        int int11 = minute5.getHourValue();
        org.jfree.data.time.Minute minute12 = new org.jfree.data.time.Minute();
        long long13 = minute12.getSerialIndex();
        long long14 = minute12.getMiddleMillisecond();
        long long15 = minute12.getFirstMillisecond();
        java.util.Date date16 = minute12.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute12.previous();
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute();
        long long19 = minute18.getSerialIndex();
        long long20 = minute18.getMiddleMillisecond();
        long long21 = minute18.getLastMillisecond();
        int int22 = minute12.compareTo((org.jfree.data.time.TimePeriod) minute18);
        int int23 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = minute12.next();
        java.util.Calendar calendar25 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long26 = minute12.getFirstMillisecond(calendar25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "139) test655(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "136) test655(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "122) test655(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "107) test655(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "95) test655(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "76) test655(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "64) test655(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
// flaky "52) test655(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813549999L + "'", long14 == 1784813549999L);
// flaky "42) test655(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813520000L + "'", long15 == 1784813520000L);
        org.junit.Assert.assertNotNull(date16);
// flaky "31) test655(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "20) test655(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
// flaky "14) test655(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
// flaky "10) test655(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1784813579999L + "'", long21 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod24);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test656");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        java.util.Date date8 = minute0.getEnd();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date8);
        org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute(date8);
        long long11 = minute10.getLastMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "140) test656(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "137) test656(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "123) test656(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "108) test656(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "96) test656(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813579999L + "'", long11 == 1784813579999L);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test657");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        long long4 = minute3.getSerialIndex();
        long long5 = minute3.getMiddleMillisecond();
        long long6 = minute3.getLastMillisecond();
        long long7 = minute3.getFirstMillisecond();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute8.next();
        long long10 = minute8.getMiddleMillisecond();
        int int11 = minute8.getHourValue();
        int int12 = minute8.getMinute();
        int int13 = minute3.compareTo((org.jfree.data.time.TimePeriod) minute8);
        java.lang.String str14 = minute8.toString();
        boolean boolean15 = minute0.equals((java.lang.Object) minute8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = minute8.previous();
        long long17 = minute8.getSerialIndex();
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute();
        long long19 = minute18.getSerialIndex();
        org.jfree.data.time.Minute minute20 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = minute20.next();
        long long22 = minute20.getMiddleMillisecond();
        int int23 = minute20.getHourValue();
        int int24 = minute18.compareTo((org.jfree.data.time.TimePeriod) minute20);
        org.jfree.data.time.Minute minute25 = new org.jfree.data.time.Minute();
        int int26 = minute25.getMinute();
        int int27 = minute25.getHourValue();
        int int28 = minute25.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = minute25.previous();
        int int30 = minute25.getHourValue();
        boolean boolean31 = minute20.equals((java.lang.Object) int30);
        org.jfree.data.time.Minute minute32 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = minute32.next();
        long long34 = minute32.getMiddleMillisecond();
        boolean boolean35 = minute20.equals((java.lang.Object) minute32);
        int int36 = minute20.getMinute();
        org.jfree.data.time.Minute minute37 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod38 = minute37.next();
        org.jfree.data.time.Minute minute39 = new org.jfree.data.time.Minute();
        int int40 = minute39.getMinute();
        java.util.Date date41 = minute39.getStart();
        boolean boolean42 = minute37.equals((java.lang.Object) date41);
        java.lang.String str43 = minute37.toString();
        int int44 = minute20.compareTo((org.jfree.data.time.TimePeriod) minute37);
        boolean boolean45 = minute8.equals((java.lang.Object) minute20);
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor46 = null;
        java.util.Calendar calendar47 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long48 = minute8.getMillisecond(timePeriodAnchor46, calendar47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "141) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "138) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "124) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "109) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "97) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "77) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
// flaky "65) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "53) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "43) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str14, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
// flaky "32) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 66566672L + "'", long17 == 66566672L);
// flaky "21) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
// flaky "15) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1784813549999L + "'", long22 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
// flaky "11) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
// flaky "4) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod33);
// flaky "2) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1784813549999L + "'", long34 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
// flaky "2) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod38);
// flaky "1) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertNotNull(date41);
// flaky "1) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date41.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "1) test657(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str43, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test658");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.Minute minute1 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = minute1.next();
        long long3 = minute1.getMiddleMillisecond();
        int int4 = minute1.getHourValue();
        int int5 = minute1.getMinute();
        long long6 = minute1.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute1.previous();
        boolean boolean8 = minute0.equals((java.lang.Object) regularTimePeriod7);
        java.util.Date date9 = minute0.getStart();
        int int10 = minute0.getMinute();
        org.junit.Assert.assertNotNull(regularTimePeriod2);
// flaky "142) test658(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813549999L + "'", long3 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
// flaky "139) test658(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
// flaky "125) test658(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "110) test658(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "98) test658(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test659");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        long long8 = regularTimePeriod7.getMiddleMillisecond();
// flaky "143) test659(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "140) test659(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "126) test659(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813489999L + "'", long8 == 1784813489999L);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test660");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        int int6 = minute0.getMinute();
// flaky "144) test660(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "141) test660(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "127) test660(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test661");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        int int7 = minute0.getHourValue();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        long long10 = minute8.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute8.next();
        boolean boolean12 = minute0.equals((java.lang.Object) minute8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = minute8.previous();
        java.util.Calendar calendar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = regularTimePeriod13.getMiddleMillisecond(calendar14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "145) test661(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "142) test661(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "128) test661(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "111) test661(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "99) test661(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test662");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        long long5 = minute4.getSerialIndex();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        int int10 = minute4.compareTo((org.jfree.data.time.TimePeriod) minute6);
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute();
        int int12 = minute11.getMinute();
        int int13 = minute11.getHourValue();
        int int14 = minute11.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute11.previous();
        int int16 = minute11.getHourValue();
        boolean boolean17 = minute6.equals((java.lang.Object) int16);
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = minute18.next();
        long long20 = minute18.getMiddleMillisecond();
        boolean boolean21 = minute6.equals((java.lang.Object) minute18);
        int int22 = minute6.getMinute();
        org.jfree.data.time.Minute minute23 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = minute23.next();
        org.jfree.data.time.Minute minute25 = new org.jfree.data.time.Minute();
        int int26 = minute25.getMinute();
        java.util.Date date27 = minute25.getStart();
        boolean boolean28 = minute23.equals((java.lang.Object) date27);
        java.lang.String str29 = minute23.toString();
        int int30 = minute6.compareTo((org.jfree.data.time.TimePeriod) minute23);
        boolean boolean31 = minute0.equals((java.lang.Object) int30);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = minute0.next();
        org.jfree.data.time.Minute minute33 = new org.jfree.data.time.Minute();
        int int34 = minute33.getMinute();
        java.util.Date date35 = minute33.getStart();
        java.util.Date date36 = minute33.getEnd();
        org.jfree.data.time.Minute minute37 = new org.jfree.data.time.Minute();
        long long38 = minute37.getSerialIndex();
        long long39 = minute37.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = minute37.next();
        java.util.Date date41 = regularTimePeriod40.getEnd();
        org.jfree.data.time.Minute minute42 = new org.jfree.data.time.Minute(date41);
        boolean boolean43 = minute33.equals((java.lang.Object) date41);
        org.jfree.data.time.Minute minute44 = new org.jfree.data.time.Minute(date41);
        java.util.Date date45 = minute44.getEnd();
        int int46 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute44);
        org.jfree.data.time.Minute minute47 = new org.jfree.data.time.Minute();
        long long48 = minute47.getSerialIndex();
        long long49 = minute47.getMiddleMillisecond();
        long long50 = minute47.getLastMillisecond();
        long long51 = minute47.getFirstMillisecond();
        org.jfree.data.time.Minute minute52 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod53 = minute52.next();
        long long54 = minute52.getMiddleMillisecond();
        int int55 = minute52.getHourValue();
        int int56 = minute52.getMinute();
        int int57 = minute47.compareTo((org.jfree.data.time.TimePeriod) minute52);
        int int58 = minute52.getHourValue();
        java.util.Date date59 = minute52.getStart();
        org.jfree.data.time.Minute minute60 = new org.jfree.data.time.Minute();
        int int61 = minute60.getMinute();
        java.util.Date date62 = minute60.getStart();
        java.util.Date date63 = minute60.getEnd();
        long long64 = minute60.getFirstMillisecond();
        java.util.Date date65 = minute60.getStart();
        java.lang.Class<?> wildcardClass66 = date65.getClass();
        boolean boolean67 = minute52.equals((java.lang.Object) wildcardClass66);
        long long68 = minute52.getLastMillisecond();
        org.jfree.data.time.Minute minute69 = new org.jfree.data.time.Minute();
        int int70 = minute69.getMinute();
        int int71 = minute69.getHourValue();
        int int72 = minute69.getMinute();
        int int73 = minute69.getHourValue();
        org.jfree.data.time.Minute minute74 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod75 = minute74.next();
        org.jfree.data.time.Minute minute76 = new org.jfree.data.time.Minute();
        int int77 = minute76.getMinute();
        java.util.Date date78 = minute76.getStart();
        boolean boolean79 = minute74.equals((java.lang.Object) date78);
        boolean boolean81 = minute74.equals((java.lang.Object) '4');
        long long82 = minute74.getSerialIndex();
        boolean boolean83 = minute69.equals((java.lang.Object) long82);
        int int84 = minute52.compareTo((org.jfree.data.time.TimePeriod) minute69);
        boolean boolean85 = minute0.equals((java.lang.Object) minute52);
        long long86 = minute0.getMiddleMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "146) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "143) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 66566672L + "'", long5 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "129) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "112) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
// flaky "100) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
// flaky "78) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "66) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod24);
// flaky "54) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(date27);
// flaky "44) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date27.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "33) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str29, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod32);
// flaky "22) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(date35);
// flaky "16) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date35.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date36);
// flaky "12) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date36.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "5) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 66566672L + "'", long38 == 66566672L);
// flaky "3) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1784813549999L + "'", long39 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod40);
        org.junit.Assert.assertNotNull(date41);
// flaky "3) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date41.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(date45);
// flaky "2) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date45.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
// flaky "2) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 66566672L + "'", long48 == 66566672L);
// flaky "2) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1784813549999L + "'", long49 == 1784813549999L);
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1784813579999L + "'", long50 == 1784813579999L);
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1784813520000L + "'", long51 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod53);
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1784813549999L + "'", long54 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 20 + "'", int55 == 20);
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 32 + "'", int56 == 32);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 20 + "'", int58 == 20);
        org.junit.Assert.assertNotNull(date59);
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date59.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int61 + "' != '" + 32 + "'", int61 == 32);
        org.junit.Assert.assertNotNull(date62);
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date62.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date63);
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date63.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1784813520000L + "'", long64 == 1784813520000L);
        org.junit.Assert.assertNotNull(date65);
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date65.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1784813579999L + "'", long68 == 1784813579999L);
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int70 + "' != '" + 32 + "'", int70 == 32);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 20 + "'", int71 == 20);
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int72 + "' != '" + 32 + "'", int72 == 32);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 20 + "'", int73 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod75);
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int77 + "' != '" + 32 + "'", int77 == 32);
        org.junit.Assert.assertNotNull(date78);
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date78.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long82 + "' != '" + 66566672L + "'", long82 == 66566672L);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
// flaky "1) test662(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long86 + "' != '" + 1784813549999L + "'", long86 == 1784813549999L);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test663");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        int int11 = minute6.compareTo(timePeriod10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute6.next();
        int int13 = minute6.getMinute();
        boolean boolean14 = minute0.equals((java.lang.Object) minute6);
        long long15 = minute6.getFirstMillisecond();
        java.util.Calendar calendar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = minute6.getLastMillisecond(calendar16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "147) test663(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "144) test663(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "130) test663(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "113) test663(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813520000L + "'", long15 == 1784813520000L);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test664");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        int int9 = minute7.getHourValue();
        int int10 = minute7.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute7.previous();
        int int12 = minute7.getHourValue();
        boolean boolean13 = minute2.equals((java.lang.Object) int12);
        long long14 = minute2.getLastMillisecond();
        java.util.Date date15 = minute2.getEnd();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute(date15);
        org.jfree.data.time.Minute minute17 = new org.jfree.data.time.Minute(date15);
// flaky "148) test664(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "145) test664(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "131) test664(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "114) test664(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "101) test664(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813579999L + "'", long14 == 1784813579999L);
        org.junit.Assert.assertNotNull(date15);
// flaky "79) test664(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test665");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        int int7 = minute0.getMinute();
        long long8 = minute0.getMiddleMillisecond();
        long long9 = minute0.getSerialIndex();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "149) test665(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "146) test665(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "132) test665(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "115) test665(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
// flaky "102) test665(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test666");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        long long6 = minute5.getLastMillisecond();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute7.next();
        long long9 = minute7.getMiddleMillisecond();
        int int10 = minute7.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        int int12 = minute7.compareTo(timePeriod11);
        long long13 = minute7.getLastMillisecond();
        int int14 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute7);
        int int15 = minute7.getHourValue();
        int int16 = minute7.getHourValue();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "150) test666(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "147) test666(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "133) test666(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "116) test666(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky "103) test666(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813579999L + "'", long13 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test667");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        long long6 = minute5.getLastMillisecond();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute7.next();
        long long9 = minute7.getMiddleMillisecond();
        int int10 = minute7.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        int int12 = minute7.compareTo(timePeriod11);
        long long13 = minute7.getLastMillisecond();
        int int14 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute7);
        java.util.Date date15 = minute5.getEnd();
        boolean boolean17 = minute5.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "151) test667(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "148) test667(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "134) test667(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "117) test667(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky "104) test667(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813579999L + "'", long13 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(date15);
// flaky "80) test667(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test668");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.lang.Object obj5 = null;
        boolean boolean6 = minute0.equals(obj5);
        boolean boolean8 = minute0.equals((java.lang.Object) 8);
        java.lang.String str9 = minute0.toString();
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = minute0.getMiddleMillisecond(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "152) test668(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "149) test668(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "135) test668(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str9, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test669");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute4.next();
        long long6 = minute4.getMiddleMillisecond();
        int int7 = minute4.getHourValue();
        long long8 = minute4.getSerialIndex();
        int int9 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute0.previous();
        long long11 = minute0.getLastMillisecond();
// flaky "153) test669(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "150) test669(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "136) test669(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "118) test669(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "105) test669(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813579999L + "'", long11 == 1784813579999L);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test670");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        int int11 = minute5.getHourValue();
        org.jfree.data.time.Minute minute12 = new org.jfree.data.time.Minute();
        long long13 = minute12.getSerialIndex();
        long long14 = minute12.getMiddleMillisecond();
        long long15 = minute12.getFirstMillisecond();
        java.util.Date date16 = minute12.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute12.previous();
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute();
        long long19 = minute18.getSerialIndex();
        long long20 = minute18.getMiddleMillisecond();
        long long21 = minute18.getLastMillisecond();
        int int22 = minute12.compareTo((org.jfree.data.time.TimePeriod) minute18);
        int int23 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute12);
        int int24 = minute5.getHourValue();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = minute5.previous();
// flaky "154) test670(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "151) test670(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "137) test670(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "119) test670(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "106) test670(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "81) test670(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "67) test670(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
// flaky "55) test670(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813549999L + "'", long14 == 1784813549999L);
// flaky "45) test670(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813520000L + "'", long15 == 1784813520000L);
        org.junit.Assert.assertNotNull(date16);
// flaky "34) test670(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "23) test670(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
// flaky "17) test670(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
// flaky "13) test670(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1784813579999L + "'", long21 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod25);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test671");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        long long3 = minute0.getMiddleMillisecond();
        org.jfree.data.time.Hour hour4 = minute0.getHour();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = hour4.getMiddleMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.set(int, int, int, int, int, int)\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "155) test671(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "152) test671(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813549999L + "'", long3 == 1784813549999L);
        org.junit.Assert.assertNotNull(hour4);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test672");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        int int5 = minute0.getMinute();
        java.util.Date date6 = minute0.getEnd();
        java.lang.String str7 = minute0.toString();
        java.util.Date date8 = minute0.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute0.next();
        java.lang.Class<?> wildcardClass10 = minute0.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "156) test672(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "153) test672(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "138) test672(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky "120) test672(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "107) test672(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str7, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date8);
// flaky "82) test672(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test673");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
        java.util.Date date7 = regularTimePeriod6.getStart();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date7);
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date7);
        java.util.Date date10 = minute9.getEnd();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date10);
        org.jfree.data.time.Minute minute12 = new org.jfree.data.time.Minute(date10);
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute(date10);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "157) test673(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date7);
// flaky "154) test673(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(date10);
// flaky "139) test673(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test674");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getEnd();
        java.lang.String str2 = minute0.toString();
        org.junit.Assert.assertNotNull(date1);
// flaky "158) test674(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "155) test674(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str2, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test675");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute4.next();
        long long6 = minute4.getMiddleMillisecond();
        int int7 = minute4.getHourValue();
        long long8 = minute4.getSerialIndex();
        int int9 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute0.previous();
        java.util.Date date11 = regularTimePeriod10.getStart();
        org.jfree.data.time.Minute minute12 = new org.jfree.data.time.Minute(date11);
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute(date11);
// flaky "159) test675(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "156) test675(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "140) test675(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "121) test675(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertNotNull(date11);
// flaky "108) test675(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:31:00 ICT 2026");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test676");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        int int6 = minute5.getMinute();
        int int7 = minute5.getHourValue();
        int int8 = minute5.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute5.previous();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod9);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "160) test676(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "157) test676(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "141) test676(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "122) test676(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test677");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        long long4 = minute0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
        int int6 = minute0.getMinute();
// flaky "161) test677(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "158) test677(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "142) test677(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
// flaky "123) test677(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813579999L + "'", long4 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "109) test677(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test678");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        int int11 = minute5.getHourValue();
        org.jfree.data.time.Minute minute12 = new org.jfree.data.time.Minute();
        long long13 = minute12.getSerialIndex();
        long long14 = minute12.getMiddleMillisecond();
        long long15 = minute12.getFirstMillisecond();
        java.util.Date date16 = minute12.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute12.previous();
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute();
        long long19 = minute18.getSerialIndex();
        long long20 = minute18.getMiddleMillisecond();
        long long21 = minute18.getLastMillisecond();
        int int22 = minute12.compareTo((org.jfree.data.time.TimePeriod) minute18);
        int int23 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute12);
        long long24 = minute5.getLastMillisecond();
        java.util.Date date25 = minute5.getEnd();
        org.jfree.data.time.Minute minute26 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = minute26.next();
        org.jfree.data.time.Minute minute28 = new org.jfree.data.time.Minute();
        int int29 = minute28.getMinute();
        java.util.Date date30 = minute28.getStart();
        boolean boolean31 = minute26.equals((java.lang.Object) date30);
        java.lang.String str32 = minute26.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = minute26.previous();
        java.util.Date date34 = minute26.getEnd();
        org.jfree.data.time.Minute minute35 = new org.jfree.data.time.Minute(date34);
        boolean boolean36 = minute5.equals((java.lang.Object) date34);
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor37 = null;
        java.util.Calendar calendar38 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long39 = minute5.getMillisecond(timePeriodAnchor37, calendar38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "162) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "159) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "143) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "124) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "110) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "83) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "68) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
// flaky "56) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813549999L + "'", long14 == 1784813549999L);
// flaky "46) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813520000L + "'", long15 == 1784813520000L);
        org.junit.Assert.assertNotNull(date16);
// flaky "35) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "24) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
// flaky "18) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
// flaky "14) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1784813579999L + "'", long21 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky "6) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1784813579999L + "'", long24 == 1784813579999L);
        org.junit.Assert.assertNotNull(date25);
// flaky "4) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date25.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod27);
// flaky "4) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(date30);
// flaky "3) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date30.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky "3) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str32, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod33);
        org.junit.Assert.assertNotNull(date34);
// flaky "3) test678(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date34.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test679");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        java.lang.String str6 = minute0.toString();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        java.util.Date date9 = minute7.getStart();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute7);
        long long11 = minute7.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute7.next();
        long long13 = minute7.getMiddleMillisecond();
        java.util.Calendar calendar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = minute7.getMiddleMillisecond(calendar14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "163) test679(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "160) test679(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "144) test679(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "125) test679(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "111) test679(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "84) test679(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66566672L + "'", long11 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "69) test679(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test680");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute4.next();
        long long6 = minute4.getMiddleMillisecond();
        int int7 = minute4.getHourValue();
        long long8 = minute4.getSerialIndex();
        int int9 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute4);
        java.lang.String str10 = minute0.toString();
        long long11 = minute0.getLastMillisecond();
        java.util.Date date12 = minute0.getStart();
        boolean boolean14 = minute0.equals((java.lang.Object) 10L);
        int int15 = minute0.getMinute();
        java.util.Date date16 = minute0.getEnd();
        long long17 = minute0.getMiddleMillisecond();
// flaky "164) test680(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "161) test680(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "145) test680(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "126) test680(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "112) test680(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str10, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "85) test680(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813579999L + "'", long11 == 1784813579999L);
        org.junit.Assert.assertNotNull(date12);
// flaky "70) test680(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "57) test680(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(date16);
// flaky "47) test680(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "36) test680(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test681");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.lang.String str4 = regularTimePeriod3.toString();
        java.util.Date date5 = regularTimePeriod3.getEnd();
        java.util.Date date6 = regularTimePeriod3.getStart();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date6, calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "165) test681(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "162) test681(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "146) test681(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Thu Jul 23 20:33:00 ICT 2026" + "'", str4, "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(date5);
// flaky "127) test681(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "113) test681(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test682");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        java.lang.String str6 = minute0.toString();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        java.util.Date date9 = minute7.getStart();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute7);
        long long11 = minute7.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute7.next();
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute13.next();
        long long15 = minute13.getMiddleMillisecond();
        int int16 = minute13.getHourValue();
        java.util.Date date17 = minute13.getStart();
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute(date17);
        long long19 = minute18.getLastMillisecond();
        org.jfree.data.time.Minute minute20 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = minute20.next();
        long long22 = minute20.getMiddleMillisecond();
        int int23 = minute20.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod24 = null;
        int int25 = minute20.compareTo(timePeriod24);
        long long26 = minute20.getLastMillisecond();
        int int27 = minute18.compareTo((org.jfree.data.time.TimePeriod) minute20);
        int int28 = minute20.getHourValue();
        long long29 = minute20.getFirstMillisecond();
        boolean boolean30 = minute7.equals((java.lang.Object) long29);
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor31 = null;
        java.util.Calendar calendar32 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long33 = minute7.getMillisecond(timePeriodAnchor31, calendar32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "166) test682(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "163) test682(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "147) test682(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "128) test682(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "114) test682(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "86) test682(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66566672L + "'", long11 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
// flaky "71) test682(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813549999L + "'", long15 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(date17);
// flaky "58) test682(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date17.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "48) test682(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813579999L + "'", long19 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
// flaky "37) test682(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1784813549999L + "'", long22 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
// flaky "25) test682(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1784813579999L + "'", long26 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
// flaky "19) test682(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1784813520000L + "'", long29 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test683");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        long long6 = minute5.getLastMillisecond();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute7.next();
        long long9 = minute7.getMiddleMillisecond();
        int int10 = minute7.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod11 = null;
        int int12 = minute7.compareTo(timePeriod11);
        long long13 = minute7.getLastMillisecond();
        int int14 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute7);
        java.util.Date date15 = minute5.getEnd();
        java.lang.Class<?> wildcardClass16 = minute5.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "167) test683(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "164) test683(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "148) test683(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "129) test683(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky "115) test683(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813579999L + "'", long13 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(date15);
// flaky "87) test683(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test684");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        long long7 = minute0.getFirstMillisecond();
        java.lang.String str8 = minute0.toString();
// flaky "168) test684(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "165) test684(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "149) test684(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
// flaky "130) test684(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
// flaky "116) test684(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str8, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test685");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = minute0.getEnd();
        java.lang.String str5 = minute0.toString();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        int int11 = minute6.compareTo(timePeriod10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute6.next();
        java.util.Date date13 = regularTimePeriod12.getStart();
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute(date13);
        org.jfree.data.time.Minute minute15 = new org.jfree.data.time.Minute(date13);
        java.util.Date date16 = minute15.getEnd();
        boolean boolean17 = minute0.equals((java.lang.Object) minute15);
        int int18 = minute15.getHourValue();
        java.util.Date date19 = minute15.getStart();
// flaky "169) test685(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "166) test685(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "150) test685(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "131) test685(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "117) test685(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertNotNull(date13);
// flaky "88) test685(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(date16);
// flaky "72) test685(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(date19);
// flaky "59) test685(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date19.toString(), "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test686");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        java.util.Date date10 = minute6.getStart();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date10);
        boolean boolean12 = minute0.equals((java.lang.Object) minute11);
        int int13 = minute11.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute11.previous();
        long long15 = minute11.getMiddleMillisecond();
        java.util.Calendar calendar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute11.peg(calendar16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "170) test686(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "167) test686(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "151) test686(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "132) test686(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "118) test686(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "89) test686(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(date10);
// flaky "73) test686(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "60) test686(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
// flaky "49) test686(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813549999L + "'", long15 == 1784813549999L);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test687");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        int int11 = minute6.compareTo(timePeriod10);
        long long12 = minute6.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = minute6.next();
        boolean boolean14 = minute0.equals((java.lang.Object) regularTimePeriod13);
        long long15 = minute0.getMiddleMillisecond();
// flaky "171) test687(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "168) test687(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "152) test687(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "133) test687(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "119) test687(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "90) test687(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "74) test687(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "61) test687(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813549999L + "'", long15 == 1784813549999L);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test688");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        java.util.Date date8 = minute0.getEnd();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date8);
        org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute(date8);
        java.lang.String str11 = minute10.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute10.next();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "172) test688(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "169) test688(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "153) test688(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "134) test688(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "120) test688(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str11, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod12);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test689");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.lang.String str5 = minute0.toString();
        int int6 = minute0.getMinute();
        long long7 = minute0.getFirstMillisecond();
// flaky "173) test689(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "170) test689(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "154) test689(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "135) test689(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
// flaky "121) test689(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "91) test689(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
// flaky "75) test689(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test690");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute7.next();
        long long9 = minute7.getMiddleMillisecond();
        int int10 = minute7.getHourValue();
        java.util.Date date11 = minute7.getStart();
        org.jfree.data.time.Minute minute12 = new org.jfree.data.time.Minute(date11);
        long long13 = minute12.getLastMillisecond();
        int int14 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute12);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "174) test690(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "171) test690(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(date11);
// flaky "155) test690(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "136) test690(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813579999L + "'", long13 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test691");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        long long6 = minute5.getLastMillisecond();
        int int7 = minute5.getMinute();
        int int8 = minute5.getMinute();
        java.util.Date date9 = minute5.getEnd();
        org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute();
        int int11 = minute10.getMinute();
        java.util.Date date12 = minute10.getStart();
        java.util.Date date13 = minute10.getEnd();
        long long14 = minute10.getFirstMillisecond();
        java.util.Date date15 = minute10.getStart();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute(date15);
        org.jfree.data.time.Minute minute17 = new org.jfree.data.time.Minute(date15);
        java.lang.Object obj18 = null;
        boolean boolean19 = minute17.equals(obj18);
        int int20 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute17);
        org.jfree.data.time.Minute minute21 = new org.jfree.data.time.Minute();
        int int22 = minute21.getMinute();
        java.util.Date date23 = minute21.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = minute21.previous();
        org.jfree.data.time.Minute minute25 = new org.jfree.data.time.Minute();
        int int26 = minute25.getMinute();
        java.util.Date date27 = minute25.getStart();
        java.util.Date date28 = minute25.getEnd();
        long long29 = minute25.getFirstMillisecond();
        java.util.Date date30 = minute25.getStart();
        long long31 = minute25.getLastMillisecond();
        org.jfree.data.time.Minute minute32 = new org.jfree.data.time.Minute();
        long long33 = minute32.getSerialIndex();
        long long34 = minute32.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = minute32.next();
        int int36 = minute25.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod35);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = minute25.next();
        long long38 = minute25.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = minute25.next();
        int int40 = minute21.compareTo((org.jfree.data.time.TimePeriod) minute25);
        int int41 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute21);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "175) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "172) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "156) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "137) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "122) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "92) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "76) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(date12);
// flaky "62) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date13);
// flaky "50) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "38) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813520000L + "'", long14 == 1784813520000L);
        org.junit.Assert.assertNotNull(date15);
// flaky "26) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky "20) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(date23);
// flaky "15) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date23.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod24);
// flaky "7) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(date27);
// flaky "5) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date27.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date28);
// flaky "5) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date28.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "4) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1784813520000L + "'", long29 == 1784813520000L);
        org.junit.Assert.assertNotNull(date30);
// flaky "4) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date30.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "4) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1784813579999L + "'", long31 == 1784813579999L);
// flaky "2) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 66566672L + "'", long33 == 66566672L);
// flaky "2) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1784813549999L + "'", long34 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(regularTimePeriod37);
// flaky "2) test691(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 66566672L + "'", long38 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test692");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = regularTimePeriod1.getMiddleMillisecond();
        java.util.Date date3 = regularTimePeriod1.getStart();
        java.util.Date date4 = regularTimePeriod1.getStart();
        java.util.Date date5 = regularTimePeriod1.getEnd();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date5, calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "176) test692(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813609999L + "'", long2 == 1784813609999L);
        org.junit.Assert.assertNotNull(date3);
// flaky "173) test692(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(date4);
// flaky "157) test692(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(date5);
// flaky "138) test692(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test693");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        long long4 = minute3.getSerialIndex();
        long long5 = minute3.getMiddleMillisecond();
        long long6 = minute3.getLastMillisecond();
        long long7 = minute3.getFirstMillisecond();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute8.next();
        long long10 = minute8.getMiddleMillisecond();
        int int11 = minute8.getHourValue();
        int int12 = minute8.getMinute();
        int int13 = minute3.compareTo((org.jfree.data.time.TimePeriod) minute8);
        java.lang.String str14 = minute8.toString();
        boolean boolean15 = minute0.equals((java.lang.Object) minute8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = minute8.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute8.next();
        long long18 = minute8.getSerialIndex();
// flaky "177) test693(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "174) test693(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "158) test693(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "139) test693(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "123) test693(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "93) test693(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
// flaky "77) test693(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "63) test693(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "51) test693(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str14, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "39) test693(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 66566672L + "'", long18 == 66566672L);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test694");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute4.next();
        long long6 = minute4.getMiddleMillisecond();
        int int7 = minute4.getHourValue();
        long long8 = minute4.getSerialIndex();
        int int9 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute0.previous();
        int int11 = minute0.getMinute();
        org.jfree.data.time.Minute minute12 = new org.jfree.data.time.Minute();
        int int13 = minute12.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute12.next();
        int int15 = minute12.getHourValue();
        int int16 = minute12.getMinute();
        long long17 = minute12.getLastMillisecond();
        int int18 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute12);
        long long19 = minute0.getSerialIndex();
// flaky "178) test694(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "175) test694(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "159) test694(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "140) test694(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "124) test694(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
// flaky "94) test694(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
// flaky "78) test694(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
// flaky "64) test694(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813579999L + "'", long17 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky "52) test694(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test695");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = minute0.getMiddleMillisecond(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "179) test695(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "176) test695(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "160) test695(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test696");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        int int7 = minute0.getHourValue();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        long long10 = minute8.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute8.next();
        boolean boolean12 = minute0.equals((java.lang.Object) minute8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = minute8.previous();
        java.lang.Class<?> wildcardClass14 = minute8.getClass();
// flaky "180) test696(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "177) test696(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "161) test696(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "141) test696(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "125) test696(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test697");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.previous();
        int int7 = minute0.getMinute();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "181) test697(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "178) test697(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "162) test697(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "142) test697(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test698");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        int int11 = minute5.getHourValue();
        org.jfree.data.time.Minute minute12 = new org.jfree.data.time.Minute();
        long long13 = minute12.getSerialIndex();
        long long14 = minute12.getMiddleMillisecond();
        long long15 = minute12.getFirstMillisecond();
        java.util.Date date16 = minute12.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute12.previous();
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute();
        long long19 = minute18.getSerialIndex();
        long long20 = minute18.getMiddleMillisecond();
        long long21 = minute18.getLastMillisecond();
        int int22 = minute12.compareTo((org.jfree.data.time.TimePeriod) minute18);
        int int23 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute12);
        long long24 = minute5.getLastMillisecond();
        java.util.Date date25 = minute5.getEnd();
        org.jfree.data.time.Minute minute26 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = minute26.next();
        org.jfree.data.time.Minute minute28 = new org.jfree.data.time.Minute();
        int int29 = minute28.getMinute();
        java.util.Date date30 = minute28.getStart();
        boolean boolean31 = minute26.equals((java.lang.Object) date30);
        java.lang.String str32 = minute26.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = minute26.previous();
        java.util.Date date34 = minute26.getEnd();
        org.jfree.data.time.Minute minute35 = new org.jfree.data.time.Minute(date34);
        boolean boolean36 = minute5.equals((java.lang.Object) date34);
        java.util.TimeZone timeZone37 = null;
        java.util.Locale locale38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute39 = new org.jfree.data.time.Minute(date34, timeZone37, locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "182) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "179) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "163) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "143) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "126) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "95) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "79) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
// flaky "65) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813549999L + "'", long14 == 1784813549999L);
// flaky "53) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813520000L + "'", long15 == 1784813520000L);
        org.junit.Assert.assertNotNull(date16);
// flaky "40) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "27) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
// flaky "21) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
// flaky "16) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1784813579999L + "'", long21 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky "8) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1784813579999L + "'", long24 == 1784813579999L);
        org.junit.Assert.assertNotNull(date25);
// flaky "6) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date25.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod27);
// flaky "6) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(date30);
// flaky "5) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date30.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky "5) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str32, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod33);
        org.junit.Assert.assertNotNull(date34);
// flaky "5) test698(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date34.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test699");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        int int7 = minute0.getHourValue();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        long long10 = minute8.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute8.next();
        boolean boolean12 = minute0.equals((java.lang.Object) minute8);
        long long13 = minute8.getMiddleMillisecond();
        java.util.Calendar calendar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = minute8.getFirstMillisecond(calendar14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "183) test699(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "180) test699(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "164) test699(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "144) test699(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "127) test699(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "96) test699(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test700");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        int int11 = minute6.compareTo(timePeriod10);
        long long12 = minute6.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = minute6.next();
        boolean boolean14 = minute0.equals((java.lang.Object) regularTimePeriod13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute0.previous();
        java.util.Calendar calendar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = minute0.getMiddleMillisecond(calendar16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "184) test700(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "181) test700(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "165) test700(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "145) test700(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "128) test700(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "97) test700(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "80) test700(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test701");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        long long6 = minute0.getMiddleMillisecond();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute7.next();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        int int10 = minute9.getMinute();
        java.util.Date date11 = minute9.getStart();
        boolean boolean12 = minute7.equals((java.lang.Object) date11);
        boolean boolean14 = minute7.equals((java.lang.Object) '4');
        java.util.Date date15 = minute7.getStart();
        int int16 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute7);
        java.util.Date date17 = minute7.getEnd();
        long long18 = minute7.getLastMillisecond();
        long long19 = minute7.getSerialIndex();
// flaky "185) test701(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "182) test701(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "166) test701(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "146) test701(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "129) test701(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "98) test701(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "81) test701(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(date11);
// flaky "66) test701(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky "54) test701(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(date17);
// flaky "41) test701(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date17.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "28) test701(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813579999L + "'", long18 == 1784813579999L);
// flaky "22) test701(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test702");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        java.util.Date date10 = minute6.getStart();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date10);
        boolean boolean12 = minute0.equals((java.lang.Object) minute11);
        int int13 = minute11.getMinute();
        java.lang.String str14 = minute11.toString();
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = minute11.getFirstMillisecond(calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "186) test702(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "183) test702(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "167) test702(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "147) test702(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "130) test702(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "99) test702(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(date10);
// flaky "82) test702(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "67) test702(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
// flaky "55) test702(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str14, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test703");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        int int5 = minute0.getMinute();
        java.util.Date date6 = minute0.getEnd();
        java.lang.String str7 = minute0.toString();
        java.util.Date date8 = minute0.getEnd();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute9.previous();
        long long11 = minute9.getMiddleMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "187) test703(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "184) test703(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "168) test703(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky "148) test703(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "131) test703(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str7, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date8);
// flaky "100) test703(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "83) test703(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test704");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        java.util.Date date7 = minute0.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute0.previous();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        long long10 = minute9.getSerialIndex();
        long long11 = minute9.getMiddleMillisecond();
        long long12 = minute9.getLastMillisecond();
        long long13 = minute9.getFirstMillisecond();
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute14.next();
        long long16 = minute14.getMiddleMillisecond();
        int int17 = minute14.getHourValue();
        int int18 = minute14.getMinute();
        int int19 = minute9.compareTo((org.jfree.data.time.TimePeriod) minute14);
        int int20 = minute14.getHourValue();
        org.jfree.data.time.Minute minute21 = new org.jfree.data.time.Minute();
        long long22 = minute21.getSerialIndex();
        long long23 = minute21.getMiddleMillisecond();
        long long24 = minute21.getFirstMillisecond();
        java.util.Date date25 = minute21.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = minute21.previous();
        org.jfree.data.time.Minute minute27 = new org.jfree.data.time.Minute();
        long long28 = minute27.getSerialIndex();
        long long29 = minute27.getMiddleMillisecond();
        long long30 = minute27.getLastMillisecond();
        int int31 = minute21.compareTo((org.jfree.data.time.TimePeriod) minute27);
        int int32 = minute14.compareTo((org.jfree.data.time.TimePeriod) minute21);
        boolean boolean33 = minute0.equals((java.lang.Object) minute21);
        java.util.Calendar calendar34 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long35 = minute21.getFirstMillisecond(calendar34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "188) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "185) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "169) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "149) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 66566672L + "'", long10 == 66566672L);
// flaky "132) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
// flaky "101) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
// flaky "84) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813520000L + "'", long13 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "68) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
// flaky "56) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
// flaky "42) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 66566672L + "'", long22 == 66566672L);
// flaky "29) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1784813549999L + "'", long23 == 1784813549999L);
// flaky "23) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1784813520000L + "'", long24 == 1784813520000L);
        org.junit.Assert.assertNotNull(date25);
// flaky "17) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date25.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod26);
// flaky "9) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 66566672L + "'", long28 == 66566672L);
// flaky "7) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1784813549999L + "'", long29 == 1784813549999L);
// flaky "7) test704(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1784813579999L + "'", long30 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test705");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        long long5 = minute0.getLastMillisecond();
        java.lang.String str6 = minute0.toString();
        long long7 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        long long10 = minute8.getMiddleMillisecond();
        long long11 = minute8.getFirstMillisecond();
        java.util.Date date12 = minute8.getStart();
        long long13 = minute8.getSerialIndex();
        int int14 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute8);
        long long15 = minute0.getFirstMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "189) test705(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "186) test705(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "170) test705(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
// flaky "150) test705(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "133) test705(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 66566672L + "'", long7 == 66566672L);
// flaky "102) test705(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "85) test705(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
// flaky "69) test705(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813520000L + "'", long11 == 1784813520000L);
        org.junit.Assert.assertNotNull(date12);
// flaky "57) test705(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "43) test705(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky "30) test705(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813520000L + "'", long15 == 1784813520000L);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test706");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
        int int7 = minute0.getMinute();
        int int8 = minute0.getHourValue();
        long long9 = minute0.getLastMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "190) test706(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "187) test706(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "171) test706(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813579999L + "'", long9 == 1784813579999L);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test707");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.lang.Object obj5 = null;
        boolean boolean6 = minute0.equals(obj5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        long long8 = regularTimePeriod7.getMiddleMillisecond();
        java.util.Date date9 = regularTimePeriod7.getEnd();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "191) test707(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "188) test707(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "172) test707(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813609999L + "'", long8 == 1784813609999L);
        org.junit.Assert.assertNotNull(date9);
// flaky "151) test707(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test708");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getEnd();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        java.lang.Class<?> wildcardClass6 = date4.getClass();
// flaky "192) test708(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "189) test708(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "173) test708(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test709");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        boolean boolean4 = minute0.equals((java.lang.Object) 8);
        long long5 = minute0.getSerialIndex();
        org.jfree.data.time.Hour hour6 = minute0.getHour();
// flaky "193) test709(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "190) test709(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 66566672L + "'", long5 == 66566672L);
        org.junit.Assert.assertNotNull(hour6);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test710");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getEnd();
        long long5 = minute0.getFirstMillisecond();
        java.lang.String str6 = minute0.toString();
// flaky "194) test710(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "191) test710(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "174) test710(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "152) test710(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813520000L + "'", long5 == 1784813520000L);
// flaky "134) test710(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test711");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) (byte) 100, 2, 20, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test712");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        long long4 = minute3.getSerialIndex();
        long long5 = minute3.getMiddleMillisecond();
        long long6 = minute3.getLastMillisecond();
        long long7 = minute3.getFirstMillisecond();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute8.next();
        long long10 = minute8.getMiddleMillisecond();
        int int11 = minute8.getHourValue();
        int int12 = minute8.getMinute();
        int int13 = minute3.compareTo((org.jfree.data.time.TimePeriod) minute8);
        java.lang.String str14 = minute8.toString();
        boolean boolean15 = minute0.equals((java.lang.Object) minute8);
        java.lang.Class<?> wildcardClass16 = minute0.getClass();
// flaky "195) test712(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "192) test712(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "175) test712(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "153) test712(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "135) test712(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "103) test712(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
// flaky "86) test712(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "70) test712(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "58) test712(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str14, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test713");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        int int9 = minute7.getHourValue();
        int int10 = minute7.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute7.previous();
        int int12 = minute7.getHourValue();
        boolean boolean13 = minute2.equals((java.lang.Object) int12);
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute14.next();
        long long16 = minute14.getMiddleMillisecond();
        boolean boolean17 = minute2.equals((java.lang.Object) minute14);
        long long18 = minute14.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = minute14.previous();
        java.util.Date date20 = regularTimePeriod19.getEnd();
        org.jfree.data.time.Minute minute21 = new org.jfree.data.time.Minute(date20);
        long long22 = minute21.getSerialIndex();
// flaky "196) test713(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "193) test713(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "176) test713(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "154) test713(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "136) test713(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "104) test713(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 66566672L + "'", long18 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
        org.junit.Assert.assertNotNull(date20);
// flaky "87) test713(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date20.toString(), "Thu Jul 23 20:31:59 ICT 2026");
// flaky "71) test713(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 66566671L + "'", long22 == 66566671L);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test714");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        long long4 = minute3.getSerialIndex();
        long long5 = minute3.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute3.next();
        int int7 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod6);
        java.util.Date date8 = minute0.getStart();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = minute0.getMiddleMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "197) test714(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "194) test714(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "177) test714(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(date8);
// flaky "155) test714(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test715");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.lang.String str6 = minute0.toString();
        java.util.Date date7 = minute0.getStart();
        java.util.Date date8 = minute0.getStart();
        long long9 = minute0.getMiddleMillisecond();
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = minute0.getFirstMillisecond(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "198) test715(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "195) test715(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "178) test715(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "156) test715(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "137) test715(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "105) test715(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
// flaky "88) test715(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date8);
// flaky "72) test715(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "59) test715(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test716");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        java.util.Date date7 = minute0.getEnd();
        long long8 = minute0.getLastMillisecond();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute9.next();
        long long11 = regularTimePeriod10.getMiddleMillisecond();
        int int12 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod10);
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute13.next();
        long long15 = minute13.getMiddleMillisecond();
        int int16 = minute13.getHourValue();
        java.util.Date date17 = minute13.getStart();
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute(date17);
        long long19 = minute18.getLastMillisecond();
        java.util.Date date20 = minute18.getEnd();
        long long21 = minute18.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = minute18.next();
        int int23 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute18);
        long long24 = minute18.getSerialIndex();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "199) test716(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "196) test716(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "179) test716(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "157) test716(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "138) test716(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813609999L + "'", long11 == 1784813609999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(regularTimePeriod14);
// flaky "106) test716(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813549999L + "'", long15 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(date17);
// flaky "89) test716(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date17.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "73) test716(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813579999L + "'", long19 == 1784813579999L);
        org.junit.Assert.assertNotNull(date20);
// flaky "60) test716(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date20.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "44) test716(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 66566672L + "'", long21 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky "31) test716(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 66566672L + "'", long24 == 66566672L);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test717");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        long long6 = minute0.getLastMillisecond();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        long long8 = minute7.getSerialIndex();
        long long9 = minute7.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute7.next();
        int int11 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute0.next();
        long long13 = minute0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute0.next();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor15 = null;
        java.util.Calendar calendar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = regularTimePeriod14.getMillisecond(timePeriodAnchor15, calendar16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "200) test717(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "197) test717(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "180) test717(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "158) test717(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "139) test717(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "107) test717(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "90) test717(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
// flaky "74) test717(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "61) test717(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test718");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        long long4 = minute3.getSerialIndex();
        long long5 = minute3.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute3.next();
        int int7 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod6);
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = regularTimePeriod6.getMiddleMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "201) test718(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "198) test718(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "181) test718(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test719");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.next();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        int int7 = minute6.getMinute();
        int int8 = minute6.getHourValue();
        boolean boolean9 = minute0.equals((java.lang.Object) minute6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute0.next();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor11 = null;
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = minute0.getMillisecond(timePeriodAnchor11, calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "202) test719(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "199) test719(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "182) test719(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test720");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        int int5 = minute0.getMinute();
        java.util.Date date6 = minute0.getEnd();
        java.lang.String str7 = minute0.toString();
        java.util.Date date8 = minute0.getEnd();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute9.next();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "203) test720(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "200) test720(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "183) test720(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky "159) test720(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "140) test720(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str7, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date8);
// flaky "108) test720(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod10);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test721");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        long long4 = minute3.getSerialIndex();
        long long5 = minute3.getMiddleMillisecond();
        long long6 = minute3.getLastMillisecond();
        long long7 = minute3.getFirstMillisecond();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute8.next();
        long long10 = minute8.getMiddleMillisecond();
        int int11 = minute8.getHourValue();
        int int12 = minute8.getMinute();
        int int13 = minute3.compareTo((org.jfree.data.time.TimePeriod) minute8);
        java.lang.String str14 = minute8.toString();
        boolean boolean15 = minute0.equals((java.lang.Object) minute8);
        int int16 = minute0.getMinute();
        org.jfree.data.time.Minute minute17 = new org.jfree.data.time.Minute();
        long long18 = minute17.getSerialIndex();
        long long19 = minute17.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = minute17.next();
        java.util.Date date21 = regularTimePeriod20.getEnd();
        org.jfree.data.time.Minute minute22 = new org.jfree.data.time.Minute(date21);
        java.util.Date date23 = minute22.getEnd();
        org.jfree.data.time.Minute minute24 = new org.jfree.data.time.Minute(date23);
        org.jfree.data.time.Minute minute25 = new org.jfree.data.time.Minute(date23);
        boolean boolean26 = minute0.equals((java.lang.Object) minute25);
        java.util.Date date27 = minute0.getStart();
// flaky "204) test721(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "201) test721(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "184) test721(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "160) test721(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "141) test721(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "109) test721(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
// flaky "91) test721(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "75) test721(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "62) test721(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str14, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "45) test721(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
// flaky "32) test721(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 66566672L + "'", long18 == 66566672L);
// flaky "24) test721(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813549999L + "'", long19 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod20);
        org.junit.Assert.assertNotNull(date21);
// flaky "18) test721(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date21.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertNotNull(date23);
// flaky "10) test721(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date23.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date27);
// flaky "8) test721(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date27.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test722");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date4, calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "205) test722(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "202) test722(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test723");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getSerialIndex();
        org.jfree.data.time.Day day6 = minute0.getDay();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "206) test723(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "203) test723(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "185) test723(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "161) test723(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "142) test723(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 66566672L + "'", long5 == 66566672L);
        org.junit.Assert.assertNotNull(day6);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test724");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        long long5 = minute4.getSerialIndex();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        int int10 = minute4.compareTo((org.jfree.data.time.TimePeriod) minute6);
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute();
        int int12 = minute11.getMinute();
        int int13 = minute11.getHourValue();
        int int14 = minute11.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute11.previous();
        int int16 = minute11.getHourValue();
        boolean boolean17 = minute6.equals((java.lang.Object) int16);
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = minute18.next();
        long long20 = minute18.getMiddleMillisecond();
        boolean boolean21 = minute6.equals((java.lang.Object) minute18);
        int int22 = minute6.getMinute();
        org.jfree.data.time.Minute minute23 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = minute23.next();
        org.jfree.data.time.Minute minute25 = new org.jfree.data.time.Minute();
        int int26 = minute25.getMinute();
        java.util.Date date27 = minute25.getStart();
        boolean boolean28 = minute23.equals((java.lang.Object) date27);
        java.lang.String str29 = minute23.toString();
        int int30 = minute6.compareTo((org.jfree.data.time.TimePeriod) minute23);
        boolean boolean31 = minute0.equals((java.lang.Object) int30);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = minute0.next();
        org.jfree.data.time.Minute minute33 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = minute33.next();
        org.jfree.data.time.Minute minute35 = new org.jfree.data.time.Minute();
        int int36 = minute35.getMinute();
        java.util.Date date37 = minute35.getStart();
        boolean boolean38 = minute33.equals((java.lang.Object) date37);
        java.lang.String str39 = minute33.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = minute33.previous();
        java.util.Date date41 = minute33.getEnd();
        org.jfree.data.time.Minute minute42 = new org.jfree.data.time.Minute(date41);
        long long43 = minute42.getMiddleMillisecond();
        boolean boolean44 = minute0.equals((java.lang.Object) minute42);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "207) test724(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "204) test724(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 66566672L + "'", long5 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "186) test724(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "162) test724(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
// flaky "143) test724(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
// flaky "110) test724(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "92) test724(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod24);
// flaky "76) test724(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(date27);
// flaky "63) test724(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date27.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky "46) test724(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str29, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertNotNull(regularTimePeriod34);
// flaky "33) test724(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(date37);
// flaky "25) test724(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date37.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky "19) test724(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str39, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod40);
        org.junit.Assert.assertNotNull(date41);
// flaky "11) test724(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date41.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "9) test724(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1784813549999L + "'", long43 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test725");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        long long6 = minute5.getLastMillisecond();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute7.next();
        long long9 = minute7.getMiddleMillisecond();
        int int10 = minute7.getHourValue();
        java.util.Date date11 = minute7.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute7.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = minute7.previous();
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute();
        int int15 = minute14.getMinute();
        java.util.Date date16 = minute14.getStart();
        int int17 = minute7.compareTo((org.jfree.data.time.TimePeriod) minute14);
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = minute18.next();
        long long20 = minute18.getMiddleMillisecond();
        int int21 = minute18.getHourValue();
        java.util.Date date22 = minute18.getStart();
        java.util.Date date23 = minute18.getStart();
        long long24 = minute18.getLastMillisecond();
        org.jfree.data.time.Minute minute25 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = minute25.next();
        long long27 = minute25.getMiddleMillisecond();
        int int28 = minute25.getHourValue();
        int int29 = minute25.getMinute();
        long long30 = minute25.getLastMillisecond();
        boolean boolean32 = minute25.equals((java.lang.Object) 6);
        long long33 = minute25.getMiddleMillisecond();
        boolean boolean34 = minute18.equals((java.lang.Object) minute25);
        int int35 = minute14.compareTo((org.jfree.data.time.TimePeriod) minute25);
        int int36 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute25);
        long long37 = minute25.getFirstMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "208) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "205) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "187) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "163) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(date11);
// flaky "144) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
// flaky "111) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(date16);
// flaky "93) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
// flaky "77) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(date22);
// flaky "64) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date22.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date23);
// flaky "47) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date23.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "34) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1784813579999L + "'", long24 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod26);
// flaky "26) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1784813549999L + "'", long27 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
// flaky "20) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
// flaky "12) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1784813579999L + "'", long30 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky "10) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1784813549999L + "'", long33 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
// flaky "8) test725(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1784813520000L + "'", long37 == 1784813520000L);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test726");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        long long6 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        int int9 = minute7.getHourValue();
        boolean boolean11 = minute7.equals((java.lang.Object) 8);
        long long12 = minute7.getSerialIndex();
        boolean boolean13 = minute0.equals((java.lang.Object) minute7);
// flaky "209) test726(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "206) test726(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "188) test726(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "164) test726(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "145) test726(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "112) test726(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813520000L + "'", long6 == 1784813520000L);
// flaky "94) test726(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "78) test726(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test727");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
        java.util.Date date7 = regularTimePeriod6.getStart();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date7);
        java.lang.String str9 = minute8.toString();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "210) test727(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date7);
// flaky "207) test727(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:33:00 ICT 2026");
// flaky "189) test727(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Thu Jul 23 20:33:00 ICT 2026" + "'", str9, "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test728");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = regularTimePeriod1.getMiddleMillisecond();
        java.util.Date date3 = regularTimePeriod1.getStart();
        java.util.Date date4 = regularTimePeriod1.getStart();
        java.util.Date date5 = regularTimePeriod1.getEnd();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = regularTimePeriod1.getMiddleMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "211) test728(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813609999L + "'", long2 == 1784813609999L);
        org.junit.Assert.assertNotNull(date3);
// flaky "208) test728(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(date4);
// flaky "190) test728(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(date5);
// flaky "165) test728(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test729");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        java.lang.String str11 = minute5.toString();
        java.util.Date date12 = minute5.getStart();
        int int13 = minute5.getMinute();
        long long14 = minute5.getMiddleMillisecond();
// flaky "212) test729(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "209) test729(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "191) test729(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "166) test729(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "146) test729(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "113) test729(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "95) test729(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str11, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "79) test729(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "65) test729(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
// flaky "48) test729(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813549999L + "'", long14 == 1784813549999L);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test730");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.lang.String str4 = regularTimePeriod3.toString();
        java.util.Date date5 = regularTimePeriod3.getEnd();
        java.util.TimeZone timeZone6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date5, timeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "213) test730(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "210) test730(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "192) test730(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Thu Jul 23 20:33:00 ICT 2026" + "'", str4, "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(date5);
// flaky "167) test730(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test731");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getEnd();
        java.lang.Class<?> wildcardClass6 = minute0.getClass();
// flaky "214) test731(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "211) test731(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "193) test731(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
// flaky "168) test731(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "147) test731(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test732");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        int int11 = minute6.compareTo(timePeriod10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute6.next();
        int int13 = minute6.getMinute();
        boolean boolean14 = minute0.equals((java.lang.Object) minute6);
        org.jfree.data.time.Minute minute15 = new org.jfree.data.time.Minute();
        long long16 = minute15.getSerialIndex();
        long long17 = minute15.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = minute15.next();
        long long19 = minute15.getFirstMillisecond();
        int int20 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute15);
        int int21 = minute0.getHourValue();
        java.util.Date date22 = minute0.getStart();
        long long23 = minute0.getSerialIndex();
        int int24 = minute0.getMinute();
        java.util.Calendar calendar25 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "215) test732(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "212) test732(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "194) test732(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "169) test732(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66566672L + "'", long16 == 66566672L);
// flaky "148) test732(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
// flaky "114) test732(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813520000L + "'", long19 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(date22);
// flaky "96) test732(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date22.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "80) test732(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 66566672L + "'", long23 == 66566672L);
// flaky "66) test732(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test733");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        long long5 = minute4.getSerialIndex();
        long long6 = minute4.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute4.next();
        java.util.Date date8 = regularTimePeriod7.getEnd();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date8);
        boolean boolean10 = minute0.equals((java.lang.Object) date8);
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date8);
        int int12 = minute11.getMinute();
        java.util.Date date13 = minute11.getEnd();
        long long14 = minute11.getSerialIndex();
// flaky "216) test733(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "213) test733(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "195) test733(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "170) test733(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 66566672L + "'", long5 == 66566672L);
// flaky "149) test733(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
// flaky "115) test733(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "97) test733(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertNotNull(date13);
// flaky "81) test733(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:33:59 ICT 2026");
// flaky "67) test733(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 66566673L + "'", long14 == 66566673L);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test734");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        int int11 = minute6.compareTo(timePeriod10);
        long long12 = minute6.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = minute6.next();
        boolean boolean14 = minute0.equals((java.lang.Object) regularTimePeriod13);
        org.jfree.data.time.Minute minute15 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = minute15.next();
        long long17 = regularTimePeriod16.getMiddleMillisecond();
        boolean boolean18 = minute0.equals((java.lang.Object) regularTimePeriod16);
// flaky "217) test734(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "214) test734(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "196) test734(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "171) test734(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "150) test734(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "116) test734(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "98) test734(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
// flaky "82) test734(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813609999L + "'", long17 == 1784813609999L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test735");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        boolean boolean4 = minute0.equals((java.lang.Object) 8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        int int9 = minute8.getMinute();
        java.util.Date date10 = minute8.getStart();
        boolean boolean11 = minute6.equals((java.lang.Object) date10);
        java.lang.String str12 = minute6.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = minute6.previous();
        java.util.Date date14 = minute6.getEnd();
        boolean boolean15 = minute0.equals((java.lang.Object) minute6);
        long long16 = minute6.getLastMillisecond();
// flaky "218) test735(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "215) test735(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(date10);
// flaky "197) test735(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "172) test735(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str12, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertNotNull(date14);
// flaky "151) test735(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date14.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "117) test735(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813579999L + "'", long16 == 1784813579999L);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test736");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        long long8 = minute0.getLastMillisecond();
        long long9 = minute0.getFirstMillisecond();
        long long10 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute0.previous();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "219) test736(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "216) test736(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "198) test736(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "173) test736(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "152) test736(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813520000L + "'", long9 == 1784813520000L);
// flaky "118) test736(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test737");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        long long6 = minute5.getLastMillisecond();
        int int7 = minute5.getMinute();
        long long8 = minute5.getMiddleMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "220) test737(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "217) test737(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "199) test737(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "174) test737(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "153) test737(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test738");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.next();
        java.lang.String str5 = minute0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
// flaky "221) test738(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "218) test738(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "200) test738(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod6);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test739");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = minute0.next();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getLastMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "222) test739(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "219) test739(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "201) test739(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test740");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date5);
        long long8 = minute7.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute7.previous();
        long long10 = minute7.getFirstMillisecond();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute11.next();
        long long13 = minute11.getMiddleMillisecond();
        int int14 = minute11.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        int int16 = minute11.compareTo(timePeriod15);
        long long17 = minute11.getLastMillisecond();
        java.util.Date date18 = minute11.getEnd();
        long long19 = minute11.getLastMillisecond();
        java.lang.String str20 = minute11.toString();
        boolean boolean21 = minute7.equals((java.lang.Object) minute11);
        java.util.Date date22 = minute11.getStart();
// flaky "223) test740(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "220) test740(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "202) test740(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "175) test740(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "154) test740(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "119) test740(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
// flaky "99) test740(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813520000L + "'", long10 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "83) test740(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
// flaky "68) test740(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813579999L + "'", long17 == 1784813579999L);
        org.junit.Assert.assertNotNull(date18);
// flaky "49) test740(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "35) test740(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813579999L + "'", long19 == 1784813579999L);
// flaky "27) test740(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str20, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(date22);
// flaky "21) test740(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date22.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test741");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.lang.Object obj5 = null;
        boolean boolean6 = minute0.equals(obj5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        long long10 = minute8.getMiddleMillisecond();
        int int11 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute8);
        org.jfree.data.time.Minute minute12 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = minute12.next();
        long long14 = minute12.getMiddleMillisecond();
        int int15 = minute12.getHourValue();
        java.util.Date date16 = minute12.getStart();
        java.util.Date date17 = minute12.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = minute12.previous();
        boolean boolean19 = minute8.equals((java.lang.Object) minute12);
        java.lang.Object obj20 = null;
        boolean boolean21 = minute12.equals(obj20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = minute12.next();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "224) test741(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "221) test741(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "203) test741(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "176) test741(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
// flaky "155) test741(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813549999L + "'", long14 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(date16);
// flaky "120) test741(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date17);
// flaky "100) test741(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date17.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod22);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test742");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        int int6 = minute0.getMinute();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = minute0.getMiddleMillisecond(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "225) test742(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "222) test742(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "204) test742(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
// flaky "177) test742(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test743");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        int int9 = minute7.getHourValue();
        int int10 = minute7.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute7.previous();
        int int12 = minute7.getHourValue();
        boolean boolean13 = minute2.equals((java.lang.Object) int12);
        long long14 = minute2.getMiddleMillisecond();
        int int15 = minute2.getHourValue();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor16 = null;
        java.util.Calendar calendar17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = minute2.getMillisecond(timePeriodAnchor16, calendar17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "226) test743(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "223) test743(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "205) test743(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "178) test743(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "156) test743(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813549999L + "'", long14 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test744");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = regularTimePeriod3.getEnd();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        java.util.Date date6 = minute5.getEnd();
        long long7 = minute5.getLastMillisecond();
// flaky "227) test744(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "224) test744(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "206) test744(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "179) test744(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:33:59 ICT 2026");
// flaky "157) test744(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813639999L + "'", long7 == 1784813639999L);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test745");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        int int9 = minute7.getHourValue();
        int int10 = minute7.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute7.previous();
        int int12 = minute7.getHourValue();
        boolean boolean13 = minute2.equals((java.lang.Object) int12);
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute14.next();
        long long16 = minute14.getMiddleMillisecond();
        boolean boolean17 = minute2.equals((java.lang.Object) minute14);
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute();
        int int19 = minute18.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = minute18.next();
        java.util.Date date21 = regularTimePeriod20.getStart();
        boolean boolean22 = minute2.equals((java.lang.Object) date21);
        long long23 = minute2.getLastMillisecond();
        java.util.Calendar calendar24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = minute2.getFirstMillisecond(calendar24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "228) test745(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "225) test745(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "207) test745(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "180) test745(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "158) test745(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "121) test745(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod20);
        org.junit.Assert.assertNotNull(date21);
// flaky "101) test745(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date21.toString(), "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "84) test745(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1784813579999L + "'", long23 == 1784813579999L);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test746");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) '4', 3, (int) (byte) 10, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test747");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        int int9 = minute7.getHourValue();
        int int10 = minute7.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute7.previous();
        int int12 = minute7.getHourValue();
        boolean boolean13 = minute2.equals((java.lang.Object) int12);
        long long14 = minute2.getLastMillisecond();
        java.util.Date date15 = minute2.getEnd();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute(date15);
        java.util.Calendar calendar17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = minute16.getLastMillisecond(calendar17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "229) test747(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "226) test747(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "208) test747(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "181) test747(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "159) test747(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813579999L + "'", long14 == 1784813579999L);
        org.junit.Assert.assertNotNull(date15);
// flaky "122) test747(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test748");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.lang.String str6 = minute0.toString();
        java.util.Date date7 = minute0.getStart();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        int int9 = minute8.getMinute();
        int int10 = minute8.getHourValue();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute();
        long long12 = minute11.getSerialIndex();
        long long13 = minute11.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute11.next();
        int int15 = minute8.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod14);
        long long16 = minute8.getMiddleMillisecond();
        boolean boolean17 = minute0.equals((java.lang.Object) minute8);
        java.util.Date date18 = minute8.getStart();
        java.lang.String str19 = minute8.toString();
// flaky "230) test748(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "227) test748(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "209) test748(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "182) test748(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "160) test748(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "123) test748(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
// flaky "102) test748(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "85) test748(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
// flaky "69) test748(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
// flaky "50) test748(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky "36) test748(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date18);
// flaky "28) test748(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "22) test748(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str19, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test749");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        java.util.Date date5 = minute0.getStart();
        long long6 = minute0.getLastMillisecond();
        java.util.Date date7 = minute0.getEnd();
        long long8 = minute0.getSerialIndex();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "231) test749(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "228) test749(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date5);
// flaky "210) test749(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "183) test749(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "161) test749(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "124) test749(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test750");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = regularTimePeriod3.getEnd();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date4);
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date4, timeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "232) test750(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "229) test750(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "211) test750(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test751");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute3.next();
        long long5 = minute3.getMiddleMillisecond();
        int int6 = minute3.getHourValue();
        int int7 = minute3.getMinute();
        long long8 = minute3.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute3.previous();
        boolean boolean10 = minute0.equals((java.lang.Object) regularTimePeriod9);
        java.lang.String str11 = minute0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute0.previous();
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute13.next();
        long long15 = minute13.getMiddleMillisecond();
        int int16 = minute13.getHourValue();
        java.util.Date date17 = minute13.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = minute13.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = minute13.previous();
        boolean boolean20 = minute0.equals((java.lang.Object) minute13);
        long long21 = minute13.getFirstMillisecond();
        org.jfree.data.time.TimePeriod timePeriod22 = null;
        int int23 = minute13.compareTo(timePeriod22);
// flaky "233) test751(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "230) test751(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "212) test751(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "184) test751(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "162) test751(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str11, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
// flaky "125) test751(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813549999L + "'", long15 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(date17);
// flaky "103) test751(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date17.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod18);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky "86) test751(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1784813520000L + "'", long21 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test752");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute3.next();
        long long5 = minute3.getMiddleMillisecond();
        int int6 = minute3.getHourValue();
        int int7 = minute3.getMinute();
        long long8 = minute3.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute3.previous();
        boolean boolean10 = minute0.equals((java.lang.Object) regularTimePeriod9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute0.previous();
// flaky "234) test752(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "231) test752(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "213) test752(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "185) test752(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test753");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        long long7 = minute6.getSerialIndex();
        long long8 = minute6.getMiddleMillisecond();
        long long9 = minute6.getFirstMillisecond();
        java.util.Date date10 = minute6.getStart();
        long long11 = minute6.getMiddleMillisecond();
        long long12 = minute6.getMiddleMillisecond();
        java.lang.String str13 = minute6.toString();
        int int14 = minute6.getHourValue();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute6.previous();
        boolean boolean16 = minute0.equals((java.lang.Object) minute6);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "235) test753(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "232) test753(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "214) test753(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 66566672L + "'", long7 == 66566672L);
// flaky "186) test753(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
// flaky "163) test753(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813520000L + "'", long9 == 1784813520000L);
        org.junit.Assert.assertNotNull(date10);
// flaky "126) test753(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "104) test753(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
// flaky "87) test753(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813549999L + "'", long12 == 1784813549999L);
// flaky "70) test753(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str13, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test754");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getStart();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.Day day3 = minute0.getDay();
        org.junit.Assert.assertNotNull(date1);
// flaky "236) test754(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "233) test754(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(day3);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test755");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        java.lang.String str5 = minute0.toString();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getFirstMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "237) test755(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "234) test755(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "215) test755(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test756");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        long long3 = minute0.getMiddleMillisecond();
        java.util.Date date4 = minute0.getEnd();
// flaky "238) test756(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "235) test756(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813549999L + "'", long3 == 1784813549999L);
        org.junit.Assert.assertNotNull(date4);
// flaky "216) test756(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test757");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        long long8 = minute0.getLastMillisecond();
        int int9 = minute0.getHourValue();
        org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute10.next();
        long long12 = minute10.getMiddleMillisecond();
        int int13 = minute10.getHourValue();
        java.util.Date date14 = minute10.getStart();
        int int15 = minute10.getMinute();
        java.util.Date date16 = minute10.getEnd();
        java.lang.String str17 = minute10.toString();
        java.util.Date date18 = minute10.getEnd();
        org.jfree.data.time.Minute minute19 = new org.jfree.data.time.Minute(date18);
        long long20 = minute19.getLastMillisecond();
        long long21 = minute19.getFirstMillisecond();
        boolean boolean22 = minute0.equals((java.lang.Object) long21);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "239) test757(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "236) test757(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "217) test757(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "187) test757(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
// flaky "164) test757(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813549999L + "'", long12 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(date14);
// flaky "127) test757(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date14.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "105) test757(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(date16);
// flaky "88) test757(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "71) test757(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str17, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date18);
// flaky "51) test757(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "37) test757(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813579999L + "'", long20 == 1784813579999L);
// flaky "29) test757(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1784813520000L + "'", long21 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test758");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getMinute();
        long long4 = minute0.getSerialIndex();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "240) test758(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "237) test758(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
// flaky "218) test758(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test759");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        int int11 = minute5.getHourValue();
        org.jfree.data.time.Minute minute12 = new org.jfree.data.time.Minute();
        long long13 = minute12.getSerialIndex();
        long long14 = minute12.getMiddleMillisecond();
        long long15 = minute12.getFirstMillisecond();
        java.util.Date date16 = minute12.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute12.previous();
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute();
        long long19 = minute18.getSerialIndex();
        long long20 = minute18.getMiddleMillisecond();
        long long21 = minute18.getLastMillisecond();
        int int22 = minute12.compareTo((org.jfree.data.time.TimePeriod) minute18);
        int int23 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute12);
        long long24 = minute5.getLastMillisecond();
        java.util.Date date25 = minute5.getEnd();
        java.util.Calendar calendar26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute27 = new org.jfree.data.time.Minute(date25, calendar26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "241) test759(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "238) test759(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "219) test759(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "188) test759(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "165) test759(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "128) test759(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "106) test759(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
// flaky "89) test759(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813549999L + "'", long14 == 1784813549999L);
// flaky "72) test759(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813520000L + "'", long15 == 1784813520000L);
        org.junit.Assert.assertNotNull(date16);
// flaky "52) test759(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "38) test759(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
// flaky "30) test759(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
// flaky "23) test759(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1784813579999L + "'", long21 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky "13) test759(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1784813579999L + "'", long24 == 1784813579999L);
        org.junit.Assert.assertNotNull(date25);
// flaky "11) test759(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date25.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test760");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.lang.Object obj5 = null;
        boolean boolean6 = minute0.equals(obj5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        long long10 = minute8.getMiddleMillisecond();
        int int11 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute8);
        long long12 = minute8.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = minute8.previous();
        org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = minute14.next();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute();
        int int17 = minute16.getMinute();
        java.util.Date date18 = minute16.getStart();
        boolean boolean19 = minute14.equals((java.lang.Object) date18);
        boolean boolean21 = minute14.equals((java.lang.Object) '4');
        java.util.Date date22 = minute14.getStart();
        int int23 = minute8.compareTo((org.jfree.data.time.TimePeriod) minute14);
        org.jfree.data.time.Minute minute24 = new org.jfree.data.time.Minute();
        int int25 = minute24.getMinute();
        int int26 = minute24.getHourValue();
        boolean boolean28 = minute24.equals((java.lang.Object) 8);
        java.util.Date date29 = minute24.getStart();
        int int30 = minute14.compareTo((org.jfree.data.time.TimePeriod) minute24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = minute14.next();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "242) test760(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "239) test760(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "220) test760(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "189) test760(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "166) test760(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "129) test760(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(date18);
// flaky "107) test760(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "90) test760(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date22.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky "73) test760(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20 + "'", int26 == 20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(date29);
// flaky "53) test760(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date29.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod31);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test761");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        int int2 = minute0.getHourValue();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute3.next();
        long long5 = minute3.getMiddleMillisecond();
        int int6 = minute3.getHourValue();
        int int7 = minute3.getMinute();
        long long8 = minute3.getLastMillisecond();
        long long9 = minute3.getSerialIndex();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute3);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute0.next();
        java.lang.String str12 = minute0.toString();
// flaky "243) test761(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "240) test761(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "221) test761(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "190) test761(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "167) test761(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
// flaky "130) test761(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str12, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test762");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        long long2 = minute0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.previous();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor4 = null;
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = minute0.getMillisecond(timePeriodAnchor4, calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "244) test762(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
// flaky "241) test762(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 66566672L + "'", long2 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test763");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        long long4 = minute3.getSerialIndex();
        long long5 = minute3.getMiddleMillisecond();
        long long6 = minute3.getLastMillisecond();
        long long7 = minute3.getFirstMillisecond();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute8.next();
        long long10 = minute8.getMiddleMillisecond();
        int int11 = minute8.getHourValue();
        int int12 = minute8.getMinute();
        int int13 = minute3.compareTo((org.jfree.data.time.TimePeriod) minute8);
        java.lang.String str14 = minute8.toString();
        boolean boolean15 = minute0.equals((java.lang.Object) minute8);
        java.lang.String str16 = minute0.toString();
        java.util.Calendar calendar17 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "245) test763(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "242) test763(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "222) test763(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "191) test763(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "168) test763(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "131) test763(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
// flaky "108) test763(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "91) test763(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "74) test763(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str14, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky "54) test763(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str16, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test764");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        int int11 = minute6.compareTo(timePeriod10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute6.next();
        int int13 = minute6.getMinute();
        boolean boolean14 = minute0.equals((java.lang.Object) minute6);
        org.jfree.data.time.Minute minute15 = new org.jfree.data.time.Minute();
        long long16 = minute15.getSerialIndex();
        long long17 = minute15.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = minute15.next();
        long long19 = minute15.getFirstMillisecond();
        int int20 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute15);
        long long21 = minute15.getSerialIndex();
        org.jfree.data.time.Minute minute22 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = minute22.next();
        long long24 = minute22.getMiddleMillisecond();
        int int25 = minute22.getHourValue();
        long long26 = minute22.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = minute22.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = minute22.next();
        int int29 = minute15.compareTo((org.jfree.data.time.TimePeriod) minute22);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "246) test764(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "243) test764(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "223) test764(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "192) test764(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66566672L + "'", long16 == 66566672L);
// flaky "169) test764(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
// flaky "132) test764(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813520000L + "'", long19 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky "109) test764(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 66566672L + "'", long21 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod23);
// flaky "92) test764(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1784813549999L + "'", long24 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
// flaky "75) test764(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 66566672L + "'", long26 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod27);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test765");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        long long5 = minute0.getLastMillisecond();
        java.lang.String str6 = minute0.toString();
        long long7 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        long long10 = minute8.getMiddleMillisecond();
        long long11 = minute8.getFirstMillisecond();
        java.util.Date date12 = minute8.getStart();
        long long13 = minute8.getSerialIndex();
        int int14 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute8);
        java.util.Date date15 = minute8.getStart();
        java.util.TimeZone timeZone16 = null;
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute(date15, timeZone16, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "247) test765(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "244) test765(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "224) test765(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
// flaky "193) test765(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "170) test765(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 66566672L + "'", long7 == 66566672L);
// flaky "133) test765(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "110) test765(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
// flaky "93) test765(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813520000L + "'", long11 == 1784813520000L);
        org.junit.Assert.assertNotNull(date12);
// flaky "76) test765(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "55) test765(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(date15);
// flaky "39) test765(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test766");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        boolean boolean4 = minute0.equals((java.lang.Object) 8);
        long long5 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod10 = null;
        int int11 = minute6.compareTo(timePeriod10);
        long long12 = minute6.getLastMillisecond();
        int int13 = minute6.getMinute();
        long long14 = minute6.getLastMillisecond();
        int int15 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute6);
        java.lang.Class<?> wildcardClass16 = minute0.getClass();
// flaky "248) test766(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "245) test766(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 66566672L + "'", long5 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "225) test766(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "194) test766(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
// flaky "171) test766(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
// flaky "134) test766(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813579999L + "'", long14 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test767");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.previous();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        java.util.Date date9 = minute7.getStart();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute7);
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute();
        int int12 = minute11.getMinute();
        int int13 = minute11.getHourValue();
        boolean boolean15 = minute11.equals((java.lang.Object) 8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = minute11.previous();
        int int17 = minute11.getHourValue();
        int int18 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute11);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "249) test767(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "246) test767(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "226) test767(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "195) test767(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "172) test767(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test768");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        int int7 = minute0.getHourValue();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        long long10 = minute8.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute8.next();
        boolean boolean12 = minute0.equals((java.lang.Object) minute8);
        java.util.Date date13 = minute8.getStart();
        java.util.Date date14 = minute8.getStart();
// flaky "250) test768(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "247) test768(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "227) test768(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "196) test768(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "173) test768(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(date13);
// flaky "135) test768(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date14);
// flaky "111) test768(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date14.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test769");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        long long6 = minute0.getLastMillisecond();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        long long8 = minute7.getSerialIndex();
        long long9 = minute7.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute7.next();
        int int11 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute0.next();
        long long13 = minute0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute0.next();
        int int15 = minute0.getHourValue();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor16 = null;
        java.util.Calendar calendar17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = minute0.getMillisecond(timePeriodAnchor16, calendar17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "251) test769(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "248) test769(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "228) test769(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "197) test769(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "174) test769(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "136) test769(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "112) test769(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
// flaky "94) test769(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "77) test769(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test770");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.previous();
        java.lang.String str7 = minute0.toString();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "252) test770(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "249) test770(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "229) test770(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str7, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test771");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute3.next();
        long long5 = minute3.getMiddleMillisecond();
        int int6 = minute3.getHourValue();
        int int7 = minute3.getMinute();
        long long8 = minute3.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute3.previous();
        boolean boolean10 = minute0.equals((java.lang.Object) regularTimePeriod9);
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute11.next();
        long long13 = minute11.getMiddleMillisecond();
        int int14 = minute11.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod15 = null;
        int int16 = minute11.compareTo(timePeriod15);
        long long17 = minute11.getLastMillisecond();
        int int18 = minute11.getMinute();
        java.lang.String str19 = minute11.toString();
        int int20 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute11);
        int int21 = minute11.getHourValue();
        java.lang.Class<?> wildcardClass22 = minute11.getClass();
// flaky "253) test771(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "250) test771(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "230) test771(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "198) test771(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "175) test771(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
// flaky "137) test771(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813579999L + "'", long17 == 1784813579999L);
// flaky "113) test771(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
// flaky "95) test771(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str19, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest1.test772");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        long long7 = minute5.getMiddleMillisecond();
        int int8 = minute5.getHourValue();
        int int9 = minute5.getMinute();
        int int10 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute5);
        int int11 = minute5.getHourValue();
        java.util.Date date12 = minute5.getStart();
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute();
        int int14 = minute13.getMinute();
        java.util.Date date15 = minute13.getStart();
        java.util.Date date16 = minute13.getEnd();
        long long17 = minute13.getFirstMillisecond();
        java.util.Date date18 = minute13.getStart();
        java.lang.Class<?> wildcardClass19 = date18.getClass();
        boolean boolean20 = minute5.equals((java.lang.Object) wildcardClass19);
        java.util.Date date21 = minute5.getEnd();
        org.jfree.data.time.Minute minute22 = new org.jfree.data.time.Minute(date21);
        java.util.TimeZone timeZone23 = null;
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute25 = new org.jfree.data.time.Minute(date21, timeZone23, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "254) test772(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "251) test772(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "231) test772(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "199) test772(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "176) test772(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "138) test772(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(date12);
// flaky "114) test772(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "96) test772(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(date15);
// flaky "78) test772(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date16);
// flaky "56) test772(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "40) test772(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813520000L + "'", long17 == 1784813520000L);
        org.junit.Assert.assertNotNull(date18);
// flaky "31) test772(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date21);
// flaky "24) test772(org.jfree.data.time.MinuteRegressionTest1)":         org.junit.Assert.assertEquals(date21.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }
}
