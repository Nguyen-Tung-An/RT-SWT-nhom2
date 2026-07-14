package org.apache.commons.csv;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.*;

class ExtendedBufferedReaderTest {
    private ExtendedBufferedReader reader;

    @BeforeEach
    void setUp() {
        reader = new ExtendedBufferedReader(new StringReader("Hello\nWorld"));
    }

    @Test
    void testRead_NewLine() throws IOException {
        assertEquals('H', reader.read());
        assertEquals('e', reader.read());
        assertEquals('l', reader.read());
        assertEquals('l', reader.read());
        assertEquals('o', reader.read());
        assertEquals('\n', reader.read());
        assertEquals('W', reader.read());
        assertEquals('o', reader.read());
        assertEquals('r', reader.read());
        assertEquals('l', reader.read());
        assertEquals('d', reader.read());
        assertEquals(-1, reader.read()); // End of stream
    }

    @Test
    void testRead_EmptyInput() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader(""));
        assertEquals(-1, reader.read()); // End of stream
    }

    @Test
    void testRead_SingleCharacter() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("A"));
        assertEquals('A', reader.read());
        assertEquals(-1, reader.read()); // End of stream
    }

    @Test
    void testRead_MultipleNewLines() throws IOException {
        reader = new ExtendedBufferedReader(new StringReader("Line1\nLine2\n"));
        assertEquals('L', reader.read());
        assertEquals('i', reader.read());
        assertEquals('n', reader.read());
        assertEquals('e', reader.read());
        assertEquals('1', reader.read());
        assertEquals('\n', reader.read());
        assertEquals('L', reader.read());
        assertEquals('i', reader.read());
        assertEquals('n', reader.read());
        assertEquals('e', reader.read());
        assertEquals('2', reader.read());
        assertEquals('\n', reader.read());
        assertEquals(-1, reader.read()); // End of stream
    }
}