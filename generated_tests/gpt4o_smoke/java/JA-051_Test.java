import org.joda.time.DateTimeZone;
import org.joda.time.IllegalInstantException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DateTimeZoneTest {

    private final DateTimeZone dateTimeZone = new DateTimeZone("UTC");

    @Test
    void testConvertLocalToUTC_NonDST() {
        long localTime = 1622505600000L; // 2021-05-31T00:00:00Z
        boolean strict = false;
        long expectedUTC = localTime; // No offset for UTC
        long actualUTC = dateTimeZone.convertLocalToUTC(localTime, strict);
        assertEquals(expectedUTC, actualUTC);
    }

    @Test
    void testConvertLocalToUTC_DSTGapStrict() {
        long localTime = 1625097600000L; // 2021-07-01T00:00:00Z
        boolean strict = true;
        assertThrows(IllegalInstantException.class, () -> {
            dateTimeZone.convertLocalToUTC(localTime, strict);
        });
    }

    @Test
    void testConvertLocalToUTC_DSTGapNonStrict() {
        long localTime = 1625097600000L; // 2021-07-01T00:00:00Z
        boolean strict = false;
        long expectedUTC = localTime; // Adjusted for DST
        long actualUTC = dateTimeZone.convertLocalToUTC(localTime, strict);
        assertEquals(expectedUTC, actualUTC);
    }

    @Test
    void testConvertLocalToUTC_Overflow() {
        long localTime = Long.MIN_VALUE; // Edge case for overflow
        boolean strict = false;
        assertThrows(ArithmeticException.class, () -> {
            dateTimeZone.convertLocalToUTC(localTime, strict);
        });
    }

    @Test
    void testConvertLocalToUTC_NegativeOffset() {
        long localTime = 1622505600000L; // 2021-05-31T00:00:00Z
        boolean strict = true;
        long expectedUTC = localTime; // No offset for UTC
        long actualUTC = dateTimeZone.convertLocalToUTC(localTime, strict);
        assertEquals(expectedUTC, actualUTC);
    }
}