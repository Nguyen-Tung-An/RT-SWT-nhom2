package org.jfree.data.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MinuteRegressionTest0 {

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
            System.out.format("%n%s%n", "MinuteRegressionTest0.test001");
        int int0 = org.jfree.chart.date.MonthConstants.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test002");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = minute0.getFirstMillisecond(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test003");
        int int0 = org.jfree.data.time.Minute.LAST_MINUTE_IN_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 59 + "'", int0 == 59);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test004");
        int int0 = org.jfree.chart.date.MonthConstants.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test005");
        org.jfree.data.time.Hour hour1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute((int) (short) 1, hour1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'hour' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test006");
        int int0 = org.jfree.chart.date.MonthConstants.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test007");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "1) test007(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test008");
        java.util.Date date0 = null;
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute(date0, timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'time' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test009");
        java.util.Calendar calendar0 = null;
        org.jfree.data.time.RegularTimePeriod.setThreadLocalCalendarInstance(calendar0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test010");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.TimeZone timeZone3 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date2, timeZone3, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "2) test010(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "1) test010(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test011");
        int int0 = org.jfree.data.time.Minute.FIRST_MINUTE_IN_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test012");
        org.jfree.data.time.Minute minute1 = org.jfree.data.time.Minute.parseMinute("");
        org.junit.Assert.assertNull(minute1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test013");
        int int0 = org.jfree.chart.date.MonthConstants.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test014");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = minute0.getFirstMillisecond(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "3) test014(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "2) test014(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test015");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = minute0.getMiddleMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "4) test015(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "3) test015(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test016");
        int int0 = org.jfree.chart.date.MonthConstants.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test017");
        int int0 = org.jfree.chart.date.MonthConstants.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test018");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = minute0.getLastMillisecond(calendar1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test019");
        java.util.Calendar calendar0 = null;
        org.jfree.data.time.RegularTimePeriod.setCalendarInstancePrototype(calendar0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test020");
        int int0 = org.jfree.chart.date.MonthConstants.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test021");
        org.jfree.data.time.Minute minute1 = org.jfree.data.time.Minute.parseMinute("hi!");
        org.junit.Assert.assertNull(minute1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test022");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = minute0.getFirstMillisecond(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "5) test022(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(59, (int) '#', 11, 32, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test024");
        int int0 = org.jfree.chart.date.MonthConstants.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test025");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "6) test025(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test026");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = minute0.getMiddleMillisecond(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "7) test026(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test027");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor4 = null;
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = regularTimePeriod3.getMillisecond(timePeriodAnchor4, calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "8) test027(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "4) test027(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test028");
        int int0 = org.jfree.chart.date.MonthConstants.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test029");
        int int0 = org.jfree.chart.date.MonthConstants.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test030");
        int int0 = org.jfree.chart.date.MonthConstants.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test031");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(11, 9, 59, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test032");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.lang.Object obj5 = null;
        boolean boolean6 = minute0.equals(obj5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute0.getFirstMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "9) test032(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "5) test032(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test033");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor4 = null;
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = minute0.getMillisecond(timePeriodAnchor4, calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "10) test033(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test034");
        int int0 = org.jfree.chart.date.MonthConstants.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) 'a', 20, 8, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test036");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getEnd();
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute(date1, calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
// flaky "11) test036(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test037");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = regularTimePeriod3.getMiddleMillisecond(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "12) test037(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "6) test037(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test038");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getStart();
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute(date1, timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
// flaky "13) test038(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test039");
        java.util.Date date0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute(date0, calendar1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'time' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test040");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date4, calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "14) test040(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "7) test040(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test041");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.lang.Object obj5 = null;
        boolean boolean6 = minute0.equals(obj5);
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = minute0.getMiddleMillisecond(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "15) test041(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "8) test041(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test042");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = minute0.getEnd();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = minute0.getMiddleMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "16) test042(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "9) test042(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "1) test042(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test043");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "17) test043(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "10) test043(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test044");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = minute0.getEnd();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date4, calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "18) test044(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "11) test044(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "2) test044(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test045");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "19) test045(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test046");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getStart();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = minute0.getMillisecond(timePeriodAnchor2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
// flaky "20) test046(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test047");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) '4', (int) ' ', (int) (byte) 10, 12, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test048");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = regularTimePeriod3.getEnd();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date4, calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "21) test048(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "12) test048(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "3) test048(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test049");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
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
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "22) test049(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "13) test049(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "4) test049(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test050");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = minute0.getLastMillisecond(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "23) test050(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "14) test050(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test051");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.Day day1 = minute0.getDay();
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = minute0.getFirstMillisecond(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(day1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test052");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(9, (int) (short) -1, (int) '#', 32, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test053");
        org.jfree.data.time.Hour hour1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute(0, hour1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'hour' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test054");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        long long6 = minute0.getLastMillisecond();
        org.jfree.data.time.Hour hour7 = minute0.getHour();
// flaky "24) test054(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "15) test054(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "5) test054(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "1) test054(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "1) test054(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "1) test054(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(hour7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test055");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = regularTimePeriod1.getMiddleMillisecond(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test056");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.lang.Object obj5 = null;
        boolean boolean6 = minute0.equals(obj5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        java.lang.Class<?> wildcardClass8 = regularTimePeriod7.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "25) test056(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "16) test056(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test057");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute5.getFirstMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "26) test057(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "17) test057(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test058");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.next();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor6 = null;
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = regularTimePeriod5.getMillisecond(timePeriodAnchor6, calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "27) test058(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "18) test058(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test059");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        java.util.Date date5 = minute0.getStart();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date5, calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "28) test059(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "19) test059(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date5);
// flaky "6) test059(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test060");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = minute0.getEnd();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "29) test060(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "20) test060(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "7) test060(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test061");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date5, calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "30) test061(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "21) test061(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "8) test061(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "2) test061(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "2) test061(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test062");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(7, (int) (byte) 0, (int) (byte) -1, 59, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test063");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor8 = null;
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = minute0.getMillisecond(timePeriodAnchor8, calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "31) test063(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "22) test063(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "9) test063(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test064");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        java.lang.Class<?> wildcardClass4 = minute0.getClass();
// flaky "32) test064(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "23) test064(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "10) test064(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test065");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        long long6 = minute5.getLastMillisecond();
        java.lang.Class<?> wildcardClass7 = minute5.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "33) test065(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "24) test065(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "11) test065(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test066");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        java.util.TimeZone timeZone6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date4, timeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "34) test066(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "25) test066(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test067");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(7, (int) ' ', 11, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test068");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getLastMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "35) test068(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "26) test068(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "12) test068(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "3) test068(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "3) test068(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test069");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getMiddleMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "36) test069(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "27) test069(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "13) test069(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test070");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.lang.Class<?> wildcardClass4 = regularTimePeriod3.getClass();
// flaky "37) test070(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "28) test070(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test071");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        java.util.Date date7 = minute0.getEnd();
        java.util.TimeZone timeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute(date7, timeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "38) test071(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "29) test071(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "14) test071(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test072");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.lang.Object obj5 = null;
        boolean boolean6 = minute0.equals(obj5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        java.util.Date date8 = regularTimePeriod7.getEnd();
        java.util.TimeZone timeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date8, timeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "39) test072(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "30) test072(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
// flaky "15) test072(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test073");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) (short) 0, (int) (short) -1, (int) (short) 0, 5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test074");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getMiddleMillisecond();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getMiddleMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "40) test074(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "31) test074(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "16) test074(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test075");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getEnd();
        org.jfree.data.time.Day day2 = minute0.getDay();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = minute0.getMiddleMillisecond(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
// flaky "41) test075(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(day2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test076");
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
        java.util.Calendar calendar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = minute0.getMiddleMillisecond(calendar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "42) test076(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "32) test076(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "17) test076(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "4) test076(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "4) test076(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "2) test076(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test077");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = minute0.getMiddleMillisecond(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "43) test077(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "33) test077(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test078");
        org.jfree.data.time.Minute minute1 = org.jfree.data.time.Minute.parseMinute("Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNull(minute1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test079");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        org.jfree.data.time.Day day3 = minute0.getDay();
// flaky "44) test079(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "34) test079(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(day3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test080");
        org.jfree.data.time.Minute minute1 = org.jfree.data.time.Minute.parseMinute("Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNull(minute1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test081");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        java.lang.String str6 = minute0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        java.util.Date date8 = minute0.getEnd();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute(date8, calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "45) test081(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "35) test081(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "18) test081(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
// flaky "5) test081(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test082");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = minute0.getFirstMillisecond(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "46) test082(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test083");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        int int7 = minute0.getMinute();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute0.getFirstMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "47) test083(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "36) test083(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "19) test083(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test084");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor5 = null;
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getMillisecond(timePeriodAnchor5, calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "48) test084(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "37) test084(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test085");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(32, 8, (int) 'a', (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test086");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        java.util.Date date5 = minute0.getStart();
        java.util.TimeZone timeZone6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date5, timeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "49) test086(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "38) test086(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date5);
// flaky "20) test086(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test087");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.util.Date date5 = minute0.getStart();
        java.util.TimeZone timeZone6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date5, timeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "50) test087(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "39) test087(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(date5);
// flaky "21) test087(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test088");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date3, calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "51) test088(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "40) test088(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "22) test088(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test089");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date5, calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "52) test089(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "41) test089(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "23) test089(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "6) test089(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "5) test089(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test090");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.next();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor5 = null;
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getMillisecond(timePeriodAnchor5, calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "53) test090(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "42) test090(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test091");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) 'a', 9, (-1), 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test092");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor4 = null;
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = minute0.getMillisecond(timePeriodAnchor4, calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "54) test092(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "43) test092(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test093");
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
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = minute0.getMiddleMillisecond(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "55) test093(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "44) test093(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "24) test093(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "7) test093(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test094");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.util.Date date5 = minute0.getStart();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getFirstMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "56) test094(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "45) test094(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(date5);
// flaky "25) test094(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test095");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = minute0.getEnd();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = minute0.getLastMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "57) test095(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "46) test095(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "26) test095(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test096");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor5 = null;
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = regularTimePeriod4.getMillisecond(timePeriodAnchor5, calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "58) test096(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "47) test096(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test097");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "59) test097(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "48) test097(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test098");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = minute0.next();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = minute0.getMiddleMillisecond(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "60) test098(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test099");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = regularTimePeriod3.getEnd();
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date4, timeZone5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "61) test099(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "49) test099(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "27) test099(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test100");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getEnd();
        long long2 = minute0.getFirstMillisecond();
        java.lang.Class<?> wildcardClass3 = minute0.getClass();
        org.junit.Assert.assertNotNull(date1);
// flaky "62) test100(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "50) test100(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813520000L + "'", long2 == 1784813520000L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test101");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        int int7 = minute0.getMinute();
        long long8 = minute0.getLastMillisecond();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = minute0.getLastMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "63) test101(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "51) test101(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "28) test101(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "8) test101(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test102");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(59, 6, 0, 32, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test103");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        long long4 = minute0.getLastMillisecond();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = minute0.getFirstMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "64) test103(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "52) test103(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "29) test103(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
// flaky "9) test103(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813579999L + "'", long4 == 1784813579999L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test104");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = minute0.getEnd();
        java.lang.Class<?> wildcardClass5 = date4.getClass();
// flaky "65) test104(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "53) test104(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "30) test104(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test105");
        org.jfree.data.time.Minute minute1 = org.jfree.data.time.Minute.parseMinute("Thu Jul 23 20:31:00 ICT 2026");
        org.junit.Assert.assertNull(minute1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test106");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        long long4 = minute0.getFirstMillisecond();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = minute0.getLastMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "66) test106(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "54) test106(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "31) test106(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test107");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getMiddleMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "67) test107(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "55) test107(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "32) test107(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "10) test107(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test108");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.lang.Class<?> wildcardClass4 = minute0.getClass();
// flaky "68) test108(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "56) test108(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test109");
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
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = minute0.getLastMillisecond(calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "69) test109(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "57) test109(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "33) test109(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test110");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        java.util.Date date8 = minute0.getEnd();
        java.util.TimeZone timeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date8, timeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "70) test110(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "58) test110(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "34) test110(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "11) test110(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test111");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
        java.util.Date date7 = regularTimePeriod6.getStart();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date7);
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = minute8.getFirstMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "71) test111(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date7);
// flaky "59) test111(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test112");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) '#', (int) (short) 100, (int) (byte) -1, 32, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test113");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getEnd();
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
// flaky "72) test113(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test114");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = minute0.getFirstMillisecond(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "73) test114(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test115");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = minute0.getFirstMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "74) test115(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "60) test115(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "35) test115(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "12) test115(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test116");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        long long8 = minute0.getMiddleMillisecond();
// flaky "75) test116(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "61) test116(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "36) test116(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test117");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.Minute minute1 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = minute1.next();
        long long3 = minute1.getMiddleMillisecond();
        int int4 = minute1.getHourValue();
        int int5 = minute1.getMinute();
        long long6 = minute1.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute1.previous();
        boolean boolean8 = minute0.equals((java.lang.Object) regularTimePeriod7);
        java.lang.Class<?> wildcardClass9 = regularTimePeriod7.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod2);
// flaky "76) test117(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813549999L + "'", long3 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
// flaky "62) test117(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
// flaky "37) test117(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test118");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getHourValue();
        java.lang.Class<?> wildcardClass2 = minute0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test119");
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
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = minute8.getLastMillisecond(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "77) test119(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "63) test119(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "38) test119(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "13) test119(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test120");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(0, 12, 12, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test121");
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
        java.lang.Class<?> wildcardClass15 = minute0.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "78) test121(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "64) test121(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "39) test121(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test122");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.util.Date date6 = minute0.getEnd();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date6, calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "79) test122(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "65) test122(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "40) test122(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "14) test122(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "6) test122(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertNotNull(date6);
// flaky "3) test122(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test123");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        java.util.Date date6 = minute5.getStart();
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date6, timeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "80) test123(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "66) test123(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "41) test123(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test124");
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
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = minute6.getLastMillisecond(calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "81) test124(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "67) test124(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "42) test124(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test125");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date4, timeZone5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "82) test125(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "68) test125(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "43) test125(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "15) test125(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test126");
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
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = minute2.getFirstMillisecond(calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "83) test126(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "69) test126(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "44) test126(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "16) test126(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "7) test126(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813579999L + "'", long14 == 1784813579999L);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test127");
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
        java.util.Calendar calendar21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = minute15.getFirstMillisecond(calendar21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "84) test127(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "70) test127(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "45) test127(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "17) test127(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66566672L + "'", long16 == 66566672L);
// flaky "8) test127(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
// flaky "4) test127(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813520000L + "'", long19 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test128");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor6 = null;
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = minute0.getMillisecond(timePeriodAnchor6, calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "85) test128(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "71) test128(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date5);
// flaky "46) test128(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test129");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.next();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor6 = null;
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = minute0.getMillisecond(timePeriodAnchor6, calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "86) test129(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "72) test129(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test130");
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
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor10 = null;
        java.util.Calendar calendar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = minute0.getMillisecond(timePeriodAnchor10, calendar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod2);
// flaky "87) test130(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813549999L + "'", long3 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
// flaky "73) test130(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
// flaky "47) test130(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky "18) test130(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test131");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(6, 1, 20, 7, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test132");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = regularTimePeriod1.getMiddleMillisecond();
        java.util.Date date3 = regularTimePeriod1.getStart();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date3, calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "88) test132(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813609999L + "'", long2 == 1784813609999L);
        org.junit.Assert.assertNotNull(date3);
// flaky "74) test132(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test133");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test134");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date4, calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "89) test134(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "75) test134(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "48) test134(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "19) test134(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test135");
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
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = minute0.getFirstMillisecond(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "90) test135(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "76) test135(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "49) test135(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "20) test135(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test136");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        long long4 = minute0.getFirstMillisecond();
        int int5 = minute0.getMinute();
// flaky "91) test136(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "77) test136(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "50) test136(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
// flaky "21) test136(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test137");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        java.lang.Class<?> wildcardClass6 = minute0.getClass();
// flaky "92) test137(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "78) test137(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "51) test137(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "22) test137(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "9) test137(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test138");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.util.Date date5 = minute0.getEnd();
        java.util.TimeZone timeZone6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date5, timeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "93) test138(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "79) test138(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(date5);
// flaky "52) test138(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test139");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Day day2 = minute0.getDay();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor3 = null;
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = day2.getMillisecond(timePeriodAnchor3, calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "94) test139(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(day2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test140");
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
        java.lang.Class<?> wildcardClass22 = minute15.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "95) test140(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "80) test140(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "53) test140(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "23) test140(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66566672L + "'", long16 == 66566672L);
// flaky "10) test140(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
// flaky "5) test140(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813520000L + "'", long19 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky "1) test140(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 66566672L + "'", long21 == 66566672L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test141");
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
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor10 = null;
        java.util.Calendar calendar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = minute4.getMillisecond(timePeriodAnchor10, calendar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "96) test141(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "81) test141(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "54) test141(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "24) test141(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test142");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        java.lang.Class<?> wildcardClass5 = date4.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "97) test142(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "82) test142(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test143");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) 'a', (int) '#', (int) (byte) 100, 8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test144");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "98) test144(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "83) test144(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test145");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getEnd();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = minute0.getMillisecond(timePeriodAnchor2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
// flaky "99) test145(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test146");
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
        long long18 = minute15.getFirstMillisecond();
        java.util.Date date19 = minute15.getStart();
        long long20 = minute15.getMiddleMillisecond();
        java.util.Date date21 = minute15.getEnd();
        int int22 = minute6.compareTo((org.jfree.data.time.TimePeriod) minute15);
        java.util.Calendar calendar23 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute6.peg(calendar23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "100) test146(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "84) test146(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "55) test146(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "25) test146(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66566672L + "'", long16 == 66566672L);
// flaky "11) test146(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
// flaky "6) test146(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813520000L + "'", long18 == 1784813520000L);
        org.junit.Assert.assertNotNull(date19);
// flaky "2) test146(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date19.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "1) test146(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
        org.junit.Assert.assertNotNull(date21);
// flaky "1) test146(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date21.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test147");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        java.util.Date date7 = minute0.getEnd();
        long long8 = minute0.getLastMillisecond();
        java.lang.Class<?> wildcardClass9 = minute0.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "101) test147(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "85) test147(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "56) test147(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "26) test147(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test148");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Day day5 = minute0.getDay();
// flaky "102) test148(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "86) test148(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "57) test148(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "27) test148(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(day5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test149");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        org.jfree.data.time.Day day7 = minute6.getDay();
// flaky "103) test149(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "87) test149(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "58) test149(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "28) test149(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "12) test149(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(day7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test150");
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
        java.lang.Class<?> wildcardClass12 = minute0.getClass();
// flaky "104) test150(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "88) test150(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "59) test150(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "29) test150(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "13) test150(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "7) test150(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "3) test150(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
// flaky "2) test150(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test151");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        int int4 = minute0.getHourValue();
        long long5 = minute0.getFirstMillisecond();
// flaky "105) test151(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "89) test151(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
// flaky "60) test151(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813520000L + "'", long5 == 1784813520000L);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test152");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = minute0.getMiddleMillisecond(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "106) test152(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "90) test152(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test153");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(0, 2, (int) '#', 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test154");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        java.lang.String str5 = minute0.toString();
// flaky "107) test154(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "91) test154(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "61) test154(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "30) test154(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "14) test154(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test155");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        int int5 = minute0.getMinute();
        java.util.Date date6 = minute0.getEnd();
        long long7 = minute0.getMiddleMillisecond();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute0.getMiddleMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "108) test155(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "92) test155(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "62) test155(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky "31) test155(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "15) test155(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test156");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getFirstMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "109) test156(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test157");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        java.lang.Class<?> wildcardClass8 = regularTimePeriod7.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "110) test157(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "93) test157(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test158");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) (short) 1, (int) (byte) 100, 8, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test159");
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
        long long18 = minute15.getFirstMillisecond();
        java.util.Date date19 = minute15.getStart();
        long long20 = minute15.getMiddleMillisecond();
        java.util.Date date21 = minute15.getEnd();
        int int22 = minute6.compareTo((org.jfree.data.time.TimePeriod) minute15);
        java.util.Calendar calendar23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = minute15.getFirstMillisecond(calendar23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "111) test159(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "94) test159(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "63) test159(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "32) test159(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66566672L + "'", long16 == 66566672L);
// flaky "16) test159(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
// flaky "8) test159(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813520000L + "'", long18 == 1784813520000L);
        org.junit.Assert.assertNotNull(date19);
// flaky "4) test159(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date19.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "3) test159(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
        org.junit.Assert.assertNotNull(date21);
// flaky "2) test159(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date21.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test160");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        java.lang.Class<?> wildcardClass8 = minute0.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "112) test160(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "95) test160(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test161");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        boolean boolean4 = minute0.equals((java.lang.Object) 8);
        java.lang.String str5 = minute0.toString();
        org.jfree.data.time.Day day6 = minute0.getDay();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = minute0.getLastMillisecond(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "113) test161(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "96) test161(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(day6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test162");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Hour hour6 = minute0.getHour();
// flaky "114) test162(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "97) test162(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "64) test162(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "33) test162(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "17) test162(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(hour6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test163");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
        java.util.Date date7 = regularTimePeriod6.getStart();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date7, calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "115) test163(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date7);
// flaky "98) test163(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test164");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.lang.Object obj5 = null;
        boolean boolean6 = minute0.equals(obj5);
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor7 = null;
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute0.getMillisecond(timePeriodAnchor7, calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "116) test164(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "99) test164(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test165");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
        long long6 = regularTimePeriod5.getMiddleMillisecond();
// flaky "117) test165(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "100) test165(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "65) test165(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "34) test165(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "18) test165(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813489999L + "'", long6 == 1784813489999L);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test166");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        boolean boolean7 = minute0.equals((java.lang.Object) '4');
        java.util.Date date8 = minute0.getStart();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute(date8, calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "118) test166(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "101) test166(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "66) test166(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test167");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        java.lang.Class<?> wildcardClass2 = minute0.getClass();
// flaky "119) test167(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test168");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.previous();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "120) test168(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "102) test168(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod3);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test169");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        java.lang.String str6 = minute0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        java.lang.String str8 = regularTimePeriod7.toString();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "121) test169(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "103) test169(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "67) test169(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "35) test169(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Thu Jul 23 20:31:00 ICT 2026" + "'", str8, "Thu Jul 23 20:31:00 ICT 2026");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test170");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        java.lang.Class<?> wildcardClass5 = minute0.getClass();
// flaky "122) test170(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "104) test170(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "68) test170(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "36) test170(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test171");
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
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = regularTimePeriod14.getMiddleMillisecond(calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "123) test171(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "105) test171(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "69) test171(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "37) test171(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "19) test171(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "9) test171(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "5) test171(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
// flaky "4) test171(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "3) test171(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test172");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        java.lang.Class<?> wildcardClass3 = minute0.getClass();
// flaky "124) test172(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "106) test172(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test173");
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
        long long16 = minute7.getFirstMillisecond();
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
// flaky "125) test173(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "107) test173(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "70) test173(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "38) test173(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky "20) test173(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813579999L + "'", long13 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
// flaky "10) test173(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813520000L + "'", long16 == 1784813520000L);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test174");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.lang.String str6 = minute0.toString();
        java.util.Date date7 = minute0.getStart();
        java.util.Date date8 = minute0.getStart();
        java.util.TimeZone timeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date8, timeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "126) test174(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "108) test174(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "71) test174(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "39) test174(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "21) test174(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "11) test174(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
// flaky "6) test174(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date8);
// flaky "5) test174(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test175");
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
        java.lang.Class<?> wildcardClass14 = minute0.getClass();
// flaky "127) test175(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "109) test175(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "72) test175(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "40) test175(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "22) test175(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "12) test175(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "7) test175(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
// flaky "6) test175(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "4) test175(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test176");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.lang.String str6 = minute0.toString();
        java.util.Date date7 = minute0.getStart();
        java.util.Date date8 = minute0.getStart();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute(date8, calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "128) test176(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "110) test176(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "73) test176(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "41) test176(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "23) test176(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "13) test176(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
// flaky "8) test176(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date8);
// flaky "7) test176(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test177");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "129) test177(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "111) test177(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "74) test177(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "42) test177(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test178");
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
        java.util.Calendar calendar22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = minute15.getFirstMillisecond(calendar22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "130) test178(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "112) test178(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "75) test178(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "43) test178(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66566672L + "'", long16 == 66566672L);
// flaky "24) test178(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
// flaky "14) test178(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813520000L + "'", long19 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky "9) test178(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 66566672L + "'", long21 == 66566672L);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test179");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getEnd();
        long long2 = minute0.getFirstMillisecond();
        long long3 = minute0.getSerialIndex();
        org.jfree.data.time.Hour hour4 = minute0.getHour();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = minute0.getFirstMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
// flaky "131) test179(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "113) test179(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813520000L + "'", long2 == 1784813520000L);
// flaky "76) test179(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 66566672L + "'", long3 == 66566672L);
        org.junit.Assert.assertNotNull(hour4);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test180");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date5);
        java.util.TimeZone timeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute(date5, timeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "132) test180(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "114) test180(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "77) test180(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "44) test180(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "25) test180(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test181");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.Hour hour1 = minute0.getHour();
        org.junit.Assert.assertNotNull(hour1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test182");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getHourValue();
        org.jfree.data.time.Day day2 = minute0.getDay();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(day2);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test183");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) (short) 100, 2, 0, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test184");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) (short) -1, (int) 'a', 4, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test185");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getMiddleMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "133) test185(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "115) test185(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test186");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
        java.util.Date date7 = regularTimePeriod6.getStart();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = regularTimePeriod6.getMiddleMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "134) test186(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date7);
// flaky "116) test186(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test187");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        java.lang.String str5 = minute0.toString();
        java.lang.Class<?> wildcardClass6 = minute0.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "135) test187(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "117) test187(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "78) test187(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "45) test187(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test188");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute(date2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "136) test188(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "118) test188(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test189");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = minute0.getMillisecond(timePeriodAnchor2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test190");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) (short) 0, 10, 10, (int) 'a', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test191");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(32, (int) (short) 1, 20, 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test192");
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
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = minute0.getFirstMillisecond(calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "137) test192(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "119) test192(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "79) test192(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "46) test192(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "26) test192(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "15) test192(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "10) test192(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test193");
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
        java.util.TimeZone timeZone11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute(date10, timeZone11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "138) test193(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "120) test193(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
// flaky "80) test193(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test194");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.next();
        java.lang.Class<?> wildcardClass6 = minute0.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "139) test194(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "121) test194(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test195");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.previous();
        java.lang.String str7 = regularTimePeriod6.toString();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor8 = null;
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = regularTimePeriod6.getMillisecond(timePeriodAnchor8, calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "140) test195(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "122) test195(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "81) test195(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu Jul 23 20:31:00 ICT 2026" + "'", str7, "Thu Jul 23 20:31:00 ICT 2026");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test196");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        java.util.Date date8 = minute0.getEnd();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date8);
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = minute9.getMiddleMillisecond(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "141) test196(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "123) test196(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "82) test196(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "47) test196(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test197");
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
        java.util.Calendar calendar21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = minute5.getFirstMillisecond(calendar21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "142) test197(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "124) test197(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "83) test197(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "48) test197(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "27) test197(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "16) test197(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(date12);
// flaky "11) test197(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "8) test197(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(date15);
// flaky "5) test197(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date16);
// flaky "1) test197(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "1) test197(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813520000L + "'", long17 == 1784813520000L);
        org.junit.Assert.assertNotNull(date18);
// flaky "1) test197(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test198");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.previous();
        long long7 = regularTimePeriod6.getMiddleMillisecond();
        java.lang.Class<?> wildcardClass8 = regularTimePeriod6.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "143) test198(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "125) test198(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date5);
// flaky "84) test198(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "49) test198(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813489999L + "'", long7 == 1784813489999L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test199");
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
            minute5.peg(calendar13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "144) test199(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "126) test199(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "85) test199(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "50) test199(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "28) test199(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "17) test199(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(date12);
// flaky "12) test199(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test200");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(5, (int) '4', 3, 0, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test201");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.Day day1 = minute0.getDay();
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = minute0.getMiddleMillisecond(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(day1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test202");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "145) test202(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "127) test202(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test203");
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
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "146) test203(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "128) test203(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "86) test203(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "51) test203(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "29) test203(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "18) test203(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "13) test203(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
// flaky "9) test203(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test204");
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
        org.jfree.data.time.Minute minute27 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = minute27.next();
        long long29 = minute27.getMiddleMillisecond();
        int int30 = minute27.getHourValue();
        java.util.Date date31 = minute27.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = minute27.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = minute27.previous();
        int int34 = minute16.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod33);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "147) test204(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "129) test204(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "87) test204(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "52) test204(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(date13);
// flaky "30) test204(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "19) test204(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813579999L + "'", long15 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "14) test204(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813549999L + "'", long18 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
// flaky "10) test204(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1784813579999L + "'", long22 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
// flaky "6) test204(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1784813520000L + "'", long25 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod28);
// flaky "2) test204(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1784813549999L + "'", long29 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertNotNull(date31);
// flaky "2) test204(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date31.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod32);
        org.junit.Assert.assertNotNull(regularTimePeriod33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test205");
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
        int int24 = minute12.getHourValue();
        java.util.Calendar calendar25 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long26 = minute12.getMiddleMillisecond(calendar25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "148) test205(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "130) test205(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "88) test205(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "53) test205(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "31) test205(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "20) test205(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "15) test205(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
// flaky "11) test205(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813549999L + "'", long14 == 1784813549999L);
// flaky "7) test205(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813520000L + "'", long15 == 1784813520000L);
        org.junit.Assert.assertNotNull(date16);
// flaky "3) test205(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "3) test205(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
// flaky "2) test205(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
// flaky "1) test205(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1784813579999L + "'", long21 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test206");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.next();
        int int6 = minute0.getMinute();
// flaky "149) test206(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "131) test206(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "89) test206(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "54) test206(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "32) test206(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test207");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getEnd();
        long long2 = minute0.getFirstMillisecond();
        long long3 = minute0.getSerialIndex();
        org.jfree.data.time.Hour hour4 = minute0.getHour();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = minute0.getLastMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
// flaky "150) test207(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "132) test207(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813520000L + "'", long2 == 1784813520000L);
// flaky "90) test207(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 66566672L + "'", long3 == 66566672L);
        org.junit.Assert.assertNotNull(hour4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test208");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.util.Date date6 = minute0.getEnd();
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date6, timeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "151) test208(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "133) test208(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "91) test208(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "55) test208(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "33) test208(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertNotNull(date6);
// flaky "21) test208(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test209");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = minute0.getEnd();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute5.getFirstMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "152) test209(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "134) test209(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "92) test209(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test210");
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
        long long19 = minute14.getLastMillisecond();
// flaky "153) test210(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "135) test210(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "93) test210(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "56) test210(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "34) test210(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "22) test210(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 66566672L + "'", long18 == 66566672L);
// flaky "16) test210(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813579999L + "'", long19 == 1784813579999L);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test211");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        java.util.Date date8 = regularTimePeriod7.getStart();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "154) test211(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "136) test211(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
// flaky "94) test211(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test212");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(12, 12, (int) (short) 1, 11, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test213");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        java.util.TimeZone timeZone7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date5, timeZone7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "155) test213(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "137) test213(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "95) test213(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "57) test213(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "35) test213(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test214");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.lang.String str6 = minute0.toString();
        java.util.Date date7 = minute0.getStart();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date7, calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "156) test214(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "138) test214(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "96) test214(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "58) test214(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "36) test214(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "23) test214(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
// flaky "17) test214(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test215");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.Minute minute1 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = minute1.next();
        long long3 = minute1.getMiddleMillisecond();
        int int4 = minute1.getHourValue();
        int int5 = minute1.getMinute();
        long long6 = minute1.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute1.previous();
        boolean boolean8 = minute0.equals((java.lang.Object) regularTimePeriod7);
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = minute0.getFirstMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod2);
// flaky "157) test215(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813549999L + "'", long3 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
// flaky "139) test215(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
// flaky "97) test215(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test216");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(1, 2, (int) (byte) 100, 7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test217");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = minute0.next();
        long long3 = minute0.getSerialIndex();
// flaky "158) test217(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
// flaky "140) test217(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 66566672L + "'", long3 == 66566672L);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test218");
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
            long long13 = minute5.getFirstMillisecond(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "159) test218(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "141) test218(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "98) test218(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "59) test218(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "37) test218(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "24) test218(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "18) test218(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str11, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test219");
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
        long long12 = minute0.getLastMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "160) test219(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "142) test219(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "99) test219(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "60) test219(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "38) test219(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test220");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        org.jfree.data.time.Day day4 = minute0.getDay();
// flaky "161) test220(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "143) test220(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "100) test220(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(day4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test221");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.util.Date date5 = minute0.getStart();
        int int6 = minute0.getMinute();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "162) test221(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "144) test221(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(date5);
// flaky "101) test221(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "61) test221(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test222");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor5 = null;
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getMillisecond(timePeriodAnchor5, calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "163) test222(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "145) test222(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test223");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        long long3 = minute0.getMiddleMillisecond();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = minute0.getMiddleMillisecond(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "164) test223(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "146) test223(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813549999L + "'", long3 == 1784813549999L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test224");
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
        long long13 = minute5.getLastMillisecond();
        int int14 = minute5.getHourValue();
// flaky "165) test224(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "147) test224(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "102) test224(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "62) test224(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "39) test224(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "25) test224(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(date12);
// flaky "19) test224(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "12) test224(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813579999L + "'", long13 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test225");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.lang.String str6 = minute0.toString();
        java.util.Date date7 = minute0.getStart();
        java.util.Date date8 = minute0.getStart();
        org.jfree.data.time.Day day9 = minute0.getDay();
// flaky "166) test225(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "148) test225(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "103) test225(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "63) test225(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "40) test225(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "26) test225(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
// flaky "20) test225(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date8);
// flaky "13) test225(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(day9);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test226");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        long long3 = minute0.getFirstMillisecond();
        java.lang.String str4 = minute0.toString();
        java.lang.Class<?> wildcardClass5 = minute0.getClass();
// flaky "167) test226(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "149) test226(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
// flaky "104) test226(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str4, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test227");
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
        java.lang.String str16 = minute6.toString();
// flaky "168) test227(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "150) test227(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 66566672L + "'", long5 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "105) test227(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "64) test227(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
// flaky "41) test227(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
// flaky "27) test227(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813579999L + "'", long14 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky "21) test227(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str16, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test228");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = minute0.getEnd();
        long long5 = minute0.getFirstMillisecond();
// flaky "169) test228(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "151) test228(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "106) test228(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "65) test228(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813520000L + "'", long5 == 1784813520000L);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test229");
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
        java.util.Calendar calendar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute8.peg(calendar13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "170) test229(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "152) test229(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "107) test229(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "66) test229(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "42) test229(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test230");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) (short) -1, 5, (int) (short) 0, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test231");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.lang.Object obj5 = null;
        boolean boolean6 = minute0.equals(obj5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        java.util.Date date8 = regularTimePeriod7.getEnd();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor9 = null;
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = regularTimePeriod7.getMillisecond(timePeriodAnchor9, calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "171) test231(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "153) test231(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
// flaky "108) test231(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test232");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(9, 0, (-1), 20, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test233");
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
        java.util.Calendar calendar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = minute3.getLastMillisecond(calendar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "172) test233(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "154) test233(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "109) test233(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "67) test233(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "43) test233(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test234");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(3, (int) '#', 2, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test235");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        int int7 = minute0.getHourValue();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute0.next();
// flaky "173) test235(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "155) test235(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "110) test235(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test236");
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
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = minute0.getMiddleMillisecond(calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "174) test236(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "156) test236(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "111) test236(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "68) test236(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "44) test236(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "28) test236(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "22) test236(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test237");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute5.next();
// flaky "175) test237(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "157) test237(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "112) test237(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "69) test237(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "45) test237(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "29) test237(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "23) test237(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str11, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod12);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test238");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Day day2 = minute0.getDay();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = minute0.getMiddleMillisecond(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "176) test238(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(day2);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test239");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        boolean boolean4 = minute0.equals((java.lang.Object) 8);
        java.lang.String str5 = minute0.toString();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "177) test239(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "158) test239(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test240");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        int int7 = minute0.getMinute();
        java.lang.String str8 = minute0.toString();
        int int9 = minute0.getHourValue();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "178) test240(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "159) test240(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "113) test240(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "70) test240(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str8, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test241");
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
        java.util.Calendar calendar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = minute0.getFirstMillisecond(calendar14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "179) test241(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "160) test241(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "114) test241(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "71) test241(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "46) test241(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "30) test241(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "24) test241(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
// flaky "14) test241(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "8) test241(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test242");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        boolean boolean7 = minute0.equals((java.lang.Object) '4');
        java.util.Date date8 = minute0.getStart();
        java.util.Date date9 = minute0.getEnd();
        org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute(date9);
        java.util.Calendar calendar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = minute10.getMiddleMillisecond(calendar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "180) test242(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "161) test242(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "115) test242(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date9);
// flaky "72) test242(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test243");
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
        java.util.TimeZone timeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute(date8, timeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "181) test243(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "162) test243(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "116) test243(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "73) test243(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 66566672L + "'", long5 == 66566672L);
// flaky "47) test243(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
// flaky "31) test243(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test244");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor7 = null;
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute6.getMillisecond(timePeriodAnchor7, calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "182) test244(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "163) test244(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "117) test244(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "74) test244(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "48) test244(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test245");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        long long6 = minute0.getLastMillisecond();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getHourValue();
        boolean boolean9 = minute0.equals((java.lang.Object) int8);
        long long10 = minute0.getSerialIndex();
// flaky "183) test245(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "164) test245(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "118) test245(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "75) test245(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "49) test245(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "32) test245(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "25) test245(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 66566672L + "'", long10 == 66566672L);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test246");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute0.previous();
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = minute0.getFirstMillisecond(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "184) test246(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "165) test246(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
// flaky "119) test246(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod11);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test247");
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
        int int16 = minute6.getMinute();
// flaky "185) test247(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "166) test247(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 66566672L + "'", long5 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "120) test247(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "76) test247(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
// flaky "50) test247(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
// flaky "33) test247(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813579999L + "'", long14 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky "26) test247(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test248");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        long long4 = minute3.getSerialIndex();
        long long5 = minute3.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute3.next();
        int int7 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod6);
        java.util.Date date8 = regularTimePeriod6.getEnd();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = regularTimePeriod6.getMiddleMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "186) test248(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "167) test248(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "121) test248(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(date8);
// flaky "77) test248(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test249");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        long long8 = minute0.getFirstMillisecond();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "187) test249(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "168) test249(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "122) test249(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813520000L + "'", long8 == 1784813520000L);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test250");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date5);
        org.jfree.data.time.Hour hour8 = minute7.getHour();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute7.peg(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "188) test250(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "169) test250(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "123) test250(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "78) test250(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "51) test250(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(hour8);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test251");
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
            org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute(date12, calendar13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "189) test251(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "170) test251(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "124) test251(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "79) test251(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "52) test251(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "34) test251(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(date12);
// flaky "27) test251(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test252");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Day day5 = minute0.getDay();
// flaky "190) test252(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "171) test252(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "125) test252(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
// flaky "80) test252(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(day5);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test253");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) (short) -1, (int) 'a', (int) (short) 10, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test254");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        long long8 = minute0.getFirstMillisecond();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = minute0.getMiddleMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "191) test254(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "172) test254(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "126) test254(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813520000L + "'", long8 == 1784813520000L);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test255");
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
        long long14 = minute8.getSerialIndex();
// flaky "192) test255(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "173) test255(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "127) test255(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "81) test255(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "53) test255(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
// flaky "35) test255(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 66566672L + "'", long14 == 66566672L);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test256");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        int int7 = minute0.getMinute();
        java.lang.String str8 = minute0.toString();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "193) test256(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "174) test256(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "128) test256(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "82) test256(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str8, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test257");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        int int5 = minute0.getMinute();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getLastMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "194) test257(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "175) test257(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "129) test257(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test258");
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
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor21 = null;
        java.util.Calendar calendar22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = minute11.getMillisecond(timePeriodAnchor21, calendar22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "195) test258(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "176) test258(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "130) test258(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "83) test258(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "54) test258(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
// flaky "36) test258(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813579999L + "'", long17 == 1784813579999L);
// flaky "28) test258(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
// flaky "15) test258(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str19, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test259");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.lang.String str6 = minute0.toString();
        int int7 = minute0.getHourValue();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute0.getFirstMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "196) test259(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "177) test259(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "131) test259(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "84) test259(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "55) test259(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "37) test259(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test260");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(6, 32, (int) 'a', (int) (byte) 1, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test261");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date5);
        long long8 = minute7.getSerialIndex();
        java.util.Date date9 = minute7.getEnd();
// flaky "197) test261(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "178) test261(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "132) test261(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "85) test261(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "56) test261(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "38) test261(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertNotNull(date9);
// flaky "29) test261(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test262");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(6, (int) '#', 6, 20, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test263");
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
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor14 = null;
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = minute8.getMillisecond(timePeriodAnchor14, calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "198) test263(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "179) test263(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "133) test263(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "86) test263(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "57) test263(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test264");
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
        java.util.Calendar calendar21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = minute11.getMiddleMillisecond(calendar21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "199) test264(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "180) test264(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "134) test264(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "87) test264(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "58) test264(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
// flaky "39) test264(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813579999L + "'", long17 == 1784813579999L);
// flaky "30) test264(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
// flaky "16) test264(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str19, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test265");
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
        java.util.TimeZone timeZone22 = null;
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute24 = new org.jfree.data.time.Minute(date21, timeZone22, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "200) test265(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "181) test265(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "135) test265(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "88) test265(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "59) test265(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "40) test265(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(date12);
// flaky "31) test265(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "17) test265(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(date15);
// flaky "9) test265(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date16);
// flaky "4) test265(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "4) test265(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813520000L + "'", long17 == 1784813520000L);
        org.junit.Assert.assertNotNull(date18);
// flaky "3) test265(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date21);
// flaky "2) test265(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date21.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test266");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
        java.util.Date date7 = regularTimePeriod6.getStart();
        java.util.Date date8 = regularTimePeriod6.getStart();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute(date8, calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "201) test266(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date7);
// flaky "182) test266(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(date8);
// flaky "136) test266(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test267");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.next();
// flaky "202) test267(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "183) test267(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test268");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
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
// flaky "203) test268(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "184) test268(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod3);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test269");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getStart();
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = minute0.getFirstMillisecond(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
// flaky "204) test269(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test270");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        java.util.Date date7 = minute0.getStart();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute0.getFirstMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "205) test270(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "185) test270(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "137) test270(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "89) test270(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test271");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.previous();
        java.lang.String str4 = regularTimePeriod3.toString();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor5 = null;
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = regularTimePeriod3.getMillisecond(timePeriodAnchor5, calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "206) test271(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "186) test271(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "138) test271(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Thu Jul 23 20:31:00 ICT 2026" + "'", str4, "Thu Jul 23 20:31:00 ICT 2026");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test272");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getMinute();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = minute0.getLastMillisecond(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "207) test272(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
// flaky "187) test272(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test273");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.previous();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "208) test273(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "188) test273(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test274");
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
        long long11 = minute0.getMiddleMillisecond();
        int int12 = minute0.getMinute();
// flaky "209) test274(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "189) test274(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "139) test274(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "90) test274(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "60) test274(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "41) test274(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
// flaky "32) test274(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test275");
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
        long long12 = minute11.getSerialIndex();
        long long13 = minute11.getMiddleMillisecond();
        long long14 = minute11.getLastMillisecond();
        long long15 = minute11.getFirstMillisecond();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute16.next();
        long long18 = minute16.getMiddleMillisecond();
        int int19 = minute16.getHourValue();
        int int20 = minute16.getMinute();
        int int21 = minute11.compareTo((org.jfree.data.time.TimePeriod) minute16);
        int int22 = minute16.getHourValue();
        org.jfree.data.time.Minute minute23 = new org.jfree.data.time.Minute();
        long long24 = minute23.getSerialIndex();
        long long25 = minute23.getMiddleMillisecond();
        long long26 = minute23.getFirstMillisecond();
        java.util.Date date27 = minute23.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = minute23.previous();
        org.jfree.data.time.Minute minute29 = new org.jfree.data.time.Minute();
        long long30 = minute29.getSerialIndex();
        long long31 = minute29.getMiddleMillisecond();
        long long32 = minute29.getLastMillisecond();
        int int33 = minute23.compareTo((org.jfree.data.time.TimePeriod) minute29);
        int int34 = minute16.compareTo((org.jfree.data.time.TimePeriod) minute23);
        int int35 = minute23.getHourValue();
        boolean boolean36 = minute0.equals((java.lang.Object) int35);
        java.util.Calendar calendar37 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long38 = minute0.getMiddleMillisecond(calendar37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "210) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "190) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "140) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "91) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "61) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
// flaky "42) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
// flaky "33) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813579999L + "'", long14 == 1784813579999L);
// flaky "18) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813520000L + "'", long15 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "10) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813549999L + "'", long18 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
// flaky "5) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
// flaky "5) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 66566672L + "'", long24 == 66566672L);
// flaky "4) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1784813549999L + "'", long25 == 1784813549999L);
// flaky "3) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1784813520000L + "'", long26 == 1784813520000L);
        org.junit.Assert.assertNotNull(date27);
// flaky "1) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date27.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod28);
// flaky "1) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 66566672L + "'", long30 == 66566672L);
// flaky "1) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1784813549999L + "'", long31 == 1784813549999L);
// flaky "1) test275(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1784813579999L + "'", long32 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20 + "'", int35 == 20);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test276");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute7.next();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = minute7.getMiddleMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "211) test276(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "191) test276(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "141) test276(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "92) test276(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "62) test276(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod8);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test277");
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
        java.util.Date date15 = regularTimePeriod13.getStart();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor16 = null;
        java.util.Calendar calendar17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = regularTimePeriod13.getMillisecond(timePeriodAnchor16, calendar17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "212) test277(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "192) test277(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "142) test277(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "93) test277(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "63) test277(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "43) test277(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "34) test277(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky "19) test277(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test278");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        java.util.Date date7 = minute0.getEnd();
        long long8 = minute0.getLastMillisecond();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = minute0.getFirstMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "213) test278(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "193) test278(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "143) test278(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "94) test278(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test279");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute0.getMiddleMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "214) test279(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "194) test279(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "144) test279(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test280");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute6.peg(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "215) test280(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "195) test280(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "145) test280(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "95) test280(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "64) test280(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test281");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        long long5 = minute0.getLastMillisecond();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getFirstMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "216) test281(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "196) test281(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "146) test281(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test282");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.lang.Object obj5 = null;
        boolean boolean6 = minute0.equals(obj5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        long long8 = regularTimePeriod7.getMiddleMillisecond();
        java.lang.Class<?> wildcardClass9 = regularTimePeriod7.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "217) test282(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "197) test282(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "147) test282(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813609999L + "'", long8 == 1784813609999L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test283");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        long long8 = minute0.getMiddleMillisecond();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = minute0.getFirstMillisecond(calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "218) test283(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "198) test283(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "148) test283(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "96) test283(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test284");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute0.getLastMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "219) test284(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "199) test284(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test285");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        int int7 = minute0.getHourValue();
        long long8 = minute0.getLastMillisecond();
        long long9 = minute0.getMiddleMillisecond();
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = minute0.getFirstMillisecond(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "220) test285(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "200) test285(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "149) test285(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "97) test285(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "65) test285(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test286");
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
        java.util.TimeZone timeZone18 = null;
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute20 = new org.jfree.data.time.Minute(date17, timeZone18, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "221) test286(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "201) test286(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "150) test286(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "98) test286(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "66) test286(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "44) test286(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "35) test286(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(date11);
// flaky "20) test286(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky "11) test286(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(date17);
// flaky "6) test286(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date17.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test287");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        java.util.Date date7 = minute0.getEnd();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date7, calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "222) test287(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "202) test287(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "151) test287(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test288");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.util.Date date6 = minute0.getEnd();
        int int7 = minute0.getHourValue();
        int int8 = minute0.getHourValue();
        long long9 = minute0.getMiddleMillisecond();
// flaky "223) test288(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "203) test288(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "152) test288(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "99) test288(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "67) test288(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertNotNull(date6);
// flaky "45) test288(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "36) test288(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test289");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        java.util.Date date8 = minute0.getEnd();
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute(date8, calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "224) test289(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "204) test289(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "153) test289(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "100) test289(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test290");
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
        java.util.Date date15 = regularTimePeriod13.getStart();
        java.util.Calendar calendar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute17 = new org.jfree.data.time.Minute(date15, calendar16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "225) test290(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "205) test290(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "154) test290(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "101) test290(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "68) test290(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "46) test290(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "37) test290(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky "21) test290(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test291");
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
        java.lang.Class<?> wildcardClass18 = minute7.getClass();
// flaky "226) test291(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "206) test291(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "155) test291(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "102) test291(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "69) test291(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "47) test291(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "38) test291(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(date11);
// flaky "22) test291(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky "12) test291(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(date17);
// flaky "7) test291(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date17.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test292");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getHourValue();
        org.jfree.data.time.Hour hour2 = minute0.getHour();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(hour2);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test293");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) (short) 1, (int) (short) 0, 4, 7, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test294");
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
            org.jfree.data.time.Minute minute23 = new org.jfree.data.time.Minute(date21, calendar22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "227) test294(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "207) test294(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "156) test294(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "103) test294(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "70) test294(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "48) test294(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(date12);
// flaky "39) test294(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "23) test294(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(date15);
// flaky "13) test294(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date16);
// flaky "8) test294(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "6) test294(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813520000L + "'", long17 == 1784813520000L);
        org.junit.Assert.assertNotNull(date18);
// flaky "5) test294(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date21);
// flaky "4) test294(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date21.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test295");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        int int7 = minute0.getHourValue();
        long long8 = minute0.getLastMillisecond();
        long long9 = minute0.getMiddleMillisecond();
        java.lang.String str10 = minute0.toString();
// flaky "228) test295(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "208) test295(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "157) test295(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "104) test295(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "71) test295(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
// flaky "49) test295(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str10, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test296");
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
        java.util.Calendar calendar24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = minute8.getMiddleMillisecond(calendar24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "229) test296(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "209) test296(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "158) test296(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "105) test296(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "72) test296(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "50) test296(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(date18);
// flaky "40) test296(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "24) test296(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date22.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test297");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
        java.util.Date date7 = regularTimePeriod6.getStart();
        java.lang.Class<?> wildcardClass8 = regularTimePeriod6.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "230) test297(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date7);
// flaky "210) test297(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test298");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getFirstMillisecond();
        long long3 = minute0.getLastMillisecond();
        long long4 = minute0.getLastMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "231) test298(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813520000L + "'", long2 == 1784813520000L);
// flaky "211) test298(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "159) test298(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813579999L + "'", long4 == 1784813579999L);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test299");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = regularTimePeriod1.getMiddleMillisecond();
        java.util.Date date3 = regularTimePeriod1.getStart();
        java.util.Date date4 = regularTimePeriod1.getStart();
        java.lang.Class<?> wildcardClass5 = regularTimePeriod1.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "232) test299(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813609999L + "'", long2 == 1784813609999L);
        org.junit.Assert.assertNotNull(date3);
// flaky "212) test299(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(date4);
// flaky "160) test299(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test300");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        java.util.Date date7 = minute0.getStart();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date7);
// flaky "233) test300(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "213) test300(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "161) test300(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "106) test300(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test301");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.lang.String str6 = minute0.toString();
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
// flaky "234) test301(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "214) test301(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "162) test301(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "107) test301(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "73) test301(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "51) test301(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
// flaky "41) test301(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test302");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) (short) -1, 5, (int) (short) 100, 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test303");
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
        java.util.Calendar calendar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = minute5.getLastMillisecond(calendar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "235) test303(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "215) test303(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "163) test303(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "108) test303(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "74) test303(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "52) test303(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test304");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) 'a', (-1), 100, (int) (byte) 100, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test305");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        java.util.Date date5 = minute0.getStart();
        long long6 = minute0.getLastMillisecond();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute7.next();
        long long9 = minute7.getMiddleMillisecond();
        int int10 = minute7.getHourValue();
        int int11 = minute7.getMinute();
        long long12 = minute7.getLastMillisecond();
        boolean boolean14 = minute7.equals((java.lang.Object) 6);
        long long15 = minute7.getMiddleMillisecond();
        boolean boolean16 = minute0.equals((java.lang.Object) minute7);
        java.util.Date date17 = minute0.getStart();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "236) test305(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "216) test305(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date5);
// flaky "164) test305(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "109) test305(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "75) test305(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
// flaky "53) test305(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
// flaky "42) test305(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "25) test305(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813549999L + "'", long15 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(date17);
// flaky "14) test305(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date17.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test306");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
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
// flaky "237) test306(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "217) test306(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "165) test306(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "110) test306(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
// flaky "76) test306(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test307");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(12, (int) (short) 1, 12, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test308");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        boolean boolean4 = minute0.equals((java.lang.Object) 8);
        java.lang.String str5 = minute0.toString();
        java.lang.Class<?> wildcardClass6 = minute0.getClass();
// flaky "238) test308(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "218) test308(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test309");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = minute16.previous();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "239) test309(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "219) test309(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "166) test309(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "111) test309(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(date13);
// flaky "77) test309(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "54) test309(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813579999L + "'", long15 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "43) test309(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813549999L + "'", long18 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
// flaky "26) test309(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1784813579999L + "'", long22 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
// flaky "15) test309(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1784813520000L + "'", long25 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod27);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test310");
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
        java.util.Date date11 = minute0.getEnd();
// flaky "240) test310(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "220) test310(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "167) test310(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "112) test310(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "78) test310(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "55) test310(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(date11);
// flaky "44) test310(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test311");
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
        int int13 = minute8.getMinute();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "241) test311(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "221) test311(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "168) test311(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "113) test311(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "79) test311(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
// flaky "56) test311(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test312");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        boolean boolean7 = minute0.equals((java.lang.Object) '4');
        long long8 = minute0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute0.previous();
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = minute0.getMiddleMillisecond(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "242) test312(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "222) test312(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "169) test312(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test313");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        java.util.Date date7 = minute0.getStart();
        int int8 = minute0.getHourValue();
// flaky "243) test313(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "223) test313(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "170) test313(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "114) test313(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test314");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        long long5 = minute0.getSerialIndex();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getFirstMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "244) test314(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "224) test314(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "171) test314(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 66566672L + "'", long5 == 66566672L);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test315");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute7.previous();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "245) test315(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "225) test315(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "172) test315(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "115) test315(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "80) test315(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test316");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        long long4 = minute0.getLastMillisecond();
// flaky "246) test316(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "226) test316(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "173) test316(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813579999L + "'", long4 == 1784813579999L);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test317");
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
        java.util.Calendar calendar19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = minute8.getFirstMillisecond(calendar19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "247) test317(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "227) test317(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "174) test317(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "116) test317(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "81) test317(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "57) test317(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
// flaky "45) test317(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "27) test317(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
// flaky "16) test317(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
// flaky "9) test317(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky "7) test317(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(date18);
// flaky "6) test317(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test318");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute0.next();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "248) test318(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "228) test318(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "175) test318(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "117) test318(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "82) test318(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test319");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.next();
// flaky "249) test319(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "229) test319(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test320");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        long long6 = minute5.getSerialIndex();
        long long7 = minute5.getMiddleMillisecond();
        long long8 = minute5.getLastMillisecond();
        long long9 = minute5.getFirstMillisecond();
        org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute10.next();
        long long12 = minute10.getMiddleMillisecond();
        int int13 = minute10.getHourValue();
        int int14 = minute10.getMinute();
        int int15 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute10);
        java.lang.String str16 = minute10.toString();
        int int17 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute10);
        java.util.Calendar calendar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "250) test320(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "230) test320(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "176) test320(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
// flaky "118) test320(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 66566672L + "'", long6 == 66566672L);
// flaky "83) test320(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
// flaky "58) test320(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "46) test320(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813520000L + "'", long9 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
// flaky "28) test320(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813549999L + "'", long12 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
// flaky "17) test320(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky "10) test320(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str16, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test321");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(20, 9, 2, 6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test322");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(32, (int) (short) 1, (int) (short) 1, (int) (short) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test323");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        boolean boolean7 = minute0.equals((java.lang.Object) '4');
        java.util.Date date8 = minute0.getStart();
        java.util.Date date9 = minute0.getEnd();
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute12 = new org.jfree.data.time.Minute(date9, timeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "251) test323(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "231) test323(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "177) test323(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date9);
// flaky "119) test323(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test324");
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
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date7, calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "252) test324(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date7);
// flaky "232) test324(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test325");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
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
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "253) test325(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "233) test325(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "178) test325(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test326");
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
        long long27 = minute2.getMiddleMillisecond();
        java.util.Calendar calendar28 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long29 = minute2.getMiddleMillisecond(calendar28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "254) test326(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "234) test326(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "179) test326(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "120) test326(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "84) test326(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "59) test326(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod20);
// flaky "47) test326(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(date23);
// flaky "29) test326(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date23.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "18) test326(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str25, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky "11) test326(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1784813549999L + "'", long27 == 1784813549999L);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test327");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute1 = new org.jfree.data.time.Minute(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'time' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test328");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.lang.String str4 = regularTimePeriod3.toString();
        java.util.Date date5 = regularTimePeriod3.getEnd();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date5, calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "255) test328(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "235) test328(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "180) test328(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Thu Jul 23 20:33:00 ICT 2026" + "'", str4, "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(date5);
// flaky "121) test328(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test329");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        int int5 = minute0.getMinute();
        java.util.Date date6 = minute0.getEnd();
        long long7 = minute0.getFirstMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "256) test329(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "236) test329(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "181) test329(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky "122) test329(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "85) test329(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test330");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(59, (int) (short) 10, 11, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test331");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        long long2 = minute0.getFirstMillisecond();
// flaky "257) test331(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
// flaky "237) test331(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813520000L + "'", long2 == 1784813520000L);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test332");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        long long6 = minute5.getLastMillisecond();
        java.util.Date date7 = minute5.getEnd();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute5.getFirstMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "258) test332(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "238) test332(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "182) test332(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "123) test332(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test333");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
        long long6 = minute0.getFirstMillisecond();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "259) test333(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "239) test333(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "183) test333(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "124) test333(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "86) test333(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813520000L + "'", long6 == 1784813520000L);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test334");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = minute0.getLastMillisecond(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "260) test334(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test335");
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
        java.lang.Class<?> wildcardClass10 = minute4.getClass();
// flaky "261) test335(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "240) test335(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "184) test335(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "125) test335(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test336");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        java.util.Date date5 = minute0.getStart();
        int int6 = minute0.getHourValue();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "262) test336(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "241) test336(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date5);
// flaky "185) test336(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test337");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getMinute();
        int int3 = minute0.getHourValue();
// flaky "263) test337(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
// flaky "242) test337(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test338");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        long long6 = minute5.getSerialIndex();
        long long7 = minute5.getMiddleMillisecond();
        long long8 = minute5.getLastMillisecond();
        long long9 = minute5.getFirstMillisecond();
        org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute10.next();
        long long12 = minute10.getMiddleMillisecond();
        int int13 = minute10.getHourValue();
        int int14 = minute10.getMinute();
        int int15 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute10);
        java.lang.String str16 = minute10.toString();
        int int17 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute10);
        long long18 = minute10.getFirstMillisecond();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor19 = null;
        java.util.Calendar calendar20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = minute10.getMillisecond(timePeriodAnchor19, calendar20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "264) test338(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "243) test338(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "186) test338(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
// flaky "126) test338(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 66566672L + "'", long6 == 66566672L);
// flaky "87) test338(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
// flaky "60) test338(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "48) test338(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813520000L + "'", long9 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
// flaky "30) test338(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813549999L + "'", long12 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
// flaky "19) test338(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky "12) test338(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str16, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky "8) test338(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813520000L + "'", long18 == 1784813520000L);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test339");
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
        long long11 = minute0.getMiddleMillisecond();
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = minute0.getFirstMillisecond(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "265) test339(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "244) test339(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "187) test339(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "127) test339(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "88) test339(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "61) test339(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test340");
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
        java.lang.Class<?> wildcardClass16 = regularTimePeriod15.getClass();
// flaky "266) test340(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "245) test340(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "188) test340(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "128) test340(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "89) test340(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "62) test340(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "49) test340(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test341");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(3, 5, (int) (short) 10, 20, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test342");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.next();
        java.lang.String str5 = minute0.toString();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getFirstMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "267) test342(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "246) test342(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "189) test342(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test343");
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
        java.util.Calendar calendar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = minute8.getMiddleMillisecond(calendar13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "268) test343(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "247) test343(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "190) test343(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "129) test343(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "90) test343(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test344");
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
        java.lang.String str11 = minute0.toString();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "269) test344(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "248) test344(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "191) test344(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
// flaky "130) test344(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "91) test344(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str11, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test345");
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
        java.lang.Class<?> wildcardClass27 = minute16.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "270) test345(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "249) test345(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "192) test345(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "131) test345(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(date13);
// flaky "92) test345(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "63) test345(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813579999L + "'", long15 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "50) test345(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813549999L + "'", long18 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
// flaky "31) test345(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1784813579999L + "'", long22 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
// flaky "20) test345(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1784813520000L + "'", long25 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test346");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = regularTimePeriod1.getMiddleMillisecond();
        java.util.Date date3 = regularTimePeriod1.getEnd();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "271) test346(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813609999L + "'", long2 == 1784813609999L);
        org.junit.Assert.assertNotNull(date3);
// flaky "250) test346(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test347");
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
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor18 = null;
        java.util.Calendar calendar19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = minute0.getMillisecond(timePeriodAnchor18, calendar19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "272) test347(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "251) test347(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "193) test347(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "132) test347(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "93) test347(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "64) test347(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
// flaky "51) test347(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
// flaky "32) test347(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky "21) test347(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test348");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.previous();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "273) test348(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813520000L + "'", long2 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test349");
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
        java.lang.String str21 = regularTimePeriod19.toString();
// flaky "274) test349(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "252) test349(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "194) test349(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "133) test349(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "94) test349(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "65) test349(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 66566672L + "'", long18 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
        org.junit.Assert.assertNotNull(date20);
// flaky "52) test349(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date20.toString(), "Thu Jul 23 20:31:59 ICT 2026");
// flaky "33) test349(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Thu Jul 23 20:31:00 ICT 2026" + "'", str21, "Thu Jul 23 20:31:00 ICT 2026");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test350");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        java.util.Date date7 = minute0.getStart();
        java.lang.Class<?> wildcardClass8 = date7.getClass();
// flaky "275) test350(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "253) test350(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "195) test350(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "134) test350(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test351");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        boolean boolean7 = minute0.equals((java.lang.Object) '4');
        long long8 = minute0.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = minute0.previous();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor10 = null;
        java.util.Calendar calendar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = regularTimePeriod9.getMillisecond(timePeriodAnchor10, calendar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "276) test351(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "254) test351(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "196) test351(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test352");
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
        int int16 = minute6.getHourValue();
// flaky "277) test352(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "255) test352(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 66566672L + "'", long5 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "197) test352(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "135) test352(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
// flaky "95) test352(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
// flaky "66) test352(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813579999L + "'", long14 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test353");
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
        long long18 = minute15.getFirstMillisecond();
        java.util.Date date19 = minute15.getStart();
        long long20 = minute15.getMiddleMillisecond();
        java.util.Date date21 = minute15.getEnd();
        int int22 = minute6.compareTo((org.jfree.data.time.TimePeriod) minute15);
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor23 = null;
        java.util.Calendar calendar24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = minute15.getMillisecond(timePeriodAnchor23, calendar24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "278) test353(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "256) test353(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "198) test353(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "136) test353(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66566672L + "'", long16 == 66566672L);
// flaky "96) test353(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
// flaky "67) test353(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813520000L + "'", long18 == 1784813520000L);
        org.junit.Assert.assertNotNull(date19);
// flaky "53) test353(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date19.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "34) test353(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
        org.junit.Assert.assertNotNull(date21);
// flaky "22) test353(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date21.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test354");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        long long7 = minute0.getMiddleMillisecond();
// flaky "279) test354(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "257) test354(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "199) test354(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test355");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getMinute();
        long long3 = minute0.getLastMillisecond();
// flaky "280) test355(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
// flaky "258) test355(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
// flaky "200) test355(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test356");
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
        int int11 = minute0.getMinute();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "281) test356(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "259) test356(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "201) test356(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "137) test356(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "97) test356(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "68) test356(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test357");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = minute0.getFirstMillisecond(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "282) test357(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test358");
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
        java.util.Calendar calendar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = minute0.getMiddleMillisecond(calendar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "283) test358(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "260) test358(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "202) test358(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "138) test358(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test359");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        boolean boolean4 = minute0.equals((java.lang.Object) 8);
        java.util.Date date5 = minute0.getStart();
        java.util.TimeZone timeZone6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date5, timeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "284) test359(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date5);
// flaky "261) test359(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test360");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(20, (int) (byte) 10, 0, 9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test361");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        boolean boolean7 = minute0.equals((java.lang.Object) '4');
        java.util.Date date8 = minute0.getStart();
        java.util.Date date9 = minute0.getEnd();
        org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute(date9);
        java.lang.Class<?> wildcardClass11 = minute10.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "285) test361(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "262) test361(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "203) test361(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date9);
// flaky "139) test361(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test362");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        java.lang.String str6 = minute0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        java.util.Date date8 = minute0.getEnd();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date8);
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date8, calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "286) test362(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "263) test362(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "204) test362(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
// flaky "140) test362(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test363");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        int int5 = minute0.getMinute();
        java.util.Date date6 = minute0.getEnd();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = minute0.getFirstMillisecond(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "287) test363(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "264) test363(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "205) test363(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky "141) test363(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test364");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        long long6 = minute5.getLastMillisecond();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = minute5.getMiddleMillisecond(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "288) test364(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "265) test364(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "206) test364(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test365");
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
        org.jfree.data.time.Minute minute15 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = minute15.next();
        long long17 = minute15.getFirstMillisecond();
        boolean boolean18 = minute5.equals((java.lang.Object) long17);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "289) test365(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "266) test365(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "207) test365(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "142) test365(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky "98) test365(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813579999L + "'", long13 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
// flaky "69) test365(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813520000L + "'", long17 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test366");
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
        long long22 = minute11.getFirstMillisecond();
// flaky "290) test366(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "267) test366(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "208) test366(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "143) test366(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "99) test366(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
// flaky "70) test366(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813579999L + "'", long17 == 1784813579999L);
// flaky "54) test366(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
// flaky "35) test366(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str19, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
// flaky "23) test366(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1784813520000L + "'", long22 == 1784813520000L);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test367");
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
        long long13 = minute0.getLastMillisecond();
// flaky "291) test367(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "268) test367(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "209) test367(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "144) test367(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "100) test367(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "71) test367(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(date10);
// flaky "55) test367(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "36) test367(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813579999L + "'", long13 == 1784813579999L);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test368");
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
        org.jfree.data.time.Minute minute23 = new org.jfree.data.time.Minute(date22);
        org.jfree.data.time.Minute minute24 = new org.jfree.data.time.Minute(date22);
        java.util.Calendar calendar25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute26 = new org.jfree.data.time.Minute(date22, calendar25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "292) test368(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "269) test368(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "210) test368(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "145) test368(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66566672L + "'", long16 == 66566672L);
// flaky "101) test368(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
// flaky "72) test368(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813520000L + "'", long19 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(date22);
// flaky "56) test368(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date22.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test369");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getEnd();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor6 = null;
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = minute0.getMillisecond(timePeriodAnchor6, calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "293) test369(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "270) test369(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "211) test369(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
// flaky "146) test369(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "102) test369(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test370");
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
        int int15 = minute0.getHourValue();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "294) test370(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "271) test370(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "212) test370(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "147) test370(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
// flaky "103) test370(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813520000L + "'", long12 == 1784813520000L);
        org.junit.Assert.assertNotNull(date13);
// flaky "73) test370(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test371");
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
        long long11 = minute4.getSerialIndex();
// flaky "295) test371(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "272) test371(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "213) test371(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "148) test371(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "104) test371(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813579999L + "'", long10 == 1784813579999L);
// flaky "74) test371(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66566672L + "'", long11 == 66566672L);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test372");
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
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor13 = null;
        java.util.Calendar calendar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = minute11.getMillisecond(timePeriodAnchor13, calendar14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "296) test372(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "273) test372(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "214) test372(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "149) test372(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "105) test372(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "75) test372(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(date10);
// flaky "57) test372(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test373");
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
        org.jfree.data.time.Minute minute23 = new org.jfree.data.time.Minute(date22);
        org.jfree.data.time.Minute minute24 = new org.jfree.data.time.Minute(date22);
        java.util.TimeZone timeZone25 = null;
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute27 = new org.jfree.data.time.Minute(date22, timeZone25, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "297) test373(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "274) test373(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "215) test373(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "150) test373(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66566672L + "'", long16 == 66566672L);
// flaky "106) test373(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
// flaky "76) test373(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813520000L + "'", long19 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(date22);
// flaky "58) test373(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date22.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test374");
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
        java.util.Calendar calendar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = minute8.getFirstMillisecond(calendar14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "298) test374(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "275) test374(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "216) test374(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "151) test374(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "107) test374(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test375");
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
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "299) test375(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "276) test375(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "217) test375(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "152) test375(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
// flaky "108) test375(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertNotNull(date11);
// flaky "77) test375(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test376");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.lang.String str6 = minute0.toString();
        java.util.Date date7 = minute0.getStart();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date7);
// flaky "300) test376(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "277) test376(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "218) test376(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "153) test376(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "109) test376(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "78) test376(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
// flaky "59) test376(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test377");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
        java.util.Date date7 = regularTimePeriod6.getStart();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date7);
        java.util.TimeZone timeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date7, timeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "301) test377(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date7);
// flaky "278) test377(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test378");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        java.lang.String str6 = minute0.toString();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        java.util.Date date8 = minute0.getEnd();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date8);
        long long10 = minute9.getFirstMillisecond();
        long long11 = minute9.getSerialIndex();
        long long12 = minute9.getSerialIndex();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "302) test378(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "279) test378(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "219) test378(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
// flaky "154) test378(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "110) test378(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813520000L + "'", long10 == 1784813520000L);
// flaky "79) test378(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66566672L + "'", long11 == 66566672L);
// flaky "60) test378(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test379");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        java.util.Date date7 = minute0.getEnd();
        int int8 = minute0.getMinute();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "303) test379(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "280) test379(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "220) test379(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "155) test379(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test380");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = minute0.getEnd();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        java.util.TimeZone timeZone6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date4, timeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "304) test380(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "281) test380(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "221) test380(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test381");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(59, 8, (int) (byte) 1, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test382");
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
        long long11 = minute7.getFirstMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "305) test382(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "282) test382(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "222) test382(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "156) test382(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "111) test382(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813520000L + "'", long11 == 1784813520000L);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test383");
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
        long long11 = regularTimePeriod9.getMiddleMillisecond();
// flaky "306) test383(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "283) test383(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "223) test383(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "157) test383(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "112) test383(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813489999L + "'", long11 == 1784813489999L);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test384");
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
        java.util.Calendar calendar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = minute8.getMiddleMillisecond(calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "307) test384(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "284) test384(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "224) test384(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "158) test384(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "113) test384(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "80) test384(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
// flaky "61) test384(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "37) test384(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "24) test384(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str14, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test385");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(10, 0, 8, (int) (short) 100, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test386");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        long long6 = minute0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        java.util.Date date8 = minute0.getStart();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "308) test386(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky "285) test386(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
// flaky "225) test386(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test387");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getEnd();
        java.util.Calendar calendar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = minute0.getLastMillisecond(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date1);
// flaky "309) test387(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test388");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = minute0.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "310) test388(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod2);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test389");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date5);
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute(date5);
// flaky "311) test389(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "286) test389(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "226) test389(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "159) test389(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "114) test389(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test390");
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
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor18 = null;
        java.util.Calendar calendar19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = minute8.getMillisecond(timePeriodAnchor18, calendar19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "312) test390(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "287) test390(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "227) test390(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "160) test390(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "115) test390(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "81) test390(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
// flaky "62) test390(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "38) test390(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "25) test390(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str14, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test391");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        long long5 = minute0.getFirstMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "313) test391(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "288) test391(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813520000L + "'", long5 == 1784813520000L);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test392");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.next();
        java.lang.String str5 = minute0.toString();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "314) test392(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "289) test392(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "228) test392(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test393");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) (byte) 1, 0, 59, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test394");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        java.util.Date date4 = minute0.getEnd();
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date4, timeZone5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "315) test394(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "290) test394(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "229) test394(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test395");
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
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor23 = null;
        java.util.Calendar calendar24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = minute11.getMillisecond(timePeriodAnchor23, calendar24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "316) test395(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "291) test395(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "230) test395(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "161) test395(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "116) test395(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813579999L + "'", long10 == 1784813579999L);
// flaky "82) test395(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
// flaky "63) test395(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
// flaky "39) test395(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
// flaky "26) test395(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky "13) test395(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str21, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test396");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date5);
        long long8 = minute7.getMiddleMillisecond();
// flaky "317) test396(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "292) test396(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "231) test396(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "162) test396(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "117) test396(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "83) test396(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test397");
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
        java.util.Date date12 = minute11.getEnd();
        long long13 = minute11.getSerialIndex();
// flaky "318) test397(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "293) test397(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "232) test397(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "163) test397(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 66566672L + "'", long5 == 66566672L);
// flaky "118) test397(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
// flaky "84) test397(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "64) test397(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:33:59 ICT 2026");
// flaky "40) test397(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566673L + "'", long13 == 66566673L);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test398");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        long long8 = minute0.getLastMillisecond();
        long long9 = minute0.getFirstMillisecond();
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = minute0.getLastMillisecond(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "319) test398(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "294) test398(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "233) test398(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "164) test398(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "119) test398(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813520000L + "'", long9 == 1784813520000L);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test399");
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
        int int24 = minute8.getMinute();
        java.util.Calendar calendar25 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute8.peg(calendar25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "320) test399(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "295) test399(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "234) test399(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "165) test399(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "120) test399(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "85) test399(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(date18);
// flaky "65) test399(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky "41) test399(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date22.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky "27) test399(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test400");
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
        long long27 = minute2.getMiddleMillisecond();
        java.util.Calendar calendar28 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute2.peg(calendar28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "321) test400(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "296) test400(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "235) test400(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "166) test400(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "121) test400(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "86) test400(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod20);
// flaky "66) test400(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(date23);
// flaky "42) test400(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date23.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky "28) test400(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str25, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky "14) test400(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1784813549999L + "'", long27 == 1784813549999L);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test401");
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
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute16.next();
        long long18 = minute16.getMiddleMillisecond();
        int int19 = minute16.getHourValue();
        java.util.Date date20 = minute16.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = minute16.next();
        boolean boolean22 = minute0.equals((java.lang.Object) regularTimePeriod21);
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor23 = null;
        java.util.Calendar calendar24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = regularTimePeriod21.getMillisecond(timePeriodAnchor23, calendar24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "322) test401(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "297) test401(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "236) test401(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "167) test401(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "122) test401(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "87) test401(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
// flaky "67) test401(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "43) test401(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "29) test401(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str14, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "15) test401(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813549999L + "'", long18 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
        org.junit.Assert.assertNotNull(date20);
// flaky "9) test401(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date20.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test402");
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
        long long11 = minute0.getFirstMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "323) test402(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "298) test402(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "237) test402(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "168) test402(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
// flaky "123) test402(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "88) test402(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813520000L + "'", long11 == 1784813520000L);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test403");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        long long5 = minute0.getLastMillisecond();
        java.lang.String str6 = minute0.toString();
        long long7 = minute0.getSerialIndex();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor8 = null;
        java.util.Calendar calendar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = minute0.getMillisecond(timePeriodAnchor8, calendar9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "324) test403(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "299) test403(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "238) test403(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
// flaky "169) test403(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "124) test403(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 66566672L + "'", long7 == 66566672L);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test404");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        long long4 = minute3.getSerialIndex();
        long long5 = minute3.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute3.next();
        int int7 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod6);
        java.util.Date date8 = minute0.getStart();
        org.jfree.data.time.Minute minute9 = new org.jfree.data.time.Minute(date8);
// flaky "325) test404(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "300) test404(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "239) test404(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(date8);
// flaky "170) test404(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test405");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        java.util.Date date3 = minute0.getEnd();
        long long4 = minute0.getFirstMillisecond();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute(date5);
        long long8 = minute7.getSerialIndex();
        org.jfree.data.time.Hour hour9 = minute7.getHour();
// flaky "326) test405(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "301) test405(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "240) test405(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "171) test405(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "125) test405(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "89) test405(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertNotNull(hour9);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test406");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        java.util.Date date6 = minute5.getStart();
        int int7 = minute5.getHourValue();
        long long8 = minute5.getSerialIndex();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "327) test406(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "302) test406(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "241) test406(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "172) test406(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test407");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.previous();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        int int5 = minute4.getMinute();
        java.util.Date date6 = minute4.getStart();
        java.util.Date date7 = minute4.getEnd();
        long long8 = minute4.getFirstMillisecond();
        java.util.Date date9 = minute4.getStart();
        long long10 = minute4.getLastMillisecond();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute();
        long long12 = minute11.getSerialIndex();
        long long13 = minute11.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute11.next();
        int int15 = minute4.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = minute4.next();
        long long17 = minute4.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = minute4.next();
        int int19 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute4);
        long long20 = minute4.getFirstMillisecond();
// flaky "328) test407(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "303) test407(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "242) test407(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky "173) test407(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
// flaky "126) test407(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "90) test407(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813520000L + "'", long8 == 1784813520000L);
        org.junit.Assert.assertNotNull(date9);
// flaky "68) test407(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "44) test407(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813579999L + "'", long10 == 1784813579999L);
// flaky "30) test407(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
// flaky "16) test407(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(regularTimePeriod16);
// flaky "10) test407(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 66566672L + "'", long17 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky "7) test407(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813520000L + "'", long20 == 1784813520000L);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test408");
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
        java.util.Calendar calendar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = minute11.getFirstMillisecond(calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "329) test408(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date7);
// flaky "304) test408(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(date10);
// flaky "243) test408(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:33:59 ICT 2026");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test409");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        long long6 = minute5.getLastMillisecond();
        int int7 = minute5.getMinute();
        java.lang.String str8 = minute5.toString();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "330) test409(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "305) test409(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "244) test409(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "174) test409(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "127) test409(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str8, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test410");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.previous();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor7 = null;
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute0.getMillisecond(timePeriodAnchor7, calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "331) test410(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "306) test410(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test411");
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
        int int12 = minute0.getHourValue();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = minute0.next();
        java.util.Calendar calendar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = minute0.getFirstMillisecond(calendar14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "332) test411(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "307) test411(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "245) test411(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "175) test411(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "128) test411(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str10, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "91) test411(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813579999L + "'", long11 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test412");
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
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor13 = null;
        java.util.Calendar calendar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = minute0.getMillisecond(timePeriodAnchor13, calendar14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "333) test412(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "308) test412(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "246) test412(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "176) test412(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "129) test412(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str11, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod12);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test413");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute((int) 'a', (int) (short) 1, (int) '4', 12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test414");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        java.util.Date date5 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.next();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "334) test414(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "309) test414(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date5);
// flaky "247) test414(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test415");
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
        long long24 = minute5.getMiddleMillisecond();
// flaky "335) test415(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "310) test415(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "248) test415(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "177) test415(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "130) test415(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "92) test415(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "69) test415(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
// flaky "45) test415(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813549999L + "'", long14 == 1784813549999L);
// flaky "31) test415(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813520000L + "'", long15 == 1784813520000L);
        org.junit.Assert.assertNotNull(date16);
// flaky "17) test415(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "11) test415(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
// flaky "8) test415(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
// flaky "5) test415(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1784813579999L + "'", long21 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky "2) test415(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1784813549999L + "'", long24 == 1784813549999L);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test416");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = minute0.getLastMillisecond(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "336) test416(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test417");
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
            minute0.peg(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "337) test417(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "311) test417(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "249) test417(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str9, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test418");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        long long4 = minute0.getSerialIndex();
        long long5 = minute0.getLastMillisecond();
        java.lang.String str6 = minute0.toString();
        long long7 = minute0.getSerialIndex();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute0.getFirstMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "338) test418(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "312) test418(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "250) test418(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
// flaky "178) test418(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "131) test418(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 66566672L + "'", long7 == 66566672L);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test419");
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
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute13.next();
        long long15 = minute13.getMiddleMillisecond();
        int int16 = minute13.getHourValue();
        int int17 = minute13.getMinute();
        long long18 = minute13.getLastMillisecond();
        org.jfree.data.time.Minute minute19 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = minute19.next();
        long long21 = minute19.getMiddleMillisecond();
        long long22 = minute19.getFirstMillisecond();
        java.util.Date date23 = minute19.getStart();
        java.lang.String str24 = minute19.toString();
        int int25 = minute13.compareTo((org.jfree.data.time.TimePeriod) minute19);
        boolean boolean26 = minute8.equals((java.lang.Object) int25);
// flaky "339) test419(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "313) test419(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "251) test419(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "179) test419(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "132) test419(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
// flaky "93) test419(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813549999L + "'", long15 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
// flaky "70) test419(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
// flaky "46) test419(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813579999L + "'", long18 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod20);
// flaky "32) test419(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1784813549999L + "'", long21 == 1784813549999L);
// flaky "18) test419(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1784813520000L + "'", long22 == 1784813520000L);
        org.junit.Assert.assertNotNull(date23);
// flaky "12) test419(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date23.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "9) test419(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str24, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test420");
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
            long long17 = minute0.getLastMillisecond(calendar16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "340) test420(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "314) test420(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "252) test420(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "180) test420(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "133) test420(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "94) test420(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "71) test420(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test421");
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
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date9, calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "341) test421(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "315) test421(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "253) test421(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "181) test421(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "134) test421(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "95) test421(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test422");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(0, (int) (short) -1, 6, 4, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test423");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.lang.Object obj5 = null;
        boolean boolean6 = minute0.equals(obj5);
        boolean boolean8 = minute0.equals((java.lang.Object) 8);
        long long9 = minute0.getLastMillisecond();
        java.util.Calendar calendar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = minute0.getFirstMillisecond(calendar10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "342) test423(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "316) test423(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "254) test423(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813579999L + "'", long9 == 1784813579999L);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test424");
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
        org.jfree.data.time.Minute minute22 = new org.jfree.data.time.Minute();
        int int23 = minute22.getMinute();
        int int24 = minute22.getHourValue();
        int int25 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = minute0.next();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "343) test424(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "317) test424(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "255) test424(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "182) test424(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66566672L + "'", long16 == 66566672L);
// flaky "135) test424(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
// flaky "96) test424(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813520000L + "'", long19 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
// flaky "72) test424(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod26);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test425");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = minute0.previous();
        int int5 = minute0.getHourValue();
        long long6 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        long long8 = minute0.getSerialIndex();
// flaky "344) test425(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "318) test425(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "256) test425(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "183) test425(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test426");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        long long4 = minute0.getLastMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.next();
// flaky "345) test426(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "319) test426(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "257) test426(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
// flaky "184) test426(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813579999L + "'", long4 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test427");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        long long6 = minute0.getMiddleMillisecond();
        java.lang.String str7 = minute0.toString();
        int int8 = minute0.getHourValue();
        org.jfree.data.time.Hour hour9 = minute0.getHour();
// flaky "346) test427(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "320) test427(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "258) test427(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "185) test427(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "136) test427(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "97) test427(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
// flaky "73) test427(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str7, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(hour9);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test428");
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
        int int24 = minute12.getMinute();
        int int25 = minute12.getMinute();
        java.lang.String str26 = minute12.toString();
// flaky "347) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "321) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "259) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "186) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "137) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "98) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "74) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
// flaky "47) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813549999L + "'", long14 == 1784813549999L);
// flaky "33) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813520000L + "'", long15 == 1784813520000L);
        org.junit.Assert.assertNotNull(date16);
// flaky "19) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "13) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66566672L + "'", long19 == 66566672L);
// flaky "10) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813549999L + "'", long20 == 1784813549999L);
// flaky "6) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1784813579999L + "'", long21 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
// flaky "3) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
// flaky "2) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
// flaky "2) test428(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str26, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test429");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.util.Date date5 = minute0.getEnd();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute(date5);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "348) test429(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "322) test429(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(date5);
// flaky "260) test429(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test430");
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
        org.jfree.data.time.Minute minute22 = new org.jfree.data.time.Minute();
        int int23 = minute22.getMinute();
        int int24 = minute22.getHourValue();
        int int25 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute22);
        java.lang.Class<?> wildcardClass26 = minute22.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "349) test430(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "323) test430(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "261) test430(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "187) test430(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66566672L + "'", long16 == 66566672L);
// flaky "138) test430(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
// flaky "99) test430(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813520000L + "'", long19 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
// flaky "75) test430(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test431");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getFirstMillisecond();
        long long6 = minute0.getLastMillisecond();
        long long7 = minute0.getFirstMillisecond();
        java.lang.String str8 = minute0.toString();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "350) test431(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "324) test431(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "262) test431(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813520000L + "'", long5 == 1784813520000L);
// flaky "188) test431(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "139) test431(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
// flaky "100) test431(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str8, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test432");
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
        java.util.Calendar calendar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "351) test432(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "325) test432(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "263) test432(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "189) test432(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "140) test432(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "101) test432(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(date10);
// flaky "76) test432(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test433");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        java.util.Date date5 = minute0.getEnd();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute6.next();
        long long8 = minute6.getMiddleMillisecond();
        int int9 = minute6.getHourValue();
        java.util.Date date10 = minute6.getStart();
        java.util.Date date11 = minute6.getStart();
        long long12 = minute6.getLastMillisecond();
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = minute13.next();
        long long15 = minute13.getMiddleMillisecond();
        int int16 = minute13.getHourValue();
        int int17 = minute13.getMinute();
        long long18 = minute13.getLastMillisecond();
        boolean boolean20 = minute13.equals((java.lang.Object) 6);
        long long21 = minute13.getMiddleMillisecond();
        boolean boolean22 = minute6.equals((java.lang.Object) minute13);
        int int23 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute13);
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "352) test433(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "326) test433(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(date5);
// flaky "264) test433(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "190) test433(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(date10);
// flaky "141) test433(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date11);
// flaky "102) test433(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "77) test433(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
// flaky "48) test433(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813549999L + "'", long15 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
// flaky "34) test433(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
// flaky "20) test433(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813579999L + "'", long18 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "14) test433(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1784813549999L + "'", long21 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test434");
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
        java.lang.Class<?> wildcardClass12 = minute8.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "353) test434(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "327) test434(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "265) test434(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "191) test434(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test435");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        int int5 = minute0.getMinute();
        java.util.Date date6 = minute0.getEnd();
        long long7 = minute0.getMiddleMillisecond();
        long long8 = minute0.getLastMillisecond();
        java.lang.Class<?> wildcardClass9 = minute0.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "354) test435(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "328) test435(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "266) test435(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky "192) test435(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "142) test435(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
// flaky "103) test435(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test436");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        long long4 = minute0.getFirstMillisecond();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) (byte) 1);
// flaky "355) test436(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "329) test436(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "267) test436(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
// flaky "193) test436(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test437");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        int int3 = minute2.getMinute();
        java.util.Date date4 = minute2.getStart();
        boolean boolean5 = minute0.equals((java.lang.Object) date4);
        boolean boolean7 = minute0.equals((java.lang.Object) '4');
        java.util.Date date8 = minute0.getStart();
        java.util.TimeZone timeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute(date8, timeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "356) test437(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "330) test437(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "268) test437(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test438");
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
        long long13 = minute0.getSerialIndex();
        int int14 = minute0.getHourValue();
// flaky "357) test438(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "331) test438(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
// flaky "269) test438(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "194) test438(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "143) test438(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "104) test438(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test439");
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
            org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute(date13, calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "358) test439(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "332) test439(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "270) test439(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
// flaky "195) test439(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813549999L + "'", long11 == 1784813549999L);
// flaky "144) test439(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813520000L + "'", long12 == 1784813520000L);
        org.junit.Assert.assertNotNull(date13);
// flaky "105) test439(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test440");
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
        long long12 = minute0.getLastMillisecond();
// flaky "359) test440(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "333) test440(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "271) test440(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "196) test440(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "145) test440(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str10, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "106) test440(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813579999L + "'", long11 == 1784813579999L);
// flaky "78) test440(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test441");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.util.Date date6 = minute0.getEnd();
        java.lang.Class<?> wildcardClass7 = minute0.getClass();
// flaky "360) test441(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "334) test441(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "272) test441(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "197) test441(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "146) test441(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertNotNull(date6);
// flaky "107) test441(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test442");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        int int5 = minute0.getMinute();
        java.util.Date date6 = minute0.getEnd();
        long long7 = minute0.getMiddleMillisecond();
        long long8 = minute0.getLastMillisecond();
        java.lang.String str9 = minute0.toString();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "361) test442(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "335) test442(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "273) test442(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky "198) test442(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "147) test442(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
// flaky "108) test442(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "79) test442(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str9, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test443");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        int int4 = minute0.getHourValue();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "362) test443(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "336) test443(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test444");
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
        java.util.TimeZone timeZone15 = null;
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute17 = new org.jfree.data.time.Minute(date14, timeZone15, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "363) test444(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "337) test444(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "274) test444(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813579999L + "'", long3 == 1784813579999L);
// flaky "199) test444(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "148) test444(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
// flaky "109) test444(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "80) test444(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str11, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date12);
// flaky "49) test444(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "35) test444(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(date14);
// flaky "21) test444(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date14.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test445");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        java.util.Date date8 = minute0.getEnd();
        java.util.Date date9 = minute0.getEnd();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute0.previous();
        java.util.Calendar calendar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "364) test445(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "338) test445(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "275) test445(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky "200) test445(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(date9);
// flaky "149) test445(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod10);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test446");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        long long8 = minute0.getLastMillisecond();
        boolean boolean10 = minute0.equals((java.lang.Object) "Thu Jul 23 20:31:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "365) test446(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "339) test446(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "276) test446(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "201) test446(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test447");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = minute0.next();
        java.util.Calendar calendar22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = minute0.getMiddleMillisecond(calendar22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "366) test447(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "340) test447(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "277) test447(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "202) test447(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "150) test447(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
// flaky "110) test447(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813579999L + "'", long17 == 1784813579999L);
// flaky "81) test447(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
// flaky "50) test447(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str19, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test448");
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
        java.util.Calendar calendar19 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute14.peg(calendar19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "367) test448(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "341) test448(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "278) test448(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "203) test448(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "151) test448(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "111) test448(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 66566672L + "'", long18 == 66566672L);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test449");
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
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = minute0.getFirstMillisecond(calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "368) test449(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "342) test449(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "279) test449(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "204) test449(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(date11);
// flaky "152) test449(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky "112) test449(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
// flaky "82) test449(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str14, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test450");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        long long4 = minute0.getFirstMillisecond();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = minute0.getMiddleMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "369) test450(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "343) test450(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "280) test450(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
// flaky "205) test450(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test451");
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
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor10 = null;
        java.util.Calendar calendar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = minute9.getMillisecond(timePeriodAnchor10, calendar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "370) test451(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(date7);
// flaky "344) test451(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:33:00 ICT 2026");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test452");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        java.util.Date date2 = minute0.getStart();
        long long3 = minute0.getMiddleMillisecond();
// flaky "371) test452(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(date2);
// flaky "345) test452(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "281) test452(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813549999L + "'", long3 == 1784813549999L);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test453");
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
        java.util.Date date14 = minute8.getEnd();
        java.util.TimeZone timeZone15 = null;
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute17 = new org.jfree.data.time.Minute(date14, timeZone15, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "372) test453(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "346) test453(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "282) test453(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "206) test453(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky "153) test453(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertNotNull(date14);
// flaky "113) test453(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date14.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test454");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        long long3 = minute0.getFirstMillisecond();
        java.lang.String str4 = minute0.toString();
        long long5 = minute0.getLastMillisecond();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getMiddleMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "373) test454(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "347) test454(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
// flaky "283) test454(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str4, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "207) test454(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test455");
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
        java.util.Date date15 = regularTimePeriod13.getStart();
        java.lang.Class<?> wildcardClass16 = regularTimePeriod13.getClass();
// flaky "374) test455(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "348) test455(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "284) test455(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "208) test455(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "154) test455(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "114) test455(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "83) test455(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky "51) test455(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test456");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        org.jfree.data.time.TimePeriod timePeriod4 = null;
        int int5 = minute0.compareTo(timePeriod4);
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = minute0.getLastMillisecond(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "375) test456(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test457");
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
        java.util.Calendar calendar17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = minute8.getFirstMillisecond(calendar17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "376) test457(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "349) test457(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "285) test457(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "209) test457(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "155) test457(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
// flaky "115) test457(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813520000L + "'", long7 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
// flaky "84) test457(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "52) test457(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky "36) test457(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str14, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test458");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        java.util.Date date1 = minute0.getEnd();
        java.util.Date date2 = minute0.getStart();
        org.junit.Assert.assertNotNull(date1);
// flaky "377) test458(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date1.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(date2);
// flaky "350) test458(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test459");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        java.util.Date date6 = minute0.getEnd();
        int int7 = minute0.getHourValue();
        java.lang.Class<?> wildcardClass8 = minute0.getClass();
// flaky "378) test459(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "351) test459(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "286) test459(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "210) test459(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "156) test459(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertNotNull(date6);
// flaky "116) test459(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test460");
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
        java.util.Date date12 = minute11.getEnd();
        java.lang.Class<?> wildcardClass13 = date12.getClass();
// flaky "379) test460(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "352) test460(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "287) test460(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "211) test460(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 66566672L + "'", long5 == 66566672L);
// flaky "157) test460(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
// flaky "117) test460(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky "85) test460(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test461");
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
        long long11 = minute0.getFirstMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "380) test461(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "353) test461(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "288) test461(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertNotNull(date8);
// flaky "212) test461(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "158) test461(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813520000L + "'", long11 == 1784813520000L);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test462");
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
// flaky "381) test462(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "354) test462(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "289) test462(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "213) test462(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813549999L + "'", long9 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky "159) test462(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813579999L + "'", long13 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(date15);
// flaky "118) test462(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test463");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        int int4 = minute0.getHourValue();
// flaky "382) test463(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "355) test463(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test464");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute0.previous();
        java.util.Date date12 = regularTimePeriod11.getEnd();
// flaky "383) test464(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "356) test464(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
// flaky "290) test464(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date10.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertNotNull(date12);
// flaky "214) test464(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:31:59 ICT 2026");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test465");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.next();
        org.jfree.data.time.Minute minute6 = new org.jfree.data.time.Minute();
        long long7 = minute6.getSerialIndex();
        long long8 = minute6.getMiddleMillisecond();
        long long9 = minute6.getLastMillisecond();
        long long10 = minute6.getFirstMillisecond();
        org.jfree.data.time.Minute minute11 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = minute11.next();
        long long13 = minute11.getMiddleMillisecond();
        int int14 = minute11.getHourValue();
        int int15 = minute11.getMinute();
        int int16 = minute6.compareTo((org.jfree.data.time.TimePeriod) minute11);
        int int17 = minute6.getHourValue();
        boolean boolean18 = minute0.equals((java.lang.Object) int17);
        java.lang.Class<?> wildcardClass19 = minute0.getClass();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "384) test465(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "357) test465(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "291) test465(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 66566672L + "'", long7 == 66566672L);
// flaky "215) test465(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
// flaky "160) test465(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813579999L + "'", long9 == 1784813579999L);
// flaky "119) test465(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813520000L + "'", long10 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "86) test465(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
// flaky "53) test465(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test466");
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
        long long17 = minute15.getFirstMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = minute15.previous();
        int int19 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod18);
// flaky "385) test466(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "358) test466(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date3);
// flaky "292) test466(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date3.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "216) test466(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
        org.junit.Assert.assertNotNull(date5);
// flaky "161) test466(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "120) test466(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky "87) test466(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813579999L + "'", long12 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod16);
// flaky "54) test466(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813520000L + "'", long17 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test467");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = minute2.previous();
// flaky "386) test467(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "359) test467(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "293) test467(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "217) test467(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "162) test467(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "121) test467(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test468");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getMiddleMillisecond();
        java.util.Calendar calendar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "387) test468(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "360) test468(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "294) test468(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test469");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute0.next();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.previous();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute0.getLastMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "388) test469(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "361) test469(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod5);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test470");
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
        long long31 = minute7.getFirstMillisecond();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "389) test470(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(date4);
// flaky "362) test470(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "295) test470(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "218) test470(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "163) test470(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky "122) test470(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66566672L + "'", long11 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
// flaky "88) test470(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813549999L + "'", long15 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(date17);
// flaky "55) test470(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date17.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "37) test470(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813579999L + "'", long19 == 1784813579999L);
        org.junit.Assert.assertNotNull(regularTimePeriod21);
// flaky "22) test470(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1784813549999L + "'", long22 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
// flaky "15) test470(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1784813579999L + "'", long26 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20 + "'", int28 == 20);
// flaky "11) test470(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1784813520000L + "'", long29 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "7) test470(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1784813520000L + "'", long31 == 1784813520000L);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test471");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(59, 1, (int) (byte) 100, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test472");
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
        java.util.Calendar calendar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute19 = new org.jfree.data.time.Minute(date17, calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'calendar' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "390) test472(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "363) test472(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "296) test472(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "219) test472(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "164) test472(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "123) test472(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
// flaky "89) test472(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(date11);
// flaky "56) test472(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky "38) test472(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date15.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(date17);
// flaky "23) test472(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date17.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test473");
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
        int int11 = minute0.getHourValue();
        long long12 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute13 = new org.jfree.data.time.Minute();
        long long14 = minute13.getSerialIndex();
        long long15 = minute13.getMiddleMillisecond();
        long long16 = minute13.getFirstMillisecond();
        long long17 = minute13.getFirstMillisecond();
        java.util.Date date18 = minute13.getEnd();
        boolean boolean19 = minute0.equals((java.lang.Object) date18);
// flaky "391) test473(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "364) test473(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "297) test473(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "220) test473(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "165) test473(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str10, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "124) test473(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
// flaky "90) test473(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 66566672L + "'", long14 == 66566672L);
// flaky "57) test473(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813549999L + "'", long15 == 1784813549999L);
// flaky "39) test473(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813520000L + "'", long16 == 1784813520000L);
// flaky "24) test473(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813520000L + "'", long17 == 1784813520000L);
        org.junit.Assert.assertNotNull(date18);
// flaky "16) test473(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date18.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test474");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        int int4 = minute0.getHourValue();
        org.jfree.data.time.Hour hour5 = minute0.getHour();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor6 = null;
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = hour5.getMillisecond(timePeriodAnchor6, calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "392) test474(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "365) test474(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertNotNull(hour5);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test475");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getHourValue();
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "393) test475(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test476");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        int int5 = minute0.getMinute();
        java.util.Date date6 = minute0.getEnd();
        java.lang.String str7 = minute0.toString();
        org.jfree.data.time.Minute minute8 = new org.jfree.data.time.Minute();
        long long9 = minute8.getSerialIndex();
        long long10 = minute8.getMiddleMillisecond();
        long long11 = minute8.getFirstMillisecond();
        java.util.Date date12 = minute8.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = minute8.previous();
        java.lang.String str14 = minute8.toString();
        org.jfree.data.time.Minute minute15 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = minute15.next();
        long long17 = minute15.getMiddleMillisecond();
        int int18 = minute15.getHourValue();
        int int19 = minute15.getMinute();
        long long20 = minute15.getLastMillisecond();
        boolean boolean22 = minute15.equals((java.lang.Object) 6);
        java.util.Date date23 = minute15.getEnd();
        org.jfree.data.time.Minute minute24 = new org.jfree.data.time.Minute(date23);
        int int25 = minute8.compareTo((org.jfree.data.time.TimePeriod) minute24);
        boolean boolean26 = minute0.equals((java.lang.Object) int25);
        int int27 = minute0.getHourValue();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "394) test476(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "366) test476(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "298) test476(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(date6);
// flaky "221) test476(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "166) test476(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str7, "Thu Jul 23 20:32:00 ICT 2026");
// flaky "125) test476(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66566672L + "'", long9 == 66566672L);
// flaky "91) test476(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1784813549999L + "'", long10 == 1784813549999L);
// flaky "58) test476(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1784813520000L + "'", long11 == 1784813520000L);
        org.junit.Assert.assertNotNull(date12);
// flaky "40) test476(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date12.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod13);
// flaky "25) test476(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str14, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod16);
// flaky "17) test476(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
// flaky "12) test476(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
// flaky "8) test476(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1784813579999L + "'", long20 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date23);
// flaky "4) test476(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date23.toString(), "Thu Jul 23 20:32:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test477");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(date4);
        long long6 = minute5.getLastMillisecond();
        java.util.Date date7 = minute5.getEnd();
        java.util.Calendar calendar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = minute5.getMiddleMillisecond(calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "395) test477(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "367) test477(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "299) test477(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813579999L + "'", long6 == 1784813579999L);
        org.junit.Assert.assertNotNull(date7);
// flaky "222) test477(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test478");
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
        java.util.Date date22 = minute15.getEnd();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "396) test478(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "368) test478(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
// flaky "300) test478(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "223) test478(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66566672L + "'", long16 == 66566672L);
// flaky "167) test478(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1784813549999L + "'", long17 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod18);
// flaky "126) test478(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1784813520000L + "'", long19 == 1784813520000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky "92) test478(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 66566672L + "'", long21 == 66566672L);
        org.junit.Assert.assertNotNull(date22);
// flaky "59) test478(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date22.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test479");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = minute2.getFirstMillisecond(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "397) test479(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "369) test479(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test480");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(1, (int) (short) 0, (int) (short) 1, (int) (short) -1, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test481");
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
        java.util.Calendar calendar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = minute0.getFirstMillisecond(calendar18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "398) test481(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "370) test481(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "301) test481(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "224) test481(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "168) test481(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "127) test481(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str6, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date7);
// flaky "93) test481(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date7.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "60) test481(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
// flaky "41) test481(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
// flaky "26) test481(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky "18) test481(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test482");
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
        java.util.Calendar calendar22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = minute21.getFirstMillisecond(calendar22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "399) test482(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "371) test482(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "302) test482(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "225) test482(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "169) test482(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "128) test482(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 66566672L + "'", long18 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
        org.junit.Assert.assertNotNull(date20);
// flaky "94) test482(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date20.toString(), "Thu Jul 23 20:31:59 ICT 2026");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test483");
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
        java.util.TimeZone timeZone12 = null;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute14 = new org.jfree.data.time.Minute(date11, timeZone12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "400) test483(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "372) test483(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "303) test483(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "226) test483(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
        org.junit.Assert.assertNotNull(date11);
// flaky "170) test483(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date11.toString(), "Thu Jul 23 20:31:00 ICT 2026");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test484");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        long long3 = minute0.getFirstMillisecond();
        java.util.Date date4 = minute0.getStart();
        long long5 = minute0.getMiddleMillisecond();
        long long6 = minute0.getFirstMillisecond();
// flaky "401) test484(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "373) test484(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
// flaky "304) test484(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
        org.junit.Assert.assertNotNull(date4);
// flaky "227) test484(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "171) test484(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
// flaky "129) test484(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813520000L + "'", long6 == 1784813520000L);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test485");
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
        java.util.TimeZone timeZone23 = null;
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute25 = new org.jfree.data.time.Minute(date21, timeZone23, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'zone' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky "402) test485(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "374) test485(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "305) test485(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "228) test485(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "172) test485(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "130) test485(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod20);
        org.junit.Assert.assertNotNull(date21);
// flaky "95) test485(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date21.toString(), "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test486");
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
        org.jfree.data.time.Minute minute18 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = minute18.next();
        org.jfree.data.time.Minute minute20 = new org.jfree.data.time.Minute();
        int int21 = minute20.getMinute();
        java.util.Date date22 = minute20.getStart();
        boolean boolean23 = minute18.equals((java.lang.Object) date22);
        boolean boolean25 = minute18.equals((java.lang.Object) '4');
        long long26 = minute18.getSerialIndex();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = minute18.previous();
        boolean boolean28 = minute0.equals((java.lang.Object) regularTimePeriod27);
// flaky "403) test486(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "375) test486(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(date4);
// flaky "306) test486(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:59 ICT 2026");
// flaky "229) test486(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str5, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "173) test486(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(regularTimePeriod12);
        org.junit.Assert.assertNotNull(date13);
// flaky "131) test486(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date13.toString(), "Thu Jul 23 20:33:00 ICT 2026");
        org.junit.Assert.assertNotNull(date16);
// flaky "96) test486(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:33:59 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
// flaky "61) test486(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(date22);
// flaky "42) test486(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date22.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "27) test486(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 66566672L + "'", long26 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test487");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        org.jfree.data.time.Minute minute2 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute2.next();
        long long4 = minute2.getMiddleMillisecond();
        int int5 = minute2.getHourValue();
        int int6 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = minute0.previous();
        long long8 = minute0.getFirstMillisecond();
        int int9 = minute0.getMinute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = minute0.previous();
// flaky "404) test487(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "376) test487(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(regularTimePeriod7);
// flaky "307) test487(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813520000L + "'", long8 == 1784813520000L);
// flaky "230) test487(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod10);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test488");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        long long1 = minute0.getSerialIndex();
        long long2 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.next();
        long long4 = minute0.getFirstMillisecond();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        long long6 = minute5.getSerialIndex();
        long long7 = minute5.getMiddleMillisecond();
        long long8 = minute5.getLastMillisecond();
        long long9 = minute5.getFirstMillisecond();
        org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute10.next();
        long long12 = minute10.getMiddleMillisecond();
        int int13 = minute10.getHourValue();
        int int14 = minute10.getMinute();
        int int15 = minute5.compareTo((org.jfree.data.time.TimePeriod) minute10);
        java.lang.String str16 = minute10.toString();
        int int17 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute10);
        int int18 = minute10.getHourValue();
// flaky "405) test488(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
// flaky "377) test488(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "308) test488(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813520000L + "'", long4 == 1784813520000L);
// flaky "231) test488(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 66566672L + "'", long6 == 66566672L);
// flaky "174) test488(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1784813549999L + "'", long7 == 1784813549999L);
// flaky "132) test488(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813579999L + "'", long8 == 1784813579999L);
// flaky "97) test488(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813520000L + "'", long9 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
// flaky "62) test488(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813549999L + "'", long12 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
// flaky "43) test488(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky "28) test488(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str16, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test489");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        java.util.Date date2 = minute0.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = minute0.previous();
        org.jfree.data.time.Minute minute4 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = minute4.next();
        long long6 = minute4.getMiddleMillisecond();
        int int7 = minute4.getHourValue();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = minute4.previous();
        boolean boolean9 = minute0.equals((java.lang.Object) minute4);
// flaky "406) test489(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertNotNull(date2);
// flaky "378) test489(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date2.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod3);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "309) test489(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test490");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getLastMillisecond();
        boolean boolean7 = minute0.equals((java.lang.Object) 6);
        long long8 = minute0.getMiddleMillisecond();
        int int9 = minute0.getMinute();
        org.jfree.data.time.Minute minute10 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = minute10.next();
        long long12 = minute10.getFirstMillisecond();
        long long13 = minute10.getLastMillisecond();
        int int14 = minute0.compareTo((org.jfree.data.time.TimePeriod) minute10);
        long long15 = minute0.getLastMillisecond();
        java.util.Date date16 = minute0.getStart();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "407) test490(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "379) test490(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "310) test490(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813579999L + "'", long5 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky "232) test490(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
// flaky "175) test490(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
// flaky "133) test490(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1784813520000L + "'", long12 == 1784813520000L);
// flaky "98) test490(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813579999L + "'", long13 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky "63) test490(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813579999L + "'", long15 == 1784813579999L);
        org.junit.Assert.assertNotNull(date16);
// flaky "44) test490(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date16.toString(), "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test491");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        java.util.Date date4 = minute0.getStart();
        java.util.Date date5 = minute0.getStart();
        java.util.Date date6 = minute0.getEnd();
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "408) test491(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertNotNull(date4);
// flaky "380) test491(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date4.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date5);
// flaky "311) test491(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date5.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(date6);
// flaky "233) test491(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date6.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test492");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        long long3 = minute0.getFirstMillisecond();
        java.lang.String str4 = minute0.toString();
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = minute0.getFirstMillisecond(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "409) test492(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "381) test492(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813520000L + "'", long3 == 1784813520000L);
// flaky "312) test492(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str4, "Thu Jul 23 20:32:00 ICT 2026");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test493");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute(12, 2, 100, 6, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'year' argument must be in range 1900 to 9999.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test494");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod1 = minute0.next();
        long long2 = minute0.getMiddleMillisecond();
        int int3 = minute0.getHourValue();
        int int4 = minute0.getMinute();
        long long5 = minute0.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute0.previous();
        java.util.Calendar calendar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            minute0.peg(calendar7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(regularTimePeriod1);
// flaky "410) test494(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1784813549999L + "'", long2 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
// flaky "382) test494(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
// flaky "313) test494(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test495");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        int int3 = minute0.getMinute();
        int int4 = minute0.getHourValue();
        org.jfree.data.time.Minute minute5 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute5.next();
        org.jfree.data.time.Minute minute7 = new org.jfree.data.time.Minute();
        int int8 = minute7.getMinute();
        java.util.Date date9 = minute7.getStart();
        boolean boolean10 = minute5.equals((java.lang.Object) date9);
        boolean boolean12 = minute5.equals((java.lang.Object) '4');
        long long13 = minute5.getSerialIndex();
        boolean boolean14 = minute0.equals((java.lang.Object) long13);
        java.util.Calendar calendar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = minute0.getFirstMillisecond(calendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "411) test495(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "383) test495(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
// flaky "314) test495(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(date9);
// flaky "234) test495(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date9.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "176) test495(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66566672L + "'", long13 == 66566672L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test496");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        org.jfree.data.time.Minute minute3 = new org.jfree.data.time.Minute();
        long long4 = minute3.getSerialIndex();
        long long5 = minute3.getMiddleMillisecond();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = minute3.next();
        int int7 = minute0.compareTo((org.jfree.data.time.TimePeriod) regularTimePeriod6);
        java.util.Date date8 = minute0.getStart();
        long long9 = minute0.getFirstMillisecond();
// flaky "412) test496(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "384) test496(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 66566672L + "'", long4 == 66566672L);
// flaky "315) test496(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(date8);
// flaky "235) test496(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date8.toString(), "Thu Jul 23 20:32:00 ICT 2026");
// flaky "177) test496(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1784813520000L + "'", long9 == 1784813520000L);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test497");
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
        int int11 = minute0.getHourValue();
        long long12 = minute0.getSerialIndex();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor13 = null;
        java.util.Calendar calendar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = minute0.getMillisecond(timePeriodAnchor13, calendar14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "413) test497(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "385) test497(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod5);
// flaky "316) test497(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1784813549999L + "'", long6 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
// flaky "236) test497(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 66566672L + "'", long8 == 66566672L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky "178) test497(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Thu Jul 23 20:32:00 ICT 2026" + "'", str10, "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
// flaky "134) test497(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test498");
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        int int1 = minute0.getMinute();
        int int2 = minute0.getHourValue();
        long long3 = minute0.getMiddleMillisecond();
        org.jfree.data.time.TimePeriodAnchor timePeriodAnchor4 = null;
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = minute0.getMillisecond(timePeriodAnchor4, calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.data.time.TimePeriodAnchor.equals(Object)\" because \"anchor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "414) test498(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
// flaky "386) test498(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1784813549999L + "'", long3 == 1784813549999L);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test499");
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
        long long12 = minute11.getSerialIndex();
        long long13 = minute11.getMiddleMillisecond();
        long long14 = minute11.getLastMillisecond();
        long long15 = minute11.getFirstMillisecond();
        org.jfree.data.time.Minute minute16 = new org.jfree.data.time.Minute();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = minute16.next();
        long long18 = minute16.getMiddleMillisecond();
        int int19 = minute16.getHourValue();
        int int20 = minute16.getMinute();
        int int21 = minute11.compareTo((org.jfree.data.time.TimePeriod) minute16);
        int int22 = minute16.getHourValue();
        org.jfree.data.time.Minute minute23 = new org.jfree.data.time.Minute();
        long long24 = minute23.getSerialIndex();
        long long25 = minute23.getMiddleMillisecond();
        long long26 = minute23.getFirstMillisecond();
        java.util.Date date27 = minute23.getStart();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = minute23.previous();
        org.jfree.data.time.Minute minute29 = new org.jfree.data.time.Minute();
        long long30 = minute29.getSerialIndex();
        long long31 = minute29.getMiddleMillisecond();
        long long32 = minute29.getLastMillisecond();
        int int33 = minute23.compareTo((org.jfree.data.time.TimePeriod) minute29);
        int int34 = minute16.compareTo((org.jfree.data.time.TimePeriod) minute23);
        int int35 = minute23.getHourValue();
        boolean boolean36 = minute0.equals((java.lang.Object) int35);
        java.util.Date date37 = minute0.getEnd();
// flaky "415) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
        org.junit.Assert.assertNotNull(regularTimePeriod4);
// flaky "387) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1784813549999L + "'", long5 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky "317) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
// flaky "237) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1784813549999L + "'", long8 == 1784813549999L);
        org.junit.Assert.assertNotNull(regularTimePeriod9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "179) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66566672L + "'", long12 == 66566672L);
// flaky "135) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1784813549999L + "'", long13 == 1784813549999L);
// flaky "99) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1784813579999L + "'", long14 == 1784813579999L);
// flaky "64) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1784813520000L + "'", long15 == 1784813520000L);
        org.junit.Assert.assertNotNull(regularTimePeriod17);
// flaky "45) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1784813549999L + "'", long18 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20 + "'", int19 == 20);
// flaky "29) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
// flaky "19) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 66566672L + "'", long24 == 66566672L);
// flaky "13) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1784813549999L + "'", long25 == 1784813549999L);
// flaky "9) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1784813520000L + "'", long26 == 1784813520000L);
        org.junit.Assert.assertNotNull(date27);
// flaky "5) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date27.toString(), "Thu Jul 23 20:32:00 ICT 2026");
        org.junit.Assert.assertNotNull(regularTimePeriod28);
// flaky "3) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 66566672L + "'", long30 == 66566672L);
// flaky "3) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1784813549999L + "'", long31 == 1784813549999L);
// flaky "2) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1784813579999L + "'", long32 == 1784813579999L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20 + "'", int35 == 20);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(date37);
// flaky "1) test499(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertEquals(date37.toString(), "Thu Jul 23 20:32:59 ICT 2026");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MinuteRegressionTest0.test500");
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
        java.util.Calendar calendar20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = minute14.getMiddleMillisecond(calendar20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Calendar.clear()\" because \"calendar\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "416) test500(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 66566672L + "'", long1 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod3);
// flaky "388) test500(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1784813549999L + "'", long4 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky "318) test500(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
// flaky "238) test500(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(regularTimePeriod11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(regularTimePeriod15);
// flaky "180) test500(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1784813549999L + "'", long16 == 1784813549999L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky "136) test500(org.jfree.data.time.MinuteRegressionTest0)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 66566672L + "'", long18 == 66566672L);
        org.junit.Assert.assertNotNull(regularTimePeriod19);
    }
}
