  public boolean isClassJsonAdapterFactory(TypeToken<?> type, TypeAdapterFactory factory) {
    Objects.requireNonNull(type);
    Objects.requireNonNull(factory);

    if (factory == TREE_TYPE_CLASS_DUMMY_FACTORY) {
      return true;
    }

    // Using raw type to match behavior of `create(Gson, TypeToken<T>)` above
    Class<?> rawType = type.getRawType();

    TypeAdapterFactory existingFactory = adapterFactoryMap.get(rawType);
    if (existingFactory != null) {
      // Checks for reference equality, like it is done by `Gson.getDelegateAdapter`
      return existingFactory == factory;
    }

    // If no factory has been created for the type yet check manually for a @JsonAdapter annotation
    // which specifies a TypeAdapterFactory
    // Otherwise behavior would not be consistent, depending on whether or not adapter had been
    // requested before call to `isClassJsonAdapterFactory` was made
    JsonAdapter annotation = getAnnotation(rawType);
    if (annotation == null) {
      return false;
    }

    Class<?> adapterClass = annotation.value();
    if (!TypeAdapterFactory.class.isAssignableFrom(adapterClass)) {
      return false;
    }

    Object adapter = createAdapter(constructorConstructor, adapterClass);
    TypeAdapterFactory newFactory = (TypeAdapterFactory) adapter;

    return putFactoryAndGetCurrent(rawType, newFactory) == factory;
  }
