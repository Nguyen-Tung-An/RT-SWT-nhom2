package org.apache.commons.csv;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.util.concurrent.locks.ReentrantLock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSVPrinterTest {
    private CSVPrinter csvPrinter;
    private StringWriter stringWriter;

    @BeforeEach
    void setUp() {
        stringWriter = new StringWriter();
        csvPrinter = new CSVPrinter(stringWriter, new CSVFormat.Builder().setCommentMarker('#').build());
    }

    @Test
    void testPrintComment_NullComment() throws IOException {
        csvPrinter.printComment(null);
        assertEquals("", stringWriter.toString());
    }

    @Test
    void testPrintComment_NoCommentMarkerSet() throws IOException {
        csvPrinter = new CSVPrinter(stringWriter, new CSVFormat.Builder().build());
        csvPrinter.printComment("This is a comment");
        assertEquals("", stringWriter.toString());
    }

    @Test
    void testPrintComment_EmptyComment() throws IOException {
        csvPrinter.printComment("");
        assertEquals("", stringWriter.toString());
    }

    @Test
    void testPrintComment_SingleLineComment() throws IOException {
        csvPrinter.printComment("This is a comment");
        assertEquals("# This is a comment\n", stringWriter.toString());
    }

    @Test
    void testPrintComment_MultiLineComment() throws IOException {
        csvPrinter.printComment("Line 1\nLine 2");
        assertEquals("# Line 1\n# Line 2\n", stringWriter.toString());
    }

    @Test
    void testPrintComment_CarriageReturnLineFeed() throws IOException {
        csvPrinter.printComment("Line 1\r\nLine 2");
        assertEquals("# Line 1\n# Line 2\n", stringWriter.toString());
    }

    @Test
    void testPrintComment_CommentWithCR() throws IOException {
        csvPrinter.printComment("Line 1\rLine 2");
        assertEquals("# Line 1\n# Line 2\n", stringWriter.toString());
    }
}