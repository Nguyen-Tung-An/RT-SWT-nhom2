import static org.junit.jupiter.api.Assertions.*;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.PeriodType;
import org.junit.jupiter.api.Test;

class PeriodTest {

    @Test
    void testFieldDifference_NullStart() {
        ReadablePartial end = new LocalDate(2023, 10, 1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Period.fieldDifference(null, end);
        });
        assertEquals("ReadablePartial objects must not be null", exception.getMessage());
    }

    @Test
    void testFieldDifference_NullEnd() {
        ReadablePartial start = new LocalDate(2023, 9, 1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Period.fieldDifference(start, null);
        });
        assertEquals("ReadablePartial objects must not be null", exception.getMessage());
    }

    @Test
    void testFieldDifference_DifferentSizes() {
        ReadablePartial start = new LocalDate(2023, 9, 1);
        ReadablePartial end = new LocalDateTime(2023, 10, 1, 12, 0);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Period.fieldDifference(start, end);
        });
        assertEquals("ReadablePartial objects must have the same set of fields", exception.getMessage());
    }

    @Test
    void testFieldDifference_DifferentFieldTypes() {
        ReadablePartial start = new LocalDate(2023, 9, 1);
        ReadablePartial end = new LocalDateTime(2023, 10, 1, 12, 0);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Period.fieldDifference(start, end);
        });
        assertEquals("ReadablePartial objects must have the same set of fields", exception.getMessage());
    }

    @Test
    void testFieldDifference_OverlappingFields() {
        ReadablePartial start = new LocalDate(2023, 9, 1);
        ReadablePartial end = new LocalDate(2023, 9, 2);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Period.fieldDifference(start, end);
        });
        assertEquals("ReadablePartial objects must not have overlapping fields", exception.getMessage());
    }

    @Test
    void testFieldDifference_ValidInput() {
        ReadablePartial start = new LocalDate(2023, 9, 1);
        ReadablePartial end = new LocalDate(2023, 10, 1);
        Period result = Period.fieldDifference(start, end);
        assertEquals(30, result.getDays());
        assertEquals(0, result.getMonths());
    }
}