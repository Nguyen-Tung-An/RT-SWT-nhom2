package org.apache.commons.math4.legacy.core.dfp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DfpTest {

    @Test
    void testZeroPositive() {
        DfpField field = new DfpField(10);
        Dfp dfp = new Dfp(field, 0.0);
        assertEquals(1, dfp.sign);
        assertEquals(0, dfp.exp);
        assertEquals(Dfp.FINITE, dfp.nans);
    }

    @Test
    void testZeroNegative() {
        DfpField field = new DfpField(10);
        Dfp dfp = new Dfp(field, -0.0);
        assertEquals(-1, dfp.sign);
        assertEquals(0, dfp.exp);
        assertEquals(Dfp.FINITE, dfp.nans);
    }

    @Test
    void testSubnormal() {
        DfpField field = new DfpField(10);
        Dfp dfp = new Dfp(field, 1e-300);
        assertEquals(1, dfp.sign);
        assertTrue(dfp.exp < 0);
        assertEquals(Dfp.FINITE, dfp.nans);
    }

    @Test
    void testNormal() {
        DfpField field = new DfpField(10);
        Dfp dfp = new Dfp(field, 123.456);
        assertEquals(1, dfp.sign);
        assertTrue(dfp.exp > 0);
        assertEquals(Dfp.FINITE, dfp.nans);
    }

    @Test
    void testInfinityPositive() {
        DfpField field = new DfpField(10);
        Dfp dfp = new Dfp(field, Double.POSITIVE_INFINITY);
        assertEquals(1, dfp.sign);
        assertEquals(0, dfp.exp);
        assertEquals(Dfp.INFINITE, dfp.nans);
    }

    @Test
    void testInfinityNegative() {
        DfpField field = new DfpField(10);
        Dfp dfp = new Dfp(field, Double.NEGATIVE_INFINITY);
        assertEquals(-1, dfp.sign);
        assertEquals(0, dfp.exp);
        assertEquals(Dfp.INFINITE, dfp.nans);
    }

    @Test
    void testNaN() {
        DfpField field = new DfpField(10);
        Dfp dfp = new Dfp(field, Double.NaN);
        assertEquals(1, dfp.sign);
        assertEquals(0, dfp.exp);
        assertEquals(Dfp.QNAN, dfp.nans);
    }
}