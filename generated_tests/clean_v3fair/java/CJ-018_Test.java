package org.apache.commons.math4.legacy.linear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OpenIntToFieldHashMapTest {
    private OpenIntToFieldHashMap<String> map;

    @BeforeEach
    void setUp() {
        map = new OpenIntToFieldHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
    }

    @Test
    void testRemove_ExistingKey() {
        assertEquals("One", map.remove(1));
        assertNull(map.remove(1)); // Verify it's removed
    }

    @Test
    void testRemove_NonExistingKey() {
        assertNull(map.remove(4)); // Key 4 does not exist
    }

    @Test
    void testRemove_EmptySlot() {
        map.remove(1); // Remove existing key
        assertNull(map.remove(1)); // Verify it's removed
        assertNull(map.remove(1)); // Verify removing again returns null
    }

    @Test
    void testRemove_KeyWithCollision() {
        // Assuming keys 1 and 2 collide, we remove one and check the other
        assertEquals("One", map.remove(1));
        assertEquals("Two", map.remove(2)); // Ensure the other key is still accessible
    }

    @Test
    void testRemove_FreeState() {
        map.remove(1); // Remove existing key
        assertNull(map.remove(1)); // Verify it's removed
        assertNull(map.remove(1)); // Verify removing again returns null
    }
}