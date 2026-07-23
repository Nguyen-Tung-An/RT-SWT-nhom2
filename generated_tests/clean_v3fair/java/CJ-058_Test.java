package com.google.gson.internal.bind;

import com.google.gson.JsonPrimitive;
import com.google.gson.JsonToken;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class JsonTreeReaderTest {
    private JsonTreeReader reader;

    @BeforeEach
    void setUp() {
        // Initialize the JsonTreeReader with a valid JSON structure
        // This is a placeholder; actual initialization will depend on the implementation details of JsonTreeReader
        reader = new JsonTreeReader(/* pass a valid JsonElement or similar */);
    }

    @Test
    void testNextDouble_ValidNumber() throws IOException {
        // Assuming the reader is set up to read a valid number
        reader.push(new JsonPrimitive(3.14));
        assertEquals(3.14, reader.nextDouble());
    }

    @Test
    void testNextDouble_ValidStringNumber() throws IOException {
        // Assuming the reader is set up to read a valid string number
        reader.push(new JsonPrimitive("2.71"));
        assertEquals(2.71, reader.nextDouble());
    }

    @Test
    void testNextDouble_InvalidToken() {
        // Assuming the reader is set up to read an invalid token
        reader.push(new JsonPrimitive("not a number"));
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            reader.nextDouble();
        });
        assertTrue(exception.getMessage().contains("Expected NUMBER but was"));
    }

    @Test
    void testNextDouble_NaN() {
        // Assuming the reader is set up to read NaN
        reader.push(new JsonPrimitive(Double.NaN));
        MalformedJsonException exception = assertThrows(MalformedJsonException.class, () -> {
            reader.nextDouble();
        });
        assertTrue(exception.getMessage().contains("JSON forbids NaN and infinities"));
    }

    @Test
    void testNextDouble_Infinite() {
        // Assuming the reader is set up to read Infinity
        reader.push(new JsonPrimitive(Double.POSITIVE_INFINITY));
        MalformedJsonException exception = assertThrows(MalformedJsonException.class, () -> {
            reader.nextDouble();
        });
        assertTrue(exception.getMessage().contains("JSON forbids NaN and infinities"));
    }
}