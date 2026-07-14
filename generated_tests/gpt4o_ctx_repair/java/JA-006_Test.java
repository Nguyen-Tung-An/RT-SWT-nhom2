package com.google.gson.typeadapters;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class PostConstructAdapterFactoryTest {

    private static class TestClass {
        @PostConstruct
        public void init() {
            // Initialization logic
        }
    }

    private static class NonAnnotatedClass {
        public void init() {
            // Initialization logic
        }
    }

    @Test
    void testCreate_WithAnnotatedMethod() {
        PostConstructAdapterFactory factory = new PostConstructAdapterFactory();
        Gson gson = new Gson();
        TypeToken<TestClass> typeToken = TypeToken.get(TestClass.class);
        
        TypeAdapter<TestClass> adapter = factory.create(gson, typeToken);
        assertNotNull(adapter);
    }

    @Test
    void testCreate_WithoutAnnotatedMethod() {
        PostConstructAdapterFactory factory = new PostConstructAdapterFactory();
        Gson gson = new Gson();
        TypeToken<NonAnnotatedClass> typeToken = TypeToken.get(NonAnnotatedClass.class);
        
        TypeAdapter<NonAnnotatedClass> adapter = factory.create(gson, typeToken);
        assertNull(adapter);
    }

    @Test
    void testCreate_WithSuperclassAnnotatedMethod() {
        class SuperClass {
            @PostConstruct
            public void init() {
                // Initialization logic
            }
        }
        
        class SubClass extends SuperClass {
            // No additional methods
        }

        PostConstructAdapterFactory factory = new PostConstructAdapterFactory();
        Gson gson = new Gson();
        TypeToken<SubClass> typeToken = TypeToken.get(SubClass.class);
        
        TypeAdapter<SubClass> adapter = factory.create(gson, typeToken);
        assertNotNull(adapter);
    }

    @Test
    void testCreate_WithObjectClass() {
        PostConstructAdapterFactory factory = new PostConstructAdapterFactory();
        Gson gson = new Gson();
        TypeToken<Object> typeToken = TypeToken.get(Object.class);
        
        TypeAdapter<Object> adapter = factory.create(gson, typeToken);
        assertNull(adapter);
    }
}