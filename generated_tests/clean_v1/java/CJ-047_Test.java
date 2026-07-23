package org.apache.commons.math4.legacy.core.dfp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DfpMathTest {

    @Test
    void testLog_Zero() {
        Dfp zero = DfpField.ZERO;
        Dfp result = DfpMath.log(zero);
        assertTrue(result.isNaN());
    }

    @Test
    void testLog_Negative() {
        Dfp negative = DfpField.newInstance(-1);
        Dfp result = DfpMath.log(negative);
        assertTrue(result.isNaN());
    }

    @Test
    void testLog_NaN() {
        Dfp nan = DfpField.QNAN;
        Dfp result = DfpMath.log(nan);
        assertTrue(result.isNaN());
    }

    @Test
    void testLog_Infinite() {
        Dfp infinite = DfpField.INFINITE;
        Dfp result = DfpMath.log(infinite);
        assertEquals(infinite, result);
    }

    @Test
    void testLog_Positive() {
        Dfp positive = DfpField.newInstance(2);
        Dfp result = DfpMath.log(positive);
        assertFalse(result.isNaN());
        assertTrue(result.greaterThan(DfpField.ZERO));
    }

    @Test
    void testLog_One() {
        Dfp one = DfpField.newInstance(1);
        Dfp result = DfpMath.log(one);
        assertEquals(DfpField.ZERO, result);
    }

    @Test
    void testLog_SmallPositive() {
        Dfp smallPositive = DfpField.newInstance(0.1);
        Dfp result = DfpMath.log(smallPositive);
        assertTrue(result.lessThan(DfpField.ZERO));
    }
}