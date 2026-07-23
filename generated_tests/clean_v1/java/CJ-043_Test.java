package org.apache.commons.collections4.bidimap;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractDualBidiMapTest {

    private class TestBidiMap extends AbstractDualBidiMap<String, String> {
        // Implement necessary methods for testing
        @Override
        public Iterator<String> iterator() {
            return new Iterator<String>() {
                private int index = 0;
                private final String[] elements = {"one", "two", "three"};

                @Override
                public boolean hasNext() {
                    return index < elements.length;
                }

                @Override
                public String next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    return elements[index++];
                }

                @Override
                public void remove() {
                    if (index == 0) {
                        throw new IllegalStateException();
                    }
                    index--;
                }
            };
        }
    }

    @Test
    void testRemoveIf_NonEmptyMap_FilterMatches() {
        TestBidiMap bidiMap = new TestBidiMap();
        boolean result = bidiMap.removeIf(e -> e.equals("two"));
        assertTrue(result);
    }

    @Test
    void testRemoveIf_NonEmptyMap_FilterDoesNotMatch() {
        TestBidiMap bidiMap = new TestBidiMap();
        boolean result = bidiMap.removeIf(e -> e.equals("four"));
        assertFalse(result);
    }

    @Test
    void testRemoveIf_EmptyMap() {
        TestBidiMap bidiMap = new TestBidiMap() {
            @Override
            public boolean isEmpty() {
                return true;
            }
        };
        boolean result = bidiMap.removeIf(e -> e.equals("two"));
        assertFalse(result);
    }

    @Test
    void testRemoveIf_NullFilter() {
        TestBidiMap bidiMap = new TestBidiMap();
        boolean result = bidiMap.removeIf(null);
        assertFalse(result);
    }
}