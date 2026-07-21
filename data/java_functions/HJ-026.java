    public PolynomialSplineFunction(double[] knots, PolynomialFunction[] polynomials)
        throws NullArgumentException, NumberIsTooSmallException,
               DimensionMismatchException, NonMonotonicSequenceException{
        if (knots == null ||
            polynomials == null) {
            throw new NullArgumentException();
        }
        if (knots.length < 2) {
            throw new NumberIsTooSmallException(LocalizedFormats.NOT_ENOUGH_POINTS_IN_SPLINE_PARTITION,
                                                knots.length, 2, true);
        }
        if (knots.length - 1 != polynomials.length) {
            throw new DimensionMismatchException(polynomials.length, knots.length);
        }
        MathArrays.checkOrder(knots);

        this.n = knots.length -1;
        this.knots = new double[n + 1];
        System.arraycopy(knots, 0, this.knots, 0, n + 1);
        this.polynomials = new PolynomialFunction[n];
        System.arraycopy(polynomials, 0, this.polynomials, 0, n);
    }
