    public static Dfp pow(Dfp base, int a) {
        boolean invert = false;

        Dfp result = base.getOne();

        if (a == 0) {
            // Special case
            return result;
        }

        if (a < 0) {
            invert = true;
            a = -a;
        }

        // Exponentiate by successive squaring
        do {
            Dfp r = new Dfp(base);
            Dfp prevr;
            int trial = 1;
            int prevtrial;

            do {
                prevr = new Dfp(r);
                prevtrial = trial;
                r = r.multiply(r);
                trial *= 2;
            } while (a > trial);

            r = prevr;
            trial = prevtrial;

            a -= trial;
            result = result.multiply(r);
        } while (a >= 1);

        if (invert) {
            result = base.getOne().divide(result);
        }

        return base.newInstance(result);
    }
