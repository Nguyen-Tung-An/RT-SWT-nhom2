import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MapTypeAdapterFactoryAdapterTest {

    private final MapTypeAdapterFactory.Adapter adapter = new MapTypeAdapterFactory().new Adapter();

    @Test
    void testKeyToStringWithNumber() {
        JsonElement keyElement = new JsonPrimitive(123);
        String result = adapter.keyToString(keyElement);
        assertEquals("123", result);
    }

    @Test
    void testKeyToStringWithBooleanTrue() {
        JsonElement keyElement = new JsonPrimitive(true);
        String result = adapter.keyToString(keyElement);
        assertEquals("true", result);
    }

    @Test
    void testKeyToStringWithBooleanFalse() {
        JsonElement keyElement = new JsonPrimitive(false);
        String result = adapter.keyToString(keyElement);
        assertEquals("false", result);
    }

    @Test
    void testKeyToStringWithString() {
        JsonElement keyElement = new JsonPrimitive("test");
        String result = adapter.keyToString(keyElement);
        assertEquals("test", result);
    }

    @Test
    void testKeyToStringWithNull() {
        JsonElement keyElement = JsonNull.INSTANCE;
        String result = adapter.keyToString(keyElement);
        assertEquals("null", result);
    }

    @Test
    void testKeyToStringWithInvalidJsonElement() {
        JsonElement keyElement = new JsonPrimitive(new Object());
        assertThrows(AssertionError.class, () -> adapter.keyToString(keyElement));
    }
}