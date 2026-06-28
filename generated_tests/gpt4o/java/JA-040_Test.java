package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelpFormatterTest {
    
    @Test
    void testStripEnd_EmptyString() {
        assertEquals("", HelpFormatter.stripEnd("", null));
    }

    @Test
    void testStripEnd_WhitespaceOnly() {
        assertEquals("", HelpFormatter.stripEnd("   ", null));
    }

    @Test
    void testStripEnd_NullStripChars() {
        assertEquals("Hello", HelpFormatter.stripEnd("Hello   ", null));
    }

    @Test
    void testStripEnd_EmptyStripChars() {
        assertEquals("Hello", HelpFormatter.stripEnd("Hello", ""));
    }

    @Test
    void testStripEnd_WithStripChars() {
        assertEquals("Hello", HelpFormatter.stripEnd("Hello!!!", "!"));
    }

    @Test
    void testStripEnd_WithMultipleStripChars() {
        assertEquals("Hello", HelpFormatter.stripEnd("Hello!!!??", "!?"));
    }

    @Test
    void testStripEnd_AllStripChars() {
        assertEquals("", HelpFormatter.stripEnd("!!!??", "!?"));
    }

    @Test
    void testStripEnd_NonWhitespace() {
        assertEquals("Hello World", HelpFormatter.stripEnd("Hello World   ", null));
    }
}