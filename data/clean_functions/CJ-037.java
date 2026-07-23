  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    Class<?> rawType = type.getRawType();

    boolean skipSerialize = excludeClass(rawType, true);
    boolean skipDeserialize = excludeClass(rawType, false);

    if (!skipSerialize && !skipDeserialize) {
      return null;
    }

    return new TypeAdapter<T>() {
      /**
       * The delegate is lazily created because it may not be needed, and creating it may fail.
       * Field has to be {@code volatile} because {@link Gson} guarantees to be thread-safe.
       */
      private volatile TypeAdapter<T> delegate;

      @Override
      public T read(JsonReader in) throws IOException {
        if (skipDeserialize) {
          in.skipValue();
          return null;
        }
        return delegate().read(in);
      }

      @Override
      public void write(JsonWriter out, T value) throws IOException {
        if (skipSerialize) {
          out.nullValue();
          return;
        }
        delegate().write(out, value);
      }

      private TypeAdapter<T> delegate() {
        // A race might lead to `delegate` being assigned by multiple threads but the last
        // assignment will stick
        TypeAdapter<T> d = delegate;
        if (d == null) {
          d = delegate = gson.getDelegateAdapter(Excluder.this, type);
        }
        return d;
      }
    };
  }
