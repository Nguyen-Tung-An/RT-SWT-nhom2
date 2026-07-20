import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CommandLineTest {

    private CommandLine createCommandLine() throws Exception {
        Constructor<CommandLine> constructor = CommandLine.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        return constructor.newInstance();
    }

    @Test
    void testGetOptionValues_NullOption() throws Exception {
        CommandLine commandLine = createCommandLine();
        String[] result = (String[]) CommandLine.class.getMethod("getOptionValues", Option.class).invoke(commandLine, (Option) null);
        assertNull(result);
    }

    @Test
    void testGetOptionValues_EmptyOptionList() throws Exception {
        CommandLine commandLine = createCommandLine();
        Option option = new Option("a", "optionA", false, "An option");
        commandLine.getClass().getMethod("addOption", Option.class).invoke(commandLine, option);
        String[] result = (String[]) CommandLine.class.getMethod("getOptionValues", Option.class).invoke(commandLine, option);
        assertNull(result);
    }

    @Test
    void testGetOptionValues_OptionWithValues() throws Exception {
        CommandLine commandLine = createCommandLine();
        Option option = new Option("b", "optionB", true, "Another option");
        List<String> values = new ArrayList<>();
        values.add("value1");
        values.add("value2");
        option.getClass().getMethod("addValues", List.class).invoke(option, values);
        commandLine.getClass().getMethod("addOption", Option.class).invoke(commandLine, option);
        
        String[] result = (String[]) CommandLine.class.getMethod("getOptionValues", Option.class).invoke(commandLine, option);
        assertArrayEquals(new String[]{"value1", "value2"}, result);
    }

    @Test
    void testGetOptionValues_OptionIsDeprecated() throws Exception {
        CommandLine commandLine = createCommandLine();
        Option option = new Option("c", "optionC", true, "Deprecated option");
        commandLine.getClass().getMethod("addOption", Option.class).invoke(commandLine, option);
        
        List<String> values = new ArrayList<>();
        values.add("deprecatedValue");
        option.getClass().getMethod("addValues", List.class).invoke(option, values);
        
        String[] result = (String[]) CommandLine.class.getMethod("getOptionValues", Option.class).invoke(commandLine, option);
        assertArrayEquals(new String[]{"deprecatedValue"}, result);
    }

    @Test
    void testGetOptionValues_OptionWithNoValues() throws Exception {
        CommandLine commandLine = createCommandLine();
        Option option = new Option("d", "optionD", false, "Option with no values");
        commandLine.getClass().getMethod("addOption", Option.class).invoke(commandLine, option);
        
        String[] result = (String[]) CommandLine.class.getMethod("getOptionValues", Option.class).invoke(commandLine, option);
        assertArrayEquals(new String[]{}, result);
    }
}