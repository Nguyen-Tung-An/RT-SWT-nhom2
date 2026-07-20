import org.apache.commons.cli.DefaultParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DefaultParserTest {

    private final DefaultParser parser = new DefaultParser();

    @Test
    void testIsLongOption_NullToken() {
        assertFalse(invokeIsLongOption(null));
    }

    @Test
    void testIsLongOption_EmptyToken() {
        assertFalse(invokeIsLongOption(""));
    }

    @Test
    void testIsLongOption_SingleCharacterToken() {
        assertFalse(invokeIsLongOption("-"));
    }

    @Test
    void testIsLongOption_InvalidPrefix() {
        assertFalse(invokeIsLongOption("A"));
    }

    @Test
    void testIsLongOption_ValidLongOption() {
        assertTrue(invokeIsLongOption("--option"));
    }

    @Test
    void testIsLongOption_PartialLongOption() {
        assertTrue(invokeIsLongOption("--op"));
    }

    @Test
    void testIsLongOption_LongOptionWithValue() {
        assertTrue(invokeIsLongOption("--option=value"));
    }

    @Test
    void testIsLongOption_ShortOptionWithValue() {
        assertTrue(invokeIsLongOption("-o=value"));
    }

    @Test
    void testIsLongOption_InvalidLongOption() {
        assertFalse(invokeIsLongOption("--invalidOption"));
    }

    @Test
    void testIsLongOption_ShortOptionWithoutValue() {
        assertFalse(invokeIsLongOption("-o"));
    }

    private boolean invokeIsLongOption(String token) {
        try {
            var method = DefaultParser.class.getDeclaredMethod("isLongOption", String.class);
            method.setAccessible(true);
            return (boolean) method.invoke(parser, token);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}