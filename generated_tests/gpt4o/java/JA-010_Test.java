package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.function.Supplier;

public class CommandLineTest {

    @Test
    void testGetParsedOptionValues_NullOption() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Supplier<String[]> defaultValue = () -> new String[]{"default"};
        String[] result = commandLine.getParsedOptionValues(null, defaultValue);
        assertArrayEquals(new String[]{"default"}, result);
    }

    @Test
    void testGetParsedOptionValues_OptionWithNullValues() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("test", String.class);
        Supplier<String[]> defaultValue = () -> new String[]{"default"};
        String[] result = commandLine.getParsedOptionValues(option, defaultValue);
        assertArrayEquals(new String[]{"default"}, result);
    }

    @Test
    void testGetParsedOptionValues_ValidOption() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("test", String.class);
        option.setValues(new String[]{"value1", "value2"});
        Supplier<String[]> defaultValue = () -> new String[]{"default"};
        String[] result = commandLine.getParsedOptionValues(option, defaultValue);
        assertArrayEquals(new String[]{"value1", "value2"}, result);
    }

    @Test
    void testGetParsedOptionValues_OptionWithConverter() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("test", Integer.class);
        option.setConverter(value -> Integer.valueOf(value));
        option.setValues(new String[]{"1", "2", "3"});
        Supplier<Integer[]> defaultValue = () -> new Integer[]{0};
        Integer[] result = commandLine.getParsedOptionValues(option, defaultValue);
        assertArrayEquals(new Integer[]{1, 2, 3}, result);
    }

    @Test
    void testGetParsedOptionValues_ExceptionInConversion() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("test", Integer.class);
        option.setConverter(value -> {
            throw new RuntimeException("Conversion error");
        });
        option.setValues(new String[]{"invalid"});
        Supplier<Integer[]> defaultValue = () -> new Integer[]{0};
        Exception exception = assertThrows(ParseException.class, () -> {
            commandLine.getParsedOptionValues(option, defaultValue);
        });
        assertTrue(exception.getMessage().contains("Conversion error"));
    }
}