package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionUtilsTest {

    @Test
    void testRemoveCount_ValidInput() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collection<Integer> result = CollectionUtils.removeCount(input, 1, 2);
        assertEquals(Arrays.asList(2, 3), result);
        assertEquals(Arrays.asList(1, 4, 5), input);
    }

    @Test
    void testRemoveCount_ZeroCount() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        Collection<Integer> result = CollectionUtils.removeCount(input, 0, 0);
        assertEquals(Arrays.asList(), result);
        assertEquals(Arrays.asList(1, 2, 3), input);
    }

    @Test
    void testRemoveCount_StartIndexOutOfBounds() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            CollectionUtils.removeCount(input, -1, 1);
        });
    }

    @Test
    void testRemoveCount_CountOutOfBounds() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            CollectionUtils.removeCount(input, 0, -1);
        });
    }

    @Test
    void testRemoveCount_SumOfStartIndexAndCountGreaterThanSize() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            CollectionUtils.removeCount(input, 2, 2);
        });
    }

    @Test
    void testRemoveCount_ExactSize() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        Collection<Integer> result = CollectionUtils.removeCount(input, 0, 3);
        assertEquals(Arrays.asList(1, 2, 3), result);
        assertTrue(input.isEmpty());
    }

    @Test
    void testRemoveCount_LargeCollection() {
        Collection<Integer> input = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            input.add(i);
        }
        Collection<Integer> result = CollectionUtils.removeCount(input, 10, 5);
        assertEquals(Arrays.asList(10, 11, 12, 13, 14), result);
        assertEquals(95, input.size());
    }
}