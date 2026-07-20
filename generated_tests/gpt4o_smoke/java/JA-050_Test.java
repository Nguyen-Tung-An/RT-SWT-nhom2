import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionFormatter;
import org.junit.jupiter.api.Test;

import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HelpFormatterTest {

    @Test
    void testAppendOptionWithRequiredFalseAndOpt() throws Exception {
        HelpFormatter instance = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        Option option = new Option("o", "option", true, "an option");
        
        // Set required to false
        boolean required = false;

        // Invoke the target method
        Method m = HelpFormatter.class.getDeclaredMethod("appendOption", StringBuilder.class, Option.class, boolean.class);
        m.setAccessible(true);
        m.invoke(instance, buff, option, required);

        assertEquals("[--option]", buff.toString());
    }

    @Test
    void testAppendOptionWithRequiredFalseAndLongOpt() throws Exception {
        HelpFormatter instance = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        Option option = new Option(null, "longOption", true, "a long option");
        
        // Set required to false
        boolean required = false;

        // Invoke the target method
        Method m = HelpFormatter.class.getDeclaredMethod("appendOption", StringBuilder.class, Option.class, boolean.class);
        m.setAccessible(true);
        m.invoke(instance, buff, option, required);

        assertEquals("[--longOption]", buff.toString());
    }

    @Test
    void testAppendOptionWithRequiredTrueAndOpt() throws Exception {
        HelpFormatter instance = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        Option option = new Option("o", "option", true, "an option");
        
        // Set required to true
        boolean required = true;

        // Invoke the target method
        Method m = HelpFormatter.class.getDeclaredMethod("appendOption", StringBuilder.class, Option.class, boolean.class);
        m.setAccessible(true);
        m.invoke(instance, buff, option, required);

        assertEquals("--option", buff.toString());
    }

    @Test
    void testAppendOptionWithRequiredTrueAndLongOpt() throws Exception {
        HelpFormatter instance = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        Option option = new Option(null, "longOption", true, "a long option");
        
        // Set required to true
        boolean required = true;

        // Invoke the target method
        Method m = HelpFormatter.class.getDeclaredMethod("appendOption", StringBuilder.class, Option.class, boolean.class);
        m.setAccessible(true);
        m.invoke(instance, buff, option, required);

        assertEquals("--longOption", buff.toString());
    }

    @Test
    void testAppendOptionWithArgName() throws Exception {
        HelpFormatter instance = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        Option option = new Option("o", "option", true, "an option");
        option.setArgName("arg");
        
        // Set required to false
        boolean required = false;

        // Invoke the target method
        Method m = HelpFormatter.class.getDeclaredMethod("appendOption", StringBuilder.class, Option.class, boolean.class);
        m.setAccessible(true);
        m.invoke(instance, buff, option, required);

        assertEquals("[--option <arg>]", buff.toString());
    }

    @Test
    void testAppendOptionWithNullArgName() throws Exception {
        HelpFormatter instance = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        Option option = new Option("o", "option", true, "an option");
        option.setArgName(null);
        
        // Set required to false
        boolean required = false;

        // Invoke the target method
        Method m = HelpFormatter.class.getDeclaredMethod("appendOption", StringBuilder.class, Option.class, boolean.class);
        m.setAccessible(true);
        m.invoke(instance, buff, option, required);

        assertEquals("[--option <arg>]", buff.toString());
    }

    @Test
    void testAppendOptionWithEmptyArgName() throws Exception {
        HelpFormatter instance = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        Option option = new Option("o", "option", true, "an option");
        option.setArgName("");
        
        // Set required to false
        boolean required = false;

        // Invoke the target method
        Method m = HelpFormatter.class.getDeclaredMethod("appendOption", StringBuilder.class, Option.class, boolean.class);
        m.setAccessible(true);
        m.invoke(instance, buff, option, required);

        assertEquals("[--option <arg>]", buff.toString());
    }
}