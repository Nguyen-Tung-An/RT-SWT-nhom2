    public static void appendUnpaddedInteger(Appendable appendable, int value) throws IOException {
        if (value < 0) {
            appendable.append('-');
            if (value != Integer.MIN_VALUE) {
                value = -value;
            } else {
                appendable.append("" + -(long)Integer.MIN_VALUE);
                return;
            }
        }
        if (value < 10) {
            appendable.append((char)(value + '0'));
        } else if (value < 100) {
            // Calculate value div/mod by 10 without using two expensive
            // division operations. (2 ^ 27) / 10 = 13421772. Add one to
            // value to correct rounding error.
            int d = ((value + 1) * 13421772) >> 27;
            appendable.append((char) (d + '0'));
            // Append remainder by calculating (value - d * 10).
            appendable.append((char) (value - (d << 3) - (d << 1) + '0'));
        } else {
            appendable.append(Integer.toString(value));
        }
    }
