package org.apache.commons.cli;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

public class NonOptionActionTest {
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
    void testHandleLongOptionWithEqual_UnknownToken() throws ParseException {
        String token = "--unknown=value";
        when(nonOptionAction.getMatchingLongOptions("--unknown")).thenReturn(Arrays.asList());
        
        parser.handleUnknownToken(token);
        
        verify(nonOptionAction).handleUnknownToken(token);
    }

    @Test
    void testHandleLongOptionWithEqual_AmbiguousOption() throws ParseException {
        String token = "--opt=value";
        when(nonOptionAction.getMatchingLongOptions("--opt")).thenReturn(Arrays.asList("--opt1", "--opt2"));
        when(options.hasLongOption("--opt")).thenReturn(false);
        
        assertThrows(AmbiguousOptionException.class, () -> {
            parser.handleLongOptionWithEqual(token);
        });
    }

    @Test
    void testHandleLongOptionWithEqual_OptionWithArg() throws ParseException {
        String token = "--opt=value";
        Option option = new Option("opt", true, "description");
        options.addOption(option);
        when(nonOptionAction.getMatchingLongOptions("--opt")).thenReturn(Arrays.asList("--opt"));
        when(options.hasLongOption("--opt")).thenReturn(true);
        when(options.getOption("--opt")).thenReturn(option);
        
        parser.handleLongOptionWithEqual(token);
        
        verify(nonOptionAction).handleOption(option);
        verify(nonOptionAction).currentOption.processValue("value");
    }

    @Test
    void testHandleLongOptionWithEqual_OptionWithoutArg() throws ParseException {
        String token = "--opt";
        Option option = new Option("opt", false, "description");
        options.addOption(option);
        when(nonOptionAction.getMatchingLongOptions("--opt")).thenReturn(Arrays.asList("--opt"));
        when(options.hasLongOption("--opt")).thenReturn(true);
        when(options.getOption("--opt")).thenReturn(option);
        
        parser.handleLongOptionWithEqual(token);
        
        verify(nonOptionAction).handleUnknownToken(token);
    }
}