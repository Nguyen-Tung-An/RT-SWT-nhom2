package org.apache.commons.math4.core.jdkmath;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccurateMathTest {

    @Test
    void testExpm1_NaN() throws Exception {
        Method m = AccurateMath.class.getDeclaredMethod("expm1", double.class, double[].class);
        m.setAccessible(true);
        double[] hiPrecOut = new double[2];
        Object result = m.invoke(null, Double.NaN, hiPrecOut);
        assertEquals(Double.NaN, result);
    }

    @Test
    void testExpm1_Zero() throws Exception {
        Method m = AccurateMath.class.getDeclaredMethod("expm1", double.class, double[].class);
        m.setAccessible(true);
        double[] hiPrecOut = new double[2];
        Object result = m.invoke(null, 0.0, hiPrecOut);
        assertEquals(0.0, result);
    }

    @Test
    void testExpm1_PositiveLarge() throws Exception {
        Method m = AccurateMath.class.getDeclaredMethod("expm1", double.class, double[].class);
        m.setAccessible(true);
        double[] hiPrecOut = new double[2];
        Object result = m.invoke(null, 10.0, hiPrecOut);
        assertEquals(Math.exp(10.0) - 1.0, result, 1e-10);
    }

    @Test
    void testExpm1_NegativeLarge() throws Exception {
        Method m = AccurateMath.class.getDeclaredMethod("expm1", double.class, double[].class);
        m.setAccessible(true);
        double[] hiPrecOut = new double[2];
        Object result = m.invoke(null, -10.0, hiPrecOut);
        assertEquals(Math.exp(-10.0) - 1.0, result, 1e-10);
    }

    @Test
    void testExpm1_PositiveSmall() throws Exception {
        Method m = AccurateMath.class.getDeclaredMethod("expm1", double.class, double[].class);
        m.setAccessible(true);
        double[] hiPrecOut = new double[2];
        Object result = m.invoke(null, 0.1, hiPrecOut);
        assertEquals(Math.expm1(0.1), result, 1e-10);
    }

    @Test
    void testExpm1_NegativeSmall() throws Exception {
        Method m = AccurateMath.class.getDeclaredMethod("expm1", double.class, double[].class);
        m.setAccessible(true);
        double[] hiPrecOut = new double[2];
        Object result = m.invoke(null, -0.1, hiPrecOut);
        assertEquals(Math.expm1(-0.1), result, 1e-10);
    }

    @Test
    void testExpm1_PositiveBoundary() throws Exception {
        Method m = AccurateMath.class.getDeclaredMethod("expm1", double.class, double[].class);
        m.setAccessible(true);
        double[] hiPrecOut = new double[2];
        Object result = m.invoke(null, 1.0, hiPrecOut);
        assertEquals(Math.expm1(1.0), result, 1e-10);
    }

    @Test
    void testExpm1_NegativeBoundary() throws Exception {
        Method m = AccurateMath.class.getDeclaredMethod("expm1", double.class, double[].class);
        m.setAccessible(true);
        double[] hiPrecOut = new double[2];
        Object result = m.invoke(null, -1.0, hiPrecOut);
        assertEquals(Math.expm1(-1.0), result, 1e-10);
    }
}