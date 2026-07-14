package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DateTimeZoneTest {

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
    void testValidateProvider_NullAvailableIDs() {
        Provider provider = mock(Provider.class);
        when(provider.getAvailableIDs()).thenReturn(null);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            DateTimeZone.validateProvider(provider);
        });
        assertEquals("The provider doesn't have any available ids", exception.getMessage());
    }

    @Test
    void testValidateProvider_EmptyAvailableIDs() {
        Provider provider = mock(Provider.class);
        when(provider.getAvailableIDs()).thenReturn(Collections.emptySet());
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            DateTimeZone.validateProvider(provider);
        });
        assertEquals("The provider doesn't have any available ids", exception.getMessage());
    }

    @Test
    void testValidateProvider_NoUTC() {
        Set<String> ids = new HashSet<>();
        ids.add("GMT");
        Provider provider = new MockProvider(ids, null);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            DateTimeZone.validateProvider(provider);
        });
        assertEquals("The provider doesn't support UTC", exception.getMessage());
    }

    @Test
    void testValidateProvider_InvalidUTCZone() {
        Set<String> ids = new HashSet<>();
        ids.add("UTC");
        Provider provider = new MockProvider(ids, mock(DateTimeZone.class));
        when(provider.getZone("UTC")).thenReturn(mock(DateTimeZone.class));
        when(provider.getZone("UTC")).thenReturn(null);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            DateTimeZone.validateProvider(provider);
        });
        assertEquals("Invalid UTC zone provided", exception.getMessage());
    }

    @Test
    void testValidateProvider_ValidProvider() {
        Set<String> ids = new HashSet<>();
        ids.add("UTC");
        DateTimeZone utcZone = mock(DateTimeZone.class);
        Provider provider = new MockProvider(ids, utcZone);
        assertEquals(provider, DateTimeZone.validateProvider(provider));
    }
}