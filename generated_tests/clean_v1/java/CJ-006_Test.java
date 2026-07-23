package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MapTypeAdapterFactoryTest {

    private final MapTypeAdapterFactory<String, String> adapterFactory = new MapTypeAdapterFactory<>();

    @Test
    void testRead_NullToken() throws IOException {
        JsonReader reader = Mockito.mock(JsonReader.class);
        Mockito.when(reader.peek()).thenReturn(JsonToken.NULL);
        Mockito.when(reader.nextNull()).thenReturn(null);

        Map<String, String> result = adapterFactory.read(reader);
        assertNull(result);
    }

    @Test
    void testRead_BeginArray() throws IOException {
        JsonReader reader = Mockito.mock(JsonReader.class);
        Mockito.when(reader.peek()).thenReturn(JsonToken.BEGIN_ARRAY);
        Mockito.when(reader.hasNext()).thenReturn(true, false);
        Mockito.when(reader.beginArray()).thenReturn(null);
        Mockito.when(reader.endArray()).thenReturn(null);

        // Mocking key and value type adapters
        TypeAdapter<String> keyAdapter = Mockito.mock(TypeAdapter.class);
        TypeAdapter<String> valueAdapter = Mockito.mock(TypeAdapter.class);
        Mockito.when(keyAdapter.read(reader)).thenReturn("key1");
        Mockito.when(valueAdapter.read(reader)).thenReturn("value1");

        adapterFactory.keyTypeAdapter = keyAdapter;
        adapterFactory.valueTypeAdapter = valueAdapter;

        Map<String, String> result = adapterFactory.read(reader);
        assertEquals(1, result.size());
        assertEquals("value1", result.get("key1"));
    }

    @Test
    void testRead_BeginObject() throws IOException {
        JsonReader reader = Mockito.mock(JsonReader.class);
        Mockito.when(reader.peek()).thenReturn(JsonToken.BEGIN_OBJECT);
        Mockito.when(reader.hasNext()).thenReturn(true, false);
        Mockito.when(reader.beginObject()).thenReturn(null);
        Mockito.when(reader.endObject()).thenReturn(null);

        // Mocking key and value type adapters
        TypeAdapter<String> keyAdapter = Mockito.mock(TypeAdapter.class);
        TypeAdapter<String> valueAdapter = Mockito.mock(TypeAdapter.class);
        Mockito.when(keyAdapter.read(reader)).thenReturn("key1");
        Mockito.when(valueAdapter.read(reader)).thenReturn("value1");

        adapterFactory.keyTypeAdapter = keyAdapter;
        adapterFactory.valueTypeAdapter = valueAdapter;

        Map<String, String> result = adapterFactory.read(reader);
        assertEquals(1, result.size());
        assertEquals("value1", result.get("key1"));
    }

    @Test
    void testRead_DuplicateKey() throws IOException {
        JsonReader reader = Mockito.mock(JsonReader.class);
        Mockito.when(reader.peek()).thenReturn(JsonToken.BEGIN_OBJECT);
        Mockito.when(reader.hasNext()).thenReturn(true, true, false);
        Mockito.when(reader.beginObject()).thenReturn(null);
        Mockito.when(reader.endObject()).thenReturn(null);

        // Mocking key and value type adapters
        TypeAdapter<String> keyAdapter = Mockito.mock(TypeAdapter.class);
        TypeAdapter<String> valueAdapter = Mockito.mock(TypeAdapter.class);
        Mockito.when(keyAdapter.read(reader)).thenReturn("key1", "key1");
        Mockito.when(valueAdapter.read(reader)).thenReturn("value1", "value2");

        adapterFactory.keyTypeAdapter = keyAdapter;
        adapterFactory.valueTypeAdapter = valueAdapter;

        assertThrows(JsonSyntaxException.class, () -> adapterFactory.read(reader));
    }
}