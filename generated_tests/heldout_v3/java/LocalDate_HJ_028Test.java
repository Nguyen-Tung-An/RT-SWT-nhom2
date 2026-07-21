import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.joda.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalDateCompareToTest {

    @Test
    public void testCompareTo_SameDate() {
        LocalDate date1 = new LocalDate(2023, 10, 1);
        LocalDate date2 = new LocalDate(2023, 10, 1);
        assertEquals(0, date1.compareTo(date2));
    }

    @Test
    public void testCompareTo_EarlierDate() {
        LocalDate date1 = new LocalDate(2023, 9, 30);
        LocalDate date2 = new LocalDate(2023, 10, 1);
        assertEquals(-1, date1.compareTo(date2));
    }

    @Test
    public void testCompareTo_LaterDate() {
        LocalDate date1 = new LocalDate(2023, 10, 2);
        LocalDate date2 = new LocalDate(2023, 10, 1);
        assertEquals(1, date1.compareTo(date2));
    }

    @Test
    public void testCompareTo_NullReadablePartial() {
        LocalDate date1 = new LocalDate(2023, 10, 1);
        ReadablePartial date2 = null;
        try {
            date1.compareTo(date2);
        } catch (NullPointerException e) {
            // Expected exception
        }
    }

    @Test
    public void testCompareTo_DifferentYears() {
        LocalDate date1 = new LocalDate(2022, 10, 1);
        LocalDate date2 = new LocalDate(2023, 10, 1);
        assertEquals(-1, date1.compareTo(date2));
    }

    @Test
    public void testCompareTo_DifferentMonths() {
        LocalDate date1 = new LocalDate(2023, 9, 1);
        LocalDate date2 = new LocalDate(2023, 10, 1);
        assertEquals(-1, date1.compareTo(date2));
    }
}