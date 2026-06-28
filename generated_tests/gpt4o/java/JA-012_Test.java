package org.apache.commons.cli;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

public class DefaultParserTest {

    @Test
    void testAdd_NullArray_ZeroIndex() {
        Object result = DefaultParser.add(null, 0, "element", String.class);
        assertEquals(1, Array.getLength(result));
        assertEquals("element", Array.get(result, 0));
    }

    @Test
    void testAdd_NullArray_NonZeroIndex() {
        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            DefaultParser.add(null, 1, "element", String.class);
        });
        assertEquals("Index: 1, Length: 0", exception.getMessage());
    }

    @Test
    void testAdd_ValidArray_ValidIndex() {
        String[] array = new String[]{"a", "b", "c"};
        Object result = DefaultParser.add(array, 1, "newElement", String.class);
        assertEquals(4, Array.getLength(result));
        assertEquals("a", Array.get(result, 0));
        assertEquals("newElement", Array.get(result, 1));
        assertEquals("b", Array.get(result, 2));
        assertEquals("c", Array.get(result, 3));
    }

    @Test
    void testAdd_ValidArray_IndexOutOfBounds() {
        String[] array = new String[]{"a", "b", "c"};
        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            DefaultParser.add(array, 4, "element", String.class);
        });
        assertEquals("Index: 4, Length: 3", exception.getMessage());
    }

    @Test
    void testAdd_ValidArray_NegativeIndex() {
        String[] array = new String[]{"a", "b", "c"};
        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            DefaultParser.add(array, -1, "element", String.class);
        });
        assertEquals("Index: -1, Length: 3", exception.getMessage());
    }
}