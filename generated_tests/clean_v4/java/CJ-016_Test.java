package org.apache.commons.csv;

import org.junit.jupiter.api.Test;

import java.io.StringWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CSVPrinterTest {

    @Test
    void testPrintComment_NullComment() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printComment(null);
        assertEquals("", writer.toString());
    }

    @Test
    void testPrintComment_CommentMarkerNotSet() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker(null);
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printComment("This is a comment");
        assertEquals("", writer.toString());
    }

    @Test
    void testPrintComment_EmptyComment() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printComment("");
        assertEquals("\n", writer.toString());
    }

    @Test
    void testPrintComment_SingleLineComment() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printComment("This is a comment");
        assertEquals("# This is a comment\n", writer.toString());
    }

    @Test
    void testPrintComment_MultiLineComment() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printComment("First line\nSecond line");
        assertEquals("# First line\n# Second line\n", writer.toString());
    }

    @Test
    void testPrintComment_CommentWithCarriageReturn() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printComment("Line 1\rLine 2");
        assertEquals("# Line 1\n# Line 2\n", writer.toString());
    }

    @Test
    void testPrintComment_CommentWithCarriageReturnAndLineFeed() throws IOException {
        StringWriter writer = new StringWriter();
        CSVFormat format = CSVFormat.DEFAULT.withCommentMarker('#');
        CSVPrinter printer = new CSVPrinter(writer, format);
        printer.printComment("Line 1\r\nLine 2");
        assertEquals("# Line 1\n# Line 2\n", writer.toString());
    }
}