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

public class MapTypeAdapterFactoryAdapterTest {

    private static class TestAdapter extends MapTypeAdapterFactory.Adapter<String, String> {
        public TestAdapter() {
            super(null, null, null);
        }

        @Override
        public Map<String, String> read(JsonReader in) throws IOException {
            return super.read(in);
        }
    }

    @Test
    void testRead_NullToken() throws IOException {
        JsonReader reader = Mockito.mock(JsonReader.class);
        Mockito.when(reader.peek()).thenReturn(JsonToken.NULL);
        Mockito.when(reader.nextNull()).thenReturn(null);

        TestAdapter adapter = new TestAdapter();
        assertNull(adapter.read(reader));
    }

    @Test
    void testRead_BeginArray() throws IOException {
        JsonReader reader = Mockito.mock(JsonReader.class);
        Mockito.when(reader.peek()).thenReturn(JsonToken.BEGIN_ARRAY);
        Mockito.when(reader.hasNext()).thenReturn(true, false);
        Mockito.when(reader.beginArray()).thenReturn(null);
        Mockito.when(reader.endArray()).thenReturn(null);

        Map<String, String> map = new HashMap<>();
        Mockito.when(reader.beginArray()).thenReturn(null);
        Mockito.when(reader.nextString()).thenReturn("key1", "value1");
        Mockito.when(reader.nextString()).thenReturn("key2", "value2");

        TestAdapter adapter = new TestAdapter();
        Map<String, String> result = adapter.read(reader);
        assertEquals(2, result.size());
        assertEquals("value1", result.get("key1"));
        assertEquals("value2", result.get("key2"));
    }

    @Test
    void testRead_BeginObject() throws IOException {
        JsonReader reader = Mockito.mock(JsonReader.class);
        Mockito.when(reader.peek()).thenReturn(JsonToken.BEGIN_OBJECT);
        Mockito.when(reader.hasNext()).thenReturn(true, true, false);
        Mockito.when(reader.beginObject()).thenReturn(null);
        Mockito.when(reader.endObject()).thenReturn(null);
        Mockito.when(reader.nextName()).thenReturn("key1", "key2");
        Mockito.when(reader.nextString()).thenReturn("value1", "value2");

        TestAdapter adapter = new TestAdapter();
        Map<String, String> result = adapter.read(reader);
        assertEquals(2, result.size());
        assertEquals("value1", result.get("key1"));
        assertEquals("value2", result.get("key2"));
    }

    @Test
    void testRead_DuplicateKey() throws IOException {
        JsonReader reader = Mockito.mock(JsonReader.class);
        Mockito.when(reader.peek()).thenReturn(JsonToken.BEGIN_OBJECT);
        Mockito.when(reader.hasNext()).thenReturn(true, true, false);
        Mockito.when(reader.beginObject()).thenReturn(null);
        Mockito.when(reader.endObject()).thenReturn(null);
        Mockito.when(reader.nextName()).thenReturn("key1", "key1");
        Mockito.when(reader.nextString()).thenReturn("value1", "value2");

        TestAdapter adapter = new TestAdapter();
        assertThrows(JsonSyntaxException.class, () -> adapter.read(reader));
    }
}