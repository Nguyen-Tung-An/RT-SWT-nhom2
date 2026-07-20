import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GsonTest {

    @Test
    void testGetDelegateAdapterWithValidTypeAdapterFactoryAndTypeToken() {
        Gson gson = new Gson();
        TypeAdapterFactory factory = new CustomTypeAdapterFactory(); // Assume this is a valid factory
        TypeToken<String> typeToken = TypeToken.get(String.class);
        
        TypeAdapter<String> adapter = gson.getDelegateAdapter(factory, typeToken);
        
        assertNotNull(adapter);
        assertEquals(String.class, adapter.getType());
    }

    @Test
    void testGetDelegateAdapterWithNullTypeAdapterFactory() {
        Gson gson = new Gson();
        TypeToken<String> typeToken = TypeToken.get(String.class);
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            gson.getDelegateAdapter(null, typeToken);
        });
        
        assertEquals("skipPast must not be null", exception.getMessage());
    }

    @Test
    void testGetDelegateAdapterWithNullTypeToken() {
        Gson gson = new Gson();
        TypeAdapterFactory factory = new CustomTypeAdapterFactory(); // Assume this is a valid factory
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            gson.getDelegateAdapter(factory, null);
        });
        
        assertEquals("type must not be null", exception.getMessage());
    }

    @Test
    void testGetDelegateAdapterWithNonSerializableType() {
        Gson gson = new Gson();
        TypeAdapterFactory factory = new CustomTypeAdapterFactory(); // Assume this is a valid factory
        TypeToken<NonSerializableClass> typeToken = TypeToken.get(NonSerializableClass.class);
        
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            gson.getDelegateAdapter(factory, typeToken);
        });
        
        assertEquals("GSON cannot serialize or deserialize " + typeToken.getType(), exception.getMessage());
    }

    @Test
    void testGetDelegateAdapterWithJsonAdapterOnField() {
        Gson gson = new Gson();
        TypeToken<CustomClass> typeToken = TypeToken.get(CustomClass.class);
        
        TypeAdapter<CustomClass> adapter = gson.getDelegateAdapter(new CustomTypeAdapterFactory(), typeToken);
        
        assertNotNull(adapter);
        assertEquals(CustomClass.class, adapter.getType());
    }
}