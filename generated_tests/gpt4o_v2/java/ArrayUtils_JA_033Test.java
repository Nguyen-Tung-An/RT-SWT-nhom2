import org.apache.commons.collections4.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayUtilsTest {

    @Test
    void testIndexOf_NullArray() {
        Object[] array = null;
        Object objectToFind = new Object();
        int startIndex = 0;
        int result = ArrayUtils.indexOf(array, objectToFind, startIndex);
        assertEquals(-1, result);
    }

    @Test
    void testIndexOf_NegativeStartIndex() {
        Object[] array = {1, 2, 3};
        Object objectToFind = 2;
        int startIndex = -1;
        int result = ArrayUtils.indexOf(array, objectToFind, startIndex);
        assertEquals(1, result);
    }

    @Test
    void testIndexOf_ObjectToFindIsNull() {
        Object[] array = {1, null, 3};
        Object objectToFind = null;
        int startIndex = 0;
        int result = ArrayUtils.indexOf(array, objectToFind, startIndex);
        assertEquals(1, result);
    }

    @Test
    void testIndexOf_ObjectFound() {
        Object[] array = {1, 2, 3};
        Object objectToFind = 2;
        int startIndex = 0;
        int result = ArrayUtils.indexOf(array, objectToFind, startIndex);
        assertEquals(1, result);
    }

    @Test
    void testIndexOf_ObjectNotFound() {
        Object[] array = {1, 2, 3};
        Object objectToFind = 4;
        int startIndex = 0;
        int result = ArrayUtils.indexOf(array, objectToFind, startIndex);
        assertEquals(-1, result);
    }

    @Test
    void testIndexOf_StartIndexBeyondArrayLength() {
        Object[] array = {1, 2, 3};
        Object objectToFind = 2;
        int startIndex = 5;
        int result = ArrayUtils.indexOf(array, objectToFind, startIndex);
        assertEquals(-1, result);
    }
}