    public static boolean[] concat(boolean[]... arrays) {
        int totalLength = 0;
        for (boolean[] array : arrays) {
            totalLength = addExact(totalLength, array);
        }
        final boolean[] result = new boolean[totalLength];
        int currentPos = 0;
        for (boolean[] array : arrays) {
            if (array != null && array.length > 0) {
                System.arraycopy(array, 0, result, currentPos, array.length);
                currentPos += array.length;
            }
        }
        return result;
    }
