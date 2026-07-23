package org.apache.commons.collections4.bidimap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractDualBidiMapViewTest {
    private AbstractDualBidiMap.View<String, String> view;

    @BeforeEach
    void setUp() {
        view = new AbstractDualBidiMap.View<>(new AbstractDualBidiMap<>());
        view.put("key1", "value1");
        view.put("key2", "value2");
    }

    @Test
    void testRetainAll_EmptyParent() {
        view.parent.clear();
        assertFalse(view.retainAll(new HashSet<>(Arrays.asList("value1"))));
    }

    @Test
    void testRetainAll_EmptyCollection() {
        assertTrue(view.retainAll(new HashSet<>()));
        assertTrue(view.isEmpty());
    }

    @Test
    void testRetainAll_NoChange() {
        Collection<String> coll = new ArrayList<>(Arrays.asList("value1", "value2"));
        assertFalse(view.retainAll(coll));
        assertEquals(2, view.size());
    }

    @Test
    void testRetainAll_SomeRemoved() {
        Collection<String> coll = new ArrayList<>(Arrays.asList("value1"));
        assertTrue(view.retainAll(coll));
        assertEquals(1, view.size());
        assertTrue(view.containsValue("value1"));
        assertFalse(view.containsValue("value2"));
    }

    @Test
    void testRetainAll_AllRemoved() {
        Collection<String> coll = new ArrayList<>(Arrays.asList("value3"));
        assertTrue(view.retainAll(coll));
        assertTrue(view.isEmpty());
    }
}