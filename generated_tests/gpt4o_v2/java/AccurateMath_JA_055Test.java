import org.apache.commons.math4.core.jdkmath.AccurateMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccurateMathTest {

    @Test
    void testSinh_NaN() {
        double result = AccurateMath.sinh(Double.NaN);
        assertEquals(Double.NaN, result);
    }

    @Test
    void testSinh_PositiveInfinity() {
        double result = AccurateMath.sinh(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void testSinh_NegativeInfinity() {
        double result = AccurateMath.sinh(Double.NEGATIVE_INFINITY);
        assertEquals(Double.NEGATIVE_INFINITY, result);
    }

    @Test
    void testSinh_Zero() {
        double result = AccurateMath.sinh(0.0);
        assertEquals(0.0, result);
    }

    @Test
    void testSinh_PositiveSmallValue() {
        double result = AccurateMath.sinh(0.1);
        assertEquals(Math.sinh(0.1), result, 1e-10);
    }

    @Test
    void testSinh_NegativeSmallValue() {
        double result = AccurateMath.sinh(-0.1);
        assertEquals(Math.sinh(-0.1), result, 1e-10);
    }

    @Test
    void testSinh_PositiveMediumValue() {
        double result = AccurateMath.sinh(1.0);
        assertEquals(Math.sinh(1.0), result, 1e-10);
    }

    @Test
    void testSinh_NegativeMediumValue() {
        double result = AccurateMath.sinh(-1.0);
        assertEquals(Math.sinh(-1.0), result, 1e-10);
    }

    @Test
    void testSinh_PositiveLargeValue() {
        double result = AccurateMath.sinh(21.0);
        assertEquals(Math.sinh(21.0), result, 1e-10);
    }

    @Test
    void testSinh_NegativeLargeValue() {
        double result = AccurateMath.sinh(-21.0);
        assertEquals(Math.sinh(-21.0), result, 1e-10);
    }

    @Test
    void testSinh_PositiveVeryLargeValue() {
        double result = AccurateMath.sinh(Double.MAX_VALUE);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void testSinh_NegativeVeryLargeValue() {
        double result = AccurateMath.sinh(-Double.MAX_VALUE);
        assertEquals(Double.NEGATIVE_INFINITY, result);
    }
}