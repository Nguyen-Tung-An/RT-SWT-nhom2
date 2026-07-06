package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntervalTest {
    
    @Test
    void testParseWithOffset_ValidStartAndEnd() {
        Interval interval = Interval.parseWithOffset("2023-01-01T00:00:00Z/2023-01-02T00:00:00Z");
        assertNotNull(interval);
    }

    @Test
    void testParseWithOffset_ValidPeriodAndEnd() {
        Interval interval = Interval.parseWithOffset("P1D/2023-01-02T00:00:00Z");
        assertNotNull(interval);
    }

    @Test
    void testParseWithOffset_ValidStartAndPeriod() {
        Interval interval = Interval.parseWithOffset("2023-01-01T00:00:00Z/P1D");
        assertNotNull(interval);
    }

    @Test
    void testParseWithOffset_InvalidFormat_NoSeparator() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Interval.parseWithOffset("2023-01-01T00:00:00Z2023-01-02T00:00:00Z");
        });
        assertEquals("Format requires a '/' separator: 2023-01-01T00:00:00Z2023-01-02T00:00:00Z", exception.getMessage());
    }

    @Test
    void testParseWithOffset_InvalidFormat_EmptyLeft() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Interval.parseWithOffset("/2023-01-02T00:00:00Z");
        });
        assertEquals("Format invalid: /2023-01-02T00:00:00Z", exception.getMessage());
    }

    @Test
    void testParseWithOffset_InvalidFormat_EmptyRight() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Interval.parseWithOffset("2023-01-01T00:00:00Z/");
        });
        assertEquals("Format invalid: 2023-01-01T00:00:00Z/", exception.getMessage());
    }

    @Test
    void testParseWithOffset_TwoDurations() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Interval.parseWithOffset("P1D/P2D");
        });
        assertEquals("Interval composed of two durations: P1D/P2D", exception.getMessage());
    }
}