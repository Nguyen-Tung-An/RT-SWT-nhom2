import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Util;
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
        Method method = CommandLine.class.getMethod("getOptionValues", Option.class);
        String[] result = (String[]) method.invoke(commandLine, (Option) null);
        assertNull(result);
    }

    @Test
    void testGetOptionValues_EmptyOptionList() throws Exception {
        CommandLine commandLine = createCommandLine();
        Option option = new Option("a", "optionA", false, "An option");
        Method method = CommandLine.class.getMethod("getOptionValues", Option.class);
        String[] result = (String[]) method.invoke(commandLine, option);
        assertNull(result);
    }

    @Test
    void testGetOptionValues_OptionWithValues() throws Exception {
        CommandLine commandLine = createCommandLine();
        Option option = new Option("b", "optionB", true, "Another option");
        option.addValue("value1");
        option.addValue("value2");
        Method addOptionMethod = CommandLine.class.getDeclaredMethod("addOption", Option.class);
        addOptionMethod.setAccessible(true);
        addOptionMethod.invoke(commandLine, option);
        
        Method method = CommandLine.class.getMethod("getOptionValues", Option.class);
        String[] result = (String[]) method.invoke(commandLine, option);
        assertArrayEquals(new String[]{"value1", "value2"}, result);
    }

    @Test
    void testGetOptionValues_OptionIsDeprecated() throws Exception {
        CommandLine commandLine = createCommandLine();
        Option option = new Option("c", "optionC", true, "Deprecated option");
        option.addValue("deprecatedValue");
        Method addOptionMethod = CommandLine.class.getDeclaredMethod("addOption", Option.class);
        addOptionMethod.setAccessible(true);
        addOptionMethod.invoke(commandLine, option);
        
        Method method = CommandLine.class.getMethod("getOptionValues", Option.class);
        String[] result = (String[]) method.invoke(commandLine, option);
        assertArrayEquals(new String[]{"deprecatedValue"}, result);
    }

    @Test
    void testGetOptionValues_OptionWithNoValues() throws Exception {
        CommandLine commandLine = createCommandLine();
        Option option = new Option("d", "optionD", false, "Option with no values");
        Method addOptionMethod = CommandLine.class.getDeclaredMethod("addOption", Option.class);
        addOptionMethod.setAccessible(true);
        addOptionMethod.invoke(commandLine, option);
        
        Method method = CommandLine.class.getMethod("getOptionValues", Option.class);
        String[] result = (String[]) method.invoke(commandLine, option);
        assertArrayEquals(new String[]{}, result);
    }
}