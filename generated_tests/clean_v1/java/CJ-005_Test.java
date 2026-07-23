package org.apache.commons.collections4.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractLinkedMapTest {
    private AbstractLinkedMap<String, String> map;

    @BeforeEach
    void setUp() {
        map = new AbstractLinkedMap<>() {
            // Implementing abstract methods for testing
            @Override
            protected LinkEntry<String, String> createEntry(String key, String value) {
                return new LinkEntry<>(key, value);
            }
        };
    }

    @Test
    void testContainsValue_NullValueInMap() {
        map.put("key1", null);
        assertTrue(map.containsValue(null));
    }

    @Test
    void testContainsValue_NullValueNotInMap() {
        map.put("key1", "value1");
        assertFalse(map.containsValue(null));
    }

    @Test
    void testContainsValue_EqualValueInMap() {
        map.put("key1", "value1");
        assertTrue(map.containsValue("value1"));
    }

    @Test
    void testContainsValue_EqualValueNotInMap() {
        map.put("key1", "value1");
        assertFalse(map.containsValue("value2"));
    }

    @Test
    void testContainsValue_EmptyMap() {
        assertFalse(map.containsValue("value1"));
    }
}