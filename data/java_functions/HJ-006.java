    public String toSyntaxOptions(final OptionGroup group) {
        final StringBuilder buff = new StringBuilder();
        final List<Option> optList = sort(group.getOptions());
        OptionFormatter formatter = null;
        // for each option in the OptionGroup
        final Iterator<Option> iter = optList.iterator();
        while (iter.hasNext()) {
            formatter = optionFormatBuilder.build(iter.next());
            // whether the option is required or not is handled at group level
            buff.append(formatter.toSyntaxOption(true));
            if (iter.hasNext()) {
                buff.append(optionGroupSeparator);
            }
        }
        if (formatter != null) {
            return group.isRequired() ? buff.toString() : formatter.toOptional(buff.toString());
        }
        return ""; // there were no entries in the group.
    }
