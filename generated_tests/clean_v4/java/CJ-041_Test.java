import org.joda.time.tz.FixedDateTimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FixedDateTimeZoneTest {

    @Test
    void testEquals_SameInstance() {
        FixedDateTimeZone zone = new FixedDateTimeZone("UTC", "UTC", 0, 0);
        assertTrue(zone.equals(zone));
    }

    @Test
    void testEquals_NullObject() {
        FixedDateTimeZone zone = new FixedDateTimeZone("UTC", "UTC", 0, 0);
        assertFalse(zone.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        FixedDateTimeZone zone = new FixedDateTimeZone("UTC", "UTC", 0, 0);
        String notAZone = "Not a FixedDateTimeZone";
        assertFalse(zone.equals(notAZone));
    }

    @Test
    void testEquals_DifferentID() {
        FixedDateTimeZone zone1 = new FixedDateTimeZone("UTC", "UTC", 0, 0);
        FixedDateTimeZone zone2 = new FixedDateTimeZone("GMT", "GMT", 0, 0);
        assertFalse(zone1.equals(zone2));
    }

    @Test
    void testEquals_DifferentStandardOffset() {
        FixedDateTimeZone zone1 = new FixedDateTimeZone("UTC", "UTC", 0, 0);
        FixedDateTimeZone zone2 = new FixedDateTimeZone("UTC", "UTC", 0, 3600000);
        assertFalse(zone1.equals(zone2));
    }

    @Test
    void testEquals_DifferentWallOffset() {
        FixedDateTimeZone zone1 = new FixedDateTimeZone("UTC", "UTC", 0, 0);
        FixedDateTimeZone zone2 = new FixedDateTimeZone("UTC", "UTC", 3600000, 0);
        assertFalse(zone1.equals(zone2));
    }

    @Test
    void testEquals_SameProperties() {
        FixedDateTimeZone zone1 = new FixedDateTimeZone("UTC", "UTC", 0, 0);
        FixedDateTimeZone zone2 = new FixedDateTimeZone("UTC", "UTC", 0, 0);
        assertTrue(zone1.equals(zone2));
    }
}