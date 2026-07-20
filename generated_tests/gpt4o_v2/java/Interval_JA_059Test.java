import org.joda.time.Interval;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntervalTest {

    @Test
    void testParseWithOffset_ValidDateTimeInterval() {
        Interval interval = Interval.parseWithOffset("2023-01-01T00:00:00Z/2023-01-02T00:00:00Z");
        assertEquals(new Interval(new DateTime("2023-01-01T00:00:00Z"), new DateTime("2023-01-02T00:00:00Z")), interval);
    }

    @Test
    void testParseWithOffset_ValidPeriodInterval() {
        Interval interval = Interval.parseWithOffset("P1D/P2D");
        assertNotNull(interval);
        assertEquals(Period.days(1), interval.toDuration());
    }

    @Test
    void testParseWithOffset_ValidMixedInterval() {
        Interval interval = Interval.parseWithOffset("2023-01-01T00:00:00Z/P1D");
        assertNotNull(interval);
        assertEquals(new DateTime("2023-01-01T00:00:00Z"), interval.getStart());
        assertEquals(new DateTime("2023-01-02T00:00:00Z"), interval.getEnd());
    }

    @Test
    void testParseWithOffset_MissingSeparator() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Interval.parseWithOffset("2023-01-01T00:00:00Z2023-01-02T00:00:00Z");
        });
        assertEquals("Format requires a '/' separator: 2023-01-01T00:00:00Z2023-01-02T00:00:00Z", exception.getMessage());
    }

    @Test
    void testParseWithOffset_EmptyLeftSide() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Interval.parseWithOffset("/2023-01-02T00:00:00Z");
        });
        assertEquals("Format invalid: /2023-01-02T00:00:00Z", exception.getMessage());
    }

    @Test
    void testParseWithOffset_EmptyRightSide() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Interval.parseWithOffset("2023-01-01T00:00:00Z/");
        });
        assertEquals("Format invalid: 2023-01-01T00:00:00Z/", exception.getMessage());
    }

    @Test
    void testParseWithOffset_TwoDurations() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Interval.parseWithOffset("P1D/P2D");
        });
        assertEquals("Interval composed of two durations: P1D/P2D", exception.getMessage());
    }
}