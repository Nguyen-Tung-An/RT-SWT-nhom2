    public void appendList(final boolean ordered, final Collection<CharSequence> list) throws IOException {
        if (list != null && !list.isEmpty()) {
            final TextStyle.Builder builder = TextStyle.builder().setLeftPad(textStyleBuilder.getLeftPad()).setIndent(DEFAULT_LIST_INDENT);
            int i = 1;
            for (final CharSequence line : list) {
                final String entry = ordered ? String.format(" %s. %s", i++, Util.defaultValue(line, BLANK_LINE))
                        : String.format(" * %s", Util.defaultValue(line, BLANK_LINE));
                builder.setMaxWidth(Math.min(textStyleBuilder.getMaxWidth(), entry.length()));
                printQueue(makeColumnQueue(entry, builder.get()));
            }
            output.append(System.lineSeparator());
        }
    }
