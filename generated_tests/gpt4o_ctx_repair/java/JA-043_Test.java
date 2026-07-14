package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionUtilsTest {

    @Test
    void testGet_NegativeIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> CollectionUtils.get(new ArrayList<>(), -1));
    }

    @Test
    void testGet_Map() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals("value1", CollectionUtils.get(map, 0));
        assertEquals("value2", CollectionUtils.get(map, 1));
    }

    @Test
    void testGet_Array() {
        String[] array = {"element1", "element2", "element3"};
        assertEquals("element1", CollectionUtils.get(array, 0));
        assertEquals("element2", CollectionUtils.get(array, 1));
        assertEquals("element3", CollectionUtils.get(array, 2));
    }

    @Test
    void testGet_Iterator() {
        List<String> list = Arrays.asList("item1", "item2", "item3");
        Iterator<String> iterator = list.iterator();
        assertEquals("item1", CollectionUtils.get(iterator, 0));
        assertEquals("item2", CollectionUtils.get(iterator, 1));
    }

    @Test
    void testGet_Iterable() {
        List<String> iterableList = Arrays.asList("first", "second", "third");
        assertEquals("first", CollectionUtils.get(iterableList, 0));
        assertEquals("second", CollectionUtils.get(iterableList, 1));
    }

    @Test
    void testGet_Enumeration() {
        Vector<String> vector = new Vector<>();
        vector.add("one");
        vector.add("two");
        assertEquals("one", CollectionUtils.get(vector.elements(), 0));
        assertEquals("two", CollectionUtils.get(vector.elements(), 1));
    }

    @Test
    void testGet_NullObject() {
        assertThrows(IllegalArgumentException.class, () -> CollectionUtils.get(null, 0));
    }

    @Test
    void testGet_UnsupportedType() {
        assertThrows(IllegalArgumentException.class, () -> CollectionUtils.get(123, 0));
    }

    @Test
    void testSetOperationCardinalityHelper() {
        CollectionUtils.SetOperationCardinalityHelper helper = new CollectionUtils.SetOperationCardinalityHelper(Arrays.asList("a", "b"), Arrays.asList("b", "c"));
        assertNotNull(helper);
        // Additional tests can be added here to exercise the methods of SetOperationCardinalityHelper
    }
}