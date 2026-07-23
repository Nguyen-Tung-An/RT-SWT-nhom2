package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class ExtendedBufferedReaderTest {

    @Test
    void testReadLine_EmptyInput() throws IOException {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader(""));
        assertNull(reader.readLine());
    }

    @Test
    void testReadLine_SingleLine() throws IOException {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("Hello World\n"));
        assertEquals("Hello World", reader.readLine());
    }

    @Test
    void testReadLine_MultipleLines() throws IOException {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("Line 1\nLine 2\n"));
        assertEquals("Line 1", reader.readLine());
        assertEquals("Line 2", reader.readLine());
    }

    @Test
    void testReadLine_CarriageReturn() throws IOException {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("Line 1\rLine 2\r\n"));
        assertEquals("Line 1", reader.readLine());
        assertEquals("Line 2", reader.readLine());
    }

    @Test
    void testReadLine_EndOfFile() throws IOException {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("Line 1\nLine 2"));
        assertEquals("Line 1", reader.readLine());
        assertEquals("Line 2", reader.readLine());
        assertNull(reader.readLine());
    }

    @Test
    void testReadLine_OnlyLineFeed() throws IOException {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("\n"));
        assertEquals("", reader.readLine());
    }

    @Test
    void testReadLine_OnlyCarriageReturn() throws IOException {
        ExtendedBufferedReader reader = new ExtendedBufferedReader(new StringReader("\r"));
        assertEquals("", reader.readLine());
    }
}