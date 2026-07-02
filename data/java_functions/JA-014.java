    public static int indexOf(final float[] array, final float valueToFind, final int startIndex) {
        if (isEmpty(array)) {
            return INDEX_NOT_FOUND;
        }
        final boolean searchNaN = Float.isNaN(valueToFind);
        for (int i = max0(startIndex); i < array.length; i++) {
            final float element = array[i];
            if (valueToFind == element || searchNaN && Float.isNaN(element)) {
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }
