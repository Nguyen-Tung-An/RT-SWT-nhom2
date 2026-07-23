package org.apache.commons.math4.core.jdkmath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccurateMathTest {
    @Test
    void testAsin_NaN() {
        assertEquals(Double.NaN, AccurateMath.asin(Double.NaN));
    }

    @Test
    void testAsin_AboveOne() {
        assertEquals(Double.NaN, AccurateMath.asin(1.1));
    }

    @Test
    void testAsin_BelowNegativeOne() {
        assertEquals(Double.NaN, AccurateMath.asin(-1.1));
    }

    @Test
    void testAsin_One() {
        assertEquals(Math.PI / 2.0, AccurateMath.asin(1.0));
    }

    @Test
    void testAsin_NegativeOne() {
        assertEquals(-Math.PI / 2.0, AccurateMath.asin(-1.0));
    }

    @Test
    void testAsin_Zero() {
        assertEquals(0.0, AccurateMath.asin(0.0));
    }

    @Test
    void testAsin_PositiveValue() {
        double value = 0.5;
        assertEquals(Math.asin(value), AccurateMath.asin(value), 1e-10);
    }

    @Test
    void testAsin_NegativeValue() {
        double value = -0.5;
        assertEquals(Math.asin(value), AccurateMath.asin(value), 1e-10);
    }
}