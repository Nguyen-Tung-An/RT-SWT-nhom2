package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OptionTest {

    @Test
    void testToString_WithoutLongOption_NoArgs() {
        Option option = new Option("a", "optionA", false, "This is option A");
        assertEquals("[ Option a :: This is option A :: null ]", option.toString());
    }

    @Test
    void testToString_WithLongOption_NoArgs() {
        Option option = new Option("b", "optionB", false, "This is option B");
        assertEquals("[ Option b longOption :: This is option B :: null ]", option.toString());
    }

    @Test
    void testToString_WithLongOption_WithArg() {
        Option option = new Option("c", "optionC", true, "This is option C");
        assertEquals("[ Option c longOption [ARG] :: This is option C :: null ]", option.toString());
    }

    @Test
    void testToString_WithLongOption_WithArgs() {
        Option option = new Option("d", "optionD", true, "This is option D");
        option.setArgs(Option.UNLIMITED_VALUES);
        assertEquals("[ Option d longOption [ARG...] :: This is option D :: null ]", option.toString());
    }

    @Test
    void testToString_WithDeprecated() {
        Option option = new Option("e", "optionE", false, "This is option E");
        option.setDeprecated("This option is deprecated");
        assertEquals("[ Option e longOption This option is deprecated :: This is option E :: null ]", option.toString());
    }
}