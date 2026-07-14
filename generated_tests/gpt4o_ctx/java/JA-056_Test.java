package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.StringReader;

public class GsonTest {

    private final Gson gson = new Gson();

    @Test
    void testFromJson_ValidJson_ReturnsObject() throws Exception {
        String json = "{\"name\":\"John\", \"age\":30}";
        TypeToken<Person> typeToken = new TypeToken<Person>() {};
        Person person = gson.fromJson(new JsonReader(new StringReader(json)), typeToken);
        assertNotNull(person);
        assertEquals("John", person.name);
        assertEquals(30, person.age);
    }

    @Test
    void testFromJson_EmptyJson_ReturnsNull() throws Exception {
        String json = "";
        TypeToken<Person> typeToken = new TypeToken<Person>() {};
        Person person = gson.fromJson(new JsonReader(new StringReader(json)), typeToken);
        assertNull(person);
    }

    @Test
    void testFromJson_InvalidJson_ThrowsJsonSyntaxException() {
        String json = "{\"name\":\"John\", \"age\":}";
        TypeToken<Person> typeToken = new TypeToken<Person>() {};
        assertThrows(JsonSyntaxException.class, () -> {
            gson.fromJson(new JsonReader(new StringReader(json)), typeToken);
        });
    }

    @Test
    void testFromJson_NonMatchingType_ThrowsClassCastException() {
        String json = "{\"name\":\"John\", \"age\":30}";
        TypeToken<String> typeToken = new TypeToken<String>() {};
        assertThrows(ClassCastException.class, () -> {
            gson.fromJson(new JsonReader(new StringReader(json)), typeToken);
        });
    }

    @Test
    void testFromJson_IOException_ThrowsJsonSyntaxException() {
        String json = "{\"name\":\"John\", \"age\":30}";
        JsonReader reader = new JsonReader(new StringReader(json)) {
            @Override
            public JsonToken peek() throws IOException {
                throw new IOException("Simulated IOException");
            }
        };
        TypeToken<Person> typeToken = new TypeToken<Person>() {};
        assertThrows(JsonSyntaxException.class, () -> {
            gson.fromJson(reader, typeToken);
        });
    }

    static class Person {
        String name;
        int age;
    }
}