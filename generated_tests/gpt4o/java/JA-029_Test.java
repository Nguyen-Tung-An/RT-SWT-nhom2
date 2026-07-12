package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeComparatorTest {

    private final DateTimeComparator comparator1 = new DateTimeComparator(/* initialize with limits */);
    private final DateTimeComparator comparator2 = new DateTimeComparator(/* initialize with limits */);
    private final DateTimeComparator comparator3 = new DateTimeComparator(/* initialize with different limits */);
    private final Object nonComparatorObject = new Object();

    @Test
    void testEquals_SameInstance() {
        assertTrue(comparator1.equals(comparator1));
    }

    @Test
    void testEquals_SameValues() {
        assertTrue(comparator1.equals(comparator2));
    }

    @Test
    void testEquals_DifferentValues() {
        assertFalse(comparator1.equals(comparator3));
    }

    @Test
    void testEquals_NonComparatorObject() {
        assertFalse(comparator1.equals(nonComparatorObject));
    }

    @Test
    void testEquals_Null() {
        assertFalse(comparator1.equals(null));
    }

    @Test
    void testEquals_UpperLimitEqual() {
        DateTimeComparator comparatorWithSameUpperLimit = new DateTimeComparator(/* same upper limit */);
        assertTrue(comparator1.equals(comparatorWithSameUpperLimit));
    }

    @Test
    void testEquals_LowerLimitEqual() {
        DateTimeComparator comparatorWithSameLowerLimit = new DateTimeComparator(/* same lower limit */);
        assertTrue(comparator1.equals(comparatorWithSameLowerLimit));
    }
}