import org.apache.commons.math4.core.jdkmath.AccurateMath;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AccurateMathTest {

    @Test
    void testExpm1_NaN() {
        double[] hiPrecOut = new double[2];
        double result = AccurateMath.expm1(Double.NaN, hiPrecOut);
        assertEquals(Double.NaN, result);
    }

    @Test
    void testExpm1_Zero() {
        double[] hiPrecOut = new double[2];
        double result = AccurateMath.expm1(0.0, hiPrecOut);
        assertEquals(0.0, result);
    }

    @Test
    void testExpm1_PositiveLarge() {
        double[] hiPrecOut = new double[2];
        double result = AccurateMath.expm1(2.0, hiPrecOut);
        assertEquals(Math.exp(2.0) - 1.0, result, 1e-10);
    }

    @Test
    void testExpm1_NegativeLarge() {
        double[] hiPrecOut = new double[2];
        double result = AccurateMath.expm1(-2.0, hiPrecOut);
        assertEquals(Math.exp(-2.0) - 1.0, result, 1e-10);
    }

    @Test
    void testExpm1_PositiveSmall() {
        double[] hiPrecOut = new double[2];
        double result = AccurateMath.expm1(0.1, hiPrecOut);
        assertEquals(Math.expm1(0.1), result, 1e-10);
    }

    @Test
    void testExpm1_NegativeSmall() {
        double[] hiPrecOut = new double[2];
        double result = AccurateMath.expm1(-0.1, hiPrecOut);
        assertEquals(Math.expm1(-0.1), result, 1e-10);
    }

    @Test
    void testExpm1_PositiveBoundary() {
        double[] hiPrecOut = new double[2];
        double result = AccurateMath.expm1(1.0, hiPrecOut);
        assertEquals(Math.exp(1.0) - 1.0, result, 1e-10);
    }

    @Test
    void testExpm1_NegativeBoundary() {
        double[] hiPrecOut = new double[2];
        double result = AccurateMath.expm1(-1.0, hiPrecOut);
        assertEquals(Math.exp(-1.0) - 1.0, result, 1e-10);
    }
}