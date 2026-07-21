    SingleTypeFactory(
        Object typeAdapter, TypeToken<?> exactType, boolean matchRawType, Class<?> hierarchyType) {
      serializer = typeAdapter instanceof JsonSerializer ? (JsonSerializer<?>) typeAdapter : null;
      deserializer =
          typeAdapter instanceof JsonDeserializer ? (JsonDeserializer<?>) typeAdapter : null;
      if (serializer == null && deserializer == null) {
        Objects.requireNonNull(typeAdapter);
        throw new IllegalArgumentException(
            "Type adapter "
                + typeAdapter.getClass().getName()
                + " must implement JsonSerializer or JsonDeserializer");
      }
      this.exactType = exactType;
      this.matchRawType = matchRawType;
      this.hierarchyType = hierarchyType;
    }
