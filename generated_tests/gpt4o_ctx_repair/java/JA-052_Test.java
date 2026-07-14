package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class PatternOptionBuilderTest {

    private static final Class<?> OBJECT_VALUE = Object.class;
    private static final Class<?> STRING_VALUE = String.class;
    private static final Class<?> NUMBER_VALUE = Number.class;
    private static final Class<?> CLASS_VALUE = Class.class;
    private static final Class<?> DATE_VALUE = java.util.Date.class;
    private static final Class<?> EXISTING_FILE_VALUE = java.io.File.class;
    private static final Class<?> FILE_VALUE = java.io.File.class;
    private static final Class<?> FILES_VALUE = java.io.File[].class;
    private static final Class<?> URL_VALUE = java.net.URL.class;

    @Test
    void testGetValueType_ObjectValue() {
        assertEquals(OBJECT_VALUE, PatternOptionBuilder.getValueType('@'));
    }

    @Test
    void testGetValueType_StringValue() {
        assertEquals(STRING_VALUE, PatternOptionBuilder.getValueType(':'));
    }

    @Test
    void testGetValueType_NumberValue() {
        assertEquals(NUMBER_VALUE, PatternOptionBuilder.getValueType('%'));
    }

    @Test
    void testGetValueType_ClassValue() {
        assertEquals(CLASS_VALUE, PatternOptionBuilder.getValueType('+'));
    }

    @Test
    void testGetValueType_DateValue() {
        assertEquals(DATE_VALUE, PatternOptionBuilder.getValueType('#'));
    }

    @Test
    void testGetValueType_ExistingFileValue() {
        assertEquals(EXISTING_FILE_VALUE, PatternOptionBuilder.getValueType('<'));
    }

    @Test
    void testGetValueType_FileValue() {
        assertEquals(FILE_VALUE, PatternOptionBuilder.getValueType('>'));
    }

    @Test
    void testGetValueType_FilesValue() {
        assertEquals(FILES_VALUE, PatternOptionBuilder.getValueType('*'));
    }

    @Test
    void testGetValueType_URLValue() {
        assertEquals(URL_VALUE, PatternOptionBuilder.getValueType('/'));
    }

    @Test
    void testGetValueType_UnknownCharacter() {
        assertNull(PatternOptionBuilder.getValueType('x'));
    }
}