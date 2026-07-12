package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DefaultParserTest {

    private final DefaultParser parser = new DefaultParser();

    @Test
    void testIsLongOption_NullToken() {
        assertFalse(parser.isLongOption(null));
    }

    @Test
    void testIsLongOption_EmptyToken() {
        assertFalse(parser.isLongOption(""));
    }

    @Test
    void testIsLongOption_SingleCharacterToken() {
        assertFalse(parser.isLongOption("-"));
    }

    @Test
    void testIsLongOption_InvalidPrefix() {
        assertFalse(parser.isLongOption("A"));
    }

    @Test
    void testIsLongOption_ValidLongOption() {
        assertTrue(parser.isLongOption("--option"));
    }

    @Test
    void testIsLongOption_PartialLongOption() {
        assertTrue(parser.isLongOption("--op"));
    }

    @Test
    void testIsLongOption_LongOptionWithValue() {
        assertTrue(parser.isLongOption("--option=value"));
    }

    @Test
    void testIsLongOption_ShortOptionWithValue() {
        assertTrue(parser.isLongOption("-o=value"));
    }

    @Test
    void testIsLongOption_InvalidLongOption() {
        assertFalse(parser.isLongOption("--invalidOption"));
    }

    @Test
    void testIsLongOption_ShortOption() {
        assertFalse(parser.isLongOption("-o"));
    }
}