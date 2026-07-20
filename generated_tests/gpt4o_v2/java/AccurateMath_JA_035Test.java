import org.apache.commons.math4.core.jdkmath.AccurateMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccurateMathTest {

    @Test
    void testTanh_NaN() {
        double result = AccurateMath.tanh(Double.NaN);
        assertEquals(Double.NaN, result);
    }

    @Test
    void testTanh_PositiveInfinity() {
        double result = AccurateMath.tanh(21.0);
        assertEquals(1.0, result);
    }

    @Test
    void testTanh_NegativeInfinity() {
        double result = AccurateMath.tanh(-21.0);
        assertEquals(-1.0, result);
    }

    @Test
    void testTanh_Zero() {
        double result = AccurateMath.tanh(0.0);
        assertEquals(0.0, result);
    }

    @Test
    void testTanh_PositiveSmallValue() {
        double result = AccurateMath.tanh(0.1);
        assertEquals(0.09966799462495582, result, 1e-10);
    }

    @Test
    void testTanh_NegativeSmallValue() {
        double result = AccurateMath.tanh(-0.1);
        assertEquals(-0.09966799462495582, result, 1e-10);
    }

    @Test
    void testTanh_PositiveMediumValue() {
        double result = AccurateMath.tanh(0.5);
        assertEquals(0.46211715726000974, result, 1e-10);
    }

    @Test
    void testTanh_NegativeMediumValue() {
        double result = AccurateMath.tanh(-0.5);
        assertEquals(-0.46211715726000974, result, 1e-10);
    }

    @Test
    void testTanh_PositiveBoundaryValue() {
        double result = AccurateMath.tanh(20.0);
        assertEquals(1.0, result);
    }

    @Test
    void testTanh_NegativeBoundaryValue() {
        double result = AccurateMath.tanh(-20.0);
        assertEquals(-1.0, result);
    }
}