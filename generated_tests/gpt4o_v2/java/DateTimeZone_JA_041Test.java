import org.joda.time.DateTimeZone;
import org.joda.time.DateTimeZone.Provider;
import org.joda.time.DateTimeZone.UTCProvider;
import org.joda.time.DateTimeZone.ZoneInfoProvider;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeZoneTest {

    @Test
    void testGetDefaultProviderWithCustomProvider() {
        System.setProperty("org.joda.time.DateTimeZone.Provider", "com.example.CustomProvider");
        Provider provider = invokeGetDefaultProvider();
        assertNotNull(provider);
        assertTrue(provider instanceof com.example.CustomProvider);
    }

    @Test
    void testGetDefaultProviderWithInvalidProviderClass() {
        System.setProperty("org.joda.time.DateTimeZone.Provider", "java.lang.String");
        RuntimeException exception = assertThrows(RuntimeException.class, this::invokeGetDefaultProvider);
        assertTrue(exception.getCause() instanceof IllegalArgumentException);
    }

    @Test
    void testGetDefaultProviderWithFolder() {
        System.setProperty("org.joda.time.DateTimeZone.Folder", "path/to/valid/folder");
        Provider provider = invokeGetDefaultProvider();
        assertNotNull(provider);
        assertTrue(provider instanceof ZoneInfoProvider);
    }

    @Test
    void testGetDefaultProviderWithInvalidFolder() {
        System.setProperty("org.joda.time.DateTimeZone.Folder", "path/to/invalid/folder");
        RuntimeException exception = assertThrows(RuntimeException.class, this::invokeGetDefaultProvider);
        assertNotNull(exception);
    }

    @Test
    void testGetDefaultProviderWithDefaultProvider() {
        // Clear any properties to ensure default provider is used
        System.clearProperty("org.joda.time.DateTimeZone.Provider");
        System.clearProperty("org.joda.time.DateTimeZone.Folder");
        Provider provider = invokeGetDefaultProvider();
        assertNotNull(provider);
        assertTrue(provider instanceof UTCProvider);
    }

    private Provider invokeGetDefaultProvider() {
        try {
            Method method = DateTimeZone.class.getDeclaredMethod("getDefaultProvider");
            method.setAccessible(true);
            return (Provider) method.invoke(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}