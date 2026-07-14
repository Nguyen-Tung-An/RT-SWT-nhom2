package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;

public class DateTimeComparatorTest {

    @Test
    void testCompare_SameObject() {
        DateTimeComparator comparator = DateTimeComparator.getInstance();
        DateTime dateTime = new DateTime(2023, 10, 1, 0, 0);
        assertEquals(0, comparator.compare(dateTime, dateTime));
    }

    @Test
    void testCompare_NullVsNull() {
        DateTimeComparator comparator = DateTimeComparator.getInstance();
        assertEquals(0, comparator.compare(null, null));
    }

    @Test
    void testCompare_NullVsNonNull() {
        DateTimeComparator comparator = DateTimeComparator.getInstance();
        assertEquals(1, comparator.compare(null, new DateTime(2023, 10, 1, 0, 0)));
        assertEquals(-1, comparator.compare(new DateTime(2023, 10, 1, 0, 0), null));
    }

    @Test
    void testCompare_LowerLimit() {
        DateTimeFieldType lowerLimit = DateTimeFieldType.year(); // Example field type
        DateTimeComparator comparator = DateTimeComparator.getInstance(lowerLimit);
        
        DateTime lhs = new DateTime(2022, 10, 1, 0, 0);
        DateTime rhs = new DateTime(2023, 10, 1, 0, 0);
        
        assertEquals(-1, comparator.compare(lhs, rhs));
    }

    @Test
    void testCompare_UpperLimit() {
        DateTimeFieldType upperLimit = DateTimeFieldType.year(); // Example field type
        DateTimeComparator comparator = DateTimeComparator.getInstance(null, upperLimit);
        
        DateTime lhs = new DateTime(2024, 10, 1, 0, 0);
        DateTime rhs = new DateTime(2023, 10, 1, 0, 0);
        
        assertEquals(1, comparator.compare(lhs, rhs));
    }

    @Test
    void testCompare_DifferentChronologies() {
        DateTimeComparator comparator = DateTimeComparator.getInstance();
        
        DateTime lhs = new DateTime(2023, 10, 1, 0, 0, DateTimeZone.forID("UTC"));
        DateTime rhs = new DateTime(2023, 10, 1, 0, 0, DateTimeZone.forID("America/New_York"));
        
        assertEquals(0, comparator.compare(lhs, rhs)); // Same instant, different zones
    }
}