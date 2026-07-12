package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SetOperationCardinalityHelperTest {

    @Test
    void testSize_NullObject() {
        assertEquals(0, SetOperationCardinalityHelper.size(null));
    }

    @Test
    void testSize_Map() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals(2, SetOperationCardinalityHelper.size(map));
    }

    @Test
    void testSize_Collection() {
        Collection<String> collection = Arrays.asList("element1", "element2", "element3");
        assertEquals(3, SetOperationCardinalityHelper.size(collection));
    }

    @Test
    void testSize_Iterable() {
        Iterable<String> iterable = Arrays.asList("item1", "item2");
        assertEquals(2, SetOperationCardinalityHelper.size(iterable));
    }

    @Test
    void testSize_Array() {
        Object[] array = new Object[]{"a", "b", "c", "d"};
        assertEquals(4, SetOperationCardinalityHelper.size(array));
    }

    @Test
    void testSize_Iterator() {
        Iterator<String> iterator = Arrays.asList("one", "two", "three").iterator();
        assertEquals(3, SetOperationCardinalityHelper.size(iterator));
    }

    @Test
    void testSize_Enumeration() {
        Enumeration<String> enumeration = Collections.enumeration(Arrays.asList("first", "second"));
        assertEquals(2, SetOperationCardinalityHelper.size(enumeration));
    }

    @Test
    void testSize_UnsupportedObjectType() {
        assertThrows(IllegalArgumentException.class, () -> {
            SetOperationCardinalityHelper.size(new Object());
        });
    }

    @Test
    void testSize_ArrayWithIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> {
            SetOperationCardinalityHelper.size(new int[]{1, 2, 3});
        });
    }
}