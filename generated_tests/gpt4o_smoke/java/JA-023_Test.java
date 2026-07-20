import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CollectionUtilsTest {

    @Test
    public void testCollateWithNonEmptyCollectionsIncludingDuplicates() {
        List<Integer> listA = Arrays.asList(1, 2, 2, 3);
        List<Integer> listB = Arrays.asList(2, 3, 4);
        Comparator<Integer> comparator = Integer::compareTo;

        List<Integer> result = CollectionUtils.collate(listA, listB, comparator, true);
        assertEquals(Arrays.asList(1, 2, 2, 2, 3, 3, 4), result);
    }

    @Test
    public void testCollateWithNonEmptyCollectionsExcludingDuplicates() {
        List<Integer> listA = Arrays.asList(1, 2, 2, 3);
        List<Integer> listB = Arrays.asList(2, 3, 4);
        Comparator<Integer> comparator = Integer::compareTo;

        List<Integer> result = CollectionUtils.collate(listA, listB, comparator, false);
        assertEquals(Arrays.asList(1, 2, 3, 4), result);
    }

    @Test
    public void testCollateWithEmptyFirstCollection() {
        List<Integer> listA = Arrays.asList();
        List<Integer> listB = Arrays.asList(2, 3, 4);
        Comparator<Integer> comparator = Integer::compareTo;

        List<Integer> result = CollectionUtils.collate(listA, listB, comparator, false);
        assertEquals(Arrays.asList(2, 3, 4), result);
    }

    @Test
    public void testCollateWithEmptySecondCollection() {
        List<Integer> listA = Arrays.asList(1, 2, 3);
        List<Integer> listB = Arrays.asList();
        Comparator<Integer> comparator = Integer::compareTo;

        List<Integer> result = CollectionUtils.collate(listA, listB, comparator, false);
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    public void testCollateWithBothEmptyCollections() {
        List<Integer> listA = Arrays.asList();
        List<Integer> listB = Arrays.asList();
        Comparator<Integer> comparator = Integer::compareTo;

        List<Integer> result = CollectionUtils.collate(listA, listB, comparator, false);
        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testCollateWithNullFirstCollection() {
        List<Integer> listB = Arrays.asList(2, 3, 4);
        Comparator<Integer> comparator = Integer::compareTo;

        assertThrows(NullPointerException.class, () -> {
            CollectionUtils.collate(null, listB, comparator, false);
        });
    }

    @Test
    public void testCollateWithNullSecondCollection() {
        List<Integer> listA = Arrays.asList(1, 2, 3);
        Comparator<Integer> comparator = Integer::compareTo;

        assertThrows(NullPointerException.class, () -> {
            CollectionUtils.collate(listA, null, comparator, false);
        });
    }

    @Test
    public void testCollateWithNullComparator() {
        List<Integer> listA = Arrays.asList(1, 2, 3);
        List<Integer> listB = Arrays.asList(2, 3, 4);

        assertThrows(NullPointerException.class, () -> {
            CollectionUtils.collate(listA, listB, null, false);
        });
    }
}