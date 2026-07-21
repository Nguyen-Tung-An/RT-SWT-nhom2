package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OptionValidatorTest {

    @Test
    void testValidate_NullOption() {
        assertNull(OptionValidator.validate(null));
    }

    @Test
    void testValidate_EmptyOption() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            OptionValidator.validate("");
        });
        assertEquals("Empty option name.", exception.getMessage());
    }

    @Test
    void testValidate_InvalidFirstCharacter() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            OptionValidator.validate("1invalid");
        });
        assertEquals("Illegal option name '1'.", exception.getMessage());
    }

    @Test
    void testValidate_ValidSingleCharacterOption() {
        assertEquals("a", OptionValidator.validate("a"));
    }

    @Test
    void testValidate_ValidMultiCharacterOption() {
        assertEquals("option", OptionValidator.validate("option"));
    }

    @Test
    void testValidate_InvalidCharacterInMultiCharacterOption() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            OptionValidator.validate("opt!on");
        });
        assertEquals("The option 'opt!on' contains an illegal character : '!'.", exception.getMessage());
    }

    @Test
    void testValidate_ValidOptionWithSpecialCharacters() {
        assertEquals("opt-tion", OptionValidator.validate("opt-tion"));
    }
}