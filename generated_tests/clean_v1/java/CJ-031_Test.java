package org.jsoup.internal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {
    @Test
    void testIsNumeric_NullString() {
        assertFalse(StringUtil.isNumeric(null));
    }

    @Test
    void testIsNumeric_EmptyString() {
        assertFalse(StringUtil.isNumeric(""));
    }

    @Test
    void testIsNumeric_ValidNumericString() {
        assertTrue(StringUtil.isNumeric("12345"));
    }

    @Test
    void testIsNumeric_ContainsNonDigit() {
        assertFalse(StringUtil.isNumeric("123a5"));
    }

    @Test
    void testIsNumeric_SingleDigit() {
        assertTrue(StringUtil.isNumeric("7"));
    }

    @Test
    void testIsNumeric_NegativeSign() {
        assertFalse(StringUtil.isNumeric("-123"));
    }

    @Test
    void testIsNumeric_Whitespace() {
        assertFalse(StringUtil.isNumeric(" 123 "));
    }
}