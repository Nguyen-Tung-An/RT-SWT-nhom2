package org.apache.commons.math4.core.jdkmath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccurateMathTest {
    @Test
    void testCbrt_Positive() {
        assertEquals(3.0, AccurateMath.cbrt(27.0), 1e-10);
    }

    @Test
    void testCbrt_Negative() {
        assertEquals(-3.0, AccurateMath.cbrt(-27.0), 1e-10);
    }

    @Test
    void testCbrt_Zero() {
        assertEquals(0.0, AccurateMath.cbrt(0.0), 1e-10);
    }

    @Test
    void testCbrt_Subnormal() {
        assertEquals(1.0, AccurateMath.cbrt(1.0e-10), 1e-10);
    }

    @Test
    void testCbrt_NaN() {
        assertTrue(Double.isNaN(AccurateMath.cbrt(Double.NaN)));
    }

    @Test
    void testCbrt_PositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, AccurateMath.cbrt(Double.POSITIVE_INFINITY));
    }

    @Test
    void testCbrt_NegativeInfinity() {
        assertEquals(Double.NEGATIVE_INFINITY, AccurateMath.cbrt(Double.NEGATIVE_INFINITY));
    }
}