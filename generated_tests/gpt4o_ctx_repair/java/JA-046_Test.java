package com.google.gson;

import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GsonTest {

    private final Gson gson = new Gson();

    @Test
    void testGetAdapter_NonNullType() {
        TypeAdapter<String> adapter = gson.getAdapter(TypeToken.get(String.class));
        assertNotNull(adapter);
    }

    @Test
    void testGetAdapter_NullType() {
        assertThrows(NullPointerException.class, () -> {
            gson.getAdapter(null);
        });
    }

    @Test
    void testGetAdapter_CachedType() {
        TypeAdapter<String> firstCall = gson.getAdapter(TypeToken.get(String.class));
        TypeAdapter<String> secondCall = gson.getAdapter(TypeToken.get(String.class));
        assertSame(firstCall, secondCall);
    }

    @Test
    void testGetAdapter_UnknownType() {
        assertThrows(IllegalArgumentException.class, () -> {
            gson.getAdapter(TypeToken.get(Object.class));
        });
    }

    @Test
    void testGetAdapter_ThreadSafety() throws InterruptedException {
        Runnable task = () -> {
            TypeAdapter<String> adapter = gson.getAdapter(TypeToken.get(String.class));
            assertNotNull(adapter);
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}