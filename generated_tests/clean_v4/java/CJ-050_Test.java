import org.apache.commons.collections4.map.AbstractHashedMap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AbstractHashedMapTest {

    private static class TestHashedMap extends AbstractHashedMap<String, String> {
        TestHashedMap() {
            super();
        }

        void put(String key, String value) {
            // Custom method to add entries for testing
            // This is a simplified version for the sake of the test
            int index = key.hashCode() % data.length;
            data[index] = new HashEntry<>(key, value, data[index]);
        }
    }

    @Test
    void testContainsValue_NullValue_ContainsNull() {
        TestHashedMap map = new TestHashedMap();
        map.put("key1", null);
        assertTrue(map.containsValue(null));
    }

    @Test
    void testContainsValue_NullValue_DoesNotContainNull() {
        TestHashedMap map = new TestHashedMap();
        map.put("key1", "value1");
        assertFalse(map.containsValue(null));
    }

    @Test
    void testContainsValue_EqualValue_ContainsValue() {
        TestHashedMap map = new TestHashedMap();
        map.put("key1", "value1");
        assertTrue(map.containsValue("value1"));
    }

    @Test
    void testContainsValue_EqualValue_DoesNotContainValue() {
        TestHashedMap map = new TestHashedMap();
        map.put("key1", "value1");
        assertFalse(map.containsValue("value2"));
    }

    @Test
    void testContainsValue_NonEqualValue_ContainsNull() {
        TestHashedMap map = new TestHashedMap();
        map.put("key1", "value1");
        map.put("key2", null);
        assertTrue(map.containsValue(null));
    }

    @Test
    void testContainsValue_NonEqualValue_DoesNotContainNull() {
        TestHashedMap map = new TestHashedMap();
        map.put("key1", "value1");
        assertFalse(map.containsValue(null));
    }
}