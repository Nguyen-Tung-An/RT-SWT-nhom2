package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElementTest {

    @Test
    void testHasClassWithNullAttributes() {
        Element element = new Element("div");
        assertFalse(element.hasClass("test"));
    }

    @Test
    void testHasClassWithEmptyClassAttribute() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        assertFalse(element.hasClass("test"));
    }

    @Test
    void testHasClassWithClassAttributeNotMatching() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        element.attributes.put("class", "example");
        assertFalse(element.hasClass("test"));
    }

    @Test
    void testHasClassWithClassAttributeMatchingExactly() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        element.attributes.put("class", "test");
        assertTrue(element.hasClass("test"));
    }

    @Test
    void testHasClassWithClassAttributeContainingWhitespace() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        element.attributes.put("class", "test example");
        assertTrue(element.hasClass("test"));
    }

    @Test
    void testHasClassWithClassAttributeContainingMultipleClasses() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        element.attributes.put("class", "example test sample");
        assertTrue(element.hasClass("test"));
    }

    @Test
    void testHasClassWithClassAttributeContainingDifferentCasing() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        element.attributes.put("class", "Test");
        assertTrue(element.hasClass("test"));
    }

    @Test
    void testHasClassWithClassAttributeShorterThanClassName() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        element.attributes.put("class", "te");
        assertFalse(element.hasClass("test"));
    }

    @Test
    void testHasClassWithClassAttributeMatchingRegion() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        element.attributes.put("class", "test123");
        assertFalse(element.hasClass("test"));
    }
}