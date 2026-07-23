package org.apache.commons.cli.help;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextHelpAppendableTest {

    @Test
    void testIndexOfWrap_WidthLessThanOne_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            TextHelpAppendable.indexOfWrap("Sample text", 0, 0);
        });
    }

    @Test
    void testIndexOfWrap_WidthGreaterThanText_ReturnsTextLength() {
        int result = TextHelpAppendable.indexOfWrap("Short", 10, 0);
        assertEquals(5, result);
    }

    @Test
    void testIndexOfWrap_NewlineCharacterFound_ReturnsIndexOfNewline() {
        int result = TextHelpAppendable.indexOfWrap("Line1\nLine2", 10, 0);
        assertEquals(6, result); // Newline character at index 6
    }

    @Test
    void testIndexOfWrap_WhitespaceBeforeLimit_ReturnsLastWhitespaceIndex() {
        int result = TextHelpAppendable.indexOfWrap("This is a test string", 10, 0);
        assertEquals(7, result); // Last whitespace before limit is at index 7
    }

    @Test
    void testIndexOfWrap_NoWhitespaceBeforeLimit_ReturnsLimitMinusOne() {
        int result = TextHelpAppendable.indexOfWrap("NoSpacesHere", 5, 0);
        assertEquals(4, result); // No whitespace, should return limit - 1
    }

    @Test
    void testIndexOfWrap_StartPosGreaterThanTextLength_ReturnsTextLength() {
        int result = TextHelpAppendable.indexOfWrap("Sample text", 5, 12);
        assertEquals(12, result); // Start position is beyond text length
    }

    @Test
    void testIndexOfWrap_ExactWidthAndStartPos_ReturnsLimit() {
        int result = TextHelpAppendable.indexOfWrap("ExactWidthTest", 15, 0);
        assertEquals(15, result); // Width equals text length
    }
}