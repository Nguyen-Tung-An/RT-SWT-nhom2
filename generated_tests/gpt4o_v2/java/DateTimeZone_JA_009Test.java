import org.joda.time.DateTimeZone;
import org.joda.time.DateTimeZone.Provider;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeZoneTest {

    private static class TestProvider implements Provider {
        private final Set<String> availableIDs;
        private final DateTimeZone zone;

        TestProvider(Set<String> availableIDs, DateTimeZone zone) {
            this.availableIDs = availableIDs;
            this.zone = zone;
        }

        @Override
        public Set<String> getAvailableIDs() {
            return availableIDs;
        }

        @Override
        public DateTimeZone getZone(String id) {
            return "UTC".equals(id) ? zone : null;
        }
    }

    @Test
    void testValidateProvider_EmptyAvailableIDs() {
        TestProvider provider = new TestProvider(Collections.emptySet(), DateTimeZone.UTC);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            DateTimeZone.validateProvider(provider);
        });
        assertEquals("The provider doesn't have any available ids", exception.getMessage());
    }

    @Test
    void testValidateProvider_NullAvailableIDs() {
        TestProvider provider = new TestProvider(null, DateTimeZone.UTC);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            DateTimeZone.validateProvider(provider);
        });
        assertEquals("The provider doesn't have any available ids", exception.getMessage());
    }

    @Test
    void testValidateProvider_NoUTC() {
        Set<String> availableIDs = new HashSet<>();
        availableIDs.add("GMT");
        TestProvider provider = new TestProvider(availableIDs, DateTimeZone.UTC);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            DateTimeZone.validateProvider(provider);
        });
        assertEquals("The provider doesn't support UTC", exception.getMessage());
    }

    @Test
    void testValidateProvider_InvalidUTCZone() {
        Set<String> availableIDs = new HashSet<>();
        availableIDs.add("UTC");
        TestProvider provider = new TestProvider(availableIDs, DateTimeZone.forID("GMT"));
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            DateTimeZone.validateProvider(provider);
        });
        assertEquals("Invalid UTC zone provided", exception.getMessage());
    }

    @Test
    void testValidateProvider_ValidProvider() {
        Set<String> availableIDs = new HashSet<>();
        availableIDs.add("UTC");
        TestProvider provider = new TestProvider(availableIDs, DateTimeZone.UTC);
        Provider result = DateTimeZone.validateProvider(provider);
        assertNotNull(result);
        assertSame(provider, result);
    }
}