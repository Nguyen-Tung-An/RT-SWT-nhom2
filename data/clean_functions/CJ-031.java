    public static boolean isNumeric(String string) {
        if (string == null || string.length() == 0)
            return false;

        int l = string.length();
        for (int i = 0; i < l; i++) {
            if (!isDigit(string.charAt(i)))
                return false;
        }
        return true;
    }
