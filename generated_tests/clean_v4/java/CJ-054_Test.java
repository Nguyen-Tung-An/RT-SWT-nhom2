import org.apache.commons.math4.legacy.core.MathArrays;
import org.apache.commons.math4.legacy.exception.MathInternalError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathArraysTest {

    @Test
    void testIsMonotonicIncreasingStrictTrue() {
        Integer[] values = {1, 2, 3, 4};
        assertTrue(MathArrays.isMonotonic(values, OrderDirection.INCREASING, true));
    }

    @Test
    void testIsMonotonicIncreasingStrictFalse() {
        Integer[] values = {1, 2, 2, 3};
        assertTrue(MathArrays.isMonotonic(values, OrderDirection.INCREASING, false));
    }

    @Test
    void testIsMonotonicIncreasingStrictTrueFail() {
        Integer[] values = {1, 2, 2, 3};
        assertFalse(MathArrays.isMonotonic(values, OrderDirection.INCREASING, true));
    }

    @Test
    void testIsMonotonicDecreasingStrictTrue() {
        Integer[] values = {4, 3, 2, 1};
        assertTrue(MathArrays.isMonotonic(values, OrderDirection.DECREASING, true));
    }

    @Test
    void testIsMonotonicDecreasingStrictFalse() {
        Integer[] values = {4, 4, 3, 2};
        assertTrue(MathArrays.isMonotonic(values, OrderDirection.DECREASING, false));
    }

    @Test
    void testIsMonotonicDecreasingStrictTrueFail() {
        Integer[] values = {4, 4, 3, 2};
        assertFalse(MathArrays.isMonotonic(values, OrderDirection.DECREASING, true));
    }

    @Test
    void testIsMonotonicInvalidDirection() {
        Integer[] values = {1, 2, 3};
        assertThrows(MathInternalError.class, () -> {
            MathArrays.isMonotonic(values, null, true);
        });
    }

    @Test
    void testIsMonotonicEmptyArray() {
        Integer[] values = {};
        assertTrue(MathArrays.isMonotonic(values, OrderDirection.INCREASING, true));
    }

    @Test
    void testIsMonotonicSingleElementArray() {
        Integer[] values = {1};
        assertTrue(MathArrays.isMonotonic(values, OrderDirection.INCREASING, true));
    }
}