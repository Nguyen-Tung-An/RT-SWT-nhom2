    public String toString() {
        final StringBuilder buff = new StringBuilder();
        final Iterator<Option> iter = getOptions().iterator();
        buff.append("[");
        while (iter.hasNext()) {
            final Option option = iter.next();
            if (option.getOpt() != null) {
                buff.append(OptionFormatter.DEFAULT_OPT_PREFIX);
                buff.append(option.getOpt());
            } else {
                buff.append(OptionFormatter.DEFAULT_LONG_OPT_PREFIX);
                buff.append(option.getLongOpt());
            }
            if (option.getDescription() != null) {
                buff.append(Char.SP);
                buff.append(option.getDescription());
            }
            if (iter.hasNext()) {
                buff.append(", ");
            }
        }
        buff.append("]");
        return buff.toString();
    }
