package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelpFormatterTest {

    @Test
    void testAppendOption_RequiredOptionWithShortOpt() {
        StringBuilder buff = new StringBuilder();
        Option option = new Option("a", "optionA", true, "Description");
        option.setArgName("argA");
        new HelpFormatter().appendOption(buff, option, true);
        assertEquals("a <argA>", buff.toString());
    }

    @Test
    void testAppendOption_RequiredOptionWithLongOpt() {
        StringBuilder buff = new StringBuilder();
        Option option = new Option(null, "optionB", true, "Description");
        option.setArgName("argB");
        new HelpFormatter().appendOption(buff, option, true);
        assertEquals("optionB <argB>", buff.toString());
    }

    @Test
    void testAppendOption_OptionalOptionWithShortOpt() {
        StringBuilder buff = new StringBuilder();
        Option option = new Option("c", "optionC", false, "Description");
        option.setArgName("argC");
        new HelpFormatter().appendOption(buff, option, false);
        assertEquals("[c <argC>]", buff.toString());
    }

    @Test
    void testAppendOption_OptionalOptionWithLongOpt() {
        StringBuilder buff = new StringBuilder();
        Option option = new Option(null, "optionD", false, "Description");
        option.setArgName("argD");
        new HelpFormatter().appendOption(buff, option, false);
        assertEquals("[optionD <argD>]", buff.toString());
    }

    @Test
    void testAppendOption_OptionalOptionWithoutArgName() {
        StringBuilder buff = new StringBuilder();
        Option option = new Option("e", "optionE", false, "Description");
        option.setArgName(null);
        new HelpFormatter().appendOption(buff, option, false);
        assertEquals("[e]", buff.toString());
    }

    @Test
    void testAppendOption_RequiredOptionWithoutArgName() {
        StringBuilder buff = new StringBuilder();
        Option option = new Option("f", "optionF", true, "Description");
        option.setArgName(null);
        new HelpFormatter().appendOption(buff, option, true);
        assertEquals("f <argName>", buff.toString());
    }
}