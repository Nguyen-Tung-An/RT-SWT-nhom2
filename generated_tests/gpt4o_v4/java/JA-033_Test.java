package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayUtilsTest {

    @Test
    void testIndexOf_NullArray() {
        Object[] array = null;
        Object objectToFind = new Object();
        int startIndex = 0;
        int result = ArrayUtils.indexOf(array, objectToFind, startIndex);
        assertEquals(CollectionUtils.INDEX_NOT_FOUND, result);
    }

    @Test
    void testIndexOf_NegativeStartIndex() {
        Object[] array = new Object[]{"a", "b", "c"};
        Object objectToFind = "b";
        int startIndex = -1;
        int result = ArrayUtils.indexOf(array, objectToFind, startIndex);
        assertEquals(1, result);
    }

    @Test
    void testIndexOf_ObjectFound() {
        Object[] array = new Object[]{"a", "b", "c"};
        Object objectToFind = "b";
        int startIndex = 0;
        int result = ArrayUtils.indexOf(array, objectToFind, startIndex);
        assertEquals(1, result);
    }

    @Test
    void testIndexOf_ObjectNotFound() {
        Object[] array = new Object[]{"a", "b", "c"};
        Object objectToFind = "d";
        int startIndex = 0;
        int result = ArrayUtils.indexOf(array, objectToFind, startIndex);
        assertEquals(CollectionUtils.INDEX_NOT_FOUND, result);
    }

    @Test
    void testIndexOf_NullObjectToFind() {
        Object[] array = new Object[]{"a", null, "c"};
        Object objectToFind = null;
        int startIndex = 0;
        int result = ArrayUtils.indexOf(array, objectToFind, startIndex);
        assertEquals(1, result);
    }

    @Test
    void testIndexOf_NullObjectToFind_NotFound() {
        Object[] array = new Object[]{"a", "b", "c"};
        Object objectToFind = null;
        int startIndex = 0;
        int result = ArrayUtils.indexOf(array, objectToFind, startIndex);
        assertEquals(CollectionUtils.INDEX_NOT_FOUND, result);
    }

    @Test
    void testIndexOf_StartIndexBeyondArrayLength() {
        Object[] array = new Object[]{"a", "b", "c"};
        Object objectToFind = "a";
        int startIndex = 5;
        int result = ArrayUtils.indexOf(array, objectToFind, startIndex);
        assertEquals(CollectionUtils.INDEX_NOT_FOUND, result);
    }
}