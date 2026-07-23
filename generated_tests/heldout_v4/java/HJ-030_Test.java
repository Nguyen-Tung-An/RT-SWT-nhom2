import org.apache.commons.cli.Option;
import org.apache.commons.cli.help.OptionFormatter;
import org.apache.commons.cli.help.OptionFormatter.Builder;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OptionFormatterTest {

    @Test
    public void testOptionFormatterWithValidOptionAndBuilder() throws Exception {
        Option option = new Option("o", "option", true, "An option");
        Builder builder = new Builder();
        builder.optionalDelimiters = ", ";
        builder.argNameDelimiters = "[]";
        builder.defaultArgName = "arg";
        builder.optPrefix = "-";
        builder.longOptPrefix = "--";
        builder.optSeparator = " ";
        builder.optArgSeparator = "=";
        builder.deprecatedFormatFunction = null;
        builder.syntaxFormatFunction = null;

        Method m = OptionFormatter.class.getDeclaredMethod("OptionFormatter", Option.class, Builder.class);
        m.setAccessible(true);
        Object instance = new OptionFormatter(option, builder);

        // Set fields that are read in the constructor
        Field f = OptionFormatter.class.getDeclaredField("optionalDelimiters");
        f.setAccessible(true);
        f.set(instance, builder.optionalDelimiters);

        String result = (String) m.invoke(instance, option, builder);
        assertEquals("-o [arg]", result);
    }

    @Test
    public void testOptionFormatterWithNullBuilder() throws Exception {
        Option option = new Option("o", "option", true, "An option");
        Builder builder = null;

        Method m = OptionFormatter.class.getDeclaredMethod("OptionFormatter", Option.class, Builder.class);
        m.setAccessible(true);

        assertThrows(NullPointerException.class, () -> {
            try {
                m.invoke(null, option, builder);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }

    @Test
    public void testOptionFormatterWithEmptyArgName() throws Exception {
        Option option = new Option("o", "option", true, "An option");
        option.setArgName("");
        Builder builder = new Builder();

        Method m = OptionFormatter.class.getDeclaredMethod("OptionFormatter", Option.class, Builder.class);
        m.setAccessible(true);
        Object instance = new OptionFormatter(option, builder);

        String result = (String) m.invoke(instance, option, builder);
        assertEquals("-o", result);
    }

    @Test
    public void testOptionFormatterWithRequiredFlag() throws Exception {
        Option option = new Option("o", "option", true, "An option");
        option.setRequired(true);
        Builder builder = new Builder();

        Method m = OptionFormatter.class.getDeclaredMethod("OptionFormatter", Option.class, Builder.class);
        m.setAccessible(true);
        Object instance = new OptionFormatter(option, builder);

        String result = (String) m.invoke(instance, option, builder);
        assertEquals("-o [arg]", result);
    }

    @Test
    public void testOptionFormatterWithOptionalFlag() throws Exception {
        Option option = new Option("o", "option", true, "An option");
        option.setRequired(false);
        Builder builder = new Builder();

        Method m = OptionFormatter.class.getDeclaredMethod("OptionFormatter", Option.class, Builder.class);
        m.setAccessible(true);
        Object instance = new OptionFormatter(option, builder);

        String result = (String) m.invoke(instance, option, builder);
        assertEquals("[-o [arg]]", result);
    }
}