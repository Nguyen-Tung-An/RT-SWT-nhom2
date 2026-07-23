package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OptionTest {

    @Test
    void testToString_NoLongOption_NoArgs() {
        Option option = new Option("o", "option", false, "description");
        assertEquals("[ Option o :: description :: null ]", option.toString());
    }

    @Test
    void testToString_WithLongOption_NoArgs() {
        Option option = new Option("o", "option", false, "description");
        option.setLongOpt("longOption");
        assertEquals("[ Option o longOption :: description :: null ]", option.toString());
    }

    @Test
    void testToString_WithDeprecated() {
        Option option = new Option("o", "option", false, "description");
        option.setDeprecated("deprecated");
        assertEquals("[ Option o :: description :: null ]", option.toString());
    }

    @Test
    void testToString_WithArgs() {
        Option option = new Option("o", "option", true, "description");
        assertEquals("[ Option o [ARG] :: description :: null ]", option.toString());
    }

    @Test
    void testToString_WithMultipleArgs() {
        Option option = new Option("o", "option", true, "description");
        option.setArgs(Option.UNLIMITED_VALUES);
        assertEquals("[ Option o [ARG...] :: description :: null ]", option.toString());
    }

    @Test
    void testToString_WithAllFeatures() {
        Option option = new Option("o", "option", true, "description");
        option.setLongOpt("longOption");
        option.setDeprecated("deprecated");
        option.setArgs(Option.UNLIMITED_VALUES);
        assertEquals("[ Option o longOption deprecated [ARG...] :: description :: null ]", option.toString());
    }
}