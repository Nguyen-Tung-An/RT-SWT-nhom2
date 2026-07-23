package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElementTest {

    @Test
    void testHasClass_NullAttributes() {
        Element element = new Element();
        element.attributes = null;
        assertFalse(element.hasClass("test"));
    }

    @Test
    void testHasClass_EmptyClassAttribute() {
        Element element = new Element();
        element.attributes = new Attributes();
        element.attributes.put("class", "");
        assertFalse(element.hasClass("test"));
    }

    @Test
    void testHasClass_ClassAttributeShorterThanClassName() {
        Element element = new Element();
        element.attributes = new Attributes();
        element.attributes.put("class", "short");
        assertFalse(element.hasClass("longerClassName"));
    }

    @Test
    void testHasClass_ExactMatch() {
        Element element = new Element();
        element.attributes = new Attributes();
        element.attributes.put("class", "test");
        assertTrue(element.hasClass("test"));
    }

    @Test
    void testHasClass_CaseInsensitiveMatch() {
        Element element = new Element();
        element.attributes = new Attributes();
        element.attributes.put("class", "Test");
        assertTrue(element.hasClass("test"));
    }

    @Test
    void testHasClass_MultipleClasses_ContainsClass() {
        Element element = new Element();
        element.attributes = new Attributes();
        element.attributes.put("class", "class1 class2 test class3");
        assertTrue(element.hasClass("test"));
    }

    @Test
    void testHasClass_MultipleClasses_DoesNotContainClass() {
        Element element = new Element();
        element.attributes = new Attributes();
        element.attributes.put("class", "class1 class2 class3");
        assertFalse(element.hasClass("test"));
    }

    @Test
    void testHasClass_MultipleClasses_LeadingWhitespace() {
        Element element = new Element();
        element.attributes = new Attributes();
        element.attributes.put("class", "  test class1");
        assertTrue(element.hasClass("test"));
    }

    @Test
    void testHasClass_MultipleClasses_TrailingWhitespace() {
        Element element = new Element();
        element.attributes = new Attributes();
        element.attributes.put("class", "class1  test");
        assertTrue(element.hasClass("test"));
    }

    @Test
    void testHasClass_MultipleClasses_WhitespaceBetween() {
        Element element = new Element();
        element.attributes = new Attributes();
        element.attributes.put("class", "class1 test class2");
        assertTrue(element.hasClass("test"));
    }
}