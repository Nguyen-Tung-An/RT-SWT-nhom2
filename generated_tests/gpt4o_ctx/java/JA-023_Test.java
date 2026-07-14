package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionUtilsTest {

    @Test
    void testCollate_BothEmpty() {
        List<Integer> result = CollectionUtils.collate(Arrays.asList(), Arrays.asList(), Comparator.naturalOrder(), true);
        assertTrue(result.isEmpty());
    }

    @Test
    void testCollate_OneEmpty() {
        List<Integer> result = CollectionUtils.collate(Arrays.asList(), Arrays.asList(1, 2, 3), Comparator.naturalOrder(), true);
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    void testCollate_NoDuplicates() {
        List<Integer> result = CollectionUtils.collate(Arrays.asList(1, 3, 5), Arrays.asList(2, 4, 6), Comparator.naturalOrder(), false);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), result);
    }

    @Test
    void testCollate_WithDuplicates() {
        List<Integer> result = CollectionUtils.collate(Arrays.asList(1, 2, 2, 3), Arrays.asList(2, 3, 4), Comparator.naturalOrder(), true);
        assertEquals(Arrays.asList(1, 2, 2, 2, 3, 3, 4), result);
    }

    @Test
    void testCollate_SingleElement() {
        List<Integer> result = CollectionUtils.collate(Arrays.asList(1), Arrays.asList(1), Comparator.naturalOrder(), false);
        assertEquals(Arrays.asList(1), result);
    }

    @Test
    void testCollate_DifferentSizes() {
        List<Integer> result = CollectionUtils.collate(Arrays.asList(1, 3, 5), Arrays.asList(2, 4), Comparator.naturalOrder(), false);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), result);
    }

    @Test
    void testCollate_NullIterableA() {
        assertThrows(NullPointerException.class, () -> {
            CollectionUtils.collate(null, Arrays.asList(1, 2, 3), Comparator.naturalOrder(), true);
        });
    }

    @Test
    void testCollate_NullIterableB() {
        assertThrows(NullPointerException.class, () -> {
            CollectionUtils.collate(Arrays.asList(1, 2, 3), null, Comparator.naturalOrder(), true);
        });
    }

    @Test
    void testCollate_NullComparator() {
        assertThrows(NullPointerException.class, () -> {
            CollectionUtils.collate(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), null, true);
        });
    }
}