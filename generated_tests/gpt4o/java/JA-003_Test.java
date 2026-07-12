package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

public class SetOperationCardinalityHelperTest {

    @Test
    void testFilter_NullCollection() {
        Predicate<Integer> predicate = x -> x > 0;
        assertFalse(SetOperationCardinalityHelper.filter(null, predicate));
    }

    @Test
    void testFilter_NullPredicate() {
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        assertFalse(SetOperationCardinalityHelper.filter(collection, null));
    }

    @Test
    void testFilter_EmptyCollection() {
        List<Integer> collection = new ArrayList<>();
        Predicate<Integer> predicate = x -> x > 0;
        assertFalse(SetOperationCardinalityHelper.filter(collection, predicate));
    }

    @Test
    void testFilter_NoElementsRemoved() {
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        Predicate<Integer> predicate = x -> x > 0;
        assertFalse(SetOperationCardinalityHelper.filter(collection, predicate));
        assertEquals(2, collection.size());
    }

    @Test
    void testFilter_ElementsRemoved() {
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(-1);
        Predicate<Integer> predicate = x -> x > 0;
        assertTrue(SetOperationCardinalityHelper.filter(collection, predicate));
        assertEquals(1, collection.size());
        assertEquals(1, collection.get(0));
    }

    @Test
    void testFilter_AllElementsRemoved() {
        List<Integer> collection = new ArrayList<>();
        collection.add(-1);
        collection.add(-2);
        Predicate<Integer> predicate = x -> x > 0;
        assertTrue(SetOperationCardinalityHelper.filter(collection, predicate));
        assertTrue(collection.isEmpty());
    }
}