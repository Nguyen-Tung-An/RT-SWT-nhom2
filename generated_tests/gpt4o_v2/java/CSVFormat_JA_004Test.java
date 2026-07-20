import org.apache.commons.csv.CSVFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CSVFormatTest {

    private final CSVFormat instance = new CSVFormat();

    @Test
    void testIsDelimiter_MatchingDelimiter() {
        char ch0 = ',';
        CharSequence charSeq = "abc,def";
        int startIndex = 3;
        char[] delimiter = {','};
        int delimiterLength = 1;

        boolean result = instance.isDelimiter(ch0, charSeq, startIndex, delimiter, delimiterLength);
        assertTrue(result);
    }

    @Test
    void testIsDelimiter_NonMatchingFirstChar() {
        char ch0 = ';';
        CharSequence charSeq = "abc,def";
        int startIndex = 3;
        char[] delimiter = {','};
        int delimiterLength = 1;

        boolean result = instance.isDelimiter(ch0, charSeq, startIndex, delimiter, delimiterLength);
        assertFalse(result);
    }

    @Test
    void testIsDelimiter_ExceedsCharSequenceLength() {
        char ch0 = ',';
        CharSequence charSeq = "abc,def";
        int startIndex = 6; // Start index is beyond the length of charSeq
        char[] delimiter = {','};
        int delimiterLength = 1;

        boolean result = instance.isDelimiter(ch0, charSeq, startIndex, delimiter, delimiterLength);
        assertFalse(result);
    }

    @Test
    void testIsDelimiter_MatchingMultiCharDelimiter() {
        char ch0 = ',';
        CharSequence charSeq = "abc,def";
        int startIndex = 3;
        char[] delimiter = {',', 'd'};
        int delimiterLength = 2;

        boolean result = instance.isDelimiter(ch0, charSeq, startIndex, delimiter, delimiterLength);
        assertFalse(result); // The next character is not 'd'
    }

    @Test
    void testIsDelimiter_MatchingDelimiterWithBoundary() {
        char ch0 = ',';
        CharSequence charSeq = "abc,";
        int startIndex = 3;
        char[] delimiter = {','};
        int delimiterLength = 1;

        boolean result = instance.isDelimiter(ch0, charSeq, startIndex, delimiter, delimiterLength);
        assertTrue(result);
    }

    @Test
    void testIsDelimiter_EmptyCharSequence() {
        char ch0 = ',';
        CharSequence charSeq = "";
        int startIndex = 0;
        char[] delimiter = {','};
        int delimiterLength = 1;

        boolean result = instance.isDelimiter(ch0, charSeq, startIndex, delimiter, delimiterLength);
        assertFalse(result);
    }

    @Test
    void testIsDelimiter_NonMatchingDelimiterLength() {
        char ch0 = ',';
        CharSequence charSeq = "abc,def";
        int startIndex = 3;
        char[] delimiter = {',', 'd'};
        int delimiterLength = 1; // Only checking the first character

        boolean result = instance.isDelimiter(ch0, charSeq, startIndex, delimiter, delimiterLength);
        assertTrue(result);
    }
}