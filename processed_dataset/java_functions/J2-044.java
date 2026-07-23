  public static TypeToken<?> getParameterized(Type rawType, Type... typeArguments) {
    Objects.requireNonNull(rawType);
    Objects.requireNonNull(typeArguments);

    // Perform basic validation here because this is the only public API where users
    // can create malformed parameterized types
    if (!(rawType instanceof Class)) {
      // See also https://bugs.openjdk.org/browse/JDK-8250659
      throw new IllegalArgumentException("rawType must be of type Class, but was " + rawType);
    }
    Class<?> rawClass = (Class<?>) rawType;
    TypeVariable<?>[] typeVariables = rawClass.getTypeParameters();

    int expectedArgsCount = typeVariables.length;
    int actualArgsCount = typeArguments.length;
    if (actualArgsCount != expectedArgsCount) {
      throw new IllegalArgumentException(
          rawClass.getName()
              + " requires "
              + expectedArgsCount
              + " type arguments, but got "
              + actualArgsCount);
    }

    // For legacy reasons create a TypeToken(Class) if the type is not generic
    if (typeArguments.length == 0) {
      return get(rawClass);
    }

    // Check for this here to avoid misleading exception thrown by ParameterizedTypeImpl
    if (GsonTypes.requiresOwnerType(rawType)) {
      throw new IllegalArgumentException(
          "Raw type "
              + rawClass.getName()
              + " is not supported because it requires specifying an owner type");
    }

    for (int i = 0; i < expectedArgsCount; i++) {
      Type typeArgument =
          Objects.requireNonNull(typeArguments[i], "Type argument must not be null");
      Class<?> rawTypeArgument = GsonTypes.getRawType(typeArgument);
      TypeVariable<?> typeVariable = typeVariables[i];

      for (Type bound : typeVariable.getBounds()) {
        Class<?> rawBound = GsonTypes.getRawType(bound);

        if (!rawBound.isAssignableFrom(rawTypeArgument)) {
          throw new IllegalArgumentException(
              "Type argument "
                  + typeArgument
                  + " does not satisfy bounds for type variable "
                  + typeVariable
                  + " declared by "
                  + rawType);
        }
      }
    }

    return new TypeToken<>(GsonTypes.newParameterizedTypeWithOwner(null, rawClass, typeArguments));
  }
