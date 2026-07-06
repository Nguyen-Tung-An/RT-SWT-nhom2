package org.jsoup.examples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FormattingVisitorTest {
    private final FormattingVisitor visitor = new FormattingVisitor();

    @Test
    void testAppend_NewlineAtStart() {
        visitor.append("\nHello");
        assertEquals(0, visitor.getWidth());
    }

    @Test
    void testAppend_SingleSpace() {
        visitor.append(" ");
        assertEquals(0, visitor.getAccum().length());
    }

    @Test
    void testAppend_AccumulateText() {
        visitor.append("Hello");
        assertEquals("Hello", visitor.getAccum().toString());
        assertEquals(5, visitor.getWidth());
    }

    @Test
    void testAppend_WrapText() {
        visitor.setMaxWidth(5);
        visitor.append("Hello World");
        assertEquals("Hello\nWorld", visitor.getAccum().toString());
        assertEquals(5, visitor.getWidth());
    }

    @Test
    void testAppend_IgnoreLongSpaces() {
        visitor.append("Hello");
        visitor.append(" ");
        visitor.append(" ");
        visitor.append("World");
        assertEquals("Hello World", visitor.getAccum().toString());
        assertEquals(11, visitor.getWidth());
    }

    @Test
    void testAppend_FitsWithoutWrap() {
        visitor.setMaxWidth(20);
        visitor.append("Hello World");
        assertEquals("Hello World", visitor.getAccum().toString());
        assertEquals(11, visitor.getWidth());
    }
}