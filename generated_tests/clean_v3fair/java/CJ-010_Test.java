package org.apache.commons.math4.legacy.core.dfp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DfpTest {

    @Test
    void testEquals_SameInstance() {
        Dfp dfp = new Dfp(1.0);
        assertTrue(dfp.equals(dfp));
    }

    @Test
    void testEquals_DifferentType() {
        Dfp dfp = new Dfp(1.0);
        assertFalse(dfp.equals("Not a Dfp"));
    }

    @Test
    void testEquals_NaN() {
        Dfp dfp1 = new Dfp(Double.NaN);
        Dfp dfp2 = new Dfp(1.0);
        assertFalse(dfp1.equals(dfp2));
    }

    @Test
    void testEquals_DifferentRadixDigits() {
        Dfp dfp1 = new Dfp(1.0, 10);
        Dfp dfp2 = new Dfp(1.0, 5);
        assertFalse(dfp1.equals(dfp2));
    }

    @Test
    void testEquals_EqualDfp() {
        Dfp dfp1 = new Dfp(1.0);
        Dfp dfp2 = new Dfp(1.0);
        assertTrue(dfp1.equals(dfp2));
    }

    @Test
    void testEquals_NotEqualDfp() {
        Dfp dfp1 = new Dfp(1.0);
        Dfp dfp2 = new Dfp(2.0);
        assertFalse(dfp1.equals(dfp2));
    }
}