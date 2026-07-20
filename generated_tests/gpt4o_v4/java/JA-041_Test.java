import org.joda.time.DateTimeZone;
import org.joda.time.DateTimeZone.Provider;
import org.joda.time.DateTimeZone.UTCProvider;
import org.joda.time.DateTimeZone.ZoneInfoProvider;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DateTimeZoneTest {

    @Test
    void testGetDefaultProviderWithSystemPropertyProvider() throws Exception {
        System.setProperty("org.joda.time.DateTimeZone.Provider", "com.example.CustomProvider");
        Method m = DateTimeZone.class.getDeclaredMethod("getDefaultProvider");
        m.setAccessible(true);
        Provider result = (Provider) m.invoke(null);
        assertEquals("com.example.CustomProvider", result.getClass().getName());
    }

    @Test
    void testGetDefaultProviderWithInvalidProviderClass() throws Exception {
        System.setProperty("org.joda.time.DateTimeZone.Provider", "java.lang.String");
        Method m = DateTimeZone.class.getDeclaredMethod("getDefaultProvider");
        m.setAccessible(true);
        assertThrows(IllegalArgumentException.class, () -> {
            try {
                m.invoke(null);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }

    @Test
    void testGetDefaultProviderWithSystemPropertyFolder() throws Exception {
        System.setProperty("org.joda.time.DateTimeZone.Folder", "/path/to/data");
        Method m = DateTimeZone.class.getDeclaredMethod("getDefaultProvider");
        m.setAccessible(true);
        Provider result = (Provider) m.invoke(null);
        assertEquals(ZoneInfoProvider.class, result.getClass());
    }

    @Test
    void testGetDefaultProviderWithInvalidFolder() throws Exception {
        System.setProperty("org.joda.time.DateTimeZone.Folder", "/invalid/path");
        Method m = DateTimeZone.class.getDeclaredMethod("getDefaultProvider");
        m.setAccessible(true);
        assertThrows(RuntimeException.class, () -> {
            try {
                m.invoke(null);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }

    @Test
    void testGetDefaultProviderWithDefaultProvider() throws Exception {
        Method m = DateTimeZone.class.getDeclaredMethod("getDefaultProvider");
        m.setAccessible(true);
        Provider result = (Provider) m.invoke(null);
        assertEquals(UTCProvider.class, result.getClass());
    }
}