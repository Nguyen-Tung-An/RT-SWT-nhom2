package com.google.gson.internal.bind;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MapTypeAdapterFactoryAdapterTest {

    @Test
    void testKeyToStringWithNumber() throws Exception {
        MapTypeAdapterFactory.Adapter instance = new MapTypeAdapterFactory.Adapter(null, null, null);
        Field f = MapTypeAdapterFactory.Adapter.class.getDeclaredField("keyTypeAdapter");
        f.setAccessible(true);
        f.set(instance, null); // Set to a valid value if necessary

        Method m = MapTypeAdapterFactory.Adapter.class.getDeclaredMethod("keyToString", JsonElement.class);
        m.setAccessible(true);

        JsonElement keyElement = new JsonPrimitive(123);
        String result = (String) m.invoke(instance, keyElement);
        assertEquals("123", result);
    }

    @Test
    void testKeyToStringWithBoolean() throws Exception {
        MapTypeAdapterFactory.Adapter instance = new MapTypeAdapterFactory.Adapter(null, null, null);
        Field f = MapTypeAdapterFactory.Adapter.class.getDeclaredField("keyTypeAdapter");
        f.setAccessible(true);
        f.set(instance, null); // Set to a valid value if necessary

        Method m = MapTypeAdapterFactory.Adapter.class.getDeclaredMethod("keyToString", JsonElement.class);
        m.setAccessible(true);

        JsonElement keyElement = new JsonPrimitive(true);
        String result = (String) m.invoke(instance, keyElement);
        assertEquals("true", result);
    }

    @Test
    void testKeyToStringWithString() throws Exception {
        MapTypeAdapterFactory.Adapter instance = new MapTypeAdapterFactory.Adapter(null, null, null);
        Field f = MapTypeAdapterFactory.Adapter.class.getDeclaredField("keyTypeAdapter");
        f.setAccessible(true);
        f.set(instance, null); // Set to a valid value if necessary

        Method m = MapTypeAdapterFactory.Adapter.class.getDeclaredMethod("keyToString", JsonElement.class);
        m.setAccessible(true);

        JsonElement keyElement = new JsonPrimitive("test");
        String result = (String) m.invoke(instance, keyElement);
        assertEquals("test", result);
    }

    @Test
    void testKeyToStringWithJsonNull() throws Exception {
        MapTypeAdapterFactory.Adapter instance = new MapTypeAdapterFactory.Adapter(null, null, null);
        Field f = MapTypeAdapterFactory.Adapter.class.getDeclaredField("keyTypeAdapter");
        f.setAccessible(true);
        f.set(instance, null); // Set to a valid value if necessary

        Method m = MapTypeAdapterFactory.Adapter.class.getDeclaredMethod("keyToString", JsonElement.class);
        m.setAccessible(true);

        JsonElement keyElement = JsonNull.INSTANCE;
        String result = (String) m.invoke(instance, keyElement);
        assertEquals("null", result);
    }

    @Test
    void testKeyToStringWithInvalidJsonElement() throws Exception {
        MapTypeAdapterFactory.Adapter instance = new MapTypeAdapterFactory.Adapter(null, null, null);
        Field f = MapTypeAdapterFactory.Adapter.class.getDeclaredField("keyTypeAdapter");
        f.setAccessible(true);
        f.set(instance, null); // Set to a valid value if necessary

        Method m = MapTypeAdapterFactory.Adapter.class.getDeclaredMethod("keyToString", JsonElement.class);
        m.setAccessible(true);

        JsonElement keyElement = new JsonElement() {
            // Custom JsonElement that is neither a primitive nor null
        };

        assertThrows(AssertionError.class, () -> {
            try {
                m.invoke(instance, keyElement);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }
}