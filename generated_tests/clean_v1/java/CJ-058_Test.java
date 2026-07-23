package com.google.gson.internal.bind;

import com.google.gson.JsonPrimitive;
import com.google.gson.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class JsonTreeReaderTest {

    @Test
    void testNextDouble_WithNumberToken() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(3.14));
        assertEquals(3.14, reader.nextDouble());
    }

    @Test
    void testNextDouble_WithStringToken() throws IOException {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive("2.71"));
        assertEquals(2.71, reader.nextDouble());
    }

    @Test
    void testNextDouble_WithInvalidToken() {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(true));
        IllegalStateException exception = assertThrows(IllegalStateException.class, reader::nextDouble);
        assertEquals("Expected NUMBER but was BOOLEAN at path $", exception.getMessage());
    }

    @Test
    void testNextDouble_WithNaN() {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Double.NaN));
        MalformedJsonException exception = assertThrows(MalformedJsonException.class, reader::nextDouble);
        assertEquals("JSON forbids NaN and infinities: NaN", exception.getMessage());
    }

    @Test
    void testNextDouble_WithInfinity() {
        JsonTreeReader reader = new JsonTreeReader(new JsonPrimitive(Double.POSITIVE_INFINITY));
        MalformedJsonException exception = assertThrows(MalformedJsonException.class, reader::nextDouble);
        assertEquals("JSON forbids NaN and infinities: Infinity", exception.getMessage());
    }
}