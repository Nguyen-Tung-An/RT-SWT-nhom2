import org.apache.commons.csv.CSVParser;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CSVParserTest {

    @Test
    void testHandleNullWithNullString() {
        CSVParser parser = new CSVParser(/* constructor parameters */);
        String result = invokeHandleNull(parser, "NULL");
        assertEquals(null, result);
    }

    @Test
    void testHandleNullWithEmptyString() {
        CSVParser parser = new CSVParser(/* constructor parameters */);
        String result = invokeHandleNull(parser, "");
        assertEquals("", result);
    }

    @Test
    void testHandleNullWithNonNullString() {
        CSVParser parser = new CSVParser(/* constructor parameters */);
        String result = invokeHandleNull(parser, "valid");
        assertEquals("valid", result);
    }

    @Test
    void testHandleNullWithQuotedNullString() {
        CSVParser parser = new CSVParser(/* constructor parameters */);
        String result = invokeHandleNull(parser, "\"NULL\"");
        assertEquals("\"NULL\"", result);
    }

    @Test
    void testHandleNullWithStrictQuoteModeAndNullString() {
        CSVParser parser = new CSVParser(/* constructor parameters */);
        // Set strict quote mode and isQuoted to true
        String result = invokeHandleNull(parser, "NULL");
        assertEquals(null, result);
    }

    private String invokeHandleNull(CSVParser parser, String input) {
        try {
            var method = CSVParser.class.getDeclaredMethod("handleNull", String.class);
            method.setAccessible(true);
            return (String) method.invoke(parser, input);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}