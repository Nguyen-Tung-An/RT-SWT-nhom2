import org.apache.commons.cli.PatternOptionBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PatternOptionBuilderTest {

    @Test
    public void testIsValueCode_WithAtSymbol_ReturnsTrue() {
        assertTrue(PatternOptionBuilder.isValueCode('@'));
    }

    @Test
    public void testIsValueCode_WithColon_ReturnsTrue() {
        assertTrue(PatternOptionBuilder.isValueCode(':'));
    }

    @Test
    public void testIsValueCode_WithPercent_ReturnsTrue() {
        assertTrue(PatternOptionBuilder.isValueCode('%'));
    }

    @Test
    public void testIsValueCode_WithPlus_ReturnsTrue() {
        assertTrue(PatternOptionBuilder.isValueCode('+'));
    }

    @Test
    public void testIsValueCode_WithHash_ReturnsTrue() {
        assertTrue(PatternOptionBuilder.isValueCode('#'));
    }

    @Test
    public void testIsValueCode_WithLessThan_ReturnsTrue() {
        assertTrue(PatternOptionBuilder.isValueCode('<'));
    }

    @Test
    public void testIsValueCode_WithGreaterThan_ReturnsTrue() {
        assertTrue(PatternOptionBuilder.isValueCode('>'));
    }

    @Test
    public void testIsValueCode_WithAsterisk_ReturnsTrue() {
        assertTrue(PatternOptionBuilder.isValueCode('*'));
    }

    @Test
    public void testIsValueCode_WithSlash_ReturnsTrue() {
        assertTrue(PatternOptionBuilder.isValueCode('/'));
    }

    @Test
    public void testIsValueCode_WithExclamation_ReturnsTrue() {
        assertTrue(PatternOptionBuilder.isValueCode('!'));
    }

    @Test
    public void testIsValueCode_WithOtherCharacter_ReturnsFalse() {
        assertFalse(PatternOptionBuilder.isValueCode('a'));
    }

    @Test
    public void testIsValueCode_WithEmptyCharacter_ReturnsFalse() {
        assertFalse(PatternOptionBuilder.isValueCode('\0'));
    }

    @Test
    public void testIsValueCode_WithSpaceCharacter_ReturnsFalse() {
        assertFalse(PatternOptionBuilder.isValueCode(' '));
    }
}