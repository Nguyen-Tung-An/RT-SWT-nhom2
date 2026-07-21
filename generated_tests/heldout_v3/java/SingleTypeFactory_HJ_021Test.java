import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleTypeFactoryTest {

    @Test
    void testConstructorWithJsonSerializer() {
        JsonSerializer<Object> serializer = (src, typeOfSrc, context) -> null;
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        TreeTypeAdapter.SingleTypeFactory factory = new TreeTypeAdapter.SingleTypeFactory.SingleTypeFactory(serializer, typeToken, true, null);
        
        assertNotNull(factory);
    }

    @Test
    void testConstructorWithJsonDeserializer() {
        JsonDeserializer<Object> deserializer = (json, typeOfT, context) -> null;
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        TreeTypeAdapter.SingleTypeFactory factory = new TreeTypeAdapter.SingleTypeFactory.SingleTypeFactory(deserializer, typeToken, false, null);
        
        assertNotNull(factory);
    }

    @Test
    void testConstructorWithBothJsonSerializerAndJsonDeserializer() {
        JsonSerializer<Object> serializer = (src, typeOfSrc, context) -> null;
        JsonDeserializer<Object> deserializer = (json, typeOfT, context) -> null;
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        TreeTypeAdapter.SingleTypeFactory factory = new TreeTypeAdapter.SingleTypeFactory.SingleTypeFactory(serializer, typeToken, true, null);
        
        assertNotNull(factory);
    }

    @Test
    void testConstructorWithNullTypeAdapter() {
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new TreeTypeAdapter.SingleTypeFactory.SingleTypeFactory(null, typeToken, true, null);
        });
        assertEquals("Type adapter must implement JsonSerializer or JsonDeserializer", exception.getMessage());
    }

    @Test
    void testConstructorWithInvalidTypeAdapter() {
        Object invalidAdapter = new Object();
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new TreeTypeAdapter.SingleTypeFactory.SingleTypeFactory(invalidAdapter, typeToken, true, null);
        });
        assertEquals("Type adapter " + invalidAdapter.getClass().getName() + " must implement JsonSerializer or JsonDeserializer", exception.getMessage());
    }
}