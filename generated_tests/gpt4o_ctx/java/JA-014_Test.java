package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSVFormatTest {

    @Test
    void testPrintWithQuotes_NoQuotes() throws IOException {
        CSVFormat format = CSVFormat.newFormat(',').withQuoteMode(QuoteMode.NONE);
        StringWriter writer = new StringWriter();
        Reader reader = Mockito.mock(Reader.class);
        Mockito.when(reader.read()).thenReturn(-1); // Simulate EOF

        format.printWithQuotes(reader, writer);
        assertEquals("", writer.toString());
    }

    @Test
    void testPrintWithQuotes_WithQuotes() throws IOException {
        CSVFormat format = CSVFormat.newFormat(',').withQuote('\"').withQuoteMode(QuoteMode.MINIMAL);
        StringWriter writer = new StringWriter();
        Reader reader = Mockito.mock(Reader.class);
        Mockito.when(reader.read()).thenReturn('H', 'e', 'l', 'l', 'o', ' ', '\"', 'W', 'o', 'r', 'l', 'd', -1); // Simulate input

        format.printWithQuotes(reader, writer);
        assertEquals("\"Hello \"\"World\"", writer.toString());
    }

    @Test
    void testPrintWithQuotes_WithEscapes() throws IOException {
        CSVFormat format = CSVFormat.newFormat(',').withQuote('\"').withEscape('\\').withQuoteMode(QuoteMode.MINIMAL);
        StringWriter writer = new StringWriter();
        Reader reader = Mockito.mock(Reader.class);
        Mockito.when(reader.read()).thenReturn('H', 'e', 'l', 'l', 'o', ' ', '\\', '\"', 'W', 'o', 'r', 'l', 'd', -1); // Simulate input

        format.printWithQuotes(reader, writer);
        assertEquals("\"Hello \\\"\"\"World\"", writer.toString());
    }

    @Test
    void testPrintWithQuotes_EmptyInput() throws IOException {
        CSVFormat format = CSVFormat.newFormat(',').withQuote('\"').withQuoteMode(QuoteMode.MINIMAL);
        StringWriter writer = new StringWriter();
        Reader reader = Mockito.mock(Reader.class);
        Mockito.when(reader.read()).thenReturn(-1); // Simulate EOF

        format.printWithQuotes(reader, writer);
        assertEquals("\"\"", writer.toString());
    }
}