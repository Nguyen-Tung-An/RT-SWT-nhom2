import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.typeadapters.PostConstructAdapterFactory;
import org.junit.jupiter.api.Test;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PostConstructAdapterFactoryTest {

    private final PostConstructAdapterFactory factory = new PostConstructAdapterFactory();
    private final Gson gson = new Gson();

    @Test
    public void testCreate_WithPostConstructMethod_ReturnsAdapter() throws Exception {
        TypeToken<TestClass> typeToken = TypeToken.get(TestClass.class);
        TypeAdapter<TestClass> adapter = factory.create(gson, typeToken);
        assertNotNull(adapter);
    }

    @Test
    public void testCreate_WithoutPostConstructMethod_ReturnsNull() throws Exception {
        TypeToken<NoPostConstructClass> typeToken = TypeToken.get(NoPostConstructClass.class);
        TypeAdapter<NoPostConstructClass> adapter = factory.create(gson, typeToken);
        assertNull(adapter);
    }

    @Test
    public void testCreate_WithSubclassPostConstructMethod_ReturnsAdapter() throws Exception {
        TypeToken<SubClass> typeToken = TypeToken.get(SubClass.class);
        TypeAdapter<SubClass> adapter = factory.create(gson, typeToken);
        assertNotNull(adapter);
    }

    @Test
    public void testCreate_WithObjectClass_ReturnsNull() throws Exception {
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        TypeAdapter<Object> adapter = factory.create(gson, typeToken);
        assertNull(adapter);
    }

    static class TestClass {
        @PostConstruct
        public void init() {
            // Initialization logic
        }
    }

    static class NoPostConstructClass {
        public void someMethod() {
            // No PostConstruct annotation
        }
    }

    static class SuperClass {
        @PostConstruct
        public void init() {
            // Initialization logic in superclass
        }
    }

    static class SubClass extends SuperClass {
        // Inherits PostConstruct method
    }
}