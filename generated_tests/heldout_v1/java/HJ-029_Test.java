package com.google.gson.internal.bind;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyTypeAdapterFactory implements TypeAdapterFactory {}

class JsonAdapterAnnotationTypeAdapterFactoryTest {

    private final JsonAdapterAnnotationTypeAdapterFactory factory = new JsonAdapterAnnotationTypeAdapterFactory();
    private final TypeAdapterFactory dummyFactory = new DummyTypeAdapterFactory();
    private final TypeAdapterFactory treeTypeClassDummyFactory = new DummyTypeAdapterFactory(); // Simulating TREE_TYPE_CLASS_DUMMY_FACTORY

    @Test
    void testIsClassJsonAdapterFactory_TreeTypeClassDummyFactory() {
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        assertTrue(factory.isClassJsonAdapterFactory(typeToken, treeTypeClassDummyFactory));
    }

    @Test
    void testIsClassJsonAdapterFactory_ExistingFactory() {
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        // Simulate existing factory
        factory.adapterFactoryMap.put(Object.class, dummyFactory);
        assertTrue(factory.isClassJsonAdapterFactory(typeToken, dummyFactory));
    }

    @Test
    void testIsClassJsonAdapterFactory_NoExistingFactory() {
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        assertFalse(factory.isClassJsonAdapterFactory(typeToken, dummyFactory));
    }

    @Test
    void testIsClassJsonAdapterFactory_AnnotationPresent() {
        TypeToken<AnnotatedClass> typeToken = TypeToken.get(AnnotatedClass.class);
        assertTrue(factory.isClassJsonAdapterFactory(typeToken, dummyFactory));
    }

    @Test
    void testIsClassJsonAdapterFactory_AnnotationNotPresent() {
        TypeToken<NonAnnotatedClass> typeToken = TypeToken.get(NonAnnotatedClass.class);
        assertFalse(factory.isClassJsonAdapterFactory(typeToken, dummyFactory));
    }

    @Test
    void testIsClassJsonAdapterFactory_AdapterClassNotAssignable() {
        TypeToken<InvalidAnnotatedClass> typeToken = TypeToken.get(InvalidAnnotatedClass.class);
        assertFalse(factory.isClassJsonAdapterFactory(typeToken, dummyFactory));
    }

    // Dummy classes for testing
    @JsonAdapter(DummyTypeAdapterFactory.class)
    static class AnnotatedClass {}

    static class NonAnnotatedClass {}

    @JsonAdapter(String.class) // Invalid as String is not a TypeAdapterFactory
    static class InvalidAnnotatedClass {}
}