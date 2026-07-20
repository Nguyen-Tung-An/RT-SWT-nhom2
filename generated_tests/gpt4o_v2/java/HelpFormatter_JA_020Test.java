import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelpFormatterTest {

    @Test
    void testAppendOptionGroupWithRequiredGroup() {
        HelpFormatter formatter = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        optionGroup.addOption(new Option("a", "optionA", false, "Option A"));
        optionGroup.addOption(new Option("b", "optionB", false, "Option B"));

        formatter.appendOptionGroup(buff, optionGroup);

        assertEquals("optionA, optionB", buff.toString());
    }

    @Test
    void testAppendOptionGroupWithOptionalGroup() {
        HelpFormatter formatter = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        optionGroup.addOption(new Option("c", "optionC", false, "Option C"));
        optionGroup.addOption(new Option("d", "optionD", false, "Option D"));

        formatter.appendOptionGroup(buff, optionGroup);

        assertEquals("[optionC, optionD]", buff.toString());
    }

    @Test
    void testAppendOptionGroupWithEmptyGroup() {
        HelpFormatter formatter = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);

        formatter.appendOptionGroup(buff, optionGroup);

        assertEquals("[]", buff.toString());
    }

    @Test
    void testAppendOptionGroupWithSingleOption() {
        HelpFormatter formatter = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        optionGroup.addOption(new Option("e", "optionE", false, "Option E"));

        formatter.appendOptionGroup(buff, optionGroup);

        assertEquals("[optionE]", buff.toString());
    }

    @Test
    void testAppendOptionGroupWithComparator() {
        HelpFormatter formatter = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        optionGroup.addOption(new Option("f", "optionF", false, "Option F"));
        optionGroup.addOption(new Option("g", "optionG", false, "Option G"));

        // Set a custom comparator
        optionGroup.setOptions(Arrays.asList(optionGroup.getOptions().get(1), optionGroup.getOptions().get(0)));

        formatter.appendOptionGroup(buff, optionGroup);

        assertEquals("[optionG, optionF]", buff.toString());
    }
}