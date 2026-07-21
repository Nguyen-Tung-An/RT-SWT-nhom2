    private OptionFormatter(final Option option, final Builder builder) {
        this.optionalDelimiters = builder.optionalDelimiters;
        this.argNameDelimiters = builder.argNameDelimiters;
        this.defaultArgName = builder.defaultArgName;
        this.optPrefix = builder.optPrefix;
        this.longOptPrefix = builder.longOptPrefix;
        this.optSeparator = builder.optSeparator;
        this.optArgSeparator = builder.optArgSeparator;
        this.deprecatedFormatFunction = builder.deprecatedFormatFunction;
        this.option = option;
        this.syntaxFormatFunction = builder.syntaxFormatFunction != null ? builder.syntaxFormatFunction : (o, required) -> {
            final StringBuilder buff = new StringBuilder();
            final String argName = o.getArgName();
            buff.append(Util.defaultValue(o.getOpt(), o.getLongOpt()));
            if (!Util.isEmpty(argName)) {
                buff.append(optArgSeparator).append(argName);
            }
            final boolean requiredFlg = required == null ? o.isRequired() : required;
            return requiredFlg ? buff.toString() : o.toOptional(buff.toString());
        };
    }
