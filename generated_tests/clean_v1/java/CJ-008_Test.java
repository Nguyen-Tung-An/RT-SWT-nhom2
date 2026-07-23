package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class ExtendedBufferedReaderTest {

    private class MockExtendedBufferedReader extends ExtendedBufferedReader {
        private final String input;
        private int index = 0;

        public MockExtendedBufferedReader(String input) {
            super(new java.io.StringReader(input));
        }

        @Override
        protected int read() throws IOException {
            if (index >= input.length()) {
                return EOF;
            }
            return input.charAt(index++);
        }

        @Override
        protected int peek() throws IOException {
            if (index >= input.length()) {
                return EOF;
            }
            return input.charAt(index);
        }
    }

    @Test
    void testReadLine_EmptyInput() throws IOException {
        MockExtendedBufferedReader reader = new MockExtendedBufferedReader("");
        assertNull(reader.readLine());
    }

    @Test
    void testReadLine_SingleLine() throws IOException {
        MockExtendedBufferedReader reader = new MockExtendedBufferedReader("Hello, World!");
        assertEquals("Hello, World!", reader.readLine());
    }

    @Test
    void testReadLine_MultipleLines() throws IOException {
        MockExtendedBufferedReader reader = new MockExtendedBufferedReader("Line 1\nLine 2\n");
        assertEquals("Line 1", reader.readLine());
        assertEquals("Line 2", reader.readLine());
    }

    @Test
    void testReadLine_CarriageReturnLineFeed() throws IOException {
        MockExtendedBufferedReader reader = new MockExtendedBufferedReader("Line 1\r\nLine 2\r\n");
        assertEquals("Line 1", reader.readLine());
        assertEquals("Line 2", reader.readLine());
    }

    @Test
    void testReadLine_CarriageReturn() throws IOException {
        MockExtendedBufferedReader reader = new MockExtendedBufferedReader("Line 1\rLine 2\r");
        assertEquals("Line 1", reader.readLine());
        assertEquals("Line 2", reader.readLine());
    }

    @Test
    void testReadLine_EndOfFile() throws IOException {
        MockExtendedBufferedReader reader = new MockExtendedBufferedReader("Line 1\n");
        assertEquals("Line 1", reader.readLine());
        assertNull(reader.readLine());
    }
}