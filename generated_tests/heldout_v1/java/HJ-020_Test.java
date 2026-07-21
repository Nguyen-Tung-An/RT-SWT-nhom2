package org.joda.time.tz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeZoneBuilderTest {

    private final DateTimeZoneBuilder builder = new DateTimeZoneBuilder();

    @Test
    void testNext_InstantAtMinValue() {
        long result = builder.next(Long.MIN_VALUE, 0, 0);
        assertEquals(Long.MIN_VALUE, result);
    }

    @Test
    void testNext_InstantBeforeFromYear() {
        long result = builder.next(0, 0, 0); // Assuming iFromYear > 0
        assertNotEquals(0, result);
    }

    @Test
    void testNext_InstantInRange() {
        long result = builder.next(1000000000L, 0, 0); // Assuming this is within the range
        assertTrue(result > 1000000000L);
    }

    @Test
    void testNext_InstantAfterToYear() {
        long result = builder.next(2000000000L, 0, 0); // Assuming iToYear < 2000
        assertEquals(2000000000L, result);
    }

    @Test
    void testNext_InstantAtStartOfYear() {
        long result = builder.next(1577836800000L, 0, 0); // January 1, 2020
        assertNotEquals(1577836800000L, result);
    }
}