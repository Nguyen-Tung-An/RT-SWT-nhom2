package org.apache.commons.cli.help;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.OptionBuilder;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractHelpFormatterTest {

    @Test
    void testToSyntaxOptions_EmptyGroup() {
        OptionGroup group = new OptionGroup();
        assertEquals("", new AbstractHelpFormatter().toSyntaxOptions(group));
    }

    @Test
    void testToSyntaxOptions_RequiredOptions() {
        Option option1 = OptionBuilder.withArgName("arg1").hasArg().create("o1");
        Option option2 = OptionBuilder.withArgName("arg2").hasArg().create("o2");
        OptionGroup group = new OptionGroup();
        group.addOption(option1);
        group.addOption(option2);
        group.setRequired(true);
        
        String expected = "o1 [arg1] o2 [arg2]";
        assertEquals(expected, new AbstractHelpFormatter().toSyntaxOptions(group));
    }

    @Test
    void testToSyntaxOptions_OptionalOptions() {
        Option option1 = OptionBuilder.withArgName("arg1").hasArg().create("o1");
        Option option2 = OptionBuilder.withArgName("arg2").hasArg().create("o2");
        OptionGroup group = new OptionGroup();
        group.addOption(option1);
        group.addOption(option2);
        group.setRequired(false);
        
        String expected = "o1 [arg1] o2 [arg2]";
        assertEquals(expected, new AbstractHelpFormatter().toSyntaxOptions(group));
    }

    @Test
    void testToSyntaxOptions_SingleOption() {
        Option option = OptionBuilder.withArgName("arg").hasArg().create("o1");
        OptionGroup group = new OptionGroup();
        group.addOption(option);
        group.setRequired(true);
        
        String expected = "o1 [arg]";
        assertEquals(expected, new AbstractHelpFormatter().toSyntaxOptions(group));
    }
}