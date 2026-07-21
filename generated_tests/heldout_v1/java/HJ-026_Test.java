package org.apache.commons.math4.legacy.analysis.polynomials;

import org.apache.commons.math4.exception.DimensionMismatchException;
import org.apache.commons.math4.exception.NullArgumentException;
import org.apache.commons.math4.exception.NumberIsTooSmallException;
import org.apache.commons.math4.exception.NonMonotonicSequenceException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PolynomialSplineFunctionTest {

    @Test
    void testConstructor_NullKnots() {
        assertThrows(NullArgumentException.class, () -> {
            new PolynomialSplineFunction(null, new PolynomialFunction[]{});
        });
    }

    @Test
    void testConstructor_NullPolynomials() {
        assertThrows(NullArgumentException.class, () -> {
            new PolynomialSplineFunction(new double[]{0, 1}, null);
        });
    }

    @Test
    void testConstructor_InsufficientKnots() {
        assertThrows(NumberIsTooSmallException.class, () -> {
            new PolynomialSplineFunction(new double[]{0}, new PolynomialFunction[]{new PolynomialFunction(new double[]{1})});
        });
    }

    @Test
    void testConstructor_DimensionMismatch() {
        assertThrows(DimensionMismatchException.class, () -> {
            new PolynomialSplineFunction(new double[]{0, 1}, new PolynomialFunction[]{new PolynomialFunction(new double[]{1}), new PolynomialFunction(new double[]{2})});
        });
    }

    @Test
    void testConstructor_NonMonotonicKnots() {
        assertThrows(NonMonotonicSequenceException.class, () -> {
            new PolynomialSplineFunction(new double[]{1, 0}, new PolynomialFunction[]{new PolynomialFunction(new double[]{1})});
        });
    }

    @Test
    void testConstructor_ValidInput() {
        double[] knots = {0, 1, 2};
        PolynomialFunction[] polynomials = {new PolynomialFunction(new double[]{1}), new PolynomialFunction(new double[]{2})};
        PolynomialSplineFunction splineFunction = new PolynomialSplineFunction(knots, polynomials);
        assertNotNull(splineFunction);
    }
}