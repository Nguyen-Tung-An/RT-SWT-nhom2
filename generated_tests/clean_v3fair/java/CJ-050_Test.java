package org.apache.commons.collections4.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractHashedMapTest {
    private AbstractHashedMap<String, String> map;

    @BeforeEach
    void setUp() {
        map = new AbstractHashedMap<>();
        map.put("key1", "value1");
        map.put("key2", null);
    }

    @Test
    void testContainsValue_NullValueInMap() {
        assertTrue(map.containsValue(null));
    }

    @Test
    void testContainsValue_ExistingValue() {
        assertTrue(map.containsValue("value1"));
    }

    @Test
    void testContainsValue_NonExistingValue() {
        assertFalse(map.containsValue("value2"));
    }

    @Test
    void testContainsValue_NullInput() {
        assertTrue(map.containsValue(null));
    }

    @Test
    void testContainsValue_NonNullValueInMap() {
        assertTrue(map.containsValue("value1"));
    }

    @Test
    void testContainsValue_EmptyMap() {
        AbstractHashedMap<String, String> emptyMap = new AbstractHashedMap<>();
        assertFalse(emptyMap.containsValue("value1"));
        assertFalse(emptyMap.containsValue(null));
    }
}