package org.apache.commons.cli;

import org.junit.jupiter.api.Test;

import java.io.StringWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelpFormatterTest {

    @Test
    void testAppendWrappedText_WidthZero() throws IOException {
        StringWriter writer = new StringWriter();
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendWrappedText(writer, 0, 4, "This text should not be wrapped.");
        assertEquals("", writer.toString());
    }

    @Test
    void testAppendWrappedText_WidthNegative() throws IOException {
        StringWriter writer = new StringWriter();
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendWrappedText(writer, -1, 4, "This text should not be wrapped.");
        assertEquals("", writer.toString());
    }

    @Test
    void testAppendWrappedText_NoWrapNeeded() throws IOException {
        StringWriter writer = new StringWriter();
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendWrappedText(writer, 50, 4, "This text fits within the specified width.");
        assertEquals("This text fits within the specified width.", writer.toString());
    }

    @Test
    void testAppendWrappedText_WrapAtWidth() throws IOException {
        StringWriter writer = new StringWriter();
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendWrappedText(writer, 10, 4, "This text is too long and should be wrapped.");
        assertEquals("This text\nis too long\nand should\nbe wrapped.", writer.toString().trim());
    }

    @Test
    void testAppendWrappedText_WrapWithTabStop() throws IOException {
        StringWriter writer = new StringWriter();
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendWrappedText(writer, 10, 4, "This text is too long and should be wrapped with tab stop.");
        assertEquals("This text\n    is too\n    long and\n    should be\n    wrapped\n    with tab\n    stop.", writer.toString().trim());
    }

    @Test
    void testAppendWrappedText_ExactWidth() throws IOException {
        StringWriter writer = new StringWriter();
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendWrappedText(writer, 5, 4, "Hello World");
        assertEquals("Hello\nWorld", writer.toString().trim());
    }

    @Test
    void testAppendWrappedText_EmptyString() throws IOException {
        StringWriter writer = new StringWriter();
        HelpFormatter formatter = new HelpFormatter();
        formatter.appendWrappedText(writer, 10, 4, "");
        assertEquals("", writer.toString());
    }
}