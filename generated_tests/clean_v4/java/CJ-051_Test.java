import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GsonBuilderTest {

    @Test
    void testRegisterTypeHierarchyAdapterWithJsonSerializer() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        JsonSerializer<Object> serializer = (src, typeOfSrc, context) -> null;
        GsonBuilder result = gsonBuilder.registerTypeHierarchyAdapter(Object.class, serializer);
        assertSame(gsonBuilder, result);
    }

    @Test
    void testRegisterTypeHierarchyAdapterWithJsonDeserializer() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        JsonDeserializer<Object> deserializer = (json, typeOfT, context) -> null;
        GsonBuilder result = gsonBuilder.registerTypeHierarchyAdapter(Object.class, deserializer);
        assertSame(gsonBuilder, result);
    }

    @Test
    void testRegisterTypeHierarchyAdapterWithTypeAdapter() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        TypeAdapter<Object> typeAdapter = new TypeAdapter<Object>() {
            @Override
            public void write(com.google.gson.stream.JsonWriter out, Object value) {}

            @Override
            public Object read(com.google.gson.stream.JsonReader in) {
                return null;
            }
        };
        GsonBuilder result = gsonBuilder.registerTypeHierarchyAdapter(Object.class, typeAdapter);
        assertSame(gsonBuilder, result);
    }

    @Test
    void testRegisterTypeHierarchyAdapterWithNullBaseType() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            gsonBuilder.registerTypeHierarchyAdapter(null, new Object());
        });
        assertEquals("baseType cannot be null", exception.getMessage());
    }

    @Test
    void testRegisterTypeHierarchyAdapterWithNullTypeAdapter() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            gsonBuilder.registerTypeHierarchyAdapter(Object.class, null);
        });
        assertEquals("typeAdapter cannot be null", exception.getMessage());
    }

    @Test
    void testRegisterTypeHierarchyAdapterWithInvalidTypeAdapter() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            gsonBuilder.registerTypeHierarchyAdapter(Object.class, new Object());
        });
        assertTrue(exception.getMessage().contains("does not implement any supported type adapter class or interface"));
    }
}