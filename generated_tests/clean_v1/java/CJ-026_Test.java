package org.apache.commons.math4.core.jdkmath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccurateMathTest {
    @Test
    void testAsin_NaN() {
        assertTrue(Double.isNaN(AccurateMath.asin(Double.NaN)));
    }

    @Test
    void testAsin_AboveOne() {
        assertTrue(Double.isNaN(AccurateMath.asin(1.1)));
    }

    @Test
    void testAsin_BelowNegativeOne() {
        assertTrue(Double.isNaN(AccurateMath.asin(-1.1)));
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
        assertEquals(Math.asin(0.5), AccurateMath.asin(0.5), 1e-10);
    }

    @Test
    void testAsin_NegativeValue() {
        assertEquals(Math.asin(-0.5), AccurateMath.asin(-0.5), 1e-10);
    }
}