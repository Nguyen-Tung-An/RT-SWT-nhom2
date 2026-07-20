import org.apache.commons.math4.core.jdkmath.AccurateMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccurateMathTest {

    @Test
    void testCbrtZero() {
        double result = AccurateMath.cbrt(0.0);
        assertEquals(0.0, result, 1e-10);
    }

    @Test
    void testCbrtPositiveNumber() {
        double result = AccurateMath.cbrt(27.0);
        assertEquals(3.0, result, 1e-10);
    }

    @Test
    void testCbrtNegativeNumber() {
        double result = AccurateMath.cbrt(-27.0);
        assertEquals(-3.0, result, 1e-10);
    }

    @Test
    void testCbrtOne() {
        double result = AccurateMath.cbrt(1.0);
        assertEquals(1.0, result, 1e-10);
    }

    @Test
    void testCbrtTwo() {
        double result = AccurateMath.cbrt(8.0);
        assertEquals(2.0, result, 1e-10);
    }

    @Test
    void testCbrtInfinity() {
        double result = AccurateMath.cbrt(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void testCbrtNaN() {
        double result = AccurateMath.cbrt(Double.NaN);
        assertEquals(Double.NaN, result);
    }

    @Test
    void testCbrtSubnormal() {
        double result = AccurateMath.cbrt(1.0e-300);
        assertEquals(Math.cbrt(1.0e-300), result, 1e-10);
    }

    @Test
    void testCbrtLargeNumber() {
        double result = AccurateMath.cbrt(1.0e+300);
        assertEquals(Math.cbrt(1.0e+300), result, 1e-10);
    }
}