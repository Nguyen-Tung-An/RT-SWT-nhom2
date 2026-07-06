package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeComparatorTest {
    
    @Test
    void testGetInstance_BothNull() {
        DateTimeComparator comparator = DateTimeComparator.getInstance(null, null);
        assertSame(DateTimeComparator.ALL_INSTANCE, comparator);
    }

    @Test
    void testGetInstance_LowerLimitDayOfYear_UpperLimitNull() {
        DateTimeComparator comparator = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), null);
        assertSame(DateTimeComparator.DATE_INSTANCE, comparator);
    }

    @Test
    void testGetInstance_LowerLimitNull_UpperLimitDayOfYear() {
        DateTimeComparator comparator = DateTimeComparator.getInstance(null, DateTimeFieldType.dayOfYear());
        assertSame(DateTimeComparator.TIME_INSTANCE, comparator);
    }

    @Test
    void testGetInstance_NonNullLimits() {
        DateTimeFieldType lowerLimit = DateTimeFieldType.year();
        DateTimeFieldType upperLimit = DateTimeFieldType.monthOfYear();
        DateTimeComparator comparator = DateTimeComparator.getInstance(lowerLimit, upperLimit);
        assertNotNull(comparator);
        assertEquals(lowerLimit, comparator.getLowerLimit());
        assertEquals(upperLimit, comparator.getUpperLimit());
    }
}