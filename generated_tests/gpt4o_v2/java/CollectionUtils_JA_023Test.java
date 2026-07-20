import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CollectionUtilsTest {

    @Test
    public void testCollateWithNonEmptyIterablesIncludingDuplicates() {
        List<Integer> iterableA = Arrays.asList(1, 2, 2, 3);
        List<Integer> iterableB = Arrays.asList(2, 3, 4);
        Comparator<Integer> comparator = Integer::compareTo;

        List<Integer> result = CollectionUtils.collate(iterableA, iterableB, comparator, true);
        assertEquals(Arrays.asList(1, 2, 2, 2, 3, 3, 4), result);
    }

    @Test
    public void testCollateWithNonEmptyIterablesExcludingDuplicates() {
        List<Integer> iterableA = Arrays.asList(1, 2, 2, 3);
        List<Integer> iterableB = Arrays.asList(2, 3, 4);
        Comparator<Integer> comparator = Integer::compareTo;

        List<Integer> result = CollectionUtils.collate(iterableA, iterableB, comparator, false);
        assertEquals(Arrays.asList(1, 2, 3, 4), result);
    }

    @Test
    public void testCollateWithEmptyFirstIterable() {
        List<Integer> iterableA = Arrays.asList();
        List<Integer> iterableB = Arrays.asList(2, 3, 4);
        Comparator<Integer> comparator = Integer::compareTo;

        List<Integer> result = CollectionUtils.collate(iterableA, iterableB, comparator, false);
        assertEquals(Arrays.asList(2, 3, 4), result);
    }

    @Test
    public void testCollateWithEmptySecondIterable() {
        List<Integer> iterableA = Arrays.asList(1, 2, 3);
        List<Integer> iterableB = Arrays.asList();
        Comparator<Integer> comparator = Integer::compareTo;

        List<Integer> result = CollectionUtils.collate(iterableA, iterableB, comparator, false);
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    public void testCollateWithBothEmptyIterables() {
        List<Integer> iterableA = Arrays.asList();
        List<Integer> iterableB = Arrays.asList();
        Comparator<Integer> comparator = Integer::compareTo;

        List<Integer> result = CollectionUtils.collate(iterableA, iterableB, comparator, false);
        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testCollateWithNullFirstIterable() {
        List<Integer> iterableB = Arrays.asList(2, 3, 4);
        Comparator<Integer> comparator = Integer::compareTo;

        assertThrows(NullPointerException.class, () -> {
            CollectionUtils.collate(null, iterableB, comparator, false);
        });
    }

    @Test
    public void testCollateWithNullSecondIterable() {
        List<Integer> iterableA = Arrays.asList(1, 2, 3);
        Comparator<Integer> comparator = Integer::compareTo;

        assertThrows(NullPointerException.class, () -> {
            CollectionUtils.collate(iterableA, null, comparator, false);
        });
    }

    @Test
    public void testCollateWithNullComparator() {
        List<Integer> iterableA = Arrays.asList(1, 2, 3);
        List<Integer> iterableB = Arrays.asList(2, 3, 4);

        assertThrows(NullPointerException.class, () -> {
            CollectionUtils.collate(iterableA, iterableB, null, false);
        });
    }
}