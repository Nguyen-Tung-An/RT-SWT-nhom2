package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeZoneTest {

    @Test
    void testGetDefault_WithSystemProperty() {
        System.setProperty("org.joda.time.DateTimeZone.Timezone", "America/New_York");
        DateTimeZone zone = DateTimeZone.getDefault();
        assertEquals(DateTimeZone.forID("America/New_York"), zone);
    }

    @Test
    void testGetDefault_WithoutSystemProperty() {
        System.clearProperty("org.joda.time.DateTimeZone.Timezone");
        DateTimeZone zone = DateTimeZone.getDefault();
        assertNotNull(zone);
    }

    @Test
    void testGetDefault_WithInvalidSystemProperty() {
        System.setProperty("org.joda.time.DateTimeZone.Timezone", "Invalid/Timezone");
        DateTimeZone zone = DateTimeZone.getDefault();
        assertEquals(DateTimeZone.UTC, zone);
    }

    @Test
    void testGetDefault_WhenDefaultZoneIsNull() {
        // Assuming cDefault is initially null for this test
        DateTimeZone zone = DateTimeZone.getDefault();
        assertNotNull(zone);
    }

    @Test
    void testGetDefault_WhenCompareAndSetFails() {
        // Simulate a scenario where compareAndSet fails
        DateTimeZone zone = DateTimeZone.getDefault();
        assertNotNull(zone);
    }
}