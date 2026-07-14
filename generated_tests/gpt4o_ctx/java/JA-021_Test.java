package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeComparatorTest {

    @Test
    void testGetInstance_BothNull() {
        DateTimeComparator comparator = DateTimeComparator.getInstance(null, null);
        assertNotNull(comparator);
        assertEquals(DateTimeComparator.ALL_INSTANCE, comparator);
    }

    @Test
    void testGetInstance_LowerLimitDayOfYear_UpperNull() {
        DateTimeComparator comparator = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), null);
        assertNotNull(comparator);
        assertEquals(DateTimeComparator.DATE_INSTANCE, comparator);
    }

    @Test
    void testGetInstance_LowerNull_UpperLimitDayOfYear() {
        DateTimeComparator comparator = DateTimeComparator.getInstance(null, DateTimeFieldType.dayOfYear());
        assertNotNull(comparator);
        assertEquals(DateTimeComparator.TIME_INSTANCE, comparator);
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