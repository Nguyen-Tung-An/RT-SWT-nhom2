import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionGroupTest {

    @Test
    public void testToStringWithSingleOption() {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "optionA", false, "Description for option A"));
        assertEquals("[--optionA Description for option A]", group.toString());
    }

    @Test
    public void testToStringWithMultipleOptions() {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "optionA", false, "Description for option A"));
        group.addOption(new Option("b", "optionB", false, "Description for option B"));
        assertEquals("[--optionA Description for option A, --optionB Description for option B]", group.toString());
    }

    @Test
    public void testToStringWithNullOpt() {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option(null, "optionB", false, "Description for option B"));
        assertEquals("[--optionB Description for option B]", group.toString());
    }

    @Test
    public void testToStringWithEmptyDescription() {
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "optionA", false, null));
        assertEquals("[--optionA]", group.toString());
    }

    @Test
    public void testToStringWithNoOptions() {
        OptionGroup group = new OptionGroup();
        assertEquals("[]", group.toString());
    }
}