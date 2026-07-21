    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        final StringBuilder buf = new StringBuilder(16 * size());
        buf.append(CollectionUtils.DEFAULT_TOSTRING_PREFIX);

        final Iterator<E> it = iterator();
        boolean hasNext = it.hasNext();
        while (hasNext) {
            final Object value = it.next();
            buf.append(value == this ? "(this Collection)" : value);
            hasNext = it.hasNext();
            if (hasNext) {
                buf.append(", ");
            }
        }
        buf.append(CollectionUtils.DEFAULT_TOSTRING_SUFFIX);
        return buf.toString();
    }
