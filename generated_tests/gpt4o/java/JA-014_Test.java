package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CSVFormatTest {

    @Test
    void testPrintWithQuotes_NoQuotes() throws IOException {
        CSVFormat csvFormat = Mockito.mock(CSVFormat.class);
        when(csvFormat.getQuoteMode()).thenReturn(QuoteMode.NONE);
        
        Reader reader = mock(Reader.class);
        StringWriter appendable = new StringWriter();
        
        csvFormat.printWithQuotes(reader, appendable);
        
        verify(csvFormat).printWithEscapes(reader, appendable);
        assertEquals("", appendable.toString());
    }

    @Test
    void testPrintWithQuotes_WithQuotesAndNoEscape() throws IOException {
        CSVFormat csvFormat = Mockito.mock(CSVFormat.class);
        when(csvFormat.getQuoteMode()).thenReturn(QuoteMode.ALL);
        when(csvFormat.getQuoteCharacter()).thenReturn('"');
        when(csvFormat.isEscapeCharacterSet()).thenReturn(false);
        
        Reader reader = mock(Reader.class);
        when(reader.read()).thenReturn('H', 'e', 'l', 'l', 'o', -1);
        StringWriter appendable = new StringWriter();
        
        csvFormat.printWithQuotes(reader, appendable);
        
        assertEquals("\"Hello\"", appendable.toString());
    }

    @Test
    void testPrintWithQuotes_WithQuotesAndEscape() throws IOException {
        CSVFormat csvFormat = Mockito.mock(CSVFormat.class);
        when(csvFormat.getQuoteMode()).thenReturn(QuoteMode.ALL);
        when(csvFormat.getQuoteCharacter()).thenReturn('"');
        when(csvFormat.isEscapeCharacterSet()).thenReturn(true);
        when(csvFormat.getEscapeChar()).thenReturn('\\');
        
        Reader reader = mock(Reader.class);
        when(reader.read()).thenReturn('H', 'e', '"', 'l', 'l', 'o', -1);
        StringWriter appendable = new StringWriter();
        
        csvFormat.printWithQuotes(reader, appendable);
        
        assertEquals("\"He\"\"llo\"", appendable.toString());
    }

    @Test
    void testPrintWithQuotes_EscapeCharacter() throws IOException {
        CSVFormat csvFormat = Mockito.mock(CSVFormat.class);
        when(csvFormat.getQuoteMode()).thenReturn(QuoteMode.ALL);
        when(csvFormat.getQuoteCharacter()).thenReturn('"');
        when(csvFormat.isEscapeCharacterSet()).thenReturn(true);
        when(csvFormat.getEscapeChar()).thenReturn('\\');
        
        Reader reader = mock(Reader.class);
        when(reader.read()).thenReturn('H', 'e', '\\', 'l', 'l', 'o', -1);
        StringWriter appendable = new StringWriter();
        
        csvFormat.printWithQuotes(reader, appendable);
        
        assertEquals("\"He\\llo\"", appendable.toString());
    }
}