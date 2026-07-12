package com.google.gson;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import java.io.EOFException;
import java.io.IOException;

public class GsonTest {

    @Test
    void testFromJson_EmptyReader_ReturnsNull() throws IOException {
        JsonReader reader = mock(JsonReader.class);
        when(reader.peek()).thenThrow(new EOFException());
        when(reader.getStrictness()).thenReturn(Strictness.LENIENT);
        
        Gson gson = new Gson();
        assertNull(gson.fromJson(reader, new TypeToken<Object>() {}));
    }

    @Test
    void testFromJson_ValidJson_ReturnsObject() throws IOException {
        JsonReader reader = mock(JsonReader.class);
        TypeAdapter<Object> adapter = mock(TypeAdapter.class);
        when(reader.peek()).thenReturn(JsonToken.BEGIN_OBJECT);
        when(reader.getStrictness()).thenReturn(Strictness.LENIENT);
        when(adapter.read(reader)).thenReturn(new Object());
        
        Gson gson = new Gson();
        when(gson.getAdapter(new TypeToken<Object>() {})).thenReturn(adapter);
        
        Object result = gson.fromJson(reader, new TypeToken<Object>() {});
        assertNotNull(result);
    }

    @Test
    void testFromJson_InvalidType_ThrowsClassCastException() throws IOException {
        JsonReader reader = mock(JsonReader.class);
        TypeAdapter<Number> adapter = mock(TypeAdapter.class);
        when(reader.peek()).thenReturn(JsonToken.BEGIN_OBJECT);
        when(reader.getStrictness()).thenReturn(Strictness.LENIENT);
        when(adapter.read(reader)).thenReturn("String instead of Number");
        
        Gson gson = new Gson();
        when(gson.getAdapter(new TypeToken<Number>() {})).thenReturn(adapter);
        
        assertThrows(ClassCastException.class, () -> {
            gson.fromJson(reader, new TypeToken<Number>() {});
        });
    }

    @Test
    void testFromJson_IOException_ThrowsJsonSyntaxException() throws IOException {
        JsonReader reader = mock(JsonReader.class);
        when(reader.peek()).thenThrow(new IOException());
        
        Gson gson = new Gson();
        
        assertThrows(JsonSyntaxException.class, () -> {
            gson.fromJson(reader, new TypeToken<Object>() {});
        });
    }

    @Test
    void testFromJson_IllegalStateException_ThrowsJsonSyntaxException() throws IOException {
        JsonReader reader = mock(JsonReader.class);
        when(reader.peek()).thenReturn(JsonToken.BEGIN_OBJECT);
        TypeAdapter<Object> adapter = mock(TypeAdapter.class);
        when(adapter.read(reader)).thenThrow(new IllegalStateException());
        
        Gson gson = new Gson();
        when(gson.getAdapter(new TypeToken<Object>() {})).thenReturn(adapter);
        
        assertThrows(JsonSyntaxException.class, () -> {
            gson.fromJson(reader, new TypeToken<Object>() {});
        });
    }
}