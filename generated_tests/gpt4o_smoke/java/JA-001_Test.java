import org.joda.time.DateTimeComparator;
import org.joda.time.DateTimeFieldType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeComparatorTest {

    @Test
    public void testToStringWithEqualLimits() {
        DateTimeFieldType lowerLimit = DateTimeFieldType.year();
        DateTimeFieldType upperLimit = DateTimeFieldType.year();
        DateTimeComparator comparator = new DateTimeComparator(lowerLimit, upperLimit);
        String result = comparator.toString();
        assertEquals("DateTimeComparator[year]", result);
    }

    @Test
    public void testToStringWithNullLowerLimit() {
        DateTimeFieldType upperLimit = DateTimeFieldType.year();
        DateTimeComparator comparator = new DateTimeComparator(null, upperLimit);
        String result = comparator.toString();
        assertEquals("DateTimeComparator[-year]", result);
    }

    @Test
    public void testToStringWithNullUpperLimit() {
        DateTimeFieldType lowerLimit = DateTimeFieldType.year();
        DateTimeComparator comparator = new DateTimeComparator(lowerLimit, null);
        String result = comparator.toString();
        assertEquals("DateTimeComparator[year-]", result);
    }

    @Test
    public void testToStringWithBothNullLimits() {
        DateTimeComparator comparator = new DateTimeComparator(null, null);
        String result = comparator.toString();
        assertEquals("DateTimeComparator[]", result);
    }

    @Test
    public void testToStringWithDifferentLimits() {
        DateTimeFieldType lowerLimit = DateTimeFieldType.year();
        DateTimeFieldType upperLimit = DateTimeFieldType.monthOfYear();
        DateTimeComparator comparator = new DateTimeComparator(lowerLimit, upperLimit);
        String result = comparator.toString();
        assertEquals("DateTimeComparator[year-monthOfYear]", result);
    }
}