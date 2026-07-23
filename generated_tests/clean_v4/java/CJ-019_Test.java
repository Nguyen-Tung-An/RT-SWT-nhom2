import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.Chronology;
import org.joda.time.chrono.LimitChronology;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class LimitChronologyTest {

    private final DateTimeZone zoneUTC = DateTimeZone.UTC;
    private final DateTimeZone zoneDefault = DateTimeZone.getDefault();
    private final DateTime lowerLimit = new DateTime(2020, 1, 1, 0, 0, zoneDefault);
    private final DateTime upperLimit = new DateTime(2025, 1, 1, 0, 0, zoneDefault);
    private final LimitChronology instance = new LimitChronology(null, lowerLimit, upperLimit);

    @Test
    public void testWithZone_NullZone_ReturnsDefaultZoneChronology() {
        Chronology result = instance.withZone(null);
        assertEquals(zoneDefault, result.getZone());
    }

    @Test
    public void testWithZone_SameZone_ReturnsSameInstance() {
        Chronology result = instance.withZone(zoneDefault);
        assertSame(instance, result);
    }

    @Test
    public void testWithZone_UTCZone_ReturnsUTCChronology() {
        Chronology result = instance.withZone(zoneUTC);
        assertEquals(zoneUTC, result.getZone());
    }

    @Test
    public void testWithZone_ChangeToDifferentZone_ReturnsNewChronology() {
        DateTimeZone newZone = DateTimeZone.forID("America/New_York");
        Chronology result = instance.withZone(newZone);
        assertEquals(newZone, result.getZone());
    }

    @Test
    public void testWithZone_ChangeToUTCZone_CachesUTCChronology() {
        Chronology result = instance.withZone(zoneUTC);
        assertSame(result, instance.withZone(zoneUTC)); // Should return cached instance
    }

    @Test
    public void testWithZone_ChangeLowerLimitZone_ReturnsChronologyWithUpdatedLowerLimit() {
        DateTimeZone newZone = DateTimeZone.forID("Europe/London");
        Chronology result = instance.withZone(newZone);
        DateTime expectedLowerLimit = lowerLimit.withZone(newZone);
        assertEquals(expectedLowerLimit, result.getLowerLimit());
    }

    @Test
    public void testWithZone_ChangeUpperLimitZone_ReturnsChronologyWithUpdatedUpperLimit() {
        DateTimeZone newZone = DateTimeZone.forID("Europe/London");
        Chronology result = instance.withZone(newZone);
        DateTime expectedUpperLimit = upperLimit.withZone(newZone);
        assertEquals(expectedUpperLimit, result.getUpperLimit());
    }
}