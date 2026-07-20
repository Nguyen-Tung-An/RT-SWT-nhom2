import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DefaultParserTest {

    private DefaultParser parser;

    @BeforeEach
    void setUp() {
        parser = new DefaultParser();
        Options options = new Options();
        options.addOption("a", false, "Option A");
        options.addOption("b", false, "Option B");
        parser.setOptions(options);
    }

    @Test
    void testIsShortOption_NullToken() {
        assertFalse(invokeIsShortOption(null));
    }

    @Test
    void testIsShortOption_EmptyToken() {
        assertFalse(invokeIsShortOption(""));
    }

    @Test
    void testIsShortOption_SingleDash() {
        assertFalse(invokeIsShortOption("-"));
    }

    @Test
    void testIsShortOption_ValidShortOption() {
        assertTrue(invokeIsShortOption("-a"));
    }

    @Test
    void testIsShortOption_ValidShortOptionWithValue() {
        assertTrue(invokeIsShortOption("-a=value"));
    }

    @Test
    void testIsShortOption_ConcatenatedShortOptions() {
        assertTrue(invokeIsShortOption("-ab"));
    }

    @Test
    void testIsShortOption_ConcatenatedShortOptionsWithValue() {
        assertTrue(invokeIsShortOption("-ab=value"));
    }

    @Test
    void testIsShortOption_InvalidShortOption() {
        assertFalse(invokeIsShortOption("-c"));
    }

    @Test
    void testIsShortOption_ConcatenatedInvalidShortOption() {
        assertFalse(invokeIsShortOption("-ac"));
    }

    private boolean invokeIsShortOption(String token) {
        try {
            var method = DefaultParser.class.getDeclaredMethod("isShortOption", String.class);
            method.setAccessible(true);
            return (boolean) method.invoke(parser, token);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}