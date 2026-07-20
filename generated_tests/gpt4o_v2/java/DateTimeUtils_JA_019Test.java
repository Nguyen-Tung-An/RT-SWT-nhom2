import org.joda.time.DateTimeField;
import org.joda.time.DurationFieldType;
import org.joda.time.ReadablePartial;
import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeUtilsTest {

    @Test
    void testIsContiguous_NullPartial_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            DateTimeUtils.isContiguous(null);
        });
    }

    @Test
    void testIsContiguous_EmptyPartial_ReturnsTrue() {
        ReadablePartial emptyPartial = new LocalDate(2023, 1, 1).toPartial();
        assertTrue(DateTimeUtils.isContiguous(emptyPartial));
    }

    @Test
    void testIsContiguous_ContiguousFields_ReturnsTrue() {
        ReadablePartial contiguousPartial = new ReadablePartial() {
            @Override
            public int size() {
                return 2;
            }

            @Override
            public DateTimeField getField(int index) {
                return new DateTimeField() {
                    @Override
                    public DurationFieldType getRangeDurationField() {
                        return DurationFieldType.days();
                    }

                    @Override
                    public DurationFieldType getDurationField() {
                        return DurationFieldType.days();
                    }

                    // Other methods omitted for brevity
                };
            }

            // Other methods omitted for brevity
        };
        assertTrue(DateTimeUtils.isContiguous(contiguousPartial));
    }

    @Test
    void testIsContiguous_NonContiguousFields_ReturnsFalse() {
        ReadablePartial nonContiguousPartial = new ReadablePartial() {
            @Override
            public int size() {
                return 2;
            }

            @Override
            public DateTimeField getField(int index) {
                return new DateTimeField() {
                    @Override
                    public DurationFieldType getRangeDurationField() {
                        return index == 0 ? DurationFieldType.days() : DurationFieldType.months();
                    }

                    @Override
                    public DurationFieldType getDurationField() {
                        return DurationFieldType.days();
                    }

                    // Other methods omitted for brevity
                };
            }

            // Other methods omitted for brevity
        };
        assertFalse(DateTimeUtils.isContiguous(nonContiguousPartial));
    }
}