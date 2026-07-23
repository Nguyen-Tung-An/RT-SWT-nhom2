package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExcluderTest {

    private final Gson gson = new Gson();
    private final Excluder excluder = new Excluder();

    @Test
    void testCreate_NonExcludedClass() {
        TypeToken<String> typeToken = TypeToken.get(String.class);
        TypeAdapter<String> adapter = excluder.create(gson, typeToken);
        assertNotNull(adapter);
    }

    @Test
    void testCreate_ExcludedClassForSerialization() {
        // Assuming Excluder excludes Integer class for serialization
        TypeToken<Integer> typeToken = TypeToken.get(Integer.class);
        TypeAdapter<Integer> adapter = excluder.create(gson, typeToken);
        assertNotNull(adapter);
    }

    @Test
    void testCreate_ExcludedClassForDeserialization() {
        // Assuming Excluder excludes Integer class for deserialization
        TypeToken<Integer> typeToken = TypeToken.get(Integer.class);
        TypeAdapter<Integer> adapter = excluder.create(gson, typeToken);
        assertNotNull(adapter);
    }

    @Test
    void testCreate_ExcludedClassForBoth() {
        // Assuming Excluder excludes Double class for both serialization and deserialization
        TypeToken<Double> typeToken = TypeToken.get(Double.class);
        TypeAdapter<Double> adapter = excluder.create(gson, typeToken);
        assertNull(adapter);
    }
}