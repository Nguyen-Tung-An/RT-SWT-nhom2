    private void addRecordValue(final boolean lastRecord) {
        final String input = format.trim(reusableToken.content.toString());
        // Only drop the empty field produced by an actual trailing delimiter. A quoted empty
        // field ("") is a real value, not a trailing delimiter, so it must be kept.
        if (lastRecord && input.isEmpty() && format.getTrailingDelimiter() && !reusableToken.isQuoted) {
            return;
        }
        recordList.add(handleNull(input));
    }
