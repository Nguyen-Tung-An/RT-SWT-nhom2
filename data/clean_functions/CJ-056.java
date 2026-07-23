    public TableDefinition getTableDefinition(final Iterable<Option> options) {
        // set up the base TextStyle for the columns configured for the Option opt and arg values.
        final TextStyle.Builder builder = TextStyle.builder().setAlignment(TextStyle.Alignment.LEFT).setIndent(DEFAULT_LEFT_PAD).setScalable(false);
        final List<TextStyle> styles = new ArrayList<>();
        styles.add(builder.get());
        // set up showSince column
        builder.setScalable(true).setLeftPad(DEFAULT_COLUMN_SPACING);
        if (showSince) {
            builder.setAlignment(TextStyle.Alignment.CENTER);
            styles.add(builder.get());
        }
        // set up the description column.
        builder.setAlignment(TextStyle.Alignment.LEFT);
        styles.add(builder.get());
        // setup the rows for the table.
        final List<List<String>> rows = new ArrayList<>();
        final StringBuilder sb = new StringBuilder();
        options.forEach(option -> {
            final List<String> row = new ArrayList<>();
            // create an option formatter to correctly format the parts of the option
            final OptionFormatter formatter = getOptionFormatBuilder().build(option);
            sb.setLength(0);
            // append the opt values.
            sb.append(formatter.getBothOpt());
            // append the arg name if it exists.
            if (option.hasArg()) {
                sb.append(" ").append(formatter.getArgName());
            }
            row.add(sb.toString());
            // append the "since" value if desired.
            if (showSince) {
                row.add(formatter.getSince());
            }
            // add the option description
            row.add(formatter.getDescription());
            rows.add(row);
        });
        // return the TableDefinition with the proper column headers.
        List<String> headers = new ArrayList<>(3);
        headers.add(LABEL_OPTIONS);
        if (showSince) {
            headers.add(LABEL_SINCE);
        }
        headers.add(LABEL_DESCRIPTION);
        return TableDefinition.from("", styles, headers, rows);
    }
