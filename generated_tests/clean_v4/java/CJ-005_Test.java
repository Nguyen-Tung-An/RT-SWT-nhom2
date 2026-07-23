import org.apache.commons.collections4.map.AbstractLinkedMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AbstractLinkedMapTest {

    private AbstractLinkedMap<String, String> instance;

    @BeforeEach
    void setUp() {
        instance = new AbstractLinkedMap<String, String>() {};
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
    void testContainsValue_ExactMatchPresent() {
        assertTrue(instance.containsValue("value1"));
    }

    @Test
    void testContainsValue_ExactMatchNotPresent() {
        assertFalse(instance.containsValue("value2"));
    }

    @Test
    void testContainsValue_NullValueInMap() {
        instance.put("key4", null);
        assertTrue(instance.containsValue(null));
    }

    @Test
    void testContainsValue_EmptyMap() {
        AbstractLinkedMap<String, String> emptyInstance = new AbstractLinkedMap<String, String>() {};
        assertFalse(emptyInstance.containsValue("value1"));
        assertFalse(emptyInstance.containsValue(null));
    }
}