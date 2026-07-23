package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class OptionGroupTest {

    @Test
    void testToString_EmptyGroup() {
        OptionGroup group = new OptionGroup();
        assertEquals("[]", group.toString());
    }

    @Test
    void testToString_SingleOptionWithShortOpt() {
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "optionA", false, "This is option A");
        group.addOption(option);
        assertEquals("[--optionA]", group.toString());
    }

    @Test
    void testToString_SingleOptionWithLongOpt() {
        OptionGroup group = new OptionGroup();
        Option option = new Option(null, "optionB", false, "This is option B");
        group.addOption(option);
        assertEquals("[--optionB]", group.toString());
    }

    @Test
    void testToString_MultipleOptions() {
        OptionGroup group = new OptionGroup();
        Option option1 = new Option("a", "optionA", false, "This is option A");
        Option option2 = new Option(null, "optionB", false, "This is option B");
        group.addOption(option1);
        group.addOption(option2);
        assertEquals("[--optionA, --optionB]", group.toString());
    }

    @Test
    void testToString_OptionsWithDescriptions() {
        OptionGroup group = new OptionGroup();
        Option option1 = new Option("a", "optionA", false, "This is option A");
        Option option2 = new Option(null, "optionB", false, "This is option B");
        group.addOption(option1);
        group.addOption(option2);
        assertEquals("[--optionA This is option A, --optionB This is option B]", group.toString());
    }
}