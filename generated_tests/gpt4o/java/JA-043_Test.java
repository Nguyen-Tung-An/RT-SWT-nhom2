package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SetOperationCardinalityHelperTest {

    @Test
    void testGet_NegativeIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            SetOperationCardinalityHelper.get(new ArrayList<>(), -1);
        });
    }

    @Test
    void testGet_Map() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        assertEquals(2, SetOperationCardinalityHelper.get(map, 1));
    }

    @Test
    void testGet_Array() {
        String[] array = {"a", "b", "c"};
        assertEquals("b", SetOperationCardinalityHelper.get(array, 1));
    }

    @Test
    void testGet_Iterator() {
        List<String> list = Arrays.asList("x", "y", "z");
        Iterator<String> iterator = list.iterator();
        assertEquals("y", SetOperationCardinalityHelper.get(iterator, 1));
    }

    @Test
    void testGet_Iterable() {
        List<String> list = Arrays.asList("alpha", "beta", "gamma");
        assertEquals("beta", SetOperationCardinalityHelper.get(list, 1));
    }

    @Test
    void testGet_Enumeration() {
        Vector<String> vector = new Vector<>();
        vector.add("first");
        vector.add("second");
        assertEquals("second", SetOperationCardinalityHelper.get(vector.elements(), 1));
    }

    @Test
    void testGet_NullObject() {
        assertThrows(IllegalArgumentException.class, () -> {
            SetOperationCardinalityHelper.get(null, 0);
        });
    }

    @Test
    void testGet_UnsupportedType() {
        Object unsupportedObject = new Object();
        assertThrows(IllegalArgumentException.class, () -> {
            SetOperationCardinalityHelper.get(unsupportedObject, 0);
        });
    }

    @Test
    void testGet_ArrayWithIllegalArgument() {
        Object invalidArray = new Object();
        assertThrows(IllegalArgumentException.class, () -> {
            SetOperationCardinalityHelper.get(invalidArray, 0);
        });
    }
}