package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class DateTimeZoneTest {

    private static class MockProvider implements Provider {
        private final Set<String> availableIDs;
        private final DateTimeZone zone;

        MockProvider(Set<String> availableIDs, DateTimeZone zone) {
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
    void testValidateProvider_NoAvailableIDs() {
        MockProvider provider = new MockProvider(Collections.emptySet(), null);
        assertThrows(IllegalArgumentException.class, () -> {
            DateTimeZone.validateProvider(provider);
        });
    }

    @Test
    void testValidateProvider_NoUTC() {
        Set<String> ids = new HashSet<>();
        ids.add("GMT");
        MockProvider provider = new MockProvider(ids, null);
        assertThrows(IllegalArgumentException.class, () -> {
            DateTimeZone.validateProvider(provider);
        });
    }

    @Test
    void testValidateProvider_InvalidUTCZone() {
        Set<String> ids = new HashSet<>();
        ids.add("UTC");
        MockProvider provider = new MockProvider(ids, null);
        assertThrows(IllegalArgumentException.class, () -> {
            DateTimeZone.validateProvider(provider);
        });
    }

    @Test
    void testValidateProvider_ValidProvider() {
        Set<String> ids = new HashSet<>();
        ids.add("UTC");
        MockProvider provider = new MockProvider(ids, DateTimeZone.UTC);
        assertEquals(provider, DateTimeZone.validateProvider(provider));
    }
}