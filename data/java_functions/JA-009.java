    public static short[] concat(short[]... arrays) {
        int totalLength = 0;
        for (short[] array : arrays) {
            totalLength = addExact(totalLength, array);
        }
        final short[] result = new short[totalLength];
        int currentPos = 0;
        for (short[] array : arrays) {
            if (array != null && array.length > 0) {
                System.arraycopy(array, 0, result, currentPos, array.length);
                currentPos += array.length;
            }
        }
        return result;
    }
