package org.jfree.chart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChartHintsKeyTest {
    @Test
    void testIsCompatibleValue_NullForKey0() {
        ChartHints.Key key = new ChartHints.Key(0);
        assertTrue(key.isCompatibleValue(null));
    }

    @Test
    void testIsCompatibleValue_StringForKey0() {
        ChartHints.Key key = new ChartHints.Key(0);
        assertTrue(key.isCompatibleValue("test"));
    }

    @Test
    void testIsCompatibleValue_MapForKey0() {
        ChartHints.Key key = new ChartHints.Key(0);
        assertTrue(key.isCompatibleValue(new java.util.HashMap<>()));
    }

    @Test
    void testIsCompatibleValue_NonCompatibleForKey0() {
        ChartHints.Key key = new ChartHints.Key(0);
        assertFalse(key.isCompatibleValue(123));
    }

    @Test
    void testIsCompatibleValue_NullForKey1() {
        ChartHints.Key key = new ChartHints.Key(1);
        assertTrue(key.isCompatibleValue(null));
    }

    @Test
    void testIsCompatibleValue_ObjectForKey1() {
        ChartHints.Key key = new ChartHints.Key(1);
        assertTrue(key.isCompatibleValue(new Object()));
    }

    @Test
    void testIsCompatibleValue_NonCompatibleForKey1() {
        ChartHints.Key key = new ChartHints.Key(1);
        assertFalse(key.isCompatibleValue("test"));
    }

    @Test
    void testIsCompatibleValue_InvalidKey() {
        ChartHints.Key key = new ChartHints.Key(2);
        assertThrows(RuntimeException.class, () -> key.isCompatibleValue(new Object()));
    }
}