import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.StringWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSVPrinterTest {

    private CSVPrinter csvPrinter;
    private StringWriter stringWriter;

    @BeforeEach
    public void setUp() {
        stringWriter = new StringWriter();
        csvPrinter = new CSVPrinter(stringWriter, CSVFormat.DEFAULT);
    }

    @Test
    public void testPrintComment_NullComment() throws IOException {
        csvPrinter.printComment(null);
        assertEquals("", stringWriter.toString());
    }

    @Test
    public void testPrintComment_CommentMarkerNotSet() throws IOException {
        csvPrinter.printComment("This is a comment");
        assertEquals("", stringWriter.toString());
    }

    @Test
    public void testPrintComment_EmptyComment() throws IOException {
        csvPrinter.printComment("");
        assertEquals("", stringWriter.toString());
    }

    @Test
    public void testPrintComment_SingleLineComment() throws IOException {
        csvPrinter.printComment("This is a comment");
        assertEquals("# This is a comment\n", stringWriter.toString());
    }

    @Test
    public void testPrintComment_MultiLineComment() throws IOException {
        csvPrinter.printComment("Line 1\nLine 2");
        assertEquals("# Line 1\n# Line 2\n", stringWriter.toString());
    }

    @Test
    public void testPrintComment_CommentWithCarriageReturn() throws IOException {
        csvPrinter.printComment("Line 1\rLine 2");
        assertEquals("# Line 1\n# Line 2\n", stringWriter.toString());
    }

    @Test
    public void testPrintComment_CommentWithMixedLineEndings() throws IOException {
        csvPrinter.printComment("Line 1\r\nLine 2\nLine 3\rLine 4");
        assertEquals("# Line 1\n# Line 2\n# Line 3\n# Line 4\n", stringWriter.toString());
    }
}