package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExcluderTest {

    private final Excluder excluder = new Excluder();
    private final Gson gson = new Gson();

    @Test
    void testCreate_NonExcludedType() {
        TypeToken<String> typeToken = new TypeToken<String>() {};
        assertNull(excluder.create(gson, typeToken));
    }

    @Test
    void testCreate_ExcludedType_Serialize() {
        TypeToken<ExcludedClass> typeToken = new TypeToken<ExcludedClass>() {};
        TypeAdapter<ExcludedClass> adapter = excluder.create(gson, typeToken);
        assertNotNull(adapter);
    }

    @Test
    void testCreate_ExcludedType_Deserialize() {
        TypeToken<ExcludedClass> typeToken = new TypeToken<ExcludedClass>() {};
        TypeAdapter<ExcludedClass> adapter = excluder.create(gson, typeToken);
        assertNotNull(adapter);
    }

    @Test
    void testCreate_NullType() {
        TypeToken<Object> typeToken = null;
        assertThrows(NullPointerException.class, () -> excluder.create(gson, typeToken));
    }

    private static class ExcludedClass {
        // This class is used to simulate an excluded type
    }
}