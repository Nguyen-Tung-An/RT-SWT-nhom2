  public void timeBagOfPrimitivesReflectionStreaming(int reps) throws Exception {
    for (int i = 0; i < reps; ++i) {
      StringReader reader = new StringReader(json);
      JsonReader jr = new JsonReader(reader);
      jr.beginObject();
      BagOfPrimitives bag = new BagOfPrimitives();
      while (jr.hasNext()) {
        String name = jr.nextName();
        for (Field field : BagOfPrimitives.class.getDeclaredFields()) {
          if (field.getName().equals(name)) {
            Class<?> fieldType = field.getType();
            if (fieldType.equals(long.class)) {
              field.setLong(bag, jr.nextLong());
            } else if (fieldType.equals(int.class)) {
              field.setInt(bag, jr.nextInt());
            } else if (fieldType.equals(boolean.class)) {
              field.setBoolean(bag, jr.nextBoolean());
            } else if (fieldType.equals(String.class)) {
              field.set(bag, jr.nextString());
            } else {
              throw new RuntimeException("Unexpected: type: " + fieldType + ", name: " + name);
            }
          }
        }
      }
      jr.endObject();
    }
  }
