package org.joda.time.field;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;

public class BaseDateTimeFieldTest {

    private class TestBaseDateTimeField extends BaseDateTimeField {
        private final int maxValue;

        public TestBaseDateTimeField(int maxValue) {
            super(null); // Assuming a constructor that takes a null parameter for testing
            this.maxValue = maxValue;
        }

        @Override
        public int getMaximumValue() {
            return maxValue;
        }
    }

    @Test
    void testGetMaximumTextLength_MaxLessThan10() {
        TestBaseDateTimeField field = new TestBaseDateTimeField(5);
        assertEquals(1, field.getMaximumTextLength(Locale.ENGLISH));
    }

    @Test
    void testGetMaximumTextLength_MaxBetween10And100() {
        TestBaseDateTimeField field = new TestBaseDateTimeField(50);
        assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
    }

    @Test
    void testGetMaximumTextLength_MaxBetween100And1000() {
        TestBaseDateTimeField field = new TestBaseDateTimeField(500);
        assertEquals(3, field.getMaximumTextLength(Locale.ENGLISH));
    }

    @Test
    void testGetMaximumTextLength_MaxEqualTo1000() {
        TestBaseDateTimeField field = new TestBaseDateTimeField(1000);
        assertEquals(4, field.getMaximumTextLength(Locale.ENGLISH));
    }

    @Test
    void testGetMaximumTextLength_MaxGreaterThan1000() {
        TestBaseDateTimeField field = new TestBaseDateTimeField(1500);
        assertEquals(4, field.getMaximumTextLength(Locale.ENGLISH));
    }

    @Test
    void testGetMaximumTextLength_NegativeMaxValue() {
        TestBaseDateTimeField field = new TestBaseDateTimeField(-1);
        assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH)); // Length of "-1"
    }
}