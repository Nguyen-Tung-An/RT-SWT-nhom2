package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.joda.time.chrono.GregorianChronology;

public class PropertyTest {
    private static final int HOUR_OF_DAY = 0;
    private static final int MINUTE_OF_HOUR = 1;
    private static final int SECOND_OF_MINUTE = 2;
    private static final int MILLIS_OF_SECOND = 3;

    private final Chronology chrono = GregorianChronology.getInstance();

    @Test
    void testGetField_HourOfDay() {
        DateTimeField field = getField(HOUR_OF_DAY, chrono);
        assertNotNull(field);
        assertEquals("hourOfDay", field.getName());
    }

    @Test
    void testGetField_MinuteOfHour() {
        DateTimeField field = getField(MINUTE_OF_HOUR, chrono);
        assertNotNull(field);
        assertEquals("minuteOfHour", field.getName());
    }

    @Test
    void testGetField_SecondOfMinute() {
        DateTimeField field = getField(SECOND_OF_MINUTE, chrono);
        assertNotNull(field);
        assertEquals("secondOfMinute", field.getName());
    }

    @Test
    void testGetField_MillisOfSecond() {
        DateTimeField field = getField(MILLIS_OF_SECOND, chrono);
        assertNotNull(field);
        assertEquals("millisOfSecond", field.getName());
    }

    @Test
    void testGetField_InvalidIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            getField(4, chrono);
        });
    }
}