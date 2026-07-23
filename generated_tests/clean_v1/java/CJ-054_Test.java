package org.apache.commons.math4.legacy.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathArraysTest {

    @Test
    void testIsMonotonic_Increasing_NonStrict() {
        Integer[] values = {1, 2, 2, 3};
        assertTrue(MathArrays.isMonotonic(values, OrderDirection.INCREASING, false));
    }

    @Test
    void testIsMonotonic_Increasing_Strict() {
        Integer[] values = {1, 2, 3};
        assertTrue(MathArrays.isMonotonic(values, OrderDirection.INCREASING, true));
    }

    @Test
    void testIsMonotonic_Increasing_Strict_Failure() {
        Integer[] values = {1, 2, 2, 3};
        assertFalse(MathArrays.isMonotonic(values, OrderDirection.INCREASING, true));
    }

    @Test
    void testIsMonotonic_Decreasing_NonStrict() {
        Integer[] values = {3, 2, 2, 1};
        assertTrue(MathArrays.isMonotonic(values, OrderDirection.DECREASING, false));
    }

    @Test
    void testIsMonotonic_Decreasing_Strict() {
        Integer[] values = {3, 2, 1};
        assertTrue(MathArrays.isMonotonic(values, OrderDirection.DECREASING, true));
    }

    @Test
    void testIsMonotonic_Decreasing_Strict_Failure() {
        Integer[] values = {3, 2, 2, 1};
        assertFalse(MathArrays.isMonotonic(values, OrderDirection.DECREASING, true));
    }

    @Test
    void testIsMonotonic_EmptyArray() {
        Integer[] values = {};
        assertTrue(MathArrays.isMonotonic(values, OrderDirection.INCREASING, false));
    }

    @Test
    void testIsMonotonic_SingleElementArray() {
        Integer[] values = {1};
        assertTrue(MathArrays.isMonotonic(values, OrderDirection.INCREASING, false));
    }

    @Test
    void testIsMonotonic_InvalidDirection() {
        Integer[] values = {1, 2, 3};
        assertThrows(MathInternalError.class, () -> {
            MathArrays.isMonotonic(values, null, false);
        });
    }
}