package org.joda.time;

import org.joda.time.field.DurationFieldType;
import org.joda.time.field.DateTimeField;
import org.joda.time.ReadablePartial;
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
        ReadablePartial emptyPartial = new ReadablePartial() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public DateTimeField getField(int index) {
                throw new IndexOutOfBoundsException();
            }

            @Override
            public DurationFieldType[] getFieldTypes() {
                return new DurationFieldType[0];
            }
        };
        assertTrue(DateTimeUtils.isContiguous(emptyPartial));
    }

    @Test
    void testIsContiguous_OneField_ReturnsTrue() {
        ReadablePartial oneFieldPartial = new ReadablePartial() {
            @Override
            public int size() {
                return 1;
            }

            @Override
            public DateTimeField getField(int index) {
                return new DateTimeField() {
                    @Override
                    public DurationFieldType getDurationField() {
                        return DurationFieldType.seconds();
                    }

                    @Override
                    public DurationFieldType getRangeDurationField() {
                        return DurationFieldType.minutes();
                    }
                };
            }

            @Override
            public DurationFieldType[] getFieldTypes() {
                return new DurationFieldType[]{DurationFieldType.seconds()};
            }
        };
        assertTrue(DateTimeUtils.isContiguous(oneFieldPartial));
    }

    @Test
    void testIsContiguous_TwoFields_Contiguous_ReturnsTrue() {
        ReadablePartial contiguousPartial = new ReadablePartial() {
            @Override
            public int size() {
                return 2;
            }

            @Override
            public DateTimeField getField(int index) {
                return new DateTimeField() {
                    @Override
                    public DurationFieldType getDurationField() {
                        return DurationFieldType.minutes();
                    }

                    @Override
                    public DurationFieldType getRangeDurationField() {
                        return DurationFieldType.hours();
                    }
                };
            }

            @Override
            public DurationFieldType[] getFieldTypes() {
                return new DurationFieldType[]{DurationFieldType.minutes(), DurationFieldType.minutes()};
            }
        };
        assertTrue(DateTimeUtils.isContiguous(contiguousPartial));
    }

    @Test
    void testIsContiguous_TwoFields_NonContiguous_ReturnsFalse() {
        ReadablePartial nonContiguousPartial = new ReadablePartial() {
            @Override
            public int size() {
                return 2;
            }

            @Override
            public DateTimeField getField(int index) {
                return new DateTimeField() {
                    @Override
                    public DurationFieldType getDurationField() {
                        return DurationFieldType.minutes();
                    }

                    @Override
                    public DurationFieldType getRangeDurationField() {
                        return DurationFieldType.seconds();
                    }
                };
            }

            @Override
            public DurationFieldType[] getFieldTypes() {
                return new DurationFieldType[]{DurationFieldType.minutes(), DurationFieldType.seconds()};
            }
        };
        assertFalse(DateTimeUtils.isContiguous(nonContiguousPartial));
    }
}