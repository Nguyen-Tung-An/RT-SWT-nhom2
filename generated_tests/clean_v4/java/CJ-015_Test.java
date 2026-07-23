package org.jsoup.safety;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SafelistTest {
    private Safelist safelist;

    @BeforeEach
    void setUp() {
        safelist = new Safelist();
        safelist.addAttributes("div", "class", "id");
        safelist.addAttributes("span", "style");
    }

    @Test
    void testRemoveAttributes_ValidTagAndAttributes() {
        safelist.removeAttributes("div", "class");
        Set<AttributeKey> expected = new HashSet<>();
        expected.add(AttributeKey.valueOf("id"));
        assertEquals(expected, safelist.attributes.get(TagName.valueOf("div")));
    }

    @Test
    void testRemoveAttributes_EmptyAttributes() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            safelist.removeAttributes("div");
        });
        assertEquals("No attribute names supplied.", exception.getMessage());
    }

    @Test
    void testRemoveAttributes_NullAttributes() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            safelist.removeAttributes("div", (String[]) null);
        });
        assertNotNull(exception);
    }

    @Test
    void testRemoveAttributes_EmptyTag() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            safelist.removeAttributes("", "class");
        });
        assertNotNull(exception);
    }

    @Test
    void testRemoveAttributes_TagNotInSafelist() {
        safelist.removeAttributes("p", "class");
        assertTrue(safelist.attributes.isEmpty());
    }

    @Test
    void testRemoveAttributes_AllTag() {
        safelist.removeAttributes("div", "class");
        safelist.removeAttributes("span", "style");
        safelist.removeAttributes("All", "class", "style");
        assertTrue(safelist.attributes.isEmpty());
    }

    @Test
    void testRemoveAttributes_TagWithNoAttributesLeft() {
        safelist.removeAttributes("div", "class");
        safelist.removeAttributes("div", "id");
        assertFalse(safelist.attributes.containsKey(TagName.valueOf("div")));
    }
}