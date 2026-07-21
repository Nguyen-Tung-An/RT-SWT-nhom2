package com.google.gson.internal.bind;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleTypeFactoryTest {

    private static class TestSerializer implements JsonSerializer<Object> {
        @Override
        public Object serialize(Object src, java.lang.reflect.Type typeOfSrc, com.google.gson.JsonSerializationContext context) {
            return null;
        }
    }

    private static class TestDeserializer implements JsonDeserializer<Object> {
        @Override
        public Object deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) {
            return null;
        }
    }

    @Test
    void testSingleTypeFactory_WithSerializer() {
        SingleTypeFactory factory = new SingleTypeFactory(new TestSerializer(), TypeToken.get(Object.class), false, null);
        assertNotNull(factory);
    }

    @Test
    void testSingleTypeFactory_WithDeserializer() {
        SingleTypeFactory factory = new SingleTypeFactory(new TestDeserializer(), TypeToken.get(Object.class), false, null);
        assertNotNull(factory);
    }

    @Test
    void testSingleTypeFactory_WithBoth() {
        SingleTypeFactory factory = new SingleTypeFactory(new TestSerializer(), TypeToken.get(Object.class), true, Object.class);
        assertNotNull(factory);
    }

    @Test
    void testSingleTypeFactory_WithNeither() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new SingleTypeFactory(new Object(), TypeToken.get(Object.class), false, null);
        });
        assertTrue(exception.getMessage().contains("Type adapter"));
    }
}