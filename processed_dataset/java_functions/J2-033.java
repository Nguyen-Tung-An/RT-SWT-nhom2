    public static void writePaddedInteger(Writer out, long value, int size) throws IOException {
        int intValue = (int)value;
        if (intValue == value) {
            writePaddedInteger(out, intValue, size);
        } else if (size <= 19) {
            out.write(Long.toString(value));
        } else {
            if (value < 0) {
                out.write('-');
                if (value != Long.MIN_VALUE) {
                    value = -value;
                } else {
                    for (; size > 19; size--) {
                        out.write('0');
                    }
                    out.write("9223372036854775808");
                    return;
                }
            }
            int digits = (int)(Math.log(value) / LOG_10) + 1;
            for (; size > digits; size--) {
                out.write('0');
            }
            out.write(Long.toString(value));
        }
    }
