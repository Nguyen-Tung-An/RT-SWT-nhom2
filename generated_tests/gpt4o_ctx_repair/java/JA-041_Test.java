package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeZoneTest {

    @Test
    void testGetDefaultProvider_UsingSystemProperty() {
        System.setProperty("org.joda.time.DateTimeZone.Provider", "org.joda.time.SomeCustomProvider");
        Provider provider = DateTimeZone.getDefaultProvider();
        assertNotNull(provider);
        assertTrue(provider instanceof SomeCustomProvider);
    }

    @Test
    void testGetDefaultProvider_UsingDataFolder() {
        System.setProperty("org.joda.time.DateTimeZone.Folder", "/path/to/data");
        Provider provider = DateTimeZone.getDefaultProvider();
        assertNotNull(provider);
        assertTrue(provider instanceof ZoneInfoProvider);
    }

    @Test
    void testGetDefaultProvider_UsingDefaultPath() {
        Provider provider = DateTimeZone.getDefaultProvider();
        assertNotNull(provider);
        assertTrue(provider instanceof ZoneInfoProvider);
    }

    @Test
    void testGetDefaultProvider_ReturnsUTCProvider() {
        // Clear any system properties to ensure we get the default
        System.clearProperty("org.joda.time.DateTimeZone.Provider");
        System.clearProperty("org.joda.time.DateTimeZone.Folder");
        
        Provider provider = DateTimeZone.getDefaultProvider();
        assertNotNull(provider);
        assertTrue(provider instanceof UTCProvider);
    }
}