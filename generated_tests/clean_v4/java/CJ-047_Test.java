import org.apache.commons.math4.legacy.core.dfp.Dfp;
import org.apache.commons.math4.legacy.core.dfp.DfpField;
import org.apache.commons.math4.legacy.core.dfp.DfpMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DfpMathTest {

    @Test
    public void testLogPositiveValue() {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(2.0);
        Dfp result = DfpMath.log(a);
        assertEquals(field.newDfp(Math.log(2.0)), result);
    }

    @Test
    public void testLogOne() {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(1.0);
        Dfp result = DfpMath.log(a);
        assertEquals(field.newDfp(0.0), result);
    }

    @Test
    public void testLogZero() {
        DfpField field = new DfpField(10);
        Dfp a = field.getZero();
        Dfp result = DfpMath.log(a);
        assertEquals(a, result);
        assertEquals(DfpField.FLAG_INVALID, field.getIEEEFlagsBits());
    }

    @Test
    public void testLogNegativeValue() {
        DfpField field = new DfpField(10);
        Dfp a = field.newDfp(-1.0);
        Dfp result = DfpMath.log(a);
        assertEquals(a, result);
        assertEquals(DfpField.FLAG_INVALID, field.getIEEEFlagsBits());
    }

    @Test
    public void testLogNaN() {
        DfpField field = new DfpField(10);
        Dfp a = field.newInstance(Double.NaN);
        Dfp result = DfpMath.log(a);
        assertEquals(a, result);
        assertEquals(DfpField.FLAG_INVALID, field.getIEEEFlagsBits());
    }

    @Test
    public void testLogInfinite() {
        DfpField field = new DfpField(10);
        Dfp a = field.getInfinity();
        Dfp result = DfpMath.log(a);
        assertEquals(a, result);
    }
}