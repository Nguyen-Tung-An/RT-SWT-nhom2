import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionUtilsTest {

    @Test
    void testSizeWithNull() {
        assertEquals(0, CollectionUtils.size(null));
    }

    @Test
    void testSizeWithEmptyCollection() {
        assertEquals(0, CollectionUtils.size(new ArrayList<>()));
    }

    @Test
    void testSizeWithNonEmptyCollection() {
        Collection<String> collection = new ArrayList<>(Arrays.asList("a", "b", "c"));
        assertEquals(3, CollectionUtils.size(collection));
    }

    @Test
    void testSizeWithEmptyMap() {
        assertEquals(0, CollectionUtils.size(new HashMap<>()));
    }

    @Test
    void testSizeWithNonEmptyMap() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals(2, CollectionUtils.size(map));
    }

    @Test
    void testSizeWithArray() {
        Object[] array = new Object[5];
        assertEquals(5, CollectionUtils.size(array));
    }

    @Test
    void testSizeWithEmptyArray() {
        Object[] array = new Object[0];
        assertEquals(0, CollectionUtils.size(array));
    }

    @Test
    void testSizeWithIterable() {
        Iterable<String> iterable = Arrays.asList("x", "y", "z");
        assertEquals(3, CollectionUtils.size(iterable));
    }

    @Test
    void testSizeWithIterator() {
        Iterator<String> iterator = Arrays.asList("1", "2", "3").iterator();
        assertEquals(3, CollectionUtils.size(iterator));
    }

    @Test
    void testSizeWithEnumeration() {
        Enumeration<String> enumeration = Collections.enumeration(Arrays.asList("a", "b", "c"));
        assertEquals(3, CollectionUtils.size(enumeration));
    }

    @Test
    void testSizeWithUnsupportedObject() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CollectionUtils.size(new Object());
        });
        assertTrue(exception.getMessage().contains("Unsupported object type: java.lang.Object"));
    }
}