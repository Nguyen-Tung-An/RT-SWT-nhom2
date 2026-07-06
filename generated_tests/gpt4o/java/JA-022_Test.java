package org.apache.commons.cli;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class DefaultParserTest {
    private DefaultParser parser;
    private Options options;
    private NonOptionAction nonOptionAction;

    @BeforeEach
    void setUp() {
        parser = new DefaultParser();
        options = mock(Options.class);
        nonOptionAction = NonOptionAction.STOP;
        parser.setOptions(options);
        parser.setNonOptionAction(nonOptionAction);
    }

    @Test
    void testHandleConcatenatedOptions_UnknownToken() throws ParseException {
        when(options.hasOption("a")).thenReturn(false);
        parser.handleConcatenatedOptions("a");
        // Verify that handleUnknownToken is called with the correct argument
        // This requires additional mocking and verification based on the implementation
    }

    @Test
    void testHandleConcatenatedOptions_KnownOptionWithoutArgument() throws ParseException {
        when(options.hasOption("b")).thenReturn(true);
        when(options.getOption("b")).thenReturn(mock(Option.class));
        parser.handleConcatenatedOptions("b");
        // Verify that handleOption is called with the correct option
        verify(options).getOption("b");
    }

    @Test
    void testHandleConcatenatedOptions_KnownOptionWithArgument() throws ParseException {
        when(options.hasOption("c")).thenReturn(true);
        Option optionC = mock(Option.class);
        when(options.getOption("c")).thenReturn(optionC);
        parser.handleConcatenatedOptions("cvalue");
        // Verify that processValue is called with the correct argument
        verify(optionC).processValue("value");
    }

    @Test
    void testHandleConcatenatedOptions_MultipleOptions() throws ParseException {
        when(options.hasOption("d")).thenReturn(true);
        when(options.hasOption("e")).thenReturn(true);
        when(options.getOption("d")).thenReturn(mock(Option.class));
        when(options.getOption("e")).thenReturn(mock(Option.class));
        parser.handleConcatenatedOptions("de");
        // Verify that both options are processed
        verify(options).getOption("d");
        verify(options).getOption("e");
    }
}