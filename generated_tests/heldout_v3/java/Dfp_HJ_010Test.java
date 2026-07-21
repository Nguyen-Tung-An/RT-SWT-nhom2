import org.apache.commons.math4.legacy.core.dfp.Dfp;
import org.apache.commons.math4.legacy.core.dfp.DfpField;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DfpTest {

    private final DfpField field = DfpField.getDefault();

    @Test
    void testZeroPositive() {
        Dfp dfp = new Dfp(field, 0.0);
        assertEquals(1, dfp.sign);
        assertEquals(0, dfp.exp);
        assertEquals(Dfp.FINITE, dfp.nans);
    }

    @Test
    void testZeroNegative() {
        Dfp dfp = new Dfp(field, -0.0);
        assertEquals(-1, dfp.sign);
        assertEquals(0, dfp.exp);
        assertEquals(Dfp.FINITE, dfp.nans);
    }

    @Test
    void testSubnormalPositive() {
        Dfp dfp = new Dfp(field, 1.0e-300);
        assertEquals(1, dfp.sign);
        assertEquals(-1022, dfp.exp); // Expecting normalized exponent
        assertEquals(Dfp.FINITE, dfp.nans);
    }

    @Test
    void testSubnormalNegative() {
        Dfp dfp = new Dfp(field, -1.0e-300);
        assertEquals(-1, dfp.sign);
        assertEquals(-1022, dfp.exp); // Expecting normalized exponent
        assertEquals(Dfp.FINITE, dfp.nans);
    }

    @Test
    void testNormalPositive() {
        Dfp dfp = new Dfp(field, 1.0);
        assertEquals(1, dfp.sign);
        assertEquals(0, dfp.exp);
        assertEquals(Dfp.FINITE, dfp.nans);
    }

    @Test
    void testNormalNegative() {
        Dfp dfp = new Dfp(field, -1.0);
        assertEquals(-1, dfp.sign);
        assertEquals(0, dfp.exp);
        assertEquals(Dfp.FINITE, dfp.nans);
    }

    @Test
    void testInfinityPositive() {
        Dfp dfp = new Dfp(field, Double.POSITIVE_INFINITY);
        assertEquals(1, dfp.sign);
        assertEquals(0, dfp.exp);
        assertEquals(Dfp.INFINITE, dfp.nans);
    }

    @Test
    void testInfinityNegative() {
        Dfp dfp = new Dfp(field, Double.NEGATIVE_INFINITY);
        assertEquals(-1, dfp.sign);
        assertEquals(0, dfp.exp);
        assertEquals(Dfp.INFINITE, dfp.nans);
    }

    @Test
    void testNaN() {
        Dfp dfp = new Dfp(field, Double.NaN);
        assertEquals(1, dfp.sign);
        assertEquals(0, dfp.exp);
        assertEquals(Dfp.QNAN, dfp.nans);
    }
}