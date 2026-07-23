    public boolean equals(Object o) {
      if (o instanceof Entry) {
        Entry<?, ?> other = (Entry<?, ?>) o;
        return (key == null ? other.getKey() == null : key.equals(other.getKey()))
            && (value == null ? other.getValue() == null : value.equals(other.getValue()));
      }
      return false;
    }
