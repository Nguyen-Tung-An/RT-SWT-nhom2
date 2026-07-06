package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelpFormatterTest {

    @Test
    void testAppendOption_OptionalWithShortOpt() {
        StringBuilder buff = new StringBuilder();
        Option option = new Option("a", "alpha", true, "Alpha option");
        option.setArgName("arg");
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendOption(buff, option, false);
        assertEquals("[--alpha <arg>]", buff.toString());
    }

    @Test
    void testAppendOption_OptionalWithLongOpt() {
        StringBuilder buff = new StringBuilder();
        Option option = new Option(null, "beta", true, "Beta option");
        option.setArgName("arg");
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendOption(buff, option, false);
        assertEquals("[--beta <arg>]", buff.toString());
    }

    @Test
    void testAppendOption_RequiredWithShortOpt() {
        StringBuilder buff = new StringBuilder();
        Option option = new Option("c", "charlie", false, "Charlie option");
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendOption(buff, option, true);
        assertEquals("--charlie", buff.toString());
    }

    @Test
    void testAppendOption_RequiredWithLongOpt() {
        StringBuilder buff = new StringBuilder();
        Option option = new Option(null, "delta", false, "Delta option");
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendOption(buff, option, true);
        assertEquals("--delta", buff.toString());
    }

    @Test
    void testAppendOption_OptionalWithNoArgName() {
        StringBuilder buff = new StringBuilder();
        Option option = new Option("e", "echo", true, "Echo option");
        option.setArgName(null);
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendOption(buff, option, false);
        assertEquals("[--echo <arg>]", buff.toString());
    }

    @Test
    void testAppendOption_OptionalWithEmptyArgName() {
        StringBuilder buff = new StringBuilder();
        Option option = new Option("f", "foxtrot", true, "Foxtrot option");
        option.setArgName("");
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendOption(buff, option, false);
        assertEquals("[--foxtrot <arg>]", buff.toString());
    }
}