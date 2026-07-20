import org.joda.time.DateTimeZone;
import org.junit.jupiter.api.Test;

import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeZoneTest {

    @Test
    void testGetDefaultReturnsUTCWhenNoTimezoneSet() {
        // Clear any existing default timezone
        System.clearProperty("org.joda.time.DateTimeZone.Timezone");
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertEquals(DateTimeZone.UTC, defaultZone);
    }

    @Test
    void testGetDefaultReturnsCustomTimezone() {
        // Set a custom timezone
        System.setProperty("org.joda.time.DateTimeZone.Timezone", "America/New_York");
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertEquals(DateTimeZone.forID("America/New_York"), defaultZone);
    }

    @Test
    void testGetDefaultReturnsSystemDefaultTimezone() {
        // Set the system default timezone to a known value
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertEquals(DateTimeZone.forID("Europe/London"), defaultZone);
    }

    @Test
    void testGetDefaultHandlesInvalidTimezone() {
        // Set an invalid timezone
        System.setProperty("org.joda.time.DateTimeZone.Timezone", "Invalid/Timezone");
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertEquals(DateTimeZone.UTC, defaultZone);
    }

    @Test
    void testGetDefaultReturnsSameZoneOnSubsequentCalls() {
        // Set a custom timezone
        System.setProperty("org.joda.time.DateTimeZone.Timezone", "America/Los_Angeles");
        DateTimeZone firstCall = DateTimeZone.getDefault();
        DateTimeZone secondCall = DateTimeZone.getDefault();
        assertSame(firstCall, secondCall);
    }
}