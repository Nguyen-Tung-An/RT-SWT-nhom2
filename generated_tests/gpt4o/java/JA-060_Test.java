package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PatternOptionBuilderTest {
    
    @Test
    void testShift_NullArray() {
        long[] array = null;
        PatternOptionBuilder.shift(array, 0, 5, 2);
        // No assertion needed, just checking for no exception
    }

    @Test
    void testShift_StartIndexOutOfBounds() {
        long[] array = {1, 2, 3, 4, 5};
        PatternOptionBuilder.shift(array, 5, 5, 2);
        assertArrayEquals(new long[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void testShift_EndIndexNegative() {
        long[] array = {1, 2, 3, 4, 5};
        PatternOptionBuilder.shift(array, 0, -1, 2);
        assertArrayEquals(new long[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void testShift_OffsetGreaterThanLength() {
        long[] array = {1, 2, 3, 4, 5};
        PatternOptionBuilder.shift(array, 0, 5, 7);
        assertArrayEquals(new long[]{4, 5, 1, 2, 3}, array);
    }

    @Test
    void testShift_OffsetNegative() {
        long[] array = {1, 2, 3, 4, 5};
        PatternOptionBuilder.shift(array, 0, 5, -2);
        assertArrayEquals(new long[]{3, 4, 5, 1, 2}, array);
    }

    @Test
    void testShift_OffsetZero() {
        long[] array = {1, 2, 3, 4, 5};
        PatternOptionBuilder.shift(array, 0, 5, 0);
        assertArrayEquals(new long[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void testShift_SingleElement() {
        long[] array = {1};
        PatternOptionBuilder.shift(array, 0, 1, 1);
        assertArrayEquals(new long[]{1}, array);
    }

    @Test
    void testShift_TwoElements() {
        long[] array = {1, 2};
        PatternOptionBuilder.shift(array, 0, 2, 1);
        assertArrayEquals(new long[]{2, 1}, array);
    }

    @Test
    void testShift_MultipleElements() {
        long[] array = {1, 2, 3, 4, 5};
        PatternOptionBuilder.shift(array, 0, 5, 2);
        assertArrayEquals(new long[]{3, 4, 5, 1, 2}, array);
    }
}