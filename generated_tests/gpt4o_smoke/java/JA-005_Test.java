package org.apache.commons.math4.core.jdkmath;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AccurateMathTest {

    @Test
    void testCbrtZero() {
        double result = AccurateMath.cbrt(0.0);
        assertEquals(0.0, result, 1e-10);
    }

    @Test
    void testCbrtPositive() {
        double result = AccurateMath.cbrt(27.0);
        assertEquals(3.0, result, 1e-10);
    }

    @Test
    void testCbrtNegative() {
        double result = AccurateMath.cbrt(-27.0);
        assertEquals(-3.0, result, 1e-10);
    }

    @Test
    void testCbrtOne() {
        double result = AccurateMath.cbrt(1.0);
        assertEquals(1.0, result, 1e-10);
    }

    @Test
    void testCbrtSubnormal() {
        double result = AccurateMath.cbrt(Double.MIN_VALUE);
        assertEquals(0.0, result, 1e-10);
    }

    @Test
    void testCbrtInfinity() {
        double result = AccurateMath.cbrt(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, result, 1e-10);
    }

    @Test
    void testCbrtNaN() {
        double result = AccurateMath.cbrt(Double.NaN);
        assertEquals(Double.NaN, result, 1e-10);
    }

    @Test
    void testCbrtLargeNumber() {
        double result = AccurateMath.cbrt(1e+30);
        assertEquals(1e+10, result, 1e-10);
    }

    @Test
    void testCbrtNegativeLargeNumber() {
        double result = AccurateMath.cbrt(-1e+30);
        assertEquals(-1e+10, result, 1e-10);
    }
}