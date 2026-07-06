package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class CommandLineTest {

    @Test
    void testGetOptionValues_NullOption() {
        CommandLine commandLine = new CommandLine();
        assertNull(commandLine.getOptionValues(null));
    }

    @Test
    void testGetOptionValues_EmptyOptions() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("a", "optionA", false, "An option");
        assertNull(commandLine.getOptionValues(option));
    }

    @Test
    void testGetOptionValues_OptionNotFound() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("a", "optionA", false, "An option");
        commandLine.addOption(new Option("b", "optionB", false, "Another option"));
        assertNull(commandLine.getOptionValues(option));
    }

    @Test
    void testGetOptionValues_OptionFound() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("a", "optionA", false, "An option");
        option.addValue("value1");
        commandLine.addOption(option);
        assertArrayEquals(new String[]{"value1"}, commandLine.getOptionValues(option));
    }

    @Test
    void testGetOptionValues_OptionWithMultipleValues() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("a", "optionA", false, "An option");
        option.addValue("value1");
        option.addValue("value2");
        commandLine.addOption(option);
        assertArrayEquals(new String[]{"value1", "value2"}, commandLine.getOptionValues(option));
    }

    @Test
    void testGetOptionValues_DeprecatedOption() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("a", "optionA", false, "An option");
        option.setDeprecated(true);
        option.addValue("value1");
        commandLine.addOption(option);
        assertArrayEquals(new String[]{"value1"}, commandLine.getOptionValues(option));
    }
}