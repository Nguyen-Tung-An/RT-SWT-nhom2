    public static synchronized UnsupportedDateTimeField getInstance(
            DateTimeFieldType type, DurationField durationField) {

        UnsupportedDateTimeField field;
        if (cCache == null) {
            cCache = new HashMap<DateTimeFieldType, UnsupportedDateTimeField>(7);
            field = null;
        } else {
            field = cCache.get(type);
            if (field != null && field.getDurationField() != durationField) {
                field = null;
            }
        }
        if (field == null) {
            field = new UnsupportedDateTimeField(type, durationField);
            cCache.put(type, field);
        }
        return field;
    }
