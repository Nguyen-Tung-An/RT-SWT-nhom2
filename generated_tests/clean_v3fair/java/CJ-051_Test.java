package com.google.gson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GsonBuilderTest {

    @Test
    void testRegisterTypeHierarchyAdapter_WithJsonSerializer() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter(Number.class, new JsonSerializer<Number>() {
            @Override
            public JsonElement serialize(Number src, Type typeOfSrc, JsonSerializationContext context) {
                return new JsonPrimitive(src.toString());
            }
        });
    }

    @Test
    void testRegisterTypeHierarchyAdapter_WithJsonDeserializer() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter(String.class, new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
                return json.getAsString();
            }
        });
    }

    @Test
    void testRegisterTypeHierarchyAdapter_WithTypeAdapter() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter(Boolean.class, new TypeAdapter<Boolean>() {
            @Override
            public void write(JsonWriter out, Boolean value) throws IOException {
                out.value(value);
            }

            @Override
            public Boolean read(JsonReader in) throws IOException {
                return in.nextBoolean();
            }
        });
    }

    @Test
    void testRegisterTypeHierarchyAdapter_WithNullBaseType() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Exception exception = assertThrows(NullPointerException.class, () -> {
            gsonBuilder.registerTypeHierarchyAdapter(null, new JsonSerializer<Object>() {});
        });
        assertEquals("baseType == null", exception.getMessage());
    }

    @Test
    void testRegisterTypeHierarchyAdapter_WithNullTypeAdapter() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Exception exception = assertThrows(NullPointerException.class, () -> {
            gsonBuilder.registerTypeHierarchyAdapter(Number.class, null);
        });
        assertEquals("typeAdapter == null", exception.getMessage());
    }

    @Test
    void testRegisterTypeHierarchyAdapter_WithInvalidTypeAdapter() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            gsonBuilder.registerTypeHierarchyAdapter(Number.class, new Object());
        });
        assertTrue(exception.getMessage().contains("Class java.lang.Object does not implement any supported type adapter class or interface"));
    }
}