    public static DateTimeZone getDefault() {
        DateTimeZone zone = cDefault.get();
        if (zone == null) {
            try {
                try {
                    String id = System.getProperty("org.joda.time.DateTimeZone.Timezone");
                    if (id != null) {  // null check avoids stack overflow
                        zone = forID(id);
                    }
                } catch (RuntimeException ex) {
                    // ignored
                }
                if (zone == null) {
                    zone = forTimeZone(TimeZone.getDefault());
                }
            } catch (IllegalArgumentException ex) {
                // ignored
            }
            if (zone == null) {
                zone = UTC;
            }
            if (!cDefault.compareAndSet(null, zone)) {
                zone = cDefault.get();
            }
        }
        return zone;
    }
