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
    void testTanh_NegativeValue() {
        double result = AccurateMath.tanh(-0.5);
        assertEquals(-0.46211715726000974, result, 1e-15);
    }

    @Test
    void testTanh_PositiveValue() {
        double result = AccurateMath.tanh(0.5);
        assertEquals(0.46211715726000974, result, 1e-15);
    }

    @Test
    void testTanh_LargePositiveValue() {
        double result = AccurateMath.tanh(20.0);
        assertEquals(1.0, result);
    }

    @Test
    void testTanh_LargeNegativeValue() {
        double result = AccurateMath.tanh(-20.0);
        assertEquals(-1.0, result);
    }

    @Test
    void testTanh_BoundaryValue() {
        double result = AccurateMath.tanh(0.49999999999999994);
        assertEquals(0.46211715726000974, result, 1e-15);
    }

    @Test
    void testTanh_BoundaryValueAbove() {
        double result = AccurateMath.tanh(0.5000000000000001);
        assertEquals(0.46211715726000974, result, 1e-15);
    }
}