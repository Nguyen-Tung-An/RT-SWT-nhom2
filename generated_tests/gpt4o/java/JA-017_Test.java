package org.jfree.chart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KeyTest {

    private class Key {
        private int key;

        public Key(int key) {
            this.key = key;
        }

        public int intKey() {
            return key;
        }

        public boolean isCompatibleValue(Object val) {
            switch (intKey()) {
                case 0:
                    return val == null || val instanceof String 
                            || val instanceof Map;
                case 1:
                    return val == null || val instanceof Object;
                default:
                    throw new RuntimeException("Not possible!");
            }
        }
    }

    @Test
    void testIsCompatibleValue_Case0_Null() {
        Key key = new Key(0);
        assertTrue(key.isCompatibleValue(null));
    }

    @Test
    void testIsCompatibleValue_Case0_String() {
        Key key = new Key(0);
        assertTrue(key.isCompatibleValue("test"));
    }

    @Test
    void testIsCompatibleValue_Case0_Map() {
        Key key = new Key(0);
        assertTrue(key.isCompatibleValue(new java.util.HashMap<>()));
    }

    @Test
    void testIsCompatibleValue_Case0_OtherObject() {
        Key key = new Key(0);
        assertFalse(key.isCompatibleValue(123));
    }

    @Test
    void testIsCompatibleValue_Case1_Null() {
        Key key = new Key(1);
        assertTrue(key.isCompatibleValue(null));
    }

    @Test
    void testIsCompatibleValue_Case1_Object() {
        Key key = new Key(1);
        assertTrue(key.isCompatibleValue(new Object()));
    }

    @Test
    void testIsCompatibleValue_Case1_OtherType() {
        Key key = new Key(1);
        assertFalse(key.isCompatibleValue("test"));
    }

    @Test
    void testIsCompatibleValue_InvalidKey() {
        Key key = new Key(2);
        assertThrows(RuntimeException.class, () -> key.isCompatibleValue(new Object()));
    }
}