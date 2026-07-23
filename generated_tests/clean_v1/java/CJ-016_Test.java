package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.StringWriter;
import static org.junit.jupiter.api.Assertions.*;

public class CSVPrinterTest {

    @Test
    void testPrintComment_NullComment() throws IOException {
        StringWriter writer = new StringWriter();
        CSVPrinter printer = new CSVPrinter(writer, new CSVFormat.Builder().setCommentMarker('#').build());
        printer.printComment(null);
        assertEquals("", writer.toString());
    }

    @Test
    void testPrintComment_NoCommentMarker() throws IOException {
        StringWriter writer = new StringWriter();
        CSVPrinter printer = new CSVPrinter(writer, new CSVFormat.Builder().setCommentMarker(null).build());
        printer.printComment("This is a comment");
        assertEquals("", writer.toString());
    }

    @Test
    void testPrintComment_EmptyComment() throws IOException {
        StringWriter writer = new StringWriter();
        CSVPrinter printer = new CSVPrinter(writer, new CSVFormat.Builder().setCommentMarker('#').build());
        printer.printComment("");
        assertEquals("# \n", writer.toString());
    }

    @Test
    void testPrintComment_SingleLineComment() throws IOException {
        StringWriter writer = new StringWriter();
        CSVPrinter printer = new CSVPrinter(writer, new CSVFormat.Builder().setCommentMarker('#').build());
        printer.printComment("This is a comment");
        assertEquals("# This is a comment\n", writer.toString());
    }

    @Test
    void testPrintComment_MultiLineComment() throws IOException {
        StringWriter writer = new StringWriter();
        CSVPrinter printer = new CSVPrinter(writer, new CSVFormat.Builder().setCommentMarker('#').build());
        printer.printComment("Line 1\nLine 2");
        assertEquals("# Line 1\n# Line 2\n", writer.toString());
    }

    @Test
    void testPrintComment_CarriageReturnLineFeed() throws IOException {
        StringWriter writer = new StringWriter();
        CSVPrinter printer = new CSVPrinter(writer, new CSVFormat.Builder().setCommentMarker('#').build());
        printer.printComment("Line 1\r\nLine 2");
        assertEquals("# Line 1\n# Line 2\n", writer.toString());
    }
}