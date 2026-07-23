package org.apache.commons.cli.help;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextHelpAppendableTest {

    @Test
    void testIndexOfWrap_WidthLessThanOne() {
        assertThrows(IllegalArgumentException.class, () -> {
            TextHelpAppendable.indexOfWrap("Sample text", 0, 0);
        });
    }

    @Test
    void testIndexOfWrap_WidthGreaterThanText() {
        assertEquals(11, TextHelpAppendable.indexOfWrap("Sample text", 20, 0));
    }

    @Test
    void testIndexOfWrap_NewLineCharacterFound() {
        assertEquals(6, TextHelpAppendable.indexOfWrap("Sample\ntext", 10, 0));
    }

    @Test
    void testIndexOfWrap_WhitespaceBeforeLimit() {
        assertEquals(5, TextHelpAppendable.indexOfWrap("Sample text", 10, 0));
    }

    @Test
    void testIndexOfWrap_NoWhitespaceFound() {
        assertEquals(9, TextHelpAppendable.indexOfWrap("SampleText", 10, 0));
    }

    @Test
    void testIndexOfWrap_StartPosGreaterThanTextLength() {
        assertEquals(11, TextHelpAppendable.indexOfWrap("Sample text", 5, 11));
    }

    @Test
    void testIndexOfWrap_ExactLimit() {
        assertEquals(11, TextHelpAppendable.indexOfWrap("Sample text", 11, 0));
    }

    @Test
    void testIndexOfWrap_WidthEqualsTextLength() {
        assertEquals(11, TextHelpAppendable.indexOfWrap("Sample text", 11, 0));
    }
}