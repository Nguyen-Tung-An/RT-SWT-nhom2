package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelpFormatterTest {
    private static final int INDEX_NOT_FOUND = -1;

    @Test
    void testLastIndexOf_NullArray() {
        assertEquals(INDEX_NOT_FOUND, HelpFormatter.lastIndexOf(null, 1, 0));
    }

    @Test
    void testLastIndexOf_NegativeStartIndex() {
        int[] array = {1, 2, 3};
        assertEquals(INDEX_NOT_FOUND, HelpFormatter.lastIndexOf(array, 1, -1));
    }

    @Test
    void testLastIndexOf_StartIndexOutOfBounds() {
        int[] array = {1, 2, 3};
        assertEquals(0, HelpFormatter.lastIndexOf(array, 1, 5));
    }

    @Test
    void testLastIndexOf_ValueFound() {
        int[] array = {1, 2, 3, 1};
        assertEquals(3, HelpFormatter.lastIndexOf(array, 1, 3));
    }

    @Test
    void testLastIndexOf_ValueNotFound() {
        int[] array = {1, 2, 3};
        assertEquals(INDEX_NOT_FOUND, HelpFormatter.lastIndexOf(array, 4, 2));
    }

    @Test
    void testLastIndexOf_EmptyArray() {
        int[] array = {};
        assertEquals(INDEX_NOT_FOUND, HelpFormatter.lastIndexOf(array, 1, 0));
    }
}