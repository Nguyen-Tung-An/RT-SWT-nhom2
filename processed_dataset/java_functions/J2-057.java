    public static <I, O> Transformer<I, O> invokerTransformer(final String methodName, final Class<?>[] paramTypes,
                                                              final Object[] args) {
        Objects.requireNonNull(methodName, "methodName");
        if (paramTypes == null && args != null
            || paramTypes != null && args == null
            || paramTypes != null && args != null && paramTypes.length != args.length) {
            throw new IllegalArgumentException("The parameter types must match the arguments");
        }
        if (paramTypes == null || paramTypes.length == 0) {
            return new InvokerTransformer<>(methodName);
        }
        return new InvokerTransformer<>(methodName, paramTypes, args);
    }
