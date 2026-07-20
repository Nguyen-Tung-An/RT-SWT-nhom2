package org.apache.commons.csv;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExtendedBufferedReaderTest {

    @Test
    void testReadReturnsCR() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("\r"));
        int result = instance.read();
        assertEquals('\r', result);
    }

    @Test
    void testReadReturnsLF() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("\n"));
        int result = instance.read();
        assertEquals('\n', result);
    }

    @Test
    void testReadReturnsEOF() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader(""));
        int result = instance.read();
        assertEquals(-1, result); // EOF is represented by -1
    }

    @Test
    void testReadIncrementsLineNumberOnCR() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("\r\n"));
        instance.read(); // Read CR
        instance.read(); // Read LF
        assertEquals(1, instance.lineNumber);
    }

    @Test
    void testReadIncrementsLineNumberOnLFWithoutCR() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("\n"));
        instance.read(); // Read LF
        assertEquals(1, instance.lineNumber);
    }

    @Test
    void testReadDoesNotIncrementLineNumberOnEOF() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("\r"));
        instance.read(); // Read CR
        instance.read(); // Read EOF
        assertEquals(1, instance.lineNumber);
    }

    @Test
    void testReadTracksBytesRead() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("abc"), Charset.defaultCharset(), true);
        instance.read(); // Read 'a'
        instance.read(); // Read 'b'
        instance.read(); // Read 'c'
        assertEquals(3, instance.bytesRead);
    }

    @Test
    void testReadUpdatesLastChar() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("a"));
        instance.read(); // Read 'a'
        assertEquals('a', instance.lastChar);
    }

    @Test
    void testReadUpdatesPosition() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("abc"));
        instance.read(); // Read 'a'
        instance.read(); // Read 'b'
        assertEquals(2, instance.position); // Position should be 2 after reading 'b'
    }
}