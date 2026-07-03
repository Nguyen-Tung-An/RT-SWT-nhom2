    private void handleLongOptionWithEqual(final String token) throws ParseException {
        final int pos = indexOfEqual(token);
        final String value = token.substring(pos + 1);
        final String opt = token.substring(0, pos);
        final List<String> matchingOpts = getMatchingLongOptions(opt);
        if (matchingOpts.isEmpty()) {
            handleUnknownToken(currentToken);
        } else if (matchingOpts.size() > 1 && !options.hasLongOption(opt)) {
            throw new AmbiguousOptionException(opt, matchingOpts);
        } else {
            final String key = options.hasLongOption(opt) ? opt : matchingOpts.get(0);
            final Option option = options.getOption(key);
            if (option.acceptsArg()) {
                handleOption(option);
                currentOption.processValue(stripLeadingAndTrailingQuotesDefaultOff(value));
                currentOption = null;
            } else {
                handleUnknownToken(currentToken);
            }
        }
    }
