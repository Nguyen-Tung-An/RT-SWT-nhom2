package com.google.gson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GsonTest {

    @Test
    void testGetAdapter_NullTypeToken() {
        Gson gson = new Gson();
        assertThrows(NullPointerException.class, () -> gson.getAdapter(null));
    }

    @Test
    void testGetAdapter_CachedAdapter() {
        Gson gson = new Gson();
        TypeToken<String> typeToken = TypeToken.get(String.class);
        TypeAdapter<String> adapter = mock(TypeAdapter.class);
        gson.typeTokenCache.put(typeToken, adapter);
        
        assertSame(adapter, gson.getAdapter(typeToken));
    }

    @Test
    void testGetAdapter_InitialRequest() {
        Gson gson = new Gson();
        TypeToken<String> typeToken = TypeToken.get(String.class);
        TypeAdapterFactory factory = mock(TypeAdapterFactory.class);
        TypeAdapter<String> adapter = mock(TypeAdapter.class);
        
        when(factory.create(gson, typeToken)).thenReturn(adapter);
        gson.factories.add(factory);
        
        assertSame(adapter, gson.getAdapter(typeToken));
    }

    @Test
    void testGetAdapter_NoFactoryFound() {
        Gson gson = new Gson();
        TypeToken<String> typeToken = TypeToken.get(String.class);
        
        assertThrows(IllegalArgumentException.class, () -> gson.getAdapter(typeToken));
    }

    @Test
    void testGetAdapter_CyclicDependency() {
        Gson gson = new Gson();
        TypeToken<CyclicA> typeTokenA = TypeToken.get(CyclicA.class);
        TypeToken<CyclicB> typeTokenB = TypeToken.get(CyclicB.class);
        
        TypeAdapterFactory factoryA = mock(TypeAdapterFactory.class);
        TypeAdapterFactory factoryB = mock(TypeAdapterFactory.class);
        
        when(factoryA.create(gson, typeTokenA)).thenReturn(null);
        when(factoryB.create(gson, typeTokenB)).thenReturn(null);
        
        gson.factories.add(factoryA);
        gson.factories.add(factoryB);
        
        assertThrows(IllegalArgumentException.class, () -> gson.getAdapter(typeTokenA));
        assertThrows(IllegalArgumentException.class, () -> gson.getAdapter(typeTokenB));
    }

    private static class CyclicA {
        CyclicB b;
    }

    private static class CyclicB {
        CyclicA a;
    }
}