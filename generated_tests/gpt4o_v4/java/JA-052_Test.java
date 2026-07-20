import org.apache.commons.cli.PatternOptionBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PatternOptionBuilderTest {

    @Test
    public void testGetValueTypeAtSymbol() {
        Class<?> result = PatternOptionBuilder.getValueType('@');
        assertEquals(Object.class, result);
    }

    @Test
    public void testGetValueTypeColon() {
        Class<?> result = PatternOptionBuilder.getValueType(':');
        assertEquals(String.class, result);
    }

    @Test
    public void testGetValueTypePercent() {
        Class<?> result = PatternOptionBuilder.getValueType('%');
        assertEquals(Number.class, result);
    }

    @Test
    public void testGetValueTypePlus() {
        Class<?> result = PatternOptionBuilder.getValueType('+');
        assertEquals(Class.class, result);
    }

    @Test
    public void testGetValueTypeHash() {
        Class<?> result = PatternOptionBuilder.getValueType('#');
        assertEquals(java.util.Date.class, result);
    }

    @Test
    public void testGetValueTypeLessThan() {
        Class<?> result = PatternOptionBuilder.getValueType('<');
        assertEquals(java.io.File.class, result);
    }

    @Test
    public void testGetValueTypeGreaterThan() {
        Class<?> result = PatternOptionBuilder.getValueType('>');
        assertEquals(java.io.File.class, result);
    }

    @Test
    public void testGetValueTypeAsterisk() {
        Class<?> result = PatternOptionBuilder.getValueType('*');
        assertEquals(java.io.File[].class, result);
    }

    @Test
    public void testGetValueTypeSlash() {
        Class<?> result = PatternOptionBuilder.getValueType('/');
        assertEquals(java.net.URL.class, result);
    }

    @Test
    public void testGetValueTypeInvalidCharacter() {
        Class<?> result = PatternOptionBuilder.getValueType('x');
        assertNull(result);
    }
}