package org.apache.commons.collections4.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractLinkedMapTest {
    private AbstractLinkedMap<String, String> instance;

    @BeforeEach
    void setUp() {
        instance = new AbstractLinkedMap<String, String>() {
            // Implementing abstract methods for testing
            @Override
            protected LinkEntry<String, String> createEntry(String key, String value) {
                return new LinkEntry<>(key, value);
            }
        };
        instance.put("key1", "value1");
        instance.put("key2", null);
        instance.put("key3", "value3");
    }

    @Test
    void testContainsValue_NullValuePresent() {
        assertTrue(instance.containsValue(null));
    }

    @Test
    void testContainsValue_NullValueNotPresent() {
        assertFalse(instance.containsValue("value4"));
    }

    @Test
    void testContainsValue_ExistingValue() {
        assertTrue(instance.containsValue("value1"));
    }

    @Test
    void testContainsValue_NonExistingValue() {
        assertFalse(instance.containsValue("value2"));
    }

    @Test
    void testContainsValue_NullInput() {
        assertTrue(instance.containsValue(null));
    }

    @Test
    void testContainsValue_EmptyMap() {
        AbstractLinkedMap<String, String> emptyMap = new AbstractLinkedMap<String, String>() {
            @Override
            protected LinkEntry<String, String> createEntry(String key, String value) {
                return new LinkEntry<>(key, value);
            }
        };
        assertFalse(emptyMap.containsValue("value1"));
        assertFalse(emptyMap.containsValue(null));
    }
}