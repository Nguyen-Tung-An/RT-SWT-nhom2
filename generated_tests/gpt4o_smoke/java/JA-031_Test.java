import org.joda.time.DateTimeZone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeZoneTest {

    @Test
    public void testGetDefaultReturnsNonNull() {
        DateTimeZone zone = DateTimeZone.getDefault();
        assertNotNull(zone, "Expected non-null DateTimeZone");
    }

    @Test
    public void testGetDefaultReturnsUTCWhenNoSystemProperty() {
        System.clearProperty("org.joda.time.DateTimeZone.Timezone");
        DateTimeZone zone = DateTimeZone.getDefault();
        assertEquals(DateTimeZone.UTC, zone, "Expected DateTimeZone to be UTC");
    }

    @Test
    public void testGetDefaultReturnsTimeZoneFromSystemProperty() {
        System.setProperty("org.joda.time.DateTimeZone.Timezone", "America/New_York");
        DateTimeZone zone = DateTimeZone.getDefault();
        assertEquals(DateTimeZone.forID("America/New_York"), zone, "Expected DateTimeZone to match system property");
    }

    @Test
    public void testGetDefaultReturnsDefaultTimeZone() {
        System.clearProperty("org.joda.time.DateTimeZone.Timezone");
        DateTimeZone defaultZone = DateTimeZone.forTimeZone(java.util.TimeZone.getDefault());
        DateTimeZone zone = DateTimeZone.getDefault();
        assertEquals(defaultZone, zone, "Expected DateTimeZone to match default TimeZone");
    }

    @Test
    public void testGetDefaultHandlesIllegalArgumentException() {
        // Simulate an IllegalArgumentException by setting an invalid timezone
        System.setProperty("org.joda.time.DateTimeZone.Timezone", "Invalid/Timezone");
        DateTimeZone zone = DateTimeZone.getDefault();
        assertNotNull(zone, "Expected non-null DateTimeZone despite invalid timezone");
    }
}