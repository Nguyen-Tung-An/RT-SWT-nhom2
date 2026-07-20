import org.joda.time.Interval;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.PeriodType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntervalTest {

    @Test
    void testParseWithOffset_ValidDateTimeAndPeriod() {
        Interval interval = Interval.parseWithOffset("2023-01-01T00:00:00Z/P1D");
        assertNotNull(interval);
        assertEquals(new DateTime("2023-01-01T00:00:00Z"), interval.getStart());
        assertEquals(new DateTime("2023-01-02T00:00:00Z"), interval.getEnd());
    }

    @Test
    void testParseWithOffset_ValidPeriodAndDateTime() {
        Interval interval = Interval.parseWithOffset("P1D/2023-01-02T00:00:00Z");
        assertNotNull(interval);
        assertEquals(new DateTime("2023-01-01T00:00:00Z"), interval.getStart());
        assertEquals(new DateTime("2023-01-02T00:00:00Z"), interval.getEnd());
    }

    @Test
    void testParseWithOffset_InvalidFormat_NoSeparator() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Interval.parseWithOffset("2023-01-01T00:00:00Z2023-01-02T00:00:00Z");
        });
        assertEquals("Format requires a '/' separator: 2023-01-01T00:00:00Z2023-01-02T00:00:00Z", exception.getMessage());
    }

    @Test
    void testParseWithOffset_InvalidFormat_EmptyLeft() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Interval.parseWithOffset("/2023-01-02T00:00:00Z");
        });
        assertEquals("Format invalid: /2023-01-02T00:00:00Z", exception.getMessage());
    }

    @Test
    void testParseWithOffset_InvalidFormat_EmptyRight() {
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