package org.apache.commons.math4.core.jdkmath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccurateMathTest {

    @Test
    void testExpm1_NaN() {
        double[] hiPrecOut = new double[2];
        assertEquals(Double.NaN, AccurateMath.expm1(Double.NaN, hiPrecOut));
    }

    @Test
    void testExpm1_Zero() {
        double[] hiPrecOut = new double[2];
        assertEquals(0.0, AccurateMath.expm1(0.0, hiPrecOut));
    }

    @Test
    void testExpm1_PositiveGreaterThanOne() {
        double[] hiPrecOut = new double[2];
        assertTrue(AccurateMath.expm1(2.0, hiPrecOut) > 0);
    }

    @Test
    void testExpm1_NegativeLessThanNegativeOne() {
        double[] hiPrecOut = new double[2];
        assertTrue(AccurateMath.expm1(-2.0, hiPrecOut) < 0);
    }

    @Test
    void testExpm1_PositiveBetweenZeroAndOne() {
        double[] hiPrecOut = new double[2];
        assertEquals(AccurateMath.expm1(0.5, hiPrecOut), Math.expm1(0.5), 1e-10);
    }

    @Test
    void testExpm1_NegativeBetweenZeroAndNegativeOne() {
        double[] hiPrecOut = new double[2];
        assertEquals(AccurateMath.expm1(-0.5, hiPrecOut), Math.expm1(-0.5), 1e-10);
    }

    @Test
    void testExpm1_PositiveBoundary() {
        double[] hiPrecOut = new double[2];
        assertEquals(AccurateMath.expm1(1.0, hiPrecOut), Math.expm1(1.0), 1e-10);
    }

    @Test
    void testExpm1_NegativeBoundary() {
        double[] hiPrecOut = new double[2];
        assertEquals(AccurateMath.expm1(-1.0, hiPrecOut), Math.expm1(-1.0), 1e-10);
    }
}