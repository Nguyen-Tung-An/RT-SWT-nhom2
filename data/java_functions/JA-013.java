    public int search(final Object object) {
        int i = size() - 1;        // Current index
        int n = 1;                 // Current distance
        while (i >= 0) {
            final Object current = get(i);
            if (object == null && current == null ||
                object != null && object.equals(current)) {
                return n;
            }
            i--;
            n++;
        }
        return -1;
    }
