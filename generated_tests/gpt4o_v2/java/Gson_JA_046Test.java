import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GsonGetAdapterTest {

    private final Gson gson = new Gson();

    @Test
    void testGetAdapterWithNonNullTypeToken() {
        TypeToken<String> typeToken = TypeToken.get(String.class);
        TypeAdapter<String> adapter = gson.getAdapter(typeToken);
        assertNotNull(adapter);
        assertEquals(String.class, adapter.getRawType());
    }

    @Test
    void testGetAdapterWithCachedTypeToken() {
        TypeToken<Integer> typeToken = TypeToken.get(Integer.class);
        TypeAdapter<Integer> adapter1 = gson.getAdapter(typeToken);
        TypeAdapter<Integer> adapter2 = gson.getAdapter(typeToken);
        assertSame(adapter1, adapter2);
    }

    @Test
    void testGetAdapterWithNullTypeToken() {
        assertThrows(NullPointerException.class, () -> gson.getAdapter(null));
    }

    @Test
    void testGetAdapterWithUnsupportedType() {
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        assertThrows(IllegalArgumentException.class, () -> gson.getAdapter(typeToken));
    }

    @Test
    void testGetAdapterWithCustomType() {
        TypeToken<MyCustomType> typeToken = TypeToken.get(MyCustomType.class);
        TypeAdapter<MyCustomType> adapter = gson.getAdapter(typeToken);
        assertNotNull(adapter);
        assertEquals(MyCustomType.class, adapter.getRawType());
    }

    static class MyCustomType {
        // Custom type for testing
    }
}