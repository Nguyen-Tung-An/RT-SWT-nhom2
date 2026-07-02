    public static int indexOf(final double[] array, final double valueToFind, final int startIndex) {
        if (Double.isNaN(valueToFind)) {
            return indexOfNaN(array, startIndex);
        }
        if (isEmpty(array)) {
            return INDEX_NOT_FOUND;
        }
        for (int i = max0(startIndex); i < array.length; i++) {
            if (valueToFind == array[i]) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }
