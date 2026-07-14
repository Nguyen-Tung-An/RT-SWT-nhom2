package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DefaultParserTest {

    private final DefaultParser parser = new DefaultParser();

    @Test
    void testHandleUnknownToken_ThrowsException() {
        NonOptionAction action = NonOptionAction.THROW;
        String token = "--unknownOption";
        parser.setNonOptionAction(action);
        assertThrows(UnrecognizedOptionException.class, () -> {
            parser.handleUnknownToken(token);
        });
    }

    @Test
    void testHandleUnknownToken_AddsArgument() {
        String token = "unknownArg";
        parser.handleUnknownToken(token);
        // Assuming addArg method is accessible for testing or we can verify the state change
        // This would require a way to check the internal state of the parser
    }

    @Test
    void testHandleUnknownToken_StopsParsing() {
        String token = "--stopOption";
        parser.setNonOptionAction(NonOptionAction.STOP);
        parser.handleUnknownToken(token);
        // Verify that skipParsing is set to true
        // This would require access to the internal state of the parser
    }

    @Test
    void testHandleUnknownToken_IgnoresToken() {
        String token = "--ignoreOption";
        parser.setNonOptionAction(NonOptionAction.IGNORE);
        parser.handleUnknownToken(token);
        // Verify that the token is ignored and not added
        // This would require access to the internal state of the parser
    }

    @Test
    void testHandleUnknownToken_EmptyToken() {
        String token = "";
        parser.handleUnknownToken(token);
        // Verify that the empty token is handled correctly
        // This would require access to the internal state of the parser
    }
}