package org.apache.commons.collections4.bidimap;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import static org.junit.jupiter.api.Assertions.*;

public class AbstractDualBidiMapViewTest {

    private static class TestBidiMap extends AbstractDualBidiMap<String, String> {
        public TestBidiMap() {
            super(new HashMap<>(), new HashMap<>());
        }
    }

    @Test
    void testRemoveIf_EmptyMap() {
        TestBidiMap bidiMap = new TestBidiMap();
        boolean result = bidiMap.view().removeIf(e -> e.equals("test"));
        assertFalse(result);
    }

    @Test
    void testRemoveIf_NullPredicate() {
        TestBidiMap bidiMap = new TestBidiMap();
        bidiMap.put("key1", "value1");
        boolean result = bidiMap.view().removeIf(null);
        assertFalse(result);
    }

    @Test
    void testRemoveIf_NoMatch() {
        TestBidiMap bidiMap = new TestBidiMap();
        bidiMap.put("key1", "value1");
        boolean result = bidiMap.view().removeIf(e -> e.equals("nonexistent"));
        assertFalse(result);
    }

    @Test
    void testRemoveIf_SingleMatch() {
        TestBidiMap bidiMap = new TestBidiMap();
        bidiMap.put("key1", "value1");
        boolean result = bidiMap.view().removeIf(e -> e.equals("value1"));
        assertTrue(result);
        assertFalse(bidiMap.containsValue("value1"));
    }

    @Test
    void testRemoveIf_MultipleMatches() {
        TestBidiMap bidiMap = new TestBidiMap();
        bidiMap.put("key1", "value1");
        bidiMap.put("key2", "value1");
        boolean result = bidiMap.view().removeIf(e -> e.equals("value1"));
        assertTrue(result);
        assertFalse(bidiMap.containsValue("value1"));
    }

    @Test
    void testRemoveIf_NoModification() {
        TestBidiMap bidiMap = new TestBidiMap();
        bidiMap.put("key1", "value1");
        boolean result = bidiMap.view().removeIf(e -> e.equals("value2"));
        assertFalse(result);
        assertTrue(bidiMap.containsValue("value1"));
    }
}