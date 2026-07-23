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
        child.parentNode = parent; // Simulate parent-child relationship
        assertEquals("#parentId > span", child.cssSelector());
    }

    @Test
    void testCssSelector_WithoutUniqueId_NoUniqueAncestor() {
        Element grandparent = new Element("div");
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.parentNode = grandparent; // Simulate parent-child relationship
        child.parentNode = parent; // Simulate parent-child relationship
        assertEquals("div > div > span", child.cssSelector());
    }

    @Test
    void testCssSelector_EmptyElement() {
        Element element = new Element("div");
        assertEquals("div", element.cssSelector());
    }

    @Test
    void testCssSelector_NullParent() {
        Element element = new Element("span");
        element.parentNode = null; // No parent
        assertEquals("span", element.cssSelector());
    }
}