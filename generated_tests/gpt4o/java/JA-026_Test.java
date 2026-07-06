package com.google.gson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GsonTest {

    @Test
    void testGetDelegateAdapter_SkipPastIsNull() {
        Gson gson = new Gson();
        TypeToken<String> type = TypeToken.get(String.class);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            gson.getDelegateAdapter(null, type);
        });
        assertEquals("skipPast must not be null", exception.getMessage());
    }

    @Test
    void testGetDelegateAdapter_TypeIsNull() {
        Gson gson = new Gson();
        TypeAdapterFactory skipPast = mock(TypeAdapterFactory.class);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            gson.getDelegateAdapter(skipPast, null);
        });
        assertEquals("type must not be null", exception.getMessage());
    }

    @Test
    void testGetDelegateAdapter_SkipPastFound() {
        Gson gson = new Gson();
        TypeAdapterFactory skipPast = mock(TypeAdapterFactory.class);
        TypeToken<String> type = TypeToken.get(String.class);
        when(gson.jsonAdapterFactory.isClassJsonAdapterFactory(type, skipPast)).thenReturn(true);
        
        TypeAdapterFactory factory = mock(TypeAdapterFactory.class);
        TypeAdapter<String> adapter = mock(TypeAdapter.class);
        when(factory.create(gson, type)).thenReturn(adapter);
        gson.factories.add(factory);
        
        TypeAdapter<String> result = gson.getDelegateAdapter(skipPast, type);
        assertNotNull(result);
        assertEquals(adapter, result);
    }

    @Test
    void testGetDelegateAdapter_NoCandidateFound() {
        Gson gson = new Gson();
        TypeAdapterFactory skipPast = mock(TypeAdapterFactory.class);
        TypeToken<String> type = TypeToken.get(String.class);
        when(gson.jsonAdapterFactory.isClassJsonAdapterFactory(type, skipPast)).thenReturn(false);
        
        TypeAdapterFactory factory = mock(TypeAdapterFactory.class);
        when(factory.create(gson, type)).thenReturn(null);
        gson.factories.add(factory);
        
        TypeAdapter<String> result = gson.getDelegateAdapter(skipPast, type);
        assertNotNull(result);
    }

    @Test
    void testGetDelegateAdapter_SkipPastFound_ThrowsException() {
        Gson gson = new Gson();
        TypeAdapterFactory skipPast = mock(TypeAdapterFactory.class);
        TypeToken<String> type = TypeToken.get(String.class);
        when(gson.jsonAdapterFactory.isClassJsonAdapterFactory(type, skipPast)).thenReturn(false);
        
        TypeAdapterFactory factory = mock(TypeAdapterFactory.class);
        when(factory.create(gson, type)).thenReturn(null);
        gson.factories.add(factory);
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            gson.getDelegateAdapter(skipPast, type);
        });
        assertEquals("GSON cannot serialize or deserialize " + type, exception.getMessage());
    }
}