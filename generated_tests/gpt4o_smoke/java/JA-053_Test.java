import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionUtilsTest {

    @Test
    public void testSizeWithNull() {
        assertEquals(0, CollectionUtils.size(null));
    }

    @Test
    public void testSizeWithEmptyMap() {
        Map<String, String> emptyMap = new HashMap<>();
        assertEquals(0, CollectionUtils.size(emptyMap));
    }

    @Test
    public void testSizeWithNonEmptyMap() {
        Map<String, String> nonEmptyMap = new HashMap<>();
        nonEmptyMap.put("key", "value");
        assertEquals(1, CollectionUtils.size(nonEmptyMap));
    }

    @Test
    public void testSizeWithEmptyCollection() {
        Collection<String> emptyCollection = new ArrayList<>();
        assertEquals(0, CollectionUtils.size(emptyCollection));
    }

    @Test
    public void testSizeWithNonEmptyCollection() {
        Collection<String> nonEmptyCollection = new ArrayList<>();
        nonEmptyCollection.add("element");
        assertEquals(1, CollectionUtils.size(nonEmptyCollection));
    }

    @Test
    public void testSizeWithEmptyArray() {
        Object[] emptyArray = new Object[0];
        assertEquals(0, CollectionUtils.size(emptyArray));
    }

    @Test
    public void testSizeWithNonEmptyArray() {
        Object[] nonEmptyArray = new Object[]{"element"};
        assertEquals(1, CollectionUtils.size(nonEmptyArray));
    }

    @Test
    public void testSizeWithEmptyIterator() {
        Iterator<String> emptyIterator = Collections.emptyIterator();
        assertEquals(0, CollectionUtils.size(emptyIterator));
    }

    @Test
    public void testSizeWithNonEmptyIterator() {
        List<String> list = Arrays.asList("element1", "element2");
        Iterator<String> nonEmptyIterator = list.iterator();
        assertEquals(2, CollectionUtils.size(nonEmptyIterator));
    }

    @Test
    public void testSizeWithEmptyEnumeration() {
        Enumeration<String> emptyEnumeration = Collections.enumeration(Collections.emptyList());
        assertEquals(0, CollectionUtils.size(emptyEnumeration));
    }

    @Test
    public void testSizeWithNonEmptyEnumeration() {
        Vector<String> vector = new Vector<>();
        vector.add("element1");
        vector.add("element2");
        Enumeration<String> nonEmptyEnumeration = vector.elements();
        assertEquals(2, CollectionUtils.size(nonEmptyEnumeration));
    }

    @Test
    public void testSizeWithUnsupportedObject() {
        Exception exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CollectionUtils.size(new Object());
        });
        assertEquals("Unsupported object type: java.lang.Object", exception.getMessage());
    }
}