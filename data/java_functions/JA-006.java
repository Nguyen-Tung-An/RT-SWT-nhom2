    public static float[] concat(float[]... arrays) {
        int totalLength = 0;
        for (float[] array : arrays) {
            totalLength = addExact(totalLength, array);
        }
        final float[] result = new float[totalLength];
        int currentPos = 0;
        for (float[] array : arrays) {
            if (array != null && array.length > 0) {
                System.arraycopy(array, 0, result, currentPos, array.length);
                currentPos += array.length;
            }
        }
        return result;
    }
