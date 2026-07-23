    public static void writeUnpaddedInteger(Writer out, int value) throws IOException {
        if (value < 0) {
            out.write('-');
            if (value != Integer.MIN_VALUE) {
                value = -value;
            } else {
                out.write("" + -(long)Integer.MIN_VALUE);
                return;
            }
        }
        if (value < 10) {
            out.write(value + '0');
        } else if (value < 100) {
            // Calculate value div/mod by 10 without using two expensive
            // division operations. (2 ^ 27) / 10 = 13421772. Add one to
            // value to correct rounding error.
            int d = ((value + 1) * 13421772) >> 27;
            out.write(d + '0');
            // Append remainder by calculating (value - d * 10).
            out.write(value - (d << 3) - (d << 1) + '0');
        } else {
            out.write(Integer.toString(value));
        }
    }
