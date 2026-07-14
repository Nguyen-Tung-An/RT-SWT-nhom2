package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.joda.time.field.DateTimeField;
import org.joda.time.field.DurationFieldType;
import org.joda.time.ReadablePartial;

class DateTimeUtilsTest {

    @Test
    void testIsContiguous_NullPartial() {
        assertThrows(IllegalArgumentException.class, () -> {
            DateTimeUtils.isContiguous(null);
        });
    }

    @Test
    void testIsContiguous_EmptyPartial() {
        ReadablePartial emptyPartial = new ReadablePartial() {
            @Override
            public int size() {
                return 0;
            }
            @Override
            public DateTimeField getField(int index) {
                throw new IndexOutOfBoundsException();
            }
        };
        assertTrue(DateTimeUtils.isContiguous(emptyPartial));
    }

    @Test
    void testIsContiguous_ContiguousPartial() {
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
                        return DurationFieldType.years();
                    }
                    @Override
                    public DurationFieldType getDurationField() {
                        return DurationFieldType.years();
                    }
                };
            }
        };
        assertTrue(DateTimeUtils.isContiguous(contiguousPartial));
    }

    @Test
    void testIsContiguous_NonContiguousPartial() {
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
                        return index == 0 ? DurationFieldType.years() : DurationFieldType.months();
                    }
                    @Override
                    public DurationFieldType getDurationField() {
                        return DurationFieldType.years();
                    }
                };
            }
        };
        assertFalse(DateTimeUtils.isContiguous(nonContiguousPartial));
    }
}