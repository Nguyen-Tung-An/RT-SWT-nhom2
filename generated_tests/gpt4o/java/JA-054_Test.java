package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class ExtendedBufferedReaderTest {

    private class MockExtendedBufferedReader extends ExtendedBufferedReader {
        private int[] inputs;
        private int index = 0;

        public MockExtendedBufferedReader(int[] inputs) {
            super(new java.io.StringReader(""));
            this.inputs = inputs;
        }

        @Override
        public int read() throws IOException {
            if (index < inputs.length) {
                return inputs[index++];
            }
            return EOF; // Simulate end of stream
        }
    }

    @Test
    void testRead_CR() throws IOException {
        MockExtendedBufferedReader reader = new MockExtendedBufferedReader(new int[]{CR});
        assertEquals(CR, reader.read());
    }

    @Test
    void testRead_LF() throws IOException {
        MockExtendedBufferedReader reader = new MockExtendedBufferedReader(new int[]{LF});
        assertEquals(LF, reader.read());
    }

    @Test
    void testRead_EOF() throws IOException {
        MockExtendedBufferedReader reader = new MockExtendedBufferedReader(new int[]{EOF});
        assertEquals(EOF, reader.read());
    }

    @Test
    void testRead_CR_LF() throws IOException {
        MockExtendedBufferedReader reader = new MockExtendedBufferedReader(new int[]{CR, LF});
        assertEquals(CR, reader.read());
        assertEquals(LF, reader.read());
    }

    @Test
    void testRead_NonNewline() throws IOException {
        MockExtendedBufferedReader reader = new MockExtendedBufferedReader(new int[]{'a', 'b', 'c'});
        assertEquals('a', reader.read());
        assertEquals('b', reader.read());
        assertEquals('c', reader.read());
    }

    @Test
    void testRead_MultipleCharacters() throws IOException {
        MockExtendedBufferedReader reader = new MockExtendedBufferedReader(new int[]{'a', CR, 'b', LF, 'c', EOF});
        assertEquals('a', reader.read());
        assertEquals(CR, reader.read());
        assertEquals('b', reader.read());
        assertEquals(LF, reader.read());
        assertEquals('c', reader.read());
        assertEquals(EOF, reader.read());
    }
}