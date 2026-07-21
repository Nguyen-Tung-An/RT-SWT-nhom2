package com.google.gson.internal.bind;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapTypeAdapterFactoryTest {

    private final MapTypeAdapterFactory adapter = new MapTypeAdapterFactory();

    @Test
    void testKeyToString_Number() {
        JsonElement keyElement = new JsonPrimitive(123);
        assertEquals("123", adapter.keyToString(keyElement));
    }

    @Test
    void testKeyToString_BooleanTrue() {
        JsonElement keyElement = new JsonPrimitive(true);
        assertEquals("true", adapter.keyToString(keyElement));
    }

    @Test
    void testKeyToString_BooleanFalse() {
        JsonElement keyElement = new JsonPrimitive(false);
        assertEquals("false", adapter.keyToString(keyElement));
    }

    @Test
    void testKeyToString_String() {
        JsonElement keyElement = new JsonPrimitive("test");
        assertEquals("test", adapter.keyToString(keyElement));
    }

    @Test
    void testKeyToString_Null() {
        JsonElement keyElement = JsonNull.INSTANCE;
        assertEquals("null", adapter.keyToString(keyElement));
    }

    @Test
    void testKeyToString_InvalidPrimitive() {
        JsonElement keyElement = new JsonPrimitive(new Object());
        assertThrows(AssertionError.class, () -> adapter.keyToString(keyElement));
    }

    @Test
    void testKeyToString_NotJsonPrimitive() {
        JsonElement keyElement = new JsonElement() {
            @Override
            public boolean isJsonPrimitive() {
                return false;
            }

            @Override
            public boolean isJsonNull() {
                return false;
            }
        };
        assertThrows(AssertionError.class, () -> adapter.keyToString(keyElement));
    }
}