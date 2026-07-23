    public void processArgs(final Option opt, final ListIterator<String> iter) throws ParseException {
        // loop until an option is found
        while (iter.hasNext()) {
            final String str = iter.next();
            // found an Option, not an argument
            if (getOptions().hasOption(str) && str.startsWith(OptionFormatter.DEFAULT_OPT_PREFIX)) {
                iter.previous();
                break;
            }
            // found a value
            try {
                opt.processValue(Util.stripLeadingAndTrailingQuotes(str));
            } catch (final RuntimeException exp) {
                iter.previous();
                break;
            }
        }
        if (opt.isValuesEmpty() && !opt.hasOptionalArg()) {
            throw new MissingArgumentException(opt);
        }
    }
