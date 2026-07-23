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
        assertFalse(ArrayUtils.equal(null, new float[][]{{1.0f}}));
    }

    @Test
    void testEqual_NotNullArray1_NullArray2() {
        assertFalse(ArrayUtils.equal(new float[][]{{1.0f}}, null));
    }

    @Test
    void testEqual_DifferentLengthArrays() {
        assertFalse(ArrayUtils.equal(new float[][]{{1.0f}}, new float[][]{{1.0f}, {2.0f}}));
    }

    @Test
    void testEqual_SameLengthDifferentContent() {
        assertFalse(ArrayUtils.equal(new float[][]{{1.0f}}, new float[][]{{2.0f}}));
    }

    @Test
    void testEqual_SameLengthSameContent() {
        assertTrue(ArrayUtils.equal(new float[][]{{1.0f}}, new float[][]{{1.0f}}));
    }

    @Test
    void testEqual_MultipleRows_SameContent() {
        assertTrue(ArrayUtils.equal(new float[][]{{1.0f, 2.0f}, {3.0f, 4.0f}}, new float[][]{{1.0f, 2.0f}, {3.0f, 4.0f}}));
    }

    @Test
    void testEqual_MultipleRows_DifferentContent() {
        assertFalse(ArrayUtils.equal(new float[][]{{1.0f, 2.0f}, {3.0f, 4.0f}}, new float[][]{{1.0f, 2.0f}, {4.0f, 3.0f}}));
    }
}