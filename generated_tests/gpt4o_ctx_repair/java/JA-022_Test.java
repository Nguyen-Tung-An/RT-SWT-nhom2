package org.apache.commons.cli;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class DefaultParserTest {
    private DefaultParser parser;
    private Options options;
    private NonOptionAction nonOptionAction;

    @BeforeEach
    void setUp() {
        parser = new DefaultParser();
        options = new Options();
        nonOptionAction = mock(NonOptionAction.class);
    }

    @Test
    void testHandleConcatenatedOptions_UnknownToken() throws ParseException {
        options.addOption("a", false, "Option A");
        parser.parse(options, new String[]{"-abc"}, nonOptionAction);
        verify(nonOptionAction).handleUnknownToken("c");
    }

    @Test
    void testHandleConcatenatedOptions_ValidOption() throws ParseException {
        options.addOption("a", false, "Option A");
        options.addOption("b", false, "Option B");
        parser.parse(options, new String[]{"-ab"}, nonOptionAction);
        // Verify that both options are handled correctly
        verify(nonOptionAction, never()).handleUnknownToken(anyString());
    }

    @Test
    void testHandleConcatenatedOptions_TrailingArgument() throws ParseException {
        options.addOption("a", true, "Option A with value");
        CommandLine cmd = parser.parse(options, new String[]{"-aValue"}, nonOptionAction);
        // Verify that the value is processed correctly
        assertEquals("Value", cmd.getOptionValue("a"));
    }

    @Test
    void testHandleConcatenatedOptions_StopsOnUnknownToken() throws ParseException {
        options.addOption("a", false, "Option A");
        parser.parse(options, new String[]{"-aX"}, nonOptionAction);
        verify(nonOptionAction).handleUnknownToken("X");
    }
}