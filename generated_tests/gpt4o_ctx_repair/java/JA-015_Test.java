package org.apache.commons.math4.core.jdkmath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccurateMathTest {
    @Test
    void testLog1p_NegativeOne() {
        assertEquals(Double.NEGATIVE_INFINITY, AccurateMath.log1p(-1), 1e-10);
    }

    @Test
    void testLog1p_PositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, AccurateMath.log1p(Double.POSITIVE_INFINITY), 1e-10);
    }

    @Test
    void testLog1p_GreaterThanThreshold() {
        assertEquals(Math.log(1 + 1e-5), AccurateMath.log1p(1e-5), 1e-10);
    }

    @Test
    void testLog1p_LessThanNegativeThreshold() {
        assertEquals(Math.log(1 - 1e-5), AccurateMath.log1p(-1e-5), 1e-10);
    }

    @Test
    void testLog1p_Zero() {
        assertEquals(0, AccurateMath.log1p(0), 1e-10);
    }

    @Test
    void testLog1p_SmallPositive() {
        assertEquals(1e-5, AccurateMath.log1p(1e-5), 1e-10);
    }

    @Test
    void testLog1p_SmallNegative() {
        assertEquals(-1e-5, AccurateMath.log1p(-1e-5), 1e-10);
    }
}