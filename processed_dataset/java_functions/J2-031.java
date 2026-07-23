    public static LimitChronology getInstance(Chronology base,
                                              ReadableDateTime lowerLimit,
                                              ReadableDateTime upperLimit) {
        if (base == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }

        lowerLimit = lowerLimit == null ? null : lowerLimit.toDateTime();
        upperLimit = upperLimit == null ? null : upperLimit.toDateTime();

        if (lowerLimit != null && upperLimit != null && !lowerLimit.isBefore(upperLimit)) {
            throw new IllegalArgumentException
            ("The lower limit must be come before than the upper limit");
        }

        return new LimitChronology(base, (DateTime)lowerLimit, (DateTime)upperLimit);
    }
