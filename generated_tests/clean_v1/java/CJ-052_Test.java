package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElementTest {

    @Test
    void testCssSelector_WithUniqueId() {
        Element element = new Element("div");
        element.attr("id", "uniqueId");
        assertEquals("#uniqueId", element.cssSelector());
    }

    @Test
    void testCssSelector_WithoutUniqueId_ParentHasUniqueId() {
        Element parent = new Element("div");
        parent.attr("id", "parentId");
        Element child = new Element("span");
        child.parentNode = parent; // Set parent
        assertEquals("#parentId > span", child.cssSelector());
    }

    @Test
    void testCssSelector_WithoutUniqueId_ParentChain() {
        Element grandparent = new Element("div");
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.parentNode = grandparent; // Set parent
        child.parentNode = parent; // Set parent
        assertEquals("div > div > span", child.cssSelector());
    }

    @Test
    void testCssSelector_NoParent() {
        Element element = new Element("span");
        assertEquals("span", element.cssSelector());
    }

    @Test
    void testCssSelector_EmptySelector() {
        Element element = new Element("div");
        element.attr("id", ""); // Empty ID
        assertEquals("div", element.cssSelector());
    }
}