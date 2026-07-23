package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ParserTest {

    @Test
    void testProcessArgs_OptionFound() throws ParseException {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasOptionalArg()).thenReturn(false);
        Mockito.when(option.isValuesEmpty()).thenReturn(true);

        ListIterator<String> iter = Arrays.asList("--option", "value").listIterator();
        Parser parser = new Parser();
        
        parser.processArgs(option, iter);
        
        Mockito.verify(option, Mockito.times(1)).processValue("value");
    }

    @Test
    void testProcessArgs_NoOptionFound() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasOptionalArg()).thenReturn(false);
        Mockito.when(option.isValuesEmpty()).thenReturn(true);

        ListIterator<String> iter = Arrays.asList("value").listIterator();
        Parser parser = new Parser();
        
        assertThrows(MissingArgumentException.class, () -> {
            parser.processArgs(option, iter);
        });
    }

    @Test
    void testProcessArgs_RuntimeExceptionCaught() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasOptionalArg()).thenReturn(false);
        Mockito.when(option.isValuesEmpty()).thenReturn(true);
        
        Mockito.doThrow(new RuntimeException()).when(option).processValue(Mockito.anyString());

        ListIterator<String> iter = Arrays.asList("--option", "value").listIterator();
        Parser parser = new Parser();
        
        assertThrows(MissingArgumentException.class, () -> {
            parser.processArgs(option, iter);
        });
    }

    @Test
    void testProcessArgs_EmptyIterator() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasOptionalArg()).thenReturn(false);
        Mockito.when(option.isValuesEmpty()).thenReturn(true);

        ListIterator<String> iter = Arrays.asList().listIterator();
        Parser parser = new Parser();
        
        assertThrows(MissingArgumentException.class, () -> {
            parser.processArgs(option, iter);
        });
    }

    @Test
    void testProcessArgs_OptionWithOptionalArg() throws ParseException {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasOptionalArg()).thenReturn(true);
        Mockito.when(option.isValuesEmpty()).thenReturn(true);

        ListIterator<String> iter = Arrays.asList("--option").listIterator();
        Parser parser = new Parser();
        
        parser.processArgs(option, iter);
        
        Mockito.verify(option, Mockito.never()).processValue(Mockito.anyString());
    }
}