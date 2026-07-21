import org.apache.commons.cli.OptionValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptionValidatorTest {

    @Test
    void testValidate_NullOption() {
        String result = OptionValidator.validate(null);
        assertNull(result);
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
        String result = OptionValidator.validate("a");
        assertEquals("a", result);
    }

    @Test
    void testValidate_ValidMultiCharacterOption() {
        String result = OptionValidator.validate("validOption");
        assertEquals("validOption", result);
    }

    @Test
    void testValidate_InvalidCharacterInMultiCharacterOption() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            OptionValidator.validate("valid@Option");
        });
        assertEquals("The option 'valid@Option' contains an illegal character : '@'.", exception.getMessage());
    }
}