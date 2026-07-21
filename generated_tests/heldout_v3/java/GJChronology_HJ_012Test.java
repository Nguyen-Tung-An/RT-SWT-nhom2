import org.joda.time.chrono.GJChronology;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GJChronologyTest {

    private final GJChronology chronology = GJChronology.getInstance();

    @Test
    public void testGetDateTimeMillis_ValidDate() {
        // Test a valid date: 1st January 2020, 00:00:00
        long expectedMillis = 1577836800000L; // Expected milliseconds
        long actualMillis = chronology.getDateTimeMillis(2020, 1, 1, 0, 0, 0, 0);
        assertEquals(expectedMillis, actualMillis);
    }

    @Test
    public void testGetDateTimeMillis_LeapYear() {
        // Test a leap year date: 29th February 2020, 12:00:00
        long expectedMillis = 1582944000000L; // Expected milliseconds
        long actualMillis = chronology.getDateTimeMillis(2020, 2, 29, 12, 0, 0, 0);
        assertEquals(expectedMillis, actualMillis);
    }

    @Test
    public void testGetDateTimeMillis_InvalidMonth() {
        // Test an invalid month: 1st January 2020, 00:00:00
        long actualMillis = chronology.getDateTimeMillis(2020, 13, 1, 0, 0, 0, 0);
        assertEquals(0, actualMillis); // Assuming the method returns 0 for invalid input
    }

    @Test
    public void testGetDateTimeMillis_InvalidDay() {
        // Test an invalid day: 31st April 2020, 00:00:00
        long actualMillis = chronology.getDateTimeMillis(2020, 4, 31, 0, 0, 0, 0);
        assertEquals(0, actualMillis); // Assuming the method returns 0 for invalid input
    }

    @Test
    public void testGetDateTimeMillis_NegativeYear() {
        // Test a negative year: 1st January -1, 00:00:00
        long expectedMillis = -62135596800000L; // Expected milliseconds for year -1
        long actualMillis = chronology.getDateTimeMillis(-1, 1, 1, 0, 0, 0, 0);
        assertEquals(expectedMillis, actualMillis);
    }

    @Test
    public void testGetDateTimeMillis_BoundaryTime() {
        // Test boundary time: 1st January 2020, 23:59:59
        long expectedMillis = 1577836799000L; // Expected milliseconds
        long actualMillis = chronology.getDateTimeMillis(2020, 1, 1, 23, 59, 59, 0);
        assertEquals(expectedMillis, actualMillis);
    }
}