package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.DateTimeField;

class LocalTimeTest {

    private final LocalTime instance = new LocalTime();

    @Test
    void testGetFieldHourOfDay() {
        DateTimeField field = instance.getField(LocalTime.HOUR_OF_DAY, ISOChronology.getInstance());
        assertNotNull(field);
        assertEquals("hourOfDay", field.getName());
    }

    @Test
    void testGetFieldMinuteOfHour() {
        DateTimeField field = instance.getField(LocalTime.MINUTE_OF_HOUR, ISOChronology.getInstance());
        assertNotNull(field);
        assertEquals("minuteOfHour", field.getName());
    }

    @Test
    void testGetFieldSecondOfMinute() {
        DateTimeField field = instance.getField(LocalTime.SECOND_OF_MINUTE, ISOChronology.getInstance());
        assertNotNull(field);
        assertEquals("secondOfMinute", field.getName());
    }

    @Test
    void testGetFieldMillisOfSecond() {
        DateTimeField field = instance.getField(LocalTime.MILLIS_OF_SECOND, ISOChronology.getInstance());
        assertNotNull(field);
        assertEquals("millisOfSecond", field.getName());
    }

    @Test
    void testGetFieldInvalidIndex() {
        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            instance.getField(-1, ISOChronology.getInstance());
        });
        assertEquals("Invalid index: -1", exception.getMessage());
    }

    @Test
    void testGetFieldInvalidIndexTooHigh() {
        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            instance.getField(4, ISOChronology.getInstance());
        });
        assertEquals("Invalid index: 4", exception.getMessage());
    }
}