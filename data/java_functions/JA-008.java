    public static long[] concat(long[]... arrays) {
        int totalLength = 0;
        for (long[] array : arrays) {
            totalLength = addExact(totalLength, array);
        }
        final long[] result = new long[totalLength];
        int currentPos = 0;
        for (long[] array : arrays) {
            if (array != null && array.length > 0) {
                System.arraycopy(array, 0, result, currentPos, array.length);
                currentPos += array.length;
            }
        }
        return result;
    }
