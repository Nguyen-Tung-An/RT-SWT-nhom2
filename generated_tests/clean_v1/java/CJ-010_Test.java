package org.apache.commons.math4.legacy.core.dfp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DfpTest {

    @Test
    void testEquals_SameInstance() {
        Dfp dfp1 = new Dfp(1.0);
        assertTrue(dfp1.equals(dfp1));
    }

    @Test
    void testEquals_DifferentInstances_Equal() {
        Dfp dfp1 = new Dfp(1.0);
        Dfp dfp2 = new Dfp(1.0);
        assertTrue(dfp1.equals(dfp2));
    }

    @Test
    void testEquals_DifferentInstances_NotEqual() {
        Dfp dfp1 = new Dfp(1.0);
        Dfp dfp2 = new Dfp(2.0);
        assertFalse(dfp1.equals(dfp2));
    }

    @Test
    void testEquals_NaN() {
        Dfp dfp1 = new Dfp(Double.NaN);
        Dfp dfp2 = new Dfp(1.0);
        assertFalse(dfp1.equals(dfp2));
    }

    @Test
    void testEquals_AnotherObject() {
        Object obj = new Object();
        Dfp dfp = new Dfp(1.0);
        assertFalse(dfp.equals(obj));
    }

    @Test
    void testEquals_DifferentRadixDigits() {
        Dfp dfp1 = new Dfp(1.0, 10); // Assuming constructor takes value and radix
        Dfp dfp2 = new Dfp(1.0, 2);
        assertFalse(dfp1.equals(dfp2));
    }
}