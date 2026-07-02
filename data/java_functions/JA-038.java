    public static boolean isMixedCase(final CharSequence cs) {
        if (isEmpty(cs) || cs.length() == 1) {
            return false;
        }
        boolean containsUppercase = false;
        boolean containsLowercase = false;
        final int sz = cs.length();
        for (int i = 0; i < sz; i++) {
            final char nowChar = cs.charAt(i);
            if (Character.isUpperCase(nowChar)) {
                containsUppercase = true;
            } else if (Character.isLowerCase(nowChar)) {
                containsLowercase = true;
            }
            if (containsUppercase && containsLowercase) {
                return true;
            }
        }
        return false;
    }
