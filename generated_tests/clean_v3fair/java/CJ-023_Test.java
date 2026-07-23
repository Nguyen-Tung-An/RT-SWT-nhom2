package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElementTest {

    @Test
    void testHasClass_NullAttributes() {
        Element element = new Element("div");
        element.attributes = null; // Simulating null attributes
        assertFalse(element.hasClass("test"));
    }

    @Test
    void testHasClass_EmptyClassAttribute() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        element.attributes.put("class", ""); // Empty class attribute
        assertFalse(element.hasClass("test"));
    }

    @Test
    void testHasClass_ClassNameLongerThanAttribute() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        element.attributes.put("class", "test"); // Class attribute shorter than className
        assertFalse(element.hasClass("testClass"));
    }

    @Test
    void testHasClass_EqualLengthClassName() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        element.attributes.put("class", "test"); // Class attribute equal to className
        assertTrue(element.hasClass("test"));
    }

    @Test
    void testHasClass_ClassNameMatchesIgnoringCase() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        element.attributes.put("class", "TEST"); // Class attribute matches className ignoring case
        assertTrue(element.hasClass("test"));
    }

    @Test
    void testHasClass_ClassNameInMiddle() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        element.attributes.put("class", "foo test bar"); // Class attribute contains className
        assertTrue(element.hasClass("test"));
    }

    @Test
    void testHasClass_ClassNameAtStart() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        element.attributes.put("class", "test bar"); // Class attribute starts with className
        assertTrue(element.hasClass("test"));
    }

    @Test
    void testHasClass_ClassNameAtEnd() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        element.attributes.put("class", "foo test"); // Class attribute ends with className
        assertTrue(element.hasClass("test"));
    }

    @Test
    void testHasClass_ClassNameNotPresent() {
        Element element = new Element("div");
        element.attributes = new Attributes();
        element.attributes.put("class", "foo bar"); // Class attribute does not contain className
        assertFalse(element.hasClass("test"));
    }
}