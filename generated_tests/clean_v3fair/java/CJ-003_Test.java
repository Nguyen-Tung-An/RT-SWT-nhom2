package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeComparatorTest {

    @Test
    void testEquals_SameInstance() {
        DateTimeComparator comparator = new DateTimeComparator();
        assertTrue(comparator.equals(comparator));
    }

    @Test
    void testEquals_DifferentType() {
        DateTimeComparator comparator = new DateTimeComparator();
        assertFalse(comparator.equals("Not a DateTimeComparator"));
    }

    @Test
    void testEquals_Null() {
        DateTimeComparator comparator = new DateTimeComparator();
        assertFalse(comparator.equals(null));
    }

    @Test
    void testEquals_EqualComparators() {
        DateTimeComparator comparator1 = new DateTimeComparator();
        DateTimeComparator comparator2 = new DateTimeComparator();
        assertTrue(comparator1.equals(comparator2));
    }

    @Test
    void testEquals_DifferentLowerLimit() {
        DateTimeComparator comparator1 = new DateTimeComparator();
        DateTimeComparator comparator2 = new DateTimeComparator();
        comparator1.setLowerLimit("2021-01-01");
        comparator2.setLowerLimit("2022-01-01");
        assertFalse(comparator1.equals(comparator2));
    }

    @Test
    void testEquals_DifferentUpperLimit() {
        DateTimeComparator comparator1 = new DateTimeComparator();
        DateTimeComparator comparator2 = new DateTimeComparator();
        comparator1.setUpperLimit("2021-12-31");
        comparator2.setUpperLimit("2022-12-31");
        assertFalse(comparator1.equals(comparator2));
    }

    @Test
    void testEquals_NullLowerLimit() {
        DateTimeComparator comparator1 = new DateTimeComparator();
        DateTimeComparator comparator2 = new DateTimeComparator();
        comparator1.setLowerLimit(null);
        comparator2.setLowerLimit("2021-01-01");
        assertFalse(comparator1.equals(comparator2));
    }

    @Test
    void testEquals_NullUpperLimit() {
        DateTimeComparator comparator1 = new DateTimeComparator();
        DateTimeComparator comparator2 = new DateTimeComparator();
        comparator1.setUpperLimit(null);
        comparator2.setUpperLimit("2021-12-31");
        assertFalse(comparator1.equals(comparator2));
    }

    @Test
    void testEquals_EqualLimits() {
        DateTimeComparator comparator1 = new DateTimeComparator();
        DateTimeComparator comparator2 = new DateTimeComparator();
        comparator1.setLowerLimit("2021-01-01");
        comparator1.setUpperLimit("2021-12-31");
        comparator2.setLowerLimit("2021-01-01");
        comparator2.setUpperLimit("2021-12-31");
        assertTrue(comparator1.equals(comparator2));
    }
}