package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeComparatorTest {

    @Test
    void testGetInstance_BothNull() {
        DateTimeComparator comparator = DateTimeComparator.getInstance();
        assertNotNull(comparator);
        assertEquals(DateTimeComparator.getDateOnlyInstance(), comparator);
    }

    @Test
    void testGetInstance_LowerLimitDayOfYear_UpperNull() {
        DateTimeComparator comparator = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear());
        assertNotNull(comparator);
        assertEquals(DateTimeComparator.getDateOnlyInstance(), comparator);
    }

    @Test
    void testGetInstance_LowerNull_UpperLimitDayOfYear() {
        DateTimeComparator comparator = DateTimeComparator.getInstance(null, DateTimeFieldType.dayOfYear());
        assertNotNull(comparator);
        assertEquals(DateTimeComparator.getTimeOnlyInstance(), comparator);
    }

    @Test
    void testGetInstance_ValidLimits() {
        DateTimeFieldType lowerLimit = DateTimeFieldType.year();
        DateTimeFieldType upperLimit = DateTimeFieldType.monthOfYear();
        DateTimeComparator comparator = DateTimeComparator.getInstance(lowerLimit, upperLimit);
        assertNotNull(comparator);
        assertEquals(lowerLimit, comparator.getLowerLimit());
        assertEquals(upperLimit, comparator.getUpperLimit());
    }
}