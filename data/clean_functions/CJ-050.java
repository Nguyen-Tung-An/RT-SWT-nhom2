    public boolean containsValue(final Object value) {
        if (value == null) {
            for (final HashEntry<K, V> element : data) {
                HashEntry<K, V> entry = element;
                while (entry != null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                    entry = entry.next;
                }
            }
        } else {
            for (final HashEntry<K, V> element : data) {
                HashEntry<K, V> entry = element;
                while (entry != null) {
                    if (isEqualValue(value, entry.getValue())) {
                        return true;
                    }
                    entry = entry.next;
                }
            }
        }
        return false;
    }
