package org.apache.commons.csv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CSVFormatTest {

    @Test
    void testTrimWithStringInput() {
        CharSequence input = "  Hello World  ";
        CharSequence result = CSVFormat.trim(input);
        assertEquals("Hello World", result.toString());
    }

    @Test
    void testTrimWithEmptyString() {
        CharSequence input = "";
        CharSequence result = CSVFormat.trim(input);
        assertEquals("", result.toString());
    }

    @Test
    void testTrimWithOnlySpaces() {
        CharSequence input = "     ";
        CharSequence result = CSVFormat.trim(input);
        assertEquals("", result.toString());
    }

    @Test
    void testTrimWithNonStringCharSequence() {
        CharSequence input = new StringBuilder("  Test  ");
        CharSequence result = CSVFormat.trim(input);
        assertEquals("Test", result.toString());
    }

    @Test
    void testTrimWithNoTrimChars() {
        CharSequence input = "NoTrimChars";
        CharSequence result = CSVFormat.trim(input);
        assertEquals("NoTrimChars", result.toString());
    }

    @Test
    void testTrimWithLeadingAndTrailingTrimChars() {
        CharSequence input = "\t\tTrimmed\t\t";
        CharSequence result = CSVFormat.trim(input);
        assertEquals("Trimmed", result.toString());
    }

    @Test
    void testTrimWithNullInput() {
        CharSequence input = null;
        CharSequence result = CSVFormat.trim(input);
        assertEquals(null, result);
    }
}