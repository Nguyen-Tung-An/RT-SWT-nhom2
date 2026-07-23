package org.apache.commons.collections4.bidimap;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ViewTest {

    private class TestBidiMap extends AbstractDualBidiMap<Integer, String> {
        public TestBidiMap() {
            super();
        }

        public void addEntry(Integer key, String value) {
            put(key, value);
        }

        @Override
        public Iterator<E> iterator() {
            return super.keySet().iterator();
        }
    }

    @Test
    void testRetainAll_EmptyParent() {
        TestBidiMap bidiMap = new TestBidiMap();
        assertFalse(bidiMap.retainAll(new HashSet<>(Arrays.asList(1, 2, 3))));
    }

    @Test
    void testRetainAll_EmptyCollection() {
        TestBidiMap bidiMap = new TestBidiMap();
        bidiMap.addEntry(1, "One");
        bidiMap.addEntry(2, "Two");
        assertTrue(bidiMap.retainAll(new HashSet<>()));
        assertTrue(bidiMap.isEmpty());
    }

    @Test
    void testRetainAll_NoModification() {
        TestBidiMap bidiMap = new TestBidiMap();
        bidiMap.addEntry(1, "One");
        bidiMap.addEntry(2, "Two");
        Collection<Integer> coll = new HashSet<>(Arrays.asList(1, 2));
        assertFalse(bidiMap.retainAll(coll));
        assertEquals(2, bidiMap.size());
    }

    @Test
    void testRetainAll_Modification() {
        TestBidiMap bidiMap = new TestBidiMap();
        bidiMap.addEntry(1, "One");
        bidiMap.addEntry(2, "Two");
        bidiMap.addEntry(3, "Three");
        Collection<Integer> coll = new HashSet<>(Arrays.asList(1, 3));
        assertTrue(bidiMap.retainAll(coll));
        assertEquals(2, bidiMap.size());
        assertTrue(bidiMap.containsKey(1));
        assertTrue(bidiMap.containsKey(3));
        assertFalse(bidiMap.containsKey(2));
    }
}