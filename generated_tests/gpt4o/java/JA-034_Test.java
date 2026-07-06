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
        assertThrows(NullPointerException.class, () -> CSVFormat.trim(null));
    }

    @Test
    void testTrim_NoTrimNeeded() {
        assertEquals("NoTrim", CSVFormat.trim("NoTrim"));
    }

    @Test
    void testTrim_CharSequenceWithTrimChars() {
        CharSequence input = new StringBuilder("   Trimmed   ");
        assertEquals("Trimmed", CSVFormat.trim(input));
    }

    @Test
    void testTrim_CharSequenceWithoutTrimChars() {
        CharSequence input = new StringBuilder("NoTrim");
        assertEquals("NoTrim", CSVFormat.trim(input));
    }

    @Test
    void testTrim_CharSequenceWithOnlyTrimChars() {
        CharSequence input = new StringBuilder("   ");
        assertEquals("", CSVFormat.trim(input));
    }
}