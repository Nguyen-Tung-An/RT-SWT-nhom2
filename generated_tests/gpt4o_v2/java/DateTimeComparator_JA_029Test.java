import org.joda.time.DateTimeComparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTimeComparatorTest {

    @Test
    void testEqualsWithSameInstance() {
        DateTimeComparator comparator = DateTimeComparator.getInstance();
        assertTrue(comparator.equals(comparator));
    }

    @Test
    void testEqualsWithDifferentType() {
        DateTimeComparator comparator = DateTimeComparator.getInstance();
        String notAComparator = "Not a DateTimeComparator";
        assertFalse(comparator.equals(notAComparator));
    }

    @Test
    void testEqualsWithNull() {
        DateTimeComparator comparator = DateTimeComparator.getInstance();
        assertFalse(comparator.equals(null));
    }

    @Test
    void testEqualsWithDifferentComparator() {
        DateTimeComparator comparator1 = DateTimeComparator.getInstance();
        DateTimeComparator comparator2 = DateTimeComparator.getInstance();
        assertTrue(comparator1.equals(comparator2));
    }

    @Test
    void testEqualsWithDifferentLowerLimit() {
        DateTimeComparator comparator1 = new DateTimeComparator(/* lower limit */ null, /* upper limit */ null);
        DateTimeComparator comparator2 = new DateTimeComparator(/* lower limit */ new Object(), /* upper limit */ null);
        assertFalse(comparator1.equals(comparator2));
    }

    @Test
    void testEqualsWithDifferentUpperLimit() {
        DateTimeComparator comparator1 = new DateTimeComparator(/* lower limit */ null, /* upper limit */ null);
        DateTimeComparator comparator2 = new DateTimeComparator(/* lower limit */ null, /* upper limit */ new Object());
        assertFalse(comparator1.equals(comparator2));
    }

    @Test
    void testEqualsWithSameLimits() {
        Object lowerLimit = new Object();
        Object upperLimit = new Object();
        DateTimeComparator comparator1 = new DateTimeComparator(lowerLimit, upperLimit);
        DateTimeComparator comparator2 = new DateTimeComparator(lowerLimit, upperLimit);
        assertTrue(comparator1.equals(comparator2));
    }

    @Test
    void testEqualsWithDifferentLowerLimitButSameUpperLimit() {
        Object upperLimit = new Object();
        DateTimeComparator comparator1 = new DateTimeComparator(new Object(), upperLimit);
        DateTimeComparator comparator2 = new DateTimeComparator(null, upperLimit);
        assertFalse(comparator1.equals(comparator2));
    }

    @Test
    void testEqualsWithSameLowerLimitButDifferentUpperLimit() {
        Object lowerLimit = new Object();
        DateTimeComparator comparator1 = new DateTimeComparator(lowerLimit, new Object());
        DateTimeComparator comparator2 = new DateTimeComparator(lowerLimit, null);
        assertFalse(comparator1.equals(comparator2));
    }
}