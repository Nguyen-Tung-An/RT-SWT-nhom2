import org.apache.commons.cli.PatternOptionBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class PatternOptionBuilderTest {

    @Test
    void testGetValueType_ObjectValue() {
        assertEquals(Object.class, PatternOptionBuilder.getValueType('@'));
    }

    @Test
    void testGetValueType_StringValue() {
        assertEquals(String.class, PatternOptionBuilder.getValueType(':'));
    }

    @Test
    void testGetValueType_NumberValue() {
        assertEquals(Number.class, PatternOptionBuilder.getValueType('%'));
    }

    @Test
    void testGetValueType_ClassValue() {
        assertEquals(Class.class, PatternOptionBuilder.getValueType('+'));
    }

    @Test
    void testGetValueType_DateValue() {
        assertEquals(java.util.Date.class, PatternOptionBuilder.getValueType('#'));
    }

    @Test
    void testGetValueType_ExistingFileValue() {
        assertEquals(java.io.File.class, PatternOptionBuilder.getValueType('<'));
    }

    @Test
    void testGetValueType_FileValue() {
        assertEquals(java.io.File.class, PatternOptionBuilder.getValueType('>'));
    }

    @Test
    void testGetValueType_FilesValue() {
        assertEquals(java.io.File[].class, PatternOptionBuilder.getValueType('*'));
    }

    @Test
    void testGetValueType_URLValue() {
        assertEquals(java.net.URL.class, PatternOptionBuilder.getValueType('/'));
    }

    @Test
    void testGetValueType_InvalidCharacter() {
        assertNull(PatternOptionBuilder.getValueType('!'));
    }

    @Test
    void testGetValueType_AnotherInvalidCharacter() {
        assertNull(PatternOptionBuilder.getValueType(' '));
    }
}