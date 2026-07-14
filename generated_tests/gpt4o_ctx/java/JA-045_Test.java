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
        assertEquals(Math.exp(2.0) - 1.0, AccurateMath.expm1(2.0, hiPrecOut), 1e-10);
    }

    @Test
    void testExpm1_NegativeGreaterThanOne() {
        double[] hiPrecOut = new double[2];
        assertEquals(Math.exp(-2.0) - 1.0, AccurateMath.expm1(-2.0, hiPrecOut), 1e-10);
    }

    @Test
    void testExpm1_PositiveLessThanOne() {
        double[] hiPrecOut = new double[2];
        assertEquals(Math.expm1(0.5), AccurateMath.expm1(0.5, hiPrecOut), 1e-10);
    }

    @Test
    void testExpm1_NegativeLessThanOne() {
        double[] hiPrecOut = new double[2];
        assertEquals(Math.expm1(-0.5), AccurateMath.expm1(-0.5, hiPrecOut), 1e-10);
    }

    @Test
    void testExpm1_PositiveEdgeCase() {
        double[] hiPrecOut = new double[2];
        assertEquals(Math.expm1(1.0), AccurateMath.expm1(1.0, hiPrecOut), 1e-10);
    }

    @Test
    void testExpm1_NegativeEdgeCase() {
        double[] hiPrecOut = new double[2];
        assertEquals(Math.expm1(-1.0), AccurateMath.expm1(-1.0, hiPrecOut), 1e-10);
    }
}