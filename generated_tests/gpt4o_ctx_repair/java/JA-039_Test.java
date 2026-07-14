package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.joda.time.ReadablePartial;
import org.joda.time.DurationFieldType;
import org.joda.time.Period;
import org.joda.time.PeriodType;

class PeriodTest {

    @Test
    void testFieldDifference_NullStart() {
        ReadablePartial end = new TestReadablePartial(1, 2);
        assertThrows(IllegalArgumentException.class, () -> {
            Period.fieldDifference(null, end);
        });
    }

    @Test
    void testFieldDifference_NullEnd() {
        ReadablePartial start = new TestReadablePartial(1, 2);
        assertThrows(IllegalArgumentException.class, () -> {
            Period.fieldDifference(start, null);
        });
    }

    @Test
    void testFieldDifference_DifferentSizes() {
        ReadablePartial start = new TestReadablePartial(1, 2);
        ReadablePartial end = new TestReadablePartial(1, 2, 3);
        assertThrows(IllegalArgumentException.class, () -> {
            Period.fieldDifference(start, end);
        });
    }

    @Test
    void testFieldDifference_DifferentFieldTypes() {
        ReadablePartial start = new TestReadablePartial(1, 2);
        ReadablePartial end = new TestReadablePartial(1, 3);
        assertThrows(IllegalArgumentException.class, () -> {
            Period.fieldDifference(start, end);
        });
    }

    @Test
    void testFieldDifference_OverlappingFields() {
        ReadablePartial start = new TestReadablePartial(1, 2);
        ReadablePartial end = new TestReadablePartial(1, 2);
        assertThrows(IllegalArgumentException.class, () -> {
            Period.fieldDifference(start, end);
        });
    }

    @Test
    void testFieldDifference_ValidInput() {
        ReadablePartial start = new TestReadablePartial(1, 2);
        ReadablePartial end = new TestReadablePartial(2, 3);
        Period result = Period.fieldDifference(start, end);
        assertNotNull(result);
        assertEquals(1, result.getYears());
        assertEquals(1, result.getMonths());
    }

    private static class TestReadablePartial implements ReadablePartial {
        private final int[] values;

        public TestReadablePartial(int... values) {
            this.values = values;
        }

        @Override
        public int size() {
            return values.length;
        }

        @Override
        public DurationFieldType getFieldType(int index) {
            return DurationFieldType.years(); // Simplified for testing
        }

        @Override
        public int getValue(int index) {
            return values[index];
        }

        @Override
        public int getFieldIndex(DurationFieldType fieldType) {
            return 0; // Simplified for testing
        }

        @Override
        public DurationFieldType[] getFieldTypes() {
            return new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.months()}; // Simplified for testing
        }
    }
}