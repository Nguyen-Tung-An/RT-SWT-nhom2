package org.apache.commons.math4.core.jdkmath;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AccurateMathTest {

    @Test
    public void testLog1pNegativeOne() {
        double result = AccurateMath.log1p(-1);
        assertEquals(Double.NEGATIVE_INFINITY, result);
    }

    @Test
    public void testLog1pPositiveInfinity() {
        double result = AccurateMath.log1p(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    public void testLog1pSmallPositive() {
        double result = AccurateMath.log1p(1e-7);
        assertEquals(1e-7, result, 1e-10);
    }

    @Test
    public void testLog1pSmallNegative() {
        double result = AccurateMath.log1p(-1e-7);
        assertEquals(-1e-7, result, 1e-10);
    }

    @Test
    public void testLog1pLargePositive() {
        double result = AccurateMath.log1p(1.0);
        assertEquals(Math.log(2.0), result, 1e-10);
    }

    @Test
    public void testLog1pLargeNegative() {
        double result = AccurateMath.log1p(-0.5);
        assertEquals(Math.log(0.5), result, 1e-10);
    }
}