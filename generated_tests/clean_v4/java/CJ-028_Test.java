package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.LinkedList;

public class ParserTest {

    @Test
    public void testProcessArgs_ValidOption() throws ParseException {
        Parser parser = new Parser();
        Option option = new Option("o", "option", true, "an option");
        ListIterator<String> iter = new LinkedList<>(Arrays.asList("--option", "value")).listIterator();
        
        parser.processArgs(option, iter);
        
        Assertions.assertFalse(option.isValuesEmpty());
        Assertions.assertEquals("value", option.getValues()[0]);
    }

    @Test
    public void testProcessArgs_EmptyOptionWithoutArg() {
        Parser parser = new Parser();
        Option option = new Option("o", "option", false, "an option");
        ListIterator<String> iter = new LinkedList<>(Arrays.asList("--option")).listIterator();
        
        Assertions.assertThrows(MissingArgumentException.class, () -> {
            parser.processArgs(option, iter);
        });
    }

    @Test
    public void testProcessArgs_InvalidOption() {
        Parser parser = new Parser();
        Option option = new Option("o", "option", true, "an option");
        ListIterator<String> iter = new LinkedList<>(Arrays.asList("--invalid")).listIterator();
        
        Assertions.assertThrows(MissingArgumentException.class, () -> {
            parser.processArgs(option, iter);
        });
    }

    @Test
    public void testProcessArgs_ValidOptionWithQuotes() throws ParseException {
        Parser parser = new Parser();
        Option option = new Option("o", "option", true, "an option");
        ListIterator<String> iter = new LinkedList<>(Arrays.asList("--option", "\"quoted value\"")).listIterator();
        
        parser.processArgs(option, iter);
        
        Assertions.assertFalse(option.isValuesEmpty());
        Assertions.assertEquals("quoted value", option.getValues()[0]);
    }

    @Test
    public void testProcessArgs_RuntimeExceptionDuringProcessing() {
        Parser parser = new Parser();
        Option option = new Option("o", "option", true, "an option") {
            @Override
            public void processValue(String value) {
                throw new RuntimeException("Processing error");
            }
        };
        ListIterator<String> iter = new LinkedList<>(Arrays.asList("someValue")).listIterator();
        
        Assertions.assertThrows(MissingArgumentException.class, () -> {
            parser.processArgs(option, iter);
        });
    }
}