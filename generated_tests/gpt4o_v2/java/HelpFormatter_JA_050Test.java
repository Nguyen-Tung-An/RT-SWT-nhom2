import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelpFormatterTest {

    private final HelpFormatter formatter = new HelpFormatter();

    @Test
    void testAppendOption_RequiredOptionWithShortOpt() {
        StringBuilder buff = new StringBuilder();
        Option option = Option.builder("a").argName("arg").hasArg().build();
        formatter.appendOption(buff, option, true);
        assertEquals("a", buff.toString());
    }

    @Test
    void testAppendOption_OptionalOptionWithShortOpt() {
        StringBuilder buff = new StringBuilder();
        Option option = Option.builder("b").argName("arg").hasArg().build();
        formatter.appendOption(buff, option, false);
        assertEquals("[b]", buff.toString());
    }

    @Test
    void testAppendOption_OptionalOptionWithLongOpt() {
        StringBuilder buff = new StringBuilder();
        Option option = Option.builder().longOpt("longOption").argName("arg").hasArg().build();
        formatter.appendOption(buff, option, false);
        assertEquals("[--longOption]", buff.toString());
    }

    @Test
    void testAppendOption_RequiredOptionWithNoArgName() {
        StringBuilder buff = new StringBuilder();
        Option option = Option.builder("c").hasArg().build();
        formatter.appendOption(buff, option, true);
        assertEquals("c", buff.toString());
    }

    @Test
    void testAppendOption_OptionalOptionWithEmptyArgName() {
        StringBuilder buff = new StringBuilder();
        Option option = Option.builder("d").argName("").hasArg().build();
        formatter.appendOption(buff, option, false);
        assertEquals("[d <arg>]", buff.toString());
    }

    @Test
    void testAppendOption_OptionalOptionWithNullArgName() {
        StringBuilder buff = new StringBuilder();
        Option option = Option.builder("e").argName(null).hasArg().build();
        formatter.appendOption(buff, option, false);
        assertEquals("[e <arg>]", buff.toString());
    }

    @Test
    void testAppendOption_OptionalOptionWithNoArgs() {
        StringBuilder buff = new StringBuilder();
        Option option = Option.builder("f").hasArg().build();
        formatter.appendOption(buff, option, false);
        assertEquals("[f]", buff.toString());
    }
}