import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CommandLineTest {

    private CommandLine commandLine;

    @BeforeEach
    public void setUp() {
        // Initialize CommandLine with options
        commandLine = new CommandLine();
        // Add options to commandLine as needed for testing
    }

    @Test
    public void testGetOptionValues_NullOption() {
        String[] result = commandLine.getOptionValues(null);
        assertNull(result);
    }

    @Test
    public void testGetOptionValues_OptionNotPresent() {
        Option option = new Option("a", "optionA", false, "Option A");
        String[] result = commandLine.getOptionValues(option);
        assertNull(result);
    }

    @Test
    public void testGetOptionValues_OptionPresentWithValues() {
        Option option = new Option("b", "optionB", false, "Option B");
        option.addValue("value1");
        option.addValue("value2");
        commandLine.addOption(option);
        
        String[] result = commandLine.getOptionValues(option);
        assertArrayEquals(new String[]{"value1", "value2"}, result);
    }

    @Test
    public void testGetOptionValues_OptionPresentWithDeprecated() {
        Option option = new Option("c", "optionC", false, "Option C");
        option.setDeprecated(true);
        option.addValue("value3");
        commandLine.addOption(option);
        
        String[] result = commandLine.getOptionValues(option);
        assertArrayEquals(new String[]{"value3"}, result);
    }

    @Test
    public void testGetOptionValues_OptionPresentWithEmptyValues() {
        Option option = new Option("d", "optionD", false, "Option D");
        commandLine.addOption(option);
        
        String[] result = commandLine.getOptionValues(option);
        assertNull(result);
    }
}