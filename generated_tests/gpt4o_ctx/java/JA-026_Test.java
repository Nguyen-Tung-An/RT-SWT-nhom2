package com.google.gson;

import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GsonTest {

    @Test
    void testGetDelegateAdapter_NullSkipPast() {
        Gson gson = new Gson();
        TypeToken<String> typeToken = TypeToken.get(String.class);
        assertThrows(NullPointerException.class, () -> {
            gson.getDelegateAdapter(null, typeToken);
        });
    }

    @Test
    void testGetDelegateAdapter_NullType() {
        Gson gson = new Gson();
        TypeAdapterFactory skipPast = new TypeAdapterFactory() {
            @Override
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
                return null;
            }
        };
        assertThrows(NullPointerException.class, () -> {
            gson.getDelegateAdapter(skipPast, null);
        });
    }

    @Test
    void testGetDelegateAdapter_SkipPastFound() {
        Gson gson = new Gson();
        TypeAdapterFactory skipPast = new TypeAdapterFactory() {
            @Override
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
                return null;
            }
        };
        TypeToken<String> typeToken = TypeToken.get(String.class);
        TypeAdapter<String> adapter = gson.getDelegateAdapter(skipPast, typeToken);
        assertNotNull(adapter);
    }

    @Test
    void testGetDelegateAdapter_SkipPastNotFound() {
        Gson gson = new Gson();
        TypeAdapterFactory skipPast = new TypeAdapterFactory() {
            @Override
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
                return null;
            }
        };
        TypeToken<Integer> typeToken = TypeToken.get(Integer.class);
        assertThrows(IllegalArgumentException.class, () -> {
            gson.getDelegateAdapter(skipPast, typeToken);
        });
    }

    @Test
    void testGetDelegateAdapter_ValidCase() {
        Gson gson = new Gson();
        TypeAdapterFactory skipPast = new TypeAdapterFactory() {
            @Override
            public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
                return null; // Simulate a factory that does not provide an adapter
            }
        };
        TypeToken<Double> typeToken = TypeToken.get(Double.class);
        TypeAdapter<Double> adapter = gson.getDelegateAdapter(skipPast, typeToken);
        assertNotNull(adapter);
    }
}