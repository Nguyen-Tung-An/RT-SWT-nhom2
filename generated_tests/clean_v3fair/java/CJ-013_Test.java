package org.apache.commons.collections4.iterators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;

public class ListIteratorWrapperTest {
    private ListIteratorWrapper<Integer> listIteratorWrapper;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        listIteratorWrapper = new ListIteratorWrapper<>(list.listIterator());
    }

    @Test
    void testRemove_ValidState() {
        listIteratorWrapper.next(); // Move to the first element
        listIteratorWrapper.remove(); // Should remove the first element
        assertEquals(Arrays.asList(2, 3, 4, 5), list);
    }

    @Test
    void testRemove_ValidState_AtEnd() {
        listIteratorWrapper.next(); // Move to the first element
        listIteratorWrapper.remove(); // Remove first element
        listIteratorWrapper.next(); // Move to second element
        listIteratorWrapper.remove(); // Remove second element
        assertEquals(Arrays.asList(3, 4, 5), list);
    }

    @Test
    void testRemove_IllegalStateException_NoNextCall() {
        assertThrows(IllegalStateException.class, () -> listIteratorWrapper.remove());
    }

    @Test
    void testRemove_IllegalStateException_AfterMultipleRemoves() {
        listIteratorWrapper.next(); // Move to the first element
        listIteratorWrapper.remove(); // Remove first element
        listIteratorWrapper.remove(); // Should throw IllegalStateException
        assertThrows(IllegalStateException.class, () -> listIteratorWrapper.remove());
    }

    @Test
    void testRemove_IllegalStateException_TooManyRemoves() {
        listIteratorWrapper.next(); // Move to the first element
        listIteratorWrapper.remove(); // Remove first element
        listIteratorWrapper.next(); // Move to second element
        listIteratorWrapper.remove(); // Remove second element
        assertThrows(IllegalStateException.class, () -> listIteratorWrapper.remove());
    }
}