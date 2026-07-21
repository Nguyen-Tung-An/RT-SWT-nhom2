    static String validate(final String option) throws IllegalArgumentException {
        // if opt is null do not check further.
        if (option == null) {
            return null;
        }
        if (option.isEmpty()) {
            throw new IllegalArgumentException("Empty option name.");
        }
        final char[] chars = option.toCharArray();
        final char ch0 = chars[0];
        if (!isValidOpt(ch0)) {
            throw new IllegalArgumentException(String.format("Illegal option name '%s'.", ch0));
        }
        // handle the multi-character opt
        if (option.length() > 1) {
            for (int i = 1; i < chars.length; i++) {
                final char ch = chars[i];
                if (!isValidChar(ch)) {
                    throw new IllegalArgumentException(String.format("The option '%s' contains an illegal character : '%s'.", option, ch));
                }
            }
        }
        return option;
    }
