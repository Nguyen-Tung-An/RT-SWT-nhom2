import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionUtilsTest {

    @Test
    void testGetFromMap() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals("value1", CollectionUtils.get(map, 0));
        assertEquals("value2", CollectionUtils.get(map, 1));
        assertThrows(IndexOutOfBoundsException.class, () -> CollectionUtils.get(map, 2));
    }

    @Test
    void testGetFromArray() {
        String[] array = {"element0", "element1", "element2"};
        assertEquals("element0", CollectionUtils.get(array, 0));
        assertEquals("element1", CollectionUtils.get(array, 1));
        assertEquals("element2", CollectionUtils.get(array, 2));
        assertThrows(IndexOutOfBoundsException.class, () -> CollectionUtils.get(array, 3));
    }

    @Test
    void testGetFromIterator() {
        List<String> list = Arrays.asList("item1", "item2", "item3");
        Iterator<String> iterator = list.iterator();
        assertEquals("item1", CollectionUtils.get(iterator, 0));
        assertEquals("item2", CollectionUtils.get(iterator, 1));
        assertEquals("item3", CollectionUtils.get(iterator, 2));
        assertThrows(IndexOutOfBoundsException.class, () -> CollectionUtils.get(iterator, 3));
    }

    @Test
    void testGetFromIterable() {
        List<String> iterable = Arrays.asList("first", "second", "third");
        assertEquals("first", CollectionUtils.get(iterable, 0));
        assertEquals("second", CollectionUtils.get(iterable, 1));
        assertEquals("third", CollectionUtils.get(iterable, 2));
        assertThrows(IndexOutOfBoundsException.class, () -> CollectionUtils.get(iterable, 3));
    }

    @Test
    void testGetFromEnumeration() {
        Vector<String> enumeration = new Vector<>();
        enumeration.add("one");
        enumeration.add("two");
        enumeration.add("three");
        assertEquals("one", CollectionUtils.get(enumeration, 0));
        assertEquals("two", CollectionUtils.get(enumeration, 1));
        assertEquals("three", CollectionUtils.get(enumeration, 2));
        assertThrows(IndexOutOfBoundsException.class, () -> CollectionUtils.get(enumeration, 3));
    }

    @Test
    void testGetWithNegativeIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> CollectionUtils.get(new ArrayList<>(), -1));
    }

    @Test
    void testGetWithNullObject() {
        assertThrows(IllegalArgumentException.class, () -> CollectionUtils.get(null, 0));
    }

    @Test
    void testGetWithUnsupportedType() {
        assertThrows(IllegalArgumentException.class, () -> CollectionUtils.get(123, 0));
    }
}