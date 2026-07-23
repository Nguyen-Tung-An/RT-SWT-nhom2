package org.joda.time.tz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FixedDateTimeZoneTest {

    @Test
    void testEquals_SameInstance() {
        FixedDateTimeZone zone = new FixedDateTimeZone("UTC", 0, 0, 0);
        assertTrue(zone.equals(zone));
    }

    @Test
    void testEquals_DifferentType() {
        FixedDateTimeZone zone = new FixedDateTimeZone("UTC", 0, 0, 0);
        String notAZone = "Not a FixedDateTimeZone";
        assertFalse(zone.equals(notAZone));
    }

    @Test
    void testEquals_Null() {
        FixedDateTimeZone zone = new FixedDateTimeZone("UTC", 0, 0, 0);
        assertFalse(zone.equals(null));
    }

    @Test
    void testEquals_DifferentID() {
        FixedDateTimeZone zone1 = new FixedDateTimeZone("UTC", 0, 0, 0);
        FixedDateTimeZone zone2 = new FixedDateTimeZone("GMT", 0, 0, 0);
        assertFalse(zone1.equals(zone2));
    }

    @Test
    void testEquals_DifferentOffsets() {
        FixedDateTimeZone zone1 = new FixedDateTimeZone("UTC", 0, 0, 0);
        FixedDateTimeZone zone2 = new FixedDateTimeZone("UTC", 3600000, 0, 0);
        assertFalse(zone1.equals(zone2));
    }

    @Test
    void testEquals_SameValues() {
        FixedDateTimeZone zone1 = new FixedDateTimeZone("UTC", 0, 0, 0);
        FixedDateTimeZone zone2 = new FixedDateTimeZone("UTC", 0, 0, 0);
        assertTrue(zone1.equals(zone2));
    }
}