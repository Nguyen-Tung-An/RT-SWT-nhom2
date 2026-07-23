import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.junit.jupiter.api.Test;

import java.io.StringWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSVPrinterTest {

    @Test
    public void testCSVPrinterWithNullAppendable() {
        Exception exception = null;
        try {
            new CSVPrinter(null, CSVFormat.DEFAULT);
        } catch (Exception e) {
            exception = e;
        }
        assertEquals("appendable", exception.getMessage());
    }

    @Test
    public void testCSVPrinterWithNullFormat() {
        StringWriter writer = new StringWriter();
        Exception exception = null;
        try {
            new CSVPrinter(writer, null);
        } catch (Exception e) {
            exception = e;
        }
        assertEquals("format", exception.getMessage());
    }

    @Test
    public void testCSVPrinterWithHeaderComments() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withHeader("Header1", "Header2").withHeaderComments("Comment1", "Comment2");
        CSVPrinter printer = new CSVPrinter(writer, format);
        String expectedOutput = "# Comment1\n# Comment2\nHeader1,Header2\n";
        assertEquals(expectedOutput, writer.toString());
    }

    @Test
    public void testCSVPrinterWithSkipHeaderRecord() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withHeader("Header1", "Header2").withSkipHeaderRecord(true);
        CSVPrinter printer = new CSVPrinter(writer, format);
        String expectedOutput = "";
        assertEquals(expectedOutput, writer.toString());
    }

    @Test
    public void testCSVPrinterWithNoHeaderComments() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withHeader("Header1", "Header2").withHeaderComments();
        CSVPrinter printer = new CSVPrinter(writer, format);
        String expectedOutput = "Header1,Header2\n";
        assertEquals(expectedOutput, writer.toString());
    }
}