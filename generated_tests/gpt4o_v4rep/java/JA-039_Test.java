import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.DateTimeFieldType;
import org.joda.time.PeriodType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PeriodTest {

    @Test
    void testFieldDifference_NullStart() {
        ReadablePartial end = new TestReadablePartial(2023, 10, 5);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Period.fieldDifference(null, end);
        });
        assertEquals("ReadablePartial objects must not be null", exception.getMessage());
    }

    @Test
    void testFieldDifference_NullEnd() {
        ReadablePartial start = new TestReadablePartial(2023, 10, 1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Period.fieldDifference(start, null);
        });
        assertEquals("ReadablePartial objects must not be null", exception.getMessage());
    }

    @Test
    void testFieldDifference_DifferentSizes() {
        ReadablePartial start = new TestReadablePartial(2023, 10);
        ReadablePartial end = new TestReadablePartial(2023, 10, 5);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Period.fieldDifference(start, end);
        });
        assertEquals("ReadablePartial objects must have the same set of fields", exception.getMessage());
    }

    @Test
    void testFieldDifference_DifferentFieldTypes() {
        ReadablePartial start = new TestReadablePartial(2023, 10, 1);
        ReadablePartial end = new TestReadablePartial(2023, 11, 5);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Period.fieldDifference(start, end);
        });
        assertEquals("ReadablePartial objects must have the same set of fields", exception.getMessage());
    }

    @Test
    void testFieldDifference_OverlappingFields() {
        ReadablePartial start = new TestReadablePartial(2023, 10, 1);
        ReadablePartial end = new TestReadablePartial(2023, 10, 1);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Period.fieldDifference(start, end);
        });
        assertEquals("ReadablePartial objects must not have overlapping fields", exception.getMessage());
    }

    @Test
    void testFieldDifference_ValidInput() {
        ReadablePartial start = new TestReadablePartial(2023, 10, 1);
        ReadablePartial end = new TestReadablePartial(2023, 10, 5);
        Period result = Period.fieldDifference(start, end);
        assertEquals(4, result.getDays());
    }

    private static class TestReadablePartial implements ReadablePartial {
        private final int[] values;
        private final DateTimeFieldType[] fieldTypes;

        public TestReadablePartial(int... values) {
            this.values = values;
            this.fieldTypes = new DateTimeFieldType[values.length];
            for (int i = 0; i < values.length; i++) {
                this.fieldTypes[i] = DateTimeFieldType.dayOfMonth(); // Simplified for testing
            }
        }

        @Override
        public int size() {
            return values.length;
        }

        @Override
        public DateTimeFieldType getFieldType(int index) {
            return fieldTypes[index];
        }

        @Override
        public int getValue(int index) {
            return values[index];
        }

        @Override
        public PeriodType getPeriodType() {
            return PeriodType.days();
        }
    }
}