import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapTypeAdapterFactoryAdapterTest {

    private final MapTypeAdapterFactory.Adapter adapter = new MapTypeAdapterFactory().new Adapter();

    @Test
    void testKeyToStringWithString() {
        JsonElement jsonElement = new JsonPrimitive("testKey");
        String result = adapter.keyToString(jsonElement);
        assertEquals("testKey", result);
    }

    @Test
    void testKeyToStringWithNumber() {
        JsonElement jsonElement = new JsonPrimitive(123);
        String result = adapter.keyToString(jsonElement);
        assertEquals("123", result);
    }

    @Test
    void testKeyToStringWithBooleanTrue() {
        JsonElement jsonElement = new JsonPrimitive(true);
        String result = adapter.keyToString(jsonElement);
        assertEquals("true", result);
    }

    @Test
    void testKeyToStringWithBooleanFalse() {
        JsonElement jsonElement = new JsonPrimitive(false);
        String result = adapter.keyToString(jsonElement);
        assertEquals("false", result);
    }

    @Test
    void testKeyToStringWithNull() {
        JsonElement jsonElement = null;
        String result = adapter.keyToString(jsonElement);
        assertEquals("null", result);
    }

    @Test
    void testKeyToStringWithEmptyString() {
        JsonElement jsonElement = new JsonPrimitive("");
        String result = adapter.keyToString(jsonElement);
        assertEquals("", result);
    }
}