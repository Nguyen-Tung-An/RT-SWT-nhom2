package org.jsoup.helper;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class W3CDomW3CBuilderTest {
    private W3CDom.W3CBuilder builder;
    private Document doc;

    @BeforeEach
    void setUp() {
        doc = Document.createShell("");
        builder = new W3CDom.W3CBuilder(doc);
    }

    @Test
    void testHeadWithElement() {
        Element sourceElement = new Element("div");
        sourceElement.attr("class", "test");
        builder.head(sourceElement, 0);
        assertEquals("div", builder.dest.getNodeName());
        assertEquals("test", builder.dest.getAttribute("class"));
    }

    @Test
    void testHeadWithTextNode() {
        TextNode sourceText = new TextNode("Sample text", "");
        builder.head(sourceText, 0);
        assertEquals("#text", builder.dest.getNodeName());
        assertEquals("Sample text", builder.dest.getNodeValue());
    }

    @Test
    void testHeadWithComment() {
        Comment sourceComment = new Comment("This is a comment");
        builder.head(sourceComment, 0);
        assertEquals("#comment", builder.dest.getNodeName());
        assertEquals("This is a comment", builder.dest.getNodeValue());
    }

    @Test
    void testHeadWithDataNode() {
        DataNode sourceData = new DataNode("Sample data");
        builder.head(sourceData, 0);
        assertEquals("#text", builder.dest.getNodeName());
        assertEquals("Sample data", builder.dest.getNodeValue());
    }

    @Test
    void testHeadWithUnhandledNode() {
        Node unhandledNode = new Node("unhandled") {};
        builder.head(unhandledNode, 0);
        // No assertion as unhandled nodes do not modify the document
        assertEquals(null, builder.dest);
    }

    @Test
    void testHeadWithElementAndDepth() {
        Element sourceElement = new Element("span");
        builder.head(sourceElement, 1);
        assertEquals("span", builder.dest.getNodeName());
    }
}