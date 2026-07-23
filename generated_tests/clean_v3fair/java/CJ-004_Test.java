package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PatternOptionBuilderTest {
    @Test
    void testIsValueCode_AtSymbol() {
        assertTrue(PatternOptionBuilder.isValueCode('@'));
    }

    @Test
    void testIsValueCode_Colon() {
        assertTrue(PatternOptionBuilder.isValueCode(':'));
    }

    @Test
    void testIsValueCode_Percent() {
        assertTrue(PatternOptionBuilder.isValueCode('%'));
    }

    @Test
    void testIsValueCode_Plus() {
        assertTrue(PatternOptionBuilder.isValueCode('+'));
    }

    @Test
    void testIsValueCode_Hash() {
        assertTrue(PatternOptionBuilder.isValueCode('#'));
    }

    @Test
    void testIsValueCode_LessThan() {
        assertTrue(PatternOptionBuilder.isValueCode('<'));
    }

    @Test
    void testIsValueCode_GreaterThan() {
        assertTrue(PatternOptionBuilder.isValueCode('>'));
    }

    @Test
    void testIsValueCode_Asterisk() {
        assertTrue(PatternOptionBuilder.isValueCode('*'));
    }

    @Test
    void testIsValueCode_Slash() {
        assertTrue(PatternOptionBuilder.isValueCode('/'));
    }

    @Test
    void testIsValueCode_Exclamation() {
        assertTrue(PatternOptionBuilder.isValueCode('!'));
    }

    @Test
    void testIsValueCode_UnknownCharacter() {
        assertFalse(PatternOptionBuilder.isValueCode('a'));
    }
}