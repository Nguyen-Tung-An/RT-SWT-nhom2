    public String toString() {
        final StringBuilder buf = new StringBuilder().append("[ ");
        buf.append("Option ");
        buf.append(option);
        if (longOption != null) {
            buf.append(Char.SP).append(longOption);
        }
        if (isDeprecated()) {
            buf.append(Char.SP);
            buf.append(deprecated.toString());
        }
        if (hasArgs()) {
            buf.append("[ARG...]");
        } else if (hasArg()) {
            buf.append(" [ARG]");
        }
        // @formatter:off
        return buf.append(" :: ")
            .append(description)
            .append(" :: ")
            .append(type)
            .append(" ]")
            .toString();
        // @formatter:on
    }
