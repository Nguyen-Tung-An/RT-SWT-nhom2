import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelpFormatterTest {

    private final HelpFormatter helpFormatter = new HelpFormatter();

    @Test
    void testAppendWrappedText_WidthZero() throws IOException {
        StringWriter writer = new StringWriter();
        String result = helpFormatter.appendWrappedText(writer, 0, 4, "Sample text").toString();
        assertEquals("", result);
    }

    @Test
    void testAppendWrappedText_WidthNegative() throws IOException {
        StringWriter writer = new StringWriter();
        String result = helpFormatter.appendWrappedText(writer, -1, 4, "Sample text").toString();
        assertEquals("", result);
    }

    @Test
    void testAppendWrappedText_NoWrap() throws IOException {
        StringWriter writer = new StringWriter();
        String result = helpFormatter.appendWrappedText(writer, 20, 4, "This is a single line text.").toString();
        assertEquals("This is a single line text.", result);
    }

    @Test
    void testAppendWrappedText_WithWrap() throws IOException {
        StringWriter writer = new StringWriter();
        String result = helpFormatter.appendWrappedText(writer, 10, 4, "This is a long line that needs to be wrapped.").toString();
        assertEquals("This is a\nlong line\nthat needs\nto be\nwrapped.", result);
    }

    @Test
    void testAppendWrappedText_NextLineTabStopGreaterThanWidth() throws IOException {
        StringWriter writer = new StringWriter();
        String result = helpFormatter.appendWrappedText(writer, 10, 15, "This is a long line that needs to be wrapped.").toString();
        assertEquals("This is a\nlong line\nthat needs\nto be\nwrapped.", result);
    }

    @Test
    void testAppendWrappedText_NextLineTabStopEqualToWidth() throws IOException {
        StringWriter writer = new StringWriter();
        String result = helpFormatter.appendWrappedText(writer, 10, 10, "This is a long line that needs to be wrapped.").toString();
        assertEquals("This is a\nlong line\nthat needs\nto be\nwrapped.", result);
    }

    @Test
    void testAppendWrappedText_EmptyString() throws IOException {
        StringWriter writer = new StringWriter();
        String result = helpFormatter.appendWrappedText(writer, 10, 4, "").toString();
        assertEquals("", result);
    }
}