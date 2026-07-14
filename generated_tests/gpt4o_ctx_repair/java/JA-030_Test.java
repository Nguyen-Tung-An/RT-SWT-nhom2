package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DefaultParserTest {

    private final DefaultParser parser = new DefaultParser();

    @Test
    void testIsShortOption_NullToken() {
        assertFalse(DefaultParser.NonOptionAction.isShortOption(null));
    }

    @Test
    void testIsShortOption_EmptyToken() {
        assertFalse(DefaultParser.NonOptionAction.isShortOption(""));
    }

    @Test
    void testIsShortOption_SingleDash() {
        assertFalse(DefaultParser.NonOptionAction.isShortOption("-"));
    }

    @Test
    void testIsShortOption_ValidShortOption() {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        parser.setOptions(options);
        assertTrue(DefaultParser.NonOptionAction.isShortOption("-a"));
    }

    @Test
    void testIsShortOption_ValidShortOptionWithValue() {
        Options options = new Options();
        options.addOption("a", true, "Option A");
        parser.setOptions(options);
        assertTrue(DefaultParser.NonOptionAction.isShortOption("-a=value"));
    }

    @Test
    void testIsShortOption_ConcatenatedShortOptions() {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        options.addOption("b", false, "Option B");
        parser.setOptions(options);
        assertTrue(DefaultParser.NonOptionAction.isShortOption("-ab"));
    }

    @Test
    void testIsShortOption_InvalidShortOption() {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        parser.setOptions(options);
        assertFalse(DefaultParser.NonOptionAction.isShortOption("-c"));
    }

    @Test
    void testIsShortOption_ConcatenatedInvalidShortOption() {
        Options options = new Options();
        options.addOption("a", false, "Option A");
        parser.setOptions(options);
        assertFalse(DefaultParser.NonOptionAction.isShortOption("-ac"));
    }

    @Test
    void testIsShortOption_EmptyAfterDash() {
        assertFalse(DefaultParser.NonOptionAction.isShortOption("-"));
    }
}