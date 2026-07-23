    public static Dfp log(Dfp a) {
        int lr;
        Dfp x;
        int ix;
        int p2 = 0;

        // Check the arguments somewhat here
        if (a.equals(a.getZero()) || a.lessThan(a.getZero()) || a.isNaN()) {
            // negative, zero or NaN
            a.getField().setIEEEFlagsBits(DfpField.FLAG_INVALID);
            return a.dotrap(DfpField.FLAG_INVALID, "ln", a, a.newInstance((byte)1, Dfp.QNAN));
        }

        if (a.classify() == Dfp.INFINITE) {
            return a;
        }

        x = new Dfp(a);
        lr = x.log10K();

        x = x.divide(pow(a.newInstance(10000), lr));  /* This puts x in the range 0-10000 */
        ix = x.floor().intValue();

        while (ix > 2) {
            ix >>= 1;
            p2++;
        }


        Dfp[] spx = split(x);
        Dfp[] spy = new Dfp[2];
        spy[0] = pow(a.getTwo(), p2);          // use spy[0] temporarily as a divisor
        spx[0] = spx[0].divide(spy[0]);
        spx[1] = spx[1].divide(spy[0]);

        spy[0] = a.newInstance("1.33333");    // Use spy[0] for comparison
        while (spx[0].add(spx[1]).greaterThan(spy[0])) {
            spx[0] = spx[0].divide(2);
            spx[1] = spx[1].divide(2);
            p2++;
        }

        // X is now in the range of 2/3 < x < 4/3
        Dfp[] spz = logInternal(spx);

        spx[0] = a.newInstance(new StringBuilder().append(p2 + 4 * lr).toString());
        spx[1] = a.getZero();
        spy = splitMult(a.getField().getLn2Split(), spx);

        spz[0] = spz[0].add(spy[0]);
        spz[1] = spz[1].add(spy[1]);

        spx[0] = a.newInstance(new StringBuilder().append(4 * lr).toString());
        spx[1] = a.getZero();
        spy = splitMult(a.getField().getLn5Split(), spx);

        spz[0] = spz[0].add(spy[0]);
        spz[1] = spz[1].add(spy[1]);

        return a.newInstance(spz[0].add(spz[1]));
    }
