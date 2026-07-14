package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CSVFormatTest {
    
    @Test
    void testTrim_StringWithSpaces() {
        assertEquals("Hello", CSVFormat.trim("   Hello   "));
    }

    @Test
    void testTrim_EmptyString() {
        assertEquals("", CSVFormat.trim(""));
    }

    @Test
    void testTrim_Null() {
        assertEquals(null, CSVFormat.trim(null));
    }

    @Test
    void testTrim_NoTrimNeeded() {
        assertEquals("NoTrim", CSVFormat.trim("NoTrim"));
    }

    @Test
    void testTrim_TrimCharAtStartAndEnd() {
        assertEquals("Trim", CSVFormat.trim("   Trim   "));
    }

    @Test
    void testTrim_OnlyTrimChars() {
        assertEquals("", CSVFormat.trim("   "));
    }

    @Test
    void testTrim_CharacterSequence() {
        CharSequence input = new StringBuilder("   Test   ");
        assertEquals("Test", CSVFormat.trim(input));
    }

    @Test
    void testTrim_TrimCharAtStart() {
        assertEquals("Test", CSVFormat.trim("   Test"));
    }

    @Test
    void testTrim_TrimCharAtEnd() {
        assertEquals("Test", CSVFormat.trim("Test   "));
    }
}