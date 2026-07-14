package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class PatternOptionBuilderTest {

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