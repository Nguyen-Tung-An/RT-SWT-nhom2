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
        assertFalse(parser.isLongOption("a"));
    }

    @Test
    void testIsLongOption_NoPrefixToken() {
        assertFalse(parser.isLongOption("option"));
    }

    @Test
    void testIsLongOption_LongOptionWithPrefix() {
        assertTrue(parser.isLongOption("--option"));
    }

    @Test
    void testIsLongOption_LongOptionWithEqual() {
        assertTrue(parser.isLongOption("--option=value"));
    }

    @Test
    void testIsLongOption_PartialLongOption() {
        assertFalse(parser.isLongOption("-o"));
    }

    @Test
    void testIsLongOption_LongOptionWithDifferentPrefix() {
        assertFalse(parser.isLongOption("-L=value"));
    }

    @Test
    void testIsLongOption_ValidLongOption() {
        assertTrue(parser.isLongOption("--valid-option"));
    }

    @Test
    void testIsLongOption_InvalidLongOption() {
        assertFalse(parser.isLongOption("--invalid-option-"));
    }
}