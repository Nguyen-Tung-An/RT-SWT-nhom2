package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import java.io.StringWriter;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSVPrinterTest {

    @Test
    public void testPrintComment_NullComment() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printComment(null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testPrintComment_NoCommentMarker() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker(null);
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printComment("This is a comment");
        assertEquals("", writer.toString());
    }

    @Test
    public void testPrintComment_EmptyComment() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printComment("");
        assertEquals("\n", writer.toString());
    }

    @Test
    public void testPrintComment_SingleLineComment() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printComment("This is a comment");
        assertEquals("# This is a comment\n", writer.toString());
    }

    @Test
    public void testPrintComment_MultiLineComment() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printComment("Line 1\nLine 2");
        assertEquals("# Line 1\n# Line 2\n", writer.toString());
    }

    @Test
    public void testPrintComment_CarriageReturnLineFeed() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printComment("Line 1\r\nLine 2");
        assertEquals("# Line 1\n# Line 2\n", writer.toString());
    }

    @Test
    public void testPrintComment_CommentWithSpecialCharacters() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printComment("Comment with # and other characters");
        assertEquals("# Comment with # and other characters\n", writer.toString());
    }
}