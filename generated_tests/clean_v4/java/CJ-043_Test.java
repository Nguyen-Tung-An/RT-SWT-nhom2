package org.apache.commons.collections4.bidimap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;
import static org.junit.jupiter.api.Assertions.*;

class AbstractDualBidiMapViewTest {

    private AbstractDualBidiMap<String, Integer> bidiMap;
    private AbstractDualBidiMap.View<String, Integer> view;

    @BeforeEach
    void setUp() {
        bidiMap = new AbstractDualBidiMap<>() {
            @Override
            public boolean isEmpty() {
                return false; // Override to return non-empty for testing
            }

            @Override
            public Iterator<Map.Entry<String, Integer>> iterator() {
                return Arrays.asList(
                        new AbstractMap.SimpleEntry<>("one", 1),
                        new AbstractMap.SimpleEntry<>("two", 2),
                        new AbstractMap.SimpleEntry<>("three", 3)
                ).iterator();
            }
        };
        view = bidiMap.new View(Arrays.asList("one", "two", "three"), bidiMap);
    }

    @Test
    void testRemoveIf_NonEmptyCollection_RemovesMatchingElements() {
        Predicate<String> filter = s -> s.equals("two");
        boolean result = view.removeIf(filter);
        assertTrue(result);
        assertFalse(view.contains("two"));
    }

    @Test
    void testRemoveIf_NonEmptyCollection_NoMatchingElements() {
        Predicate<String> filter = s -> s.equals("four");
        boolean result = view.removeIf(filter);
        assertFalse(result);
        assertTrue(view.contains("one"));
        assertTrue(view.contains("two"));
        assertTrue(view.contains("three"));
    }

    @Test
    void testRemoveIf_NullPredicate() {
        boolean result = view.removeIf(null);
        assertFalse(result);
        assertTrue(view.contains("one"));
        assertTrue(view.contains("two"));
        assertTrue(view.contains("three"));
    }

    @Test
    void testRemoveIf_EmptyCollection() {
        bidiMap = new AbstractDualBidiMap<>() {
            @Override
            public boolean isEmpty() {
                return true; // Override to return empty for testing
            }

            @Override
            public Iterator<Map.Entry<String, Integer>> iterator() {
                return Arrays.asList().iterator();
            }
        };
        view = bidiMap.new View(Arrays.asList(), bidiMap);
        Predicate<String> filter = s -> s.equals("two");
        boolean result = view.removeIf(filter);
        assertFalse(result);
    }
}