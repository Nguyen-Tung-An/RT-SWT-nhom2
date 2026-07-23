package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SafelistTest {

    @Test
    void testRemoveAttributes_ValidTagAndAttributes() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("div", "class", "id");
        safelist.removeAttributes("div", "class");
        // Verify that "class" attribute is removed
        assertFalse(safelist.attributes.get(TagName.valueOf("div")).contains(AttributeKey.valueOf("class")));
    }

    @Test
    void testRemoveAttributes_EmptyTag() {
        Safelist safelist = new Safelist();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            safelist.removeAttributes("", "class");
        });
        assertEquals("Tag name must not be empty", exception.getMessage());
    }

    @Test
    void testRemoveAttributes_NullAttributes() {
        Safelist safelist = new Safelist();
        Exception exception = assertThrows(NullPointerException.class, () -> {
            safelist.removeAttributes("div", (String[]) null);
        });
        assertEquals("Attributes must not be null", exception.getMessage());
    }

    @Test
    void testRemoveAttributes_NoAttributesSupplied() {
        Safelist safelist = new Safelist();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            safelist.removeAttributes("div");
        });
        assertEquals("No attribute names supplied.", exception.getMessage());
    }

    @Test
    void testRemoveAttributes_ValidTag_All() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("div", "class", "id");
        safelist.removeAttributes("All", "class");
        // Verify that "class" attribute is removed from all tags
        assertFalse(safelist.attributes.get(TagName.valueOf("div")).contains(AttributeKey.valueOf("class")));
    }

    @Test
    void testRemoveAttributes_TagNotInSafelist() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("div", "class");
        safelist.removeAttributes("span", "class");
        // Verify that "class" attribute is still present for "div"
        assertTrue(safelist.attributes.get(TagName.valueOf("div")).contains(AttributeKey.valueOf("class")));
    }

    @Test
    void testRemoveAttributes_EmptySetAfterRemoval() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("div", "class");
        safelist.removeAttributes("div", "class");
        // Verify that "div" is removed from attributes
        assertFalse(safelist.attributes.containsKey(TagName.valueOf("div")));
    }
}