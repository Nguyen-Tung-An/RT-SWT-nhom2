import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionUtilsTest {

    @Test
    void testRemoveCount_ValidInput() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collection<Integer> result = CollectionUtils.removeCount(input, 1, 3);
        assertEquals(Arrays.asList(2, 3, 4), result);
        assertEquals(Arrays.asList(1, 5), input);
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
        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            CollectionUtils.removeCount(input, -1, 1);
        });
        assertEquals("The start index can't be less than 0.", exception.getMessage());
    }

    @Test
    void testRemoveCount_NegativeCount() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            CollectionUtils.removeCount(input, 0, -1);
        });
        assertEquals("The count can't be less than 0.", exception.getMessage());
    }

    @Test
    void testRemoveCount_SumExceedsSize() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            CollectionUtils.removeCount(input, 2, 2);
        });
        assertEquals("The sum of start index and count can't be greater than the size of collection.", exception.getMessage());
    }

    @Test
    void testRemoveCount_ExactSize() {
        Collection<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        Collection<Integer> result = CollectionUtils.removeCount(input, 0, 3);
        assertEquals(Arrays.asList(1, 2, 3), result);
        assertTrue(input.isEmpty());
    }
}