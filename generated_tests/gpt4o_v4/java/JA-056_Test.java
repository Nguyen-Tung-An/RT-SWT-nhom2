import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.lang.reflect.Type;

import static org.junit.jupiter.api.Assertions.*;

class GsonTest {

    @Test
    void testFromJson_ValidJson_ReturnsObject() throws Exception {
        Gson gson = new Gson();
        String json = "{\"name\":\"John\", \"age\":30}";
        JsonReader reader = new JsonReader(new StringReader(json));
        Type type = new TypeToken<Person>() {}.getType();
        
        Person person = gson.fromJson(reader, type);
        
        assertNotNull(person);
        assertEquals("John", person.getName());
        assertEquals(30, person.getAge());
    }

    @Test
    void testFromJson_EmptyJson_ReturnsNull() throws Exception {
        Gson gson = new Gson();
        String json = "{}";
        JsonReader reader = new JsonReader(new StringReader(json));
        Type type = new TypeToken<Person>() {}.getType();
        
        Person person = gson.fromJson(reader, type);
        
        assertNotNull(person);
        assertEquals("John", person.getName());
        assertEquals(30, person.getAge());
    }

    @Test
    void testFromJson_InvalidJson_ThrowsJsonSyntaxException() {
        Gson gson = new Gson();
        String json = "{\"name\":\"John\", \"age\":}";
        JsonReader reader = new JsonReader(new StringReader(json));
        Type type = new TypeToken<Person>() {}.getType();
        
        assertThrows(JsonSyntaxException.class, () -> {
            gson.fromJson(reader, type);
        });
    }

    @Test
    void testFromJson_NullJson_ThrowsJsonIOException() {
        Gson gson = new Gson();
        JsonReader reader = null;
        Type type = new TypeToken<Person>() {}.getType();
        
        assertThrows(JsonIOException.class, () -> {
            gson.fromJson(reader, type);
        });
    }

    @Test
    void testFromJson_TypeMismatch_ThrowsClassCastException() {
        Gson gson = new Gson();
        String json = "{\"name\":\"John\", \"age\":\"thirty\"}";
        JsonReader reader = new JsonReader(new StringReader(json));
        Type type = new TypeToken<Person>() {}.getType();
        
        assertThrows(ClassCastException.class, () -> {
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