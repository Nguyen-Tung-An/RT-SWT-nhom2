package org.apache.commons.math4.core.jdkmath;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AccurateMathTest {

    @Test
    public void testAsin_NaN() {
        double result = AccurateMath.asin(Double.NaN);
        assertEquals(Double.NaN, result);
    }

    @Test
    public void testAsin_OutOfBoundsPositive() {
        double result = AccurateMath.asin(2.0);
        assertEquals(Double.NaN, result);
    }

    @Test
    public void testAsin_OutOfBoundsNegative() {
        double result = AccurateMath.asin(-2.0);
        assertEquals(Double.NaN, result);
    }

    @Test
    public void testAsin_One() {
        double result = AccurateMath.asin(1.0);
        assertEquals(Math.PI / 2.0, result);
    }

    @Test
    public void testAsin_NegativeOne() {
        double result = AccurateMath.asin(-1.0);
        assertEquals(-Math.PI / 2.0, result);
    }

    @Test
    public void testAsin_Zero() {
        double result = AccurateMath.asin(0.0);
        assertEquals(0.0, result);
    }

    @Test
    public void testAsin_PositiveValue() {
        double result = AccurateMath.asin(0.5);
        assertEquals(Math.asin(0.5), result, 1e-10);
    }

    @Test
    public void testAsin_NegativeValue() {
        double result = AccurateMath.asin(-0.5);
        assertEquals(Math.asin(-0.5), result, 1e-10);
    }
}