package org.joda.time.tz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FixedDateTimeZoneTest {

    @Test
    void testEquals_SameInstance() {
        FixedDateTimeZone zone = new FixedDateTimeZone("UTC", 0, 0);
        assertTrue(zone.equals(zone));
    }

    @Test
    void testEquals_DifferentType() {
        FixedDateTimeZone zone = new FixedDateTimeZone("UTC", 0, 0);
        assertFalse(zone.equals("Not a FixedDateTimeZone"));
    }

    @Test
    void testEquals_Null() {
        FixedDateTimeZone zone = new FixedDateTimeZone("UTC", 0, 0);
        assertFalse(zone.equals(null));
    }

    @Test
    void testEquals_EqualZones() {
        FixedDateTimeZone zone1 = new FixedDateTimeZone("UTC", 0, 0);
        FixedDateTimeZone zone2 = new FixedDateTimeZone("UTC", 0, 0);
        assertTrue(zone1.equals(zone2));
    }

    @Test
    void testEquals_DifferentIDs() {
        FixedDateTimeZone zone1 = new FixedDateTimeZone("UTC", 0, 0);
        FixedDateTimeZone zone2 = new FixedDateTimeZone("GMT", 0, 0);
        assertFalse(zone1.equals(zone2));
    }

    @Test
    void testEquals_DifferentOffsets() {
        FixedDateTimeZone zone1 = new FixedDateTimeZone("UTC", 0, 0);
        FixedDateTimeZone zone2 = new FixedDateTimeZone("UTC", 3600000, 0);
        assertFalse(zone1.equals(zone2));
    }

    @Test
    void testEquals_DifferentWallOffsets() {
        FixedDateTimeZone zone1 = new FixedDateTimeZone("UTC", 0, 0);
        FixedDateTimeZone zone2 = new FixedDateTimeZone("UTC", 0, 3600000);
        assertFalse(zone1.equals(zone2));
    }
}