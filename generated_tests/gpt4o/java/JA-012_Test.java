package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Collections;

public class DefaultParserTest {

    @Test
    void testHandleLongOptionWithEqual_UnknownToken() throws ParseException {
        DefaultParser parser = mock(DefaultParser.class);
        when(parser.getMatchingLongOptions("unknown")).thenReturn(Collections.emptyList());
        doNothing().when(parser).handleUnknownToken(anyString());

        parser.handleLongOptionWithEqual("unknown=value");

        verify(parser).handleUnknownToken(anyString());
    }

    @Test
    void testHandleLongOptionWithEqual_AmbiguousOption() throws ParseException {
        DefaultParser parser = mock(DefaultParser.class);
        when(parser.getMatchingLongOptions("opt")).thenReturn(Arrays.asList("opt1", "opt2"));
        when(parser.options.hasLongOption("opt")).thenReturn(false);

        assertThrows(AmbiguousOptionException.class, () -> {
            parser.handleLongOptionWithEqual("opt=value");
        });
    }

    @Test
    void testHandleLongOptionWithEqual_AcceptsArg() throws ParseException {
        DefaultParser parser = mock(DefaultParser.class);
        Option option = mock(Option.class);
        when(option.acceptsArg()).thenReturn(true);
        when(parser.getMatchingLongOptions("opt")).thenReturn(Collections.singletonList("opt"));
        when(parser.options.hasLongOption("opt")).thenReturn(true);
        when(parser.options.getOption("opt")).thenReturn(option);
        doNothing().when(parser).handleOption(option);
        doNothing().when(parser).currentOption.processValue(anyString());

        parser.handleLongOptionWithEqual("opt=value");

        verify(parser).handleOption(option);
        verify(parser.currentOption).processValue("value");
    }

    @Test
    void testHandleLongOptionWithEqual_DoesNotAcceptArg() throws ParseException {
        DefaultParser parser = mock(DefaultParser.class);
        Option option = mock(Option.class);
        when(option.acceptsArg()).thenReturn(false);
        when(parser.getMatchingLongOptions("opt")).thenReturn(Collections.singletonList("opt"));
        when(parser.options.hasLongOption("opt")).thenReturn(true);
        when(parser.options.getOption("opt")).thenReturn(option);
        doNothing().when(parser).handleUnknownToken(anyString());

        parser.handleLongOptionWithEqual("opt=value");

        verify(parser).handleUnknownToken(anyString());
    }
}