package org.joda.time;

import org.junit.jupiter.api.Test;
import org.joda.time.chrono.ISOChronology;

import static org.junit.jupiter.api.Assertions.*;

public class LocalTimeTest {

    private final LocalTime localTime = new LocalTime();

    @Test
    void testGetField_HourOfDay() {
        DateTimeField field = localTime.getField(LocalTime.HOUR_OF_DAY, ISOChronology.getInstance());
        assertNotNull(field);
        assertEquals("hourOfDay", field.getName());
    }

    @Test
    void testGetField_MinuteOfHour() {
        DateTimeField field = localTime.getField(LocalTime.MINUTE_OF_HOUR, ISOChronology.getInstance());
        assertNotNull(field);
        assertEquals("minuteOfHour", field.getName());
    }

    @Test
    void testGetField_SecondOfMinute() {
        DateTimeField field = localTime.getField(LocalTime.SECOND_OF_MINUTE, ISOChronology.getInstance());
        assertNotNull(field);
        assertEquals("secondOfMinute", field.getName());
    }

    @Test
    void testGetField_MillisOfSecond() {
        DateTimeField field = localTime.getField(LocalTime.MILLIS_OF_SECOND, ISOChronology.getInstance());
        assertNotNull(field);
        assertEquals("millisOfSecond", field.getName());
    }

    @Test
    void testGetField_InvalidIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            localTime.getField(-1, ISOChronology.getInstance());
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            localTime.getField(5, ISOChronology.getInstance());
        });
    }
}