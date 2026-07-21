import org.apache.commons.math4.legacy.core.dfp.Dfp;
import org.apache.commons.math4.legacy.core.dfp.DfpField;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DfpTest {

    @Test
    void testDfpConstructorPositiveValue() {
        DfpField field = DfpField.getDefault();
        double value = 1.0;
        Dfp dfp = new Dfp(field, value);
        assertEquals(value, dfp.getValue(), "The Dfp value should match the input value.");
    }

    @Test
    void testDfpConstructorNegativeValue() {
        DfpField field = DfpField.getDefault();
        double value = -1.0;
        Dfp dfp = new Dfp(field, value);
        assertEquals(value, dfp.getValue(), "The Dfp value should match the input value.");
    }

    @Test
    void testDfpConstructorZeroValue() {
        DfpField field = DfpField.getDefault();
        double value = 0.0;
        Dfp dfp = new Dfp(field, value);
        assertEquals(value, dfp.getValue(), "The Dfp value should match the input value.");
    }

    @Test
    void testDfpConstructorBoundaryValue() {
        DfpField field = DfpField.getDefault();
        double value = Double.MAX_VALUE;
        Dfp dfp = new Dfp(field, value);
        assertEquals(value, dfp.getValue(), "The Dfp value should match the input value.");
    }

    @Test
    void testDfpConstructorNaNValue() {
        DfpField field = DfpField.getDefault();
        double value = Double.NaN;
        Dfp dfp = new Dfp(field, value);
        assertEquals(value, dfp.getValue(), "The Dfp value should match the input value.");
    }

    @Test
    void testDfpConstructorInfinityValue() {
        DfpField field = DfpField.getDefault();
        double value = Double.POSITIVE_INFINITY;
        Dfp dfp = new Dfp(field, value);
        assertEquals(value, dfp.getValue(), "The Dfp value should match the input value.");
    }

    @Test
    void testDfpConstructorNegativeInfinityValue() {
        DfpField field = DfpField.getDefault();
        double value = Double.NEGATIVE_INFINITY;
        Dfp dfp = new Dfp(field, value);
        assertEquals(value, dfp.getValue(), "The Dfp value should match the input value.");
    }
}