package org.joda.time.format;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FormatUtilsTest {
    @Test
    void testCalculateDigitCount_NegativeValueNotMin() {
        assertEquals(2, FormatUtils.calculateDigitCount(-25));
    }

    @Test
    void testCalculateDigitCount_NegativeValueMin() {
        assertEquals(20, FormatUtils.calculateDigitCount(Long.MIN_VALUE));
    }

    @Test
    void testCalculateDigitCount_Zero() {
        assertEquals(1, FormatUtils.calculateDigitCount(0));
    }

    @Test
    void testCalculateDigitCount_SingleDigit() {
        assertEquals(1, FormatUtils.calculateDigitCount(5));
    }

    @Test
    void testCalculateDigitCount_TwoDigits() {
        assertEquals(2, FormatUtils.calculateDigitCount(42));
    }

    @Test
    void testCalculateDigitCount_ThreeDigits() {
        assertEquals(3, FormatUtils.calculateDigitCount(123));
    }

    @Test
    void testCalculateDigitCount_FourDigits() {
        assertEquals(4, FormatUtils.calculateDigitCount(1234));
    }

    @Test
    void testCalculateDigitCount_FiveDigits() {
        assertEquals(5, FormatUtils.calculateDigitCount(12345));
    }

    @Test
    void testCalculateDigitCount_LargeValue() {
        assertEquals(19, FormatUtils.calculateDigitCount(999999999999999999L));
    }
}