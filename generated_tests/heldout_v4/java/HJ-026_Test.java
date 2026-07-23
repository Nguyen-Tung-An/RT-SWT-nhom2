import org.apache.commons.math4.legacy.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math4.legacy.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math4.exception.DimensionMismatchException;
import org.apache.commons.math4.exception.NullArgumentException;
import org.apache.commons.math4.exception.NumberIsTooSmallException;
import org.apache.commons.math4.exception.NonMonotonicSequenceException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolynomialSplineFunctionTest {

    @Test
    void testValidInput() throws Exception {
        double[] knots = {0.0, 1.0, 2.0};
        PolynomialFunction[] polynomials = {
            new PolynomialFunction(new double[]{1.0}),
            new PolynomialFunction(new double[]{2.0})
        };
        PolynomialSplineFunction splineFunction = new PolynomialSplineFunction(knots, polynomials);
        assertNotNull(splineFunction);
    }

    @Test
    void testNullKnots() {
        PolynomialFunction[] polynomials = {new PolynomialFunction(new double[]{1.0})};
        assertThrows(NullArgumentException.class, () -> {
            new PolynomialSplineFunction(null, polynomials);
        });
    }

    @Test
    void testNullPolynomials() {
        double[] knots = {0.0, 1.0};
        assertThrows(NullArgumentException.class, () -> {
            new PolynomialSplineFunction(knots, null);
        });
    }

    @Test
    void testInsufficientKnots() {
        double[] knots = {0.0};
        PolynomialFunction[] polynomials = {new PolynomialFunction(new double[]{1.0})};
        assertThrows(NumberIsTooSmallException.class, () -> {
            new PolynomialSplineFunction(knots, polynomials);
        });
    }

    @Test
    void testDimensionMismatch() {
        double[] knots = {0.0, 1.0, 2.0};
        PolynomialFunction[] polynomials = {
            new PolynomialFunction(new double[]{1.0}),
            new PolynomialFunction(new double[]{2.0}),
            new PolynomialFunction(new double[]{3.0})
        };
        assertThrows(DimensionMismatchException.class, () -> {
            new PolynomialSplineFunction(knots, polynomials);
        });
    }

    @Test
    void testNonMonotonicKnots() {
        double[] knots = {0.0, 2.0, 1.0};
        PolynomialFunction[] polynomials = {
            new PolynomialFunction(new double[]{1.0}),
            new PolynomialFunction(new double[]{2.0})
        };
        assertThrows(NonMonotonicSequenceException.class, () -> {
            new PolynomialSplineFunction(knots, polynomials);
        });
    }
}