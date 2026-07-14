package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionUtilsTest {

    @Test
    void testSize_NullObject() {
        assertEquals(0, CollectionUtils.size(null));
    }

    @Test
    void testSize_EmptyMap() {
        Map<Object, Object> emptyMap = new HashMap<>();
        assertEquals(0, CollectionUtils.size(emptyMap));
    }

    @Test
    void testSize_NonEmptyMap() {
        Map<Object, Object> nonEmptyMap = new HashMap<>();
        nonEmptyMap.put("key", "value");
        assertEquals(1, CollectionUtils.size(nonEmptyMap));
    }

    @Test
    void testSize_EmptyCollection() {
        Collection<Object> emptyCollection = new ArrayList<>();
        assertEquals(0, CollectionUtils.size(emptyCollection));
    }

    @Test
    void testSize_NonEmptyCollection() {
        Collection<Object> nonEmptyCollection = new ArrayList<>();
        nonEmptyCollection.add("element");
        assertEquals(1, CollectionUtils.size(nonEmptyCollection));
    }

    @Test
    void testSize_EmptyIterable() {
        Iterable<Object> emptyIterable = Collections.emptyList();
        assertEquals(0, CollectionUtils.size(emptyIterable));
    }

    @Test
    void testSize_NonEmptyIterable() {
        List<Object> nonEmptyIterable = Arrays.asList("element1", "element2");
        assertEquals(2, CollectionUtils.size(nonEmptyIterable));
    }

    @Test
    void testSize_EmptyArray() {
        Object[] emptyArray = new Object[0];
        assertEquals(0, CollectionUtils.size(emptyArray));
    }

    @Test
    void testSize_NonEmptyArray() {
        Object[] nonEmptyArray = new Object[]{"element1", "element2"};
        assertEquals(2, CollectionUtils.size(nonEmptyArray));
    }

    @Test
    void testSize_EmptyIterator() {
        Iterator<Object> emptyIterator = Collections.emptyIterator();
        assertEquals(0, CollectionUtils.size(emptyIterator));
    }

    @Test
    void testSize_NonEmptyIterator() {
        Iterator<Object> nonEmptyIterator = Arrays.asList("element1", "element2").iterator();
        assertEquals(2, CollectionUtils.size(nonEmptyIterator));
    }

    @Test
    void testSize_EmptyEnumeration() {
        Enumeration<Object> emptyEnumeration = Collections.enumeration(Collections.emptyList());
        assertEquals(0, CollectionUtils.size(emptyEnumeration));
    }

    @Test
    void testSize_NonEmptyEnumeration() {
        Vector<Object> vector = new Vector<>();
        vector.add("element1");
        vector.add("element2");
        Enumeration<Object> nonEmptyEnumeration = vector.elements();
        assertEquals(2, CollectionUtils.size(nonEmptyEnumeration));
    }

    @Test
    void testSize_UnsupportedObjectType() {
        assertThrows(IllegalArgumentException.class, () -> {
            CollectionUtils.size(new Object());
        });
    }
}