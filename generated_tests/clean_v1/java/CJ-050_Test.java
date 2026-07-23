package org.apache.commons.collections4.map;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AbstractHashedMapTest {

    private class TestHashedMap extends AbstractHashedMap<String, String> {
        // Implement necessary methods for testing
    }

    @Test
    void testContainsValue_NullValueInMap() {
        TestHashedMap map = new TestHashedMap();
        map.put("key1", null);
        assertTrue(map.containsValue(null));
    }

    @Test
    void testContainsValue_NullValueNotInMap() {
        TestHashedMap map = new TestHashedMap();
        map.put("key1", "value1");
        assertFalse(map.containsValue(null));
    }

    @Test
    void testContainsValue_EqualValueInMap() {
        TestHashedMap map = new TestHashedMap();
        map.put("key1", "value1");
        assertTrue(map.containsValue("value1"));
    }

    @Test
    void testContainsValue_EqualValueNotInMap() {
        TestHashedMap map = new TestHashedMap();
        map.put("key1", "value1");
        assertFalse(map.containsValue("value2"));
    }

    @Test
    void testContainsValue_NonExistentValue() {
        TestHashedMap map = new TestHashedMap();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertFalse(map.containsValue("value3"));
    }

    @Test
    void testContainsValue_MultipleEntriesWithNullValue() {
        TestHashedMap map = new TestHashedMap();
        map.put("key1", "value1");
        map.put("key2", null);
        assertTrue(map.containsValue(null));
    }

    @Test
    void testContainsValue_MultipleEntriesWithEqualValue() {
        TestHashedMap map = new TestHashedMap();
        map.put("key1", "value1");
        map.put("key2", "value1");
        assertTrue(map.containsValue("value1"));
    }
}