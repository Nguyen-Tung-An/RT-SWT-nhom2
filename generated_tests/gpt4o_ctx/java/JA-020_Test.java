package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class HelpFormatterTest {

    @Test
    void testAppendOptionGroup_OptionalGroup() {
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup(false, Arrays.asList(new Option("a", "optionA", false, "Option A"), new Option("b", "optionB", false, "Option B")));
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.appendOptionGroup(buff, optionGroup);
        assertEquals("[a, b]", buff.toString());
    }

    @Test
    void testAppendOptionGroup_RequiredGroup() {
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup(true, Arrays.asList(new Option("c", "optionC", false, "Option C"), new Option("d", "optionD", false, "Option D")));
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.appendOptionGroup(buff, optionGroup);
        assertEquals("c, d", buff.toString());
    }

    @Test
    void testAppendOptionGroup_EmptyGroup() {
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup(false, Arrays.asList());
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.appendOptionGroup(buff, optionGroup);
        assertEquals("[]", buff.toString());
    }

    @Test
    void testAppendOptionGroup_SingleOption() {
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup(false, Arrays.asList(new Option("e", "optionE", false, "Option E")));
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.appendOptionGroup(buff, optionGroup);
        assertEquals("[e]", buff.toString());
    }

    @Test
    void testAppendOptionGroup_SortedOptions() {
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup(false, Arrays.asList(new Option("b", "optionB", false, "Option B"), new Option("a", "optionA", false, "Option A")));
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setOptionComparator((o1, o2) -> o1.getOpt().compareTo(o2.getOpt()));
        helpFormatter.appendOptionGroup(buff, optionGroup);
        assertEquals("[a, b]", buff.toString());
    }
}