    private boolean isDelimiter(final char ch0, final CharSequence charSeq, final int startIndex, final char[] delimiter, final int delimiterLength) {
        if (ch0 != delimiter[0]) {
            return false;
        }
        final int len = charSeq.length();
        if (startIndex + delimiterLength > len) {
            return false;
        }
        for (int i = 1; i < delimiterLength; i++) {
            if (charSeq.charAt(startIndex + i) != delimiter[i]) {
                return false;
            }
        }
        return true;
    }
