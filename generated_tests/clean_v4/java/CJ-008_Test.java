import org.apache.commons.csv.ExtendedBufferedReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ExtendedBufferedReaderTest {

    @Test
    public void testReadLineReturnsNullOnEOF() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader(""));
        assertNull(instance.readLine());
    }

    @Test
    public void testReadLineReturnsSingleLine() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("Hello World\n"));
        assertEquals("Hello World", instance.readLine());
    }

    @Test
    public void testReadLineHandlesCRLF() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("Hello World\r\nNext Line\n"));
        assertEquals("Hello World", instance.readLine());
        assertEquals("Next Line", instance.readLine());
    }

    @Test
    public void testReadLineHandlesCR() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("Hello World\rNext Line"));
        assertEquals("Hello World", instance.readLine());
        assertEquals("Next Line", instance.readLine());
    }

    @Test
    public void testReadLineHandlesMultipleLines() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("Line 1\nLine 2\nLine 3\n"));
        assertEquals("Line 1", instance.readLine());
        assertEquals("Line 2", instance.readLine());
        assertEquals("Line 3", instance.readLine());
        assertNull(instance.readLine());
    }

    @Test
    public void testReadLineHandlesEmptyLines() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("\n\n\n"));
        assertEquals("", instance.readLine());
        assertEquals("", instance.readLine());
        assertEquals("", instance.readLine());
        assertNull(instance.readLine());
    }

    @Test
    public void testReadLineHandlesOnlyCR() throws IOException {
        ExtendedBufferedReader instance = new ExtendedBufferedReader(new StringReader("\r\r\r"));
        assertEquals("", instance.readLine());
        assertEquals("", instance.readLine());
        assertEquals("", instance.readLine());
        assertNull(instance.readLine());
    }
}