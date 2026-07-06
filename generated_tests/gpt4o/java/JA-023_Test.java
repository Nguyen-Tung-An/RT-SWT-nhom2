package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SetOperationCardinalityHelperTest {

    @Test
    void testCollate_BothCollections_IncludeDuplicates() {
        List<Integer> listA = Arrays.asList(1, 2, 2, 3);
        List<Integer> listB = Arrays.asList(2, 3, 4);
        Comparator<Integer> comparator = Integer::compareTo;

        List<Integer> result = SetOperationCardinalityHelper.collate(listA, listB, comparator, true);
        assertEquals(Arrays.asList(1, 2, 2, 2, 3, 3, 4), result);
    }

    @Test
    void testCollate_BothCollections_ExcludeDuplicates() {
        List<Integer> listA = Arrays.asList(1, 2, 2, 3);
        List<Integer> listB = Arrays.asList(2, 3, 4);
        Comparator<Integer> comparator = Integer::compareTo;

        List<Integer> result = SetOperationCardinalityHelper.collate(listA, listB, comparator, false);
        assertEquals(Arrays.asList(1, 2, 3, 4), result);
    }

    @Test
    void testCollate_OneEmptyCollection_IncludeDuplicates() {
        List<Integer> listA = Collections.emptyList();
        List<Integer> listB = Arrays.asList(1, 2, 3);
        Comparator<Integer> comparator = Integer::compareTo;

        List<Integer> result = SetOperationCardinalityHelper.collate(listA, listB, comparator, true);
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    void testCollate_OneEmptyCollection_ExcludeDuplicates() {
        List<Integer> listA = Collections.emptyList();
        List<Integer> listB = Arrays.asList(1, 2, 3);
        Comparator<Integer> comparator = Integer::compareTo;

        List<Integer> result = SetOperationCardinalityHelper.collate(listA, listB, comparator, false);
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    void testCollate_NullIterableA() {
        List<Integer> listB = Arrays.asList(1, 2, 3);
        Comparator<Integer> comparator = Integer::compareTo;

        assertThrows(NullPointerException.class, () -> {
            SetOperationCardinalityHelper.collate(null, listB, comparator, true);
        });
    }

    @Test
    void testCollate_NullIterableB() {
        List<Integer> listA = Arrays.asList(1, 2, 3);
        Comparator<Integer> comparator = Integer::compareTo;

        assertThrows(NullPointerException.class, () -> {
            SetOperationCardinalityHelper.collate(listA, null, comparator, true);
        });
    }

    @Test
    void testCollate_NullComparator() {
        List<Integer> listA = Arrays.asList(1, 2, 3);
        List<Integer> listB = Arrays.asList(4, 5, 6);

        assertThrows(NullPointerException.class, () -> {
            SetOperationCardinalityHelper.collate(listA, listB, null, true);
        });
    }
}