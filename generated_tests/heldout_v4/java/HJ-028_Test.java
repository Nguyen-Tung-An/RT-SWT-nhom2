import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalDateCompareToTest {

    @Test
    public void testCompareTo_SameInstance() {
        LocalDate date = new LocalDate();
        assertEquals(0, date.compareTo(date));
    }

    @Test
    public void testCompareTo_EqualDates() {
        LocalDate date1 = new LocalDate(2023, 10, 1);
        LocalDate date2 = new LocalDate(2023, 10, 1);
        assertEquals(0, date1.compareTo(date2));
    }

    @Test
    public void testCompareTo_LesserDate() {
        LocalDate date1 = new LocalDate(2023, 9, 30);
        LocalDate date2 = new LocalDate(2023, 10, 1);
        assertEquals(-1, date1.compareTo(date2));
    }

    @Test
    public void testCompareTo_GreaterDate() {
        LocalDate date1 = new LocalDate(2023, 10, 2);
        LocalDate date2 = new LocalDate(2023, 10, 1);
        assertEquals(1, date1.compareTo(date2));
    }

    @Test
    public void testCompareTo_DifferentChronologies() {
        LocalDate date1 = new LocalDate(2023, 10, 1);
        LocalDate date2 = new LocalDate(date1.getChronology().withZone(org.joda.time.DateTimeZone.UTC), 2023, 10, 1);
        assertEquals(1, date1.compareTo((ReadablePartial) date2));
    }

    @Test
    public void testCompareTo_NullPartial() {
        LocalDate date = new LocalDate(2023, 10, 1);
        assertEquals(1, date.compareTo(null));
    }
}