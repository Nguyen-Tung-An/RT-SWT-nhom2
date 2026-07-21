package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LocalDateTest {

    @Test
    void testCompareTo_SameInstance() {
        LocalDate date = new LocalDate(2023, 10, 1);
        assertEquals(0, date.compareTo(date));
    }

    @Test
    void testCompareTo_EqualDates() {
        LocalDate date1 = new LocalDate(2023, 10, 1);
        LocalDate date2 = new LocalDate(2023, 10, 1);
        assertEquals(0, date1.compareTo(date2));
    }

    @Test
    void testCompareTo_LesserDate() {
        LocalDate date1 = new LocalDate(2023, 10, 1);
        LocalDate date2 = new LocalDate(2023, 10, 2);
        assertEquals(-1, date1.compareTo(date2));
    }

    @Test
    void testCompareTo_GreaterDate() {
        LocalDate date1 = new LocalDate(2023, 10, 2);
        LocalDate date2 = new LocalDate(2023, 10, 1);
        assertEquals(1, date1.compareTo(date2));
    }

    @Test
    void testCompareTo_DifferentChronologies() {
        LocalDate date1 = new LocalDate(2023, 10, 1, ISOChronology.getInstance());
        LocalDate date2 = new LocalDate(2023, 10, 1, GregorianChronology.getInstance());
        assertNotEquals(0, date1.compareTo(date2));
    }

    @Test
    void testCompareTo_NonLocalDate() {
        LocalDate date = new LocalDate(2023, 10, 1);
        assertNotEquals(0, date.compareTo(new Object()));
    }
}