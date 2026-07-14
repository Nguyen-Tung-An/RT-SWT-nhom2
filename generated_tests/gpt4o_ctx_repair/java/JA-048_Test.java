package org.jsoup.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.jsoup.nodes.Node;

class HtmlToPlainTextFormattingVisitorTest {
    private final HtmlToPlainText.FormattingVisitor visitor = new HtmlToPlainText.FormattingVisitor();

    @Test
    void testAppend_NewlineAtStart() {
        visitor.head(new Node("Hello"));
        visitor.tail(new Node("\nWorld"));
        assertEquals("World", visitor.toString());
    }

    @Test
    void testAppend_SingleSpace() {
        visitor.head(new Node("Hello"));
        visitor.tail(new Node(" "));
        visitor.tail(new Node("World"));
        assertEquals("Hello World", visitor.toString());
    }

    @Test
    void testAppend_MultipleSpaces() {
        visitor.head(new Node("Hello"));
        visitor.tail(new Node(" "));
        visitor.tail(new Node(" "));
        visitor.tail(new Node("World"));
        assertEquals("Hello World", visitor.toString());
    }

    @Test
    void testAppend_WrapText() {
        visitor.head(new Node("This is a long text that should wrap around the max width."));
        assertTrue(visitor.toString().contains("\n"));
    }

    @Test
    void testAppend_FitsWithoutWrap() {
        visitor.head(new Node("Short text."));
        assertEquals("Short text.", visitor.toString());
    }

    @Test
    void testAppend_EmptyString() {
        visitor.head(new Node(""));
        assertEquals("", visitor.toString());
    }
}