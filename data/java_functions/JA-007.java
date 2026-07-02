    public static int[] concat(int[]... arrays) {
        int totalLength = 0;
        for (int[] array : arrays) {
            totalLength = addExact(totalLength, array);
        }
        final int[] result = new int[totalLength];
        int currentPos = 0;
        for (int[] array : arrays) {
            if (array != null && array.length > 0) {
                System.arraycopy(array, 0, result, currentPos, array.length);
                currentPos += array.length;
            }
        }
        return result;
    }
