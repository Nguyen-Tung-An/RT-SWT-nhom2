import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

class UtcDateTypeAdapterTest {

    @Test
    void testFormatWithMillisAndUTC() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        String result = UtcDateTypeAdapter.format(date, true, TimeZone.getTimeZone("UTC"));
        assertEquals("2023-10-01T12:30:45.000Z", result);
    }

    @Test
    void testFormatWithoutMillisAndUTC() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        String result = UtcDateTypeAdapter.format(date, false, TimeZone.getTimeZone("UTC"));
        assertEquals("2023-10-01T12:30:45Z", result);
    }

    @Test
    void testFormatWithMillisAndNonUTC() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        String result = UtcDateTypeAdapter.format(date, true, TimeZone.getTimeZone("GMT+2"));
        assertEquals("2023-10-01T12:30:45.000+02:00", result);
    }

    @Test
    void testFormatWithoutMillisAndNonUTC() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        String result = UtcDateTypeAdapter.format(date, false, TimeZone.getTimeZone("GMT+2"));
        assertEquals("2023-10-01T12:30:45+02:00", result);
    }

    @Test
    void testFormatWithNegativeOffset() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        String result = UtcDateTypeAdapter.format(date, false, TimeZone.getTimeZone("GMT-5"));
        assertEquals("2023-10-01T12:30:45-05:00", result);
    }

    @Test
    void testFormatWithZeroOffset() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        String result = UtcDateTypeAdapter.format(date, false, TimeZone.getTimeZone("GMT"));
        assertEquals("2023-10-01T12:30:45Z", result);
    }

    @Test
    void testFormatWithMillisAndNegativeOffset() {
        Date date = new GregorianCalendar(2023, Calendar.OCTOBER, 1, 12, 30, 45).getTime();
        String result = UtcDateTypeAdapter.format(date, true, TimeZone.getTimeZone("GMT-5"));
        assertEquals("2023-10-01T12:30:45.000-05:00", result);
    }
}