import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class CommandLineTest {

    @Test
    void testGetParsedOptionValuesWithNullOption() throws ParseException {
        CommandLine commandLine = new CommandLine();
        Supplier<String[]> defaultValue = () -> new String[]{"default1", "default2"};
        
        String[] result = commandLine.getParsedOptionValues(null, defaultValue);
        
        assertArrayEquals(new String[]{"default1", "default2"}, result);
    }

    @Test
    void testGetParsedOptionValuesWithOptionHavingNoValues() throws ParseException {
        Option option = Option.builder("o").hasArg().build();
        CommandLine commandLine = new CommandLine();
        Supplier<String[]> defaultValue = () -> new String[]{"default1", "default2"};
        
        String[] result = commandLine.getParsedOptionValues(option, defaultValue);
        
        assertArrayEquals(new String[]{"default1", "default2"}, result);
    }

    @Test
    void testGetParsedOptionValuesWithValidOption() throws ParseException {
        Option option = Option.builder("o").hasArgs().type(String.class).build();
        option.setValues(new String[]{"value1", "value2"});
        CommandLine commandLine = new CommandLine();
        Supplier<String[]> defaultValue = () -> new String[]{"default1", "default2"};
        
        String[] result = commandLine.getParsedOptionValues(option, defaultValue);
        
        assertArrayEquals(new String[]{"value1", "value2"}, result);
    }

    @Test
    void testGetParsedOptionValuesWithOptionConverterThrowingException() {
        Option option = Option.builder("o").hasArgs().type(String.class)
                .withType(String.class)
                .setConverter(value -> {
                    throw new RuntimeException("Conversion error");
                })
                .build();
        CommandLine commandLine = new CommandLine();
        Supplier<String[]> defaultValue = () -> new String[]{"default1", "default2"};
        
        assertThrows(ParseException.class, () -> {
            commandLine.getParsedOptionValues(option, defaultValue);
        });
    }
}