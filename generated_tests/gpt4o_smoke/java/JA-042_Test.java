package org.apache.commons.cli;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

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
        assertTrue(parser.hasArg(token)); // Hypothetical method to check if the arg was added
    }

    @Test
    void testHandleUnknownToken_AddsArg_WhenTokenIsDefaultOptPrefix() {
        parser.nonOptionAction = NonOptionAction.IGNORE;
        String token = "-";

        parser.handleUnknownToken(token);

        // Assuming addArg modifies some internal state, we would need a way to verify that.
        assertTrue(parser.hasArg(token)); // Hypothetical method to check if the arg was added
    }

    @Test
    void testHandleUnknownToken_SetsSkipParsing_WhenNonOptionActionIsStop() {
        parser.nonOptionAction = NonOptionAction.STOP;
        String token = "--unknown";

        parser.handleUnknownToken(token);

        assertTrue(parser.skipParsing); // Assuming skipParsing is a public field or has a getter
    }
}