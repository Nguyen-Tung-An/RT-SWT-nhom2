    protected void handleConcatenatedOptions(final String token) throws ParseException {
        for (int i = 1; i < token.length(); i++) {
            final String ch = String.valueOf(token.charAt(i));
            if (!options.hasOption(ch)) {
                handleUnknownToken(nonOptionAction == NonOptionAction.STOP && i > 1 ? token.substring(i) : token);
                break;
            }
            handleOption(options.getOption(ch));
            if (currentOption != null && token.length() != i + 1) {
                // add the trail as an argument of the option
                currentOption.processValue(stripLeadingAndTrailingQuotesDefaultOff(token.substring(i + 1)));
                break;
            }
        }
    }
