package org.joda.time.chrono;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GJChronologyTest {

    private final GJChronology gjChronology = new GJChronology();

    @Test
    void testGetDateTimeMillis_ValidDate() {
        long result = gjChronology.getDateTimeMillis(2021, 5, 15, 10, 30, 0, 0);
        assertTrue(result > 0);
    }

    @Test
    void testGetDateTimeMillis_LeapYear() {
        long result = gjChronology.getDateTimeMillis(2020, 2, 29, 12, 0, 0, 0);
        assertTrue(result > 0);
    }

    @Test
    void testGetDateTimeMillis_NonLeapYear_February29() {
        assertThrows(IllegalFieldValueException.class, () -> {
            gjChronology.getDateTimeMillis(2021, 2, 29, 12, 0, 0, 0);
        });
    }

    @Test
    void testGetDateTimeMillis_CutoverGap() {
        assertThrows(IllegalArgumentException.class, () -> {
            gjChronology.getDateTimeMillis(1582, 10, 5, 12, 0, 0, 0);
        });
    }

    @Test
    void testGetDateTimeMillis_JulianDate() {
        long result = gjChronology.getDateTimeMillis(1581, 10, 5, 12, 0, 0, 0);
        assertTrue(result > 0);
    }
}