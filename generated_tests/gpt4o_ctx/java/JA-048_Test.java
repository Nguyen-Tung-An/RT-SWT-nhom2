package org.jsoup.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HtmlToPlainTextFormattingVisitorTest {
    private final HtmlToPlainText.FormattingVisitor visitor = new HtmlToPlainText.FormattingVisitor();

    @Test
    void testAppend_NewlineAtStart() {
        visitor.append("Hello");
        visitor.append("\nWorld");
        assertEquals("World", visitor.toString());
    }

    @Test
    void testAppend_SingleSpace() {
        visitor.append("Hello");
        visitor.append(" ");
        visitor.append("World");
        assertEquals("Hello World", visitor.toString());
    }

    @Test
    void testAppend_MultipleSpaces() {
        visitor.append("Hello");
        visitor.append(" ");
        visitor.append(" ");
        visitor.append("World");
        assertEquals("Hello World", visitor.toString());
    }

    @Test
    void testAppend_WrapText() {
        visitor.append("This is a long text that should wrap around the max width.");
        assertTrue(visitor.toString().contains("\n"));
    }

    @Test
    void testAppend_FitsWithoutWrap() {
        visitor.append("Short text.");
        assertEquals("Short text.", visitor.toString());
    }

    @Test
    void testAppend_EmptyString() {
        visitor.append("");
        assertEquals("", visitor.toString());
    }
}