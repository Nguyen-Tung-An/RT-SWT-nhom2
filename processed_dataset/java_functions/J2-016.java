    public static GJChronology getInstance(
            DateTimeZone zone,
            ReadableInstant gregorianCutover,
            int minDaysInFirstWeek) {
        
        zone = DateTimeUtils.getZone(zone);
        Instant cutoverInstant;
        if (gregorianCutover == null) {
            cutoverInstant = DEFAULT_CUTOVER;
        } else {
            cutoverInstant = gregorianCutover.toInstant();
            LocalDate cutoverDate = new LocalDate(cutoverInstant.getMillis(), GregorianChronology.getInstance(zone));
            if (cutoverDate.getYear() <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }

        GJCacheKey cacheKey = new GJCacheKey(zone, cutoverInstant, minDaysInFirstWeek);
        GJChronology chrono = cCache.get(cacheKey);
        if (chrono == null) {
            if (zone == DateTimeZone.UTC) {
                chrono = new GJChronology
                    (JulianChronology.getInstance(zone, minDaysInFirstWeek),
                     GregorianChronology.getInstance(zone, minDaysInFirstWeek),
                     cutoverInstant);
            } else {
                chrono = getInstance(DateTimeZone.UTC, cutoverInstant, minDaysInFirstWeek);
                chrono = new GJChronology
                    (ZonedChronology.getInstance(chrono, zone),
                     chrono.iJulianChronology,
                     chrono.iGregorianChronology,
                     chrono.iCutoverInstant);
            }
            GJChronology oldChrono = cCache.putIfAbsent(cacheKey, chrono);
            if (oldChrono != null) {
                chrono = oldChrono;
            }
        }
        return chrono;
    }
