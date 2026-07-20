package org.jsoup.examples;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HtmlToPlainTextFormattingVisitorTest {

    @Test
    void testAppendWithNewline() throws Exception {
        HtmlToPlainText.FormattingVisitor instance = new HtmlToPlainText.FormattingVisitor();
        Field widthField = HtmlToPlainText.FormattingVisitor.class.getDeclaredField("width");
        Field accumField = HtmlToPlainText.FormattingVisitor.class.getDeclaredField("accum");
        Field maxWidthField = HtmlToPlainText.FormattingVisitor.class.getDeclaredField("maxWidth");

        widthField.setAccessible(true);
        accumField.setAccessible(true);
        maxWidthField.setAccessible(true);

        maxWidthField.set(instance, 10);
        accumField.set(instance, new StringBuilder());
        widthField.set(instance, 5);

        Method m = HtmlToPlainText.FormattingVisitor.class.getDeclaredMethod("append", String.class);
        m.setAccessible(true);
        m.invoke(instance, "\n");

        assertEquals(0, widthField.get(instance));
    }

    @Test
    void testAppendWithSingleSpace() throws Exception {
        HtmlToPlainText.FormattingVisitor instance = new HtmlToPlainText.FormattingVisitor();
        Field widthField = HtmlToPlainText.FormattingVisitor.class.getDeclaredField("width");
        Field accumField = HtmlToPlainText.FormattingVisitor.class.getDeclaredField("accum");
        Field maxWidthField = HtmlToPlainText.FormattingVisitor.class.getDeclaredField("maxWidth");

        widthField.setAccessible(true);
        accumField.setAccessible(true);
        maxWidthField.setAccessible(true);

        maxWidthField.set(instance, 10);
        accumField.set(instance, new StringBuilder("Hello"));
        widthField.set(instance, 5);

        Method m = HtmlToPlainText.FormattingVisitor.class.getDeclaredMethod("append", String.class);
        m.setAccessible(true);
        m.invoke(instance, " ");

        assertEquals("Hello", accumField.get(instance).toString());
        assertEquals(5, widthField.get(instance));
    }

    @Test
    void testAppendWithWrapping() throws Exception {
        HtmlToPlainText.FormattingVisitor instance = new HtmlToPlainText.FormattingVisitor();
        Field widthField = HtmlToPlainText.FormattingVisitor.class.getDeclaredField("width");
        Field accumField = HtmlToPlainText.FormattingVisitor.class.getDeclaredField("accum");
        Field maxWidthField = HtmlToPlainText.FormattingVisitor.class.getDeclaredField("maxWidth");

        widthField.setAccessible(true);
        accumField.setAccessible(true);
        maxWidthField.setAccessible(true);

        maxWidthField.set(instance, 10);
        accumField.set(instance, new StringBuilder("Hello "));
        widthField.set(instance, 6);

        Method m = HtmlToPlainText.FormattingVisitor.class.getDeclaredMethod("append", String.class);
        m.setAccessible(true);
        m.invoke(instance, "world!");

        assertEquals("Hello \nworld!", accumField.get(instance).toString());
        assertEquals(6, widthField.get(instance)); // width should reset to the length of "world!"
    }

    @Test
    void testAppendWithNoWrap() throws Exception {
        HtmlToPlainText.FormattingVisitor instance = new HtmlToPlainText.FormattingVisitor();
        Field widthField = HtmlToPlainText.FormattingVisitor.class.getDeclaredField("width");
        Field accumField = HtmlToPlainText.FormattingVisitor.class.getDeclaredField("accum");
        Field maxWidthField = HtmlToPlainText.FormattingVisitor.class.getDeclaredField("maxWidth");

        widthField.setAccessible(true);
        accumField.setAccessible(true);
        maxWidthField.setAccessible(true);

        maxWidthField.set(instance, 20);
        accumField.set(instance, new StringBuilder("Hello "));
        widthField.set(instance, 6);

        Method m = HtmlToPlainText.FormattingVisitor.class.getDeclaredMethod("append", String.class);
        m.setAccessible(true);
        m.invoke(instance, "world!");

        assertEquals("Hello world!", accumField.get(instance).toString());
        assertEquals(12, widthField.get(instance)); // width should be updated
    }

    @Test
    void testAppendWithLongText() throws Exception {
        HtmlToPlainText.FormattingVisitor instance = new HtmlToPlainText.FormattingVisitor();
        Field widthField = HtmlToPlainText.FormattingVisitor.class.getDeclaredField("width");
        Field accumField = HtmlToPlainText.FormattingVisitor.class.getDeclaredField("accum");
        Field maxWidthField = HtmlToPlainText.FormattingVisitor.class.getDeclaredField("maxWidth");

        widthField.setAccessible(true);
        accumField.setAccessible(true);
        maxWidthField.setAccessible(true);

        maxWidthField.set(instance, 10);
        accumField.set(instance, new StringBuilder());
        widthField.set(instance, 0);

        Method m = HtmlToPlainText.FormattingVisitor.class.getDeclaredMethod("append", String.class);
        m.setAccessible(true);
        m.invoke(instance, "This is a long text that should wrap.");

        assertEquals("This \nis \na \nlong \ntext \nthat \nshould \nwrap. \n", accumField.get(instance).toString());
        assertEquals(5, widthField.get(instance)); // width should be the length of the last word
    }
}