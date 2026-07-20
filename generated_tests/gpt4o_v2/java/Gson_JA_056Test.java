import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.lang.reflect.Type;

import static org.junit.jupiter.api.Assertions.*;

class GsonFromJsonTest {

    private final Gson gson = new Gson();

    @Test
    void testFromJson_ValidJson_ReturnsObject() throws Exception {
        String json = "{\"name\":\"John\", \"age\":30}";
        Type type = new TypeToken<Person>() {}.getType();
        JsonReader reader = new JsonReader(new StringReader(json));
        
        Person person = gson.fromJson(reader, type);
        
        assertNotNull(person);
        assertEquals("John", person.getName());
        assertEquals(30, person.getAge());
    }

    @Test
    void testFromJson_EmptyJson_ReturnsNull() throws Exception {
        String json = "";
        Type type = new TypeToken<Person>() {}.getType();
        JsonReader reader = new JsonReader(new StringReader(json));
        
        Person person = gson.fromJson(reader, type);
        
        assertNull(person);
    }

    @Test
    void testFromJson_InvalidJson_ThrowsJsonSyntaxException() {
        String json = "{\"name\":\"John\", \"age\":}";
        Type type = new TypeToken<Person>() {}.getType();
        JsonReader reader = new JsonReader(new StringReader(json));
        
        assertThrows(JsonSyntaxException.class, () -> {
            gson.fromJson(reader, type);
        });
    }

    @Test
    void testFromJson_NonMatchingType_ThrowsClassCastException() {
        String json = "{\"name\":\"John\", \"age\":30}";
        Type type = new TypeToken<String>() {}.getType();
        JsonReader reader = new JsonReader(new StringReader(json));
        
        assertThrows(ClassCastException.class, () -> {
            gson.fromJson(reader, type);
        });
    }

    @Test
    void testFromJson_IOException_ThrowsJsonSyntaxException() {
        String json = "{\"name\":\"John\", \"age\":30}";
        Type type = new TypeToken<Person>() {}.getType();
        JsonReader reader = new JsonReader(new StringReader(json)) {
            @Override
            public JsonToken peek() throws IOException {
                throw new IOException("Simulated IOException");
            }
        };
        
        assertThrows(JsonSyntaxException.class, () -> {
            gson.fromJson(reader, type);
        });
    }

    static class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}