package com.google.gson.internal.bind;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleTypeFactoryTest {

    @Test
    void testConstructorWithJsonSerializer() {
        JsonSerializer<Object> serializer = new JsonSerializer<Object>() {
            @Override
            public Object serialize(Object src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
                return null;
            }
        };
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        TreeTypeAdapter.SingleTypeFactory factory = new TreeTypeAdapter.SingleTypeFactory(serializer, typeToken, true, null);
        assertNotNull(factory);
    }

    @Test
    void testConstructorWithJsonDeserializer() {
        JsonDeserializer<Object> deserializer = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) {
                return null;
            }
        };
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        TreeTypeAdapter.SingleTypeFactory factory = new TreeTypeAdapter.SingleTypeFactory(deserializer, typeToken, false, null);
        assertNotNull(factory);
    }

    @Test
    void testConstructorWithNullTypeAdapter() {
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new TreeTypeAdapter.SingleTypeFactory(null, typeToken, true, null);
        });
        assertEquals("Type adapter must implement JsonSerializer or JsonDeserializer", exception.getMessage());
    }

    @Test
    void testConstructorWithNonJsonTypeAdapter() {
        Object nonJsonTypeAdapter = new Object();
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new TreeTypeAdapter.SingleTypeFactory(nonJsonTypeAdapter, typeToken, true, null);
        });
        assertTrue(exception.getMessage().contains("Type adapter " + nonJsonTypeAdapter.getClass().getName() + " must implement JsonSerializer or JsonDeserializer"));
    }
}