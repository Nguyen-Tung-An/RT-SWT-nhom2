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
        csvPrinter = new CSVPrinter(stringWriter, CSVFormat.DEFAULT);
    }

    @Test
    void testPrintComment_NullComment() throws IOException {
        csvPrinter.printComment(null);
        assertEquals("", stringWriter.toString());
    }

    @Test
    void testPrintComment_CommentMarkerNotSet() throws IOException {
        csvPrinter.format = new CSVFormat() {
            @Override
            public boolean isCommentMarkerSet() {
                return false;
            }
        };
        csvPrinter.printComment("This is a comment");
        assertEquals("", stringWriter.toString());
    }

    @Test
    void testPrintComment_ValidComment() throws IOException {
        csvPrinter.printComment("This is a comment");
        assertEquals("# This is a comment\n", stringWriter.toString());
    }

    @Test
    void testPrintComment_NewLineInComment() throws IOException {
        csvPrinter.printComment("Line 1\nLine 2");
        assertEquals("# Line 1\n# Line 2\n", stringWriter.toString());
    }

    @Test
    void testPrintComment_CarriageReturnLineFeed() throws IOException {
        csvPrinter.printComment("Line 1\r\nLine 2");
        assertEquals("# Line 1\n# Line 2\n", stringWriter.toString());
    }

    @Test
    void testPrintComment_CommentWithMultipleNewLines() throws IOException {
        csvPrinter.printComment("Line 1\n\nLine 2");
        assertEquals("# Line 1\n# \n# Line 2\n", stringWriter.toString());
    }
}