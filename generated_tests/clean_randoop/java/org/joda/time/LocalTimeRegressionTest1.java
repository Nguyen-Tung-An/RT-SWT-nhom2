package org.joda.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LocalTimeRegressionTest1 {

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
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test501");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        long long10 = property8.remainder();
        java.lang.String str11 = property8.getAsString();
        org.joda.time.Interval interval12 = property8.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = property8.setCopy("Property[secondOfMinute]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[secondOfMinute]\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3599999L + "'", long10 == 3599999L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7" + "'", str11, "7");
        org.junit.Assert.assertNotNull(interval12);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test502");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property8.getDifferenceAsLong(readableInstant10);
        int int12 = property8.get();
        org.joda.time.LocalTime localTime14 = property8.addWrapFieldToCopy(999);
        org.joda.time.LocalTime localTime16 = property8.addWrapFieldToCopy(0);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) -1, chronology18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime22 = localTime19.withPeriodAdded(readablePeriod20, 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = null;
        java.lang.String str24 = localTime19.toString(dateTimeFormatter23);
        boolean boolean25 = localTime16.isAfter((org.joda.time.ReadablePartial) localTime19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = localTime19.withHourOfDay(947);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 947 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-495773L) + "'", long11 == (-495773L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "07:59:59.999" + "'", str24, "07:59:59.999");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test503");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        long long10 = localTime9.getLocalMillis();
        org.joda.time.LocalTime localTime12 = localTime9.plusHours(53999999);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3599999L + "'", long10 == 3599999L);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test504");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property8.getDifferenceAsLong(readableInstant10);
        int int12 = property8.get();
        org.joda.time.LocalTime localTime14 = property8.addWrapFieldToCopy(999);
        java.lang.String str16 = localTime14.toString("07:59:59.999");
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) -1, chronology18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime22 = localTime19.withPeriodAdded(readablePeriod20, 0);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime24 = localTime19.plus(readablePeriod23);
        org.joda.time.LocalTime.Property property25 = localTime19.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime28 = localTime19.withPeriodAdded(readablePeriod26, (int) (byte) 0);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (short) -1, chronology30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime34 = localTime31.withPeriodAdded(readablePeriod32, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = localTime31.getFieldType((int) (short) 1);
        int int37 = localTime28.indexOf(dateTimeFieldType36);
        org.joda.time.DateTimeField[] dateTimeFieldArray38 = localTime28.getFields();
        boolean boolean39 = localTime14.equals((java.lang.Object) dateTimeFieldArray38);
        int int40 = localTime14.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-495773L) + "'", long11 == (-495773L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:59:59.999" + "'", str16, "07:59:59.999");
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 59 + "'", int40 == 59);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test505");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        long long10 = property8.getMillis();
        org.joda.time.LocalTime localTime11 = property8.roundHalfEvenCopy();
        java.lang.String str12 = property8.getName();
        int int13 = property8.getMinimumValueOverall();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime16.plus(readablePeriod20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (short) -1, chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalTime localTime27 = localTime24.withPeriodAdded(readablePeriod25, 0);
        int int28 = localTime21.compareTo((org.joda.time.ReadablePartial) localTime27);
        org.joda.time.LocalTime localTime30 = localTime27.plusMinutes(59);
        boolean boolean31 = property8.equals((java.lang.Object) 59);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 28799999L + "'", long10 == 28799999L);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hourOfDay" + "'", str12, "hourOfDay");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test506");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime localTime3 = localTime1.withMinuteOfHour(0);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (short) -1, chronology5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime9 = localTime6.withPeriodAdded(readablePeriod7, 0);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime6.plus(readablePeriod10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (short) -1, chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime17 = localTime14.withPeriodAdded(readablePeriod15, 0);
        int int18 = localTime11.compareTo((org.joda.time.ReadablePartial) localTime17);
        boolean boolean19 = localTime3.isAfter((org.joda.time.ReadablePartial) localTime17);
        int[] intArray20 = localTime3.getValues();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(intArray20);
// flaky "1) test506(org.joda.time.LocalTimeRegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray20, new int[] { 20, 0, 12, 68 });
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test507");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime10.withPeriodAdded(readablePeriod11, 0);
        int int14 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology15);
        int int17 = localTime16.getSecondOfMinute();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) -1, chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime23 = localTime20.withPeriodAdded(readablePeriod21, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = localTime20.getFieldType((int) (short) 1);
        int int26 = localTime16.get(dateTimeFieldType25);
        boolean boolean27 = localTime13.isSupported(dateTimeFieldType25);
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(1L);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) -1, chronology31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalTime localTime35 = localTime32.withPeriodAdded(readablePeriod33, 0);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalTime localTime37 = localTime32.plus(readablePeriod36);
        org.joda.time.LocalTime.Property property38 = localTime32.hourOfDay();
        boolean boolean39 = localTime29.isBefore((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.LocalTime.Property property40 = localTime32.secondOfMinute();
        int int41 = property40.getMaximumValueOverall();
        org.joda.time.DateTimeField dateTimeField42 = property40.getField();
        org.joda.time.LocalTime.Property property43 = new org.joda.time.LocalTime.Property(localTime13, dateTimeField42);
        org.joda.time.DateTime dateTime44 = localTime13.toDateTimeToday();
        int int45 = localTime13.getMillisOfDay();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky "2) test507(org.joda.time.LocalTimeRegressionTest1)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 37 + "'", int26 == 37);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 59 + "'", int41 == 59);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 28799999 + "'", int45 == 28799999);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test508");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime10.withPeriodAdded(readablePeriod11, 0);
        int int14 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) -1, chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime20 = localTime17.withPeriodAdded(readablePeriod18, 0);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime17.plus(readablePeriod21);
        org.joda.time.LocalTime.Property property23 = localTime17.hourOfDay();
        org.joda.time.LocalTime localTime24 = property23.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant25 = null;
        long long26 = property23.getDifferenceAsLong(readableInstant25);
        java.util.Locale locale27 = null;
        int int28 = property23.getMaximumShortTextLength(locale27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (short) -1, chronology30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime34 = localTime31.withPeriodAdded(readablePeriod32, 0);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalTime localTime36 = localTime31.plus(readablePeriod35);
        org.joda.time.DateTime dateTime37 = localTime36.toDateTimeToday();
        int int38 = property23.getDifference((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime39 = localTime7.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.LocalTime localTime41 = localTime7.minusMinutes(0);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((long) (short) -1, chronology43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalTime localTime47 = localTime44.withPeriodAdded(readablePeriod45, 0);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalTime localTime49 = localTime44.plus(readablePeriod48);
        org.joda.time.LocalTime.Property property50 = localTime44.hourOfDay();
        org.joda.time.LocalTime localTime51 = property50.withMinimumValue();
        long long52 = property50.remainder();
        org.joda.time.LocalTime localTime54 = property50.addWrapFieldToCopy((-1));
        org.joda.time.DurationFieldType durationFieldType55 = null;
        boolean boolean56 = localTime54.isSupported(durationFieldType55);
        org.joda.time.LocalTime localTime57 = localTime7.withFields((org.joda.time.ReadablePartial) localTime54);
        org.joda.time.LocalTime.Property property58 = localTime57.millisOfSecond();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-495773L) + "'", long26 == (-495773L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-495761) + "'", int38 == (-495761));
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 3599999L + "'", long52 == 3599999L);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(property58);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test509");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) -1, chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime11.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime16 = localTime11.plus(readablePeriod15);
        org.joda.time.LocalTime.Property property17 = localTime11.hourOfDay();
        org.joda.time.LocalTime localTime18 = property17.withMinimumValue();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) -1, chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime24 = localTime21.withPeriodAdded(readablePeriod22, 0);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalTime localTime26 = localTime21.minus(readablePeriod25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localTime26.toDateTimeToday(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = localTime18.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        int int30 = property8.getDifference((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(chronology31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalTime localTime35 = localTime32.withPeriodAdded(readablePeriod33, 100);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) (short) -1, chronology37);
        boolean boolean39 = localTime35.equals((java.lang.Object) chronology37);
        org.joda.time.LocalTime localTime41 = localTime35.minusHours(23);
        org.joda.time.LocalTime localTime43 = localTime41.plusMillis(74211477);
        org.joda.time.LocalTime localTime45 = localTime41.plusMinutes(999);
        int int46 = property8.compareTo((org.joda.time.ReadablePartial) localTime45);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-495761) + "'", int30 == (-495761));
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test510");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime10.withPeriodAdded(readablePeriod11, 0);
        int int14 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.LocalTime localTime16 = localTime13.minusHours(999);
        org.joda.time.LocalTime localTime18 = localTime13.minusHours(56);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test511");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property8.getDifferenceAsLong(readableInstant10);
        org.joda.time.Interval interval12 = property8.toInterval();
        org.joda.time.LocalTime localTime13 = property8.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime14 = localTime13.toDateTimeToday();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-495773L) + "'", long11 == (-495773L));
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test512");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (short) 10, 0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTimeToday(dateTimeZone3);
        int int5 = localTime2.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test513");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        java.util.Locale locale9 = null;
        int int10 = property8.getMaximumTextLength(locale9);
        java.util.Locale locale11 = null;
        java.lang.String str12 = property8.getAsText(locale11);
        org.joda.time.LocalTime localTime13 = property8.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField14 = property8.getField();
        org.joda.time.LocalTime localTime16 = property8.addCopy((long) 59);
        org.joda.time.LocalTime localTime17 = property8.roundHalfCeilingCopy();
        long long18 = property8.remainder();
        org.joda.time.LocalTime localTime19 = property8.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology20 = localTime19.getChronology();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.now(chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime24 = localTime21.withPeriodAdded(readablePeriod22, 28799999);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "7" + "'", str12, "7");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3599999L + "'", long18 == 3599999L);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test514");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        long long10 = property8.getMillis();
        org.joda.time.LocalTime localTime11 = property8.roundHalfEvenCopy();
        java.lang.String str12 = property8.getName();
        int int13 = property8.getMinimumValueOverall();
        org.joda.time.LocalTime localTime15 = property8.addNoWrapToCopy(5);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 28799999L + "'", long10 == 28799999L);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hourOfDay" + "'", str12, "hourOfDay");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test515");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (short) -1, chronology3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime7 = localTime4.withPeriodAdded(readablePeriod5, 0);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime4.plus(readablePeriod8);
        org.joda.time.LocalTime.Property property10 = localTime4.hourOfDay();
        org.joda.time.LocalTime localTime11 = property10.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (short) -1, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTimeToday(dateTimeZone15);
        long long17 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        int int18 = property10.getLeapAmount();
        org.joda.time.Chronology chronology19 = property10.getChronology();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) '4', chronology19);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) 1, chronology19);
        org.joda.time.LocalTime.Property property22 = localTime21.hourOfDay();
        int int23 = property22.getMinimumValueOverall();
        int int24 = property22.getMaximumValue();
        org.joda.time.LocalTime localTime25 = property22.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-495761L) + "'", long17 == (-495761L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23 + "'", int24 == 23);
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test516");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property8.getDifferenceAsLong(readableInstant10);
        int int12 = property8.get();
        org.joda.time.LocalTime localTime14 = property8.addWrapFieldToCopy(999);
        org.joda.time.LocalTime localTime16 = property8.addWrapFieldToCopy(0);
        org.joda.time.LocalTime localTime17 = property8.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField18 = property8.getField();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) -1, chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime24 = localTime21.withPeriodAdded(readablePeriod22, 0);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalTime localTime26 = localTime21.plus(readablePeriod25);
        org.joda.time.LocalTime.Property property27 = localTime21.hourOfDay();
        org.joda.time.LocalTime localTime28 = property27.withMinimumValue();
        long long29 = property27.remainder();
        org.joda.time.LocalTime localTime31 = property27.addWrapFieldToCopy((-1));
        int int32 = localTime31.getSecondOfMinute();
        org.joda.time.LocalTime localTime34 = localTime31.withSecondOfMinute(58);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localTime31.toDateTimeToday(dateTimeZone35);
        int int37 = property8.getDifference((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-495773L) + "'", long11 == (-495773L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 3599999L + "'", long29 == 3599999L);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 59 + "'", int32 == 59);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-495760) + "'", int37 == (-495760));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test517");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property8.getDifferenceAsLong(readableInstant10);
        int int12 = property8.get();
        java.lang.String str13 = property8.getAsString();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime16.plus(readablePeriod20);
        org.joda.time.LocalTime.Property property22 = localTime16.hourOfDay();
        java.util.Locale locale23 = null;
        int int24 = property22.getMaximumTextLength(locale23);
        java.util.Locale locale25 = null;
        java.lang.String str26 = property22.getAsText(locale25);
        org.joda.time.LocalTime localTime27 = property22.withMaximumValue();
        org.joda.time.DateTime dateTime28 = localTime27.toDateTimeToday();
        int int29 = property8.compareTo((org.joda.time.ReadableInstant) dateTime28);
        int int30 = property8.get();
        java.util.Locale locale31 = null;
        java.lang.String str32 = property8.getAsShortText(locale31);
        org.joda.time.LocalTime localTime33 = property8.roundHalfFloorCopy();
        java.util.Locale locale34 = null;
        java.lang.String str35 = property8.getAsText(locale34);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-495773L) + "'", long11 == (-495773L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7" + "'", str13, "7");
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "7" + "'", str26, "7");
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "7" + "'", str32, "7");
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "7" + "'", str35, "7");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test518");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTimeToday(dateTimeZone3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime10 = localTime7.withPeriodAdded(readablePeriod8, 0);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime7.plus(readablePeriod11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) -1, chronology14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime18 = localTime15.withPeriodAdded(readablePeriod16, 0);
        int int19 = localTime12.compareTo((org.joda.time.ReadablePartial) localTime18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(chronology20);
        int int22 = localTime21.getSecondOfMinute();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (short) -1, chronology24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime28 = localTime25.withPeriodAdded(readablePeriod26, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = localTime25.getFieldType((int) (short) 1);
        int int31 = localTime21.get(dateTimeFieldType30);
        boolean boolean32 = localTime18.isSupported(dateTimeFieldType30);
        int int33 = localTime2.get(dateTimeFieldType30);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) (short) -1, chronology35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalTime localTime39 = localTime36.withPeriodAdded(readablePeriod37, 0);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalTime localTime41 = localTime36.plus(readablePeriod40);
        long long42 = localTime41.getLocalMillis();
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(1L);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (short) -1, chronology46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalTime localTime50 = localTime47.withPeriodAdded(readablePeriod48, 0);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalTime localTime52 = localTime47.plus(readablePeriod51);
        org.joda.time.LocalTime.Property property53 = localTime47.hourOfDay();
        boolean boolean54 = localTime44.isBefore((org.joda.time.ReadablePartial) localTime47);
        boolean boolean55 = localTime41.equals((java.lang.Object) localTime44);
        org.joda.time.LocalTime.Property property56 = localTime44.millisOfSecond();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime((long) (short) -1, chronology58);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = localTime59.toDateTimeToday(dateTimeZone60);
        int int62 = localTime44.compareTo((org.joda.time.ReadablePartial) localTime59);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime(chronology63);
        int int65 = localTime64.getSecondOfMinute();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime((long) (short) -1, chronology67);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalTime localTime71 = localTime68.withPeriodAdded(readablePeriod69, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = localTime68.getFieldType((int) (short) 1);
        int int74 = localTime64.get(dateTimeFieldType73);
        org.joda.time.LocalTime localTime76 = localTime59.withField(dateTimeFieldType73, 4);
        int int77 = localTime2.get(dateTimeFieldType73);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.LocalTime localTime80 = new org.joda.time.LocalTime((long) (short) -1, chronology79);
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        org.joda.time.LocalTime localTime83 = localTime80.withPeriodAdded(readablePeriod81, 0);
        org.joda.time.ReadablePeriod readablePeriod84 = null;
        org.joda.time.LocalTime localTime85 = localTime80.plus(readablePeriod84);
        org.joda.time.LocalTime.Property property86 = localTime80.hourOfDay();
        org.joda.time.LocalTime localTime87 = property86.withMinimumValue();
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.LocalTime localTime90 = new org.joda.time.LocalTime((long) (short) -1, chronology89);
        org.joda.time.DateTimeZone dateTimeZone91 = null;
        org.joda.time.DateTime dateTime92 = localTime90.toDateTimeToday(dateTimeZone91);
        long long93 = property86.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime92);
        int int94 = property86.getLeapAmount();
        java.lang.String str95 = property86.getName();
        org.joda.time.Chronology chronology96 = property86.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime97 = new org.joda.time.LocalTime((java.lang.Object) dateTimeFieldType73, chronology96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
// flaky "3) test518(org.joda.time.LocalTimeRegressionTest1)":         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 37 + "'", int31 == 37);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 59 + "'", int33 == 59);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 28799999L + "'", long42 == 28799999L);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
// flaky "1) test518(org.joda.time.LocalTimeRegressionTest1)":         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 12 + "'", int65 == 12);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 37 + "'", int74 == 37);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 59 + "'", int77 == 59);
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertNotNull(localTime85);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNotNull(localTime87);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + (-495761L) + "'", long93 == (-495761L));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "hourOfDay" + "'", str95, "hourOfDay");
        org.junit.Assert.assertNotNull(chronology96);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test519");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(20, 74211477, (-495760), 37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 74211477 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test520");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        java.lang.String str10 = property8.getName();
        int int11 = property8.get();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (short) -1, chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime17 = localTime14.withPeriodAdded(readablePeriod15, 0);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime19 = localTime14.plus(readablePeriod18);
        long long20 = localTime19.getLocalMillis();
        org.joda.time.LocalTime.Property property21 = localTime19.hourOfDay();
        int int22 = property8.compareTo((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.Interval interval23 = property8.toInterval();
        org.joda.time.LocalTime localTime24 = property8.withMaximumValue();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (short) -1, chronology26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalTime localTime30 = localTime27.withPeriodAdded(readablePeriod28, 0);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalTime localTime32 = localTime27.plus(readablePeriod31);
        org.joda.time.LocalTime.Property property33 = localTime27.hourOfDay();
        org.joda.time.LocalTime localTime34 = property33.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant35 = null;
        long long36 = property33.getDifferenceAsLong(readableInstant35);
        java.util.Locale locale37 = null;
        int int38 = property33.getMaximumShortTextLength(locale37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) (short) -1, chronology40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalTime localTime44 = localTime41.withPeriodAdded(readablePeriod42, 0);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalTime localTime46 = localTime41.plus(readablePeriod45);
        org.joda.time.DateTime dateTime47 = localTime46.toDateTimeToday();
        int int48 = property33.getDifference((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((long) (short) -1, chronology50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalTime localTime54 = localTime51.withPeriodAdded(readablePeriod52, 0);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalTime localTime56 = localTime51.plus(readablePeriod55);
        org.joda.time.LocalTime.Property property57 = localTime51.hourOfDay();
        org.joda.time.LocalTime localTime58 = property57.withMinimumValue();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime((long) (short) -1, chronology60);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = localTime61.toDateTimeToday(dateTimeZone62);
        long long64 = property57.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime63);
        int int65 = property33.compareTo((org.joda.time.ReadableInstant) dateTime63);
        int int66 = property8.getDifference((org.joda.time.ReadableInstant) dateTime63);
        java.lang.String str67 = property8.toString();
        int int68 = property8.getMinimumValue();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hourOfDay" + "'", str10, "hourOfDay");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 28799999L + "'", long20 == 28799999L);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-495773L) + "'", long36 == (-495773L));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-495761) + "'", int48 == (-495761));
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-495761L) + "'", long64 == (-495761L));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-495761) + "'", int66 == (-495761));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Property[hourOfDay]" + "'", str67, "Property[hourOfDay]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test521");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        long long10 = property8.remainder();
        java.lang.String str11 = property8.getAsString();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property8.getAsShortText(locale12);
        org.joda.time.LocalTime localTime15 = property8.setCopy(0);
        int int16 = localTime15.getMillisOfSecond();
        long long17 = localTime15.getLocalMillis();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3599999L + "'", long10 == 3599999L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7" + "'", str11, "7");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7" + "'", str13, "7");
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 999 + "'", int16 == 999);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3599999L + "'", long17 == 3599999L);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test522");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 54);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test523");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property8.getDifferenceAsLong(readableInstant10);
        int int12 = property8.get();
        java.lang.String str13 = property8.getAsString();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime16.plus(readablePeriod20);
        org.joda.time.LocalTime.Property property22 = localTime16.hourOfDay();
        java.util.Locale locale23 = null;
        int int24 = property22.getMaximumTextLength(locale23);
        java.util.Locale locale25 = null;
        java.lang.String str26 = property22.getAsText(locale25);
        org.joda.time.LocalTime localTime27 = property22.withMaximumValue();
        org.joda.time.DateTime dateTime28 = localTime27.toDateTimeToday();
        int int29 = property8.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.LocalTime localTime30 = property8.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-495773L) + "'", long11 == (-495773L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7" + "'", str13, "7");
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "7" + "'", str26, "7");
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(localTime30);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test524");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime10.withPeriodAdded(readablePeriod11, 0);
        int int14 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.LocalTime localTime16 = localTime13.plusMinutes(59);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(1L);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) -1, chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime24 = localTime21.withPeriodAdded(readablePeriod22, 0);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalTime localTime26 = localTime21.plus(readablePeriod25);
        org.joda.time.LocalTime.Property property27 = localTime21.hourOfDay();
        boolean boolean28 = localTime18.isBefore((org.joda.time.ReadablePartial) localTime21);
        boolean boolean29 = localTime16.equals((java.lang.Object) boolean28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) -1, chronology31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalTime localTime35 = localTime32.withPeriodAdded(readablePeriod33, 0);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalTime localTime37 = localTime32.plus(readablePeriod36);
        org.joda.time.LocalTime.Property property38 = localTime32.hourOfDay();
        org.joda.time.LocalTime localTime39 = property38.withMinimumValue();
        long long40 = property38.remainder();
        java.lang.String str41 = property38.getAsString();
        java.util.Locale locale42 = null;
        java.lang.String str43 = property38.getAsShortText(locale42);
        long long44 = property38.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property38.getFieldType();
        org.joda.time.LocalTime.Property property46 = localTime16.property(dateTimeFieldType45);
        org.joda.time.LocalTime localTime47 = property46.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime48 = property46.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 3599999L + "'", long40 == 3599999L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "7" + "'", str41, "7");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "7" + "'", str43, "7");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 28799999L + "'", long44 == 28799999L);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test525");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        long long8 = localTime7.getLocalMillis();
        org.joda.time.LocalTime.Property property9 = localTime7.hourOfDay();
        org.joda.time.DurationField durationField10 = property9.getDurationField();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (short) -1, chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime16 = localTime13.withPeriodAdded(readablePeriod14, 0);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime18 = localTime13.plus(readablePeriod17);
        org.joda.time.LocalTime.Property property19 = localTime13.hourOfDay();
        org.joda.time.LocalTime localTime20 = property19.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant21 = null;
        long long22 = property19.getDifferenceAsLong(readableInstant21);
        java.util.Locale locale23 = null;
        int int24 = property19.getMaximumShortTextLength(locale23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (short) -1, chronology26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalTime localTime30 = localTime27.withPeriodAdded(readablePeriod28, 0);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalTime localTime32 = localTime27.plus(readablePeriod31);
        org.joda.time.DateTime dateTime33 = localTime32.toDateTimeToday();
        int int34 = property19.getDifference((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((long) (short) -1, chronology36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalTime localTime40 = localTime37.withPeriodAdded(readablePeriod38, 0);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalTime localTime42 = localTime37.plus(readablePeriod41);
        org.joda.time.LocalTime.Property property43 = localTime37.hourOfDay();
        org.joda.time.LocalTime localTime44 = property43.withMinimumValue();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (short) -1, chronology46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = localTime47.toDateTimeToday(dateTimeZone48);
        long long50 = property43.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime49);
        int int51 = property19.compareTo((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime((long) (short) -1, chronology53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalTime localTime57 = localTime54.withPeriodAdded(readablePeriod55, 0);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalTime localTime59 = localTime54.plus(readablePeriod58);
        org.joda.time.LocalTime.Property property60 = localTime54.hourOfDay();
        org.joda.time.LocalTime localTime61 = property60.withMinimumValue();
        long long62 = property60.remainder();
        java.lang.String str63 = property60.getAsString();
        java.util.Locale locale64 = null;
        java.lang.String str65 = property60.getAsShortText(locale64);
        org.joda.time.LocalTime localTime67 = property60.setCopy(0);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime((long) (short) -1, chronology69);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalTime localTime73 = localTime70.withPeriodAdded(readablePeriod71, 0);
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.LocalTime localTime75 = localTime70.plus(readablePeriod74);
        org.joda.time.LocalTime.Property property76 = localTime70.hourOfDay();
        org.joda.time.LocalTime localTime77 = property76.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant78 = null;
        long long79 = property76.getDifferenceAsLong(readableInstant78);
        java.util.Locale locale80 = null;
        int int81 = property76.getMaximumShortTextLength(locale80);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.LocalTime localTime84 = new org.joda.time.LocalTime((long) (short) -1, chronology83);
        org.joda.time.ReadablePeriod readablePeriod85 = null;
        org.joda.time.LocalTime localTime87 = localTime84.withPeriodAdded(readablePeriod85, 0);
        org.joda.time.ReadablePeriod readablePeriod88 = null;
        org.joda.time.LocalTime localTime89 = localTime84.plus(readablePeriod88);
        org.joda.time.DateTime dateTime90 = localTime89.toDateTimeToday();
        int int91 = property76.getDifference((org.joda.time.ReadableInstant) dateTime90);
        int int92 = property60.compareTo((org.joda.time.ReadableInstant) dateTime90);
        int int93 = property19.compareTo((org.joda.time.ReadableInstant) dateTime90);
        long long94 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime90);
        java.lang.String str95 = property9.getAsShortText();
        org.joda.time.LocalTime localTime97 = property9.addWrapFieldToCopy((int) (byte) 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28799999L + "'", long8 == 28799999L);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-495773L) + "'", long22 == (-495773L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-495761) + "'", int34 == (-495761));
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-495761L) + "'", long50 == (-495761L));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 3599999L + "'", long62 == 3599999L);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "7" + "'", str63, "7");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "7" + "'", str65, "7");
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-495773L) + "'", long79 == (-495773L));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 2 + "'", int81 == 2);
        org.junit.Assert.assertNotNull(localTime87);
        org.junit.Assert.assertNotNull(localTime89);
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-495761) + "'", int91 == (-495761));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + (-495761L) + "'", long94 == (-495761L));
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "7" + "'", str95, "7");
        org.junit.Assert.assertNotNull(localTime97);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test526");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime10.withPeriodAdded(readablePeriod11, 0);
        int int14 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.LocalTime localTime16 = localTime13.plusMinutes(59);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(1L);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) -1, chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime24 = localTime21.withPeriodAdded(readablePeriod22, 0);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalTime localTime26 = localTime21.plus(readablePeriod25);
        org.joda.time.LocalTime.Property property27 = localTime21.hourOfDay();
        boolean boolean28 = localTime18.isBefore((org.joda.time.ReadablePartial) localTime21);
        boolean boolean29 = localTime16.equals((java.lang.Object) boolean28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime31 = localTime16.withHourOfDay(45);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 45 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test527");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property8.getDifferenceAsLong(readableInstant10);
        java.util.Locale locale12 = null;
        int int13 = property8.getMaximumShortTextLength(locale12);
        boolean boolean14 = property8.isLeap();
        org.joda.time.DurationField durationField15 = property8.getLeapDurationField();
        int int16 = property8.getMinimumValue();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-495773L) + "'", long11 == (-495773L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(durationField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test528");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        java.util.Locale locale9 = null;
        int int10 = property8.getMaximumTextLength(locale9);
        java.util.Locale locale11 = null;
        java.lang.String str12 = property8.getAsText(locale11);
        org.joda.time.LocalTime localTime13 = property8.withMaximumValue();
        org.joda.time.LocalTime localTime14 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.parse("07:59:59.999");
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) -1, chronology18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime22 = localTime19.withPeriodAdded(readablePeriod20, 0);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime24 = localTime19.plus(readablePeriod23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (short) -1, chronology26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalTime localTime30 = localTime27.withPeriodAdded(readablePeriod28, 0);
        int int31 = localTime24.compareTo((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.LocalTime localTime33 = localTime30.plusMinutes(59);
        org.joda.time.LocalTime localTime34 = localTime16.withFields((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.DateTime dateTime36 = localTime34.toDateTime(readableInstant35);
        int int37 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime34);
        org.joda.time.LocalTime localTime39 = localTime34.plusSeconds((-495760));
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "7" + "'", str12, "7");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(localTime39);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test529");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        long long10 = property8.remainder();
        java.lang.String str11 = property8.getAsString();
        org.joda.time.Interval interval12 = property8.toInterval();
        java.lang.String str13 = property8.getName();
        java.lang.String str14 = property8.getName();
        org.joda.time.LocalTime localTime15 = property8.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3599999L + "'", long10 == 3599999L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7" + "'", str11, "7");
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hourOfDay" + "'", str13, "hourOfDay");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hourOfDay" + "'", str14, "hourOfDay");
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test530");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime11 = property8.addCopy((-495761));
        java.lang.String str12 = property8.getAsShortText();
        int int13 = property8.get();
        java.lang.String str14 = property8.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property8.getFieldType();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "7" + "'", str12, "7");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "7" + "'", str14, "7");
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test531");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property8.getDifferenceAsLong(readableInstant10);
        int int12 = property8.get();
        java.lang.String str13 = property8.getAsString();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime16.plus(readablePeriod20);
        org.joda.time.LocalTime.Property property22 = localTime16.hourOfDay();
        java.util.Locale locale23 = null;
        int int24 = property22.getMaximumTextLength(locale23);
        java.util.Locale locale25 = null;
        java.lang.String str26 = property22.getAsText(locale25);
        org.joda.time.LocalTime localTime27 = property22.withMaximumValue();
        org.joda.time.DateTime dateTime28 = localTime27.toDateTimeToday();
        int int29 = property8.compareTo((org.joda.time.ReadableInstant) dateTime28);
        int int30 = property8.get();
        java.util.Locale locale31 = null;
        java.lang.String str32 = property8.getAsShortText(locale31);
        org.joda.time.LocalTime localTime33 = property8.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime34 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalTime.Property property35 = localTime34.hourOfDay();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-495773L) + "'", long11 == (-495773L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7" + "'", str13, "7");
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "7" + "'", str26, "7");
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "7" + "'", str32, "7");
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test532");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        long long10 = property8.getMillis();
        org.joda.time.LocalTime localTime11 = property8.roundHalfEvenCopy();
        java.lang.String str12 = property8.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property8.getFieldType();
        java.lang.String str14 = property8.getName();
        org.joda.time.LocalTime localTime15 = property8.roundFloorCopy();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 28799999L + "'", long10 == 28799999L);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hourOfDay" + "'", str12, "hourOfDay");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hourOfDay" + "'", str14, "hourOfDay");
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test533");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("59");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"59\": Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test534");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime11 = property8.addCopy((-495761));
        java.lang.String str12 = property8.getAsShortText();
        int int13 = property8.get();
        org.joda.time.LocalTime localTime15 = property8.addWrapFieldToCopy((-495761));
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localTime15.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField18 = localTime15.getField(28799991);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 28799991");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "7" + "'", str12, "7");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test535");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime10.withPeriodAdded(readablePeriod11, 0);
        int int14 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.LocalTime localTime16 = localTime13.plusMinutes(59);
        int int17 = localTime16.size();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(1L);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (short) -1, chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime25 = localTime22.withPeriodAdded(readablePeriod23, 0);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime27 = localTime22.plus(readablePeriod26);
        org.joda.time.LocalTime.Property property28 = localTime22.hourOfDay();
        boolean boolean29 = localTime19.isBefore((org.joda.time.ReadablePartial) localTime22);
        boolean boolean30 = localTime16.isEqual((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.LocalTime.Property property31 = localTime19.hourOfDay();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) (short) -1, chronology33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalTime localTime37 = localTime34.withPeriodAdded(readablePeriod35, 0);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalTime localTime39 = localTime34.plus(readablePeriod38);
        org.joda.time.LocalTime.Property property40 = localTime34.hourOfDay();
        org.joda.time.LocalTime localTime41 = property40.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant42 = null;
        long long43 = property40.getDifferenceAsLong(readableInstant42);
        int int44 = property40.get();
        org.joda.time.LocalTime localTime46 = property40.addWrapFieldToCopy(999);
        org.joda.time.LocalTime localTime48 = property40.addWrapFieldToCopy(0);
        org.joda.time.LocalTime localTime49 = property40.roundCeilingCopy();
        long long50 = localTime49.getLocalMillis();
        boolean boolean51 = localTime19.isBefore((org.joda.time.ReadablePartial) localTime49);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-495773L) + "'", long43 == (-495773L));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 7 + "'", int44 == 7);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 28800000L + "'", long50 == 28800000L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test536");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property8.getDifferenceAsLong(readableInstant10);
        java.util.Locale locale12 = null;
        int int13 = property8.getMaximumShortTextLength(locale12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime16.plus(readablePeriod20);
        org.joda.time.DateTime dateTime22 = localTime21.toDateTimeToday();
        int int23 = property8.getDifference((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology24 = property8.getChronology();
        int int25 = property8.getLeapAmount();
        java.util.Locale locale26 = null;
        int int27 = property8.getMaximumTextLength(locale26);
        org.joda.time.LocalTime localTime28 = property8.roundHalfFloorCopy();
        boolean boolean29 = property8.isLeap();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-495773L) + "'", long11 == (-495773L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-495761) + "'", int23 == (-495761));
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test537");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) -1, chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime11.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime16 = localTime11.plus(readablePeriod15);
        org.joda.time.LocalTime.Property property17 = localTime11.hourOfDay();
        org.joda.time.LocalTime localTime18 = property17.withMinimumValue();
        java.lang.String str19 = property17.getName();
        int int20 = property17.get();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) -1, chronology22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime23.withPeriodAdded(readablePeriod24, 0);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime28 = localTime23.plus(readablePeriod27);
        long long29 = localTime28.getLocalMillis();
        org.joda.time.LocalTime.Property property30 = localTime28.hourOfDay();
        int int31 = property17.compareTo((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.LocalTime localTime32 = localTime2.withFields((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.LocalTime localTime34 = localTime28.minusMillis(100);
        java.util.Locale locale36 = null;
        java.lang.String str37 = localTime34.toString("20:36:45.747", locale36);
        org.joda.time.Chronology chronology38 = localTime34.getChronology();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hourOfDay" + "'", str19, "hourOfDay");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 28799999L + "'", long29 == 28799999L);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "20:36:45.747" + "'", str37, "20:36:45.747");
        org.junit.Assert.assertNotNull(chronology38);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test538");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) -1, chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime11.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime16 = localTime11.plus(readablePeriod15);
        org.joda.time.LocalTime.Property property17 = localTime11.hourOfDay();
        org.joda.time.LocalTime localTime18 = property17.withMinimumValue();
        java.lang.String str19 = property17.getName();
        int int20 = property17.get();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) -1, chronology22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime23.withPeriodAdded(readablePeriod24, 0);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime28 = localTime23.plus(readablePeriod27);
        long long29 = localTime28.getLocalMillis();
        org.joda.time.LocalTime.Property property30 = localTime28.hourOfDay();
        int int31 = property17.compareTo((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.LocalTime localTime32 = localTime2.withFields((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.LocalTime localTime34 = localTime28.plusHours((int) ' ');
        org.joda.time.LocalTime.Property property35 = localTime28.secondOfMinute();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) (short) -1, chronology40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalTime localTime44 = localTime41.withPeriodAdded(readablePeriod42, 0);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalTime localTime46 = localTime41.plus(readablePeriod45);
        org.joda.time.LocalTime.Property property47 = localTime41.hourOfDay();
        org.joda.time.LocalTime localTime48 = property47.withMinimumValue();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((long) (short) -1, chronology50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localTime51.toDateTimeToday(dateTimeZone52);
        long long54 = property47.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime53);
        int int55 = property47.getLeapAmount();
        org.joda.time.Chronology chronology56 = property47.getChronology();
        org.joda.time.LocalTime localTime57 = org.joda.time.LocalTime.fromMillisOfDay((long) '4', chronology56);
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.fromMillisOfDay((long) 1, chronology56);
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(chronology56);
        org.joda.time.DateTimeField dateTimeField60 = localTime28.getField(1, chronology56);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hourOfDay" + "'", str19, "hourOfDay");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 28799999L + "'", long29 == 28799999L);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-495761L) + "'", long54 == (-495761L));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(dateTimeField60);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test539");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) -1, chronology2);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalTime localTime6 = localTime3.withPeriodAdded(readablePeriod4, 0);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime3.plus(readablePeriod7);
        org.joda.time.LocalTime.Property property9 = localTime3.hourOfDay();
        org.joda.time.LocalTime localTime10 = property9.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant11 = null;
        long long12 = property9.getDifferenceAsLong(readableInstant11);
        java.util.Locale locale13 = null;
        int int14 = property9.getMaximumShortTextLength(locale13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) -1, chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime20 = localTime17.withPeriodAdded(readablePeriod18, 0);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime17.plus(readablePeriod21);
        org.joda.time.DateTime dateTime23 = localTime22.toDateTimeToday();
        int int24 = property9.getDifference((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology25 = property9.getChronology();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) 59, chronology25);
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now(chronology25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) (short) -1, chronology29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalTime localTime33 = localTime30.withPeriodAdded(readablePeriod31, 0);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime35 = localTime30.plus(readablePeriod34);
        org.joda.time.LocalTime.Property property36 = localTime30.hourOfDay();
        org.joda.time.LocalTime localTime37 = property36.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant38 = null;
        long long39 = property36.getDifferenceAsLong(readableInstant38);
        int int40 = property36.get();
        java.lang.String str41 = property36.getAsString();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((long) (short) -1, chronology43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalTime localTime47 = localTime44.withPeriodAdded(readablePeriod45, 0);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalTime localTime49 = localTime44.plus(readablePeriod48);
        org.joda.time.LocalTime.Property property50 = localTime44.hourOfDay();
        java.util.Locale locale51 = null;
        int int52 = property50.getMaximumTextLength(locale51);
        java.util.Locale locale53 = null;
        java.lang.String str54 = property50.getAsText(locale53);
        org.joda.time.LocalTime localTime55 = property50.withMaximumValue();
        org.joda.time.DateTime dateTime56 = localTime55.toDateTimeToday();
        int int57 = property36.compareTo((org.joda.time.ReadableInstant) dateTime56);
        int int58 = property36.get();
        org.joda.time.LocalTime localTime60 = property36.addCopy(43);
        boolean boolean61 = localTime27.isEqual((org.joda.time.ReadablePartial) localTime60);
        org.joda.time.DurationFieldType durationFieldType62 = null;
        boolean boolean63 = localTime27.isSupported(durationFieldType62);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-495773L) + "'", long12 == (-495773L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-495761) + "'", int24 == (-495761));
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-495773L) + "'", long39 == (-495773L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 7 + "'", int40 == 7);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "7" + "'", str41, "7");
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "7" + "'", str54, "7");
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 7 + "'", int58 == 7);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test540");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        java.util.Locale locale9 = null;
        int int10 = property8.getMaximumTextLength(locale9);
        java.util.Locale locale11 = null;
        java.lang.String str12 = property8.getAsText(locale11);
        long long13 = property8.remainder();
        java.lang.String str14 = property8.toString();
        org.joda.time.LocalTime localTime15 = property8.roundHalfEvenCopy();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime17 = localTime15.minus(readablePeriod16);
        org.joda.time.DateTimeField dateTimeField19 = localTime15.getField((int) (byte) 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "7" + "'", str12, "7");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3599999L + "'", long13 == 3599999L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Property[hourOfDay]" + "'", str14, "Property[hourOfDay]");
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test541");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(39, 56, 7, 56);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test542");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfDay((int) (short) 100);
        java.lang.String str4 = localTime1.toString();
        org.junit.Assert.assertNotNull(localTime3);
// flaky "4) test542(org.joda.time.LocalTimeRegressionTest1)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "20:37:14.092" + "'", str4, "20:37:14.092");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test543");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        java.lang.String str10 = property8.getName();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (short) -1, chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime16 = localTime13.withPeriodAdded(readablePeriod14, 0);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime18 = localTime13.plus(readablePeriod17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) -1, chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime24 = localTime21.withPeriodAdded(readablePeriod22, 0);
        int int25 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) (short) -1, chronology27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalTime localTime31 = localTime28.withPeriodAdded(readablePeriod29, 0);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime33 = localTime28.plus(readablePeriod32);
        org.joda.time.LocalTime.Property property34 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime35 = property34.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant36 = null;
        long long37 = property34.getDifferenceAsLong(readableInstant36);
        java.util.Locale locale38 = null;
        int int39 = property34.getMaximumShortTextLength(locale38);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (short) -1, chronology41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalTime localTime45 = localTime42.withPeriodAdded(readablePeriod43, 0);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalTime localTime47 = localTime42.plus(readablePeriod46);
        org.joda.time.DateTime dateTime48 = localTime47.toDateTimeToday();
        int int49 = property34.getDifference((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime50 = localTime18.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.LocalTime localTime52 = localTime18.minusMinutes(0);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime((long) (short) -1, chronology54);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalTime localTime58 = localTime55.withPeriodAdded(readablePeriod56, 0);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalTime localTime60 = localTime55.plus(readablePeriod59);
        org.joda.time.LocalTime.Property property61 = localTime55.hourOfDay();
        org.joda.time.LocalTime localTime62 = property61.withMinimumValue();
        long long63 = property61.remainder();
        org.joda.time.LocalTime localTime65 = property61.addWrapFieldToCopy((-1));
        org.joda.time.DurationFieldType durationFieldType66 = null;
        boolean boolean67 = localTime65.isSupported(durationFieldType66);
        org.joda.time.LocalTime localTime68 = localTime18.withFields((org.joda.time.ReadablePartial) localTime65);
        boolean boolean69 = property8.equals((java.lang.Object) localTime68);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime(chronology70);
        org.joda.time.LocalTime localTime73 = localTime71.withMillisOfDay((int) (short) 100);
        boolean boolean75 = localTime73.equals((java.lang.Object) (byte) 1);
        org.joda.time.LocalTime localTime77 = localTime73.withSecondOfMinute(10);
        org.joda.time.LocalTime localTime79 = localTime77.plusMillis((int) '#');
        org.joda.time.LocalTime localTime80 = localTime68.withFields((org.joda.time.ReadablePartial) localTime77);
        org.joda.time.LocalTime localTime81 = new org.joda.time.LocalTime((java.lang.Object) localTime80);
        org.joda.time.ReadablePeriod readablePeriod82 = null;
        org.joda.time.LocalTime localTime83 = localTime80.minus(readablePeriod82);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hourOfDay" + "'", str10, "hourOfDay");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-495773L) + "'", long37 == (-495773L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-495761) + "'", int49 == (-495761));
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 3599999L + "'", long63 == 3599999L);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(localTime79);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(localTime83);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test544");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        long long8 = localTime7.getLocalMillis();
        org.joda.time.LocalTime.Property property9 = localTime7.hourOfDay();
        org.joda.time.LocalTime localTime11 = localTime7.plusHours(0);
        org.joda.time.LocalTime localTime13 = localTime7.withLocalMillis((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime13.withMillisOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28799999L + "'", long8 == 28799999L);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test545");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, chronology11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime12.toDateTimeToday(dateTimeZone13);
        long long15 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property8.remainder();
        org.joda.time.LocalTime localTime17 = property8.withMaximumValue();
        org.joda.time.LocalTime localTime19 = property8.addCopy((long) 57);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-495761L) + "'", long15 == (-495761L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3599999L + "'", long16 == 3599999L);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test546");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime4 = localTime1.withPeriodAdded(readablePeriod2, 100);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, chronology6);
        boolean boolean8 = localTime4.equals((java.lang.Object) chronology6);
        java.lang.String str9 = localTime4.toString();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime15 = localTime12.withPeriodAdded(readablePeriod13, 0);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime17 = localTime12.minus(readablePeriod16);
        org.joda.time.LocalTime localTime19 = localTime17.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(100L, dateTimeZone21);
        boolean boolean23 = localTime17.isEqual((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) -1, chronology25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime29 = localTime26.withPeriodAdded(readablePeriod27, 0);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalTime localTime31 = localTime26.plus(readablePeriod30);
        org.joda.time.LocalTime.Property property32 = localTime26.hourOfDay();
        org.joda.time.LocalTime localTime33 = property32.withMinimumValue();
        long long34 = property32.remainder();
        java.lang.String str35 = property32.getAsString();
        java.util.Locale locale36 = null;
        java.lang.String str37 = property32.getAsShortText(locale36);
        long long38 = property32.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property32.getFieldType();
        int int40 = localTime22.get(dateTimeFieldType39);
        org.joda.time.LocalTime.Property property41 = localTime4.property(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "5) test546(org.joda.time.LocalTimeRegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20:37:14.358" + "'", str9, "20:37:14.358");
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 3599999L + "'", long34 == 3599999L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "7" + "'", str35, "7");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "7" + "'", str37, "7");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 28799999L + "'", long38 == 28799999L);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test547");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime11 = property8.addCopy((-495761));
        int int12 = property8.getMinimumValue();
        org.joda.time.LocalTime localTime13 = property8.roundHalfFloorCopy();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) -1, chronology16);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime20 = localTime17.withPeriodAdded(readablePeriod18, 0);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime17.plus(readablePeriod21);
        org.joda.time.LocalTime.Property property23 = localTime17.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime17.withPeriodAdded(readablePeriod24, (int) (byte) 0);
        org.joda.time.LocalTime localTime28 = localTime17.withMillisOfDay(28800000);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = localTime13.getField((int) (byte) 0, chronology29);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test548");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime11 = property8.addCopy((-495761));
        java.lang.String str12 = property8.getAsShortText();
        org.joda.time.LocalTime localTime13 = property8.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField14 = property8.getDurationField();
        long long15 = property8.remainder();
        java.lang.String str16 = property8.getAsString();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "7" + "'", str12, "7");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3599999L + "'", long15 == 3599999L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "7" + "'", str16, "7");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test549");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property8.getDifferenceAsLong(readableInstant10);
        int int12 = property8.get();
        org.joda.time.LocalTime localTime14 = property8.addWrapFieldToCopy(999);
        org.joda.time.LocalTime localTime16 = property8.addWrapFieldToCopy(0);
        org.joda.time.LocalTime localTime17 = property8.roundCeilingCopy();
        int int18 = localTime17.getMillisOfDay();
        int int19 = localTime17.getHourOfDay();
        org.joda.time.Chronology chronology20 = localTime17.getChronology();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-495773L) + "'", long11 == (-495773L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 28800000 + "'", int18 == 28800000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test550");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property8.getDifferenceAsLong(readableInstant10);
        java.util.Locale locale12 = null;
        int int13 = property8.getMaximumShortTextLength(locale12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime16.plus(readablePeriod20);
        org.joda.time.DateTime dateTime22 = localTime21.toDateTimeToday();
        int int23 = property8.getDifference((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology24 = property8.getChronology();
        org.joda.time.LocalTime localTime25 = property8.withMinimumValue();
        int int26 = property8.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-495773L) + "'", long11 == (-495773L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-495761) + "'", int23 == (-495761));
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 23 + "'", int26 == 23);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test551");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property8.getDifferenceAsLong(readableInstant10);
        java.util.Locale locale12 = null;
        int int13 = property8.getMaximumShortTextLength(locale12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime16.plus(readablePeriod20);
        org.joda.time.DateTime dateTime22 = localTime21.toDateTimeToday();
        int int23 = property8.getDifference((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) -1, chronology25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime29 = localTime26.withPeriodAdded(readablePeriod27, 0);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalTime localTime31 = localTime26.plus(readablePeriod30);
        org.joda.time.LocalTime.Property property32 = localTime26.hourOfDay();
        org.joda.time.LocalTime localTime33 = property32.withMinimumValue();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) (short) -1, chronology35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localTime36.toDateTimeToday(dateTimeZone37);
        long long39 = property32.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime38);
        int int40 = property8.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalTime localTime42 = property8.addNoWrapToCopy(0);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localTime42.toDateTimeToday(dateTimeZone43);
        org.joda.time.LocalTime localTime46 = localTime42.minusHours(45);
        org.joda.time.DateTimeField[] dateTimeFieldArray47 = localTime46.getFields();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-495773L) + "'", long11 == (-495773L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-495761) + "'", int23 == (-495761));
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-495761L) + "'", long39 == (-495761L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldArray47);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test552");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 58, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localTime2.getFields();
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test553");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime10.withPeriodAdded(readablePeriod11, 0);
        int int14 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.LocalTime localTime16 = localTime13.plusMinutes(59);
        int int17 = localTime16.size();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(1L);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (short) -1, chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime25 = localTime22.withPeriodAdded(readablePeriod23, 0);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime27 = localTime22.plus(readablePeriod26);
        org.joda.time.LocalTime.Property property28 = localTime22.hourOfDay();
        boolean boolean29 = localTime19.isBefore((org.joda.time.ReadablePartial) localTime22);
        boolean boolean30 = localTime16.isEqual((org.joda.time.ReadablePartial) localTime19);
        int int31 = localTime16.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 58 + "'", int31 == 58);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test554");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime10.withPeriodAdded(readablePeriod11, 0);
        int int14 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField16 = localTime7.getField((-495768));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -495768");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test555");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime4 = localTime1.withPeriodAdded(readablePeriod2, 100);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, chronology6);
        boolean boolean8 = localTime4.equals((java.lang.Object) chronology6);
        org.joda.time.LocalTime localTime10 = localTime4.withSecondOfMinute((int) (short) 0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (short) -1, chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime17 = localTime14.withPeriodAdded(readablePeriod15, 0);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime19 = localTime14.plus(readablePeriod18);
        org.joda.time.LocalTime.Property property20 = localTime14.hourOfDay();
        org.joda.time.LocalTime localTime21 = property20.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant22 = null;
        long long23 = property20.getDifferenceAsLong(readableInstant22);
        java.util.Locale locale24 = null;
        int int25 = property20.getMaximumShortTextLength(locale24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) (short) -1, chronology27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalTime localTime31 = localTime28.withPeriodAdded(readablePeriod29, 0);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime33 = localTime28.plus(readablePeriod32);
        org.joda.time.DateTime dateTime34 = localTime33.toDateTimeToday();
        int int35 = property20.getDifference((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Chronology chronology36 = property20.getChronology();
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.now(chronology36);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) 10, chronology36);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((java.lang.Object) localTime4, chronology36);
        org.joda.time.LocalTime localTime41 = localTime4.withLocalMillis((long) (-29746139));
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-495773L) + "'", long23 == (-495773L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-495761) + "'", int35 == (-495761));
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime41);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test556");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime11 = property8.addCopy((-495761));
        org.joda.time.LocalTime localTime12 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property8.addNoWrapToCopy((int) (short) -1);
        org.joda.time.LocalTime localTime15 = property8.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime16 = property8.withMaximumValue();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test557");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        long long8 = localTime7.getLocalMillis();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(1L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (short) -1, chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime16 = localTime13.withPeriodAdded(readablePeriod14, 0);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime18 = localTime13.plus(readablePeriod17);
        org.joda.time.LocalTime.Property property19 = localTime13.hourOfDay();
        boolean boolean20 = localTime10.isBefore((org.joda.time.ReadablePartial) localTime13);
        boolean boolean21 = localTime7.equals((java.lang.Object) localTime10);
        org.joda.time.LocalTime.Property property22 = localTime10.millisOfSecond();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (short) -1, chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localTime25.toDateTimeToday(dateTimeZone26);
        int int28 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime25);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (short) -1, chronology30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime34 = localTime31.withPeriodAdded(readablePeriod32, 0);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalTime localTime36 = localTime31.plus(readablePeriod35);
        long long37 = localTime36.getLocalMillis();
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(1L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (short) -1, chronology41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalTime localTime45 = localTime42.withPeriodAdded(readablePeriod43, 0);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalTime localTime47 = localTime42.plus(readablePeriod46);
        org.joda.time.LocalTime.Property property48 = localTime42.hourOfDay();
        boolean boolean49 = localTime39.isBefore((org.joda.time.ReadablePartial) localTime42);
        boolean boolean50 = localTime36.equals((java.lang.Object) localTime39);
        org.joda.time.LocalTime.Property property51 = localTime39.millisOfSecond();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime((long) (short) -1, chronology53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = localTime54.toDateTimeToday(dateTimeZone55);
        int int57 = localTime39.compareTo((org.joda.time.ReadablePartial) localTime54);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(chronology58);
        int int60 = localTime59.getSecondOfMinute();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime((long) (short) -1, chronology62);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.LocalTime localTime66 = localTime63.withPeriodAdded(readablePeriod64, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = localTime63.getFieldType((int) (short) 1);
        int int69 = localTime59.get(dateTimeFieldType68);
        org.joda.time.LocalTime localTime71 = localTime54.withField(dateTimeFieldType68, 4);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.LocalTime localTime74 = new org.joda.time.LocalTime((long) (short) -1, chronology73);
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.LocalTime localTime77 = localTime74.withPeriodAdded(readablePeriod75, 0);
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.LocalTime localTime79 = localTime74.plus(readablePeriod78);
        org.joda.time.LocalTime.Property property80 = localTime74.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        org.joda.time.LocalTime localTime83 = localTime74.withPeriodAdded(readablePeriod81, (int) (byte) 0);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.LocalTime localTime86 = new org.joda.time.LocalTime((long) (short) -1, chronology85);
        org.joda.time.ReadablePeriod readablePeriod87 = null;
        org.joda.time.LocalTime localTime89 = localTime86.withPeriodAdded(readablePeriod87, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = localTime86.getFieldType((int) (short) 1);
        int int92 = localTime83.indexOf(dateTimeFieldType91);
        int int93 = localTime54.get(dateTimeFieldType91);
        int int94 = localTime25.indexOf(dateTimeFieldType91);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter95 = null;
        java.lang.String str96 = localTime25.toString(dateTimeFormatter95);
        org.joda.time.LocalTime.Property property97 = localTime25.minuteOfHour();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28799999L + "'", long8 == 28799999L);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 28799999L + "'", long37 == 28799999L);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
// flaky "6) test557(org.joda.time.LocalTimeRegressionTest1)":         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 14 + "'", int60 == 14);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 37 + "'", int69 == 37);
        org.junit.Assert.assertNotNull(localTime71);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(localTime79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertNotNull(localTime89);
        org.junit.Assert.assertNotNull(dateTimeFieldType91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 59 + "'", int93 == 59);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "07:59:59.999" + "'", str96, "07:59:59.999");
        org.junit.Assert.assertNotNull(property97);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test558");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property8.getDifferenceAsLong(readableInstant10);
        int int12 = property8.get();
        java.lang.String str13 = property8.getAsString();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime16.plus(readablePeriod20);
        org.joda.time.LocalTime.Property property22 = localTime16.hourOfDay();
        java.util.Locale locale23 = null;
        int int24 = property22.getMaximumTextLength(locale23);
        java.util.Locale locale25 = null;
        java.lang.String str26 = property22.getAsText(locale25);
        org.joda.time.LocalTime localTime27 = property22.withMaximumValue();
        org.joda.time.DateTime dateTime28 = localTime27.toDateTimeToday();
        int int29 = property8.compareTo((org.joda.time.ReadableInstant) dateTime28);
        int int30 = property8.get();
        java.util.Locale locale31 = null;
        java.lang.String str32 = property8.getAsShortText(locale31);
        org.joda.time.LocalTime localTime33 = property8.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime34 = property8.roundHalfCeilingCopy();
        java.util.Locale locale35 = null;
        int int36 = property8.getMaximumShortTextLength(locale35);
        org.joda.time.LocalTime localTime37 = property8.withMaximumValue();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-495773L) + "'", long11 == (-495773L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7" + "'", str13, "7");
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "7" + "'", str26, "7");
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "7" + "'", str32, "7");
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(localTime37);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test559");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalTime localTime5 = localTime3.withSecondOfMinute(34);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localTime5.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localTime5.getFieldTypes();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test560");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        long long10 = property8.remainder();
        java.lang.String str11 = property8.getAsString();
        org.joda.time.Interval interval12 = property8.toInterval();
        int int13 = property8.getMaximumValue();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3599999L + "'", long10 == 3599999L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7" + "'", str11, "7");
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 23 + "'", int13 == 23);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test561");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        long long8 = localTime7.getLocalMillis();
        org.joda.time.LocalTime.Property property9 = localTime7.hourOfDay();
        org.joda.time.LocalTime localTime11 = localTime7.plusHours(0);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime7.minus(readablePeriod12);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28799999L + "'", long8 == 28799999L);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test562");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property8.getDifferenceAsLong(readableInstant10);
        int int12 = property8.get();
        java.lang.String str13 = property8.getAsString();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime16.plus(readablePeriod20);
        org.joda.time.LocalTime.Property property22 = localTime16.hourOfDay();
        java.util.Locale locale23 = null;
        int int24 = property22.getMaximumTextLength(locale23);
        java.util.Locale locale25 = null;
        java.lang.String str26 = property22.getAsText(locale25);
        org.joda.time.LocalTime localTime27 = property22.withMaximumValue();
        org.joda.time.DateTime dateTime28 = localTime27.toDateTimeToday();
        int int29 = property8.compareTo((org.joda.time.ReadableInstant) dateTime28);
        int int30 = property8.get();
        java.util.Locale locale31 = null;
        java.lang.String str32 = property8.getAsShortText(locale31);
        org.joda.time.LocalTime localTime33 = property8.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime34 = property8.roundHalfCeilingCopy();
        java.lang.String str35 = property8.getAsShortText();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-495773L) + "'", long11 == (-495773L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7" + "'", str13, "7");
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "7" + "'", str26, "7");
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "7" + "'", str32, "7");
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "7" + "'", str35, "7");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test563");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime4 = localTime1.withPeriodAdded(readablePeriod2, 100);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(chronology5);
        org.joda.time.LocalTime localTime8 = localTime6.withMillisOfDay((int) (short) 100);
        boolean boolean10 = localTime8.equals((java.lang.Object) (byte) 1);
        org.joda.time.LocalTime localTime12 = localTime8.withSecondOfMinute(10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime8.toDateTimeToday(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localTime1.toDateTime((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) -1, chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime21 = localTime18.withPeriodAdded(readablePeriod19, 0);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime23 = localTime18.plus(readablePeriod22);
        long long24 = localTime23.getLocalMillis();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(1L);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) (short) -1, chronology28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalTime localTime32 = localTime29.withPeriodAdded(readablePeriod30, 0);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalTime localTime34 = localTime29.plus(readablePeriod33);
        org.joda.time.LocalTime.Property property35 = localTime29.hourOfDay();
        boolean boolean36 = localTime26.isBefore((org.joda.time.ReadablePartial) localTime29);
        boolean boolean37 = localTime23.equals((java.lang.Object) localTime26);
        org.joda.time.LocalTime.Property property38 = localTime26.millisOfSecond();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) (short) -1, chronology40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = localTime41.toDateTimeToday(dateTimeZone42);
        int int44 = localTime26.compareTo((org.joda.time.ReadablePartial) localTime41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(chronology45);
        int int47 = localTime46.getSecondOfMinute();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((long) (short) -1, chronology49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalTime localTime53 = localTime50.withPeriodAdded(readablePeriod51, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = localTime50.getFieldType((int) (short) 1);
        int int56 = localTime46.get(dateTimeFieldType55);
        org.joda.time.LocalTime localTime58 = localTime41.withField(dateTimeFieldType55, 4);
        boolean boolean59 = localTime1.isSupported(dateTimeFieldType55);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 28799999L + "'", long24 == 28799999L);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
// flaky "7) test563(org.joda.time.LocalTimeRegressionTest1)":         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 15 + "'", int47 == 15);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 37 + "'", int56 == 37);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test564");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        java.util.Locale locale9 = null;
        int int10 = property8.getMaximumTextLength(locale9);
        java.util.Locale locale11 = null;
        java.lang.String str12 = property8.getAsText(locale11);
        org.joda.time.LocalTime localTime13 = property8.withMaximumValue();
        org.joda.time.LocalTime localTime15 = localTime13.minusMinutes(999);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "7" + "'", str12, "7");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test565");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        long long10 = property8.remainder();
        java.lang.String str11 = property8.getAsString();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property8.getAsShortText(locale12);
        org.joda.time.LocalTime localTime15 = property8.setCopy(0);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) -1, chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalTime localTime21 = localTime18.withPeriodAdded(readablePeriod19, 0);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime23 = localTime18.plus(readablePeriod22);
        org.joda.time.LocalTime.Property property24 = localTime18.hourOfDay();
        org.joda.time.LocalTime localTime25 = property24.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant26 = null;
        long long27 = property24.getDifferenceAsLong(readableInstant26);
        java.util.Locale locale28 = null;
        int int29 = property24.getMaximumShortTextLength(locale28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) -1, chronology31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalTime localTime35 = localTime32.withPeriodAdded(readablePeriod33, 0);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalTime localTime37 = localTime32.plus(readablePeriod36);
        org.joda.time.DateTime dateTime38 = localTime37.toDateTimeToday();
        int int39 = property24.getDifference((org.joda.time.ReadableInstant) dateTime38);
        int int40 = property8.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((long) (short) -1, chronology42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime46 = localTime43.withPeriodAdded(readablePeriod44, 0);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalTime localTime48 = localTime43.plus(readablePeriod47);
        org.joda.time.DateTime dateTime49 = localTime48.toDateTimeToday();
        long long50 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime49);
        java.util.Locale locale51 = null;
        int int52 = property8.getMaximumTextLength(locale51);
        org.joda.time.LocalTime localTime53 = property8.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3599999L + "'", long10 == 3599999L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7" + "'", str11, "7");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7" + "'", str13, "7");
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-495773L) + "'", long27 == (-495773L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-495761) + "'", int39 == (-495761));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-495761L) + "'", long50 == (-495761L));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertNotNull(localTime53);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test566");
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(48, 43, 53999999, 13, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test567");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis(59);
        org.joda.time.LocalTime localTime6 = localTime2.minusHours(999);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (short) -1, chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime12 = localTime9.withPeriodAdded(readablePeriod10, 0);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime9.plus(readablePeriod13);
        long long15 = localTime14.getLocalMillis();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(1L);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) -1, chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime23 = localTime20.withPeriodAdded(readablePeriod21, 0);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime25 = localTime20.plus(readablePeriod24);
        org.joda.time.LocalTime.Property property26 = localTime20.hourOfDay();
        boolean boolean27 = localTime17.isBefore((org.joda.time.ReadablePartial) localTime20);
        boolean boolean28 = localTime14.equals((java.lang.Object) localTime17);
        org.joda.time.LocalTime.Property property29 = localTime17.millisOfSecond();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (short) -1, chronology31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localTime32.toDateTimeToday(dateTimeZone33);
        int int35 = localTime17.compareTo((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) (short) -1, chronology37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalTime localTime41 = localTime38.withPeriodAdded(readablePeriod39, 0);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalTime localTime43 = localTime38.plus(readablePeriod42);
        org.joda.time.LocalTime.Property property44 = localTime38.hourOfDay();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (short) -1, chronology46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalTime localTime50 = localTime47.withPeriodAdded(readablePeriod48, 0);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalTime localTime52 = localTime47.plus(readablePeriod51);
        org.joda.time.LocalTime.Property property53 = localTime47.hourOfDay();
        org.joda.time.LocalTime localTime54 = property53.withMinimumValue();
        java.lang.String str55 = property53.getName();
        int int56 = property53.get();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime((long) (short) -1, chronology58);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalTime localTime62 = localTime59.withPeriodAdded(readablePeriod60, 0);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        org.joda.time.LocalTime localTime64 = localTime59.plus(readablePeriod63);
        long long65 = localTime64.getLocalMillis();
        org.joda.time.LocalTime.Property property66 = localTime64.hourOfDay();
        int int67 = property53.compareTo((org.joda.time.ReadablePartial) localTime64);
        org.joda.time.LocalTime localTime68 = localTime38.withFields((org.joda.time.ReadablePartial) localTime64);
        org.joda.time.LocalTime localTime70 = localTime64.plusHours((int) ' ');
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.LocalTime localTime73 = new org.joda.time.LocalTime((long) (short) -1, chronology72);
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.LocalTime localTime76 = localTime73.withPeriodAdded(readablePeriod74, 0);
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        org.joda.time.LocalTime localTime78 = localTime73.plus(readablePeriod77);
        org.joda.time.LocalTime.Property property79 = localTime73.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.LocalTime localTime82 = localTime73.withPeriodAdded(readablePeriod80, (int) (byte) 0);
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.LocalTime localTime85 = new org.joda.time.LocalTime((long) (short) -1, chronology84);
        org.joda.time.ReadablePeriod readablePeriod86 = null;
        org.joda.time.LocalTime localTime88 = localTime85.withPeriodAdded(readablePeriod86, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType90 = localTime85.getFieldType((int) (short) 1);
        int int91 = localTime82.get(dateTimeFieldType90);
        org.joda.time.LocalTime localTime93 = localTime70.withField(dateTimeFieldType90, 39);
        boolean boolean94 = localTime32.isSupported(dateTimeFieldType90);
        boolean boolean95 = localTime6.isSupported(dateTimeFieldType90);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 28799999L + "'", long15 == 28799999L);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hourOfDay" + "'", str55, "hourOfDay");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 7 + "'", int56 == 7);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 28799999L + "'", long65 == 28799999L);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertNotNull(localTime82);
        org.junit.Assert.assertNotNull(localTime88);
        org.junit.Assert.assertNotNull(dateTimeFieldType90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 59 + "'", int91 == 59);
        org.junit.Assert.assertNotNull(localTime93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test568");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) -1, chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime11.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime16 = localTime11.plus(readablePeriod15);
        org.joda.time.LocalTime.Property property17 = localTime11.hourOfDay();
        org.joda.time.LocalTime localTime18 = property17.withMinimumValue();
        java.lang.String str19 = property17.getName();
        int int20 = property17.get();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) -1, chronology22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime23.withPeriodAdded(readablePeriod24, 0);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime28 = localTime23.plus(readablePeriod27);
        long long29 = localTime28.getLocalMillis();
        org.joda.time.LocalTime.Property property30 = localTime28.hourOfDay();
        int int31 = property17.compareTo((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.LocalTime localTime32 = localTime2.withFields((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.LocalTime localTime34 = localTime28.minusMillis(100);
        org.joda.time.LocalTime localTime36 = localTime28.plusSeconds((int) (short) 0);
        int int37 = localTime28.getHourOfDay();
        org.joda.time.LocalTime localTime39 = localTime28.plusMinutes(53999999);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hourOfDay" + "'", str19, "hourOfDay");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 28799999L + "'", long29 == 28799999L);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 7 + "'", int37 == 7);
        org.junit.Assert.assertNotNull(localTime39);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test569");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime10.withPeriodAdded(readablePeriod11, 0);
        int int14 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.LocalTime localTime16 = localTime13.plusMinutes(59);
        int int17 = localTime16.size();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(1L);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (short) -1, chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime25 = localTime22.withPeriodAdded(readablePeriod23, 0);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime27 = localTime22.plus(readablePeriod26);
        org.joda.time.LocalTime.Property property28 = localTime22.hourOfDay();
        boolean boolean29 = localTime19.isBefore((org.joda.time.ReadablePartial) localTime22);
        boolean boolean30 = localTime16.isEqual((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.LocalTime.Property property31 = localTime19.hourOfDay();
        org.joda.time.LocalTime localTime33 = localTime19.plusHours(45);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray34 = localTime33.getFieldTypes();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray34);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test570");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        long long8 = localTime7.getLocalMillis();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(1L);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (short) -1, chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime16 = localTime13.withPeriodAdded(readablePeriod14, 0);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime18 = localTime13.plus(readablePeriod17);
        org.joda.time.LocalTime.Property property19 = localTime13.hourOfDay();
        boolean boolean20 = localTime10.isBefore((org.joda.time.ReadablePartial) localTime13);
        boolean boolean21 = localTime7.equals((java.lang.Object) localTime10);
        int int22 = localTime7.getMillisOfDay();
        long long23 = localTime7.getLocalMillis();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) -1, chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localTime26.toDateTimeToday(dateTimeZone27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (short) -1, chronology30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime34 = localTime31.withPeriodAdded(readablePeriod32, 0);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalTime localTime36 = localTime31.plus(readablePeriod35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((long) (short) -1, chronology38);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalTime localTime42 = localTime39.withPeriodAdded(readablePeriod40, 0);
        int int43 = localTime36.compareTo((org.joda.time.ReadablePartial) localTime42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(chronology44);
        int int46 = localTime45.getSecondOfMinute();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((long) (short) -1, chronology48);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalTime localTime52 = localTime49.withPeriodAdded(readablePeriod50, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = localTime49.getFieldType((int) (short) 1);
        int int55 = localTime45.get(dateTimeFieldType54);
        boolean boolean56 = localTime42.isSupported(dateTimeFieldType54);
        int int57 = localTime26.get(dateTimeFieldType54);
        int int58 = localTime7.get(dateTimeFieldType54);
        org.joda.time.LocalTime localTime60 = localTime7.minusMillis((int) (short) 0);
        int int61 = localTime7.getSecondOfMinute();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28799999L + "'", long8 == 28799999L);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 28799999 + "'", int22 == 28799999);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 28799999L + "'", long23 == 28799999L);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
// flaky "8) test570(org.joda.time.LocalTimeRegressionTest1)":         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 15 + "'", int46 == 15);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 37 + "'", int55 == 37);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 59 + "'", int57 == 59);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 59 + "'", int58 == 59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 59 + "'", int61 == 59);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test571");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getSecondOfMinute();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (short) -1, chronology4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime8 = localTime5.withPeriodAdded(readablePeriod6, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = localTime5.getFieldType((int) (short) 1);
        int int11 = localTime1.get(dateTimeFieldType10);
        org.joda.time.LocalTime localTime13 = localTime1.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalTime localTime15 = localTime1.withMillisOfSecond(0);
// flaky "9) test571(org.joda.time.LocalTimeRegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test572");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        java.lang.String str10 = property8.getName();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (short) -1, chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime16 = localTime13.withPeriodAdded(readablePeriod14, 0);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime18 = localTime13.plus(readablePeriod17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) -1, chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime24 = localTime21.withPeriodAdded(readablePeriod22, 0);
        int int25 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) (short) -1, chronology27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalTime localTime31 = localTime28.withPeriodAdded(readablePeriod29, 0);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime33 = localTime28.plus(readablePeriod32);
        org.joda.time.LocalTime.Property property34 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime35 = property34.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant36 = null;
        long long37 = property34.getDifferenceAsLong(readableInstant36);
        java.util.Locale locale38 = null;
        int int39 = property34.getMaximumShortTextLength(locale38);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (short) -1, chronology41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalTime localTime45 = localTime42.withPeriodAdded(readablePeriod43, 0);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalTime localTime47 = localTime42.plus(readablePeriod46);
        org.joda.time.DateTime dateTime48 = localTime47.toDateTimeToday();
        int int49 = property34.getDifference((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime50 = localTime18.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.LocalTime localTime52 = localTime18.minusMinutes(0);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime((long) (short) -1, chronology54);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalTime localTime58 = localTime55.withPeriodAdded(readablePeriod56, 0);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalTime localTime60 = localTime55.plus(readablePeriod59);
        org.joda.time.LocalTime.Property property61 = localTime55.hourOfDay();
        org.joda.time.LocalTime localTime62 = property61.withMinimumValue();
        long long63 = property61.remainder();
        org.joda.time.LocalTime localTime65 = property61.addWrapFieldToCopy((-1));
        org.joda.time.DurationFieldType durationFieldType66 = null;
        boolean boolean67 = localTime65.isSupported(durationFieldType66);
        org.joda.time.LocalTime localTime68 = localTime18.withFields((org.joda.time.ReadablePartial) localTime65);
        boolean boolean69 = property8.equals((java.lang.Object) localTime68);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime(chronology70);
        org.joda.time.LocalTime localTime73 = localTime71.withMillisOfDay((int) (short) 100);
        boolean boolean75 = localTime73.equals((java.lang.Object) (byte) 1);
        org.joda.time.LocalTime localTime77 = localTime73.withSecondOfMinute(10);
        org.joda.time.LocalTime localTime79 = localTime77.plusMillis((int) '#');
        org.joda.time.LocalTime localTime80 = localTime68.withFields((org.joda.time.ReadablePartial) localTime77);
        org.joda.time.Chronology chronology81 = localTime77.getChronology();
        org.joda.time.LocalTime localTime82 = org.joda.time.LocalTime.now(chronology81);
        org.joda.time.LocalTime localTime84 = localTime82.plusHours(39);
        int int85 = localTime82.getHourOfDay();
        org.joda.time.LocalTime.Property property86 = localTime82.hourOfDay();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hourOfDay" + "'", str10, "hourOfDay");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-495773L) + "'", long37 == (-495773L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-495761) + "'", int49 == (-495761));
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 3599999L + "'", long63 == 3599999L);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(localTime79);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertNotNull(localTime82);
        org.junit.Assert.assertNotNull(localTime84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 13 + "'", int85 == 13);
        org.junit.Assert.assertNotNull(property86);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test573");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, chronology9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime10.withPeriodAdded(readablePeriod11, 0);
        int int14 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.LocalTime localTime16 = localTime13.plusMinutes(59);
        int int17 = localTime16.size();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localTime16.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test574");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property8.getDifferenceAsLong(readableInstant10);
        java.util.Locale locale12 = null;
        int int13 = property8.getMaximumShortTextLength(locale12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime16.plus(readablePeriod20);
        org.joda.time.DateTime dateTime22 = localTime21.toDateTimeToday();
        int int23 = property8.getDifference((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Chronology chronology24 = property8.getChronology();
        boolean boolean26 = property8.equals((java.lang.Object) "Property[hourOfDay]");
        int int27 = property8.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-495773L) + "'", long11 == (-495773L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-495761) + "'", int23 == (-495761));
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test575");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getSecondOfMinute();
        int[] intArray3 = localTime1.getValues();
// flaky "10) test575(org.joda.time.LocalTimeRegressionTest1)":         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(intArray3);
// flaky "2) test575(org.joda.time.LocalTimeRegressionTest1)":         org.junit.Assert.assertArrayEquals(intArray3, new int[] { 20, 37, 15, 897 });
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test576");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        long long10 = localTime9.getLocalMillis();
        org.joda.time.Chronology chronology11 = localTime9.getChronology();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (short) -1, chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime17 = localTime14.withPeriodAdded(readablePeriod15, 0);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime19 = localTime14.plus(readablePeriod18);
        org.joda.time.LocalTime.Property property20 = localTime14.hourOfDay();
        org.joda.time.LocalTime localTime21 = property20.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant22 = null;
        long long23 = property20.getDifferenceAsLong(readableInstant22);
        java.util.Locale locale24 = null;
        int int25 = property20.getMaximumShortTextLength(locale24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) (short) -1, chronology27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalTime localTime31 = localTime28.withPeriodAdded(readablePeriod29, 0);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime33 = localTime28.plus(readablePeriod32);
        org.joda.time.DateTime dateTime34 = localTime33.toDateTimeToday();
        int int35 = property20.getDifference((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Chronology chronology36 = property20.getChronology();
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.now(chronology36);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(chronology36);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((java.lang.Object) localTime9, chronology36);
        org.joda.time.LocalTime localTime40 = org.joda.time.LocalTime.now(chronology36);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3599999L + "'", long10 == 3599999L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-495773L) + "'", long23 == (-495773L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-495761) + "'", int35 == (-495761));
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime40);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test577");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        java.lang.String str10 = property8.getName();
        int int11 = property8.get();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (short) -1, chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime17 = localTime14.withPeriodAdded(readablePeriod15, 0);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime19 = localTime14.plus(readablePeriod18);
        long long20 = localTime19.getLocalMillis();
        org.joda.time.LocalTime.Property property21 = localTime19.hourOfDay();
        int int22 = property8.compareTo((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.Interval interval23 = property8.toInterval();
        org.joda.time.LocalTime localTime24 = property8.withMaximumValue();
        org.joda.time.LocalTime localTime25 = property8.withMinimumValue();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hourOfDay" + "'", str10, "hourOfDay");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 28799999L + "'", long20 == 28799999L);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test578");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 28);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (short) -1, chronology3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime7 = localTime4.withPeriodAdded(readablePeriod5, 0);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime4.plus(readablePeriod8);
        org.joda.time.LocalTime.Property property10 = localTime4.hourOfDay();
        org.joda.time.LocalTime localTime11 = property10.withMinimumValue();
        org.joda.time.ReadableInstant readableInstant12 = null;
        long long13 = property10.getDifferenceAsLong(readableInstant12);
        int int14 = property10.get();
        org.joda.time.LocalTime localTime16 = property10.addWrapFieldToCopy(999);
        org.joda.time.LocalTime localTime18 = property10.addWrapFieldToCopy(0);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) -1, chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localTime21.toDateTimeToday(dateTimeZone22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) -1, chronology25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime29 = localTime26.withPeriodAdded(readablePeriod27, 0);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalTime localTime31 = localTime26.plus(readablePeriod30);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) (short) -1, chronology33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalTime localTime37 = localTime34.withPeriodAdded(readablePeriod35, 0);
        int int38 = localTime31.compareTo((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(chronology39);
        int int41 = localTime40.getSecondOfMinute();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((long) (short) -1, chronology43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalTime localTime47 = localTime44.withPeriodAdded(readablePeriod45, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = localTime44.getFieldType((int) (short) 1);
        int int50 = localTime40.get(dateTimeFieldType49);
        boolean boolean51 = localTime37.isSupported(dateTimeFieldType49);
        int int52 = localTime21.get(dateTimeFieldType49);
        boolean boolean53 = localTime18.isSupported(dateTimeFieldType49);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime55 = localTime1.withField(dateTimeFieldType49, (-495768));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -495768 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-495773L) + "'", long13 == (-495773L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
// flaky "11) test578(org.joda.time.LocalTimeRegressionTest1)":         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 16 + "'", int41 == 16);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 37 + "'", int50 == 37);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 59 + "'", int52 == 59);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test579");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime11 = property8.addCopy((-495761));
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime11.withPeriodAdded(readablePeriod12, 28799999);
        org.joda.time.DateTime dateTime15 = localTime11.toDateTimeToday();
        int int16 = localTime11.size();
        int int17 = localTime11.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 59 + "'", int17 == 59);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test580");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime5 = localTime2.withPeriodAdded(readablePeriod3, 0);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime2.plus(readablePeriod6);
        org.joda.time.LocalTime.Property property8 = localTime2.hourOfDay();
        int int9 = property8.getMinimumValue();
        org.joda.time.DurationField durationField10 = property8.getLeapDurationField();
        java.lang.String str11 = property8.getAsString();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7" + "'", str11, "7");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LocalTimeRegressionTest1.test581");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(1L);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (short) -1, chronology3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime7 = localTime4.withPeriodAdded(readablePeriod5, 0);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime4.plus(readablePeriod8);
        org.joda.time.LocalTime.Property property10 = localTime4.hourOfDay();
        boolean boolean11 = localTime1.isBefore((org.joda.time.ReadablePartial) localTime4);
        int int12 = localTime1.size();
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }
}
