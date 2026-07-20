import org.joda.time.DateTimeZone;
import org.joda.time.DateTimeZone.Provider;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertSame;

class DateTimeZoneTest {

    @Test
    void testValidateProvider_NullAvailableIDs() throws Exception {
        Method m = DateTimeZone.class.getDeclaredMethod("validateProvider", Provider.class);
        m.setAccessible(true);
        
        Provider provider = new Provider() {
            @Override
            public Set<String> getAvailableIDs() {
                return null;
            }

            @Override
            public DateTimeZone getZone(String id) {
                return null;
            }
        };

        assertThrows(IllegalArgumentException.class, () -> {
            try {
                m.invoke(null, provider);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }

    @Test
    void testValidateProvider_EmptyAvailableIDs() throws Exception {
        Method m = DateTimeZone.class.getDeclaredMethod("validateProvider", Provider.class);
        m.setAccessible(true);
        
        Provider provider = new Provider() {
            @Override
            public Set<String> getAvailableIDs() {
                return Collections.emptySet();
            }

            @Override
            public DateTimeZone getZone(String id) {
                return null;
            }
        };

        assertThrows(IllegalArgumentException.class, () -> {
            try {
                m.invoke(null, provider);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }

    @Test
    void testValidateProvider_MissingUTC() throws Exception {
        Method m = DateTimeZone.class.getDeclaredMethod("validateProvider", Provider.class);
        m.setAccessible(true);
        
        Provider provider = new Provider() {
            @Override
            public Set<String> getAvailableIDs() {
                Set<String> ids = new HashSet<>();
                ids.add("GMT");
                return ids;
            }

            @Override
            public DateTimeZone getZone(String id) {
                return null;
            }
        };

        assertThrows(IllegalArgumentException.class, () -> {
            try {
                m.invoke(null, provider);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }

    @Test
    void testValidateProvider_InvalidUTCZone() throws Exception {
        Method m = DateTimeZone.class.getDeclaredMethod("validateProvider", Provider.class);
        m.setAccessible(true);
        
        Provider provider = new Provider() {
            @Override
            public Set<String> getAvailableIDs() {
                Set<String> ids = new HashSet<>();
                ids.add("UTC");
                return ids;
            }

            @Override
            public DateTimeZone getZone(String id) {
                return new DateTimeZone("GMT"); // Invalid zone for UTC
            }
        };

        assertThrows(IllegalArgumentException.class, () -> {
            try {
                m.invoke(null, provider);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }

    @Test
    void testValidateProvider_ValidProvider() throws Exception {
        Method m = DateTimeZone.class.getDeclaredMethod("validateProvider", Provider.class);
        m.setAccessible(true);
        
        Provider provider = new Provider() {
            @Override
            public Set<String> getAvailableIDs() {
                Set<String> ids = new HashSet<>();
                ids.add("UTC");
                return ids;
            }

            @Override
            public DateTimeZone getZone(String id) {
                return DateTimeZone.UTC; // Valid zone for UTC
            }
        };

        Object result = m.invoke(null, provider);
        assertSame(provider, result);
    }
}