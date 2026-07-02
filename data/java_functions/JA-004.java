    public static char[] concat(char[]... arrays) {
        int totalLength = 0;
        for (char[] array : arrays) {
            totalLength = addExact(totalLength, array);
        }
        final char[] result = new char[totalLength];
        int currentPos = 0;
        for (char[] array : arrays) {
            if (array != null && array.length > 0) {
                System.arraycopy(array, 0, result, currentPos, array.length);
                currentPos += array.length;
            }
        }
        return result;
    }
