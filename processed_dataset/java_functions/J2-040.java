    public static JulianChronology getInstance(DateTimeZone zone, int minDaysInFirstWeek) {
        if (zone == null) {
            zone = DateTimeZone.getDefault();
        }
        JulianChronology chrono;
        JulianChronology[] chronos = cCache.get(zone);
        if (chronos == null) {
            chronos = new JulianChronology[7];
            JulianChronology[] oldChronos = cCache.putIfAbsent(zone, chronos);
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
                        chrono = new JulianChronology(null, null, minDaysInFirstWeek);
                    } else {
                        chrono = getInstance(DateTimeZone.UTC, minDaysInFirstWeek);
                        chrono = new JulianChronology
                            (ZonedChronology.getInstance(chrono, zone), null, minDaysInFirstWeek);
                    }
                    chronos[minDaysInFirstWeek - 1] = chrono;
                }
            }
        }
        return chrono;
    }
