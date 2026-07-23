package org.jsoup.examples;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormattingVisitorTest {

    private final HtmlToPlainText.FormattingVisitor visitor = new HtmlToPlainText.FormattingVisitor();

    @Test
    void testHeadWithTextNode() {
        Node textNode = new TextNode("Sample text", "");
        visitor.head(textNode, 0);
        assertEquals("Sample text", visitor.getOutput());
    }

    @Test
    void testHeadWithLiNode() {
        Node liNode = new Element("li");
        visitor.head(liNode, 0);
        assertEquals("\n * ", visitor.getOutput());
    }

    @Test
    void testHeadWithDtNode() {
        Node dtNode = new Element("dt");
        visitor.head(dtNode, 0);
        assertEquals("  ", visitor.getOutput());
    }

    @Test
    void testHeadWithPNode() {
        Node pNode = new Element("p");
        visitor.head(pNode, 0);
        assertEquals("\n", visitor.getOutput());
    }

    @Test
    void testHeadWithH1Node() {
        Node h1Node = new Element("h1");
        visitor.head(h1Node, 0);
        assertEquals("\n", visitor.getOutput());
    }

    @Test
    void testHeadWithUnknownNode() {
        Node unknownNode = new Element("div");
        visitor.head(unknownNode, 0);
        assertEquals("", visitor.getOutput());
    }
}