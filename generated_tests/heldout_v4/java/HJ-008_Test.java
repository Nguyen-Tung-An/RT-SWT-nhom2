package org.apache.commons.csv;

import org.junit.jupiter.api.Test;

import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CSVParserTest {

    @Test
    void testHandleNullWithNullString() throws Exception {
        CSVParser instance = new CSVParser(new StringReader(""), CSVFormat.DEFAULT);
        Field f = CSVParser.class.getDeclaredField("reusableToken");
        f.setAccessible(true);
        f.set(instance, new Token(true)); // Set isQuoted to true

        Field formatField = CSVParser.class.getDeclaredField("format");
        formatField.setAccessible(true);
        formatField.set(instance, new CSVFormat() {
            @Override
            public String getNullString() {
                return "NULL";
            }
        });

        Method m = CSVParser.class.getDeclaredMethod("handleNull", String.class);
        m.setAccessible(true);
        String result = (String) m.invoke(instance, "NULL");
        assertEquals(null, result);
    }

    @Test
    void testHandleNullWithEmptyInput() throws Exception {
        CSVParser instance = new CSVParser(new StringReader(""), CSVFormat.DEFAULT);
        Field f = CSVParser.class.getDeclaredField("reusableToken");
        f.setAccessible(true);
        f.set(instance, new Token(false)); // Set isQuoted to false

        Field formatField = CSVParser.class.getDeclaredField("format");
        formatField.setAccessible(true);
        formatField.set(instance, new CSVFormat() {
            @Override
            public String getNullString() {
                return null;
            }
        });

        Method m = CSVParser.class.getDeclaredMethod("handleNull", String.class);
        m.setAccessible(true);
        String result = (String) m.invoke(instance, "");
        assertEquals(null, result);
    }

    @Test
    void testHandleNullWithNonNullInput() throws Exception {
        CSVParser instance = new CSVParser(new StringReader(""), CSVFormat.DEFAULT);
        Field f = CSVParser.class.getDeclaredField("reusableToken");
        f.setAccessible(true);
        f.set(instance, new Token(false)); // Set isQuoted to false

        Field formatField = CSVParser.class.getDeclaredField("format");
        formatField.setAccessible(true);
        formatField.set(instance, new CSVFormat() {
            @Override
            public String getNullString() {
                return "NULL";
            }
        });

        Method m = CSVParser.class.getDeclaredMethod("handleNull", String.class);
        m.setAccessible(true);
        String result = (String) m.invoke(instance, "SomeValue");
        assertEquals("SomeValue", result);
    }

    @Test
    void testHandleNullWithStrictQuoteMode() throws Exception {
        CSVParser instance = new CSVParser(new StringReader(""), CSVFormat.DEFAULT);
        Field f = CSVParser.class.getDeclaredField("reusableToken");
        f.setAccessible(true);
        f.set(instance, new Token(true)); // Set isQuoted to true

        Field formatField = CSVParser.class.getDeclaredField("format");
        formatField.setAccessible(true);
        formatField.set(instance, new CSVFormat() {
            @Override
            public String getNullString() {
                return "NULL";
            }
        });

        Method m = CSVParser.class.getDeclaredMethod("handleNull", String.class);
        m.setAccessible(true);
        String result = (String) m.invoke(instance, "SomeValue");
        assertEquals("SomeValue", result);
    }

    @Test
    void testHandleNullWithNullStringAndStrictMode() throws Exception {
        CSVParser instance = new CSVParser(new StringReader(""), CSVFormat.DEFAULT);
        Field f = CSVParser.class.getDeclaredField("reusableToken");
        f.setAccessible(true);
        f.set(instance, new Token(true)); // Set isQuoted to true

        Field formatField = CSVParser.class.getDeclaredField("format");
        formatField.setAccessible(true);
        formatField.set(instance, new CSVFormat() {
            @Override
            public String getNullString() {
                return "NULL";
            }
        });

        Method m = CSVParser.class.getDeclaredMethod("handleNull", String.class);
        m.setAccessible(true);
        String result = (String) m.invoke(instance, "NULL");
        assertEquals(null, result);
    }
}