    private boolean isShortOption(final String token) {
        // short options (-S, -SV, -S=V, -SV1=V2, -S1S2)
        if (token == null || !token.startsWith(OptionFormatter.DEFAULT_OPT_PREFIX) || token.length() == 1) {
            return false;
        }
        // remove leading "-" and "=value"
        final int pos = indexOfEqual(token);
        final String optName = pos == -1 ? token.substring(1) : token.substring(1, pos);
        if (options.hasShortOption(optName)) {
            return true;
        }
        // check for several concatenated short options
        return !optName.isEmpty() && options.hasShortOption(String.valueOf(optName.charAt(0)));
    }
