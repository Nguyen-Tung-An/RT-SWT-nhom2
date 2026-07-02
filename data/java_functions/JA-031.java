    public static boolean startsWith(final byte[] data, final byte[] expected) {
        if (data == expected) {
            return true;
        }
        if (data == null || expected == null) {
            return false;
        }
        final int dataLen = data.length;
        if (expected.length > dataLen) {
            return false;
        }
        if (expected.length == dataLen) {
            // delegate to Arrays.equals() which has optimizations on Java > 8
            return Arrays.equals(data, expected);
        }
        // Once we are on Java 9+ we can delegate to Arrays here as well (or not).
        for (int i = 0; i < expected.length; i++) {
            if (data[i] != expected[i]) {
                return false;
            }
        }
        return true;
    }
