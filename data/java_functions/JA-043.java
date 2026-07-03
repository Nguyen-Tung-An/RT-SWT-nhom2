    public static Object get(final Object object, final int index) {
        final int i = index;
        if (i < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative: " + i);
        }
        if (object instanceof Map<?, ?>) {
            final Map<?, ?> map = (Map<?, ?>) object;
            final Iterator<?> iterator = map.entrySet().iterator();
            return IteratorUtils.get(iterator, i);
        }
        if (object instanceof Object[]) {
            return ((Object[]) object)[i];
        }
        if (object instanceof Iterator<?>) {
            final Iterator<?> it = (Iterator<?>) object;
            return IteratorUtils.get(it, i);
        }
        if (object instanceof Iterable<?>) {
            final Iterable<?> iterable = (Iterable<?>) object;
            return IterableUtils.get(iterable, i);
        }
        if (object instanceof Enumeration<?>) {
            final Enumeration<?> it = (Enumeration<?>) object;
            return EnumerationUtils.get(it, i);
        }
        if (object == null) {
            throw new IllegalArgumentException("Unsupported object type: null");
        }
        try {
            return Array.get(object, i);
        } catch (final IllegalArgumentException ex) {
            throw new IllegalArgumentException("Unsupported object type: " + object.getClass().getName());
        }
    }
