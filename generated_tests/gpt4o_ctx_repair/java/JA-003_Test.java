package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
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
        List<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertFalse(CollectionUtils.filter(collection, null));
        assertEquals(3, collection.size());
    }

    @Test
    void testFilter_EmptyCollection() {
        List<Integer> collection = new ArrayList<>();
        assertFalse(CollectionUtils.filter(collection, x -> x < 0));
        assertTrue(collection.isEmpty());
    }

    @Test
    void testFilter_NoElementsRemoved() {
        List<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertFalse(CollectionUtils.filter(collection, x -> x > 0));
        assertEquals(3, collection.size());
    }

    @Test
    void testFilter_SomeElementsRemoved() {
        List<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertTrue(CollectionUtils.filter(collection, x -> x % 2 == 0));
        assertEquals(2, collection.size());
        assertTrue(collection.contains(2));
        assertTrue(collection.contains(4));
    }

    @Test
    void testFilter_AllElementsRemoved() {
        List<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertTrue(CollectionUtils.filter(collection, x -> x > 3));
        assertTrue(collection.isEmpty());
    }
}