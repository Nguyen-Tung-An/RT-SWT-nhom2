    public <T> T[] getParsedOptionValues(final Option option, final Supplier<T[]> defaultValue) throws ParseException {
        if (option == null) {
            return get(defaultValue);
        }
        final Class<? extends T> clazz = (Class<? extends T>) option.getType();
        final String[] values = getOptionValues(option);
        if (values == null) {
            return get(defaultValue);
        }
        final T[] result = (T[]) Array.newInstance(clazz, values.length);
        try {
            for (int i = 0; i < values.length; i++) {
                result[i] = clazz.cast(option.getConverter().apply(values[i]));
            }
            return result;
        } catch (final Exception t) {
            throw ParseException.wrap(t);
        }
    }
