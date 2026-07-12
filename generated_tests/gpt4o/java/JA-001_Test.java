package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeComparatorTest {

    private class TestLimit {
        private String name;

        public TestLimit(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    @Test
    void testToString_EqualLimits() {
        DateTimeComparator comparator = new DateTimeComparator();
        comparator.iLowerLimit = new TestLimit("Lower");
        comparator.iUpperLimit = new TestLimit("Lower");
        assertEquals("DateTimeComparator[Lower]", comparator.toString());
    }

    @Test
    void testToString_NullLowerLimit() {
        DateTimeComparator comparator = new DateTimeComparator();
        comparator.iLowerLimit = null;
        comparator.iUpperLimit = new TestLimit("Upper");
        assertEquals("DateTimeComparator[-Upper]", comparator.toString());
    }

    @Test
    void testToString_NullUpperLimit() {
        DateTimeComparator comparator = new DateTimeComparator();
        comparator.iLowerLimit = new TestLimit("Lower");
        comparator.iUpperLimit = null;
        assertEquals("DateTimeComparator[Lower-]", comparator.toString());
    }

    @Test
    void testToString_DifferentLimits() {
        DateTimeComparator comparator = new DateTimeComparator();
        comparator.iLowerLimit = new TestLimit("Lower");
        comparator.iUpperLimit = new TestLimit("Upper");
        assertEquals("DateTimeComparator[Lower-Upper]", comparator.toString());
    }

    @Test
    void testToString_BothNullLimits() {
        DateTimeComparator comparator = new DateTimeComparator();
        comparator.iLowerLimit = null;
        comparator.iUpperLimit = null;
        assertEquals("DateTimeComparator[]", comparator.toString());
    }
}