import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.QuoteMode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CSVFormatTest {

    private CSVFormat instance;

    @BeforeEach
    void setUp() {
        instance = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);
    }

    @Test
    void testPrintWithQuotes_EmptyInput() throws IOException {
        StringReader reader = new StringReader("");
        StringWriter writer = new StringWriter();
        instance.printWithQuotes(reader, writer);
        assertEquals("\"\"", writer.toString());
    }

    @Test
    void testPrintWithQuotes_NoQuotes() throws IOException {
        StringReader reader = new StringReader("Hello World");
        StringWriter writer = new StringWriter();
        instance.printWithQuotes(reader, writer);
        assertEquals("\"Hello World\"", writer.toString());
    }

    @Test
    void testPrintWithQuotes_WithQuotes() throws IOException {
        StringReader reader = new StringReader("Hello \"World\"");
        StringWriter writer = new StringWriter();
        instance.printWithQuotes(reader, writer);
        assertEquals("\"Hello \"\"World\"\"", writer.toString());
    }

    @Test
    void testPrintWithQuotes_WithEscapeCharacter() throws IOException {
        instance = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL).withEscapeChar('\\');
        StringReader reader = new StringReader("Hello \\\"World\\\"");
        StringWriter writer = new StringWriter();
        instance.printWithQuotes(reader, writer);
        assertEquals("\"Hello \\\\\"\"World\\\\\"\"", writer.toString());
    }

    @Test
    void testPrintWithQuotes_OnlyQuotes() throws IOException {
        StringReader reader = new StringReader("\"\"");
        StringWriter writer = new StringWriter();
        instance.printWithQuotes(reader, writer);
        assertEquals("\"\"\"\"\"\"", writer.toString());
    }
}