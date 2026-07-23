package org.apache.commons.csv;

import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.nio.charset.Charset;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExtendedBufferedReaderTest {

    @Test
    void testGetLineNumberAtEOL() {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("Line 1\nLine 2"), Charset.defaultCharset(), false);
        instance.lastChar = '\n'; // Simulate EOL
        instance.lineNumber = 1;
        assertEquals(1, instance.getLineNumber());
    }

    @Test
    void testGetLineNumberAtEOF() {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("Line 1\nLine 2"), Charset.defaultCharset(), false);
        instance.lastChar = -1; // Simulate EOF
        instance.lineNumber = 2;
        assertEquals(2, instance.getLineNumber());
    }

    @Test
    void testGetLineNumberAtUndefined() {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("Line 1\nLine 2"), Charset.defaultCharset(), false);
        instance.lastChar = -2; // Simulate UNDEFINED
        instance.lineNumber = 3;
        assertEquals(3, instance.getLineNumber());
    }

    @Test
    void testGetLineNumberAtCR() {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("Line 1\rLine 2"), Charset.defaultCharset(), false);
        instance.lastChar = '\r'; // Simulate CR
        instance.lineNumber = 1;
        assertEquals(1, instance.getLineNumber());
    }

    @Test
    void testGetLineNumberNotAtEOL() {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("Line 1\nLine 2"), Charset.defaultCharset(), false);
        instance.lastChar = 'L'; // Simulate a character not at EOL
        instance.lineNumber = 1;
        assertEquals(2, instance.getLineNumber());
    }
}