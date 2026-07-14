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
        assertEquals(0.2554128118829954, AccurateMath.sinh(0.25), 1e-10);
    }

    @Test
    void testSinh_NegativeSmall() {
        assertEquals(-0.2554128118829954, AccurateMath.sinh(-0.25), 1e-10);
    }

    @Test
    void testSinh_PositiveMedium() {
        assertEquals(0.8686709614860095, AccurateMath.sinh(1), 1e-10);
    }

    @Test
    void testSinh_NegativeMedium() {
        assertEquals(-0.8686709614860095, AccurateMath.sinh(-1), 1e-10);
    }
}