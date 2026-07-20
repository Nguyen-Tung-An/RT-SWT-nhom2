import org.joda.time.DateTimeComparator;
import org.joda.time.DateTimeFieldType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class DateTimeComparatorTest {

    @Test
    void testGetInstanceBothNull() {
        DateTimeComparator result = DateTimeComparator.getInstance(null, null);
        assertSame(DateTimeComparator.ALL_INSTANCE, result);
    }

    @Test
    void testGetInstanceLowerLimitDayOfYear() {
        DateTimeComparator result = DateTimeComparator.getInstance(DateTimeFieldType.dayOfYear(), null);
        assertSame(DateTimeComparator.DATE_INSTANCE, result);
    }

    @Test
    void testGetInstanceUpperLimitDayOfYear() {
        DateTimeComparator result = DateTimeComparator.getInstance(null, DateTimeFieldType.dayOfYear());
        assertSame(DateTimeComparator.TIME_INSTANCE, result);
    }

    @Test
    void testGetInstanceWithValidLimits() {
        DateTimeComparator result = DateTimeComparator.getInstance(DateTimeFieldType.year(), DateTimeFieldType.monthOfYear());
        assertSame(new DateTimeComparator(DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()), result);
    }
}