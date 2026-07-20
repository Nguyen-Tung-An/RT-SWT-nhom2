package com.google.gson.typeadapters;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UtcDateTypeAdapterTest {

    @Test
    void testParseInt_ValidInput() throws Exception {
        Method m = UtcDateTypeAdapter.class.getDeclaredMethod("parseInt", String.class, int.class, int.class);
        m.setAccessible(true);
        Object result = m.invoke(null, "12345", 0, 5);
        assertEquals(12345, result);
    }

    @Test
    void testParseInt_LeadingZeros() throws Exception {
        Method m = UtcDateTypeAdapter.class.getDeclaredMethod("parseInt", String.class, int.class, int.class);
        m.setAccessible(true);
        Object result = m.invoke(null, "000123", 0, 6);
        assertEquals(123, result);
    }

    @Test
    void testParseInt_EmptyString() throws Exception {
        Method m = UtcDateTypeAdapter.class.getDeclaredMethod("parseInt", String.class, int.class, int.class);
        m.setAccessible(true);
        assertThrows(NumberFormatException.class, () -> {
            try {
                m.invoke(null, "", 0, 0);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }

    @Test
    void testParseInt_InvalidCharacter() throws Exception {
        Method m = UtcDateTypeAdapter.class.getDeclaredMethod("parseInt", String.class, int.class, int.class);
        m.setAccessible(true);
        assertThrows(NumberFormatException.class, () -> {
            try {
                m.invoke(null, "123a", 0, 4);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }

    @Test
    void testParseInt_BeginIndexGreaterThanEndIndex() throws Exception {
        Method m = UtcDateTypeAdapter.class.getDeclaredMethod("parseInt", String.class, int.class, int.class);
        m.setAccessible(true);
        assertThrows(NumberFormatException.class, () -> {
            try {
                m.invoke(null, "12345", 3, 2);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }

    @Test
    void testParseInt_BeginIndexNegative() throws Exception {
        Method m = UtcDateTypeAdapter.class.getDeclaredMethod("parseInt", String.class, int.class, int.class);
        m.setAccessible(true);
        assertThrows(NumberFormatException.class, () -> {
            try {
                m.invoke(null, "12345", -1, 5);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }

    @Test
    void testParseInt_EndIndexOutOfBounds() throws Exception {
        Method m = UtcDateTypeAdapter.class.getDeclaredMethod("parseInt", String.class, int.class, int.class);
        m.setAccessible(true);
        assertThrows(NumberFormatException.class, () -> {
            try {
                m.invoke(null, "12345", 0, 10);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }
}