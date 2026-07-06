package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;

public class HelpFormatterTest {

    @Test
    void testAppendOptionGroup_OptionalGroup() {
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup(false, Arrays.asList(new Option("a", "Option A"), new Option("b", "Option B")));
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendOptionGroup(buff, optionGroup);
        assertEquals("[Option A, Option B]", buff.toString());
    }

    @Test
    void testAppendOptionGroup_RequiredGroup() {
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup(true, Arrays.asList(new Option("a", "Option A"), new Option("b", "Option B")));
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendOptionGroup(buff, optionGroup);
        assertEquals("Option A, Option B", buff.toString());
    }

    @Test
    void testAppendOptionGroup_EmptyGroup() {
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup(false, Collections.emptyList());
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendOptionGroup(buff, optionGroup);
        assertEquals("[]", buff.toString());
    }

    @Test
    void testAppendOptionGroup_SortedOptions() {
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup(false, Arrays.asList(new Option("b", "Option B"), new Option("a", "Option A")));
        HelpFormatter formatter = new HelpFormatter();
        formatter.setOptionComparator((o1, o2) -> o1.getOpt().compareTo(o2.getOpt()));
        formatter.appendOptionGroup(buff, optionGroup);
        assertEquals("[Option A, Option B]", buff.toString());
    }
}