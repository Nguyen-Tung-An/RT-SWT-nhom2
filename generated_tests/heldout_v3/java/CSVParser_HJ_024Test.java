import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVFormat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CSVParserTest {
    private CSVParser csvParser;

    @BeforeEach
    void setUp() {
        // Initialize CSVParser with a suitable format
        csvParser = new CSVParser(CSVFormat.DEFAULT);
    }

    @Test
    void testAddRecordValue_LastRecord_EmptyInput_NotQuoted_TrailingDelimiter() {
        // Simulate the conditions for the first branch
        csvParser.reusableToken.content = new StringBuilder(""); // empty input
        csvParser.reusableToken.isQuoted = false;
        csvParser.format.setTrailingDelimiter(true);
        
        // Call the target method
        invokeAddRecordValue(true);
        
        // Assert that the record list is empty
        assertEquals(0, csvParser.recordList.size());
    }

    @Test
    void testAddRecordValue_LastRecord_EmptyInput_Quoted_TrailingDelimiter() {
        // Simulate the conditions for the second branch
        csvParser.reusableToken.content = new StringBuilder(""); // empty input
        csvParser.reusableToken.isQuoted = true;
        csvParser.format.setTrailingDelimiter(true);
        
        // Call the target method
        invokeAddRecordValue(true);
        
        // Assert that the record list contains the quoted empty string
        assertEquals(1, csvParser.recordList.size());
        assertEquals("", csvParser.recordList.get(0));
    }

    @Test
    void testAddRecordValue_LastRecord_NonEmptyInput_NotQuoted_TrailingDelimiter() {
        // Simulate the conditions for the third branch
        csvParser.reusableToken.content = new StringBuilder("value");
        csvParser.reusableToken.isQuoted = false;
        csvParser.format.setTrailingDelimiter(true);
        
        // Call the target method
        invokeAddRecordValue(true);
        
        // Assert that the record list contains the non-empty value
        assertEquals(1, csvParser.recordList.size());
        assertEquals("value", csvParser.recordList.get(0));
    }

    @Test
    void testAddRecordValue_NotLastRecord_EmptyInput_NotQuoted_TrailingDelimiter() {
        // Simulate the conditions for the fourth branch
        csvParser.reusableToken.content = new StringBuilder(""); // empty input
        csvParser.reusableToken.isQuoted = false;
        csvParser.format.setTrailingDelimiter(true);
        
        // Call the target method
        invokeAddRecordValue(false);
        
        // Assert that the record list contains the empty input
        assertEquals(1, csvParser.recordList.size());
        assertEquals(null, csvParser.recordList.get(0)); // Assuming handleNull returns null for empty input
    }

    private void invokeAddRecordValue(boolean lastRecord) {
        try {
            var method = CSVParser.class.getDeclaredMethod("addRecordValue", boolean.class);
            method.setAccessible(true);
            method.invoke(csvParser, lastRecord);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}