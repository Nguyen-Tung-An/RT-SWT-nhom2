    public static <T> Factory<T> instantiateFactory(final Class<T> classToInstantiate,
                                                    final Class<?>[] paramTypes,
                                                    final Object[] args) {
        Objects.requireNonNull(classToInstantiate, "classToInstantiate");
        if (paramTypes == null && args != null
            || paramTypes != null && args == null
            || paramTypes != null && args != null && paramTypes.length != args.length) {
            throw new IllegalArgumentException("Parameter types must match the arguments");
        }

        if (paramTypes == null || paramTypes.length == 0) {
            return new InstantiateFactory<>(classToInstantiate);
        }
        return new InstantiateFactory<>(classToInstantiate, paramTypes, args);
    }
