package org.apache.commons.math4.core.jdkmath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccurateMathTest {

    @Test
    void testTanh_NaN() {
        assertTrue(Double.isNaN(AccurateMath.tanh(Double.NaN)));
    }

    @Test
    void testTanh_PositiveInfinity() {
        assertEquals(1.0, AccurateMath.tanh(Double.POSITIVE_INFINITY));
    }

    @Test
    void testTanh_NegativeInfinity() {
        assertEquals(-1.0, AccurateMath.tanh(Double.NEGATIVE_INFINITY));
    }

    @Test
    void testTanh_Zero() {
        assertEquals(0.0, AccurateMath.tanh(0.0));
    }

    @Test
    void testTanh_PositiveSmall() {
        assertEquals(0.46211715726000974, AccurateMath.tanh(0.5), 1e-15);
    }

    @Test
    void testTanh_NegativeSmall() {
        assertEquals(-0.46211715726000974, AccurateMath.tanh(-0.5), 1e-15);
    }

    @Test
    void testTanh_PositiveLarge() {
        assertEquals(1.0, AccurateMath.tanh(21.0));
    }

    @Test
    void testTanh_NegativeLarge() {
        assertEquals(-1.0, AccurateMath.tanh(-21.0));
    }

    @Test
    void testTanh_PositiveValue() {
        assertEquals(0.7615941559557649, AccurateMath.tanh(1.0), 1e-15);
    }

    @Test
    void testTanh_NegativeValue() {
        assertEquals(-0.7615941559557649, AccurateMath.tanh(-1.0), 1e-15);
    }
}