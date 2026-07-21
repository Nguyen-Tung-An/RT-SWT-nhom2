package org.apache.commons.cli.help;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OptionFormatterTest {

    @Test
    void testOptionFormatter_WithRequiredOption() {
        Option option = new Option("o", "option", true, "an option");
        option.setRequired(true);
        Builder builder = new Builder()
                .setOptionalDelimiters(",")
                .setArgNameDelimiters("<", ">")
                .setDefaultArgName("arg")
                .setOptPrefix("-")
                .setLongOptPrefix("--")
                .setOptSeparator(" ")
                .setOptArgSeparator("=");
        
        OptionFormatter formatter = new OptionFormatter(option, builder);
        String formatted = formatter.syntaxFormatFunction.apply(option, true);
        assertEquals("-o <arg>", formatted);
    }

    @Test
    void testOptionFormatter_WithOptionalOption() {
        Option option = new Option("o", "option", true, "an option");
        option.setRequired(false);
        Builder builder = new Builder()
                .setOptionalDelimiters(",")
                .setArgNameDelimiters("<", ">")
                .setDefaultArgName("arg")
                .setOptPrefix("-")
                .setLongOptPrefix("--")
                .setOptSeparator(" ")
                .setOptArgSeparator("=");
        
        OptionFormatter formatter = new OptionFormatter(option, builder);
        String formatted = formatter.syntaxFormatFunction.apply(option, false);
        assertEquals("[ -o <arg> ]", formatted);
    }

    @Test
    void testOptionFormatter_WithEmptyArgName() {
        Option option = new Option("o", "option", false, "an option");
        option.setRequired(true);
        Builder builder = new Builder()
                .setOptionalDelimiters(",")
                .setArgNameDelimiters("<", ">")
                .setDefaultArgName("")
                .setOptPrefix("-")
                .setLongOptPrefix("--")
                .setOptSeparator(" ")
                .setOptArgSeparator("=");
        
        OptionFormatter formatter = new OptionFormatter(option, builder);
        String formatted = formatter.syntaxFormatFunction.apply(option, true);
        assertEquals("-o", formatted);
    }

    @Test
    void testOptionFormatter_WithNullSyntaxFunction() {
        Option option = new Option("o", "option", true, "an option");
        option.setRequired(true);
        Builder builder = new Builder()
                .setOptionalDelimiters(",")
                .setArgNameDelimiters("<", ">")
                .setDefaultArgName("arg")
                .setOptPrefix("-")
                .setLongOptPrefix("--")
                .setOptSeparator(" ")
                .setOptArgSeparator("=")
                .setSyntaxFormatFunction(null);
        
        OptionFormatter formatter = new OptionFormatter(option, builder);
        String formatted = formatter.syntaxFormatFunction.apply(option, true);
        assertEquals("-o <arg>", formatted);
    }
}