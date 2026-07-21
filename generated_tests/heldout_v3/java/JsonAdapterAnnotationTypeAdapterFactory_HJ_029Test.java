import com.google.gson.Gson;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonAdapterAnnotationTypeAdapterFactoryTest {

    private final JsonAdapterAnnotationTypeAdapterFactory factory = new JsonAdapterAnnotationTypeAdapterFactory();

    @Test
    void testIsClassJsonAdapterFactoryWithTreeTypeClassDummyFactory() {
        TypeToken<?> typeToken = TypeToken.get(String.class);
        TypeAdapterFactory dummyFactory = JsonAdapterAnnotationTypeAdapterFactory.TREE_TYPE_CLASS_DUMMY_FACTORY;

        assertTrue(factory.isClassJsonAdapterFactory(typeToken, dummyFactory));
    }

    @Test
    void testIsClassJsonAdapterFactoryWithExistingFactory() {
        TypeToken<?> typeToken = TypeToken.get(String.class);
        TypeAdapterFactory existingFactory = new CustomTypeAdapterFactory();

        factory.putFactoryAndGetCurrent(String.class, existingFactory); // Assuming this method exists for setup

        assertTrue(factory.isClassJsonAdapterFactory(typeToken, existingFactory));
    }

    @Test
    void testIsClassJsonAdapterFactoryWithNullTypeToken() {
        TypeAdapterFactory factory = new CustomTypeAdapterFactory();

        assertThrows(NullPointerException.class, () -> {
            factory.isClassJsonAdapterFactory(null, factory);
        });
    }

    @Test
    void testIsClassJsonAdapterFactoryWithNullFactory() {
        TypeToken<?> typeToken = TypeToken.get(String.class);

        assertThrows(NullPointerException.class, () -> {
            factory.isClassJsonAdapterFactory(typeToken, null);
        });
    }

    @Test
    void testIsClassJsonAdapterFactoryWithNoAnnotation() {
        TypeToken<?> typeToken = TypeToken.get(NoJsonAdapter.class);
        TypeAdapterFactory factory = new CustomTypeAdapterFactory();

        assertFalse(factory.isClassJsonAdapterFactory(typeToken, factory));
    }

    @Test
    void testIsClassJsonAdapterFactoryWithInvalidAdapterClass() {
        TypeToken<?> typeToken = TypeToken.get(InvalidJsonAdapter.class);
        TypeAdapterFactory factory = new CustomTypeAdapterFactory();

        assertFalse(factory.isClassJsonAdapterFactory(typeToken, factory));
    }

    @JsonAdapter(InvalidJsonAdapter.class)
    static class InvalidJsonAdapter {}

    static class NoJsonAdapter {}

    static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        // Implementation of TypeAdapterFactory
    }
}