package org.apache.commons.math4.core.jdkmath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccurateMathTest {
    @Test
    void testSinh_NaN() {
        assertTrue(Double.isNaN(AccurateMath.sinh(Double.NaN)));
    }

    @Test
    void testSinh_PositiveLarge() {
        assertEquals(Double.POSITIVE_INFINITY, AccurateMath.sinh(25), 1e-10);
    }

    @Test
    void testSinh_NegativeLarge() {
        assertEquals(Double.NEGATIVE_INFINITY, AccurateMath.sinh(-25), 1e-10);
    }

    @Test
    void testSinh_Zero() {
        assertEquals(0.0, AccurateMath.sinh(0), 1e-10);
    }

    @Test
    void testSinh_PositiveSmall() {
        assertEquals(0.521095305493747, AccurateMath.sinh(0.5), 1e-10);
    }

    @Test
    void testSinh_NegativeSmall() {
        assertEquals(-0.521095305493747, AccurateMath.sinh(-0.5), 1e-10);
    }

    @Test
    void testSinh_PositiveBoundary() {
        assertEquals(0.5 * Math.exp(0.25), AccurateMath.sinh(0.25), 1e-10);
    }

    @Test
    void testSinh_NegativeBoundary() {
        assertEquals(-0.5 * Math.exp(-0.25), AccurateMath.sinh(-0.25), 1e-10);
    }
}