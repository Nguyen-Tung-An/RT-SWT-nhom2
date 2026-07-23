package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SafelistTest {

    @Test
    void testRemoveAttributes_ValidTagAndAttributes() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("p", "class", "id");
        safelist.removeAttributes("p", "class");
        assertFalse(safelist.attributes.get(TagName.valueOf("p")).contains(AttributeKey.valueOf("class")));
    }

    @Test
    void testRemoveAttributes_EmptyAttributes() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("p", "class", "id");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            safelist.removeAttributes("p");
        });
        assertEquals("No attribute names supplied.", exception.getMessage());
    }

    @Test
    void testRemoveAttributes_NullAttributes() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("p", "class", "id");
        Exception exception = assertThrows(NullPointerException.class, () -> {
            safelist.removeAttributes("p", (String[]) null);
        });
        assertNotNull(exception);
    }

    @Test
    void testRemoveAttributes_NonExistentTag() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("p", "class");
        safelist.removeAttributes("div", "class");
        assertTrue(safelist.attributes.get(TagName.valueOf("p")).contains(AttributeKey.valueOf("class")));
    }

    @Test
    void testRemoveAttributes_AllTags() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("p", "class");
        safelist.addAttributes("div", "class");
        safelist.removeAttributes(Safelist.All, "class");
        assertFalse(safelist.attributes.get(TagName.valueOf("p")).contains(AttributeKey.valueOf("class")));
        assertFalse(safelist.attributes.get(TagName.valueOf("div")).contains(AttributeKey.valueOf("class")));
    }

    @Test
    void testRemoveAttributes_EmptySetAfterRemoval() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("p", "class");
        safelist.removeAttributes("p", "class");
        assertFalse(safelist.attributes.containsKey(TagName.valueOf("p")));
    }
}