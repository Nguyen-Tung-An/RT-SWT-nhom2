package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CSVFormatTest {

    private final CSVFormat csvFormat = new CSVFormat();

    @Test
    void testIsDelimiter_MatchingDelimiter() {
        char[] delimiter = {',', ' '};
        assertTrue(csvFormat.isDelimiter(',', "abc, def", 3, delimiter, 1));
    }

    @Test
    void testIsDelimiter_NonMatchingFirstChar() {
        char[] delimiter = {',', ' '};
        assertFalse(csvFormat.isDelimiter(';', "abc, def", 3, delimiter, 1));
    }

    @Test
    void testIsDelimiter_InsufficientLength() {
        char[] delimiter = {',', ' '};
        assertFalse(csvFormat.isDelimiter(',', "abc", 0, delimiter, 2));
    }

    @Test
    void testIsDelimiter_NonMatchingSubsequentChars() {
        char[] delimiter = {',', ' '};
        assertFalse(csvFormat.isDelimiter(',', "abc,xyz", 3, delimiter, 2));
    }

    @Test
    void testIsDelimiter_EmptyCharSequence() {
        char[] delimiter = {',', ' '};
        assertFalse(csvFormat.isDelimiter(',', "", 0, delimiter, 1));
    }

    @Test
    void testIsDelimiter_ExactMatch() {
        char[] delimiter = {',', ' '};
        assertTrue(csvFormat.isDelimiter(',', "abc, ", 3, delimiter, 1));
    }
}