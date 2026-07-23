package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.LinkedList;

public class ParserTest {

    @Test
    void testProcessArgs_OptionFound() throws ParseException {
        Option opt = new Option("o", true, "option");
        ListIterator<String> iter = new LinkedList<>(Arrays.asList("--option", "value")).listIterator();
        Parser parser = new Parser();
        parser.processArgs(opt, iter);
        assertFalse(opt.isValuesEmpty());
    }

    @Test
    void testProcessArgs_ValueProcessed() throws ParseException {
        Option opt = new Option("o", true, "option");
        ListIterator<String> iter = new LinkedList<>(Arrays.asList("--option", "\"value\"")).listIterator();
        Parser parser = new Parser();
        parser.processArgs(opt, iter);
        assertEquals("value", opt.getValues().get(0));
    }

    @Test
    void testProcessArgs_NoOptionFound() {
        Option opt = new Option("o", true, "option");
        ListIterator<String> iter = new LinkedList<>(Arrays.asList("value1", "value2")).listIterator();
        Parser parser = new Parser();
        assertThrows(MissingArgumentException.class, () -> parser.processArgs(opt, iter));
    }

    @Test
    void testProcessArgs_RuntimeExceptionCaught() {
        Option opt = new Option("o", true, "option");
        opt.setRequired(true);
        ListIterator<String> iter = new LinkedList<>(Arrays.asList("--option", "invalidValue")).listIterator();
        Parser parser = new Parser() {
            @Override
            public void processArgs(final Option opt, final ListIterator<String> iter) throws ParseException {
                super.processArgs(opt, iter);
                throw new RuntimeException("Test Exception");
            }
        };
        assertThrows(MissingArgumentException.class, () -> parser.processArgs(opt, iter));
    }

    @Test
    void testProcessArgs_OptionalArg() throws ParseException {
        Option opt = new Option("o", true, "option");
        opt.setOptionalArg(true);
        ListIterator<String> iter = new LinkedList<>(Arrays.asList("--option")).listIterator();
        Parser parser = new Parser();
        parser.processArgs(opt, iter);
        assertTrue(opt.hasOptionalArg());
    }
}