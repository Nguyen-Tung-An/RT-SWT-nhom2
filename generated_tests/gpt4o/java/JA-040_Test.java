package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import java.io.StringWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionComparatorTest {

    private final OptionComparator optionComparator = new OptionComparator();

    @Test
    void testAppendWrappedText_WidthZero() throws IOException {
        StringWriter writer = new StringWriter();
        String result = optionComparator.appendWrappedText(writer, 0, 4, "Some text");
        assertEquals("", result.toString());
    }

    @Test
    void testAppendWrappedText_NoWrap() throws IOException {
        StringWriter writer = new StringWriter();
        String result = optionComparator.appendWrappedText(writer, 20, 4, "Some text that fits");
        assertEquals("Some text that fits", result.toString());
    }

    @Test
    void testAppendWrappedText_WithWrap() throws IOException {
        StringWriter writer = new StringWriter();
        String result = optionComparator.appendWrappedText(writer, 10, 4, "Some text that needs to be wrapped");
        assertEquals("Some text\nthat needs to be\nwrapped", result.toString().trim());
    }

    @Test
    void testAppendWrappedText_NextLineTabStop() throws IOException {
        StringWriter writer = new StringWriter();
        String result = optionComparator.appendWrappedText(writer, 10, 15, "Some text that needs to be wrapped");
        assertEquals("Some text\n          that needs\n          to be\n          wrapped", result.toString().trim());
    }

    @Test
    void testAppendWrappedText_EmptyString() throws IOException {
        StringWriter writer = new StringWriter();
        String result = optionComparator.appendWrappedText(writer, 10, 4, "");
        assertEquals("", result.toString());
    }

    @Test
    void testAppendWrappedText_SingleWord() throws IOException {
        StringWriter writer = new StringWriter();
        String result = optionComparator.appendWrappedText(writer, 10, 4, "Word");
        assertEquals("Word", result.toString());
    }
}