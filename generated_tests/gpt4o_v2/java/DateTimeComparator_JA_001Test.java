import org.joda.time.DateTimeComparator;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateTimeComparatorTest {

    @Test
    void testToStringWithEqualLimits() {
        DateTimeComparator comparator = new DateTimeComparator();
        comparator.setLowerLimit(new LocalDateTime(2023, 1, 1, 0, 0, DateTimeZone.UTC));
        comparator.setUpperLimit(new LocalDateTime(2023, 1, 1, 0, 0, DateTimeZone.UTC));
        String result = comparator.toString();
        assertEquals("DateTimeComparator[2023-01-01T00:00:00.000Z]", result);
    }

    @Test
    void testToStringWithNullLowerLimit() {
        DateTimeComparator comparator = new DateTimeComparator();
        comparator.setLowerLimit(null);
        comparator.setUpperLimit(new LocalDateTime(2023, 1, 1, 0, 0, DateTimeZone.UTC));
        String result = comparator.toString();
        assertEquals("DateTimeComparator[-2023-01-01T00:00:00.000Z]", result);
    }

    @Test
    void testToStringWithNullUpperLimit() {
        DateTimeComparator comparator = new DateTimeComparator();
        comparator.setLowerLimit(new LocalDateTime(2023, 1, 1, 0, 0, DateTimeZone.UTC));
        comparator.setUpperLimit(null);
        String result = comparator.toString();
        assertEquals("DateTimeComparator[2023-01-01T00:00:00.000Z-]", result);
    }

    @Test
    void testToStringWithDifferentLimits() {
        DateTimeComparator comparator = new DateTimeComparator();
        comparator.setLowerLimit(new LocalDateTime(2023, 1, 1, 0, 0, DateTimeZone.UTC));
        comparator.setUpperLimit(new LocalDateTime(2023, 1, 2, 0, 0, DateTimeZone.UTC));
        String result = comparator.toString();
        assertEquals("DateTimeComparator[2023-01-01T00:00:00.000Z-2023-01-02T00:00:00.000Z]", result);
    }

    @Test
    void testToStringWithBothNullLimits() {
        DateTimeComparator comparator = new DateTimeComparator();
        comparator.setLowerLimit(null);
        comparator.setUpperLimit(null);
        String result = comparator.toString();
        assertEquals("DateTimeComparator[]", result);
    }
}