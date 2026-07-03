    public static double log1p(final double x) {
        if (x == -1) {
            return Double.NEGATIVE_INFINITY;
        }

        if (x == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }

        if (x > 1e-6 ||
            x < -1e-6) {
            final double xpa = 1 + x;
            final double xpb = -(xpa - 1 - x);

            final double[] hiPrec = new double[2];
            final double lores = log(xpa, hiPrec);
            if (Double.isInfinite(lores)) { // Don't allow this to be converted to NaN
                return lores;
            }

            // Do a taylor series expansion around xpa:
            //   f(x+y) = f(x) + f'(x) y + f''(x)/2 y^2
            final double fx1 = xpb / xpa;
            final double epsilon = 0.5 * fx1 + 1;
            return epsilon * fx1 + hiPrec[1] + hiPrec[0];
        } else {
            // Value is small |x| < 1e6, do a Taylor series centered on 1.
            final double y = (x * F_1_3 - F_1_2) * x + 1;
            return y * x;
        }
    }
