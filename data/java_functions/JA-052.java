    public static Class<?> getValueType(final char ch) {
        switch (ch) {
        case '@':
            return OBJECT_VALUE;
        case ':':
            return STRING_VALUE;
        case '%':
            return NUMBER_VALUE;
        case '+':
            return CLASS_VALUE;
        case '#':
            return DATE_VALUE;
        case '<':
            return EXISTING_FILE_VALUE;
        case '>':
            return FILE_VALUE;
        case '*':
            return FILES_VALUE;
        case '/':
            return URL_VALUE;
        }

        return null;
    }
