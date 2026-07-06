package org.apache.commons.math4.core.jdkmath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccurateMathTest {
    @Test
    void testCosh_NaN() {
        assertTrue(Double.isNaN(AccurateMath.cosh(Double.NaN)));
    }

    @Test
    void testCosh_PositiveLarge() {
        assertEquals(Double.POSITIVE_INFINITY, AccurateMath.cosh(21), 1e-10);
    }

    @Test
    void testCosh_NegativeLarge() {
        assertEquals(Double.POSITIVE_INFINITY, AccurateMath.cosh(-21), 1e-10);
    }

    @Test
    void testCosh_PositiveSmall() {
        assertEquals(1.5430806348152437, AccurateMath.cosh(1), 1e-10);
    }

    @Test
    void testCosh_NegativeSmall() {
        assertEquals(1.5430806348152437, AccurateMath.cosh(-1), 1e-10);
    }

    @Test
    void testCosh_Zero() {
        assertEquals(1.0, AccurateMath.cosh(0), 1e-10);
    }

    @Test
    void testCosh_PositiveBoundary() {
        assertEquals(1.0, AccurateMath.cosh(20), 1e-10);
    }

    @Test
    void testCosh_NegativeBoundary() {
        assertEquals(1.0, AccurateMath.cosh(-20), 1e-10);
    }
}