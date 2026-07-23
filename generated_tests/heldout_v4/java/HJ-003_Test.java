package org.jsoup.parser;

import org.jsoup.nodes.DocumentType;
import org.jsoup.parser.Token;
import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HtmlTreeBuilderStateTest {

    @Test
    void testProcessWhitespaceToken() {
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        Token whitespaceToken = Token.createCharacter("\u0020"); // whitespace
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        
        boolean result = state.process(whitespaceToken, builder);
        
        assertTrue(result);
        assertEquals(0, builder.getDocument().childNodeSize()); // No nodes should be added
    }

    @Test
    void testProcessCommentToken() {
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        Token commentToken = Token.createComment("This is a comment");
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        
        boolean result = state.process(commentToken, builder);
        
        assertTrue(result);
        assertEquals(1, builder.getDocument().childNodeSize()); // One comment node should be added
    }

    @Test
    void testProcessDoctypeToken() {
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        Token.Doctype doctypeToken = Token.createDoctype("html", "", "", false);
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        
        boolean result = state.process(doctypeToken, builder);
        
        assertTrue(result);
        assertEquals(1, builder.getDocument().childNodeSize()); // One doctype node should be added
        DocumentType doctype = (DocumentType) builder.getDocument().childNode(0);
        assertEquals("html", doctype.name());
    }

    @Test
    void testProcessUnknownToken() {
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        Token unknownToken = Token.createCharacter("Some text");
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        
        boolean result = state.process(unknownToken, builder);
        
        assertTrue(result);
        assertEquals(1, builder.getDocument().childNodeSize()); // Should re-process and add a text node
    }

    @Test
    void testProcessDoctypeWithQuirks() {
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        Token.Doctype doctypeToken = Token.createDoctype("html", "", "", true);
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        
        boolean result = state.process(doctypeToken, builder);
        
        assertTrue(result);
        assertEquals(1, builder.getDocument().childNodeSize()); // One doctype node should be added
        DocumentType doctype = (DocumentType) builder.getDocument().childNode(0);
        assertTrue(builder.getDocument().quirksMode() == Document.QuirksMode.quirks);
    }
}