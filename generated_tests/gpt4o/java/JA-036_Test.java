package com.google.gson.typeadapters;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtcDateTypeAdapterTest {

    @Test
    void testParseInt_ValidInput() {
        assertEquals(123, UtcDateTypeAdapter.parseInt("123", 0, 3));
    }

    @Test
    void testParseInt_LeadingZeros() {
        assertEquals(45, UtcDateTypeAdapter.parseInt("045", 0, 3));
    }

    @Test
    void testParseInt_EmptyString() {
        assertThrows(NumberFormatException.class, () -> {
            UtcDateTypeAdapter.parseInt("", 0, 0);
        });
    }

    @Test
    void testParseInt_InvalidCharacter() {
        assertThrows(NumberFormatException.class, () -> {
            UtcDateTypeAdapter.parseInt("12a3", 0, 4);
        });
    }

    @Test
    void testParseInt_BeginIndexOutOfBounds() {
        assertThrows(NumberFormatException.class, () -> {
            UtcDateTypeAdapter.parseInt("123", -1, 3);
        });
    }

    @Test
    void testParseInt_EndIndexOutOfBounds() {
        assertThrows(NumberFormatException.class, () -> {
            UtcDateTypeAdapter.parseInt("123", 0, 5);
        });
    }

    @Test
    void testParseInt_BeginIndexGreaterThanEndIndex() {
        assertThrows(NumberFormatException.class, () -> {
            UtcDateTypeAdapter.parseInt("123", 2, 1);
        });
    }
}