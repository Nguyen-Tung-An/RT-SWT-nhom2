package com.google.gson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GsonBuilderTest {

    @Test
    void testRegisterTypeHierarchyAdapter_WithJsonSerializer() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        JsonSerializer<Object> serializer = (src, typeOfSrc, context) -> null;
        gsonBuilder.registerTypeHierarchyAdapter(Object.class, serializer);
        // Additional assertions can be added to verify the state of gsonBuilder if needed
    }

    @Test
    void testRegisterTypeHierarchyAdapter_WithJsonDeserializer() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        JsonDeserializer<Object> deserializer = (json, typeOfT, context) -> null;
        gsonBuilder.registerTypeHierarchyAdapter(Object.class, deserializer);
        // Additional assertions can be added to verify the state of gsonBuilder if needed
    }

    @Test
    void testRegisterTypeHierarchyAdapter_WithTypeAdapter() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        TypeAdapter<Object> typeAdapter = new TypeAdapter<Object>() {
            @Override
            public void write(JsonWriter out, Object value) throws IOException {
            }

            @Override
            public Object read(JsonReader in) throws IOException {
                return null;
            }
        };
        gsonBuilder.registerTypeHierarchyAdapter(Object.class, typeAdapter);
        // Additional assertions can be added to verify the state of gsonBuilder if needed
    }

    @Test
    void testRegisterTypeHierarchyAdapter_WithInvalidTypeAdapter() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        assertThrows(IllegalArgumentException.class, () -> {
            gsonBuilder.registerTypeHierarchyAdapter(Object.class, new Object());
        });
    }

    @Test
    void testRegisterTypeHierarchyAdapter_WithNullBaseType() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        assertThrows(NullPointerException.class, () -> {
            gsonBuilder.registerTypeHierarchyAdapter(null, new JsonSerializer<Object>() {});
        });
    }

    @Test
    void testRegisterTypeHierarchyAdapter_WithNullTypeAdapter() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        assertThrows(NullPointerException.class, () -> {
            gsonBuilder.registerTypeHierarchyAdapter(Object.class, null);
        });
    }
}