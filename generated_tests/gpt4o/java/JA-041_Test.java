package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeZoneTest {

    @Test
    void testGetDefaultProvider_WithSystemPropertyProvider() {
        System.setProperty("org.joda.time.DateTimeZone.Provider", "org.joda.time.SomeCustomProvider");
        Provider provider = DateTimeZone.getDefaultProvider();
        assertNotNull(provider);
        assertTrue(provider instanceof SomeCustomProvider);
    }

    @Test
    void testGetDefaultProvider_WithInvalidProviderClass() {
        System.setProperty("org.joda.time.DateTimeZone.Provider", "java.lang.String");
        Exception exception = assertThrows(RuntimeException.class, () -> {
            DateTimeZone.getDefaultProvider();
        });
        assertTrue(exception.getCause() instanceof IllegalArgumentException);
    }

    @Test
    void testGetDefaultProvider_WithDataFolder() {
        System.setProperty("org.joda.time.DateTimeZone.Folder", "/path/to/data");
        Provider provider = DateTimeZone.getDefaultProvider();
        assertNotNull(provider);
        assertTrue(provider instanceof ZoneInfoProvider);
    }

    @Test
    void testGetDefaultProvider_WithInvalidDataFolder() {
        System.setProperty("org.joda.time.DateTimeZone.Folder", "/invalid/path");
        Exception exception = assertThrows(RuntimeException.class, () -> {
            DateTimeZone.getDefaultProvider();
        });
        assertNotNull(exception);
    }

    @Test
    void testGetDefaultProvider_UsingDefaultPath() {
        Provider provider = DateTimeZone.getDefaultProvider();
        assertNotNull(provider);
        assertTrue(provider instanceof ZoneInfoProvider);
    }

    @Test
    void testGetDefaultProvider_UsingUTCProvider() {
        System.clearProperty("org.joda.time.DateTimeZone.Provider");
        System.clearProperty("org.joda.time.DateTimeZone.Folder");
        Provider provider = DateTimeZone.getDefaultProvider();
        assertNotNull(provider);
        assertTrue(provider instanceof UTCProvider);
    }
}