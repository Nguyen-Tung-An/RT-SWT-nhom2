    public static EthiopicChronology getInstance(DateTimeZone zone, int minDaysInFirstWeek) {
        if (zone == null) {
            zone = DateTimeZone.getDefault();
        }
        EthiopicChronology chrono;
        EthiopicChronology[] chronos = cCache.get(zone);
        if (chronos == null) {
            chronos = new EthiopicChronology[7];
            EthiopicChronology[] oldChronos = cCache.putIfAbsent(zone, chronos);
            if (oldChronos != null) {
                chronos = oldChronos;
            }
        }
        try {
            chrono = chronos[minDaysInFirstWeek - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException
                ("Invalid min days in first week: " + minDaysInFirstWeek);
        }

        if (chrono == null) {
            synchronized (chronos) {
                chrono = chronos[minDaysInFirstWeek - 1];
                if (chrono == null) {
                    if (zone == DateTimeZone.UTC) {
                        // First create without a lower limit.
                        chrono = new EthiopicChronology(null, null, minDaysInFirstWeek);
                        // Impose lower limit and make another EthiopicChronology.
                        DateTime lowerLimit = new DateTime(1, 1, 1, 0, 0, 0, 0, chrono);
                        chrono = new EthiopicChronology
                            (LimitChronology.getInstance(chrono, lowerLimit, null),
                             null, minDaysInFirstWeek);
                    } else {
                        chrono = getInstance(DateTimeZone.UTC, minDaysInFirstWeek);
                        chrono = new EthiopicChronology
                            (ZonedChronology.getInstance(chrono, zone), null, minDaysInFirstWeek);
                    }
                    chronos[minDaysInFirstWeek - 1] = chrono;
                }
            }
        }
        return chrono;
    }
