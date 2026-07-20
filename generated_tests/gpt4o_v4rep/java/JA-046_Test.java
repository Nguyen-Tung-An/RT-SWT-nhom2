package com.google.gson;

import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GsonTest {

    @Test
    void testGetAdapterWithNonNullTypeToken() {
        Gson gson = new Gson();
        TypeToken<List<String>> typeToken = new TypeToken<List<String>>() {};
        TypeAdapter<List<String>> adapter = gson.getAdapter(typeToken);
        assertNotNull(adapter);
    }

    @Test
    void testGetAdapterWithCachedTypeToken() {
        Gson gson = new Gson();
        TypeToken<List<String>> typeToken = new TypeToken<List<String>>() {};
        TypeAdapter<List<String>> firstCall = gson.getAdapter(typeToken);
        TypeAdapter<List<String>> secondCall = gson.getAdapter(typeToken);
        assertSame(firstCall, secondCall);
    }

    @Test
    void testGetAdapterWithNullTypeToken() {
        Gson gson = new Gson();
        assertThrows(NullPointerException.class, () -> {
            gson.getAdapter(null);
        });
    }

    @Test
    void testGetAdapterWithUnresolvableType() {
        Gson gson = new Gson();
        TypeToken<Object> typeToken = new TypeToken<Object>() {};
        assertThrows(IllegalArgumentException.class, () -> {
            gson.getAdapter(typeToken);
        });
    }

    @Test
    void testGetAdapterWithDifferentTypeTokens() {
        Gson gson = new Gson();
        TypeToken<List<String>> stringListToken = new TypeToken<List<String>>() {};
        TypeToken<List<Integer>> integerListToken = new TypeToken<List<Integer>>() {};
        
        TypeAdapter<List<String>> stringListAdapter = gson.getAdapter(stringListToken);
        TypeAdapter<List<Integer>> integerListAdapter = gson.getAdapter(integerListToken);
        
        assertNotSame(stringListAdapter, integerListAdapter);
    }
}