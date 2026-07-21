import org.apache.commons.csv.ExtendedBufferedReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExtendedBufferedReaderTest {

    private ExtendedBufferedReader instance;

    @BeforeEach
    void setUp() {
        StringReader stringReader = new StringReader("line1\nline2\nline3");
        instance = new ExtendedBufferedReader(stringReader);
    }

    @Test
    void testGetLineNumberAfterReadingFirstLine() throws Exception {
        instance.readLine(); // Read first line
        assertEquals(1, instance.getLineNumber());
    }

    @Test
    void testGetLineNumberAfterReadingSecondLine() throws Exception {
        instance.readLine(); // Read first line
        instance.readLine(); // Read second line
        assertEquals(2, instance.getLineNumber());
    }

    @Test
    void testGetLineNumberAfterReadingAllLines() throws Exception {
        instance.readLine(); // Read first line
        instance.readLine(); // Read second line
        instance.readLine(); // Read third line
        assertEquals(3, instance.getLineNumber());
    }

    @Test
    void testGetLineNumberBeforeAnyRead() {
        assertEquals(0, instance.getLineNumber());
    }

    @Test
    void testGetLineNumberAfterReset() throws Exception {
        instance.readLine(); // Read first line
        instance.readLine(); // Read second line
        instance.reset(); // Reset the reader
        assertEquals(0, instance.getLineNumber());
    }
}