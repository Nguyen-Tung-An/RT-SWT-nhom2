package com.google.gson.typeadapters;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class PostConstructAdapterFactoryTest {

    private final PostConstructAdapterFactory instance = new PostConstructAdapterFactory();
    private final Gson gson = new Gson();

    @Test
    void testCreate_WithPostConstructMethod_ReturnsAdapter() throws Exception {
        TypeToken<TestClassWithPostConstruct> typeToken = TypeToken.get(TestClassWithPostConstruct.class);
        assertNotNull(instance.create(gson, typeToken));
    }

    @Test
    void testCreate_WithoutPostConstructMethod_ReturnsNull() throws Exception {
        TypeToken<TestClassWithoutPostConstruct> typeToken = TypeToken.get(TestClassWithoutPostConstruct.class);
        assertNull(instance.create(gson, typeToken));
    }

    @Test
    void testCreate_WithSuperclassPostConstructMethod_ReturnsAdapter() throws Exception {
        TypeToken<TestSubclassWithPostConstruct> typeToken = TypeToken.get(TestSubclassWithPostConstruct.class);
        assertNotNull(instance.create(gson, typeToken));
    }

    @Test
    void testCreate_WithObjectType_ReturnsNull() throws Exception {
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        assertNull(instance.create(gson, typeToken));
    }

    static class TestClassWithPostConstruct {
        @PostConstruct
        public void init() {
        }
    }

    static class TestClassWithoutPostConstruct {
        public void someMethod() {
        }
    }

    static class TestSuperclass {
        @PostConstruct
        public void init() {
        }
    }

    static class TestSubclassWithPostConstruct extends TestSuperclass {
    }
}