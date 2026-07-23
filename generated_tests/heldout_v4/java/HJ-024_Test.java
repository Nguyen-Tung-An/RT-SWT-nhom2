package org.apache.commons.csv;

import org.junit.jupiter.api.Test;

import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CSVParserTest {

    @Test
    void testAddRecordValue_EmptyInputAndLastRecordWithTrailingDelimiter() throws Exception {
        CSVParser instance = createCSVParserWithFormat(true);
        setReusableToken(instance, "", false);
        
        Method m = CSVParser.class.getDeclaredMethod("addRecordValue", boolean.class);
        m.setAccessible(true);
        
        m.invoke(instance, true);
        
        List<String> recordList = getRecordList(instance);
        assertEquals(0, recordList.size());
    }

    @Test
    void testAddRecordValue_EmptyInputAndLastRecordWithoutTrailingDelimiter() throws Exception {
        CSVParser instance = createCSVParserWithFormat(false);
        setReusableToken(instance, "", false);
        
        Method m = CSVParser.class.getDeclaredMethod("addRecordValue", boolean.class);
        m.setAccessible(true);
        
        m.invoke(instance, true);
        
        List<String> recordList = getRecordList(instance);
        assertEquals(1, recordList.size());
        assertEquals(null, recordList.get(0));
    }

    @Test
    void testAddRecordValue_NonEmptyInputAndLastRecord() throws Exception {
        CSVParser instance = createCSVParserWithFormat(true);
        setReusableToken(instance, "value", false);
        
        Method m = CSVParser.class.getDeclaredMethod("addRecordValue", boolean.class);
        m.setAccessible(true);
        
        m.invoke(instance, true);
        
        List<String> recordList = getRecordList(instance);
        assertEquals(1, recordList.size());
        assertEquals("value", recordList.get(0));
    }

    @Test
    void testAddRecordValue_NonEmptyInputAndNotLastRecord() throws Exception {
        CSVParser instance = createCSVParserWithFormat(false);
        setReusableToken(instance, "value", false);
        
        Method m = CSVParser.class.getDeclaredMethod("addRecordValue", boolean.class);
        m.setAccessible(true);
        
        m.invoke(instance, false);
        
        List<String> recordList = getRecordList(instance);
        assertEquals(1, recordList.size());
        assertEquals("value", recordList.get(0));
    }

    private CSVParser createCSVParserWithFormat(boolean trailingDelimiter) throws Exception {
        CSVFormat format = CSVFormat.DEFAULT.withTrailingDelimiter(trailingDelimiter);
        Reader reader = new StringReader("");
        return new CSVParser(reader, format);
    }

    private void setReusableToken(CSVParser instance, String content, boolean isQuoted) throws Exception {
        Field f = CSVParser.class.getDeclaredField("reusableToken");
        f.setAccessible(true);
        Object token = new Object(); // Replace with actual token class if available
        f.set(instance, token);
        
        Field contentField = token.getClass().getDeclaredField("content");
        contentField.setAccessible(true);
        contentField.set(token, new StringBuilder(content));
        
        Field quotedField = token.getClass().getDeclaredField("isQuoted");
        quotedField.setAccessible(true);
        quotedField.set(token, isQuoted);
    }

    private List<String> getRecordList(CSVParser instance) throws Exception {
        Field f = CSVParser.class.getDeclaredField("recordList");
        f.setAccessible(true);
        return (List<String>) f.get(instance);
    }
}