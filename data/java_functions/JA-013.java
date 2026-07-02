    public static int indexOf(final double[] array, final double valueToFind, final int startIndex, final double tolerance) {
        if (Double.isNaN(valueToFind)) {
            return indexOfNaN(array, startIndex);
        }
        if (isEmpty(array)) {
            return INDEX_NOT_FOUND;
        }
        final double min = valueToFind - tolerance;
        final double max = valueToFind + tolerance;
        for (int i = max0(startIndex); i < array.length; i++) {
            if (array[i] >= min && array[i] <= max) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }
