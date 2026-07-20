import org.apache.commons.math4.core.jdkmath.AccurateMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccurateMathTest {

    @Test
    void testLog1pNegativeOne() {
        double result = AccurateMath.log1p(-1);
        assertEquals(Double.NEGATIVE_INFINITY, result);
    }

    @Test
    void testLog1pPositiveInfinity() {
        double result = AccurateMath.log1p(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    void testLog1pGreaterThanThreshold() {
        double result = AccurateMath.log1p(0.00001);
        assertEquals(0.00001, result, 1e-10);
    }

    @Test
    void testLog1pLessThanNegativeThreshold() {
        double result = AccurateMath.log1p(-0.00001);
        assertEquals(-0.00001, result, 1e-10);
    }

    @Test
    void testLog1pZero() {
        double result = AccurateMath.log1p(0);
        assertEquals(0, result);
    }

    @Test
    void testLog1pSmallPositiveValue() {
        double result = AccurateMath.log1p(1e-7);
        assertEquals(1e-7, result, 1e-10);
    }

    @Test
    void testLog1pSmallNegativeValue() {
        double result = AccurateMath.log1p(-1e-7);
        assertEquals(-1e-7, result, 1e-10);
    }
}