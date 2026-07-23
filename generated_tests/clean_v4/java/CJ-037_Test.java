import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.internal.Excluder;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ExcluderTest {

    private final Excluder excluder = new Excluder();
    private final Gson gson = new Gson();

    @Test
    void testCreateWithExcludedClassForSerialization() {
        TypeToken<String> typeToken = TypeToken.get(String.class);
        TypeAdapter<String> adapter = excluder.create(gson, typeToken);
        assertNull(adapter); // Should return null as serialization is excluded
    }

    @Test
    void testCreateWithExcludedClassForDeserialization() {
        TypeToken<String> typeToken = TypeToken.get(String.class);
        TypeAdapter<String> adapter = excluder.create(gson, typeToken);
        assertNull(adapter); // Should return null as deserialization is excluded
    }

    @Test
    void testCreateWithIncludedClass() throws IOException {
        TypeToken<Integer> typeToken = TypeToken.get(Integer.class);
        TypeAdapter<Integer> adapter = excluder.create(gson, typeToken);
        assertNotNull(adapter); // Should return a valid TypeAdapter

        // Test serialization
        JsonWriter writer = new JsonWriter(new java.io.StringWriter());
        adapter.write(writer, 42);
        writer.flush();

        // Test deserialization
        JsonReader reader = new JsonReader(new java.io.StringReader("42"));
        Integer value = adapter.read(reader);
        assertNotNull(value); // Should return a valid Integer
    }

    @Test
    void testCreateWithNullTypeToken() {
        TypeAdapter<Object> adapter = excluder.create(gson, null);
        assertNull(adapter); // Should return null for null TypeToken
    }
}