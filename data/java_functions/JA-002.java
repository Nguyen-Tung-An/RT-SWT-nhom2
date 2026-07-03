    public String[] getOptionValues(final Option option) {
        if (option == null) {
            return null;
        }
        final List<String> values = new ArrayList<>();
        options.forEach(processedOption -> {
            if (processedOption.equals(option)) {
                if (option.isDeprecated()) {
                    handleDeprecated(option);
                }
                values.addAll(processedOption.getValuesList());
            }
        });
        return values.isEmpty() ? null : values.toArray(Util.EMPTY_STRING_ARRAY);
    }
