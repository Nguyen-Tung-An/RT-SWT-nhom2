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
        Dfp negative = new Dfp(-1);
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
        Dfp positive = new Dfp(1);
        Dfp result = DfpMath.log(positive);
        assertEquals(0, result.getReal(), 1e-10);
    }

    @Test
    void testLog_AboveOne() {
        Dfp aboveOne = new Dfp(2);
        Dfp result = DfpMath.log(aboveOne);
        assertTrue(result.getReal() > 0);
    }

    @Test
    void testLog_BelowOne() {
        Dfp belowOne = new Dfp(0.5);
        Dfp result = DfpMath.log(belowOne);
        assertTrue(result.getReal() < 0);
    }
}