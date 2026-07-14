package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeComparatorTest {

    @Test
    void testToString_EqualLimits() {
        DateTimeFieldType lowerLimit = DateTimeFieldType.year();
        DateTimeComparator comparator = new DateTimeComparator(lowerLimit, lowerLimit);
        assertEquals("DateTimeComparator[year]", comparator.toString());
    }

    @Test
    void testToString_NullLowerLimit() {
        DateTimeFieldType upperLimit = DateTimeFieldType.monthOfYear();
        DateTimeComparator comparator = new DateTimeComparator(null, upperLimit);
        assertEquals("DateTimeComparator[-monthOfYear]", comparator.toString());
    }

    @Test
    void testToString_NullUpperLimit() {
        DateTimeFieldType lowerLimit = DateTimeFieldType.dayOfMonth();
        DateTimeComparator comparator = new DateTimeComparator(lowerLimit, null);
        assertEquals("DateTimeComparator[dayOfMonth-]", comparator.toString());
    }

    @Test
    void testToString_DifferentLimits() {
        DateTimeFieldType lowerLimit = DateTimeFieldType.hourOfDay();
        DateTimeFieldType upperLimit = DateTimeFieldType.minuteOfHour();
        DateTimeComparator comparator = new DateTimeComparator(lowerLimit, upperLimit);
        assertEquals("DateTimeComparator[hourOfDay-minuteOfHour]", comparator.toString());
    }

    @Test
    void testToString_BothNullLimits() {
        DateTimeComparator comparator = new DateTimeComparator(null, null);
        assertEquals("DateTimeComparator[-]", comparator.toString());
    }
}