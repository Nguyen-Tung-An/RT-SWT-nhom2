import org.apache.commons.csv.ExtendedBufferedReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExtendedBufferedReaderTest {

    private ExtendedBufferedReader instance;

    @BeforeEach
    void setUp() {
        instance = new ExtendedBufferedReader(new StringReader("Hello\nWorld"));
    }

    @Test
    void testReadReturnsCorrectCharacter() throws IOException {
        assertEquals('H', instance.read());
        assertEquals('e', instance.read());
        assertEquals('l', instance.read());
        assertEquals('l', instance.read());
        assertEquals('o', instance.read());
        assertEquals('\n', instance.read());
        assertEquals('W', instance.read());
        assertEquals('o', instance.read());
        assertEquals('r', instance.read());
        assertEquals('l', instance.read());
        assertEquals('d', instance.read());
        assertEquals(-1, instance.read()); // EOF
    }

    @Test
    void testReadHandlesLineBreaks() throws IOException {
        instance.read(); // Read 'H'
        instance.read(); // Read 'e'
        instance.read(); // Read 'l'
        instance.read(); // Read 'l'
        instance.read(); // Read 'o'
        assertEquals('\n', instance.read()); // Read line break
        assertEquals('W', instance.read()); // Read 'W'
        assertEquals('o', instance.read()); // Read 'o'
        assertEquals('r', instance.read()); // Read 'r'
        assertEquals('l', instance.read()); // Read 'l'
        assertEquals('d', instance.read()); // Read 'd'
        assertEquals(-1, instance.read()); // EOF
    }

    @Test
    void testReadHandlesMultipleLineBreaks() throws IOException {
        instance = new ExtendedBufferedReader(new StringReader("Line1\nLine2\nLine3"));
        assertEquals('L', instance.read()); // Read 'L'
        assertEquals('i', instance.read()); // Read 'i'
        assertEquals('n', instance.read()); // Read 'n'
        assertEquals('e', instance.read()); // Read 'e'
        assertEquals('1', instance.read()); // Read '1'
        assertEquals('\n', instance.read()); // Read line break
        assertEquals('L', instance.read()); // Read 'L'
        assertEquals('i', instance.read()); // Read 'i'
        assertEquals('n', instance.read()); // Read 'n'
        assertEquals('e', instance.read()); // Read 'e'
        assertEquals('2', instance.read()); // Read '2'
        assertEquals('\n', instance.read()); // Read line break
        assertEquals('L', instance.read()); // Read 'L'
        assertEquals('i', instance.read()); // Read 'i'
        assertEquals('n', instance.read()); // Read 'n'
        assertEquals('e', instance.read()); // Read 'e'
        assertEquals('3', instance.read()); // Read '3'
        assertEquals(-1, instance.read()); // EOF
    }

    @Test
    void testReadHandlesEOFCorrectly() throws IOException {
        instance = new ExtendedBufferedReader(new StringReader(""));
        assertEquals(-1, instance.read()); // EOF immediately
    }
}