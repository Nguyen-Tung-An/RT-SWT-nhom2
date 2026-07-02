    public static double[] concat(double[]... arrays) {
        int totalLength = 0;
        for (double[] array : arrays) {
            totalLength = addExact(totalLength, array);
        }
        final double[] result = new double[totalLength];
        int currentPos = 0;
        for (double[] array : arrays) {
            if (array != null && array.length > 0) {
                System.arraycopy(array, 0, result, currentPos, array.length);
                currentPos += array.length;
            }
        }
        return result;
    }
