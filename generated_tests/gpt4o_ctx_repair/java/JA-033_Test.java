package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    void testIndexOf_ArrayIsNull() {
        assertEquals(-1, ArrayUtils.indexOf(null, "test", 0));
    }

    @Test
    void testIndexOf_StartIndexNegative() {
        Object[] array = {"a", "b", "c"};
        assertEquals(0, ArrayUtils.indexOf(array, null, -1));
    }

    @Test
    void testIndexOf_ObjectToFindIsNull() {
        Object[] array = {"a", null, "c"};
        assertEquals(1, ArrayUtils.indexOf(array, null, 0));
    }

    @Test
    void testIndexOf_ObjectFound() {
        Object[] array = {"a", "b", "c"};
        assertEquals(1, ArrayUtils.indexOf(array, "b", 0));
    }

    @Test
    void testIndexOf_ObjectNotFound() {
        Object[] array = {"a", "b", "c"};
        assertEquals(-1, ArrayUtils.indexOf(array, "d", 0));
    }

    @Test
    void testIndexOf_StartIndexWithinBounds() {
        Object[] array = {"a", "b", "c", "b"};
        assertEquals(3, ArrayUtils.indexOf(array, "b", 2));
    }

    @Test
    void testIndexOf_StartIndexOutOfBounds() {
        Object[] array = {"a", "b", "c"};
        assertEquals(-1, ArrayUtils.indexOf(array, "a", 5));
    }
}