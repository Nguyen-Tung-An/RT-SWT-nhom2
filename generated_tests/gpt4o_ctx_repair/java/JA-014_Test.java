package org.apache.commons.csv;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSVFormatTest {

    @Test
    void testPrintWithQuotes_NoQuotes() throws IOException {
        CSVFormat format = CSVFormat.newFormat(',').withQuoteMode(QuoteMode.NONE);
        StringWriter writer = new StringWriter();
        Reader reader = new StringReader(""); // Simulate EOF

        format.print(writer, reader);
        assertEquals("", writer.toString());
    }

    @Test
    void testPrintWithQuotes_WithQuotes() throws IOException {
        CSVFormat format = CSVFormat.newFormat(',').withQuote('\"').withQuoteMode(QuoteMode.MINIMAL);
        StringWriter writer = new StringWriter();
        Reader reader = new StringReader("Hello \"World"); // Simulate input

        format.print(writer, reader);
        assertEquals("\"Hello \"\"World\"", writer.toString());
    }

    @Test
    void testPrintWithQuotes_WithEscapes() throws IOException {
        CSVFormat format = CSVFormat.newFormat(',').withQuote('\"').withEscape('\\').withQuoteMode(QuoteMode.MINIMAL);
        StringWriter writer = new StringWriter();
        Reader reader = new StringReader("Hello \\\"World"); // Simulate input

        format.print(writer, reader);
        assertEquals("\"Hello \\\"\"\"World\"", writer.toString());
    }

    @Test
    void testPrintWithQuotes_EmptyInput() throws IOException {
        CSVFormat format = CSVFormat.newFormat(',').withQuote('\"').withQuoteMode(QuoteMode.MINIMAL);
        StringWriter writer = new StringWriter();
        Reader reader = new StringReader(""); // Simulate EOF

        format.print(writer, reader);
        assertEquals("\"\"", writer.toString());
    }
}