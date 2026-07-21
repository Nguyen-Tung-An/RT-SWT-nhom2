package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class CSVParserTest {

    private class MockFormat {
        private boolean trailingDelimiter;

        public MockFormat(boolean trailingDelimiter) {
            this.trailingDelimiter = trailingDelimiter;
        }

        public boolean getTrailingDelimiter() {
            return trailingDelimiter;
        }
    }

    private class MockReusableToken {
        private StringBuilder content;
        private boolean isQuoted;

        public MockReusableToken(String content, boolean isQuoted) {
            this.content = new StringBuilder(content);
            this.isQuoted = isQuoted;
        }
    }

    private class MockCSVParser {
        private List<String> recordList = new ArrayList<>();
        private MockFormat format;
        private MockReusableToken reusableToken;

        public MockCSVParser(MockFormat format, MockReusableToken reusableToken) {
            this.format = format;
            this.reusableToken = reusableToken;
        }

        private void addRecordValue(final boolean lastRecord) {
            final String input = reusableToken.content.toString().trim();
            if (lastRecord && input.isEmpty() && format.getTrailingDelimiter() && !reusableToken.isQuoted) {
                return;
            }
            recordList.add(handleNull(input));
        }

        private String handleNull(String input) {
            return input == null ? "" : input;
        }

        public List<String> getRecordList() {
            return recordList;
        }
    }

    @Test
    void testAddRecordValue_EmptyInput_NotLastRecord() {
        MockFormat format = new MockFormat(true);
        MockReusableToken token = new MockReusableToken("", false);
        MockCSVParser parser = new MockCSVParser(format, token);
        parser.addRecordValue(false);
        assertEquals(1, parser.getRecordList().size());
        assertEquals("", parser.getRecordList().get(0));
    }

    @Test
    void testAddRecordValue_EmptyInput_LastRecord_WithTrailingDelimiter() {
        MockFormat format = new MockFormat(true);
        MockReusableToken token = new MockReusableToken("", false);
        MockCSVParser parser = new MockCSVParser(format, token);
        parser.addRecordValue(true);
        assertEquals(0, parser.getRecordList().size());
    }

    @Test
    void testAddRecordValue_EmptyInput_LastRecord_WithoutTrailingDelimiter() {
        MockFormat format = new MockFormat(false);
        MockReusableToken token = new MockReusableToken("", false);
        MockCSVParser parser = new MockCSVParser(format, token);
        parser.addRecordValue(true);
        assertEquals(1, parser.getRecordList().size());
        assertEquals("", parser.getRecordList().get(0));
    }

    @Test
    void testAddRecordValue_NonEmptyInput_LastRecord() {
        MockFormat format = new MockFormat(true);
        MockReusableToken token = new MockReusableToken("value", false);
        MockCSVParser parser = new MockCSVParser(format, token);
        parser.addRecordValue(true);
        assertEquals(1, parser.getRecordList().size());
        assertEquals("value", parser.getRecordList().get(0));
    }

    @Test
    void testAddRecordValue_QuotedEmptyInput_LastRecord_WithTrailingDelimiter() {
        MockFormat format = new MockFormat(true);
        MockReusableToken token = new MockReusableToken("\"\"", true);
        MockCSVParser parser = new MockCSVParser(format, token);
        parser.addRecordValue(true);
        assertEquals(1, parser.getRecordList().size());
        assertEquals("\"\"", parser.getRecordList().get(0));
    }
}