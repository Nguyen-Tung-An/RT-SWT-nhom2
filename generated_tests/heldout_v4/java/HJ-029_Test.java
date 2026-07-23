package com.google.gson.internal.bind;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonAdapterAnnotationTypeAdapterFactoryTest {

    private final ConstructorConstructor constructorConstructor = new ConstructorConstructor();
    private final JsonAdapterAnnotationTypeAdapterFactory instance = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);

    @Test
    void testIsClassJsonAdapterFactoryWithTreeTypeClassDummyFactory() {
        TypeToken<?> typeToken = TypeToken.get(String.class);
        TypeAdapterFactory factory = JsonAdapterAnnotationTypeAdapterFactory.TREE_TYPE_CLASS_DUMMY_FACTORY;

        assertTrue(instance.isClassJsonAdapterFactory(typeToken, factory));
    }

    @Test
    void testIsClassJsonAdapterFactoryWithExistingFactory() {
        TypeToken<?> typeToken = TypeToken.get(String.class);
        TypeAdapterFactory factory = new CustomTypeAdapterFactory(); // Assume this is a valid factory

        instance.putFactoryAndGetCurrent(String.class, factory); // Simulate existing factory

        assertTrue(instance.isClassJsonAdapterFactory(typeToken, factory));
    }

    @Test
    void testIsClassJsonAdapterFactoryWithNullTypeToken() {
        TypeAdapterFactory factory = new CustomTypeAdapterFactory(); // Assume this is a valid factory

        assertThrows(NullPointerException.class, () -> {
            instance.isClassJsonAdapterFactory(null, factory);
        });
    }

    @Test
    void testIsClassJsonAdapterFactoryWithNullFactory() {
        TypeToken<?> typeToken = TypeToken.get(String.class);

        assertThrows(NullPointerException.class, () -> {
            instance.isClassJsonAdapterFactory(typeToken, null);
        });
    }

    @Test
    void testIsClassJsonAdapterFactoryWithNoAnnotation() {
        TypeToken<?> typeToken = TypeToken.get(Object.class); // Assume Object has no @JsonAdapter
        TypeAdapterFactory factory = new CustomTypeAdapterFactory(); // Assume this is a valid factory

        assertFalse(instance.isClassJsonAdapterFactory(typeToken, factory));
    }

    @Test
    void testIsClassJsonAdapterFactoryWithInvalidAdapterClass() {
        TypeToken<?> typeToken = TypeToken.get(String.class);
        TypeAdapterFactory factory = new CustomTypeAdapterFactory(); // Assume this is a valid factory

        instance.putFactoryAndGetCurrent(String.class, factory); // Simulate existing factory

        // Simulate a scenario where the adapter class is not assignable
        assertFalse(instance.isClassJsonAdapterFactory(typeToken, new InvalidTypeAdapterFactory()));
    }

    private static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        // Implementation details...
    }

    private static class InvalidTypeAdapterFactory {
        // Implementation details...
    }
}