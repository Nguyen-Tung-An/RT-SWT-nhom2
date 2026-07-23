package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PatternOptionBuilderTest {

    @Test
    void testParsePattern_EmptyPattern() {
        Options options = PatternOptionBuilder.parsePattern("");
        assertTrue(options.getOptions().isEmpty());
    }

    @Test
    void testParsePattern_SingleOptionWithoutArg() {
        Options options = PatternOptionBuilder.parsePattern("a");
        assertEquals(1, options.getOptions().size());
        assertTrue(options.getOption("a").hasArg());
        assertFalse(options.getOption("a").isRequired());
    }

    @Test
    void testParsePattern_SingleOptionWithArg() {
        Options options = PatternOptionBuilder.parsePattern("a:");
        assertEquals(1, options.getOptions().size());
        assertTrue(options.getOption("a").hasArg());
        assertFalse(options.getOption("a").isRequired());
    }

    @Test
    void testParsePattern_SingleRequiredOption() {
        Options options = PatternOptionBuilder.parsePattern("a!");
        assertEquals(1, options.getOptions().size());
        assertFalse(options.getOption("a").hasArg());
        assertTrue(options.getOption("a").isRequired());
    }

    @Test
    void testParsePattern_MultipleOptions() {
        Options options = PatternOptionBuilder.parsePattern("ab");
        assertEquals(2, options.getOptions().size());
        assertTrue(options.getOption("a").hasArg());
        assertFalse(options.getOption("a").isRequired());
        assertTrue(options.getOption("b").hasArg());
        assertFalse(options.getOption("b").isRequired());
    }

    @Test
    void testParsePattern_OptionWithArgAndRequired() {
        Options options = PatternOptionBuilder.parsePattern("a:b!");
        assertEquals(1, options.getOptions().size());
        assertTrue(options.getOption("a").hasArg());
        assertTrue(options.getOption("a").isRequired());
    }

    @Test
    void testParsePattern_ComplexPattern() {
        Options options = PatternOptionBuilder.parsePattern("a:b!c");
        assertEquals(2, options.getOptions().size());
        assertTrue(options.getOption("a").hasArg());
        assertTrue(options.getOption("a").isRequired());
        assertFalse(options.getOption("c").hasArg());
        assertFalse(options.getOption("c").isRequired());
    }
}