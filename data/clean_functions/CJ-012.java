    public static Options parsePattern(final String pattern) {
        char opt = Char.SP;
        boolean required = false;
        Class<?> type = null;
        Converter<?, ?> converter = Converter.DEFAULT;

        final Options options = new Options();

        for (int i = 0; i < pattern.length(); i++) {
            final char ch = pattern.charAt(i);

            // a value code comes after an option and specifies
            // details about it
            if (!isValueCode(ch)) {
                if (opt != Char.SP) {
                    // @formatter:off
                    final Option option = Option.builder(String.valueOf(opt))
                            .hasArg(type != null)
                            .required(required)
                            .type(type)
                            .converter(converter)
                            .get();
                    // @formatter:on
                    // we have a previous one to deal with
                    options.addOption(option);
                    required = false;
                    type = null;
                    converter = Converter.DEFAULT;
                }

                opt = ch;
            } else if (ch == '!') {
                required = true;
            } else {
                type = getValueType(ch);
                final Map<Class<?>, Converter<?, ? extends Throwable>> map = TypeHandler.createDefaultMap();
                // Backward compatibility (probably).
                map.put(FILES_VALUE, unsupported());
                converter = new TypeHandler(map).getConverter(getValueType(ch));
            }
        }

        if (opt != Char.SP) {
            final Option option = Option.builder(String.valueOf(opt)).hasArg(type != null).required(required).type(type).get();

            // we have a final one to deal with
            options.addOption(option);
        }

        return options;
    }
