package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeZoneTest {

    @Test
    void testConvertLocalToUTC_Strict_DSTGap() {
        long instantLocal = 1622505600000L; // Example timestamp
        boolean strict = true;
        assertThrows(IllegalInstantException.class, () -> {
            DateTimeZone dtz = DateTimeZone.forID("America/New_York");
            dtz.convertLocalToUTC(instantLocal, strict);
        });
    }

    @Test
    void testConvertLocalToUTC_NonStrict_DSTGap() {
        long instantLocal = 1622505600000L; // Example timestamp
        boolean strict = false;
        DateTimeZone dtz = DateTimeZone.forID("America/New_York");
        long result = dtz.convertLocalToUTC(instantLocal, strict);
        assertNotNull(result);
    }

    @Test
    void testConvertLocalToUTC_NoDSTGap() {
        long instantLocal = 1622505600000L; // Example timestamp
        boolean strict = false;
        DateTimeZone dtz = DateTimeZone.forID("Europe/London");
        long result = dtz.convertLocalToUTC(instantLocal, strict);
        assertNotNull(result);
    }

    @Test
    void testConvertLocalToUTC_Overflow() {
        long instantLocal = Long.MIN_VALUE; // Example to cause overflow
        boolean strict = false;
        DateTimeZone dtz = DateTimeZone.forID("UTC");
        assertThrows(ArithmeticException.class, () -> {
            dtz.convertLocalToUTC(instantLocal, strict);
        });
    }

    @Test
    void testConvertLocalToUTC_NegativeOffset() {
        long instantLocal = 1622505600000L; // Example timestamp
        boolean strict = false;
        DateTimeZone dtz = DateTimeZone.forID("Pacific/Auckland");
        long result = dtz.convertLocalToUTC(instantLocal, strict);
        assertNotNull(result);
    }
}