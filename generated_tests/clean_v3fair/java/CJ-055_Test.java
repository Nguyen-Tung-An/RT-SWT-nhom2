package org.joda.time.field;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class BaseDateTimeFieldTest {

    private class TestBaseDateTimeField extends BaseDateTimeField {
        @Override
        public int getMaximumValue() {
            return 5; // Example value for testing
        }
    }

    @Test
    void testGetMaximumTextLength_SingleDigit() {
        BaseDateTimeField instance = new TestBaseDateTimeField();
        assertEquals(1, instance.getMaximumTextLength(Locale.ENGLISH));
    }

    @Test
    void testGetMaximumTextLength_TwoDigits() {
        BaseDateTimeField instance = new TestBaseDateTimeField() {
            @Override
            public int getMaximumValue() {
                return 50; // Two digits
            }
        };
        assertEquals(2, instance.getMaximumTextLength(Locale.ENGLISH));
    }

    @Test
    void testGetMaximumTextLength_ThreeDigits() {
        BaseDateTimeField instance = new TestBaseDateTimeField() {
            @Override
            public int getMaximumValue() {
                return 500; // Three digits
            }
        };
        assertEquals(3, instance.getMaximumTextLength(Locale.ENGLISH));
    }

    @Test
    void testGetMaximumTextLength_FourDigits() {
        BaseDateTimeField instance = new TestBaseDateTimeField() {
            @Override
            public int getMaximumValue() {
                return 1500; // Four digits
            }
        };
        assertEquals(4, instance.getMaximumTextLength(Locale.ENGLISH));
    }

    @Test
    void testGetMaximumTextLength_NegativeValue() {
        BaseDateTimeField instance = new TestBaseDateTimeField() {
            @Override
            public int getMaximumValue() {
                return -5; // Negative value
            }
        };
        assertEquals(2, instance.getMaximumTextLength(Locale.ENGLISH)); // Length of "-5"
    }
}