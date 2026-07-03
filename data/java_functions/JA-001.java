    public String toString() {
        if (iLowerLimit == iUpperLimit) {
            return "DateTimeComparator["
                + (iLowerLimit == null ? "" : iLowerLimit.getName())
                + "]";
        } else {
            return "DateTimeComparator["
                + (iLowerLimit == null ? "" : iLowerLimit.getName())
                + "-"
                + (iUpperLimit == null ? "" : iUpperLimit.getName())
                + "]";
        }
    }
