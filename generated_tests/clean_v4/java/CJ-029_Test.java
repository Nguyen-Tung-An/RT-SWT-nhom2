package org.apache.commons.collections4.bidimap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AbstractDualBidiMapViewTest {

    private AbstractDualBidiMap<String, Integer> parentMap;
    private AbstractDualBidiMap.View<String, Integer> view;

    @BeforeEach
    void setUp() {
        parentMap = new AbstractDualBidiMap<>();
        List<String> initialKeys = new ArrayList<>();
        initialKeys.add("A");
        initialKeys.add("B");
        initialKeys.add("C");
        view = new AbstractDualBidiMap.View<>(initialKeys, parentMap);
    }

    @Test
    void testRetainAll_EmptyParent() {
        parentMap.clear();
        assertFalse(view.retainAll(new ArrayList<>()));
    }

    @Test
    void testRetainAll_EmptyCollection() {
        view.retainAll(new ArrayList<>());
        assertTrue(parentMap.isEmpty());
    }

    @Test
    void testRetainAll_NoModification() {
        Set<String> collection = new HashSet<>();
        collection.add("A");
        assertFalse(view.retainAll(collection));
        assertEquals(3, parentMap.size());
    }

    @Test
    void testRetainAll_Modification() {
        Set<String> collection = new HashSet<>();
        collection.add("A");
        collection.add("B");
        assertTrue(view.retainAll(collection));
        assertEquals(2, parentMap.size());
        assertTrue(parentMap.containsKey("A"));
        assertTrue(parentMap.containsKey("B"));
        assertFalse(parentMap.containsKey("C"));
    }

    @Test
    void testRetainAll_AllElementsRemoved() {
        Set<String> collection = new HashSet<>();
        collection.add("D");
        assertTrue(view.retainAll(collection));
        assertTrue(parentMap.isEmpty());
    }

    @Test
    void testRetainAll_SingleElementRetained() {
        Set<String> collection = new HashSet<>();
        collection.add("B");
        assertTrue(view.retainAll(collection));
        assertEquals(1, parentMap.size());
        assertTrue(parentMap.containsKey("B"));
        assertFalse(parentMap.containsKey("A"));
        assertFalse(parentMap.containsKey("C"));
    }
}