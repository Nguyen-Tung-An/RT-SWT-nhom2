  public GsonBuilder registerTypeHierarchyAdapter(Class<?> baseType, Object typeAdapter) {
    Objects.requireNonNull(baseType);
    Objects.requireNonNull(typeAdapter);
    if (!(typeAdapter instanceof JsonSerializer<?>
        || typeAdapter instanceof JsonDeserializer<?>
        || typeAdapter instanceof TypeAdapter<?>)) {
      throw new IllegalArgumentException(
          "Class "
              + typeAdapter.getClass().getName()
              + " does not implement any supported type adapter class or interface");
    }

    if (typeAdapter instanceof JsonDeserializer || typeAdapter instanceof JsonSerializer) {
      hierarchyFactories.add(TreeTypeAdapter.newTypeHierarchyFactory(baseType, typeAdapter));
    }
    if (typeAdapter instanceof TypeAdapter<?>) {
      @SuppressWarnings({"unchecked", "rawtypes"})
      TypeAdapterFactory factory =
          TypeAdapters.newTypeHierarchyFactory(baseType, (TypeAdapter) typeAdapter);
      factories.add(factory);
    }
    return this;
  }
