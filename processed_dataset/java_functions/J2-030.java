    public static IslamicChronology getInstance(DateTimeZone zone, LeapYearPatternType leapYears) {
        if (zone == null) {
            zone = DateTimeZone.getDefault();
        }
        IslamicChronology chrono;
        IslamicChronology[] chronos = cCache.get(zone);
        if (chronos == null) {
            chronos = new IslamicChronology[4];
            IslamicChronology[] oldChronos = cCache.putIfAbsent(zone, chronos);
            if (oldChronos != null) {
                chronos = oldChronos;
            }
        }
        chrono = chronos[leapYears.index];
        if (chrono == null) {
            synchronized (chronos) {
                chrono = chronos[leapYears.index];
                if (chrono == null) {
                    if (zone == DateTimeZone.UTC) {
                        // First create without a lower limit.
                        chrono = new IslamicChronology(null, null, leapYears);
                        // Impose lower limit and make another IslamicChronology.
                        DateTime lowerLimit = new DateTime(1, 1, 1, 0, 0, 0, 0, chrono);
                        chrono = new IslamicChronology(
                            LimitChronology.getInstance(chrono, lowerLimit, null),
                             null, leapYears);
                    } else {
                        chrono = getInstance(DateTimeZone.UTC, leapYears);
                        chrono = new IslamicChronology
                            (ZonedChronology.getInstance(chrono, zone), null, leapYears);
                    }
                    chronos[leapYears.index] = chrono;
                }
            }
        }
        return chrono;
    }
