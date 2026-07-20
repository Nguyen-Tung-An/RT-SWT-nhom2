import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class CommandLineTest {

    @Test
    void testGetParsedOptionValuesWithNullOption() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Supplier<String[]> defaultValue = () -> new String[]{"default"};
        String[] result = commandLine.getParsedOptionValues(null, defaultValue);
        assertArrayEquals(new String[]{"default"}, result);
    }

    @Test
    void testGetParsedOptionValuesWithOptionHavingNoValues() throws ParseException {
        Option option = Option.builder("o").hasArg().build();
        CommandLine commandLine = new CommandLine();
        Supplier<String[]> defaultValue = () -> new String[]{"default"};
        String[] result = commandLine.getParsedOptionValues(option, defaultValue);
        assertArrayEquals(new String[]{"default"}, result);
    }

    @Test
    void testGetParsedOptionValuesWithValidOption() throws ParseException {
        Option option = Option.builder("o").hasArgs().type(String.class).build();
        CommandLine commandLine = new CommandLine() {
            @Override
            public String[] getOptionValues(Option opt) {
                return new String[]{"value1", "value2"};
            }
        };
        Supplier<String[]> defaultValue = () -> new String[]{"default"};
        String[] result = commandLine.getParsedOptionValues(option, defaultValue);
        assertArrayEquals(new String[]{"value1", "value2"}, result);
    }

    @Test
    void testGetParsedOptionValuesWithConverterException() {
        Option option = Option.builder("o").hasArgs().type(String.class).build();
        option.setConverter(value -> {
            throw new RuntimeException("Conversion error");
        });
        CommandLine commandLine = new CommandLine() {
            @Override
            public String[] getOptionValues(Option opt) {
                return new String[]{"value1"};
            }
        };
        Supplier<String[]> defaultValue = () -> new String[]{"default"};
        Exception exception = assertThrows(ParseException.class, () -> {
            commandLine.getParsedOptionValues(option, defaultValue);
        });
        assertTrue(exception.getMessage().contains("Conversion error"));
    }
}