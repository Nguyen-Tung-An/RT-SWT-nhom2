package com.google.gson.internal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimitivesTest {

    @Test
    void testWrapInt() {
        Class<?> result = Primitives.wrap(int.class);
        assertEquals(Integer.class, result);
    }

    @Test
    void testWrapFloat() {
        Class<?> result = Primitives.wrap(float.class);
        assertEquals(Float.class, result);
    }

    @Test
    void testWrapByte() {
        Class<?> result = Primitives.wrap(byte.class);
        assertEquals(Byte.class, result);
    }

    @Test
    void testWrapDouble() {
        Class<?> result = Primitives.wrap(double.class);
        assertEquals(Double.class, result);
    }

    @Test
    void testWrapLong() {
        Class<?> result = Primitives.wrap(long.class);
        assertEquals(Long.class, result);
    }

    @Test
    void testWrapChar() {
        Class<?> result = Primitives.wrap(char.class);
        assertEquals(Character.class, result);
    }

    @Test
    void testWrapBoolean() {
        Class<?> result = Primitives.wrap(boolean.class);
        assertEquals(Boolean.class, result);
    }

    @Test
    void testWrapShort() {
        Class<?> result = Primitives.wrap(short.class);
        assertEquals(Short.class, result);
    }

    @Test
    void testWrapVoid() {
        Class<?> result = Primitives.wrap(void.class);
        assertEquals(Void.class, result);
    }

    @Test
    void testWrapObject() {
        Class<?> result = Primitives.wrap(String.class);
        assertEquals(String.class, result);
    }
}