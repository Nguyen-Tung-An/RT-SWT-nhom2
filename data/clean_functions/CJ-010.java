    public boolean equals(final Object other) {

        if (other instanceof Dfp) {
            final Dfp x = (Dfp) other;
            if (isNaN() || x.isNaN() || field.getRadixDigits() != x.field.getRadixDigits()) {
                return false;
            }

            return compare(this, x) == 0;
        }

        return false;
    }
