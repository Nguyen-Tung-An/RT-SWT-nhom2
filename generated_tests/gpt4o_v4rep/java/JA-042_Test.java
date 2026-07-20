package org.apache.commons.cli;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.NonOptionAction;
import org.apache.commons.cli.UnrecognizedOptionException;
import org.apache.commons.cli.ParseException;

class DefaultParserTest {

    private DefaultParser parser;

    @BeforeEach
    void setUp() {
        parser = new DefaultParser();
    }

    @Test
    void testHandleUnknownToken_ThrowsException_WhenTokenStartsWithDefaultOptPrefixAndNonOptionActionIsThrow() {
        parser.nonOptionAction = NonOptionAction.THROW;
        String token = "--unknown";

        UnrecognizedOptionException exception = assertThrows(UnrecognizedOptionException.class, () -> {
            parser.handleUnknownToken(token);
        });

        assertEquals("Unrecognized option: " + token, exception.getMessage());
    }

    @Test
    void testHandleUnknownToken_AddsArg_WhenTokenDoesNotStartWithDefaultOptPrefix() {
        parser.nonOptionAction = NonOptionAction.IGNORE;
        String token = "unknown";

        parser.handleUnknownToken(token);

        // Assuming addArg modifies some internal state, we would need a way to verify that.
        // This is a placeholder for the actual assertion based on the internal state.
        assertTrue(hasArg(parser, token)); // Hypothetical method to check if the arg was added
    }

    @Test
    void testHandleUnknownToken_AddsArg_WhenTokenIsDefaultOptPrefix() {
        parser.nonOptionAction = NonOptionAction.IGNORE;
        String token = "-";

        parser.handleUnknownToken(token);

        // Assuming addArg modifies some internal state, we would need a way to verify that.
        assertTrue(hasArg(parser, token)); // Hypothetical method to check if the arg was added
    }

    @Test
    void testHandleUnknownToken_SetsSkipParsing_WhenNonOptionActionIsStop() {
        parser.nonOptionAction = NonOptionAction.STOP;
        String token = "--unknown";

        parser.handleUnknownToken(token);

        assertTrue(getSkipParsing(parser)); // Assuming skipParsing is a public field or has a getter
    }

    private boolean hasArg(DefaultParser parser, String token) {
        // Use reflection to access the private method or field that checks for args
        try {
            java.lang.reflect.Method method = DefaultParser.class.getDeclaredMethod("hasArg", String.class);
            method.setAccessible(true);
            return (boolean) method.invoke(parser, token);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private boolean getSkipParsing(DefaultParser parser) {
        // Use reflection to access the private field skipParsing
        try {
            java.lang.reflect.Field field = DefaultParser.class.getDeclaredField("skipParsing");
            field.setAccessible(true);
            return (boolean) field.get(parser);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}