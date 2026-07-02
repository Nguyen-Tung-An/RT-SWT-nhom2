    public static int indexOfAny(final CharSequence str, final CharSequence... searchStrs) {
        if (str == null || searchStrs == null) {
            return INDEX_NOT_FOUND;
        }
        // String's can't have a MAX_VALUEth index.
        int ret = Integer.MAX_VALUE;
        int tmp;
        for (final CharSequence search : searchStrs) {
            if (search == null) {
                continue;
            }
            tmp = CharSequenceUtils.indexOf(str, search, 0);
            if (tmp == INDEX_NOT_FOUND) {
                continue;
            }
            if (tmp < ret) {
                ret = tmp;
            }
        }
        return ret == Integer.MAX_VALUE ? INDEX_NOT_FOUND : ret;
    }
