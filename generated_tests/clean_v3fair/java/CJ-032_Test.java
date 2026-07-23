package org.jfree.chart.internal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class ArrayUtilsTest {
    
    @Test
    void testEqual_NullArray1_NullArray2() {
        assertTrue(ArrayUtils.equal(null, null));
    }

    @Test
    void testEqual_NullArray1_NotNullArray2() {
        float[][] array2 = {{1.0f, 2.0f}, {3.0f, 4.0f}};
        assertFalse(ArrayUtils.equal(null, array2));
    }

    @Test
    void testEqual_NotNullArray1_NullArray2() {
        float[][] array1 = {{1.0f, 2.0f}, {3.0f, 4.0f}};
        assertFalse(ArrayUtils.equal(array1, null));
    }

    @Test
    void testEqual_DifferentLengthArrays() {
        float[][] array1 = {{1.0f, 2.0f}};
        float[][] array2 = {{1.0f, 2.0f}, {3.0f, 4.0f}};
        assertFalse(ArrayUtils.equal(array1, array2));
    }

    @Test
    void testEqual_SameArrays() {
        float[][] array1 = {{1.0f, 2.0f}, {3.0f, 4.0f}};
        float[][] array2 = {{1.0f, 2.0f}, {3.0f, 4.0f}};
        assertTrue(ArrayUtils.equal(array1, array2));
    }

    @Test
    void testEqual_DifferentContentArrays() {
        float[][] array1 = {{1.0f, 2.0f}, {3.0f, 4.0f}};
        float[][] array2 = {{1.0f, 2.0f}, {3.0f, 5.0f}};
        assertFalse(ArrayUtils.equal(array1, array2));
    }

    @Test
    void testEqual_EmptyArrays() {
        float[][] array1 = {};
        float[][] array2 = {};
        assertTrue(ArrayUtils.equal(array1, array2));
    }

    @Test
    void testEqual_OneEmptyArray() {
        float[][] array1 = {};
        float[][] array2 = {{1.0f, 2.0f}};
        assertFalse(ArrayUtils.equal(array1, array2));
    }
}