import org.apache.commons.csv.CSVFormat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CSVFormatTest {

    @Test
    void testTrimStringWithSpaces() {
        CharSequence input = "   Hello World   ";
        CharSequence result = CSVFormat.trim(input);
        assertEquals("Hello World", result.toString());
    }

    @Test
    void testTrimStringWithNoSpaces() {
        CharSequence input = "HelloWorld";
        CharSequence result = CSVFormat.trim(input);
        assertEquals("HelloWorld", result.toString());
    }

    @Test
    void testTrimStringWithOnlySpaces() {
        CharSequence input = "      ";
        CharSequence result = CSVFormat.trim(input);
        assertEquals("", result.toString());
    }

    @Test
    void testTrimStringWithLeadingAndTrailingSpaces() {
        CharSequence input = "   Test   ";
        CharSequence result = CSVFormat.trim(input);
        assertEquals("Test", result.toString());
    }

    @Test
    void testTrimEmptyString() {
        CharSequence input = "";
        CharSequence result = CSVFormat.trim(input);
        assertEquals("", result.toString());
    }

    @Test
    void testTrimNonStringCharSequence() {
        CharSequence input = new StringBuilder("   Example   ");
        CharSequence result = CSVFormat.trim(input);
        assertEquals("Example", result.toString());
    }

    @Test
    void testTrimNonTrimmedCharSequence() {
        CharSequence input = new StringBuilder("NoTrim");
        CharSequence result = CSVFormat.trim(input);
        assertEquals("NoTrim", result.toString());
    }

    @Test
    void testTrimCharSequenceWithOnlyTrimChars() {
        CharSequence input = new StringBuilder("   ");
        CharSequence result = CSVFormat.trim(input);
        assertEquals("", result.toString());
    }
}