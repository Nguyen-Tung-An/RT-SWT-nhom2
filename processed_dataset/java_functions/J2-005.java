    public static Dfp sin(final Dfp a) {
        final Dfp pi = a.getField().getPi();
        final Dfp zero = a.getField().getZero();
        boolean neg = false;

        /* First reduce the argument to the range of +/- PI */
        Dfp x = a.remainder(pi.multiply(2));

        /* if x < 0 then apply identity sin(-x) = -sin(x) */
        /* This puts x in the range 0 < x < PI            */
        if (x.lessThan(zero)) {
            x = x.negate();
            neg = true;
        }

        /* Since sine(x) = sine(pi - x) we can reduce the range to
         * 0 < x < pi/2
         */

        if (x.greaterThan(pi.divide(2))) {
            x = pi.subtract(x);
        }

        Dfp y;
        if (x.lessThan(pi.divide(4))) {
            y = sinInternal(split(x));
        } else {
            final Dfp[] c = new Dfp[2];
            final Dfp[] piSplit = a.getField().getPiSplit();
            c[0] = piSplit[0].divide(2).subtract(x);
            c[1] = piSplit[1].divide(2);
            y = cosInternal(c);
        }

        if (neg) {
            y = y.negate();
        }

        return a.newInstance(y);
    }
