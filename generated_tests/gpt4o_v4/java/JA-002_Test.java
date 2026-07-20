import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Util;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CommandLineTest {

    @Test
    void testGetOptionValues_NullOption() {
        CommandLine commandLine = new CommandLine();
        String[] result = commandLine.getOptionValues(null);
        assertNull(result);
    }

    @Test
    void testGetOptionValues_EmptyOptionList() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("a", "optionA", false, "An option");
        String[] result = commandLine.getOptionValues(option);
        assertNull(result);
    }

    @Test
    void testGetOptionValues_OptionWithValues() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("b", "optionB", true, "Another option");
        option.addValue("value1");
        option.addValue("value2");
        commandLine.addOption(option);
        
        String[] result = commandLine.getOptionValues(option);
        assertArrayEquals(new String[]{"value1", "value2"}, result);
    }

    @Test
    void testGetOptionValues_OptionIsDeprecated() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("c", "optionC", true, "Deprecated option");
        option.setDeprecated(true);
        option.addValue("deprecatedValue");
        commandLine.addOption(option);
        
        String[] result = commandLine.getOptionValues(option);
        assertArrayEquals(new String[]{"deprecatedValue"}, result);
    }

    @Test
    void testGetOptionValues_OptionWithNoValues() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("d", "optionD", false, "Option with no values");
        commandLine.addOption(option);
        
        String[] result = commandLine.getOptionValues(option);
        assertArrayEquals(new String[]{}, result);
    }
}