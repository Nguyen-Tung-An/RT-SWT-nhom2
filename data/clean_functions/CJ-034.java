    public boolean equals(Object readableInterval) {
        if (this == readableInterval) {
            return true;
        }
        if (readableInterval instanceof ReadableInterval == false) {
            return false;
        }
        ReadableInterval other = (ReadableInterval) readableInterval;
        return 
            getStartMillis() == other.getStartMillis() &&
            getEndMillis() == other.getEndMillis() &&
            FieldUtils.equals(getChronology(), other.getChronology());
    }
