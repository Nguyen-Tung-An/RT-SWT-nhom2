import org.apache.commons.cli.Option;
import org.apache.commons.cli.help.OptionFormatter;
import org.apache.commons.cli.help.OptionFormatter.Builder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OptionFormatterTest {

    @Test
    void testOptionFormatterWithRequiredOption() {
        Option option = Option.builder("o")
                .longOpt("option")
                .argName("arg")
                .required(true)
                .build();

        Builder builder = new Builder()
                .optionalDelimiters(", ")
                .argNameDelimiters("[", "]")
                .defaultArgName("default")
                .optPrefix("-")
                .longOptPrefix("--")
                .optSeparator(" ")
                .optArgSeparator("=");

        OptionFormatter optionFormatter = new OptionFormatter(option, builder);
        String result = optionFormatter.syntaxFormatFunction.apply(option, true);
        assertEquals("-o arg", result);
    }

    @Test
    void testOptionFormatterWithOptionalOption() {
        Option option = Option.builder("o")
                .longOpt("option")
                .argName("arg")
                .required(false)
                .build();

        Builder builder = new Builder()
                .optionalDelimiters(", ")
                .argNameDelimiters("[", "]")
                .defaultArgName("default")
                .optPrefix("-")
                .longOptPrefix("--")
                .optSeparator(" ")
                .optArgSeparator("=");

        OptionFormatter optionFormatter = new OptionFormatter(option, builder);
        String result = optionFormatter.syntaxFormatFunction.apply(option, false);
        assertEquals("[--option arg]", result);
    }

    @Test
    void testOptionFormatterWithEmptyArgName() {
        Option option = Option.builder("o")
                .longOpt("option")
                .argName("")
                .required(true)
                .build();

        Builder builder = new Builder()
                .optionalDelimiters(", ")
                .argNameDelimiters("[", "]")
                .defaultArgName("default")
                .optPrefix("-")
                .longOptPrefix("--")
                .optSeparator(" ")
                .optArgSeparator("=");

        OptionFormatter optionFormatter = new OptionFormatter(option, builder);
        String result = optionFormatter.syntaxFormatFunction.apply(option, true);
        assertEquals("-o", result);
    }

    @Test
    void testOptionFormatterWithNullBuilderFunction() {
        Option option = Option.builder("o")
                .longOpt("option")
                .argName("arg")
                .required(true)
                .build();

        Builder builder = new Builder()
                .optionalDelimiters(", ")
                .argNameDelimiters("[", "]")
                .defaultArgName("default")
                .optPrefix("-")
                .longOptPrefix("--")
                .optSeparator(" ")
                .optArgSeparator("=")
                .syntaxFormatFunction(null); // Testing with null function

        OptionFormatter optionFormatter = new OptionFormatter(option, builder);
        String result = optionFormatter.syntaxFormatFunction.apply(option, true);
        assertEquals("-o arg", result); // Should fall back to default behavior
    }
}