    private void appendOptionGroup(final StringBuilder buff, final OptionGroup optionGroup) {
        if (!optionGroup.isRequired()) {
            buff.append("[");
        }
        final List<Option> optList = new ArrayList<>(optionGroup.getOptions());
        if (getOptionComparator() != null) {
            Collections.sort(optList, getOptionComparator());
        }
        // for each option in the OptionGroup
        for (final Iterator<Option> it = optList.iterator(); it.hasNext();) {
            // whether the option is required or not is handled at group level
            appendOption(buff, it.next(), true);
            if (it.hasNext()) {
                buff.append(AbstractHelpFormatter.DEFAULT_OPTION_GROUP_SEPARATOR);
            }
        }
        if (!optionGroup.isRequired()) {
            buff.append("]");
        }
    }
