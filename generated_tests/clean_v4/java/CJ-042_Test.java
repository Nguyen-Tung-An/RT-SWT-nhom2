import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionTest {

    @Test
    public void testToStringWithShortOption() {
        Option option = new Option("a", "Short option A");
        String result = option.toString();
        assertEquals("[ Option a :: Short option A :: null ]", result);
    }

    @Test
    public void testToStringWithLongOption() {
        Option option = new Option("b", "Long option B");
        option.setLongOpt("longB");
        String result = option.toString();
        assertEquals("[ Option b longB :: Long option B :: null ]", result);
    }

    @Test
    public void testToStringWithDeprecatedOption() {
        Option option = new Option("c", "Deprecated option C");
        option.setDeprecated("This option is deprecated");
        String result = option.toString();
        assertEquals("[ Option c :: Deprecated option C :: null ]", result);
    }

    @Test
    public void testToStringWithArgument() {
        Option option = new Option("d", "Option D with argument");
        option.setArgs(1);
        String result = option.toString();
        assertEquals("[ Option d :: Option D with argument :: null [ARG...] ]", result);
    }

    @Test
    public void testToStringWithHasArg() {
        Option option = new Option("e", "Option E with single argument");
        option.setArgName("arg");
        String result = option.toString();
        assertEquals("[ Option e :: Option E with single argument :: null [ARG] ]", result);
    }
}