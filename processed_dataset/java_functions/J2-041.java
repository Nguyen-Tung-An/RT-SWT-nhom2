    public static int indexOfWrap(final CharSequence text, final int width, final int startPos) {
        if (width < 1) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        // handle case of width > text.
        // the line ends before the max wrap pos or a new line char found
        int limit = Math.min(startPos + width, text.length());
        for (int idx = startPos; idx < limit; idx++) {
            if (BREAK_CHAR_SET.contains(text.charAt(idx))) {
                return idx;
            }
        }
        if (startPos + width >= text.length()) {
            return text.length();
        }

        limit = Math.min(startPos + width, text.length() - 1);
        int pos;
        // look for the last whitespace character before limit
        for (pos = limit; pos >= startPos; --pos) {
            if (Util.isWhitespace(text.charAt(pos))) {
                break;
            }
        }
        // if we found it return it, otherwise just chop at limit
        return pos > startPos ? pos : limit - 1;
    }
