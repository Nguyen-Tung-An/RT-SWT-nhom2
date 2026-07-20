import org.joda.time.DateTimeComparator;
import org.joda.time.DateTimeFieldType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTimeComparatorTest {

    @Test
    void testEqualsWithSameInstance() {
        DateTimeComparator comparator = new DateTimeComparator(DateTimeFieldType.year(), DateTimeFieldType.monthOfYear());
        assertTrue(comparator.equals(comparator));
    }

    @Test
    void testEqualsWithDifferentType() {
        DateTimeComparator comparator = new DateTimeComparator(DateTimeFieldType.year(), DateTimeFieldType.monthOfYear());
        String notAComparator = "Not a DateTimeComparator";
        assertFalse(comparator.equals(notAComparator));
    }

    @Test
    void testEqualsWithDifferentLowerLimit() {
        DateTimeComparator comparator1 = new DateTimeComparator(DateTimeFieldType.year(), DateTimeFieldType.monthOfYear());
        DateTimeComparator comparator2 = new DateTimeComparator(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear());
        assertFalse(comparator1.equals(comparator2));
    }

    @Test
    void testEqualsWithDifferentUpperLimit() {
        DateTimeComparator comparator1 = new DateTimeComparator(DateTimeFieldType.year(), DateTimeFieldType.monthOfYear());
        DateTimeComparator comparator2 = new DateTimeComparator(DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth());
        assertFalse(comparator1.equals(comparator2));
    }

    @Test
    void testEqualsWithSameLimits() {
        DateTimeComparator comparator1 = new DateTimeComparator(DateTimeFieldType.year(), DateTimeFieldType.monthOfYear());
        DateTimeComparator comparator2 = new DateTimeComparator(DateTimeFieldType.year(), DateTimeFieldType.monthOfYear());
        assertTrue(comparator1.equals(comparator2));
    }

    @Test
    void testEqualsWithNullLowerLimit() {
        DateTimeComparator comparator1 = new DateTimeComparator(null, DateTimeFieldType.monthOfYear());
        DateTimeComparator comparator2 = new DateTimeComparator(null, DateTimeFieldType.monthOfYear());
        assertTrue(comparator1.equals(comparator2));
    }

    @Test
    void testEqualsWithNullUpperLimit() {
        DateTimeComparator comparator1 = new DateTimeComparator(DateTimeFieldType.year(), null);
        DateTimeComparator comparator2 = new DateTimeComparator(DateTimeFieldType.year(), null);
        assertTrue(comparator1.equals(comparator2));
    }

    @Test
    void testEqualsWithDifferentNullLimits() {
        DateTimeComparator comparator1 = new DateTimeComparator(null, DateTimeFieldType.monthOfYear());
        DateTimeComparator comparator2 = new DateTimeComparator(DateTimeFieldType.year(), null);
        assertFalse(comparator1.equals(comparator2));
    }
}