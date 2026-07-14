package com.google.gson.typeadapters;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtcDateTypeAdapterTest {

    @Test
    void testFormat_WithMillis_AndUTC() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        TimeZone tz = TimeZone.getTimeZone("UTC");
        String expected = "2023-10-01T12:30:45Z";
        String actual = UtcDateTypeAdapter.format(date, false, tz);
        assertEquals(expected, actual);
    }

    @Test
    void testFormat_WithMillis_AndNonUTC() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        String expected = "2023-10-01T12:30:45+02:00";
        String actual = UtcDateTypeAdapter.format(date, false, tz);
        assertEquals(expected, actual);
    }

    @Test
    void testFormat_WithoutMillis_AndNonUTC() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        TimeZone tz = TimeZone.getTimeZone("GMT-5");
        String expected = "2023-10-01T12:30:45-05:00";
        String actual = UtcDateTypeAdapter.format(date, false, tz);
        assertEquals(expected, actual);
    }

    @Test
    void testFormat_WithMillis_AndNegativeOffset() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        TimeZone tz = TimeZone.getTimeZone("GMT-3");
        String expected = "2023-10-01T12:30:45-03:00";
        String actual = UtcDateTypeAdapter.format(date, false, tz);
        assertEquals(expected, actual);
    }

    @Test
    void testFormat_WithMillis_AndPositiveOffset() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        TimeZone tz = TimeZone.getTimeZone("GMT+3");
        String expected = "2023-10-01T12:30:45+03:00";
        String actual = UtcDateTypeAdapter.format(date, false, tz);
        assertEquals(expected, actual);
    }

    @Test
    void testFormat_WithMillis_AndIncludeMillis() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45, 123).getTime();
        TimeZone tz = TimeZone.getTimeZone("UTC");
        String expected = "2023-10-01T12:30:45.123Z";
        String actual = UtcDateTypeAdapter.format(date, true, tz);
        assertEquals(expected, actual);
    }
}