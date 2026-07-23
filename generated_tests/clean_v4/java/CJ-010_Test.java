import org.apache.commons.math4.legacy.core.dfp.Dfp;
import org.apache.commons.math4.legacy.core.dfp.DfpField;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DfpEqualsTest {

    private final DfpField field = new DfpField(10); // Example radix
    private final Dfp dfp1 = new Dfp(field, 5);
    private final Dfp dfp2 = new Dfp(field, 5);
    private final Dfp dfpNaN = new Dfp(field, (byte) 0); // Assuming this creates a NaN
    private final Dfp dfpDifferentRadix = new Dfp(new DfpField(2), 5); // Different radix

    @Test
    void testEquals_SameValue() {
        assertTrue(dfp1.equals(dfp2));
    }

    @Test
    void testEquals_NaN() {
        assertFalse(dfp1.equals(dfpNaN));
        assertFalse(dfpNaN.equals(dfp1));
    }

    @Test
    void testEquals_DifferentRadix() {
        assertFalse(dfp1.equals(dfpDifferentRadix));
        assertFalse(dfpDifferentRadix.equals(dfp1));
    }

    @Test
    void testEquals_NonDfpObject() {
        assertFalse(dfp1.equals(new Object()));
    }

    @Test
    void testEquals_Null() {
        assertFalse(dfp1.equals(null));
    }
}