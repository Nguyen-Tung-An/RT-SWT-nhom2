    public boolean equals(@Nullable Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Attributes that = (Attributes) o;
        if (size != that.size) return false;
        for (int i = 0; i < size; i++) {
            String key = keys[i];
            assert key != null;
            int thatI = that.indexOfKey(key);
            if (thatI == NotFound || !Objects.equals(vals[i], that.vals[thatI]))
                return false;
        }
        return true;
    }
