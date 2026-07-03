    private void printWithQuotes(final Reader reader, final Appendable appendable) throws IOException {
        if (getQuoteMode() == QuoteMode.NONE) {
            printWithEscapes(reader, appendable);
            return;
        }
        final char quote = getQuoteCharacter().charValue(); // Explicit unboxing is intentional
        final char escape = isEscapeCharacterSet() ? getEscapeChar() : quote;
        // (1) Append opening quote
        append(quote, appendable);
        // (2) Append Reader contents, doubling quotes and escape characters
        int c;
        while (EOF != (c = reader.read())) {
            append((char) c, appendable);
            if (c == quote || c == escape) {
                append((char) c, appendable);
            }
        }
        // (3) Append closing quote
        append(quote, appendable);
    }
