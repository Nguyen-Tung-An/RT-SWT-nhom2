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
        String result = UtcDateTypeAdapter.format(date, true, tz);
        assertEquals("2023-10-01T12:30:45.000Z", result);
    }

    @Test
    void testFormat_WithoutMillis_AndUTC() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        TimeZone tz = TimeZone.getTimeZone("UTC");
        String result = UtcDateTypeAdapter.format(date, false, tz);
        assertEquals("2023-10-01T12:30:45Z", result);
    }

    @Test
    void testFormat_WithMillis_AndNegativeOffset() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        TimeZone tz = TimeZone.getTimeZone("GMT-05:00");
        String result = UtcDateTypeAdapter.format(date, true, tz);
        assertEquals("2023-10-01T12:30:45.000-05:00", result);
    }

    @Test
    void testFormat_WithMillis_AndPositiveOffset() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        TimeZone tz = TimeZone.getTimeZone("GMT+05:00");
        String result = UtcDateTypeAdapter.format(date, true, tz);
        assertEquals("2023-10-01T12:30:45.000+05:00", result);
    }

    @Test
    void testFormat_WithoutMillis_AndNegativeOffset() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        TimeZone tz = TimeZone.getTimeZone("GMT-05:00");
        String result = UtcDateTypeAdapter.format(date, false, tz);
        assertEquals("2023-10-01T12:30:45-05:00", result);
    }

    @Test
    void testFormat_WithoutMillis_AndPositiveOffset() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        TimeZone tz = TimeZone.getTimeZone("GMT+05:00");
        String result = UtcDateTypeAdapter.format(date, false, tz);
        assertEquals("2023-10-01T12:30:45+05:00", result);
    }
}