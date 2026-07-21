    public static void appendPaddedInteger(Appendable appendable, long value, int size) throws IOException {
        int intValue = (int)value;
        if (intValue == value) {
            appendPaddedInteger(appendable, intValue, size);
        } else if (size <= 19) {
            appendable.append(Long.toString(value));
        } else {
            if (value < 0) {
                appendable.append('-');
                if (value != Long.MIN_VALUE) {
                    value = -value;
                } else {
                    for (; size > 19; size--) {
                        appendable.append('0');
                    }
                    appendable.append("9223372036854775808");
                    return;
                }
            }
            int digits = (int)(Math.log(value) / LOG_10) + 1;
            for (; size > digits; size--) {
                appendable.append('0');
            }
            appendable.append(Long.toString(value));
        }
    }
