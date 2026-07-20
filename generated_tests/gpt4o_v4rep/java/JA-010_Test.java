import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class CommandLineTest {

    private CommandLine createCommandLine() throws Exception {
        Constructor<CommandLine> constructor = CommandLine.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        return constructor.newInstance();
    }

    @Test
    void testGetParsedOptionValuesWithNullOption() throws Exception {
        CommandLine commandLine = createCommandLine();
        Supplier<String[]> defaultValue = () -> new String[]{"default"};
        String[] result = commandLine.getParsedOptionValues((Option) null, defaultValue);
        assertArrayEquals(new String[]{"default"}, result);
    }

    @Test
    void testGetParsedOptionValuesWithOptionHavingNoValues() throws Exception {
        Option option = Option.builder("o").hasArg().build();
        CommandLine commandLine = createCommandLine();
        Supplier<String[]> defaultValue = () -> new String[]{"default"};
        String[] result = commandLine.getParsedOptionValues(option, defaultValue);
        assertArrayEquals(new String[]{"default"}, result);
    }

    @Test
    void testGetParsedOptionValuesWithValidOption() throws Exception {
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
    void testGetParsedOptionValuesWithConverterException() throws Exception {
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