import org.joda.time.DateTimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTimeZoneTest {

    private final DateTimeZone dateTimeZone = DateTimeZone.forID("America/New_York");

    @Test
    void testConvertLocalToUTC_NonDST() {
        long localTime = 1622505600000L; // June 1, 2021, 12:00:00 AM
        boolean strict = false;
        long expectedUTC = localTime - dateTimeZone.getOffset(localTime);
        long actualUTC = dateTimeZone.convertLocalToUTC(localTime, strict);
        assertEquals(expectedUTC, actualUTC);
    }

    @Test
    void testConvertLocalToUTC_DST() {
        long localTime = 1625097600000L; // July 1, 2021, 12:00:00 AM
        boolean strict = false;
        long expectedUTC = localTime - dateTimeZone.getOffset(localTime);
        long actualUTC = dateTimeZone.convertLocalToUTC(localTime, strict);
        assertEquals(expectedUTC, actualUTC);
    }

    @Test
    void testConvertLocalToUTC_DST_Gap_Strict() {
        long localTime = 1635643200000L; // November 1, 2021, 12:00:00 AM
        boolean strict = true;
        assertThrows(IllegalInstantException.class, () -> {
            dateTimeZone.convertLocalToUTC(localTime, strict);
        });
    }

    @Test
    void testConvertLocalToUTC_DST_Gap_NonStrict() {
        long localTime = 1635643200000L; // November 1, 2021, 12:00:00 AM
        boolean strict = false;
        long expectedUTC = localTime - dateTimeZone.getOffset(localTime);
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
}