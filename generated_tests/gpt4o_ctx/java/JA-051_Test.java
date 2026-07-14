package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeZoneTest {

    private final DateTimeZone zone = DateTimeZone.forID("UTC");

    @Test
    void testConvertLocalToUTC_NonDST() {
        long localTime = 1622505600000L; // 2021-05-31T00:00:00Z
        long expectedUTC = localTime; // No offset for UTC
        assertEquals(expectedUTC, zone.convertLocalToUTC(localTime, false));
    }

    @Test
    void testConvertLocalToUTC_DSTGapStrict() {
        long localTime = 1625097600000L; // 2021-07-01T00:00:00Z
        assertThrows(IllegalInstantException.class, () -> {
            zone.convertLocalToUTC(localTime, true);
        });
    }

    @Test
    void testConvertLocalToUTC_DSTGapNonStrict() {
        long localTime = 1625097600000L; // 2021-07-01T00:00:00Z
        long expectedUTC = localTime - zone.getOffset(localTime); // Adjust for offset
        assertEquals(expectedUTC, zone.convertLocalToUTC(localTime, false));
    }

    @Test
    void testConvertLocalToUTC_Overflow() {
        long localTime = Long.MAX_VALUE; // Test for overflow
        assertThrows(ArithmeticException.class, () -> {
            zone.convertLocalToUTC(localTime, false);
        });
    }

    @Test
    void testConvertLocalToUTC_NegativeLocalTime() {
        long localTime = -1; // Negative local time
        long expectedUTC = localTime - zone.getOffset(localTime);
        assertEquals(expectedUTC, zone.convertLocalToUTC(localTime, false));
    }
}