package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import java.io.StringWriter;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class HelpFormatterTest {

    private final HelpFormatter helpFormatter = new HelpFormatter();

    @Test
    void testAppendWrappedText_WidthZero() throws IOException {
        StringWriter writer = new StringWriter();
        helpFormatter.appendWrappedText(writer, 0, 4, "This text should not be wrapped.");
        assertEquals("", writer.toString());
    }

    @Test
    void testAppendWrappedText_NegativeWidth() throws IOException {
        StringWriter writer = new StringWriter();
        helpFormatter.appendWrappedText(writer, -1, 4, "This text should not be wrapped.");
        assertEquals("", writer.toString());
    }

    @Test
    void testAppendWrappedText_NoWrap() throws IOException {
        StringWriter writer = new StringWriter();
        helpFormatter.appendWrappedText(writer, 50, 4, "This text is short and should not be wrapped.");
        assertEquals("This text is short and should not be wrapped.", writer.toString());
    }

    @Test
    void testAppendWrappedText_SingleWrap() throws IOException {
        StringWriter writer = new StringWriter();
        helpFormatter.appendWrappedText(writer, 10, 4, "This text is long and should be wrapped.");
        String expected = "This text\n" +
                          "is long\n" +
                          "and should\n" +
                          "be wrapped.";
        assertEquals(expected, writer.toString().trim());
    }

    @Test
    void testAppendWrappedText_MultipleWraps() throws IOException {
        StringWriter writer = new StringWriter();
        helpFormatter.appendWrappedText(writer, 15, 4, "This text is long and should be wrapped multiple times.");
        String expected = "This text is\n" +
                          "long and\n" +
                          "should be\n" +
                          "wrapped\n" +
                          "multiple\n" +
                          "times.";
        assertEquals(expected, writer.toString().trim());
    }

    @Test
    void testAppendWrappedText_ExactWidth() throws IOException {
        StringWriter writer = new StringWriter();
        helpFormatter.appendWrappedText(writer, 20, 4, "This text is exactly twenty characters.");
        String expected = "This text is\n" +
                          "exactly twenty\n" +
                          "characters.";
        assertEquals(expected, writer.toString().trim());
    }

    @Test
    void testAppendWrappedText_EmptyString() throws IOException {
        StringWriter writer = new StringWriter();
        helpFormatter.appendWrappedText(writer, 10, 4, "");
        assertEquals("", writer.toString());
    }
}