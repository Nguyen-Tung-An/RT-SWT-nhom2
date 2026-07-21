import org.apache.commons.math4.legacy.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math4.legacy.analysis.polynomials.PolynomialSplineFunction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PolynomialSplineFunctionTest {

    @Test
    void testPolynomialSplineFunctionValidInput() {
        double[] knots = {0.0, 1.0, 2.0};
        PolynomialFunction polynomialFunction = new PolynomialFunction(new double[]{1.0, 2.0});
        PolynomialSplineFunction splineFunction = new PolynomialSplineFunction(1.0, polynomialFunction);
        
        assertNotNull(splineFunction);
        assertEquals(1.0, splineFunction.getPolynomials()[0].getCoefficients()[0]);
    }

    @Test
    void testPolynomialSplineFunctionBoundaryInput() {
        double[] knots = {0.0, 1.0, 2.0};
        PolynomialFunction polynomialFunction = new PolynomialFunction(new double[]{0.0, 0.0});
        PolynomialSplineFunction splineFunction = new PolynomialSplineFunction(0.0, polynomialFunction);
        
        assertNotNull(splineFunction);
        assertEquals(0.0, splineFunction.getPolynomials()[0].getCoefficients()[0]);
    }

    @Test
    void testPolynomialSplineFunctionNegativeInput() {
        double[] knots = {0.0, 1.0, 2.0};
        PolynomialFunction polynomialFunction = new PolynomialFunction(new double[]{-1.0, -2.0});
        PolynomialSplineFunction splineFunction = new PolynomialSplineFunction(-1.0, polynomialFunction);
        
        assertNotNull(splineFunction);
        assertEquals(-1.0, splineFunction.getPolynomials()[0].getCoefficients()[0]);
    }

    @Test
    void testPolynomialSplineFunctionZeroPolynomial() {
        double[] knots = {0.0, 1.0, 2.0};
        PolynomialFunction polynomialFunction = new PolynomialFunction(new double[]{0.0});
        PolynomialSplineFunction splineFunction = new PolynomialSplineFunction(0.0, polynomialFunction);
        
        assertNotNull(splineFunction);
        assertEquals(0.0, splineFunction.getPolynomials()[0].getCoefficients()[0]);
    }
}