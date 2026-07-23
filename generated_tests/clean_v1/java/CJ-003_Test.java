package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeComparatorTest {

    private final DateTimeComparator comparator1 = new DateTimeComparator();
    private final DateTimeComparator comparator2 = new DateTimeComparator();
    private final DateTimeComparator comparator3 = new DateTimeComparator();
    
    @Test
    void testEquals_SameInstance() {
        assertTrue(comparator1.equals(comparator1));
    }

    @Test
    void testEquals_DifferentType() {
        assertFalse(comparator1.equals("Not a DateTimeComparator"));
    }

    @Test
    void testEquals_Null() {
        assertFalse(comparator1.equals(null));
    }

    @Test
    void testEquals_SameLimits() {
        comparator1.setLimits("2021-01-01", "2021-12-31");
        comparator2.setLimits("2021-01-01", "2021-12-31");
        assertTrue(comparator1.equals(comparator2));
    }

    @Test
    void testEquals_DifferentLowerLimit() {
        comparator1.setLimits("2021-01-01", "2021-12-31");
        comparator2.setLimits("2021-01-02", "2021-12-31");
        assertFalse(comparator1.equals(comparator2));
    }

    @Test
    void testEquals_DifferentUpperLimit() {
        comparator1.setLimits("2021-01-01", "2021-12-31");
        comparator2.setLimits("2021-01-01", "2022-01-01");
        assertFalse(comparator1.equals(comparator2));
    }

    @Test
    void testEquals_NullLowerLimit() {
        comparator1.setLimits(null, "2021-12-31");
        comparator2.setLimits(null, "2021-12-31");
        assertTrue(comparator1.equals(comparator2));
    }

    @Test
    void testEquals_NullUpperLimit() {
        comparator1.setLimits("2021-01-01", null);
        comparator2.setLimits("2021-01-01", null);
        assertTrue(comparator1.equals(comparator2));
    }

    @Test
    void testEquals_NullLowerLimit_DifferentUpperLimit() {
        comparator1.setLimits(null, "2021-12-31");
        comparator2.setLimits(null, "2022-01-01");
        assertFalse(comparator1.equals(comparator2));
    }

    @Test
    void testEquals_DifferentLowerLimit_NullUpperLimit() {
        comparator1.setLimits("2021-01-01", null);
        comparator2.setLimits("2021-01-02", null);
        assertFalse(comparator1.equals(comparator2));
    }
}