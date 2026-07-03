    protected void handleUnknownToken(final String token) throws ParseException {
        if (token.startsWith(OptionFormatter.DEFAULT_OPT_PREFIX) && token.length() > 1 && nonOptionAction == NonOptionAction.THROW) {
            throw new UnrecognizedOptionException("Unrecognized option: " + token, token);
        }
        if (!token.startsWith(OptionFormatter.DEFAULT_OPT_PREFIX) || token.equals(OptionFormatter.DEFAULT_OPT_PREFIX)
                || token.length() > 1 && nonOptionAction != NonOptionAction.IGNORE) {
            addArg(token);
        }
        if (nonOptionAction == NonOptionAction.STOP) {
            skipParsing = true;
        }
    }
