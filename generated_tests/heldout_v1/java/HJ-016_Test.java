package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExtendedBufferedReaderTest {

    private class TestExtendedBufferedReader extends ExtendedBufferedReader {
        long lastChar;

        TestExtendedBufferedReader(long lastChar, long lineNumber) {
            this.lastChar = lastChar;
            this.lineNumber = lineNumber;
        }
    }

    @Test
    void testGetLineNumber_AtEOL() {
        TestExtendedBufferedReader reader = new TestExtendedBufferedReader(CR, 5);
        assertEquals(5, reader.getLineNumber());
    }

    @Test
    void testGetLineNumber_AtEOF() {
        TestExtendedBufferedReader reader = new TestExtendedBufferedReader(EOF, 10);
        assertEquals(10, reader.getLineNumber());
    }

    @Test
    void testGetLineNumber_AtUndefined() {
        TestExtendedBufferedReader reader = new TestExtendedBufferedReader(UNDEFINED, 3);
        assertEquals(3, reader.getLineNumber());
    }

    @Test
    void testGetLineNumber_AtLF() {
        TestExtendedBufferedReader reader = new TestExtendedBufferedReader(LF, 7);
        assertEquals(7, reader.getLineNumber());
    }

    @Test
    void testGetLineNumber_NotAtEOL() {
        TestExtendedBufferedReader reader = new TestExtendedBufferedReader('A', 4);
        assertEquals(5, reader.getLineNumber());
    }
}