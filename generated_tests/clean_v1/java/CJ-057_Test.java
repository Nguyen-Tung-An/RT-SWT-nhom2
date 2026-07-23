package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionUtilsTest {

    @Test
    void testFilter_NullCollection() {
        assertFalse(CollectionUtils.filter(null, x -> true));
    }

    @Test
    void testFilter_NullPredicate() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        assertFalse(CollectionUtils.filter(list, null));
    }

    @Test
    void testFilter_EmptyCollection() {
        List<Integer> list = new ArrayList<>();
        assertFalse(CollectionUtils.filter(list, x -> x < 0));
    }

    @Test
    void testFilter_NoElementsRemoved() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        assertFalse(CollectionUtils.filter(list, x -> x > 0));
        assertEquals(2, list.size());
    }

    @Test
    void testFilter_ElementsRemoved() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-2);
        list.add(3);
        assertTrue(CollectionUtils.filter(list, x -> x > 0));
        assertEquals(2, list.size());
        assertTrue(list.contains(1));
        assertTrue(list.contains(3));
        assertFalse(list.contains(-2));
    }

    @Test
    void testFilter_AllElementsRemoved() {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-2);
        assertTrue(CollectionUtils.filter(list, x -> x > 0));
        assertTrue(list.isEmpty());
    }
}