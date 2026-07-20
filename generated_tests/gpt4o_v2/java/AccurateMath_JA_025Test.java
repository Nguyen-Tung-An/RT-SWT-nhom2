import org.apache.commons.math4.core.jdkmath.AccurateMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccurateMathTest {

    @Test
    void testCosh_NaN() {
        double result = AccurateMath.cosh(Double.NaN);
        assertEquals(Double.NaN, result);
    }

    @Test
    void testCosh_PositiveInfinity() {
        double result = AccurateMath.cosh(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void testCosh_NegativeInfinity() {
        double result = AccurateMath.cosh(Double.NEGATIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void testCosh_Zero() {
        double result = AccurateMath.cosh(0.0);
        assertEquals(1.0, result);
    }

    @Test
    void testCosh_PositiveSmallValue() {
        double result = AccurateMath.cosh(1.0);
        assertEquals(1.5430806348152437, result, 1e-15);
    }

    @Test
    void testCosh_NegativeSmallValue() {
        double result = AccurateMath.cosh(-1.0);
        assertEquals(1.5430806348152437, result, 1e-15);
    }

    @Test
    void testCosh_PositiveLargeValue() {
        double result = AccurateMath.cosh(21.0);
        assertEquals(1.1252569301383285E9, result, 1e-15);
    }

    @Test
    void testCosh_NegativeLargeValue() {
        double result = AccurateMath.cosh(-21.0);
        assertEquals(1.1252569301383285E9, result, 1e-15);
    }

    @Test
    void testCosh_PositiveExtremeValue() {
        double result = AccurateMath.cosh(709.0);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void testCosh_NegativeExtremeValue() {
        double result = AccurateMath.cosh(-709.0);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }
}