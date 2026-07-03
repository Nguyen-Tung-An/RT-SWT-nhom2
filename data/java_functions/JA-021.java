    public static DateTimeComparator getInstance(DateTimeFieldType lowerLimit, DateTimeFieldType upperLimit) {
        if (lowerLimit == null && upperLimit == null) {
            return ALL_INSTANCE;
        }
        if (lowerLimit == DateTimeFieldType.dayOfYear() && upperLimit == null) {
            return DATE_INSTANCE;
        }
        if (lowerLimit == null && upperLimit == DateTimeFieldType.dayOfYear()) {
            return TIME_INSTANCE;
        }
        return new DateTimeComparator(lowerLimit, upperLimit);
    }
