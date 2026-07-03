    private boolean isLongOption(final String token) {
        if (token == null || !token.startsWith(OptionFormatter.DEFAULT_OPT_PREFIX) || token.length() == 1) {
            return false;
        }
        final int pos = indexOfEqual(token);
        final String t = pos == -1 ? token : token.substring(0, pos);
        if (!getMatchingLongOptions(t).isEmpty()) {
            // long or partial long options (--L, -L, --L=V, -L=V, --l, --l=V)
            return true;
        }
        if (getLongPrefix(token) != null && !token.startsWith(OptionFormatter.DEFAULT_LONG_OPT_PREFIX)) {
            // -LV
            return true;
        }
        return false;
    }
