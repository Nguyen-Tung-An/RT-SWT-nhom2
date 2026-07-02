    public static String chomp(final String str) {
        if (isEmpty(str)) {
            return str;
        }
        if (str.length() == 1) {
            final char ch = str.charAt(0);
            if (ch == CharUtils.CR || ch == CharUtils.LF) {
                return EMPTY;
            }
            return str;
        }
        int lastIdx = str.length() - 1;
        final char last = str.charAt(lastIdx);
        if (last == CharUtils.LF) {
            if (str.charAt(lastIdx - 1) == CharUtils.CR) {
                lastIdx--;
            }
        } else if (last != CharUtils.CR) {
            lastIdx++;
        }
        return str.substring(0, lastIdx);
    }
