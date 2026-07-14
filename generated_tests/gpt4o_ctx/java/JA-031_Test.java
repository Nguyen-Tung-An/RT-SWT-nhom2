package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeZoneTest {

    @Test
    void testGetDefault_WhenSystemPropertyIsNull() {
        // Simulate the scenario where the system property is not set
        System.clearProperty("org.joda.time.DateTimeZone.Timezone");
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertNotNull(defaultZone);
    }

    @Test
    void testGetDefault_WhenSystemPropertyIsSet() {
        // Simulate the scenario where the system property is set
        System.setProperty("org.joda.time.DateTimeZone.Timezone", "UTC");
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertEquals("UTC", defaultZone.getID());
    }

    @Test
    void testGetDefault_WhenTimeZoneIsInvalid() {
        // Simulate the scenario where an invalid timezone is set
        System.setProperty("org.joda.time.DateTimeZone.Timezone", "Invalid/Timezone");
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertNotNull(defaultZone);
        assertEquals("UTC", defaultZone.getID()); // Fallback to UTC
    }

    @Test
    void testGetDefault_WhenTimeZoneIsDefault() {
        // Simulate the scenario where the default TimeZone is used
        System.clearProperty("org.joda.time.DateTimeZone.Timezone");
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        assertNotNull(defaultZone);
        assertEquals(TimeZone.getDefault().getID(), defaultZone.getID());
    }
}