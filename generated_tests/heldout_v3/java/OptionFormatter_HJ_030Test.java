import org.apache.commons.cli.Option;
import org.apache.commons.cli.help.OptionFormatter;
import org.apache.commons.cli.help.Options;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Builder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OptionFormatterTest {

    @Test
    void testOptionFormatterWithValidOption() {
        Option option = new Option("a", "all", false, "Show all items");
        Builder builder = new Builder();
        OptionFormatter formatter = new OptionFormatter(option, builder);
        String result = formatter.format();
        assertEquals(" -a, --all  Show all items", result);
    }

    @Test
    void testOptionFormatterWithLongOption() {
        Option option = new Option("b", "boolean", false, "A boolean option");
        Builder builder = new Builder();
        OptionFormatter formatter = new OptionFormatter(option, builder);
        String result = formatter.format();
        assertEquals(" -b, --boolean  A boolean option", result);
    }

    @Test
    void testOptionFormatterWithRequiredOption() {
        Option option = new Option("c", "config", true, "Configuration file");
        Builder builder = new Builder();
        OptionFormatter formatter = new OptionFormatter(option, builder);
        String result = formatter.format();
        assertEquals(" -c <file>, --config <file>  Configuration file", result);
    }

    @Test
    void testOptionFormatterWithEmptyDescription() {
        Option option = new Option("d", "description", false, "");
        Builder builder = new Builder();
        OptionFormatter formatter = new OptionFormatter(option, builder);
        String result = formatter.format();
        assertEquals(" -d, --description  ", result);
    }

    @Test
    void testOptionFormatterWithNullOption() {
        Option option = null;
        Builder builder = new Builder();
        try {
            OptionFormatter formatter = new OptionFormatter(option, builder);
            formatter.format();
        } catch (NullPointerException e) {
            assertEquals("Option cannot be null", e.getMessage());
        }
    }
}