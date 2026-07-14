package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.function.Supplier;

public class CommandLineBuilderTest {

    @Test
    void testGetParsedOptionValues_NullOption() {
        CommandLine.Builder builder = new CommandLine.Builder();
        Supplier<String[]> defaultValue = () -> new String[]{"default"};
        String[] result = builder.getParsedOptionValues(null, defaultValue);
        assertArrayEquals(new String[]{"default"}, result);
    }

    @Test
    void testGetParsedOptionValues_OptionWithNoValues() {
        CommandLine.Builder builder = new CommandLine.Builder();
        Option option = new Option("o", "option", false, "an option");
        builder.addOption(option);
        Supplier<String[]> defaultValue = () -> new String[]{"default"};
        String[] result = builder.getParsedOptionValues(option, defaultValue);
        assertArrayEquals(new String[]{"default"}, result);
    }

    @Test
    void testGetParsedOptionValues_OptionWithValues() {
        CommandLine.Builder builder = new CommandLine.Builder();
        Option option = new Option("o", "option", true, "an option");
        option.setValues(new String[]{"value1", "value2"});
        builder.addOption(option);
        Supplier<String[]> defaultValue = () -> new String[]{"default"};
        String[] result = builder.getParsedOptionValues(option, defaultValue);
        assertArrayEquals(new String[]{"value1", "value2"}, result);
    }

    @Test
    void testGetParsedOptionValues_OptionWithConverter() {
        CommandLine.Builder builder = new CommandLine.Builder();
        Option option = new Option("o", "option", true, "an option");
        option.setConverter(value -> Integer.parseInt(value));
        option.setValues(new String[]{"1", "2", "3"});
        builder.addOption(option);
        Supplier<Integer[]> defaultValue = () -> new Integer[]{0};
        Integer[] result = builder.getParsedOptionValues(option, defaultValue);
        assertArrayEquals(new Integer[]{1, 2, 3}, result);
    }

    @Test
    void testGetParsedOptionValues_ExceptionHandling() {
        CommandLine.Builder builder = new CommandLine.Builder();
        Option option = new Option("o", "option", true, "an option");
        option.setConverter(value -> {
            throw new RuntimeException("Conversion error");
        });
        option.setValues(new String[]{"value"});
        builder.addOption(option);
        Supplier<String[]> defaultValue = () -> new String[]{"default"};
        assertThrows(ParseException.class, () -> {
            builder.getParsedOptionValues(option, defaultValue);
        });
    }
}