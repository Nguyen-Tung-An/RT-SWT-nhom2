    public boolean equals(Object object) {
        if (object instanceof DateTimeComparator) {
            DateTimeComparator other = (DateTimeComparator) object;
            return (iLowerLimit == other.getLowerLimit() ||
                    (iLowerLimit != null && iLowerLimit.equals(other.getLowerLimit()))) &&
                   (iUpperLimit == other.getUpperLimit() ||
                    (iUpperLimit != null && iUpperLimit.equals(other.getUpperLimit())));
        }
        return false;
    }
