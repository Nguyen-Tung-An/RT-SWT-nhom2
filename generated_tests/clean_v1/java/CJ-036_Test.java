package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionUtilsTest {

    @Test
    void testRemoveCount_ValidInput() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collection<Integer> result = CollectionUtils.removeCount(input, 2, 2);
        assertEquals(Arrays.asList(3, 4), result);
        assertEquals(Arrays.asList(1, 2, 5), input);
    }

    @Test
    void testRemoveCount_StartIndexLessThanZero() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            CollectionUtils.removeCount(input, -1, 1);
        });
    }

    @Test
    void testRemoveCount_CountLessThanZero() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            CollectionUtils.removeCount(input, 1, -1);
        });
    }

    @Test
    void testRemoveCount_StartIndexPlusCountGreaterThanSize() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            CollectionUtils.removeCount(input, 2, 2);
        });
    }

    @Test
    void testRemoveCount_ZeroCount() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        Collection<Integer> result = CollectionUtils.removeCount(input, 1, 0);
        assertEquals(Collections.emptyList(), result);
        assertEquals(Arrays.asList(1, 2, 3), input);
    }

    @Test
    void testRemoveCount_ExactCount() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Collection<Integer> result = CollectionUtils.removeCount(input, 0, 4);
        assertEquals(Arrays.asList(1, 2, 3, 4), result);
        assertTrue(input.isEmpty());
    }
}