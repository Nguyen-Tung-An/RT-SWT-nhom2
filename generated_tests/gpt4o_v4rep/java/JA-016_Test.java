package com.google.gson.typeadapters;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UtcDateTypeAdapterTest {

    @Test
    public void testFormatWithMillisAndUTC() throws Exception {
        Method m = UtcDateTypeAdapter.class.getDeclaredMethod("format", Date.class, boolean.class, TimeZone.class);
        m.setAccessible(true);
        
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        TimeZone tz = TimeZone.getTimeZone("UTC");
        String result = (String) m.invoke(null, date, true, tz);
        
        assertEquals("2023-10-01T12:30:45.000Z", result);
    }

    @Test
    public void testFormatWithoutMillisAndUTC() throws Exception {
        Method m = UtcDateTypeAdapter.class.getDeclaredMethod("format", Date.class, boolean.class, TimeZone.class);
        m.setAccessible(true);
        
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        TimeZone tz = TimeZone.getTimeZone("UTC");
        String result = (String) m.invoke(null, date, false, tz);
        
        assertEquals("2023-10-01T12:30:45Z", result);
    }

    @Test
    public void testFormatWithMillisAndNonUTC() throws Exception {
        Method m = UtcDateTypeAdapter.class.getDeclaredMethod("format", Date.class, boolean.class, TimeZone.class);
        m.setAccessible(true);
        
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        String result = (String) m.invoke(null, date, true, tz);
        
        assertEquals("2023-10-01T12:30:45.000+02:00", result);
    }

    @Test
    public void testFormatWithoutMillisAndNonUTC() throws Exception {
        Method m = UtcDateTypeAdapter.class.getDeclaredMethod("format", Date.class, boolean.class, TimeZone.class);
        m.setAccessible(true);
        
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        String result = (String) m.invoke(null, date, false, tz);
        
        assertEquals("2023-10-01T12:30:45+02:00", result);
    }

    @Test
    public void testFormatWithNegativeOffset() throws Exception {
        Method m = UtcDateTypeAdapter.class.getDeclaredMethod("format", Date.class, boolean.class, TimeZone.class);
        m.setAccessible(true);
        
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        TimeZone tz = TimeZone.getTimeZone("GMT-3");
        String result = (String) m.invoke(null, date, false, tz);
        
        assertEquals("2023-10-01T12:30:45-03:00", result);
    }

    @Test
    public void testFormatWithNullDate() throws Exception {
        Method m = UtcDateTypeAdapter.class.getDeclaredMethod("format", Date.class, boolean.class, TimeZone.class);
        m.setAccessible(true);
        
        TimeZone tz = TimeZone.getTimeZone("UTC");
        assertThrows(NullPointerException.class, () -> {
            try {
                m.invoke(null, null, true, tz);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }
}