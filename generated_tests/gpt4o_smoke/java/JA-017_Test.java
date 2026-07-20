package org.jfree.chart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChartHintsKeyTest {

    private ChartHints.Key key0;
    private ChartHints.Key key1;

    @BeforeEach
    public void setUp() {
        key0 = new ChartHints.Key(0);
        key1 = new ChartHints.Key(1);
    }

    @Test
    public void testIsCompatibleValue_case0_null() {
        assertTrue(key0.isCompatibleValue(null));
    }

    @Test
    public void testIsCompatibleValue_case0_string() {
        assertTrue(key0.isCompatibleValue("test"));
    }

    @Test
    public void testIsCompatibleValue_case0_map() {
        assertTrue(key0.isCompatibleValue(new java.util.HashMap<>()));
    }

    @Test
    public void testIsCompatibleValue_case0_integer() {
        assertFalse(key0.isCompatibleValue(123));
    }

    @Test
    public void testIsCompatibleValue_case1_null() {
        assertTrue(key1.isCompatibleValue(null));
    }

    @Test
    public void testIsCompatibleValue_case1_object() {
        assertTrue(key1.isCompatibleValue(new Object()));
    }

    @Test
    public void testIsCompatibleValue_case1_string() {
        assertFalse(key1.isCompatibleValue("test"));
    }

    @Test
    public void testIsCompatibleValue_case1_integer() {
        assertFalse(key1.isCompatibleValue(123));
    }

    @Test
    public void testIsCompatibleValue_invalidKey() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            ChartHints.Key invalidKey = new ChartHints.Key(2);
            invalidKey.isCompatibleValue(null);
        });
        assertEquals("Not possible!", exception.getMessage());
    }
}