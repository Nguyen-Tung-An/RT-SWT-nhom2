package org.apache.commons.math4.core.jdkmath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccurateMathTest {
    @Test
    void testLog1p_NegativeInfinity() {
        assertEquals(Double.NEGATIVE_INFINITY, AccurateMath.log1p(-1));
    }

    @Test
    void testLog1p_PositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, AccurateMath.log1p(Double.POSITIVE_INFINITY));
    }

    @Test
    void testLog1p_GreaterThanThreshold() {
        assertEquals(0.6931471805599453, AccurateMath.log1p(0.5), 1e-10);
    }

    @Test
    void testLog1p_LessThanNegativeThreshold() {
        assertEquals(-0.6931471805599453, AccurateMath.log1p(-0.5), 1e-10);
    }

    @Test
    void testLog1p_SmallPositiveValue() {
        assertEquals(0.000500000041666667, AccurateMath.log1p(0.0005), 1e-10);
    }

    @Test
    void testLog1p_SmallNegativeValue() {
        assertEquals(-0.000500000041666667, AccurateMath.log1p(-0.0005), 1e-10);
    }

    @Test
    void testLog1p_Zero() {
        assertEquals(0.0, AccurateMath.log1p(0), 1e-10);
    }
}