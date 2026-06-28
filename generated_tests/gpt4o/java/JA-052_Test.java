package org.apache.commons.cli;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class PatternOptionBuilderTest {

    @Test
    void testEquals_SameAnnotations() {
        Annotation a1 = new TestAnnotation("value");
        Annotation a2 = a1;
        assertTrue(PatternOptionBuilder.equals(a1, a2));
    }

    @Test
    void testEquals_NullFirstAnnotation() {
        Annotation a1 = null;
        Annotation a2 = new TestAnnotation("value");
        assertFalse(PatternOptionBuilder.equals(a1, a2));
    }

    @Test
    void testEquals_NullSecondAnnotation() {
        Annotation a1 = new TestAnnotation("value");
        Annotation a2 = null;
        assertFalse(PatternOptionBuilder.equals(a1, a2));
    }

    @Test
    void testEquals_DifferentAnnotationTypes() {
        Annotation a1 = new TestAnnotation("value");
        Annotation a2 = new AnotherTestAnnotation("value");
        assertFalse(PatternOptionBuilder.equals(a1, a2));
    }

    @Test
    void testEquals_DifferentValues() {
        Annotation a1 = new TestAnnotation("value1");
        Annotation a2 = new TestAnnotation("value2");
        assertFalse(PatternOptionBuilder.equals(a1, a2));
    }

    @Test
    void testEquals_ValidAnnotations() {
        Annotation a1 = new TestAnnotation("value");
        Annotation a2 = new TestAnnotation("value");
        assertTrue(PatternOptionBuilder.equals(a1, a2));
    }

    @Test
    void testEquals_ReflectiveOperationException() {
        Annotation a1 = new TestAnnotationWithException();
        Annotation a2 = new TestAnnotation("value");
        assertFalse(PatternOptionBuilder.equals(a1, a2));
    }

    private @interface TestAnnotation {
        String value();
    }

    private @interface AnotherTestAnnotation {
        String value();
    }

    private @interface TestAnnotationWithException {
        String value() throws ReflectiveOperationException;
    }
}