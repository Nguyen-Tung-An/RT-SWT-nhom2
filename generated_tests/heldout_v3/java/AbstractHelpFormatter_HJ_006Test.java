import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.help.AbstractHelpFormatter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractHelpFormatterTest {

    @Test
    public void testToSyntaxOptionsWithSingleOption() {
        AbstractHelpFormatter formatter = new AbstractHelpFormatter() {};
        Option option = new Option("a", "optionA", false, "Option A description");
        OptionGroup group = new OptionGroup();
        group.addOption(option);
        
        String result = formatter.toSyntaxOptions(group);
        assertEquals("[ -a ]", result);
    }

    @Test
    public void testToSyntaxOptionsWithMultipleOptions() {
        AbstractHelpFormatter formatter = new AbstractHelpFormatter() {};
        Option option1 = new Option("a", "optionA", false, "Option A description");
        Option option2 = new Option("b", "optionB", false, "Option B description");
        OptionGroup group = new OptionGroup();
        group.addOption(option1);
        group.addOption(option2);
        
        String result = formatter.toSyntaxOptions(group);
        assertEquals("[ -a | -b ]", result);
    }

    @Test
    public void testToSyntaxOptionsWithRequiredOption() {
        AbstractHelpFormatter formatter = new AbstractHelpFormatter() {};
        Option option = new Option("a", "optionA", true, "Option A description");
        OptionGroup group = new OptionGroup();
        group.addOption(option);
        group.setRequired(true);
        
        String result = formatter.toSyntaxOptions(group);
        assertEquals("[ -a <value> ]", result);
    }

    @Test
    public void testToSyntaxOptionsWithEmptyGroup() {
        AbstractHelpFormatter formatter = new AbstractHelpFormatter() {};
        OptionGroup group = new OptionGroup();
        
        String result = formatter.toSyntaxOptions(group);
        assertEquals("", result);
    }

    @Test
    public void testToSyntaxOptionsWithMixedOptions() {
        AbstractHelpFormatter formatter = new AbstractHelpFormatter() {};
        Option option1 = new Option("a", "optionA", false, "Option A description");
        Option option2 = new Option("b", "optionB", true, "Option B description");
        OptionGroup group = new OptionGroup();
        group.addOption(option1);
        group.addOption(option2);
        
        String result = formatter.toSyntaxOptions(group);
        assertEquals("[ -a | -b <value> ]", result);
    }
}