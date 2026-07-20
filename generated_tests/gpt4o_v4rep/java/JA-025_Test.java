import org.apache.commons.math4.core.jdkmath.AccurateMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccurateMathTest {

    @Test
    public void testCosh_NaN() {
        double result = AccurateMath.cosh(Double.NaN);
        assertEquals(Double.NaN, result);
    }

    @Test
    public void testCosh_PositiveInfinity() {
        double result = AccurateMath.cosh(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    public void testCosh_NegativeInfinity() {
        double result = AccurateMath.cosh(Double.NEGATIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    public void testCosh_LargePositiveValue() {
        double result = AccurateMath.cosh(30.0);
        assertEquals(1.154822829245244e13, result, 1e-10);
    }

    @Test
    public void testCosh_LargeNegativeValue() {
        double result = AccurateMath.cosh(-30.0);
        assertEquals(1.154822829245244e13, result, 1e-10);
    }

    @Test
    public void testCosh_SmallPositiveValue() {
        double result = AccurateMath.cosh(0.5);
        assertEquals(1.1276259652063807, result, 1e-10);
    }

    @Test
    public void testCosh_SmallNegativeValue() {
        double result = AccurateMath.cosh(-0.5);
        assertEquals(1.1276259652063807, result, 1e-10);
    }

    @Test
    public void testCosh_BoundaryValue() {
        double result = AccurateMath.cosh(20.0);
        assertEquals(2.061153622438558e8, result, 1e-10);
    }

    @Test
    public void testCosh_NegativeBoundaryValue() {
        double result = AccurateMath.cosh(-20.0);
        assertEquals(2.061153622438558e8, result, 1e-10);
    }
}