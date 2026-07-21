import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.help.AbstractHelpFormatter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractHelpFormatterTest {

    @Test
    public void testToSyntaxOptions_EmptyGroup() {
        AbstractHelpFormatter formatter = new AbstractHelpFormatter();
        OptionGroup group = new OptionGroup();
        String result = formatter.toSyntaxOptions(group);
        assertEquals("", result);
    }

    @Test
    public void testToSyntaxOptions_SingleRequiredOption() {
        AbstractHelpFormatter formatter = new AbstractHelpFormatter();
        Option option = new Option("a", "optionA", false, "Option A");
        OptionGroup group = new OptionGroup();
        group.addOption(option);
        group.setRequired(true);
        String result = formatter.toSyntaxOptions(group);
        assertEquals("[-a]", result);
    }

    @Test
    public void testToSyntaxOptions_SingleOptionalOption() {
        AbstractHelpFormatter formatter = new AbstractHelpFormatter();
        Option option = new Option("b", "optionB", false, "Option B");
        OptionGroup group = new OptionGroup();
        group.addOption(option);
        group.setRequired(false);
        String result = formatter.toSyntaxOptions(group);
        assertEquals("[--optionB]", result);
    }

    @Test
    public void testToSyntaxOptions_MultipleOptions() {
        AbstractHelpFormatter formatter = new AbstractHelpFormatter();
        Option option1 = new Option("c", "optionC", false, "Option C");
        Option option2 = new Option("d", "optionD", false, "Option D");
        OptionGroup group = new OptionGroup();
        group.addOption(option1);
        group.addOption(option2);
        group.setRequired(true);
        String result = formatter.toSyntaxOptions(group);
        assertEquals("[-c|-d]", result);
    }

    @Test
    public void testToSyntaxOptions_MultipleOptionsOptional() {
        AbstractHelpFormatter formatter = new AbstractHelpFormatter();
        Option option1 = new Option("e", "optionE", false, "Option E");
        Option option2 = new Option("f", "optionF", false, "Option F");
        OptionGroup group = new OptionGroup();
        group.addOption(option1);
        group.addOption(option2);
        group.setRequired(false);
        String result = formatter.toSyntaxOptions(group);
        assertEquals("[--optionE|--optionF]", result);
    }
}