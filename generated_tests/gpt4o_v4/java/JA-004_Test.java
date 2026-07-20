package org.apache.commons.csv;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CSVFormatTest {

    @Test
    void testIsDelimiter_MatchingDelimiter() throws Exception {
        CSVFormat instance = new CSVFormat(new CSVFormat.Builder());
        Field delimiterField = CSVFormat.class.getDeclaredField("delimiter");
        delimiterField.setAccessible(true);
        delimiterField.set(instance, new char[]{','});

        Method m = CSVFormat.class.getDeclaredMethod("isDelimiter", char.class, CharSequence.class, int.class, char[].class, int.class);
        m.setAccessible(true);
        Object result = m.invoke(instance, ',', "abc,def", 0, new char[]{','}, 1);
        assertTrue((Boolean) result);
    }

    @Test
    void testIsDelimiter_NonMatchingDelimiter() throws Exception {
        CSVFormat instance = new CSVFormat(new CSVFormat.Builder());
        Field delimiterField = CSVFormat.class.getDeclaredField("delimiter");
        delimiterField.setAccessible(true);
        delimiterField.set(instance, new char[]{','});

        Method m = CSVFormat.class.getDeclaredMethod("isDelimiter", char.class, CharSequence.class, int.class, char[].class, int.class);
        m.setAccessible(true);
        Object result = m.invoke(instance, ';', "abc,def", 0, new char[]{','}, 1);
        assertFalse((Boolean) result);
    }

    @Test
    void testIsDelimiter_StartIndexOutOfBounds() throws Exception {
        CSVFormat instance = new CSVFormat(new CSVFormat.Builder());
        Field delimiterField = CSVFormat.class.getDeclaredField("delimiter");
        delimiterField.setAccessible(true);
        delimiterField.set(instance, new char[]{','});

        Method m = CSVFormat.class.getDeclaredMethod("isDelimiter", char.class, CharSequence.class, int.class, char[].class, int.class);
        m.setAccessible(true);
        Object result = m.invoke(instance, ',', "abc,def", 10, new char[]{','}, 1);
        assertFalse((Boolean) result);
    }

    @Test
    void testIsDelimiter_DelimiterMismatchInSequence() throws Exception {
        CSVFormat instance = new CSVFormat(new CSVFormat.Builder());
        Field delimiterField = CSVFormat.class.getDeclaredField("delimiter");
        delimiterField.setAccessible(true);
        delimiterField.set(instance, new char[]{','});

        Method m = CSVFormat.class.getDeclaredMethod("isDelimiter", char.class, CharSequence.class, int.class, char[].class, int.class);
        m.setAccessible(true);
        Object result = m.invoke(instance, ',', "abc;def", 0, new char[]{','}, 1);
        assertFalse((Boolean) result);
    }

    @Test
    void testIsDelimiter_EmptyCharSequence() throws Exception {
        CSVFormat instance = new CSVFormat(new CSVFormat.Builder());
        Field delimiterField = CSVFormat.class.getDeclaredField("delimiter");
        delimiterField.setAccessible(true);
        delimiterField.set(instance, new char[]{','});

        Method m = CSVFormat.class.getDeclaredMethod("isDelimiter", char.class, CharSequence.class, int.class, char[].class, int.class);
        m.setAccessible(true);
        Object result = m.invoke(instance, ',', "", 0, new char[]{','}, 1);
        assertFalse((Boolean) result);
    }
}