package com.google.gson.typeadapters;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class PostConstructAdapterFactoryTest {

    private final PostConstructAdapterFactory factory = new PostConstructAdapterFactory();
    private final Gson gson = new Gson();

    @Test
    void testCreate_WithPostConstructMethod() throws Exception {
        class TestClass {
            @PostConstruct
            public void init() {
                // Initialization logic
            }
        }

        TypeToken<TestClass> typeToken = new TypeToken<TestClass>() {};
        TypeAdapter<TestClass> adapter = factory.create(gson, typeToken);
        assertNotNull(adapter);
    }

    @Test
    void testCreate_WithoutPostConstructMethod() {
        class TestClassWithoutPostConstruct {
            // No PostConstruct method
        }

        TypeToken<TestClassWithoutPostConstruct> typeToken = new TypeToken<TestClassWithoutPostConstruct>() {};
        TypeAdapter<TestClassWithoutPostConstruct> adapter = factory.create(gson, typeToken);
        assertNull(adapter);
    }

    @Test
    void testCreate_WithSuperclassPostConstructMethod() throws Exception {
        class SuperClass {
            @PostConstruct
            public void init() {
                // Initialization logic
            }
        }

        class SubClass extends SuperClass {
            // Inherits PostConstruct method
        }

        TypeToken<SubClass> typeToken = new TypeToken<SubClass>() {};
        TypeAdapter<SubClass> adapter = factory.create(gson, typeToken);
        assertNotNull(adapter);
    }

    @Test
    void testCreate_WithMultipleSuperclasses() throws Exception {
        class BaseClass {
            // No PostConstruct method
        }

        class IntermediateClass extends BaseClass {
            @PostConstruct
            public void init() {
                // Initialization logic
            }
        }

        class SubClass extends IntermediateClass {
            // Inherits PostConstruct method
        }

        TypeToken<SubClass> typeToken = new TypeToken<SubClass>() {};
        TypeAdapter<SubClass> adapter = factory.create(gson, typeToken);
        assertNotNull(adapter);
    }
}