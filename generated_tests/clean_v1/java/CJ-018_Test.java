package org.apache.commons.math4.legacy.linear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OpenIntToFieldHashMapTest {
    private OpenIntToFieldHashMap<Integer> map;

    @BeforeEach
    void setUp() {
        map = new OpenIntToFieldHashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
    }

    @Test
    void testRemove_ExistingKey() {
        assertEquals(10, map.remove(1));
        assertNull(map.remove(1)); // Verify the key is removed
    }

    @Test
    void testRemove_NonExistingKey() {
        assertNull(map.remove(4)); // Key does not exist
    }

    @Test
    void testRemove_EmptySlot() {
        map.remove(1); // Remove existing key
        assertNull(map.remove(1)); // Verify the key is removed
        assertNull(map.remove(1)); // Verify removing again returns null
    }

    @Test
    void testRemove_FreeState() {
        map.remove(1); // Remove existing key
        assertNull(map.remove(1)); // Verify the key is removed
        assertNull(map.remove(2)); // Remove another existing key
        assertNull(map.remove(3)); // Remove last existing key
        assertNull(map.remove(4)); // Now all keys are removed, check non-existing key
    }
}