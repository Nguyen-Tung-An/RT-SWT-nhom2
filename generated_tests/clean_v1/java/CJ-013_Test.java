package org.apache.commons.collections4.iterators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;

public class ListIteratorWrapperTest {
    private List<String> list;
    private ListIterator<String> listIterator;
    private ListIteratorWrapper<String> listIteratorWrapper;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        listIterator = list.listIterator();
        listIteratorWrapper = new ListIteratorWrapper<>(listIterator);
    }

    @Test
    void testRemove_ValidState() {
        listIterator.next(); // Move to "A"
        listIteratorWrapper.remove(); // Should remove "A"
        assertEquals(Arrays.asList("B", "C"), list);
    }

    @Test
    void testRemove_ValidStateAfterNext() {
        listIterator.next(); // Move to "A"
        listIterator.next(); // Move to "B"
        listIteratorWrapper.remove(); // Should remove "B"
        assertEquals(Arrays.asList("A", "C"), list);
    }

    @Test
    void testRemove_IllegalStateException_NoNextCall() {
        assertThrows(IllegalStateException.class, () -> {
            listIteratorWrapper.remove(); // No previous next call
        });
    }

    @Test
    void testRemove_IllegalStateException_ConsecutiveRemoveCalls() {
        listIterator.next(); // Move to "A"
        listIteratorWrapper.remove(); // Should remove "A"
        assertThrows(IllegalStateException.class, () -> {
            listIteratorWrapper.remove(); // Remove called again without next
        });
    }

    @Test
    void testRemove_IllegalStateException_WrappedIteratorIndex() {
        listIterator.next(); // Move to "A"
        listIterator.next(); // Move to "B"
        listIteratorWrapper.remove(); // Should remove "B"
        listIteratorWrapper.remove(); // Should remove "A"
        assertThrows(IllegalStateException.class, () -> {
            listIteratorWrapper.remove(); // No valid state to remove
        });
    }
}