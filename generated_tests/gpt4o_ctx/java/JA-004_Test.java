package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CSVFormatTest {

    private final CSVFormat csvFormat = new CSVFormat();

    @Test
    void testIsDelimiter_MatchingDelimiter() {
        char[] delimiter = {',', ' '};
        assertTrue(csvFormat.isDelimiter(',', "value, more", 5, delimiter, 2));
    }

    @Test
    void testIsDelimiter_NonMatchingFirstChar() {
        char[] delimiter = {',', ' '};
        assertFalse(csvFormat.isDelimiter(';', "value, more", 5, delimiter, 2));
    }

    @Test
    void testIsDelimiter_InsufficientLength() {
        char[] delimiter = {',', ' '};
        assertFalse(csvFormat.isDelimiter(',', "value, more", 5, delimiter, 3));
    }

    @Test
    void testIsDelimiter_NonMatchingSubsequentChars() {
        char[] delimiter = {',', ' '};
        assertFalse(csvFormat.isDelimiter(',', "value, more", 5, delimiter, 1));
    }

    @Test
    void testIsDelimiter_EmptyCharSequence() {
        char[] delimiter = {',', ' '};
        assertFalse(csvFormat.isDelimiter(',', "", 0, delimiter, 1));
    }

    @Test
    void testIsDelimiter_ExactMatchAtStart() {
        char[] delimiter = {',', ' '};
        assertTrue(csvFormat.isDelimiter(',', "value, more", 5, delimiter, 1));
    }
}