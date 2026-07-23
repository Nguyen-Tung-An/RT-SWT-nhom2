package com.google.gson.internal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimitivesTest {
    @Test
    void testWrap_Int() {
        assertEquals(Integer.class, Primitives.wrap(int.class));
    }

    @Test
    void testWrap_Float() {
        assertEquals(Float.class, Primitives.wrap(float.class));
    }

    @Test
    void testWrap_Byte() {
        assertEquals(Byte.class, Primitives.wrap(byte.class));
    }

    @Test
    void testWrap_Double() {
        assertEquals(Double.class, Primitives.wrap(double.class));
    }

    @Test
    void testWrap_Long() {
        assertEquals(Long.class, Primitives.wrap(long.class));
    }

    @Test
    void testWrap_Character() {
        assertEquals(Character.class, Primitives.wrap(char.class));
    }

    @Test
    void testWrap_Boolean() {
        assertEquals(Boolean.class, Primitives.wrap(boolean.class));
    }

    @Test
    void testWrap_Short() {
        assertEquals(Short.class, Primitives.wrap(short.class));
    }

    @Test
    void testWrap_Void() {
        assertEquals(Void.class, Primitives.wrap(void.class));
    }

    @Test
    void testWrap_NonPrimitive() {
        assertEquals(String.class, Primitives.wrap(String.class));
    }
}