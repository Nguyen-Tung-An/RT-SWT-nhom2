package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeComparatorTest {

    @Test
    void testEquals_SameInstance() {
        DateTimeFieldType lowerLimit = DateTimeFieldType.year();
        DateTimeFieldType upperLimit = DateTimeFieldType.monthOfYear();
        DateTimeComparator comparator = new DateTimeComparator(lowerLimit, upperLimit);
        assertTrue(comparator.equals(comparator));
    }

    @Test
    void testEquals_SameValues() {
        DateTimeFieldType lowerLimit = DateTimeFieldType.year();
        DateTimeFieldType upperLimit = DateTimeFieldType.monthOfYear();
        DateTimeComparator comparator1 = new DateTimeComparator(lowerLimit, upperLimit);
        DateTimeComparator comparator2 = new DateTimeComparator(lowerLimit, upperLimit);
        assertTrue(comparator1.equals(comparator2));
    }

    @Test
    void testEquals_DifferentLowerLimit() {
        DateTimeFieldType lowerLimit1 = DateTimeFieldType.year();
        DateTimeFieldType upperLimit = DateTimeFieldType.monthOfYear();
        DateTimeFieldType lowerLimit2 = DateTimeFieldType.dayOfMonth();
        DateTimeComparator comparator1 = new DateTimeComparator(lowerLimit1, upperLimit);
        DateTimeComparator comparator2 = new DateTimeComparator(lowerLimit2, upperLimit);
        assertFalse(comparator1.equals(comparator2));
    }

    @Test
    void testEquals_DifferentUpperLimit() {
        DateTimeFieldType lowerLimit = DateTimeFieldType.year();
        DateTimeFieldType upperLimit1 = DateTimeFieldType.monthOfYear();
        DateTimeFieldType upperLimit2 = DateTimeFieldType.dayOfMonth();
        DateTimeComparator comparator1 = new DateTimeComparator(lowerLimit, upperLimit1);
        DateTimeComparator comparator2 = new DateTimeComparator(lowerLimit, upperLimit2);
        assertFalse(comparator1.equals(comparator2));
    }

    @Test
    void testEquals_NullObject() {
        DateTimeFieldType lowerLimit = DateTimeFieldType.year();
        DateTimeFieldType upperLimit = DateTimeFieldType.monthOfYear();
        DateTimeComparator comparator = new DateTimeComparator(lowerLimit, upperLimit);
        assertFalse(comparator.equals(null));
    }

    @Test
    void testEquals_NonDateTimeComparatorObject() {
        DateTimeFieldType lowerLimit = DateTimeFieldType.year();
        DateTimeFieldType upperLimit = DateTimeFieldType.monthOfYear();
        DateTimeComparator comparator = new DateTimeComparator(lowerLimit, upperLimit);
        assertFalse(comparator.equals("Not a DateTimeComparator"));
    }

    @Test
    void testEquals_SameLowerLimitDifferentUpperLimit() {
        DateTimeFieldType lowerLimit = DateTimeFieldType.year();
        DateTimeFieldType upperLimit1 = DateTimeFieldType.monthOfYear();
        DateTimeFieldType upperLimit2 = DateTimeFieldType.monthOfYear();
        DateTimeComparator comparator1 = new DateTimeComparator(lowerLimit, upperLimit1);
        DateTimeComparator comparator2 = new DateTimeComparator(lowerLimit, upperLimit2);
        assertTrue(comparator1.equals(comparator2));
    }
}