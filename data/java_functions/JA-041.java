    private static Provider getDefaultProvider() {
        // approach 1
        try {
            String providerClass = System.getProperty("org.joda.time.DateTimeZone.Provider");
            if (providerClass != null) {
                try {
                    // do not initialize the class until the type has been checked
                    Class<?> cls = Class.forName(providerClass, false, DateTimeZone.class.getClassLoader());
                    if (!Provider.class.isAssignableFrom(cls)) {
                        throw new IllegalArgumentException("System property referred to class that does not implement " + Provider.class);
                    }
                    Provider provider = cls.asSubclass(Provider.class).getConstructor().newInstance();
                    return validateProvider(provider);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        } catch (SecurityException ex) {
            // ignored
        }
        // approach 2
        try {
            String dataFolder = System.getProperty("org.joda.time.DateTimeZone.Folder");
            if (dataFolder != null) {
                try {
                    Provider provider = new ZoneInfoProvider(new File(dataFolder));
                    return validateProvider(provider);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        } catch (SecurityException ex) {
            // ignored
        }
        // approach 3
        try {
            Provider provider = new ZoneInfoProvider(DEFAULT_TZ_DATA_PATH);
            return validateProvider(provider);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // approach 4
        return new UTCProvider();
    }
