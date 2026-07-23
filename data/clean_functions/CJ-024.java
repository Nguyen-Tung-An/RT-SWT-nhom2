    public CSVPrinter(final Appendable appendable, final CSVFormat format) throws IOException {
        Objects.requireNonNull(appendable, "appendable");
        Objects.requireNonNull(format, "format");
        this.appendable = appendable;
        this.format = format.copy();
        // TODO: Is it a good idea to do this here instead of on the first call to a print method?
        // It seems a pain to have to track whether the header has already been printed or not.
        final String[] headerComments = format.getHeaderComments();
        if (headerComments != null) {
            for (final String line : headerComments) {
                printComment(line);
            }
        }
        if (format.getHeader() != null && !format.getSkipHeaderRecord()) {
            this.printRecord((Object[]) format.getHeader());
        }
    }
