package org.apache.commons.csv;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.mockito.Mockito.*;

public class CSVPrinterTest {

    @Test
    void testPrintComment_NullComment() throws IOException {
        Appendable appendable = mock(Appendable.class);
        CSVFormat format = mock(CSVFormat.class);
        when(format.isCommentMarkerSet()).thenReturn(true);
        CSVPrinter printer = new CSVPrinter(appendable, format);
        printer.printComment(null);
        verify(appendable, never()).append(anyChar());
    }

    @Test
    void testPrintComment_CommentMarkerNotSet() throws IOException {
        Appendable appendable = mock(Appendable.class);
        CSVFormat format = mock(CSVFormat.class);
        when(format.isCommentMarkerSet()).thenReturn(false);
        CSVPrinter printer = new CSVPrinter(appendable, format);
        printer.printComment("This is a comment");
        verify(appendable, never()).append(anyChar());
    }

    @Test
    void testPrintComment_EmptyComment() throws IOException {
        Appendable appendable = mock(Appendable.class);
        CSVFormat format = mock(CSVFormat.class);
        when(format.isCommentMarkerSet()).thenReturn(true);
        CSVPrinter printer = new CSVPrinter(appendable, format);
        printer.printComment("");
        verify(appendable, times(1)).append(format.getCommentMarker().charValue());
        verify(appendable, times(1)).append(' ');
    }

    @Test
    void testPrintComment_SingleLineComment() throws IOException {
        Appendable appendable = mock(Appendable.class);
        CSVFormat format = mock(CSVFormat.class);
        when(format.isCommentMarkerSet()).thenReturn(true);
        when(format.getCommentMarker()).thenReturn('#');
        CSVPrinter printer = new CSVPrinter(appendable, format);
        printer.printComment("This is a comment");
        verify(appendable, times(1)).append('#');
        verify(appendable, times(1)).append(' ');
        verify(appendable, times(1)).append("This is a comment");
    }

    @Test
    void testPrintComment_MultiLineComment() throws IOException {
        Appendable appendable = mock(Appendable.class);
        CSVFormat format = mock(CSVFormat.class);
        when(format.isCommentMarkerSet()).thenReturn(true);
        when(format.getCommentMarker()).thenReturn('#');
        CSVPrinter printer = new CSVPrinter(appendable, format);
        printer.printComment("Line 1\nLine 2");
        verify(appendable, times(1)).append('#');
        verify(appendable, times(1)).append(' ');
        verify(appendable, times(1)).append("Line 1");
        verify(appendable, times(1)).append(System.lineSeparator());
        verify(appendable, times(1)).append('#');
        verify(appendable, times(1)).append(' ');
        verify(appendable, times(1)).append("Line 2");
    }
}