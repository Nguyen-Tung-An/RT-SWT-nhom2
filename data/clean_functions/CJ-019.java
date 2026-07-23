    public Chronology withZone(DateTimeZone zone) {
        if (zone == null) {
            zone = DateTimeZone.getDefault();
        }
        if (zone == getZone()) {
            return this;
        }

        if (zone == DateTimeZone.UTC && iWithUTC != null) {
            return iWithUTC;
        }

        DateTime lowerLimit = iLowerLimit;
        if (lowerLimit != null) {
            MutableDateTime mdt = lowerLimit.toMutableDateTime();
            mdt.setZoneRetainFields(zone);
            lowerLimit = mdt.toDateTime();
        }

        DateTime upperLimit = iUpperLimit;
        if (upperLimit != null) {
            MutableDateTime mdt = upperLimit.toMutableDateTime();
            mdt.setZoneRetainFields(zone);
            upperLimit = mdt.toDateTime();
        }
        
        LimitChronology chrono = getInstance
            (getBase().withZone(zone), lowerLimit, upperLimit);

        if (zone == DateTimeZone.UTC) {
            iWithUTC = chrono;
        }

        return chrono;
    }
