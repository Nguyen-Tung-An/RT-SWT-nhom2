package org.apache.commons.math4.core.jdkmath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccurateMathTest {

    @Test
    void testExpm1_NaN() {
        assertEquals(Double.NaN, AccurateMath.expm1(Double.NaN));
    }

    @Test
    void testExpm1_Zero() {
        assertEquals(0.0, AccurateMath.expm1(0.0));
    }

    @Test
    void testExpm1_PositiveGreaterThanOne() {
        assertEquals(Math.exp(2.0) - 1.0, AccurateMath.expm1(2.0), 1e-10);
    }

    @Test
    void testExpm1_NegativeGreaterThanOne() {
        assertEquals(Math.exp(-2.0) - 1.0, AccurateMath.expm1(-2.0), 1e-10);
    }

    @Test
    void testExpm1_PositiveLessThanOne() {
        assertEquals(Math.expm1(0.5), AccurateMath.expm1(0.5), 1e-10);
    }

    @Test
    void testExpm1_NegativeLessThanOne() {
        assertEquals(Math.expm1(-0.5), AccurateMath.expm1(-0.5), 1e-10);
    }

    @Test
    void testExpm1_PositiveEdgeCase() {
        assertEquals(Math.expm1(1.0), AccurateMath.expm1(1.0), 1e-10);
    }

    @Test
    void testExpm1_NegativeEdgeCase() {
        assertEquals(Math.expm1(-1.0), AccurateMath.expm1(-1.0), 1e-10);
    }
}