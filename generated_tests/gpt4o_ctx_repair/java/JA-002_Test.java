package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class CommandLineTest {

    @Test
    void testGetOptionValues_NullOption() {
        CommandLine commandLine = CommandLine.builder().build();
        assertNull(commandLine.getOptionValues(null));
    }

    @Test
    void testGetOptionValues_EmptyOptionList() {
        CommandLine commandLine = CommandLine.builder().build();
        Option option = new Option("a", "optionA", false, "An option");
        commandLine.addOption(option);
        assertNull(commandLine.getOptionValues(option));
    }

    @Test
    void testGetOptionValues_OptionNotFound() {
        CommandLine commandLine = CommandLine.builder().build();
        Option option = new Option("a", "optionA", false, "An option");
        commandLine.addOption(option);
        Option anotherOption = new Option("b", "optionB", false, "Another option");
        assertNull(commandLine.getOptionValues(anotherOption));
    }

    @Test
    void testGetOptionValues_OptionFound() {
        CommandLine commandLine = CommandLine.builder().build();
        Option option = new Option("a", "optionA", false, "An option");
        option.addValue("value1");
        option.addValue("value2");
        commandLine.addOption(option);
        String[] values = commandLine.getOptionValues(option);
        assertNotNull(values);
        assertArrayEquals(new String[]{"value1", "value2"}, values);
    }

    @Test
    void testGetOptionValues_OptionWithDeprecated() {
        CommandLine commandLine = CommandLine.builder().build();
        Option option = new Option("a", "optionA", false, "An option");
        option.setDeprecated(true);
        option.addValue("value1");
        commandLine.addOption(option);
        String[] values = commandLine.getOptionValues(option);
        assertNotNull(values);
        assertArrayEquals(new String[]{"value1"}, values);
    }
}