  public static TypeAdapter<AtomicLongArray> atomicLongArrayAdapter(
      TypeAdapter<Number> longAdapter) {
    Objects.requireNonNull(longAdapter);
    return new TypeAdapter<AtomicLongArray>() {
      @Override
      public AtomicLongArray read(JsonReader in) throws IOException {
        List<Long> list = new ArrayList<>();
        in.beginArray();
        while (in.hasNext()) {
          Number value = longAdapter.read(in);
          if (value == null) {
            throw new JsonSyntaxException("null is not a valid AtomicLongArray element");
          }
          list.add(value.longValue());
        }
        in.endArray();
        int length = list.size();
        AtomicLongArray array = new AtomicLongArray(length);
        for (int i = 0; i < length; ++i) {
          array.set(i, list.get(i));
        }
        return array;
      }

      @Override
      public void write(JsonWriter out, AtomicLongArray value) throws IOException {
        out.beginArray();
        for (int i = 0, length = value.length(); i < length; i++) {
          longAdapter.write(out, value.get(i));
        }
        out.endArray();
      }
    }.nullSafe();
  }
