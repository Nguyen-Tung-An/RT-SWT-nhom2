import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultParserTest {

    private DefaultParser parser;

    @BeforeEach
    void setUp() {
        parser = new DefaultParser();
    }

    @Test
    void testHandleUnknownToken_ThrowsException_WhenTokenIsUnrecognizedOption() {
        parser.setNonOptionAction(DefaultParser.NonOptionAction.THROW);
        String token = "--unknown";

        UnrecognizedOptionException exception = assertThrows(UnrecognizedOptionException.class, () -> {
            parser.handleUnknownToken(token);
        });

        assertEquals("Unrecognized option: " + token, exception.getMessage());
    }

    @Test
    void testHandleUnknownToken_AddsArg_WhenTokenIsNotAnOption() throws ParseException {
        parser.setNonOptionAction(DefaultParser.NonOptionAction.IGNORE);
        String token = "arg";

        parser.handleUnknownToken(token);

        // Assuming addArg modifies some internal state, we need to verify that state.
        // This part is pseudo-code as we don't have access to the internals of DefaultParser.
        assertTrue(parser.getArgs().contains(token)); // Replace with actual method to check args
    }

    @Test
    void testHandleUnknownToken_AddsArg_WhenTokenIsDefaultOptPrefixButIgnored() throws ParseException {
        parser.setNonOptionAction(DefaultParser.NonOptionAction.IGNORE);
        String token = "-";

        parser.handleUnknownToken(token);

        // Assuming addArg modifies some internal state, we need to verify that state.
        assertTrue(parser.getArgs().contains(token)); // Replace with actual method to check args
    }

    @Test
    void testHandleUnknownToken_SetsSkipParsing_WhenNonOptionActionIsStop() throws ParseException {
        parser.setNonOptionAction(DefaultParser.NonOptionAction.STOP);
        String token = "--unknown";

        parser.handleUnknownToken(token);

        // Assuming skipParsing is a boolean field, we need to verify its state.
        assertTrue(parser.isSkipParsing()); // Replace with actual method to check skipParsing
    }

    @Test
    void testHandleUnknownToken_DoesNotThrow_WhenTokenIsDefaultOptPrefixAndIgnored() throws ParseException {
        parser.setNonOptionAction(DefaultParser.NonOptionAction.IGNORE);
        String token = "-";

        assertDoesNotThrow(() -> parser.handleUnknownToken(token));
    }
}