  public void timeCollectionsStreaming(int reps) throws IOException {
    for (int i = 0; i < reps; ++i) {
      StringReader reader = new StringReader(json);
      JsonReader jr = new JsonReader(reader);
      jr.beginArray();
      List<BagOfPrimitives> bags = new ArrayList<>();
      while (jr.hasNext()) {
        jr.beginObject();
        long longValue = 0;
        int intValue = 0;
        boolean booleanValue = false;
        String stringValue = null;
        while (jr.hasNext()) {
          String name = jr.nextName();
          switch (name) {
            case "longValue":
              longValue = jr.nextLong();
              break;
            case "intValue":
              intValue = jr.nextInt();
              break;
            case "booleanValue":
              booleanValue = jr.nextBoolean();
              break;
            case "stringValue":
              stringValue = jr.nextString();
              break;
            default:
              throw new IOException("Unexpected name: " + name);
          }
        }
        jr.endObject();
        bags.add(new BagOfPrimitives(longValue, intValue, booleanValue, stringValue));
      }
      jr.endArray();
    }
  }
