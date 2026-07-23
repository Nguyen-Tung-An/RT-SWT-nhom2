package org.apache.commons.cli.help;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextHelpAppendableTest {

    @Test
    void testIndexOfWrap_WidthLessThanOne() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            TextHelpAppendable.indexOfWrap("Sample text", 0, 0);
        });
        assertEquals("Width must be greater than 0", exception.getMessage());
    }

    @Test
    void testIndexOfWrap_WidthGreaterThanText() {
        int result = TextHelpAppendable.indexOfWrap("Short", 10, 0);
        assertEquals(5, result);
    }

    @Test
    void testIndexOfWrap_NewlineCharacterFound() {
        int result = TextHelpAppendable.indexOfWrap("Line1\nLine2", 5, 0);
        assertEquals(5, result);
    }

    @Test
    void testIndexOfWrap_WhitespaceBeforeLimit() {
        int result = TextHelpAppendable.indexOfWrap("This is a test string", 10, 0);
        assertEquals(7, result);
    }

    @Test
    void testIndexOfWrap_NoWhitespaceBeforeLimit() {
        int result = TextHelpAppendable.indexOfWrap("ThisIsATestString", 10, 0);
        assertEquals(9, result);
    }

    @Test
    void testIndexOfWrap_StartPosGreaterThanTextLength() {
        int result = TextHelpAppendable.indexOfWrap("Sample text", 5, 12);
        assertEquals(12, result);
    }
}