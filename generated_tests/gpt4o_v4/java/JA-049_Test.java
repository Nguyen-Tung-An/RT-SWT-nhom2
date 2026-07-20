import org.joda.time.DateTimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeZoneTest {

    @Test
    public void testGetOffsetFromLocalStandardTime() {
        DateTimeZone zone = new DateTimeZone("UTC");
        long instantLocal = 1622505600000L; // June 1, 2021 00:00:00 UTC
        int expectedOffset = 0; // UTC offset
        assertEquals(expectedOffset, zone.getOffsetFromLocal(instantLocal));
    }

    @Test
    public void testGetOffsetFromLocalDaylightSavingTime() {
        DateTimeZone zone = new DateTimeZone("America/New_York");
        long instantLocal = 1622505600000L; // June 1, 2021 00:00:00 EDT
        int expectedOffset = -14400000; // -4 hours in milliseconds
        assertEquals(expectedOffset, zone.getOffsetFromLocal(instantLocal));
    }

    @Test
    public void testGetOffsetFromLocalBeforeDSTTransition() {
        DateTimeZone zone = new DateTimeZone("America/New_York");
        long instantLocal = 1635724800000L; // November 1, 2021 00:00:00 EDT
        int expectedOffset = -18000000; // -5 hours in milliseconds
        assertEquals(expectedOffset, zone.getOffsetFromLocal(instantLocal));
    }

    @Test
    public void testGetOffsetFromLocalAfterDSTTransition() {
        DateTimeZone zone = new DateTimeZone("America/New_York");
        long instantLocal = 1636204800000L; // November 5, 2021 00:00:00 EST
        int expectedOffset = -18000000; // -5 hours in milliseconds
        assertEquals(expectedOffset, zone.getOffsetFromLocal(instantLocal));
    }

    @Test
    public void testGetOffsetFromLocalEdgeCase() {
        DateTimeZone zone = new DateTimeZone("America/New_York");
        long instantLocal = 1635728400000L; // November 1, 2021 01:00:00 EDT
        int expectedOffset = -14400000; // -4 hours in milliseconds
        assertEquals(expectedOffset, zone.getOffsetFromLocal(instantLocal));
    }

    @Test
    public void testGetOffsetFromLocalNegativeInstant() {
        DateTimeZone zone = new DateTimeZone("UTC");
        long instantLocal = -1000000000000L; // A negative timestamp
        int expectedOffset = 0; // UTC offset
        assertEquals(expectedOffset, zone.getOffsetFromLocal(instantLocal));
    }
}