import org.joda.time.chrono.GJChronology;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GJChronologyTest {

    private final GJChronology chronology = GJChronology.getInstance();

    @Test
    void testGetDateTimeMillis_ValidDate() {
        long result = chronology.getDateTimeMillis(2023, 3, 15, 12, 0, 0, 0);
        assertEquals(1678886400000L, result); // Adjust expected value based on actual implementation
    }

    @Test
    void testGetDateTimeMillis_LeapYear() {
        long result = chronology.getDateTimeMillis(2020, 2, 29, 12, 0, 0, 0);
        assertEquals(1582963200000L, result); // Adjust expected value based on actual implementation
    }

    @Test
    void testGetDateTimeMillis_NonLeapYear_Feb29() {
        assertThrows(IllegalFieldValueException.class, () -> {
            chronology.getDateTimeMillis(2021, 2, 29, 12, 0, 0, 0);
        });
    }

    @Test
    void testGetDateTimeMillis_BeforeCutover() {
        long result = chronology.getDateTimeMillis(1582, 10, 4, 12, 0, 0, 0);
        assertEquals(0L, result); // Adjust expected value based on actual implementation
    }

    @Test
    void testGetDateTimeMillis_AfterCutover() {
        long result = chronology.getDateTimeMillis(1582, 10, 15, 12, 0, 0, 0);
        assertEquals(0L, result); // Adjust expected value based on actual implementation
    }

    @Test
    void testGetDateTimeMillis_IllegalCutoverGap() {
        assertThrows(IllegalArgumentException.class, () -> {
            chronology.getDateTimeMillis(1582, 10, 5, 12, 0, 0, 0);
        });
    }
}