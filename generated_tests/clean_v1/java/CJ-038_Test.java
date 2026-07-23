package org.jsoup.helper;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class W3CDomTest {
    private W3CDom w3cDom;
    private Document doc;
    private Element contextElement;

    @BeforeEach
    void setUp() {
        w3cDom = new W3CDom();
        doc = mock(Document.class);
        contextElement = mock(Element.class);
        w3cDom.doc = doc;
        w3cDom.contextElement = contextElement;
    }

    @Test
    void testHead_WithElement() {
        Element sourceEl = mock(Element.class);
        when(sourceEl.tagName()).thenReturn("div");
        when(sourceEl.getAttributes()).thenReturn(mock(Attributes.class));
        w3cDom.head(sourceEl, 0);
        verify(doc).createElementNS(null, "div");
    }

    @Test
    void testHead_WithTextNode() {
        TextNode sourceText = new TextNode("Sample text", "");
        w3cDom.head(sourceText, 0);
        verify(doc).createTextNode("Sample text");
    }

    @Test
    void testHead_WithComment() {
        Comment sourceComment = new Comment("This is a comment");
        w3cDom.head(sourceComment, 0);
        verify(doc).createComment("This is a comment");
    }

    @Test
    void testHead_WithDataNode() {
        DataNode sourceData = new DataNode("Sample data");
        w3cDom.head(sourceData, 0);
        verify(doc).createTextNode("Sample data");
    }

    @Test
    void testHead_WithUnhandledNode() {
        Node unhandledNode = mock(Node.class);
        w3cDom.head(unhandledNode, 0);
        // No specific verification as unhandled nodes do not invoke any method on doc
    }
}