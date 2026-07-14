package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CSVFormatTest {
    
    @Test
    void testTrim_StringWithSpaces() {
        assertEquals("Hello", new CSVFormat().trim("   Hello   "));
    }

    @Test
    void testTrim_EmptyString() {
        assertEquals("", new CSVFormat().trim(""));
    }

    @Test
    void testTrim_Null() {
        assertEquals(null, new CSVFormat().trim(null));
    }

    @Test
    void testTrim_NoTrimNeeded() {
        assertEquals("NoTrim", new CSVFormat().trim("NoTrim"));
    }

    @Test
    void testTrim_TrimCharAtStartAndEnd() {
        assertEquals("Trim", new CSVFormat().trim("   Trim   "));
    }

    @Test
    void testTrim_OnlyTrimChars() {
        assertEquals("", new CSVFormat().trim("   "));
    }

    @Test
    void testTrim_CharacterSequence() {
        CharSequence input = new StringBuilder("   Test   ");
        assertEquals("Test", new CSVFormat().trim(input));
    }

    @Test
    void testTrim_TrimCharAtStart() {
        assertEquals("Test", new CSVFormat().trim("   Test"));
    }

    @Test
    void testTrim_TrimCharAtEnd() {
        assertEquals("Test", new CSVFormat().trim("Test   "));
    }
}