import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.DateTimeZoneBuilder.Rule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTimeZoneBuilderRuleTest {

    @Test
    public void testNext_InstantAtMinValue() {
        Rule rule = new DateTimeZoneBuilder.Rule("Test", 0, 0, 0, 0, 0, 0, 0);
        long result = rule.next(Long.MIN_VALUE, 0, 0);
        assertEquals(Long.MIN_VALUE, result);
    }

    @Test
    public void testNext_YearBeforeFromYear() {
        Rule rule = new DateTimeZoneBuilder.Rule("Test", 2000, 0, 0, 0, 0, 0, 0);
        long result = rule.next(1999, 0, 0);
        assertEquals(1999, result);
    }

    @Test
    public void testNext_YearInRange() {
        Rule rule = new DateTimeZoneBuilder.Rule("Test", 2000, 0, 0, 0, 0, 0, 0);
        long result = rule.next(2000, 0, 0);
        assertEquals(2000, result);
    }

    @Test
    public void testNext_YearAfterToYear() {
        Rule rule = new DateTimeZoneBuilder.Rule("Test", 2000, 0, 0, 0, 0, 0, 0);
        long result = rule.next(2100, 0, 0);
        assertEquals(2100, result);
    }

    @Test
    public void testNext_NextRecurrenceOutOfRange() {
        Rule rule = new DateTimeZoneBuilder.Rule("Test", 2000, 0, 0, 0, 0, 0, 0);
        long result = rule.next(2001, 0, 0);
        assertEquals(2001, result);
    }
}