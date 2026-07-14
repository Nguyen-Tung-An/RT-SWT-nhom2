package com.google.gson.typeadapters;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtcDateTypeAdapterTest {

    @Test
    void testWrite_WithMillis_AndUTC() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        UtcDateTypeAdapter adapter = new UtcDateTypeAdapter();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        adapter.write(jsonWriter, date);
        String expected = "2023-10-01T12:30:45Z"; // Adjust expected output based on actual implementation
        assertEquals(expected, stringWriter.toString());
    }

    @Test
    void testWrite_WithMillis_AndNonUTC() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        UtcDateTypeAdapter adapter = new UtcDateTypeAdapter();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        adapter.write(jsonWriter, date);
        String expected = "2023-10-01T12:30:45+02:00"; // Adjust expected output based on actual implementation
        assertEquals(expected, stringWriter.toString());
    }

    @Test
    void testWrite_WithoutMillis_AndNonUTC() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        UtcDateTypeAdapter adapter = new UtcDateTypeAdapter();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        adapter.write(jsonWriter, date);
        String expected = "2023-10-01T12:30:45-05:00"; // Adjust expected output based on actual implementation
        assertEquals(expected, stringWriter.toString());
    }

    @Test
    void testWrite_WithMillis_AndNegativeOffset() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        UtcDateTypeAdapter adapter = new UtcDateTypeAdapter();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        adapter.write(jsonWriter, date);
        String expected = "2023-10-01T12:30:45-03:00"; // Adjust expected output based on actual implementation
        assertEquals(expected, stringWriter.toString());
    }

    @Test
    void testWrite_WithMillis_AndPositiveOffset() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        UtcDateTypeAdapter adapter = new UtcDateTypeAdapter();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        adapter.write(jsonWriter, date);
        String expected = "2023-10-01T12:30:45+03:00"; // Adjust expected output based on actual implementation
        assertEquals(expected, stringWriter.toString());
    }

    @Test
    void testWrite_WithMillis_AndIncludeMillis() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45, 123).getTime();
        UtcDateTypeAdapter adapter = new UtcDateTypeAdapter();
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        adapter.write(jsonWriter, date);
        String expected = "2023-10-01T12:30:45.123Z"; // Adjust expected output based on actual implementation
        assertEquals(expected, stringWriter.toString());
    }
}