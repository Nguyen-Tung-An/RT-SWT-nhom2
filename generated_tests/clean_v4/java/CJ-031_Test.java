package org.jsoup.internal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilTest {

    @Test
    public void testIsNumeric_NullString() {
        assertFalse(StringUtil.isNumeric(null));
    }

    @Test
    public void testIsNumeric_EmptyString() {
        assertFalse(StringUtil.isNumeric(""));
    }

    @Test
    public void testIsNumeric_SingleDigit() {
        assertTrue(StringUtil.isNumeric("5"));
    }

    @Test
    public void testIsNumeric_MultipleDigits() {
        assertTrue(StringUtil.isNumeric("12345"));
    }

    @Test
    public void testIsNumeric_ContainsNonDigit() {
        assertFalse(StringUtil.isNumeric("123a5"));
    }

    @Test
    public void testIsNumeric_SpaceIncluded() {
        assertFalse(StringUtil.isNumeric("123 45"));
    }

    @Test
    public void testIsNumeric_NegativeSign() {
        assertFalse(StringUtil.isNumeric("-123"));
    }

    @Test
    public void testIsNumeric_PositiveSign() {
        assertFalse(StringUtil.isNumeric("+123"));
    }

    @Test
    public void testIsNumeric_LeadingZeros() {
        assertTrue(StringUtil.isNumeric("000123"));
    }

    @Test
    public void testIsNumeric_LargeNumber() {
        assertTrue(StringUtil.isNumeric("12345678901234567890"));
    }
}