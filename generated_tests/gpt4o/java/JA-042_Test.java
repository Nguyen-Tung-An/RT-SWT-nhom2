package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DefaultParserTest {
    
    @Test
    void testSqueeze_EmptyString() {
        assertEquals("", DefaultParser.squeeze(""));
    }

    @Test
    void testSqueeze_NoSet() {
        assertEquals("abc", DefaultParser.squeeze("abc"));
    }

    @Test
    void testSqueeze_ConsecutiveDuplicates() {
        assertEquals("abc", DefaultParser.squeeze("aaabbbccc"));
    }

    @Test
    void testSqueeze_WithSet_OnlyInSet() {
        assertEquals("abc", DefaultParser.squeeze("aaabbbccc", "a", "b", "c"));
    }

    @Test
    void testSqueeze_WithSet_IgnoreInSet() {
        assertEquals("ab", DefaultParser.squeeze("aaabbb", "a"));
    }

    @Test
    void testSqueeze_WithSet_Mixed() {
        assertEquals("a", DefaultParser.squeeze("aaab", "a"));
    }

    @Test
    void testSqueeze_WithSet_Complex() {
        assertEquals("abc", DefaultParser.squeeze("aaabbbccc", "b"));
    }

    @Test
    void testSqueeze_SingleCharacter() {
        assertEquals("a", DefaultParser.squeeze("a"));
    }

    @Test
    void testSqueeze_SingleCharacterWithSet() {
        assertEquals("a", DefaultParser.squeeze("a", "a"));
    }
}