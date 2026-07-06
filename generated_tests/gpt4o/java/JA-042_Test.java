package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DefaultParserTest {

    private final DefaultParser parser = new DefaultParser();

    @Test
    void testHandleUnknownToken_ThrowAction() {
        parser.setNonOptionAction(NonOptionAction.THROW);
        Exception exception = assertThrows(UnrecognizedOptionException.class, () -> {
            parser.handleUnknownToken("--unknown");
        });
        assertEquals("Unrecognized option: --unknown", exception.getMessage());
    }

    @Test
    void testHandleUnknownToken_IgnoreAction() {
        parser.setNonOptionAction(NonOptionAction.IGNORE);
        parser.handleUnknownToken("--unknown");
        // No exception should be thrown, and we can verify the state if needed
    }

    @Test
    void testHandleUnknownToken_StopAction() {
        parser.setNonOptionAction(NonOptionAction.STOP);
        parser.handleUnknownToken("--unknown");
        assertTrue(parser.isSkipParsing());
    }

    @Test
    void testHandleUnknownToken_EmptyToken() {
        parser.setNonOptionAction(NonOptionAction.THROW);
        parser.handleUnknownToken("");
        // No exception should be thrown, and we can verify the state if needed
    }

    @Test
    void testHandleUnknownToken_DefaultOptPrefixOnly() {
        parser.setNonOptionAction(NonOptionAction.THROW);
        Exception exception = assertThrows(UnrecognizedOptionException.class, () -> {
            parser.handleUnknownToken(OptionFormatter.DEFAULT_OPT_PREFIX);
        });
        assertEquals("Unrecognized option: " + OptionFormatter.DEFAULT_OPT_PREFIX, exception.getMessage());
    }

    @Test
    void testHandleUnknownToken_ValidToken() {
        parser.setNonOptionAction(NonOptionAction.IGNORE);
        parser.handleUnknownToken("validToken");
        // No exception should be thrown, and we can verify the state if needed
    }
}