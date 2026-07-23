import org.apache.commons.collections4.iterators.ListIteratorWrapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ListIteratorWrapperTest {

    private ListIteratorWrapper<String> listIteratorWrapper;
    private List<String> list;

    @BeforeEach
    void setUp() {
        list = Arrays.asList("A", "B", "C", "D");
        Iterator<String> iterator = list.iterator();
        listIteratorWrapper = new ListIteratorWrapper<>(iterator);
    }

    @Test
    void testRemoveFromListIterator() {
        listIteratorWrapper.next(); // Move to "A"
        listIteratorWrapper.remove(); // Remove "A"
        assertEquals(Arrays.asList("B", "C", "D"), list);
    }

    @Test
    void testRemoveFromWrappedList() {
        listIteratorWrapper.next(); // Move to "A"
        listIteratorWrapper.remove(); // Remove "A"
        assertThrows(IllegalStateException.class, () -> {
            listIteratorWrapper.remove(); // Attempt to remove again
        });
    }

    @Test
    void testRemoveWhenCurrentIndexIsWrappedIteratorIndex() {
        listIteratorWrapper.next(); // Move to "A"
        listIteratorWrapper.remove(); // Remove "A"
        listIteratorWrapper.next(); // Move to "B"
        listIteratorWrapper.remove(); // Remove "B"
        assertEquals(Arrays.asList("C", "D"), list);
    }

    @Test
    void testRemoveThrowsExceptionWhenRemoveStateIsFalse() {
        listIteratorWrapper.next(); // Move to "A"
        listIteratorWrapper.remove(); // Remove "A"
        assertThrows(IllegalStateException.class, () -> {
            listIteratorWrapper.remove(); // Attempt to remove again
        });
    }

    @Test
    void testRemoveThrowsExceptionWhenCurrentIndexIsGreaterThanWrappedIteratorIndex() {
        listIteratorWrapper.next(); // Move to "A"
        listIteratorWrapper.remove(); // Remove "A"
        listIteratorWrapper.next(); // Move to "B"
        listIteratorWrapper.remove(); // Remove "B"
        listIteratorWrapper.next(); // Move to "C"
        listIteratorWrapper.remove(); // Remove "C"
        assertThrows(IllegalStateException.class, () -> {
            listIteratorWrapper.remove(); // Attempt to remove "D" without moving
        });
    }
}