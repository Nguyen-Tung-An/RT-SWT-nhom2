import org.joda.time.DateTimeComparator;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.joda.time.chrono.ISOChronology;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeComparatorTest {

    private final DateTimeComparator comparator = new DateTimeComparator(null, null);

    @Test
    public void testCompare_SameObject() {
        DateTime dateTime = new DateTime(2023, 10, 1, 0, 0, ISOChronology.getInstance());
        assertEquals(0, comparator.compare(dateTime, dateTime));
    }

    @Test
    public void testCompare_NullVsNull() {
        assertEquals(0, comparator.compare(null, null));
    }

    @Test
    public void testCompare_NullVsDateTime() {
        DateTime dateTime = new DateTime(2023, 10, 1, 0, 0, ISOChronology.getInstance());
        assertEquals(-1, comparator.compare(null, dateTime));
    }

    @Test
    public void testCompare_DateTimeVsNull() {
        DateTime dateTime = new DateTime(2023, 10, 1, 0, 0, ISOChronology.getInstance());
        assertEquals(1, comparator.compare(dateTime, null));
    }

    @Test
    public void testCompare_EarlierVsLater() {
        DateTime earlier = new DateTime(2023, 9, 30, 0, 0, ISOChronology.getInstance());
        DateTime later = new DateTime(2023, 10, 1, 0, 0, ISOChronology.getInstance());
        assertEquals(-1, comparator.compare(earlier, later));
    }

    @Test
    public void testCompare_LaterVsEarlier() {
        DateTime earlier = new DateTime(2023, 9, 30, 0, 0, ISOChronology.getInstance());
        DateTime later = new DateTime(2023, 10, 1, 0, 0, ISOChronology.getInstance());
        assertEquals(1, comparator.compare(later, earlier));
    }

    @Test
    public void testCompare_EqualDateTimes() {
        DateTime dateTime1 = new DateTime(2023, 10, 1, 0, 0, ISOChronology.getInstance());
        DateTime dateTime2 = new DateTime(2023, 10, 1, 0, 0, ISOChronology.getInstance());
        assertEquals(0, comparator.compare(dateTime1, dateTime2));
    }
}