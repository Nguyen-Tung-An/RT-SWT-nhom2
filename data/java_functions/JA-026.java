  public <T> TypeAdapter<T> getDelegateAdapter(TypeAdapterFactory skipPast, TypeToken<T> type) {
    Objects.requireNonNull(skipPast, "skipPast must not be null");
    Objects.requireNonNull(type, "type must not be null");

    if (jsonAdapterFactory.isClassJsonAdapterFactory(type, skipPast)) {
      skipPast = jsonAdapterFactory;
    }

    boolean skipPastFound = false;
    for (TypeAdapterFactory factory : factories) {
      if (!skipPastFound) {
        if (factory == skipPast) {
          skipPastFound = true;
        }
        continue;
      }

      TypeAdapter<T> candidate = factory.create(this, type);
      if (candidate != null) {
        return candidate;
      }
    }

    if (skipPastFound) {
      throw new IllegalArgumentException("GSON cannot serialize or deserialize " + type);
    } else {
      // Probably a factory from @JsonAdapter on a field
      return getAdapter(type);
    }
  }
