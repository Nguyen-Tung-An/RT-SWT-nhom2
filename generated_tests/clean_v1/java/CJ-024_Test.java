package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.StringWriter;
import java.io.IOException;

public class CSVPrinterTest {

    @Test
    void testCSVPrinter_NullAppendable() {
        assertThrows(NullPointerException.class, () -> {
            new CSVPrinter(null, CSVFormat.DEFAULT);
        });
    }

    @Test
    void testCSVPrinter_NullFormat() {
        StringWriter writer = new StringWriter();
        assertThrows(NullPointerException.class, () -> {
            new CSVPrinter(writer, null);
        });
    }

    @Test
    void testCSVPrinter_ValidInput_NoHeader() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withHeader("Column1", "Column2").withSkipHeaderRecord(true);
        CSVPrinter printer = new CSVPrinter(writer, format);
        assertNotNull(printer);
    }

    @Test
    void testCSVPrinter_ValidInput_WithHeader() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withHeader("Column1", "Column2").withSkipHeaderRecord(false);
        CSVPrinter printer = new CSVPrinter(writer, format);
        assertNotNull(printer);
        assertTrue(writer.toString().contains("Column1,Column2"));
    }

    @Test
    void testCSVPrinter_WithHeaderComments() throws IOException {
        StringWriter writer = new StringWriter();
        String[] comments = {"Comment 1", "Comment 2"};
        CSVFormat format = CSVFormat.DEFAULT.withHeader("Column1", "Column2").withHeaderComments(comments);
        CSVPrinter printer = new CSVPrinter(writer, format);
        assertNotNull(printer);
        assertTrue(writer.toString().contains("Comment 1"));
        assertTrue(writer.toString().contains("Comment 2"));
    }
}