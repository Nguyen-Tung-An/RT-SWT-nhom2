import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapter;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.JsonSyntaxException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapTypeAdapterFactoryAdapterTest {

    private static class TestKeyTypeAdapter extends TypeAdapter<String> {
        @Override
        public String read(JsonReader in) throws IOException {
            return in.nextString();
        }

        @Override
        public void write(JsonWriter out, String value) throws IOException {
            out.value(value);
        }
    }

    private static class TestValueTypeAdapter extends TypeAdapter<Integer> {
        @Override
        public Integer read(JsonReader in) throws IOException {
            return in.nextInt();
        }

        @Override
        public void write(JsonWriter out, Integer value) throws IOException {
            out.value(value);
        }
    }

    private static class TestObjectConstructor implements ObjectConstructor<Map<String, Integer>> {
        @Override
        public Map<String, Integer> construct() {
            return new HashMap<>();
        }
    }

    @Test
    void testReadWithNull() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("null"));
        MapTypeAdapterFactory.Adapter adapter = new MapTypeAdapterFactory.Adapter(
                new TestKeyTypeAdapter(), new TestValueTypeAdapter(), new TestObjectConstructor());
        assertNull(adapter.read(reader));
    }

    @Test
    void testReadWithEmptyArray() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("[]"));
        MapTypeAdapterFactory.Adapter adapter = new MapTypeAdapterFactory.Adapter(
                new TestKeyTypeAdapter(), new TestValueTypeAdapter(), new TestObjectConstructor());
        Map<String, Integer> result = adapter.read(reader);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testReadWithValidArray() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("[[\"key1\", 1], [\"key2\", 2]]"));
        MapTypeAdapterFactory.Adapter adapter = new MapTypeAdapterFactory.Adapter(
                new TestKeyTypeAdapter(), new TestValueTypeAdapter(), new TestObjectConstructor());
        Map<String, Integer> result = adapter.read(reader);
        assertEquals(2, result.size());
        assertEquals(1, result.get("key1"));
        assertEquals(2, result.get("key2"));
    }

    @Test
    void testReadWithDuplicateKeys() {
        JsonReader reader = new JsonReader(new StringReader("[[\"key1\", 1], [\"key1\", 2]]"));
        MapTypeAdapterFactory.Adapter adapter = new MapTypeAdapterFactory.Adapter(
                new TestKeyTypeAdapter(), new TestValueTypeAdapter(), new TestObjectConstructor());
        JsonSyntaxException exception = assertThrows(JsonSyntaxException.class, () -> adapter.read(reader));
        assertEquals("duplicate key: key1", exception.getMessage());
    }

    @Test
    void testReadWithValidObject() throws IOException {
        JsonReader reader = new JsonReader(new StringReader("{\"key1\": 1, \"key2\": 2}"));
        MapTypeAdapterFactory.Adapter adapter = new MapTypeAdapterFactory.Adapter(
                new TestKeyTypeAdapter(), new TestValueTypeAdapter(), new TestObjectConstructor());
        Map<String, Integer> result = adapter.read(reader);
        assertEquals(2, result.size());
        assertEquals(1, result.get("key1"));
        assertEquals(2, result.get("key2"));
    }

    @Test
    void testReadWithDuplicateKeysInObject() {
        JsonReader reader = new JsonReader(new StringReader("{\"key1\": 1, \"key1\": 2}"));
        MapTypeAdapterFactory.Adapter adapter = new MapTypeAdapterFactory.Adapter(
                new TestKeyTypeAdapter(), new TestValueTypeAdapter(), new TestObjectConstructor());
        JsonSyntaxException exception = assertThrows(JsonSyntaxException.class, () -> adapter.read(reader));
        assertEquals("duplicate key: key1", exception.getMessage());
    }
}